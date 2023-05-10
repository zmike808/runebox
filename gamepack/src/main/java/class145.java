import java.util.LinkedList;
import java.util.List;

public class class145 extends class140 {
	static class344 field2158;
	int field1672;
	int field1673;
	int field1674;
	int field1677;
	// $FF: synthetic field
	final class143 this$0;

	class145(class143 var1) {
		this.this$0 = var1;
	}

	void method3152(class489 var1) {
		this.field1672 = var1.method8664();
		this.field1677 = var1.method8664();
		this.field1673 = var1.method8658();
		this.field1674 = var1.method8658();
	}

	void method3151(class151 var1) {
		var1.method3223(this.field1672, this.field1677, this.field1673, this.field1674);
	}

	public static int method3173(int var0, int var1, int var2, class210 var3, class209 var4, boolean var5, int[] var6, int[] var7) {
		int var10;
		for (int var9 = 0; var9 < 128; ++var9) {
			for (var10 = 0; var10 < 128; ++var10) {
				class212.field2402[var9][var10] = 0;
				class212.field2397[var9][var10] = 99999999;
			}
		}

		int var11;
		int var12;
		byte var14;
		int var15;
		int var16;
		int var18;
		int var20;
		int var21;
		int var22;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) {
			var28 = class89.method2303(var0, var1, var3, var4);
		} else if (var2 == 2) {
			var11 = var0;
			var12 = var1;
			byte var13 = 64;
			var14 = 64;
			var15 = var0 - var13;
			var16 = var1 - var14;
			class212.field2402[var13][var14] = 99;
			class212.field2397[var13][var14] = 0;
			byte var17 = 0;
			var18 = 0;
			class212.field2398[var17] = var0;
			var33 = var17 + 1;
			class212.field2396[var17] = var1;
			int[][] var19 = var4.field2380;

			boolean var29;
			while (true) {
				if (var18 == var33) {
					class212.field95 = var11;
					class212.field4535 = var12;
					var29 = false;
					break;
				}

				var11 = class212.field2398[var18];
				var12 = class212.field2396[var18];
				var18 = var18 + 1 & 4095;
				var30 = var11 - var15;
				var31 = var12 - var16;
				var20 = var11 - var4.field2375;
				var21 = var12 - var4.field2377;
				if (var3.method4127(2, var11, var12, var4)) {
					class212.field95 = var11;
					class212.field4535 = var12;
					var29 = true;
					break;
				}

				var22 = 1 + class212.field2397[var30][var31];
				if (var30 > 0 && 0 == class212.field2402[var30 - 1][var31] && 0 == (var19[var20 - 1][var21] & 19136782) && 0 == (var19[var20 - 1][var21 + 1] & 19136824)) {
					class212.field2398[var33] = var11 - 1;
					class212.field2396[var33] = var12;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30 - 1][var31] = 2;
					class212.field2397[var30 - 1][var31] = var22;
				}

				if (var30 < 126 && class212.field2402[var30 + 1][var31] == 0 && 0 == (var19[var20 + 2][var21] & 19136899) && (var19[var20 + 2][var21 + 1] & 19136992) == 0) {
					class212.field2398[var33] = var11 + 1;
					class212.field2396[var33] = var12;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30 + 1][var31] = 8;
					class212.field2397[var30 + 1][var31] = var22;
				}

				if (var31 > 0 && 0 == class212.field2402[var30][var31 - 1] && 0 == (var19[var20][var21 - 1] & 19136782) && 0 == (var19[var20 + 1][var21 - 1] & 19136899)) {
					class212.field2398[var33] = var11;
					class212.field2396[var33] = var12 - 1;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30][var31 - 1] = 1;
					class212.field2397[var30][var31 - 1] = var22;
				}

				if (var31 < 126 && 0 == class212.field2402[var30][var31 + 1] && (var19[var20][var21 + 2] & 19136824) == 0 && 0 == (var19[var20 + 1][var21 + 2] & 19136992)) {
					class212.field2398[var33] = var11;
					class212.field2396[var33] = var12 + 1;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30][var31 + 1] = 4;
					class212.field2397[var30][var31 + 1] = var22;
				}

				if (var30 > 0 && var31 > 0 && class212.field2402[var30 - 1][var31 - 1] == 0 && 0 == (var19[var20 - 1][var21] & 19136830) && 0 == (var19[var20 - 1][var21 - 1] & 19136782) && (var19[var20][var21 - 1] & 19136911) == 0) {
					class212.field2398[var33] = var11 - 1;
					class212.field2396[var33] = var12 - 1;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30 - 1][var31 - 1] = 3;
					class212.field2397[var30 - 1][var31 - 1] = var22;
				}

				if (var30 < 126 && var31 > 0 && 0 == class212.field2402[var30 + 1][var31 - 1] && (var19[var20 + 1][var21 - 1] & 19136911) == 0 && (var19[var20 + 2][var21 - 1] & 19136899) == 0 && 0 == (var19[var20 + 2][var21] & 19136995)) {
					class212.field2398[var33] = var11 + 1;
					class212.field2396[var33] = var12 - 1;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30 + 1][var31 - 1] = 9;
					class212.field2397[var30 + 1][var31 - 1] = var22;
				}

				if (var30 > 0 && var31 < 126 && class212.field2402[var30 - 1][var31 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 19136830) == 0 && 0 == (var19[var20 - 1][var21 + 2] & 19136824) && (var19[var20][var21 + 2] & 19137016) == 0) {
					class212.field2398[var33] = var11 - 1;
					class212.field2396[var33] = var12 + 1;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30 - 1][var31 + 1] = 6;
					class212.field2397[var30 - 1][var31 + 1] = var22;
				}

				if (var30 < 126 && var31 < 126 && class212.field2402[var30 + 1][var31 + 1] == 0 && (var19[var20 + 1][var21 + 2] & 19137016) == 0 && (var19[var20 + 2][var21 + 2] & 19136992) == 0 && 0 == (var19[var20 + 2][var21 + 1] & 19136995)) {
					class212.field2398[var33] = var11 + 1;
					class212.field2396[var33] = var12 + 1;
					var33 = var33 + 1 & 4095;
					class212.field2402[var30 + 1][var31 + 1] = 12;
					class212.field2397[var30 + 1][var31 + 1] = var22;
				}
			}

			var28 = var29;
		} else {
			var28 = class185.method3568(var0, var1, var2, var3, var4);
		}

		var10 = var0 - 64;
		var11 = var1 - 64;
		var12 = class212.field95;
		var30 = class212.field4535;
		if (!var28) {
			if (!var5) {
				return -1;
			}

			var31 = Integer.MAX_VALUE;
			var15 = Integer.MAX_VALUE;
			byte var32 = 10;
			var33 = var3.field2387;
			var18 = var3.field2385;
			int var34 = var3.field2383;
			var20 = var3.field2384;

			for (var21 = var33 - var32; var21 <= var33 + var32; ++var21) {
				for (var22 = var18 - var32; var22 <= var18 + var32; ++var22) {
					int var23 = var21 - var10;
					int var24 = var22 - var11;
					if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && class212.field2397[var23][var24] < 100) {
						int var25 = 0;
						if (var21 < var33) {
							var25 = var33 - var21;
						} else if (var21 > var34 + var33 - 1) {
							var25 = var21 - (var34 + var33 - 1);
						}

						int var26 = 0;
						if (var22 < var18) {
							var26 = var18 - var22;
						} else if (var22 > var20 + var18 - 1) {
							var26 = var22 - (var20 + var18 - 1);
						}

						int var27 = var26 * var26 + var25 * var25;
						if (var27 < var31 || var31 == var27 && class212.field2397[var23][var24] < var15) {
							var31 = var27;
							var15 = class212.field2397[var23][var24];
							var12 = var21;
							var30 = var22;
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var12 && var1 == var30) {
			var6[0] = var12;
			var7[0] = var30;
			return 0;
		} else {
			var14 = 0;
			class212.field2398[var14] = var12;
			var31 = var14 + 1;
			class212.field2396[var14] = var30;

			for (var15 = var16 = class212.field2402[var12 - var10][var30 - var11]; var0 != var12 || var30 != var1; var15 = class212.field2402[var12 - var10][var30 - var11]) {
				if (var15 != var16) {
					var16 = var15;
					class212.field2398[var31] = var12;
					class212.field2396[var31++] = var30;
				}

				if ((var15 & 2) != 0) {
					++var12;
				} else if ((var15 & 8) != 0) {
					--var12;
				}

				if (0 != (var15 & 1)) {
					++var30;
				} else if ((var15 & 4) != 0) {
					--var30;
				}
			}

			var33 = 0;

			while (var31-- > 0) {
				var6[var33] = class212.field2398[var31];
				var7[var33++] = class212.field2396[var31];
				if (var33 >= var6.length) {
					break;
				}
			}

			return var33;
		}
	}

	public static class201 method3177(int var0) {
		class201 var2 = (class201)class201.field2159.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2158.method6468(6, var0);
			var2 = new class201();
			var2.field2186 = var0;
			if (var3 != null) {
				var2.method3850(new class489(var3));
			}

			var2.method3849();
			if (var2.field2196) {
				var2.field2178 = 0;
				var2.field2175 = false;
			}

			class201.field2159.method5463(var2, (long)var0);
			return var2;
		}
	}

	static int method3174(int var0, class75 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		class483 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					class67.field836 -= 3;
					var4 = class67.field843[class67.field836];
					var21 = class67.field843[1 + class67.field836];
					var6 = class67.field843[2 + class67.field836];
					var23 = class485.method6945(var21);
					var8 = class485.method7769(var21);
					int var25 = class485.method3189(var21);
					class484 var26 = class126.method3030(var4);
					class482 var27 = class482.method6343(var23);
					int[] var28 = var27.field4960[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}

						var13 = var25;
						var14 = var25 + 1;
					}

					Object[] var15 = var26.method8571(var8);
					if (var15 == null && var27.field4961 != null) {
						var15 = var27.field4961[var8];
					}

					int var16;
					int var17;
					if (null == var15) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							class479 var29 = class477.method2658(var17);
							if (class479.field4947 == var29) {
								class67.field842[++class67.field1015 - 1] = "";
							} else {
								class67.field843[++class67.field836 - 1] = class477.method6640(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var17 + var6 * var28.length;
								class479 var19 = class477.method2658(var28[var17]);
								if (class479.field4947 == var19) {
									class67.field842[++class67.field1015 - 1] = (String)var15[var18];
								} else {
									class67.field843[++class67.field836 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					class67.field836 -= 2;
					var4 = class67.field843[class67.field836];
					var21 = class67.field843[1 + class67.field836];
					var6 = 0;
					var23 = class485.method6945(var21);
					var8 = class485.method7769(var21);
					class484 var24 = class126.method3030(var4);
					class482 var10 = class482.method6343(var23);
					int[] var11 = var10.field4960[var8];
					Object[] var12 = var24.method8571(var8);
					if (var12 == null && var10.field4961 != null) {
						var12 = var10.field4961[var8];
					}

					if (null != var12) {
						var6 = var12.length / var11.length;
					}

					class67.field843[++class67.field836 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = class67.field843[--class67.field836];
						class484 var22 = class126.method3030(var4);
						class67.field843[++class67.field836 - 1] = var22.field4971;
						return 1;
					} else if (var0 == 7506) {
						var4 = class67.field843[--class67.field836];
						var21 = -1;
						if (class67.field36 != null && var4 >= 0 && var4 < class67.field36.size()) {
							var21 = (Integer)class67.field36.get(var4);
						}

						class67.field843[++class67.field836 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = class67.field843[--class67.field836];
						var5 = class67.method2197(var4);
						var6 = class67.field843[--class67.field836];
						var7 = Client.method4063(var6);
						if (var7 == null) {
							throw new RuntimeException();
						} else if (class485.method6945(var6) != Client.field747) {
							throw new RuntimeException();
						} else if (null == class67.field36 && class67.field36.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = class485.method3189(var6);
							List var9 = var7.method8551(var5, var8);
							class67.field36 = new LinkedList(class67.field36);
							if (var9 != null) {
								class67.field36.retainAll(var9);
							} else {
								class67.field36.clear();
							}

							class67.field7 = class67.field36.iterator();
							if (var0 == 7507) {
								class67.field843[++class67.field836 - 1] = class67.field36.size();
							}

							return 1;
						}
					}
				} else {
					--class67.field836;
					var4 = class67.field843[class67.field836];
					class483 var20 = Client.method100(var4);
					if (null == var20) {
						throw new RuntimeException();
					} else {
						class67.field36 = var20.method8551(0, 0);
						var6 = 0;
						if (null != class67.field36) {
							Client.field747 = var4;
							class67.field7 = class67.field36.iterator();
							var6 = class67.field36.size();
						}

						if (var0 == 7504) {
							class67.field843[++class67.field836 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (null != class67.field7 && class67.field7.hasNext()) {
					class67.field843[++class67.field836 - 1] = (Integer)class67.field7.next();
				} else {
					class67.field843[++class67.field836 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = class67.field843[--class67.field836];
			var5 = class67.method2197(var4);
			var6 = class67.field843[--class67.field836];
			var7 = Client.method4063(var6);
			if (null == var7) {
				throw new RuntimeException();
			} else {
				var8 = class485.method3189(var6);
				class67.field36 = var7.method8551(var5, var8);
				if (null != class67.field36) {
					Client.field747 = class485.method6945(var6);
					class67.field7 = class67.field36.iterator();
					if (var0 == 7500) {
						class67.field843[++class67.field836 - 1] = class67.field36.size();
					}
				} else {
					Client.field747 = -1;
					class67.field7 = null;
					if (var0 == 7500) {
						class67.field843[++class67.field836 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
