package io.runebox.updater

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.util.InheritanceGraph
import io.runebox.updater.matcher.Matcher
import io.runebox.updater.matcher.NameType
import io.runebox.updater.matcher.bcremap.AsmRemapper
import io.runebox.updater.matcher.config.Config
import io.runebox.updater.matcher.config.ProjectConfig
import io.runebox.updater.matcher.type.ClassEnvironment
import io.runebox.updater.matcher.type.ClassInstance
import lukfor.progress.TaskService
import lukfor.progress.tasks.ITaskRunnable
import lukfor.progress.tasks.monitors.ITaskMonitor
import org.tinylog.kotlin.Logger
import java.io.File
import java.nio.file.Paths
import java.util.Vector
import java.util.jar.JarEntry
import java.util.jar.JarOutputStream
import java.util.logging.LogManager
import java.util.prefs.Preferences

class Updater(
    val oldJar: File,
    val newJar: File,
    val outputJar: File
) {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size < 3) error("Usage: <old-named-jar> <new-deob-jar> <output-named-jar>")
            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outputJar = File(args[2])
            Updater(oldJar, newJar, outputJar).run()
        }
    }

    lateinit var env: ClassEnvironment private set
    lateinit var matcher: Matcher private set

    private fun init() {
        Logger.info("Initializing updater.")

        val config = ProjectConfig(
            mutableListOf(oldJar.toPath()),
            mutableListOf(newJar.toPath()),
            mutableListOf(),
            mutableListOf(),
            mutableListOf(),
            true,
            "^(class|method|field).*",
            "^(class|method|field).*",
            "^(class|method|field).*",
            "^(class|method|field).*"
        )
        Config.init()
        Matcher.init()
        Config.setProjectConfig(config)

        env = ClassEnvironment()
        matcher = Matcher(env)
        matcher.init(config) {
            Logger.info("Loading classes from input jar files. [${it * 100}% Complete]")
        }

        Logger.info("Successfully finished loading classes into updater environment.")
    }

    fun run() {
        this.init()

        Logger.info("Started computing similarity mappings between all entries in input jars.")
        matcher.autoMatchAll { /* Do Nothing. Otherwise, we would spam the console. */
            println(it)
        }
        Logger.info("Successfully completed dynamically mapping of jar entries.")

        //this.save()

        println("\n")
        matcher.logMatchingStatus()
    }

    private fun save() {
        Logger.info("Saving updated / renamed new-jar to output file: ${outputJar.path}.")

        if(outputJar.exists()) outputJar.delete()
        outputJar.createNewFile()

        val group = ClassGroup()
        group.readJar(newJar)
        group.init()

        val inheritanceGraph = InheritanceGraph(group)
        val mappings = hashMapOf<String, String>()

        Logger.info("Remapping new-jar with mappings to old-jar.")
        env.envA.classes.forEach { clsA ->
            if(clsA.hasMatch()) {
                mappings[clsA.match.name] = clsA.name

                clsA.match.methods.forEach { methodA ->
                    if(methodA.hasMatch() && !mappings.containsKey("${methodA.match.owner.name}.${methodA.match.name}${methodA.match.desc}")) {
                        val methodName = methodA.match.name
                        mappings["${methodA.match.owner.name}.${methodA.match.name}${methodA.match.desc}"] = methodName
                        inheritanceGraph[methodA.match.owner.name]!!.children.forEach {
                            mappings["${it.name}.${methodA.match.name}${methodA.match.desc}"] = methodName
                        }
                    }
                }

                clsA.match.fields.forEach { fieldA ->
                    if(fieldA.hasMatch() && !mappings.containsKey("${fieldA.match.owner.name}.${fieldA.match.name}")) {
                        val fieldName = fieldA.match.name
                        mappings["${fieldA.match.owner.name}.${fieldA.match.name}"] = fieldName
                        inheritanceGraph[fieldA.match.owner.name]!!.children.forEach {
                            mappings["${it.name}.${fieldA.match.name}"] = fieldName
                        }
                    }
                }
            }
        }

        Logger.info("Applying mappings to output class group.")
        group.remap(mappings)

        Logger.info("Writing classes to output jar.")
        group.writeJar(outputJar)

        Logger.info("Successfully saved the output updated jar file.")
    }
}