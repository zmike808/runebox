package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.*
import io.runebox.asm.util.InheritanceGraph
import io.runebox.deobfuscator.Deobfuscator
import io.runebox.deobfuscator.Deobfuscator.isObfuscatedName
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Type
import org.objectweb.asm.commons.SimpleRemapper
import org.objectweb.asm.tree.AnnotationNode
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
            val newName = "class${++classCount}"
            mappings[cls.identifier] = newName
            if(Deobfuscator.annotateMappings) {
                cls.visibleAnnotations = createClassAnnotation(cls.name)
            }
        }

        /*
         * Generate Method name mappings
         */
        group.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(!method.name.isObfuscatedName() || mappings.containsKey(method.identifier)) return@methodLoop
                val newName = "method${++methodCount}"
                mappings[method.identifier] = newName
                if(Deobfuscator.annotateMappings) {
                    method.visibleAnnotations = createMemberAnnotation(method.owner.name, method.name, method.desc)
                }
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
                val newName = "field${++fieldCount}"
                mappings[field.identifier] = newName
                if(Deobfuscator.annotateMappings) {
                    field.visibleAnnotations = createMemberAnnotation(field.owner.name, field.name, field.desc)
                }
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

    private fun createClassAnnotation(name: String): MutableList<AnnotationNode> {
        val node = AnnotationNode("Lio/runebox/deobfuscator/annotation/OriginalClass;")
        node.values = listOf(
            "value", name
        )
        return node.list()
    }

    private fun createMemberAnnotation(owner: String, name: String, desc: String = ""): MutableList<AnnotationNode> {
        val node = AnnotationNode("Lio/runebox/deobfuscator/annotation/OriginalMember;")
        node.values = listOf(
            "owner", owner,
            "name", name,
            "desc", desc
        )
        return node.list()
    }

    private fun AnnotationNode.list(): MutableList<AnnotationNode> = mutableListOf(this)
}