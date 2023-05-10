import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class class211 implements class357 {
	public static final class211 field2388;
	public static final class211 field2389;
	public static final class211 field2390;
	public static final class211 field2391;
	public byte field2392;

	static {
		field2391 = new class211((byte)-1);
		field2389 = new class211((byte)0);
		field2390 = new class211((byte)1);
		field2388 = new class211((byte)2);
	}

	class211(byte var1) {
		this.field2392 = var1;
	}

	public int method6674() {
		return this.field2392;
	}

	static String method4138(Throwable var0) throws IOException {
		String var2;
		if (var0 instanceof class516) {
			class516 var3 = (class516)var0;
			var2 = var3.field5158 + " | ";
			var0 = var3.field5156;
		} else {
			var2 = "";
		}

		StringWriter var13 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var13);
		var0.printStackTrace(var4);
		var4.close();
		String var5 = var13.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();

		while (true) {
			while (true) {
				String var8 = var6.readLine();
				if (null == var8) {
					var2 = var2 + "| " + var7;
					return var2;
				}

				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 + 1);
				if (var9 >= 0 && var10 >= 0) {
					String var11 = var8.substring(var9 + 1, var10);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var2 = var2 + var11 + ' ';
						continue;
					}

					var8 = var8.substring(0, var9);
				}

				var8 = var8.trim();
				var8 = var8.substring(var8.lastIndexOf(32) + 1);
				var8 = var8.substring(var8.lastIndexOf(9) + 1);
				var2 = var2 + var8 + ' ';
			}
		}
	}
}
