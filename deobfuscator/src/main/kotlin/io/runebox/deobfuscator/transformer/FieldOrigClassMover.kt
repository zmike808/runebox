package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassGroup
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.tinylog.kotlin.Logger
import java.lang.reflect.Modifier

class FieldOrigClassMover : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        val resolver = FieldOwnerResolver(group)
        group.classes.forEach { cls ->
            cls.methods.forEach { method ->
                method.instructions.iterator().forEach { insn ->
                    if(insn is FieldInsnNode) {
                        val opcode = insn.opcode
                        val prevOwner = insn.owner
                        val isStatic = opcode in listOf(Opcodes.GETSTATIC, Opcodes.PUTSTATIC)
                        insn.owner = resolver.getOwner(insn.owner, insn.name, insn.desc, isStatic)
                        val newOwner = insn.owner
                        if(prevOwner != newOwner) {
                            count++
                        }
                    }
                }
            }
        }

        Logger.info("Moved $count fields to original classes.")
    }

    private class FieldOwnerResolver(private val group: ClassGroup) {

        private val classNames = group.allClasses.associateBy { it.name }

        fun getOwner(owner: String, name: String, desc: String, isStatic: Boolean): String {
            var cls = classNames[owner] ?: return owner
            while(true) {
                if(cls.containsField(name, desc, isStatic)) {
                    return cls.name
                }
                cls = classNames[cls.superName] ?: return cls.superName
            }
        }

        private fun ClassNode.containsField(name: String, desc: String, isStatic: Boolean): Boolean {
            return fields.any { it.name == name && it.desc == desc && Modifier.isStatic(it.access) == isStatic }
        }
    }
}