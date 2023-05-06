package io.runebox.deobfuscator.transformer

import com.google.common.collect.HashMultimap
import io.runebox.asm.tree.*
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.*
import org.tinylog.kotlin.Logger

class StaticMethodOrigClassMover : Transformer {

    private var count = 0
    private val movedMethods = hashMapOf<String, String>()

    override fun run(group: ClassGroup) {
        val usedMethods = mutableSetOf<String>()
        val realMethods = mutableSetOf<MethodNode>()
        val dummyMethods = mutableSetOf<MethodNode>()
        val dupMethodMap = HashMultimap.create<MethodNode, MethodNode>()

        group.classes.flatMap { it.methods }.flatMap { it.instructions }.filter { it.opcode == Opcodes.INVOKESTATIC }.forEach { insn ->
            insn as MethodInsnNode
            usedMethods.add("${insn.owner}.${insn.name}${insn.desc}")
        }

        group.classes.flatMap { it.methods }.filter { it.isStatic() && !it.isInitializer() }.forEach { method ->
            if(method.id in usedMethods) {
                realMethods.add(method)
            } else {
                dummyMethods.add(method)
            }
        }

        realMethods.forEach { realMethod ->
            val realLines = realMethod.instructions.lineNumbers
            if(realLines.isNotEmpty()) {
                dummyMethods.forEach dummyLoop@ { dummyMethod ->
                    if(dummyMethod.desc != realMethod.desc) return@dummyLoop
                    if(dummyMethod.owner == realMethod.owner) return@dummyLoop
                    val dummyLines = dummyMethod.instructions.lineNumbers
                    if(realLines.size == dummyLines.size && realLines.containsAll(dummyLines)) {
                        val realInsns = realMethod.instructions
                        val dummyInsns = dummyMethod.instructions
                        realInsns.forEachIndexed { i, realInsn ->
                            if(dummyInsns[i].opcode != realInsn.opcode) return@dummyLoop
                        }
                        dupMethodMap.put(realMethod, dummyMethod)
                    }
                }
            }
        }

        val dupMethods = mutableMapOf<MethodNode, MethodNode>()
        dupMethodMap.asMap().forEach { (real, dummys) ->
            val dummy = dummys.maxBy { d -> dummys.count { it.owner == d.owner } }
            dupMethods[real] = dummy
        }

        dupMethods.forEach { (real, dummy) ->
            real.moveTo(dummy.owner)
            count++
        }

        group.allClasses.forEach { cls ->
            cls.methods.flatMap { it.instructions }.forEach insnLoop@ { insn ->
                if(insn.opcode != Opcodes.INVOKESTATIC) return@insnLoop
                insn as MethodInsnNode
                val newOwner = movedMethods["${insn.owner}.${insn.name}${insn.desc}"] ?: return@insnLoop
                insn.owner = newOwner
            }
        }

        Logger.info("Moved $count static methods to their original class.")
    }

    private fun MethodNode.moveTo(cls: ClassNode) {
        val copy = MethodNode(access, name, desc, signature, exceptions.toTypedArray().copyOf())
        this.accept(copy)
        copy.owner = cls
        cls.methods.add(copy)
        owner.methods.remove(this)
        movedMethods[this.id] = cls.name
    }

    private val InsnList.lineNumbers: List<Int> get() {
        val lines = mutableListOf<Int>()
        this.forEach { insn ->
            if(insn is LineNumberNode) {
                lines.add(insn.line)
            }
        }
        return lines
    }
}