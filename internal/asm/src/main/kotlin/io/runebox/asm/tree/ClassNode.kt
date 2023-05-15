package io.runebox.asm.tree

import io.runebox.asm.AsmClassWriter
import io.runebox.util.field
import io.runebox.util.nullField
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode

internal fun ClassNode.init(group: ClassGroup) {
    this.group = group
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

internal fun ClassNode.clear() {
    superClass = null
    children.clear()
    interfaceClasses.clear()
    implementers.clear()
}

var ClassNode.group: ClassGroup by field()
var ClassNode.ignored: Boolean by field { false }

val ClassNode.id get() = name
val ClassNode.type get() = Type.getObjectType(name)

var ClassNode.superClass: ClassNode? by nullField()
val ClassNode.children: HashSet<ClassNode> by field { hashSetOf() }
val ClassNode.interfaceClasses: HashSet<ClassNode> by field { hashSetOf() }
val ClassNode.implementers: HashSet<ClassNode> by field { hashSetOf() }

fun ClassNode.getMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.getField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

fun ClassNode.fromBytes(bytes: ByteArray): ClassNode {
    val reader = ClassReader(bytes)
    reader.accept(this, ClassReader.SKIP_FRAMES)
    return this
}

fun ClassNode.toBytes(): ByteArray {
    val writer = AsmClassWriter(group, ClassWriter.COMPUTE_MAXS)
    this.accept(writer)
    return writer.toByteArray()
}

