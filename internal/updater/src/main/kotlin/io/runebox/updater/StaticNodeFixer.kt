package io.runebox.updater

import io.runebox.asm.tree.*
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class StaticNodeFixer(val group: ClassGroup) {

    fun extract() {
        Logger.info("Extracting static nodes.")

        /*
         * Create the StaticNodes.class in hte pool.
         */
        val staticCls = this.createStaticClass()
        val moved = hashMapOf<String, ClassNode>()

        /*
         * Iterate through and find any static methods which can be moved.
         */
        group.classes.forEach classLoop@ { cls ->
            if(cls == staticCls) return@classLoop
            val toRemove = mutableSetOf<MethodNode>()
            cls.methods.forEach methodLoop@ { method ->
                if(!method.isStatic() || method.isInitializer() || arrayOf("bouncycastle", "json").any { method.owner.name.contains(it) }) return@methodLoop
                moveMethodNode(staticCls, method)
                toRemove.add(method)
                moved[method.identifier] = staticCls
            }
            cls.methods.removeAll(toRemove)
        }

        group.classes.forEach classLoop@ { cls ->
            if(cls == staticCls) return@classLoop
            val toRemove = mutableSetOf<FieldNode>()
            cls.fields.forEach fieldLoop@ { field ->
                if(!field.isStatic() || arrayOf("bouncycastle", "json").any { field.owner.name.contains(it) }) return@fieldLoop
                moveField(staticCls, field)
                toRemove.add(field)
                moved[field.identifier] = staticCls
            }
            cls.fields.removeAll(toRemove)
        }

        group.classes.flatMap { it.methods }.forEach { m ->
            for(insn in m.instructions) {
                if(insn is MethodInsnNode && "${insn.owner}.${insn.name}${insn.desc}" in moved) {
                    insn.owner = moved["${insn.owner}.${insn.name}${insn.desc}"]!!.name
                }
                else if(insn is FieldInsnNode && "${insn.owner}.${insn.name}" in moved) {
                    insn.owner = moved["${insn.owner}.${insn.name}"]!!.name
                }
            }
        }

        group.init()
        Logger.info("Successfully moved all static nodes to StaticNodes.class for analysis.")
    }


    private fun createStaticClass(): ClassNode {
        val node = ClassNode()
        node.version = V1_6
        node.access = ACC_PUBLIC or ACC_SUPER
        node.name = "StaticNodes"
        node.superName = "java/lang/Object"
        node.interfaces = listOf()
        group.addClass(node)
        return node
    }

    private fun moveMethodNode(cls: ClassNode, method: MethodNode) {
        val copy = MethodNode(method.access, method.name, method.desc, method.signature, arrayOf(*method.exceptions.toTypedArray()))
        method.accept(copy)
        copy.owner = cls
        cls.methods.add(copy)
    }

    private fun moveField(cls: ClassNode, field: FieldNode) {
        val copy = FieldNode(field.access, field.name, field.desc, field.signature, field.value)
        copy.owner = cls
        cls.fields.add(copy)
    }
}