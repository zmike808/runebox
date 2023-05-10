public class class504 {
	public static byte[][] field2113;
	public static int[] field1302;
	public static int[] field1644;
	public static int[] field4525;
	public static int[] field5101;
	public static int[] field94;
	static int field5099;
	static int field5100;
	static int field5102;

	public static class502[] method1974(class344 var0, int var1, int var2) {
		byte[] var5 = var0.method6468(var1, var2);
		boolean var4;
		if (null == var5) {
			var4 = false;
		} else {
			class486.method8595(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			class502[] var6 = new class502[field5102];

			for (int var7 = 0; var7 < field5102; ++var7) {
				class502 var8 = var6[var7] = new class502();
				var8.field5079 = field5100;
				var8.field5085 = field5099;
				var8.field5086 = field5101[var7];
				var8.field5084 = field94[var7];
				var8.field5081 = field1302[var7];
				var8.field5082 = field1644[var7];
				var8.field5080 = field4525;
				var8.field5083 = field2113[var7];
			}

			method7448();
			return var6;
		}
	}

	public static class503 method8588(class344 var0, int var1, int var2) {
		byte[] var5 = var0.method6468(var1, var2);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			class486.method8595(var5);
			var4 = true;
		}

		return !var4 ? null : method3503();
	}

	public static class502[] method6113(class344 var0, String var1, String var2) {
		if (!var0.method6466(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method6464(var1);
			int var5 = var0.method6450(var4, var2);
			return method1974(var0, var4, var5);
		}
	}

	static class503 method3503() {
		class503 var1 = new class503();
		var1.field5092 = field5100;
		var1.field5087 = field5099;
		var1.field5090 = field5101[0];
		var1.field5091 = field94[0];
		var1.field5088 = field1302[0];
		var1.field5093 = field1644[0];
		int var2 = var1.field5093 * var1.field5088;
		byte[] var3 = field2113[0];
		var1.field5089 = new int[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var1.field5089[var4] = field4525[var3[var4] & 255];
		}

		method7448();
		return var1;
	}

	public static void method7448() {
		field5101 = null;
		field94 = null;
		field1302 = null;
		field1644 = null;
		field4525 = null;
		field2113 = (byte[][])null;
	}
}
