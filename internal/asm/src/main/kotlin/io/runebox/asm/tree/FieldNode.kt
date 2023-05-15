package io.runebox.asm.tree

import io.runebox.util.field
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

internal fun FieldNode.init(owner: ClassNode) {
    this.owner = owner
}

var FieldNode.owner: ClassNode by field()
val FieldNode.group get() = owner.group

val FieldNode.id get() = "${owner.id}.$name"
val FieldNode.type get() = Type.getType(desc)