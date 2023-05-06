package io.runebox.asm.tree

import io.runebox.asm.util.field
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(owner: ClassNode) {
    this.owner = owner
}

var MethodNode.owner: ClassNode by field()
val MethodNode.group get() = owner.group

val MethodNode.refsIn: MutableSet<MethodNode> by field { mutableSetOf() }
val MethodNode.refsOut: MutableSet<MethodNode> by field { mutableSetOf() }
val MethodNode.fieldReadRefs: MutableSet<FieldNode> by field { mutableSetOf() }
val MethodNode.fieldWriteRefs: MutableSet<FieldNode> by field { mutableSetOf() }
val MethodNode.classRefs: MutableSet<ClassNode> by field { mutableSetOf() }

val MethodNode.id get() = "${owner.id}.$name$desc"
val MethodNode.type get() = Type.getMethodType(desc)

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"

fun MethodNode.isPublic() = (access and ACC_PUBLIC) != 0
fun MethodNode.isStatic() = (access and ACC_STATIC) != 0
fun MethodNode.isAbstract() = (access and ACC_ABSTRACT) != 0
fun MethodNode.isInterface() = (access and ACC_INTERFACE) != 0