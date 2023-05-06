package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.id
import io.runebox.asm.tree.ignored
import io.runebox.asm.util.ClassHierarchy
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName
import org.objectweb.asm.commons.ClassRemapper
import org.objectweb.asm.commons.SimpleRemapper
import org.objectweb.asm.tree.ClassNode
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
        val hierarchy = ClassHierarchy(group)
        /*
         * Generate Class name mappings
         */
        mappings["client"] = "Client"
        group.classes.forEach { cls ->
            if(!cls.name.isObfuscatedName()) return@forEach
            val newName = "class${++classCount}"
            mappings[cls.id] = newName
        }

        /*
         * Generate Method name mappings
         */
        group.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(!method.name.isObfuscatedName() || mappings.containsKey(method.id)) return@methodLoop
                val newName = "method${++methodCount}"
                mappings[method.id] = newName
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
                if(!field.name.isObfuscatedName() || mappings.containsKey(field.id)) return@fieldLoop
                val newName = "field${++fieldCount}"
                mappings[field.id] = newName
                hierarchy[cls.name]!!.children.forEach { child ->
                    mappings["${child.name}.${field.name}"] = newName
                }
            }
        }
    }

    private fun applyMappings(group: ClassGroup) {
        val remapper = SimpleRemapper(mappings)
        val newClasses = hashMapOf<ClassNode, ClassNode>()
        group.classes.forEach { cls ->
            val newCls = ClassNode()
            cls.accept(ClassRemapper(newCls, remapper))
            newCls.ignored = cls.ignored
            newClasses[cls] = newCls
        }
        newClasses.forEach { (old, new) ->
            group.replaceClass(old, new)
        }
        group.init()
    }
}