package io.runebox.asm.cfg

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.JumpInsnNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.LookupSwitchInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TableSwitchInsnNode

class ControlFlowGraph(val method: MethodNode) {

    val blocks = mutableListOf<Block>()

    init {
        init()
        build()
    }

    private fun init() {
        val insns = method.instructions
        var block: Block? = null
        for(insn in insns) {
            if(block == null) {
                block = Block()
                block.id = blocks.size + 1
                block.startIndex = insns.indexOf(insn)
                block.endIndex = insns.indexOf(insn)
            }
            if(insn is LabelNode) {
                block.label = insn
                val tcb = method.tryCatchBlocks.firstOrNull { it.handler == insn }
                if(tcb != null) {
                    block.tcb = tcb
                    block.tcbIndex = method.tryCatchBlocks.indexOf(tcb)
                }
            }
            block.instructions.add(insn)
            if(insn.opcode in IRETURN..RETURN || insn is JumpInsnNode || insn.opcode in arrayOf(ATHROW, LOOKUPSWITCH, TABLESWITCH, RET)) {
                block.endInsn = insn
                block.endIndex = insns.indexOf(insn)
                blocks.add(block)
                block = null
                continue
            }
            if(insn.next is LabelNode) {
                block.endInsn = insn.next
                block.endIndex = insns.indexOf(insn)
                blocks.add(block)
                block = null
            }
        }
    }

    private fun build() {
        blocks.forEach { block ->
            val insn = block.endInsn
            if(insn is JumpInsnNode) {
                val succs = mutableListOf<Block>()
                val labelBlock = blocks.first { it.instructions.contains(insn.label) }
                if(insn.opcode == GOTO) {
                    succs.add(labelBlock)
                    block.successors = succs
                    labelBlock.predecessors.add(block)
                } else {
                    succs.add(labelBlock)
                    if(insn.next == null) {
                        throw RuntimeException("if has no next insn.")
                    }
                    val nextBlock = blocks.first { it.instructions.contains(insn.next) }
                    succs.add(nextBlock)
                    block.successors = succs
                    labelBlock.predecessors.add(block)
                    nextBlock.predecessors.add(block)
                }
            }
            else if(insn is TableSwitchInsnNode) {
                val succs = mutableListOf<Block>()
                if(insn.dflt != null) {
                    val defaultBlock = blocks.first { it.instructions.contains(insn.dflt) }
                    defaultBlock.predecessors.add(block)
                    succs.add(defaultBlock)
                }
                val connectedLabels = hashSetOf<LabelNode>()
                insn.labels.forEach labelLoop@ { label ->
                    if(connectedLabels.contains(label)) return@labelLoop
                    connectedLabels.add(label)
                    val caseBlock = blocks.first { it.instructions.contains(label) }
                    caseBlock.predecessors.add(block)
                    succs.add(caseBlock)
                }
                block.successors = succs
            }
            else if(insn is LookupSwitchInsnNode) {
                val succs = mutableListOf<Block>()
                if(insn.dflt != null) {
                    val defaultBlock = blocks.first { it.instructions.contains(insn.dflt) }
                    defaultBlock.predecessors.add(block)
                    succs.add(defaultBlock)
                }
                val connectedLabels = mutableListOf<LabelNode>()
                insn.labels.forEach labelLoop@ { label ->
                    if(connectedLabels.contains(label)) return@labelLoop
                    connectedLabels.add(label)
                    val caseBlock = blocks.first { it.instructions.contains(label) }
                    caseBlock.predecessors.add(block)
                    succs.add(caseBlock)
                }
                block.successors = succs
            }
            else if(insn is LabelNode) {
                val succs = mutableListOf<Block>()
                val nextBlock = blocks.first { it.instructions.contains(insn) }
                succs.add(nextBlock)
                block.successors = succs
                nextBlock.predecessors.add(block)
            }
        }
    }
}