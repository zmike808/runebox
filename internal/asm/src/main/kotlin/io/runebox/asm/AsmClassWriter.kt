package io.runebox.asm

import io.runebox.asm.tree.ClassGroup
import org.objectweb.asm.ClassWriter

class AsmClassWriter(private val group: ClassGroup, flags: Int) : ClassWriter(flags) {

    override fun getCommonSuperClass(type1: String, type2: String): String {
        if(group.findClass(type1) == null && group.findClass(type2) == null) {
            return super.getCommonSuperClass(type1, type2)
        }

        val supers1 = getSuperClasses(type1)
        val supers2 = getSuperClasses(type2)

        return supers1.firstOrNull(supers2::contains) ?: "java/lang/Object"
    }

    private fun ClassLoader.canLoadClass(name: String): Boolean {
        return try {
            loadClass(name.replace("/", "."))
            true
        } catch(e: ClassNotFoundException) {
            false
        }
    }

    private fun getSuperClasses(name: String): Collection<String> {
        val supers = hashSetOf<String>()
        var superName: String = name

        while(group.findClass(superName) != null) {
            supers.add(superName)
            superName = group.findClass(superName)!!.name
        }

        var superClass: Class<*>? = Class.forName(superName.replace("/", "."))
        while(superClass != null) {
            supers.add(superClass.canonicalName.replace(".", "/"))
            superClass = superClass.superclass
        }

        return supers
    }
}