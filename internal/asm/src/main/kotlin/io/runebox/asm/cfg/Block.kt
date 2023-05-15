package io.runebox.asm.cfg

import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.TryCatchBlockNode

class Block {

    var id: Int = 0

    var startIndex: Int = 0
    var endIndex: Int = 0

    var next: Block? = null

    var predecessors = mutableListOf<Block>()
    var successors = mutableListOf<Block>()

    val instructions = mutableListOf<AbstractInsnNode>()
    lateinit var endInsn: AbstractInsnNode
    lateinit var label: LabelNode

    var tcb: TryCatchBlockNode? = null
    var tcbIndex: Int = -1

    var depth: Int = 0

    override fun toString(): String {
        return id.toString()
    }
}