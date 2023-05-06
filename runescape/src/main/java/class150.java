public class class150 extends class140 {
	int field1706;
	String field1705;
	// $FF: synthetic field
	final class143 this$0;

	class150(class143 var1) {
		this.this$0 = var1;
	}

	void method3152(class489 var1) {
		this.field1706 = var1.method8664();
		this.field1705 = var1.method8669();
	}

	void method3151(class151 var1) {
		var1.method3225(this.field1706, this.field1705);
	}

	public static boolean method3204(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	static final void method3205(int var0, int var1, int var2, int var3, int var4) {
		long var6 = Client.field180.method4394(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var14;
		if (var6 != 0L) {
			var8 = Client.field180.method4532(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			if (class174.method3458(var6)) {
				var11 = var4;
			}

			int[] var12 = Client.field1396.field5089;
			var13 = (103 - var2) * 2048 + var1 * 4 + 24624;
			var14 = class233.method2194(var6);
			class201 var15 = class145.method3177(var14);
			if (-1 != var15.field2197) {
				class502 var16 = Client.field3826[var15.field2197];
				if (var16 != null) {
					int var17 = (var15.field2172 * 4 - var16.field5081) / 2;
					int var18 = (var15.field2173 * 4 - var16.field5082) / 2;
					var16.method9072(var17 + 48 + var1 * 4, var18 + (104 - var2 - var15.field2173) * 4 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[512 + var13 + 3] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[1536 + var13 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[1 + var13 + 1536] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[512 + var13 + 3] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[1 + var13 + 1536] = var11;
						var12[2 + var13 + 1536] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = Client.field180.method4396(var0, var1, var2);
		if (var6 != 0L) {
			var8 = Client.field180.method4532(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class233.method2194(var6);
			class201 var21 = class145.method3177(var11);
			int var25;
			if (-1 != var21.field2197) {
				class502 var23 = Client.field3826[var21.field2197];
				if (var23 != null) {
					var14 = (var21.field2172 * 4 - var23.field5081) / 2;
					var25 = (var21.field2173 * 4 - var23.field5082) / 2;
					var23.method9072(48 + var1 * 4 + var14, var25 + 4 * (104 - var2 - var21.field2173) + 48);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (class174.method3458(var6)) {
					var13 = 15597568;
				}

				int[] var24 = Client.field1396.field5089;
				var25 = 24624 + var1 * 4 + (103 - var2) * 2048;
				if (var9 != 0 && var9 != 2) {
					var24[var25] = var13;
					var24[1 + var25 + 512] = var13;
					var24[2 + var25 + 1024] = var13;
					var24[var25 + 1536 + 3] = var13;
				} else {
					var24[var25 + 1536] = var13;
					var24[1 + var25 + 1024] = var13;
					var24[2 + var25 + 512] = var13;
					var24[var25 + 3] = var13;
				}
			}
		}

		var6 = Client.field180.method4397(var0, var1, var2);
		if (0L != var6) {
			var8 = class233.method2194(var6);
			class201 var19 = class145.method3177(var8);
			if (var19.field2197 != -1) {
				class502 var20 = Client.field3826[var19.field2197];
				if (null != var20) {
					var11 = (var19.field2172 * 4 - var20.field5081) / 2;
					int var22 = (var19.field2173 * 4 - var20.field5082) / 2;
					var20.method9072(var1 * 4 + 48 + var11, 48 + (104 - var2 - var19.field2173) * 4 + var22);
				}
			}
		}

	}
}
