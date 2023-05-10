import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class class411 extends class408 {
	int field4595;

	class411() {
	}

	int method7693(class411 var1) {
		return this.field4595 - var1.field4595;
	}

	public int method7595(class408 var1) {
		return this.method7693((class411)var1);
	}

	public int compareTo(Object var1) {
		return this.method7693((class411)var1);
	}

	public static void method7690(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class32.field176.startsWith("win") && !var2) {
				class32.method1229(var0, 0);
			} else if (class32.field176.startsWith("mac")) {
				class210.method4134(var0, 1, "openjs");
			} else {
				class210.method4134(var0, 2, "openjs");
			}
		} else {
			class210.method4134(var0, 3, "openjs");
		}

	}
}
