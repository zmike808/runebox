package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.id
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.FieldInsnNode
import org.tinylog.kotlin.Logger

class UnusedFieldRemover : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        val usedFields = group.allClasses.flatMap { it.methods }
            .flatMap { it.instructions.toArray().asIterable() }
            .mapNotNull { it as? FieldInsnNode }
            .map { "${it.owner}.${it.name}" }
            .toSet()

        group.classes.forEach { cls ->
            val fields = cls.fields.iterator()
            while(fields.hasNext()) {
                val field = fields.next()
                if(!usedFields.contains(field.id)) {
                    fields.remove()
                    count++
                }
            }
        }

        Logger.info("Removed $count unused fields.")
    }
}