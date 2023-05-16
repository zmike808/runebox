package io.runebox.asm.tree

import io.runebox.util.field
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

fun MethodNode.init(owner: ClassNode) {
    this.owner = owner
}

var MethodNode.owner: ClassNode by field()
var MethodNode.index: Int by field { -1 }
val MethodNode.group get() = owner.group

val MethodNode.identifier get() = "${owner.identifier}.$name$desc"
val MethodNode.type get() = Type.getMethodType(desc)

fun MethodNode.isStatic() = Modifier.isStatic(access)
fun MethodNode.isAbstract() = Modifier.isAbstract(access)
fun MethodNode.isPrivate() = Modifier.isPrivate(access)

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"