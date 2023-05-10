import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class21 {
	final int field110;
	final String field108;
	final Map field109;

	class21(HttpURLConnection var1) throws IOException {
		this.field110 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field109 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field110 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field108 = var2.toString();
	}

	class21(String var1) {
		this.field110 = 400;
		this.field109 = null;
		this.field108 = "";
	}

	public int method297() {
		return this.field110;
	}

	public Map method298() {
		return this.field109;
	}

	public String method299() {
		return this.field108;
	}

	static int method306(int var0, int var1) {
		long var3 = (long)(var1 + (var0 << 16));
		return class345.field973 != null && class345.field973.field4745 == var3 ? class345.field4253.field4989 * 99 / (class345.field4253.field4991.length - class345.field973.field4218) + 1 : 0;
	}

	public static int method305(int var0) {
		class134 var3 = (class134)class204.field2295.method5461((long)var0);
		class134 var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			var3 = class212.method4147(class204.field2291, class204.field2292, var0, false);
			if (null != var3) {
				class204.field2295.method5463(var3, (long)var0);
			}

			var2 = var3;
		}

		if (null == var2) {
			return 2;
		} else {
			return var2.method3093() ? 0 : 1;
		}
	}
}
