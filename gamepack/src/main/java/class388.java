import java.io.DataInputStream;
import java.net.URL;

public class class388 {
	public static void method7339(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = class211.method4138(var1);
			}

			if (var0 != null) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (class516.field1322 == null) {
				return;
			}

			URL var4 = new URL(class516.field1322.getCodeBase(), "clienterror.ws?cv=" + class516.field5155 + "&cs=" + class516.field4732 + "&u=" + class516.field5159 + "&v1=" + class35.field1817 + "&v2=" + class516.field1818 + "&ct=" + class516.field5157 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
		}

	}
}
