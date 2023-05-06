public class class373 {
	static final void method6937(class489 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var9;
		if (var8) {
			class78.field1006[var1][var2][var3] = 0;

			while (true) {
				var9 = var0.method8660();
				if (var9 == 0) {
					if (var1 == 0) {
						int[] var16 = class78.field1002[0][var2];
						int var13 = var4 + 932731;
						int var14 = var5 + 556238;
						int var15 = class78.method2632(var13 + 45365, var14 + 91923, 4) - 128 + (class78.method2632(var13 + 10294, var14 + 37821, 2) - 128 >> 1) + (class78.method2632(var13, var14, 1) - 128 >> 2);
						var15 = 35 + (int)((double)var15 * 0.3D);
						if (var15 < 10) {
							var15 = 10;
						} else if (var15 > 60) {
							var15 = 60;
						}

						var16[var3] = 8 * -var15;
					} else {
						class78.field1002[var1][var2][var3] = class78.field1002[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var9 == 1) {
					int var10 = var0.method8658();
					if (var10 == 1) {
						var10 = 0;
					}

					if (var1 == 0) {
						class78.field1002[0][var2][var3] = 8 * -var10;
					} else {
						class78.field1002[var1][var2][var3] = class78.field1002[var1 - 1][var2][var3] - var10 * 8;
					}
					break;
				}

				if (var9 <= 49) {
					class78.field998[var1][var2][var3] = (short)var0.method8855();
					class78.field1009[var1][var2][var3] = (byte)((var9 - 2) / 4);
					class78.field1000[var1][var2][var3] = (byte)(var6 + (var9 - 2) & 3);
				} else if (var9 <= 81) {
					class78.field1006[var1][var2][var3] = (byte)(var9 - 49);
				} else {
					class78.field1977[var1][var2][var3] = (short)(var9 - 81);
				}
			}
		} else {
			while (true) {
				var9 = var0.method8660();
				if (var9 == 0) {
					break;
				}

				if (var9 == 1) {
					var0.method8658();
					break;
				}

				if (var9 <= 49) {
					var0.method8855();
				}
			}
		}

	}
}
