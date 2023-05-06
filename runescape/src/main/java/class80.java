public class class80 {
	int field1019;
	final class342 field1017;
	final int field1018;

	class80(class342 var1, String var2) {
		this.field1019 = 0;
		this.field1017 = var1;
		this.field1018 = var1.method6459();
	}

	boolean method2172() {
		this.field1019 = 0;

		for (int var2 = 0; var2 < this.field1018; ++var2) {
			if (!this.field1017.method6402(var2) || this.field1017.method6406(var2)) {
				++this.field1019;
			}
		}

		return this.field1019 >= this.field1018;
	}

	static final int method2174(class317 var0, int var1) {
		if (var0.field3695 != null && var1 < var0.field3695.length) {
			try {
				int[] var3 = var0.field3695[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = Client.field743[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = Client.field629[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = Client.field630[var3[var5++]];
					}

					int var10;
					class317 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class166.method3349(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class92.method2352(var12).field2231 || Client.field492)) {
							for (var13 = 0; var13 < var11.field3613.length; ++var13) {
								if (var11.field3613[var13] == var12 + 1) {
									var8 += var11.field3702[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = class307.field3482[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = class327.field3773[Client.field629[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = class307.field3482[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = Client.field3454.field1102;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class327.field3774[var10]) {
								var8 += Client.field629[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class166.method3349(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class92.method2352(var12).field2231 || Client.field492)) {
							for (var13 = 0; var13 < var11.field3613.length; ++var13) {
								if (var11.field3613[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = Client.field625;
					}

					if (var7 == 12) {
						var8 = Client.field683;
					}

					if (var7 == 13) {
						var10 = class307.field3482[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class307.method5179(var10);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = Client.field2850 + (Client.field3454.field1171 >> 7);
					}

					if (var7 == 19) {
						var8 = Client.field2841 + (Client.field3454.field1138 >> 7);
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
