package io.runebox.asm.tree

import io.runebox.asm.util.field
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun FieldNode.init(owner: ClassNode) {
    this.owner = owner
}

var FieldNode.owner: ClassNode by field()
val FieldNode.group get() = owner.group

val FieldNode.readRefs: MutableSet<MethodNode> by field { mutableSetOf() }
val FieldNode.writeRefs: MutableSet<MethodNode> by field { mutableSetOf() }

val FieldNode.id get() = "${owner.id}.$name"
val FieldNode.type get() = Type.getType(desc)

fun FieldNode.isPublic() = (access and ACC_PUBLIC) != 0
fun FieldNode.isStatic() = (access and ACC_STATIC) != 0
fun FieldNode.isAbstract() = (access and ACC_ABSTRACT) != 0
fun FieldNode.isInterface() = (access and ACC_INTERFACE) != 0
