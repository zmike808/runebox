import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class class265 {
	static long method5285(byte var0) {
		try {
			URL var1 = new URL(class181.method3515("services", false) + "m=accountappeal/login.ws");
			URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			InputStream var4 = var2.getInputStream();
			class489 var5 = new class489(new byte[1000]);

			do {
				int var6 = var4.read(var5.field4991, var5.field4989, 1000 - var5.field4989);
				if (var6 == -1) {
					if (var0 >= -1) {
						throw new IllegalStateException();
					} else {
						var5.field4989 = 0;
						long var9 = var5.method8681();
						return var9;
					}
				}

				var5.field4989 += var6;
			} while(var5.field4989 < 1000);

			if (var0 >= -1) {
				throw new IllegalStateException();
			} else {
				return 0L;
			}
		} catch (Exception var8) {
			return 0L;
		}
	}
}
