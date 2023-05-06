package io.runebox.asm.tree

import io.runebox.asm.util.field
import io.runebox.asm.util.nullField
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import java.util.*

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

val ClassNode.methodTypeRefs: MutableSet<MethodNode> by field { mutableSetOf() }
val ClassNode.fieldTypeRefs: MutableSet<FieldNode> by field { mutableSetOf() }

val ClassNode.id get() = name
val ClassNode.type get() = Type.getObjectType(name)

fun ClassNode.getMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.getField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

fun ClassNode.resolveMethod(name: String, desc: String, toInterface: Boolean): MethodNode? {
    if(!toInterface) {
        var ret = getMethod(name, desc)
        if(ret != null) return ret

        var cls: ClassNode? = this
        while(cls != null) {
            ret = cls.getMethod(name, desc)
            if(ret != null) return ret
            cls = cls.parent
        }
        return resolveInterfaceMethod(name, desc)
    } else {
        var ret = getMethod(name, desc)
        if(ret != null) return ret

        if(parent != null) {
            ret = parent!!.getMethod(name, desc)
            if(ret != null && ((ret.access and (ACC_PUBLIC or ACC_STATIC)) == ACC_PUBLIC)) return ret
        }

        return resolveInterfaceMethod(name, desc)
    }
}

private fun ClassNode.resolveInterfaceMethod(name: String, desc: String): MethodNode? {
    val queue = ArrayDeque<ClassNode>()
    val visited = hashSetOf<ClassNode>()
    var cls: ClassNode? = this

    do {
        cls!!.interfaceClasses.forEach { itf ->
            if (visited.add(itf)) queue.add(itf)
        }
        cls = cls.parent
    } while (cls != null)

    if (queue.isEmpty()) return null

    val matches = hashSetOf<MethodNode>()
    var foundNonAbstract = false

    while (queue.poll().also { cls = it } != null) {
        val ret = cls!!.getMethod(name, desc)
        if (ret != null && (ret.access and (ACC_PRIVATE or ACC_PUBLIC)) == 0) {
            matches.add(ret)

            if (ret.access and (ACC_ABSTRACT) == 0) {
                foundNonAbstract = true
            }
        }

        cls!!.interfaceClasses.forEach { itf ->
            if(visited.add(itf)) queue.add(itf)
        }
    }

    if(matches.isEmpty()) return null
    if(matches.size == 1) return matches.iterator().next()

    if(foundNonAbstract) {
        val it = matches.iterator()
        while(it.hasNext()) {
            val m = it.next()
            if((m.access and ACC_ABSTRACT) != 0) {
                it.remove()
            }
        }

        if(matches.size == 1) return matches.iterator().next()
    }

    val it = matches.iterator()
    while(it.hasNext()) {
        val m = it.next()

        cmpLoop@ for(m2 in matches) {
            if(m2 == m) continue
            if(m2.owner.interfaceClasses.contains(m.owner)) {
                it.remove()
                break
            }

            queue.addAll(m2.owner.interfaceClasses)
            while(queue.poll().also { cls = it } != null) {
                if(cls!!.interfaceClasses.contains(m.owner)) {
                    it.remove()
                    queue.clear()
                    break@cmpLoop
                }
                queue.addAll(cls!!.interfaceClasses)
            }
        }
    }
    return matches.iterator().next()
}

fun ClassNode.resolveField(name: String, desc: String): FieldNode? {
    var ret = getField(name, desc)
    if(ret != null) return ret

    if(interfaceClasses.isNotEmpty()) {
        val queue = ArrayDeque<ClassNode>()
        queue.addAll(interfaceClasses)

        var cls: ClassNode?
        while(queue.poll().also { cls = it } != null) {
            ret = cls!!.getField(name, desc)
            if(ret != null) return ret

            cls!!.interfaceClasses.forEach { itf ->
                queue.addFirst(itf)
            }
        }
    }

    var cls = parent
    while(cls != null) {
        ret = cls!!.getField(name, desc)
        if(ret != null) return ret
        cls = cls!!.parent
    }

    return null
}

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