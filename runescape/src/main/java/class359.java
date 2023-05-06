import java.io.IOException;
import java.util.Locale;

@class361
@class305
public class class359 implements class357 {
	public static final class359 field4317;
	public static final class359 field4319;
	public static final class359 field4322;
	static final class359 field4320;
	static final class359 field4321;
	static final class359 field4323;
	static final class359 field4328;
	static final class359[] field4331;
	final int field4326;
	final String field4325;
	final String field4330;

	static {
		field4317 = new class359("EN", "en", "English", class360.field4352, 0, "GB");
		field4328 = new class359("DE", "de", "German", class360.field4352, 1, "DE");
		field4319 = new class359("FR", "fr", "French", class360.field4352, 2, "FR");
		field4320 = new class359("PT", "pt", "Portuguese", class360.field4352, 3, "BR");
		field4321 = new class359("NL", "nl", "Dutch", class360.field4344, 4, "NL");
		field4322 = new class359("ES", "es", "Spanish", class360.field4344, 5, "ES");
		field4323 = new class359("ES_MX", "es-mx", "Spanish (Latin American)", class360.field4352, 6, "MX");
		class359[] var0 = method6689();
		field4331 = new class359[var0.length];
		class359[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class359 var3 = var1[var2];
			if (field4331[var3.field4326] != null) {
				throw new IllegalStateException();
			}

			field4331[var3.field4326] = var3;
		}

	}

	class359(String var1, String var2, String var3, class360 var4, int var5, String var6) {
		this.field4330 = var1;
		this.field4325 = var2;
		this.field4326 = var5;
		if (null != var6) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	String method6679() {
		return this.field4325;
	}

	public int method6674() {
		return this.field4326;
	}

	public String toString() {
		return this.method6679().toLowerCase(Locale.ENGLISH);
	}

	static class359[] method6689() {
		return new class359[]{field4319, field4321, field4328, field4323, field4320, field4317, field4322};
	}

	public static class359 method6677(int var0, byte var1) {
		if (var0 >= 0) {
			if (var0 < field4331.length) {
				return field4331[var0];
			}

			if (var1 != -1) {
				throw new IllegalStateException();
			}
		}

		return null;
	}

	static Object method6690(class479 var0) {
		if (null == var0) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field4950) {
			case 1:
				return class67.field843[--class67.field836];
			case 2:
				return class67.field842[--class67.field1015];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	static final void method6682(boolean var0) {
		Client.method6316();
		++Client.field753.field1391;
		if (Client.field753.field1391 >= 50 || var0) {
			Client.field753.field1391 = 0;
			if (!Client.field553 && Client.field753.method2740() != null) {
				class289 var2 = class331.method6337(class287.field3189, Client.field753.field1385);
				Client.field753.method2735(var2);

				try {
					Client.field753.method2751();
				} catch (IOException var4) {
					Client.field553 = true;
				}
			}

		}
	}
}
