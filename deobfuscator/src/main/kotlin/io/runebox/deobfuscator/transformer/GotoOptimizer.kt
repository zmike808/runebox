package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.nextReal
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.JumpInsnNode
import org.tinylog.kotlin.Logger

class GotoOptimizer : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        group.classes.forEach { cls ->
            cls.methods.forEach { method ->
                for(insn in method.instructions) {
                    if(insn.opcode == Opcodes.GOTO) {
                        insn as JumpInsnNode
                        if(insn.nextReal == insn.label.nextReal) {
                            method.instructions.remove(insn)
                            count++
                        }
                    }
                }
            }
        }

        Logger.info("Removed $count redundant GOTO jumps.")
    }
}