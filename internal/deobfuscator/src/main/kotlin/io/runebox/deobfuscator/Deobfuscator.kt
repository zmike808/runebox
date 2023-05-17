package io.runebox.deobfuscator

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.ignored
import io.runebox.deobfuscator.transformer.*
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

object Deobfuscator {

   private lateinit var inputFile: File
   private lateinit var outputFile: File
   private var runTestClient = false
   var annotateMappings = false

   private val group = ClassGroup()
   private val transformers = mutableListOf<Transformer>()

   /**
    * == BYTECODE TRANSFORMER REGISTRATION ==
    *
    * **!NOTE!** The order of the transformers matter and have
    * to carefully thought about.
    *
    * =========================================
    */
   private fun initTransformers() {
      register<RuntimeExceptionRemover>()
      register<DeadCodeRemover>()
      register<ControlFlowOptimizer>()
      register<ExceptionRangeOptimizer>()
      register<Renamer>()
      register<IllegalStateExceptionRemover>()
      register<UnusedArgRemover>()
      register<GotoOptimizer>()
      register<ConstructorErrorRemover>()
      register<GetPathFixer>()
      register<FieldOrigClassMover>()
      register<UnusedFieldRemover>()
      register<FieldSorter>()
      register<StaticMethodOrigClassMover>()
      register<UnusedMethodRemover>()
      register<MethodSorter>()
      register<ExprOrderNormalizer>()
      register<MultiplierRemover>()
      register<StackFrameFixer>()
      register<DecompilerTrapFixer>()
      register<CopyPropagationFixer>()
   }

   @JvmStatic
   fun main(args: Array<String>) {
      if(args.size < 2) error("Usage: deobfuscator <input-jar> <output-jar> [-t]")

      val inputFile = File(args[0])
      val outputFile = File(args[1])
      val runTestClient = args.size >= 3 && args.any { it == "-t" }
      val annotateMappings = args.size >= 3 && args.any { it == "-a" }

      this.inputFile = inputFile
      this.outputFile = outputFile
      this.runTestClient = runTestClient
      this.annotateMappings = annotateMappings

      this.init()
      this.run()
      this.save()

      if(runTestClient) {
         this.test()
      }
   }

   private fun init() {
      Logger.info("Initializing deobfuscator.")

      /*
       * Load classes from jar into group
       */
      Logger.info("Loading classes from jar file: ${inputFile.name}.")
      group.readJar(inputFile)
      group.classes.forEach { cls ->
         if(arrayOf("bouncycastle", "json").any { cls.name.contains(it) }) {
            cls.ignored = true
         }
      }
      group.init()
      Logger.info("Loaded ${group.classes.size} from jar file.")

      /*
       * Register Bytecode transformers.
       */
      this.initTransformers()
   }

   private fun run() {
      Logger.info("Running deobfuscator.")

      val taskStart = System.currentTimeMillis()
      /*
       * Run all the of the registered bytecode transformers
       */
      transformers.forEach { transformer ->
         Logger.info("Running transformer: ${transformer::class.simpleName}.")
         transformer.run(group)
      }
      val taskDelta = System.currentTimeMillis() - taskStart

      Logger.info("Completed all bytecode transformers in ${(taskDelta / 1000L)} seconds.")
   }

   private fun save() {
      Logger.info("Saving deobfuscated classes to jar file: ${outputFile.name}.")

      /*
       * Save all the classes in the group to the jar file.
       */
      group.writeJar(outputFile)

      Logger.info("Successfully saved ${group.allClasses.size} to jar file.")
   }

   private fun test() {
      Logger.info("Starting test client using jar file: ${outputFile.name}.")
      TestClient(outputFile, inputFile).run()
   }

   @TransformerMarker
   private inline fun <reified T : Transformer> register() {
      transformers.add(T::class.createInstance())
   }

   @DslMarker
   private annotation class TransformerMarker

   fun String.isObfuscatedName(): Boolean {
      if(this.length <= 3) {
         return this != "run" && this != "add"
      }
      return arrayOf("class", "method", "field").any { this.startsWith(it) }
   }
}