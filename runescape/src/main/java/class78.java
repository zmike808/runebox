public final class class78 {
	public static class344 field2092;
	public static class344 field2273;
	static byte[][][] field1000;
	static byte[][][] field1006;
	static byte[][][] field1009;
	static byte[][][] field995;
	static int field1012;
	static int field1013;
	static int field999;
	static int[] field1003;
	static int[] field1417;
	static int[] field177;
	static int[] field1847;
	static int[] field3093;
	static int[][] field997;
	static int[][][] field1002;
	static int[][][] field1783;
	static short[][][] field1977;
	static short[][][] field998;
	static final int[] field1004;
	static final int[] field1007;
	static final int[] field1008;
	static final int[] field1010;
	static final int[] field1011;
	static final int[] field996;

	static {
		field1002 = new int[4][105][105];
		field1006 = new byte[4][104][104];
		field999 = 99;
		field996 = new int[]{1, 2, 4, 8};
		field1007 = new int[]{16, 32, 64, 128};
		field1008 = new int[]{1, 0, -1, 0};
		field1004 = new int[]{0, -1, 0, 1};
		field1010 = new int[]{1, -1, -1, 1};
		field1011 = new int[]{-1, -1, 1, 1};
		field1012 = (int)(Math.random() * 17.0D) - 8;
		field1013 = (int)(Math.random() * 33.0D) - 16;
	}

	static void method3134() {
		field999 = 99;
		field1977 = new short[4][104][104];
		field998 = new short[4][104][104];
		field1009 = new byte[4][104][104];
		field1000 = new byte[4][104][104];
		field1783 = new int[4][105][105];
		field995 = new byte[4][105][105];
		field997 = new int[105][105];
		field1847 = new int[104];
		field1003 = new int[104];
		field3093 = new int[104];
		field1417 = new int[104];
		field177 = new int[104];
	}

	static void method4547() {
		field1977 = (short[][][])null;
		field998 = (short[][][])null;
		field1009 = (byte[][][])null;
		field1000 = (byte[][][])null;
		field1783 = (int[][][])null;
		field995 = (byte[][][])null;
		field997 = (int[][])null;
		field1847 = null;
		field1003 = null;
		field3093 = null;
		field1417 = null;
		field177 = null;
	}

	static final void method2110(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class223 var8, class209[] var9) {
		class489 var10 = new class489(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method8780();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.method8827();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.method8658();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					class201 var21 = class145.method3177(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.field2172;
					int var28 = var21.field2173;
					int var29;
					if (1 == (var20 & 1)) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var2 + var23;
					int var32 = var16 & 7;
					int var33 = var15 & 7;
					int var35 = var21.field2172;
					int var36 = var21.field2173;
					int var37;
					if (1 == (var20 & 1)) {
						var37 = var35;
						var35 = var36;
						var36 = var37;
					}

					int var34 = var7 & 3;
					int var31;
					if (var34 == 0) {
						var31 = var33;
					} else if (var34 == 1) {
						var31 = 7 - var32 - (var35 - 1);
					} else if (var34 == 2) {
						var31 = 7 - var33 - (var36 - 1);
					} else {
						var31 = var32;
					}

					var37 = var3 + var31;
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
						int var38 = var1;
						if (2 == (field1006[1][var29][var37] & 2)) {
							var38 = var1 - 1;
						}

						class209 var39 = null;
						if (var38 >= 0) {
							var39 = var9[var38];
						}

						class208.method4067(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
					}
				}
			}
		}
	}

	static int method846(int var0, int var1, int var2) {
		if ((field1006[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && 0 != (field1006[1][var1][var2] & 2) ? var0 - 1 : var0;
		}
	}

	static final int method2632(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = class384.method7282(var4, var6);
		int var9 = class384.method7282(var4 + 1, var6);
		int var10 = class384.method7282(var4, var6 + 1);
		int var11 = class384.method7282(var4 + 1, var6 + 1);
		int var12 = method3448(var8, var9, var5, var2);
		int var13 = method3448(var10, var11, var5, var2);
		return method3448(var12, var13, var7, var2);
	}

	static final int method3448(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - class219.field2516[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var1 * var5 >> 16);
	}

	static final int method2342(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = 1376312589 + (15731 * var3 * var3 + 789221) * var3 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	static final boolean method3744(int var0, int var1) {
		class201 var3 = class145.method3177(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var3.method3852(var1);
	}
}
