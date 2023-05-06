package io.runebox.deobfuscator

import io.runebox.asm.tree.ClassGroup
import io.runebox.deobfuscator.transformer.*
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

fun main(args: Array<String>) {
    if(args.size < 2) throw IllegalArgumentException("Missing arguments. <input-jar> <output-jar> [-t, --test]")

    val inputJar = File(args[0])
    val outputJar = File(args[1])
    val runTestClient = (args.size == 3 && args[2] in arrayOf("-t", "--test"))

    Deobfuscator(inputJar, outputJar, runTestClient).run()
}

class Deobfuscator(
    private val inputJar: File,
    private val outputJar: File,
    private val runTestClient: Boolean = false
) {

    private val group = ClassGroup()
    private val transformers = mutableListOf<Transformer>()

    init {
        /*
         * Register bytecode transformers
         */
        register<RuntimeExceptionRemover>()
        register<DeadCodeRemover>()
        register<IllegalStateExceptionRemover>()
        register<ControlFlowOptimizer>()
        register<ExceptionRangeFixer>()
        register<Renamer>()
        register<UnusedArgRemover>()
        register<GotoOptimizer>()
        register<ConstructorErrorRemover>()
        register<GetPathFixer>()
        register<FieldOrigClassMover>()
        register<StaticFieldOrigClassMover>()
        register<UnusedFieldRemover>()
        register<StaticMethodOrigClassMover>()
        register<UnusedMethodRemover>()
        register<FieldSorter>()
        register<MethodSorter>()
        register<ExprOrderNormalizer>()
        register<MultiplierRemover>()
        //register<StackFrameFixer>()
        register<DecompilerTrapFixer>()

        Logger.info("Registered ${transformers.size} bytecode transformers.")
    }

    fun run() {
        Logger.info("Initializing deobfuscator.")

        /*
         * Load classes from jar file.
         */
        group.readJar(inputJar) { cls -> arrayOf("bouncycastle", "json").any { cls.name.contains(it) }}
        //group.init()
        Logger.info("Loaded ${group.classes.size} classes from input jar.")

        /*
         * Run the bytecode transformers
         */
        Logger.info("Starting deobfuscation.")
        transformers.forEach { transformer ->
            Logger.info("Running transformer '${transformer::class.simpleName}'.")
            transformer.run(group)
        }
        Logger.info("Successfully completed deobfuscation.")

        /*
         * Save deobfuscated classes to jar file.
         */
        Logger.info("Writing deobfuscated classes to output jar.")
        group.writeJar(outputJar)

        if(runTestClient) {
            Logger.info("Starting test client using output jar.")
            TestClient(outputJar, inputJar).run()
        }

        Logger.info("Finished deobfuscation. Exiting process.")
    }

    @DslMarker
    private annotation class TransformerMarker

    @TransformerMarker
    private inline fun <reified T : Transformer> register() {
        transformers.add(T::class.createInstance())
    }
}

fun String.isObfuscatedName(): Boolean {
    return this.length <= 2 ||
            (this.length == 3 && listOf("aa", "ab", "ac", "ad", "ae", "af").any { this.startsWith(it) } && this != "add") ||
            (listOf("class", "method", "field").any { this.startsWith(it) })
}