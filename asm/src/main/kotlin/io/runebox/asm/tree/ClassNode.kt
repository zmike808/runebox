package io.runebox.asm.tree

import io.runebox.asm.util.field
import io.runebox.asm.util.nullField
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun ClassNode.init(group: ClassGroup) {
    this.group = group
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.group: ClassGroup by field()
var ClassNode.ignored: Boolean by field { false }

var ClassNode.parent: ClassNode? by nullField()
val ClassNode.children: MutableList<ClassNode> by field { mutableListOf() }
val ClassNode.interfaceClasses: MutableList<ClassNode> by field { mutableListOf() }
val ClassNode.implementers: MutableList<ClassNode> by field { mutableListOf() }

val ClassNode.methodTypeRefs: MutableList<MethodNode> by field { mutableListOf() }
val ClassNode.fieldTypeRefs: MutableList<FieldNode> by field { mutableListOf() }

val ClassNode.id get() = name
val ClassNode.type get() = Type.getObjectType(name)

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