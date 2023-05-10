public class class486 {
	public static void method6634(String[] var0, short[] var1) {
		class310.method5788(var0, var1, 0, var0.length - 1);
	}

	public static void method3149(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (null == var7 || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method3149(var0, var1, var2, var6 - 1);
			method3149(var0, var1, var6 + 1, var3);
		}

	}

	public static void method8595(byte[] var0) {
		class489 var2 = new class489(var0);
		var2.field4989 = var0.length - 2;
		class504.field5102 = var2.method8660();
		class504.field5101 = new int[class504.field5102];
		class504.field94 = new int[class504.field5102];
		class504.field1302 = new int[class504.field5102];
		class504.field1644 = new int[class504.field5102];
		class504.field2113 = new byte[class504.field5102][];
		var2.field4989 = var0.length - 7 - class504.field5102 * 8;
		class504.field5100 = var2.method8660();
		class504.field5099 = var2.method8660();
		int var3 = (var2.method8658() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < class504.field5102; ++var4) {
			class504.field5101[var4] = var2.method8660();
		}

		for (var4 = 0; var4 < class504.field5102; ++var4) {
			class504.field94[var4] = var2.method8660();
		}

		for (var4 = 0; var4 < class504.field5102; ++var4) {
			class504.field1302[var4] = var2.method8660();
		}

		for (var4 = 0; var4 < class504.field5102; ++var4) {
			class504.field1644[var4] = var2.method8660();
		}

		var2.field4989 = var0.length - 7 - class504.field5102 * 8 - 3 * (var3 - 1);
		class504.field4525 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			class504.field4525[var4] = var2.method8662();
			if (class504.field4525[var4] == 0) {
				class504.field4525[var4] = 1;
			}
		}

		var2.field4989 = 0;

		for (var4 = 0; var4 < class504.field5102; ++var4) {
			int var5 = class504.field1302[var4];
			int var6 = class504.field1644[var4];
			int var7 = var6 * var5;
			byte[] var8 = new byte[var7];
			class504.field2113[var4] = var8;
			int var9 = var2.method8658();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method8659();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var11 * var5 + var10] = var2.method8659();
					}
				}
			}
		}

	}
}
