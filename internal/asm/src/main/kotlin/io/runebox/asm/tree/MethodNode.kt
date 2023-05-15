package io.runebox.asm.tree

import io.runebox.util.field
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

internal fun MethodNode.init(owner: ClassNode) {
    this.owner = owner
}

var MethodNode.owner: ClassNode by field()
val MethodNode.group get() = owner.group

val MethodNode.id get() = "${owner.id}.$name$desc"
val MethodNode.type get() = Type.getMethodType(desc)