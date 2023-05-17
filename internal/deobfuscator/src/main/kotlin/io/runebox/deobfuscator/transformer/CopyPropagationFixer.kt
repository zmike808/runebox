package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.DataFlowAnalyzer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger
import java.util.*

class CopyPropagationFixer : Transformer {

    companion object {
        private val LOAD_OPCODES = setOf(
            Opcodes.ILOAD,
            Opcodes.LLOAD,
            Opcodes.FLOAD,
            Opcodes.DLOAD,
            Opcodes.ALOAD
        )
    }

    private var count = 0

    override fun run(group: ClassGroup) {
        group.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val analyzer = CopyPropagationAnalyzer(method)
                analyzer.analyze()

                for (insn in method.instructions) {
                    if (insn !is VarInsnNode || !LOAD_OPCODES.contains(insn.opcode)) {
                        continue
                    }

                    val set = analyzer.getInSet(insn) ?: continue
                    val assignment = set.singleOrNull { it.destination == insn.`var` } ?: continue
                    insn.`var` = assignment.source
                    count++
                }
            }
        }

        Logger.info("Propagated $count duplicate local variables.")
    }

    class CopyPropagationAnalyzer(method: MethodNode) : DataFlowAnalyzer<Set<CopyAssignment>>(method) {

        private val allAssignments = mutableSetOf<CopyAssignment>()

        init {
            for (insn in method.instructions) {
                if (insn !is VarInsnNode || !STORE_OPCODES.contains(insn.opcode)) {
                    continue
                }

                val previous = insn.previous
                if (previous !is VarInsnNode || !LOAD_OPCODES.contains(previous.opcode)) {
                    continue
                }

                allAssignments += CopyAssignment(insn.`var`, previous.`var`)
            }
        }

        override fun createEntrySet(): Set<CopyAssignment> {
            return Collections.emptySet()
        }

        override fun createInitialSet(): Set<CopyAssignment> {
            return allAssignments
        }

        override fun join(set1: Set<CopyAssignment>, set2: Set<CopyAssignment>): Set<CopyAssignment> {
            return set1 intersect set2
        }

        override fun transfer(set: Set<CopyAssignment>, insn: AbstractInsnNode): Set<CopyAssignment> {
            return when {
                insn is VarInsnNode && STORE_OPCODES.contains(insn.opcode) -> {
                    val newSet = set.minusKilledByAssignmentTo(insn.`var`)

                    val previous = insn.previous
                    if (previous is VarInsnNode && LOAD_OPCODES.contains(previous.opcode)) {
                        newSet.plus(CopyAssignment(insn.`var`, previous.`var`))
                    } else {
                        newSet
                    }
                }

                insn is IincInsnNode -> set.minusKilledByAssignmentTo(insn.`var`)
                else -> set
            }
        }

        private fun Set<CopyAssignment>.minusKilledByAssignmentTo(index: Int): Set<CopyAssignment> {
            return filterTo(mutableSetOf()) { it.source != index && it.destination != index }
        }

        private companion object {
            private val LOAD_OPCODES = setOf(
                Opcodes.ILOAD,
                Opcodes.LSTORE,
                Opcodes.FLOAD,
                Opcodes.DLOAD,
                Opcodes.ALOAD
            )
            private val STORE_OPCODES = setOf(
                Opcodes.ISTORE,
                Opcodes.LSTORE,
                Opcodes.FSTORE,
                Opcodes.DSTORE,
                Opcodes.ASTORE
            )
        }
    }

    data class CopyAssignment(val destination: Int, val source: Int)
}