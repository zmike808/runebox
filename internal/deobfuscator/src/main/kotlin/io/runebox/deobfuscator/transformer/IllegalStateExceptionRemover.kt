package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.intConstant
import io.runebox.asm.tree.isStatic
import io.runebox.asm.util.InsnMatcher
import io.runebox.deobfuscator.Deobfuscator
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.GOTO
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.tinylog.kotlin.Logger

class IllegalStateExceptionRemover : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        group.classes.forEach { cls ->
            cls.methods.forEach { method ->
                for(match in EXCEPTION_PATTERN.match(method).filter { checkExceptionPattern(method, it) }) {
                    method.removeMatchedInsns(match)
                    continue
                }

                for(match in RETURN_PATTERN.match(method).filter { checkReturnPattern(method, it) }) {
                    method.removeMatchedInsns(match)
                    continue
                }
            }
        }

        Logger.info("Removed $count 'IllegalStateException' exception opaque checks.")
    }

    private fun MethodNode.removeMatchedInsns(insns: List<AbstractInsnNode>) {
        val jump = insns[2] as JumpInsnNode
        val goto = JumpInsnNode(GOTO, jump.label)
        instructions.insert(insns.last(), goto)
        insns.forEach(instructions::remove)
        count++
    }

    private fun checkExceptionPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val cst = insns[1]
        val new = insns[3] as TypeInsnNode
        if(load.`var` != method.lastArgIndex) return false
        if(cst.intConstant == null) return false
        if(new.desc != "java/lang/IllegalStateException") return false
        if(Deobfuscator.annotateMappings) {
            if(method.visibleAnnotations == null) {
                method.visibleAnnotations = mutableListOf()
            }
            method.visibleAnnotations.addAll(createOpaqueAnnotation(cst))
        }
        return true
    }

    private fun checkReturnPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val cst = insns[1]
        if(load.`var` != method.lastArgIndex) return false
        if(cst.intConstant == null) return false
        if(Deobfuscator.annotateMappings) {
            if(method.visibleAnnotations == null) {
                method.visibleAnnotations = mutableListOf()
            }
            method.visibleAnnotations.addAll(createOpaqueAnnotation(cst))
        }
        return true
    }

    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(isStatic()) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    private val AbstractInsnNode.intValue: Int get() {
        if (opcode in 2..8) return opcode - 3
        if (opcode == Opcodes.BIPUSH || opcode == Opcodes.SIPUSH) return (this as IntInsnNode).operand
        if (this is LdcInsnNode && cst is Int) return cst as Int
        throw IllegalStateException()
    }

    private fun createOpaqueAnnotation(insn: AbstractInsnNode): MutableList<AnnotationNode> {
        val node = AnnotationNode("Lio/runebox/deobfuscator/annotation/ObfOpaque;")
        node.values = listOf(
            "value", insn.intValue
        )
        return mutableListOf(node)
    }

    companion object {

        private val EXCEPTION_PATTERN = InsnMatcher.compile(
            """
                (ILOAD)
                ([ICONST_0-LDC])
                ([IF_ICMPEQ-IF_ACMPNE])
                (NEW)
                (DUP)
                (INVOKESPECIAL)
                (ATHROW)
            """.trimIndent()
        )

        private val RETURN_PATTERN = InsnMatcher.compile(
            """
                (ILOAD)
                ([ICONST_0-LDC])
                ([IF_ICMPEQ-IF_ACMPNE])
                ([IRETURN-RETURN])
            """.trimIndent()
        )
    }
}