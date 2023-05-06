package io.runebox.asm.tree

import org.objectweb.asm.tree.ClassNode
import java.util.LinkedList
import java.util.Queue
import java.util.Stack

class ClassHierarchy {

    companion object {
        private const val JAVA_LANG_OBJECT = "java/lang/Object"
        private val EMPTY = listOf<String>()
    }

    private val entries = hashMapOf<String, ClassNode>()
    private val parentClass = hashMapOf<String, String>()
    private val parentInterfaces = hashMapOf<String, MutableList<String>>()
    private val subtypes = hashMapOf<String, HashSet<String>>()
    val requestedClasses = hashSetOf<String>()

    fun resolveStaticFieldOwner(className: String, fieldName: String, fieldDesc: String): String? {
        var c: ClassNode? = getClassNode(className) ?: return null
        if(c != null) {
            if(c.findField(fieldName, fieldDesc) != null) {
                return className
            }
        }

        val stack = Stack<String>()
        stack.push(className)
        while(stack.isNotEmpty()) {
            val current = stack.pop()
            c = getClassNode(current)
            if(c != null) {
                if(c.findField(fieldName, fieldDesc) != null) {
                    return current
                } else {
                    if(c.interfaces != null) {
                        stack.addAll(c.interfaces)
                    }
                }
            } else {
                /*
                 * If c is not a registered class, just forget about it for simplicity
                 */
            }
        }
        c = getClassNode(className)
        return if(c?.superName != null) resolveStaticFieldOwner(c.superName, fieldName, fieldDesc)
        else null
    }

    fun getClassNode(className: String): ClassNode? {
        val c = entries[className]
        if(c == null) {
            requestedClasses.add(className)
        }
        return c
    }

    val classCount get() = entries.size
    val classes get() = entries.keys

    fun isSamePackage(typeName1: String, typeName2: String): Boolean {
        val c1 = entries[typeName1]
        val c2 = entries[typeName2]

        if(c1 == null) requestedClasses.add(typeName1)
        if(c2 == null) requestedClasses.add(typeName2)

        return (c1 != null) && (c2 != null)
    }

    fun getSuperClass(className: String): String? {
        return if(isArrayType(className)) JAVA_LANG_OBJECT
        else {
            if(!parentClass.containsKey(className)) {
                requestedClasses.add(className)
            }
            parentClass[className]
        }
    }

    fun getSuperInterfaces(className: String): Collection<String>? {
        return if(isArrayType(className)) EMPTY
        else if(parentInterfaces.containsKey(className)) {
            parentInterfaces[className]
        } else {
            if(!entries.containsKey(className)) requestedClasses.add(className)
            EMPTY
        }
    }

    fun listAllSuperTypes(className: String): Collection<String> {
        if(!entries.containsKey(className)) requestedClasses.add(className)

        val classes = hashSetOf<String>()
        val stack = LinkedList<String>() as Queue<String>
        stack.add(className)
        while(stack.isNotEmpty()) {
            val name = stack.poll()
            val superClass = getSuperClass(name)
            if(superClass != null && !classes.contains(superClass)) {
                classes.add(superClass)
                stack.add(superClass)
            }
            for(s in getSuperInterfaces(name)!!) {
                if(s != null && !classes.contains(s)) {
                    classes.add(s)
                    stack.add(s)
                }
            }
        }
        return classes
    }

    fun isArrayType(typeName: String) = typeName.endsWith("[]")

    fun getSubtypes(typeName: String): Collection<String> {
        if(!entries.containsKey(typeName)) requestedClasses.add(typeName)
        return if(subtypes.containsKey(typeName)) {
            subtypes[typeName]!!
        } else {
            EMPTY
        }
    }

    fun getAllSubtypes(typeNames: Iterable<String>): Collection<String> {
        val stack = Stack<String>()
        typeNames.forEach { stack.push(it) }
        val visited = hashSetOf<String>()
        while(stack.isNotEmpty()) {
            val t = stack.pop()
            if(visited.contains(t)) continue
            visited.add(t)
            stack.addAll(getSubtypes(t))
        }
        return visited
    }

    fun registerClass(cls: ClassNode) {
        entries[cls.name] = cls
        registerSuperClass(cls.name, cls.superName)
        registerSubtype(cls.name, cls.superName)
        registerInterfaces(cls.name, cls.interfaces)
        cls.interfaces.forEach { interfaceName ->
            registerSubtype(cls.name, interfaceName)
        }
    }

    fun registerSuperClass(current: String, parent: String) {
        parentClass[current] = parent
    }

    fun registerSubtype(typeName: String, parentTypeName: String) {
        if(subtypes.containsKey(parentTypeName)) {
            subtypes[parentTypeName]!!.add(typeName)
        } else {
            val types = hashSetOf<String>()
            types.add(typeName)
            subtypes[parentTypeName] = types
        }
    }

    fun registerInterfaces(current: String, interfaces: MutableList<String>) {
        parentInterfaces[current] = interfaces
    }
}