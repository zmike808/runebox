public class class82 {
	static final void method2192(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.field493 && var0 != Client.field231) {
				return;
			}

			long var9 = 0L;
			boolean var11 = true;
			boolean var12 = false;
			boolean var13 = false;
			if (var1 == 0) {
				var9 = Client.field180.method4394(var0, var2, var3);
			}

			if (var1 == 1) {
				var9 = Client.field180.method4395(var0, var2, var3);
			}

			if (var1 == 2) {
				var9 = Client.field180.method4396(var0, var2, var3);
			}

			if (var1 == 3) {
				var9 = Client.field180.method4397(var0, var2, var3);
			}

			int var14;
			if (var9 != 0L) {
				var14 = Client.field180.method4532(var0, var2, var3, var9);
				int var16 = class233.method2194(var9);
				int var17 = var14 & 31;
				int var18 = var14 >> 6 & 3;
				class201 var15;
				if (var1 == 0) {
					Client.field180.method4468(var0, var2, var3);
					var15 = class145.method3177(var16);
					if (0 != var15.field2178) {
						Client.field561[var0].method4098(var2, var3, var17, var18, var15.field2175);
					}
				}

				if (var1 == 1) {
					Client.field180.method4467(var0, var2, var3);
				}

				if (var1 == 2) {
					Client.field180.method4387(var0, var2, var3);
					var15 = class145.method3177(var16);
					if (var15.field2172 + var2 > 103 || var15.field2172 + var3 > 103 || var2 + var15.field2173 > 103 || var15.field2173 + var3 > 103) {
						return;
					}

					if (var15.field2178 != 0) {
						Client.field561[var0].method4117(var2, var3, var15.field2172, var15.field2173, var18, var15.field2175);
					}
				}

				if (var1 == 3) {
					Client.field180.method4384(var0, var2, var3);
					var15 = class145.method3177(var16);
					if (var15.field2178 == 1) {
						Client.field561[var0].method4100(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && 2 == (class78.field1006[1][var2][var3] & 2)) {
					var14 = var0 + 1;
				}

				class166.method3350(var0, var14, var2, var3, var4, var5, var6, var7, Client.field180, Client.field561[var0]);
			}
		}

	}
}
