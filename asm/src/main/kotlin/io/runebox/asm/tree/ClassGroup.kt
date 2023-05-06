package io.runebox.asm.tree

import org.objectweb.asm.tree.ClassNode
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

    }
}