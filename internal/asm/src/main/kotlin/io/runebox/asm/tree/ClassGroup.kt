package io.runebox.asm.tree

import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassGroup {

    private val classList = mutableListOf<ClassNode>()

    val classes get() = classList.filter { !it.ignored }.toList()
    val ignoredClasses get() = classList.filter { it.ignored }.toList()
    val allClasses get() = classList.toList()

    fun addClass(cls: ClassNode) {
        cls.init(this)
        classList.add(cls)
    }

    fun removeClass(cls: ClassNode) {
        classList.remove(cls)
    }

    fun getClass(name: String) = classes.firstOrNull { it.name == name }
    fun getIgnoredClass(name: String) = ignoredClasses.firstOrNull { it.name == name }
    fun findClass(name: String) = allClasses.firstOrNull { it.name == name }

    fun init() {
        allClasses.forEach { it.clear() }
        allClasses.forEach { cls ->
            if(cls.superName != null && cls.superClass == null) {
                cls.superClass = findClass(cls.superName)
                cls.superClass?.children?.add(cls)
            }
            cls.interfaces.mapNotNull { findClass(it) }.forEach { itCls ->
                cls.interfaceClasses.add(itCls)
                itCls.implementers.add(cls)
            }
        }
    }

    fun readJar(file: File) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val bytes = jar.getInputStream(entry).readAllBytes()
                    val cls = ClassNode().fromBytes(bytes)
                    addClass(cls)
                }
            }
        }
        this.init()
    }

    fun writeJar(file: File) {
        if(file.exists()) file.delete()
        file.createNewFile()
        JarOutputStream(file.outputStream()).use { jos ->
            allClasses.forEach { cls ->
                val bytes = cls.toBytes()
                jos.putNextEntry(JarEntry("${cls.name}.class"))
                jos.write(bytes)
                jos.closeEntry()
            }
        }
    }
}