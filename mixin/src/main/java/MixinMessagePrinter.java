import io.runebox.mixin.InjectionCallback;
import io.runebox.mixin.annotation.Mixin;
import io.runebox.mixin.annotation.Overwrite;
import io.runebox.mixin.annotation.injection.At;
import io.runebox.mixin.annotation.injection.Inject;

@Mixin(MessagePrinter.class)
public class MixinMessagePrinter {

    @Inject(method = "printMessage(Ljava/lang/String;)V", at = @At("HEAD"), cancellable = true)
    public static void inject$printMessage(String message, InjectionCallback callback) {
        if(message.contains("Hello")) {
            callback.setCancelled(true);
            System.out.println("Cancelled");
        }
        System.out.println("Boom! Injected!");
    }
}
