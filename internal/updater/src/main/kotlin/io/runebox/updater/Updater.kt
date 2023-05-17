package io.runebox.updater

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.fromBytes
import io.runebox.asm.util.InheritanceGraph
import io.runebox.updater.matcher.Matcher
import io.runebox.updater.matcher.NameType
import io.runebox.updater.matcher.config.Config
import io.runebox.updater.matcher.config.ProjectConfig
import io.runebox.updater.matcher.type.ClassEnvironment
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger
import java.io.File


class Updater(
    private val oldJar: File,
    private val newJar: File,
    private val outputJar: File,
    private val runTestClient: Boolean = false
) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size < 3) error("Usage: <old-named-jar> <new-deob-jar> <output-named-jar>")
            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outputJar = File(args[2])
            val runTestClient = (args.size >= 4 && args[3] in arrayOf("-t", "--test"))

            Updater(oldJar, newJar, outputJar, runTestClient).run()
        }
    }

    lateinit var env: ClassEnvironment private set
    lateinit var matcher: Matcher private set

    private lateinit var nodeFixerA: StaticNodeFixer
    private lateinit var nodeFixerB: StaticNodeFixer

    private fun init() {
        Logger.info("Initializing updater.")

        /*
         * Migrate static nodes to their own owner for analysis.
         */
        val preGroupA = ClassGroup().also { it.readJar(oldJar) }
        val preGroupB = ClassGroup().also { it.readJar(newJar) }
        preGroupA.init()
        preGroupB.init()

        nodeFixerA = StaticNodeFixer(preGroupA).also {
            it.extract()
            preGroupA.writeJar(oldJar.resolveSibling("${oldJar.name}.obf"))
        }

        nodeFixerB = StaticNodeFixer(preGroupB).also {
            it.extract()
            preGroupB.writeJar(newJar.resolveSibling("${newJar.name}.obf"))
        }

        val config = ProjectConfig(
            mutableListOf(oldJar.resolveSibling("${oldJar.name}.obf").toPath()),
            mutableListOf(newJar.resolveSibling("${newJar.name}.obf").toPath()),
            mutableListOf(),
            mutableListOf(),
            mutableListOf(),
            false,
            "",
            "",
            "",
            ""
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
        matcher.autoMatchAll { /* Do Nothing */ }
        Logger.info("Successfully completed dynamically mapping of jar entries.")

        this.save()

        println("\n")
        matcher.logMatchingStatus()
    }

    private fun save() {
        Logger.info("Saving updated / renamed new-jar to output file: ${outputJar.path}.")

        if(outputJar.exists()) outputJar.delete()
        outputJar.createNewFile()

        val group = ClassGroup()

        env.envB.classes.forEach { cls ->
            val node = ClassNode().fromBytes(cls.serialize(NameType.MAPPED_AUX_PLAIN))
            group.addClass(node)
        }

        Logger.info("Writing classes to output jar.")
        group.writeJar(outputJar)

        Logger.info("Successfully saved the output updated jar file.")
    }
}