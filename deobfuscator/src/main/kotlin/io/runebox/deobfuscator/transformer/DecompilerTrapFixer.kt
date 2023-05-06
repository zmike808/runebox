package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.nextReal
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.InsnNode
import org.tinylog.kotlin.Logger

class DecompilerTrapFixer : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        group.classes.forEach { cls ->
            cls.methods.forEach { method ->
                if(method.tryCatchBlocks.any { it.end.nextReal == null }) {
                    method.instructions.add(InsnNode(Opcodes.NOP))
                    count++
                }
            }
        }

        Logger.info("Fixed $count decompiler exception traps.")
    }
}