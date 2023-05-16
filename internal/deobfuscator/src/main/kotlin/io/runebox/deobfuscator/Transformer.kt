package io.runebox.deobfuscator

import io.runebox.asm.tree.ClassGroup

interface Transformer {

    fun run(group: ClassGroup)

}