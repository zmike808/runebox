import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class109 extends class108 {
	public static class16 field84;
	final boolean field1402;

	public class109(boolean var1, int var2) {
		super(var2);
		this.field1402 = var1;
	}

	void method2756(class110 var1) throws IOException {
		URLConnection var3 = null;

		HttpURLConnection var4;
		try {
			String var9 = var1.field1409.getProtocol();
			if (var9.equals("http")) {
				var3 = this.method2782(var1);
			} else {
				if (!var9.equals("https")) {
					var1.field1406 = class110.field1407;
					if (null != var3 && var3 instanceof HttpURLConnection) {
						HttpURLConnection var5 = (HttpURLConnection)var3;
						var5.disconnect();
					}

					return;
				}

				var3 = this.method2783(var1);
			}

			this.method2776(var3, var1);
		} catch (IOException var8) {
			var1.field1406 = class110.field1407;
			if (null != var3 && var3 instanceof HttpURLConnection) {
				var4 = (HttpURLConnection)var3;
				var4.disconnect();
			}

			return;
		}

		if (null != var3 && var3 instanceof HttpURLConnection) {
			var4 = (HttpURLConnection)var3;
			var4.disconnect();
		}

	}

	URLConnection method2782(class110 var1) throws IOException {
		URLConnection var3 = var1.field1409.openConnection();
		this.method2773(var3);
		return var3;
	}

	URLConnection method2783(class110 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field1409.openConnection();
		if (!this.field1402) {
			if (field84 == null) {
				field84 = new class16();
			}

			class16 var5 = field84;
			var3.setSSLSocketFactory(var5);
		}

		this.method2773(var3);
		return var3;
	}
}
