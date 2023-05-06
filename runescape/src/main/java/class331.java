public class class331 {
	static final class331 field3795;
	static final class331 field3796;
	final int field3797;
	final int field3798;

	static {
		field3795 = new class331(51, 27, 800, 0, 16, 16);
		field3796 = new class331(25, 28, 800, 656, 40, 40);
	}

	class331(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3797 = var5;
		this.field3798 = var6;
	}

	public static class289 method6337(class287 var0, class506 var1) {
		class289 var3 = class289.method3714();
		var3.field3210 = var0;
		var3.field3211 = var0.field3196;
		if (-1 == var3.field3211) {
			var3.field3212 = new class488(260);
		} else if (var3.field3211 == -2) {
			var3.field3212 = new class488(10000);
		} else if (var3.field3211 <= 18) {
			var3.field3212 = new class488(20);
		} else if (var3.field3211 <= 98) {
			var3.field3212 = new class488(100);
		} else {
			var3.field3212 = new class488(260);
		}

		var3.field3212.method8600(var1);
		var3.field3212.method8620(var3.field3210.field3099);
		var3.field3213 = 0;
		return var3;
	}

	static class331[] method18() {
		return new class331[]{field3795, field3796};
	}

	static void method6332(class488 var0, int var1) {
		boolean var3 = var0.method8607(1) == 1;
		if (var3) {
			class103.field1343[++class103.field1342 - 1] = var1;
		}

		int var4 = var0.method8607(2);
		class88 var5 = Client.field611[var1];
		if (var4 == 0) {
			if (var3) {
				var5.field1111 = false;
			} else if (Client.field664 == var1) {
				throw new RuntimeException();
			} else {
				class103.field1331[var1] = (Client.field2850 + var5.field1174[0] >> 13 << 14) + (var5.field1106 << 28) + (var5.field1176[0] + Client.field2841 >> 13);
				if (var5.field1173 != -1) {
					class103.field1339[var1] = var5.field1173;
				} else {
					class103.field1339[var1] = var5.field1168;
				}

				class103.field1347[var1] = var5.field1160;
				Client.field611[var1] = null;
				if (var0.method8607(1) != 0) {
					class264.method5279(var0, var1);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var0.method8607(3);
				var7 = var5.field1174[0];
				var8 = var5.field1176[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (var1 == Client.field664 && (var5.field1171 < 1536 || var5.field1138 < 1536 || var5.field1171 >= 11776 || var5.field1138 >= 11776)) {
					var5.method2245(var7, var8);
					var5.field1111 = false;
				} else if (var3) {
					var5.field1111 = true;
					var5.field1112 = var7;
					var5.field1113 = var8;
				} else {
					var5.field1111 = false;
					var5.method2252(var7, var8, class103.field1333[var1]);
				}

			} else if (var4 == 2) {
				var6 = var0.method8607(4);
				var7 = var5.field1174[0];
				var8 = var5.field1176[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (var1 != Client.field664 || var5.field1171 >= 1536 && var5.field1138 >= 1536 && var5.field1171 < 11776 && var5.field1138 < 11776) {
					if (var3) {
						var5.field1111 = true;
						var5.field1112 = var7;
						var5.field1113 = var8;
					} else {
						var5.field1111 = false;
						var5.method2252(var7, var8, class103.field1333[var1]);
					}
				} else {
					var5.method2245(var7, var8);
					var5.field1111 = false;
				}

			} else {
				var6 = var0.method8607(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method8607(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var9 + var5.field1174[0];
					var12 = var5.field1176[0] + var10;
					if (Client.field664 != var1 || var5.field1171 >= 1536 && var5.field1138 >= 1536 && var5.field1171 < 11776 && var5.field1138 < 11776) {
						if (var3) {
							var5.field1111 = true;
							var5.field1112 = var11;
							var5.field1113 = var12;
						} else {
							var5.field1111 = false;
							var5.method2252(var11, var12, class103.field1333[var1]);
						}
					} else {
						var5.method2245(var11, var12);
						var5.field1111 = false;
					}

					var5.field1106 = (byte)(var5.field1106 + var8 & 3);
					if (var1 == Client.field664) {
						Client.field231 = var5.field1106;
					}

				} else {
					var7 = var0.method8607(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (var9 + var5.field1174[0] + Client.field2850 & 16383) - Client.field2850;
					var12 = (var10 + var5.field1176[0] + Client.field2841 & 16383) - Client.field2841;
					if (Client.field664 == var1 && (var5.field1171 < 1536 || var5.field1138 < 1536 || var5.field1171 >= 11776 || var5.field1138 >= 11776)) {
						var5.method2245(var11, var12);
						var5.field1111 = false;
					} else if (var3) {
						var5.field1111 = true;
						var5.field1112 = var11;
						var5.field1113 = var12;
					} else {
						var5.field1111 = false;
						var5.method2252(var11, var12, class103.field1333[var1]);
					}

					var5.field1106 = (byte)(var8 + var5.field1106 & 3);
					if (Client.field664 == var1) {
						Client.field231 = var5.field1106;
					}

				}
			}
		}
	}
}
