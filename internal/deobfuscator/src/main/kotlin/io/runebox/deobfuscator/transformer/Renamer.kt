package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.*
import io.runebox.asm.util.InheritanceGraph
import io.runebox.deobfuscator.Deobfuscator.isObfuscatedName
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.commons.SimpleRemapper
import org.tinylog.kotlin.Logger

class Renamer : Transformer {

    private var classCount = 0
    private var methodCount = 0
    private var fieldCount = 0

    private val mappings = hashMapOf<String, String>()

    override fun run(group: ClassGroup) {
        this.generateMappings(group)
        this.applyMappings(group)

        Logger.info("Renamed $classCount classes.")
        Logger.info("Renamed $methodCount method.")
        Logger.info("Renamed $fieldCount fields.")
    }

    private fun generateMappings(group: ClassGroup) {
        val hierarchy = InheritanceGraph(group)
        /*
         * Generate Class name mappings
         */
        mappings["client"] = "Client"
        group.classes.forEach { cls ->
            if(!cls.name.isObfuscatedName() || cls.name == "client") return@forEach
            val newName = "class${++classCount}_old"
            mappings[cls.identifier] = newName
        }

        /*
         * Generate Method name mappings
         */
        group.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(!method.name.isObfuscatedName() || mappings.containsKey(method.identifier)) return@methodLoop
                val newName = "method${++methodCount}_old"
                mappings[method.identifier] = newName
                hierarchy[cls.name]!!.children.forEach { child ->
                    mappings["${child.name}.${method.name}${method.desc}"] = newName
                }
            }
        }

        /*
         * Generate Field mapping names
         */
        group.classes.forEach { cls ->
            cls.fields.forEach fieldLoop@ { field ->
                if(!field.name.isObfuscatedName() || mappings.containsKey(field.identifier)) return@fieldLoop
                val newName = "field${++fieldCount}_old"
                mappings[field.identifier] = newName
                hierarchy[cls.name]!!.children.forEach { child ->
                    mappings["${child.name}.${field.name}"] = newName
                }
            }
        }
    }

    private fun applyMappings(group: ClassGroup) {
        Logger.info("Applying mappings.")
        group.remap(mappings)
    }
}