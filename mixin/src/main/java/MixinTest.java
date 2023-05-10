import io.runebox.mixin.MixinManager;
import io.runebox.mixin.mixinstranslator.MixinsTranslator;
import io.runebox.mixin.utils.loader.InjectionClassLoader;
import io.runebox.mixin.utils.tree.BasicClassProvider;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class MixinTest {

    public static void main(String[] args) {
        System.out.println("Testing Mixins");

        MixinManager manager = new MixinManager(new BasicClassProvider());
        manager.addTransformerPreprocessor(new MixinsTranslator());
        manager.addTransformer("MixinMessagePrinter");
        try (InjectionClassLoader injectionClassLoader = new InjectionClassLoader(manager, MixinTest.class.getProtectionDomain().getCodeSource().getLocation())) {
            try {
                injectionClassLoader.executeMain("TestMain", "main", args);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
