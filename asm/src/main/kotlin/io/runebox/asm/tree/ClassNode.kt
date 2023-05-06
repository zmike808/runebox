package io.runebox.asm.tree

import io.runebox.asm.util.field
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

fun ClassNode.init(group: ClassGroup) {
    this.group = group
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.group: ClassGroup by field()
var ClassNode.ignored: Boolean by field { false }

val ClassNode.id get() = name

fun ClassNode.getMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.getField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

fun ClassNode.fromBytes(bytes: ByteArray): ClassNode {
    val reader = ClassReader(bytes)
    reader.accept(this, ClassReader.SKIP_FRAMES)
    return this
}

fun ClassNode.toBytes(): ByteArray {
    val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
    this.accept(writer)
    return writer.toByteArray()
}