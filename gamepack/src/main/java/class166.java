public class class166 extends class178 {
	String field1797;
	// $FF: synthetic field
	final class167 this$0;

	class166(class167 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1797 = var3;
	}

	public int method3477() {
		return 1;
	}

	public String method3486() {
		return this.field1797;
	}

	public static class317 method3349(int var0) {
		int var2 = var0 >> 16;
		int var3 = var0 & 65535;
		if (Client.field2057[var2] == null || Client.field2057[var2][var3] == null) {
			boolean var4 = class45.method882(var2);
			if (!var4) {
				return null;
			}
		}

		return Client.field2057[var2][var3];
	}

	static final void method3350(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class223 var8, class209 var9) {
		class201 var11 = class145.method3177(var4);
		int var12 = var7 >= 0 ? var7 : var11.field2167;
		int var13;
		int var14;
		if (var5 != 1 && var5 != 3) {
			var13 = var11.field2172;
			var14 = var11.field2173;
		} else {
			var13 = var11.field2173;
			var14 = var11.field2172;
		}

		int var15;
		int var16;
		if (var2 + var13 <= 104) {
			var15 = (var13 >> 1) + var2;
			var16 = (var13 + 1 >> 1) + var2;
		} else {
			var15 = var2;
			var16 = var2 + 1;
		}

		int var17;
		int var18;
		if (var3 + var14 <= 104) {
			var17 = (var14 >> 1) + var3;
			var18 = var3 + (var14 + 1 >> 1);
		} else {
			var17 = var3;
			var18 = var3 + 1;
		}

		int[][] var19 = class78.field1002[var1];
		int var20 = var19[var15][var17] + var19[var16][var17] + var19[var15][var18] + var19[var16][var18] >> 2;
		int var21 = (var2 << 7) + (var13 << 6);
		int var22 = (var14 << 6) + (var3 << 7);
		long var23 = class233.method4549(var2, var3, 2, 0 == var11.field2176, var4);
		int var25 = (var5 << 6) + var6;
		if (1 == var11.field2207) {
			var25 += 256;
		}

		Object var26;
		if (var6 == 22) {
			if (var12 == -1 && null == var11.field2198) {
				var26 = var11.method3858(22, var5, var19, var21, var20, var22);
			} else {
				var26 = new class76(var4, 22, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
			}

			var8.method4374(var0, var2, var3, var20, (class225)var26, var23, var25);
			if (var11.field2178 == 1) {
				var9.method4096(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var12 == -1 && null == var11.field2198) {
					var26 = var11.method3858(var6, var5, var19, var21, var20, var22);
				} else {
					var26 = new class76(var4, var6, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
				}

				var8.method4533(var0, var2, var3, var20, 1, 1, (class225)var26, 0, var23, var25);
				if (var11.field2178 != 0) {
					var9.method4102(var2, var3, var13, var14, var11.field2175);
				}

			} else if (var6 == 0) {
				if (var12 == -1 && var11.field2198 == null) {
					var26 = var11.method3858(0, var5, var19, var21, var20, var22);
				} else {
					var26 = new class76(var4, 0, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
				}

				var8.method4376(var0, var2, var3, var20, (class225)var26, (class225)null, class78.field996[var5], 0, var23, var25);
				if (var11.field2178 != 0) {
					var9.method4093(var2, var3, var6, var5, var11.field2175);
				}

			} else if (var6 == 1) {
				if (var12 == -1 && var11.field2198 == null) {
					var26 = var11.method3858(1, var5, var19, var21, var20, var22);
				} else {
					var26 = new class76(var4, 1, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
				}

				var8.method4376(var0, var2, var3, var20, (class225)var26, (class225)null, class78.field1007[var5], 0, var23, var25);
				if (0 != var11.field2178) {
					var9.method4093(var2, var3, var6, var5, var11.field2175);
				}

			} else {
				int var32;
				if (var6 == 2) {
					var32 = var5 + 1 & 3;
					Object var28;
					Object var34;
					if (var12 == -1 && var11.field2198 == null) {
						var34 = var11.method3858(2, var5 + 4, var19, var21, var20, var22);
						var28 = var11.method3858(2, var32, var19, var21, var20, var22);
					} else {
						var34 = new class76(var4, 2, var5 + 4, var1, var2, var3, var12, var11.field2206, (class225)null);
						var28 = new class76(var4, 2, var32, var1, var2, var3, var12, var11.field2206, (class225)null);
					}

					var8.method4376(var0, var2, var3, var20, (class225)var34, (class225)var28, class78.field996[var5], class78.field996[var32], var23, var25);
					if (var11.field2178 != 0) {
						var9.method4093(var2, var3, var6, var5, var11.field2175);
					}

				} else if (var6 == 3) {
					if (var12 == -1 && null == var11.field2198) {
						var26 = var11.method3858(3, var5, var19, var21, var20, var22);
					} else {
						var26 = new class76(var4, 3, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
					}

					var8.method4376(var0, var2, var3, var20, (class225)var26, (class225)null, class78.field1007[var5], 0, var23, var25);
					if (var11.field2178 != 0) {
						var9.method4093(var2, var3, var6, var5, var11.field2175);
					}

				} else if (var6 == 9) {
					if (var12 == -1 && var11.field2198 == null) {
						var26 = var11.method3858(var6, var5, var19, var21, var20, var22);
					} else {
						var26 = new class76(var4, var6, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
					}

					var8.method4533(var0, var2, var3, var20, 1, 1, (class225)var26, 0, var23, var25);
					if (var11.field2178 != 0) {
						var9.method4102(var2, var3, var13, var14, var11.field2175);
					}

				} else if (var6 == 4) {
					if (var12 == -1 && null == var11.field2198) {
						var26 = var11.method3858(4, var5, var19, var21, var20, var22);
					} else {
						var26 = new class76(var4, 4, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
					}

					var8.method4377(var0, var2, var3, var20, (class225)var26, (class225)null, class78.field996[var5], 0, 0, 0, var23, var25);
				} else {
					long var27;
					Object var29;
					if (var6 == 5) {
						var32 = 16;
						var27 = var8.method4394(var0, var2, var3);
						if (var27 != 0L) {
							var32 = class145.method3177(class233.method2194(var27)).field2181;
						}

						if (var12 == -1 && var11.field2198 == null) {
							var29 = var11.method3858(4, var5, var19, var21, var20, var22);
						} else {
							var29 = new class76(var4, 4, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
						}

						var8.method4377(var0, var2, var3, var20, (class225)var29, (class225)null, class78.field996[var5], 0, class78.field1008[var5] * var32, class78.field1004[var5] * var32, var23, var25);
					} else if (var6 == 6) {
						var32 = 8;
						var27 = var8.method4394(var0, var2, var3);
						if (0L != var27) {
							var32 = class145.method3177(class233.method2194(var27)).field2181 / 2;
						}

						if (var12 == -1 && var11.field2198 == null) {
							var29 = var11.method3858(4, var5 + 4, var19, var21, var20, var22);
						} else {
							var29 = new class76(var4, 4, var5 + 4, var1, var2, var3, var12, var11.field2206, (class225)null);
						}

						var8.method4377(var0, var2, var3, var20, (class225)var29, (class225)null, 256, var5, class78.field1010[var5] * var32, var32 * class78.field1011[var5], var23, var25);
					} else if (var6 == 7) {
						int var33 = var5 + 2 & 3;
						if (var12 == -1 && var11.field2198 == null) {
							var26 = var11.method3858(4, var33 + 4, var19, var21, var20, var22);
						} else {
							var26 = new class76(var4, 4, var33 + 4, var1, var2, var3, var12, var11.field2206, (class225)null);
						}

						var8.method4377(var0, var2, var3, var20, (class225)var26, (class225)null, 256, var33, 0, 0, var23, var25);
					} else if (var6 == 8) {
						var32 = 8;
						var27 = var8.method4394(var0, var2, var3);
						if (0L != var27) {
							var32 = class145.method3177(class233.method2194(var27)).field2181 / 2;
						}

						int var31 = var5 + 2 & 3;
						Object var30;
						if (var12 == -1 && var11.field2198 == null) {
							var29 = var11.method3858(4, var5 + 4, var19, var21, var20, var22);
							var30 = var11.method3858(4, var31 + 4, var19, var21, var20, var22);
						} else {
							var29 = new class76(var4, 4, var5 + 4, var1, var2, var3, var12, var11.field2206, (class225)null);
							var30 = new class76(var4, 4, var31 + 4, var1, var2, var3, var12, var11.field2206, (class225)null);
						}

						var8.method4377(var0, var2, var3, var20, (class225)var29, (class225)var30, 256, var5, var32 * class78.field1010[var5], var32 * class78.field1011[var5], var23, var25);
					}
				}
			}
		} else {
			if (var12 == -1 && var11.field2198 == null) {
				var26 = var11.method3858(10, var5, var19, var21, var20, var22);
			} else {
				var26 = new class76(var4, 10, var5, var1, var2, var3, var12, var11.field2206, (class225)null);
			}

			if (null != var26) {
				var8.method4533(var0, var2, var3, var20, var13, var14, (class225)var26, var6 == 11 ? 256 : 0, var23, var25);
			}

			if (0 != var11.field2178) {
				var9.method4102(var2, var3, var13, var14, var11.field2175);
			}

		}
	}
}
