package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.children
import io.runebox.asm.tree.implementers
import io.runebox.asm.tree.interfaceClasses
import io.runebox.deobfuscator.Deobfuscator.isObfuscatedName
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger

class EmptyClassRemover : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        val toRemove = hashSetOf<ClassNode>()
        group.classes.forEach { cls ->
            if(!cls.name.isObfuscatedName()) return@forEach
            if(cls.methods.isNotEmpty()) return@forEach
            if(cls.fields.isNotEmpty()) return@forEach
            if(cls.implementers.isNotEmpty()) return@forEach
            if(cls.children.isNotEmpty()) return@forEach
            if(cls.interfaceClasses.isNotEmpty()) return@forEach
            toRemove.add(cls)
            count++
        }
        toRemove.forEach { cls ->
            group.removeClass(cls)
        }

        Logger.info("Removed $count empty/unused classes.")
    }
}