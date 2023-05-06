package io.runebox.asm.tree

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import java.io.File
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassGroup {

    private val classList = mutableListOf<ClassNode>()

    val classes get() = classList.filter { !it.ignored }.toList()
    val allClasses get() = classList.toList()

    fun addClass(cls: ClassNode) {
        cls.init(this)
        classList.add(cls)
    }

    fun removeClass(cls: ClassNode) {
        classList.remove(cls)
    }

    fun replaceClass(old: ClassNode, new: ClassNode) {
        removeClass(old)
        addClass(new)
    }

    fun getClass(name: String) = classes.firstOrNull { it.name == name }
    fun getIgnoredClass(name: String) = classes.firstOrNull { it.name == name }
    fun findClass(name: String) = getClass(name) ?: getIgnoredClass(name)

    fun readJar(file: File, ignorePredicate: (ClassNode) -> Boolean = { false }) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val bytes = jar.getInputStream(entry).readAllBytes()
                    val cls = ClassNode().fromBytes(bytes)
                    if(!ignorePredicate(cls)) {
                        addClass(cls)
                    }
                }
            }
        }
    }

    fun writeJar(file: File, writeIgnored: Boolean = true) {
        if(file.exists()) file.delete()
        else file.mkdirs()
        JarOutputStream(file.outputStream()).use { jos ->
            val entries = if(writeIgnored) allClasses else classes
            entries.forEach { cls ->
                jos.putNextEntry(JarEntry(cls.name+".class"))
                jos.write(cls.toBytes())
                jos.closeEntry()
            }
        }
    }

    fun clear() {
        classList.clear()
    }

    fun init() {
        repeat(2) { step ->
            when(step) {
                0 -> {
                    allClasses.forEach { cls ->
                        if(cls.superName != null && cls.parent == null) {
                            cls.parent = findClass(cls.superName)
                            cls.parent?.children?.add(cls)
                        }
                        cls.interfaces.mapNotNull { findClass(it) }.forEach { itf ->
                            if(cls.interfaceClasses.add(itf)) itf.implementers.add(cls)
                        }
                    }
                }
                1 -> {
                    allClasses.forEach { cls ->
                        cls.methods.forEach { method ->
                            val it = method.instructions.iterator()
                            while(it.hasNext()) {
                                val insn = it.next()
                                when(insn.type) {
                                    METHOD_INSN -> {
                                        insn as MethodInsnNode
                                        handleMethodInvocation(
                                            method,
                                            insn.owner,
                                            insn.name,
                                            insn.desc,
                                            insn.itf,
                                            insn.opcode == INVOKESTATIC
                                        )
                                    }
                                    FIELD_INSN -> {
                                        insn as FieldInsnNode
                                        val owner = findClass(insn.owner) ?: continue
                                        val dst = owner.resolveField(insn.name, insn.desc) ?: continue
                                        if(insn.opcode == GETSTATIC || insn.opcode == GETFIELD) {
                                            dst.readRefs.add(method)
                                            method.fieldReadRefs.add(dst)
                                        } else {
                                            dst.writeRefs.add(method)
                                            method.fieldWriteRefs.add(dst)
                                        }
                                        dst.owner.methodTypeRefs.add(method)
                                        method.classRefs.add(dst.owner)
                                    }
                                    TYPE_INSN -> {
                                        insn as TypeInsnNode
                                        val dst = findClass(insn.desc) ?: continue
                                        dst.methodTypeRefs.add(method)
                                        method.classRefs.add(dst)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun handleMethodInvocation(method: MethodNode, rawOwner: String, name: String, desc: String, toInterface: Boolean, isStatic: Boolean) {
        val dst = resolveMethod(rawOwner, name, desc, toInterface, isStatic) ?: return
        dst.refsIn.add(method)
        dst.refsOut.add(dst)
        dst.owner.methodTypeRefs.add(method)
        method.classRefs.add(dst.owner)
    }

    private fun resolveMethod(
        owner: String,
        name: String,
        desc: String,
        toInterface: Boolean,
        isStatic: Boolean
    ): MethodNode? {
        val cls = findClass(owner) ?: return null
        return cls.resolveMethod(name, desc, toInterface)
    }
}