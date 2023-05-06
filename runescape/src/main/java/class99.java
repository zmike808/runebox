import java.net.MalformedURLException;
import java.net.URL;

public class class99 implements class357 {
	static final class99 field1304;
	static final class99 field1306;
	static final class99 field1307;
	static final class99 field1308;
	static final class99 field1309;
	final int field1311;

	static {
		field1307 = new class99(0);
		field1306 = new class99(1);
		field1304 = new class99(2);
		field1309 = new class99(3);
		field1308 = new class99(4);
	}

	class99(int var1) {
		this.field1311 = var1;
	}

	public int method6674() {
		return this.field1311;
	}

	static boolean method2597(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var3) {
				return false;
			}
		}
	}

	static class99[] method2822() {
		return new class99[]{field1308, field1307, field1306, field1304, field1309};
	}
}
