package io.runebox.asm.tree

import io.runebox.util.field
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import java.lang.reflect.Modifier

fun FieldNode.init(owner: ClassNode) {
    this.owner = owner
}

var FieldNode.owner: ClassNode by field()
var FieldNode.index: Int by field { -1 }
val FieldNode.group get() = owner.group

val FieldNode.identifier get() = "${owner.identifier}.$name"
val FieldNode.type get() = Type.getType(desc)

fun FieldNode.isStatic() = Modifier.isStatic(access)
fun FieldNode.isAbstract() = Modifier.isAbstract(access)
fun FieldNode.isPrivate() = Modifier.isPrivate(access)