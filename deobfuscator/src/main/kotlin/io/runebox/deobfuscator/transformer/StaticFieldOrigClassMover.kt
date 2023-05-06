package io.runebox.deobfuscator.transformer

import com.google.common.collect.MultimapBuilder
import io.runebox.asm.tree.*
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode

class StaticFieldOrigClassMover : Transformer {

    private val fieldUsageMap = MultimapBuilder.hashKeys().arrayListValues().build<String, String>()
    private val fieldInitMap = MultimapBuilder.hashKeys().arrayListValues().build<String, String>()

    private var count = 0

    override fun run(group: ClassGroup) {
        group.allClasses.flatMap { it.methods }.forEach { method ->
            method.instructions.forEach insnLoop@ { insn ->
                if(insn !is FieldInsnNode) return@insnLoop
                if(insn.opcode == Opcodes.GETSTATIC) {
                    fieldUsageMap.put("${insn.owner}.${insn.name}", method.owner.name)
                }
                if(insn.opcode == Opcodes.PUTSTATIC && method.isInitializer()) {
                    fieldInitMap.put("${insn.owner}.${insn.name}", method.owner.name)
                }
            }
        }

        val movedFields = hashMapOf<String, String>()

        group.classes.forEach { cls ->
            cls.fields.filter { it.isStatic() }.forEach fieldLoop@ { field ->
                val owners = fieldUsageMap[field.id] ?: return@fieldLoop
                var bestOwner = owners.maxByOrNull { f -> owners.count { it == f } }?.let { group.getClass(it) }
                if(bestOwner != null && fieldInitMap.containsKey(field.id)) {
                    bestOwner = fieldInitMap[field.id].first()?.let { group.getClass(it) }
                }
                if(bestOwner == null) return@fieldLoop
                field.moveTo(bestOwner)
                movedFields[field.id] = bestOwner.name
                count++
            }
        }

        group.classes.forEach { cls ->
            cls.methods.forEach { method ->
                method.instructions.filter { it is FieldInsnNode }.forEach { insn ->
                    insn as FieldInsnNode
                    val key = "${insn.owner}.${insn.name}"
                    if(key in movedFields) {
                        insn.owner = movedFields[key]!!
                    }
                }
            }
        }
    }

    private fun FieldNode.moveTo(cls: ClassNode) {
        if (owner == cls) return
        val copy = FieldNode(access, name, desc, signature, value)
        copy.owner = cls
        cls.fields.add(copy)
    }
}