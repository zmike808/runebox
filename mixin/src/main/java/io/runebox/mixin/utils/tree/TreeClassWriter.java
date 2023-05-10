package io.runebox.mixin.utils.tree;

import org.objectweb.asm.ClassWriter;

import java.lang.reflect.Modifier;

import static io.runebox.mixin.utils.ASMUtils.slash;
import static io.runebox.mixin.utils.Types.IN_Object;

/**
 * A class writer implementation using the {@link ClassTree} for stack frame calculation.
 */
public class TreeClassWriter extends ClassWriter {

    private final ClassTree classTree;
    private final IClassProvider classProvider;

    public TreeClassWriter(final ClassTree classTree, final IClassProvider classProvider) {
        super(ClassWriter.COMPUTE_FRAMES);

        this.classTree = classTree;
        this.classProvider = classProvider;
    }

    @Override
    protected String getCommonSuperClass(String type1, String type2) {
        if (type1.equals(IN_Object) || type2.equals(IN_Object)) return IN_Object;

        ClassTree.TreePart class1 = this.classTree.getTreePart(this.classProvider, type1);
        if (class1 == null) throw new TypeNotPresentException(type1, new NullPointerException());
        ClassTree.TreePart class2 = this.classTree.getTreePart(this.classProvider, type2);
        if (class2 == null) throw new TypeNotPresentException(type2, new NullPointerException());

        if (class2.getSuperClasses().contains(class1.getName())) {
            return type1;
        } else if (class1.getSuperClasses().contains(class2.getName())) {
            return type2;
        } else if (!Modifier.isInterface(class1.getModifiers()) && !Modifier.isInterface(class2.getModifiers())) {
            do {
                class1 = class1.parseSuperClass(this.classProvider);
                if (class1 == null) return IN_Object;
            } while (!class2.getSuperClasses().contains(class1.getName()));

            return slash(class1.getName());
        } else {
            return IN_Object;
        }
    }

}
