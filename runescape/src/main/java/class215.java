public final class class215 {
	int field2457;
	int field2458;
	int field2459;
	int field2462;
	public class225 field2460;
	public long field2461;

	class215() {
	}

	static final int method4244(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static void method4243(class88 var0, int var1, int var2) {
		if (var0.field1202 == var1 && var1 != -1) {
			int var4 = class81.method2189(var1, (byte)124).field2315;
			if (var4 == 1) {
				var0.field1182 = 0;
				var0.field1183 = 0;
				var0.field1184 = var2;
				var0.field1185 = 0;
			}

			if (var4 == 2) {
				var0.field1185 = 0;
			}
		} else if (var1 == -1 || var0.field1202 == -1 || class81.method2189(var1, (byte)20).field2294 >= class81.method2189(var0.field1202, (byte)54).field2294) {
			var0.field1202 = var1;
			var0.field1182 = 0;
			var0.field1183 = 0;
			var0.field1184 = var2;
			var0.field1185 = 0;
			var0.field1211 = var0.field1206;
		}

	}
}
