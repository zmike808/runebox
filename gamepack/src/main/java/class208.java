import java.util.Arrays;

public class class208 implements class30 {
	boolean[] field2352;
	boolean[] field2359;
	boolean[] field2361;
	char[] field2356;
	int field2351;
	int field2355;
	int field2358;
	int field2365;
	int[] field2354;
	int[] field2360;
	public char field2362;
	public int field2363;
	public int field2364;
	public int[] field2350;

	public class208() {
		this.field2356 = new char[128];
		this.field2360 = new int[128];
		this.field2350 = new int[128];
		this.field2364 = 0;
		this.field2354 = new int[128];
		this.field2355 = 0;
		this.field2351 = 0;
		this.field2365 = 0;
		this.field2358 = 0;
		this.field2359 = new boolean[112];
		this.field2352 = new boolean[112];
		this.field2361 = new boolean[112];
	}

	public boolean method463(int var1) {
		this.method4066(var1);
		this.field2359[var1] = true;
		this.field2352[var1] = true;
		this.field2361[var1] = false;
		this.field2350[++this.field2364 - 1] = var1;
		return true;
	}

	public boolean method456(int var1) {
		this.field2359[var1] = false;
		this.field2352[var1] = false;
		this.field2361[var1] = true;
		this.field2354[++this.field2355 - 1] = var1;
		return true;
	}

	public boolean method455(char var1) {
		int var3 = 1 + this.field2365 & 127;
		if (var3 != this.field2351) {
			this.field2360[this.field2365] = -1;
			this.field2356[this.field2365] = var1;
			this.field2365 = var3;
		}

		return false;
	}

	void method4066(int var1) {
		int var3 = this.field2365 + 1 & 127;
		if (var3 != this.field2351) {
			this.field2360[this.field2365] = var1;
			this.field2356[this.field2365] = 0;
			this.field2365 = var3;
		}

	}

	public boolean method458(boolean var1) {
		return false;
	}

	public void method4068() {
		this.field2351 = this.field2358;
		this.field2358 = this.field2365;
		this.field2364 = 0;
		this.field2355 = 0;
		Arrays.fill(this.field2352, false);
		Arrays.fill(this.field2361, false);
	}

	public final boolean method4071() {
		if (this.field2358 == this.field2351) {
			return false;
		} else {
			this.field2363 = this.field2360[this.field2351];
			this.field2362 = this.field2356[this.field2351];
			this.field2351 = 1 + this.field2351 & 127;
			return true;
		}
	}

	public boolean method4070(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2352[var1] : false;
	}

	public boolean method4076(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2359[var1] : false;
	}

	public boolean method4078(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2361[var1] : false;
	}

	public int[] method4072() {
		int[] var2 = new int[this.field2364];

		for (int var3 = 0; var3 < this.field2364; ++var3) {
			var2[var3] = this.field2350[var3];
		}

		return var2;
	}

	public int[] method4069() {
		int[] var2 = new int[this.field2355];

		for (int var3 = 0; var3 < this.field2355; ++var3) {
			var2[var3] = this.field2354[var3];
		}

		return var2;
	}

	static final void method4067(int var0, int var1, int var2, int var3, int var4, int var5, class223 var6, class209 var7) {
		if (!Client.field493 || 0 != (class78.field1006[0][var1][var2] & 2) || (class78.field1006[var0][var1][var2] & 16) == 0) {
			if (var0 < class78.field999) {
				class78.field999 = var0;
			}

			class201 var9 = class145.method3177(var3);
			int var10;
			int var11;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.field2172;
				var11 = var9.field2173;
			} else {
				var10 = var9.field2173;
				var11 = var9.field2172;
			}

			int var12;
			int var13;
			if (var1 + var10 <= 104) {
				var12 = var1 + (var10 >> 1);
				var13 = (var10 + 1 >> 1) + var1;
			} else {
				var12 = var1;
				var13 = var1 + 1;
			}

			int var14;
			int var15;
			if (var11 + var2 <= 104) {
				var14 = var2 + (var11 >> 1);
				var15 = (var11 + 1 >> 1) + var2;
			} else {
				var14 = var2;
				var15 = var2 + 1;
			}

			int[][] var16 = class78.field1002[var0];
			int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
			int var18 = (var10 << 6) + (var1 << 7);
			int var19 = (var2 << 7) + (var11 << 6);
			long var20 = class233.method4549(var1, var2, 2, 0 == var9.field2176, var3);
			int var22 = var5 + (var4 << 6);
			if (var9.field2207 == 1) {
				var22 += 256;
			}

			if (var9.method3860()) {
				class66.method685(var0, var1, var2, var9, var4);
			}

			Object var23;
			if (var5 == 22) {
				if (!Client.field493 || 0 != var9.field2176 || 1 == var9.field2178 || var9.field2195) {
					if (-1 == var9.field2167 && null == var9.field2198) {
						var23 = var9.method3853(22, var4, var16, var18, var17, var19, (byte)-65);
					} else {
						var23 = new class76(var3, 22, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
					}

					var6.method4374(var0, var1, var2, var17, (class225)var23, var20, var22);
					if (var9.field2178 == 1 && var7 != null) {
						var7.method4096(var1, var2);
					}

				}
			} else {
				int var24;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var9.field2167 == -1 && null == var9.field2198) {
							var23 = var9.method3853(var5, var4, var16, var18, var17, var19, (byte)-110);
						} else {
							var23 = new class76(var3, var5, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
						}

						var6.method4533(var0, var1, var2, var17, 1, 1, (class225)var23, 0, var20, var22);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class78.field1783[var0][var1];
							var10000[var2] |= 2340;
						}

						if (0 != var9.field2178 && null != var7) {
							var7.method4102(var1, var2, var10, var11, var9.field2175);
						}

					} else if (var5 == 0) {
						if (-1 == var9.field2167 && var9.field2198 == null) {
							var23 = var9.method3853(0, var4, var16, var18, var17, var19, (byte)-17);
						} else {
							var23 = new class76(var3, 0, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
						}

						var6.method4376(var0, var1, var2, var17, (class225)var23, (class225)null, class78.field996[var4], 0, var20, var22);
						if (var4 == 0) {
							if (var9.field2188) {
								class78.field995[var0][var1][var2] = 50;
								class78.field995[var0][var1][var2 + 1] = 50;
							}

							if (var9.field2179) {
								var10000 = class78.field1783[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var9.field2188) {
								class78.field995[var0][var1][var2 + 1] = 50;
								class78.field995[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2179) {
								var10000 = class78.field1783[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var9.field2188) {
								class78.field995[var0][var1 + 1][var2] = 50;
								class78.field995[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2179) {
								var10000 = class78.field1783[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var9.field2188) {
								class78.field995[var0][var1][var2] = 50;
								class78.field995[var0][var1 + 1][var2] = 50;
							}

							if (var9.field2179) {
								var10000 = class78.field1783[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var9.field2178 != 0 && null != var7) {
							var7.method4093(var1, var2, var5, var4, var9.field2175);
						}

						if (16 != var9.field2181) {
							var6.method4404(var0, var1, var2, var9.field2181);
						}

					} else if (var5 == 1) {
						if (var9.field2167 == -1 && var9.field2198 == null) {
							var23 = var9.method3853(1, var4, var16, var18, var17, var19, (byte)-60);
						} else {
							var23 = new class76(var3, 1, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
						}

						var6.method4376(var0, var1, var2, var17, (class225)var23, (class225)null, class78.field1007[var4], 0, var20, var22);
						if (var9.field2188) {
							if (var4 == 0) {
								class78.field995[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class78.field995[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class78.field995[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class78.field995[var0][var1][var2] = 50;
							}
						}

						if (var9.field2178 != 0 && var7 != null) {
							var7.method4093(var1, var2, var5, var4, var9.field2175);
						}

					} else {
						int var29;
						if (var5 == 2) {
							var29 = var4 + 1 & 3;
							Object var31;
							Object var32;
							if (var9.field2167 == -1 && null == var9.field2198) {
								var32 = var9.method3853(2, var4 + 4, var16, var18, var17, var19, (byte)-33);
								var31 = var9.method3853(2, var29, var16, var18, var17, var19, (byte)-89);
							} else {
								var32 = new class76(var3, 2, var4 + 4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
								var31 = new class76(var3, 2, var29, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
							}

							var6.method4376(var0, var1, var2, var17, (class225)var32, (class225)var31, class78.field996[var4], class78.field996[var29], var20, var22);
							if (var9.field2179) {
								if (var4 == 0) {
									var10000 = class78.field1783[var0][var1];
									var10000[var2] |= 585;
									var10000 = class78.field1783[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class78.field1783[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = class78.field1783[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class78.field1783[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class78.field1783[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class78.field1783[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class78.field1783[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var9.field2178 != 0 && null != var7) {
								var7.method4093(var1, var2, var5, var4, var9.field2175);
							}

							if (16 != var9.field2181) {
								var6.method4404(var0, var1, var2, var9.field2181);
							}

						} else if (var5 == 3) {
							if (-1 == var9.field2167 && var9.field2198 == null) {
								var23 = var9.method3853(3, var4, var16, var18, var17, var19, (byte)-78);
							} else {
								var23 = new class76(var3, 3, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
							}

							var6.method4376(var0, var1, var2, var17, (class225)var23, (class225)null, class78.field1007[var4], 0, var20, var22);
							if (var9.field2188) {
								if (var4 == 0) {
									class78.field995[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class78.field995[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class78.field995[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class78.field995[var0][var1][var2] = 50;
								}
							}

							if (0 != var9.field2178 && null != var7) {
								var7.method4093(var1, var2, var5, var4, var9.field2175);
							}

						} else if (var5 == 9) {
							if (-1 == var9.field2167 && var9.field2198 == null) {
								var23 = var9.method3853(var5, var4, var16, var18, var17, var19, (byte)-96);
							} else {
								var23 = new class76(var3, var5, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
							}

							var6.method4533(var0, var1, var2, var17, 1, 1, (class225)var23, 0, var20, var22);
							if (var9.field2178 != 0 && var7 != null) {
								var7.method4102(var1, var2, var10, var11, var9.field2175);
							}

							if (var9.field2181 != 16) {
								var6.method4404(var0, var1, var2, var9.field2181);
							}

						} else if (var5 == 4) {
							if (var9.field2167 == -1 && null == var9.field2198) {
								var23 = var9.method3853(4, var4, var16, var18, var17, var19, (byte)-85);
							} else {
								var23 = new class76(var3, 4, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
							}

							var6.method4377(var0, var1, var2, var17, (class225)var23, (class225)null, class78.field996[var4], 0, 0, 0, var20, var22);
						} else {
							long var30;
							Object var33;
							if (var5 == 5) {
								var29 = 16;
								var30 = var6.method4394(var0, var1, var2);
								if (0L != var30) {
									var29 = class145.method3177(class233.method2194(var30)).field2181;
								}

								if (var9.field2167 == -1 && null == var9.field2198) {
									var33 = var9.method3853(4, var4, var16, var18, var17, var19, (byte)-90);
								} else {
									var33 = new class76(var3, 4, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
								}

								var6.method4377(var0, var1, var2, var17, (class225)var33, (class225)null, class78.field996[var4], 0, class78.field1008[var4] * var29, var29 * class78.field1004[var4], var20, var22);
							} else if (var5 == 6) {
								var29 = 8;
								var30 = var6.method4394(var0, var1, var2);
								if (0L != var30) {
									var29 = class145.method3177(class233.method2194(var30)).field2181 / 2;
								}

								if (-1 == var9.field2167 && null == var9.field2198) {
									var33 = var9.method3853(4, var4 + 4, var16, var18, var17, var19, (byte)-95);
								} else {
									var33 = new class76(var3, 4, var4 + 4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
								}

								var6.method4377(var0, var1, var2, var17, (class225)var33, (class225)null, 256, var4, class78.field1010[var4] * var29, var29 * class78.field1011[var4], var20, var22);
							} else if (var5 == 7) {
								var24 = var4 + 2 & 3;
								if (var9.field2167 == -1 && var9.field2198 == null) {
									var23 = var9.method3853(4, var24 + 4, var16, var18, var17, var19, (byte)-87);
								} else {
									var23 = new class76(var3, 4, var24 + 4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
								}

								var6.method4377(var0, var1, var2, var17, (class225)var23, (class225)null, 256, var24, 0, 0, var20, var22);
							} else if (var5 == 8) {
								var29 = 8;
								var30 = var6.method4394(var0, var1, var2);
								if (0L != var30) {
									var29 = class145.method3177(class233.method2194(var30)).field2181 / 2;
								}

								int var28 = var4 + 2 & 3;
								Object var27;
								if (var9.field2167 == -1 && null == var9.field2198) {
									var33 = var9.method3853(4, var4 + 4, var16, var18, var17, var19, (byte)-28);
									var27 = var9.method3853(4, var28 + 4, var16, var18, var17, var19, (byte)-104);
								} else {
									var33 = new class76(var3, 4, var4 + 4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
									var27 = new class76(var3, 4, var28 + 4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
								}

								var6.method4377(var0, var1, var2, var17, (class225)var33, (class225)var27, 256, var4, class78.field1010[var4] * var29, var29 * class78.field1011[var4], var20, var22);
							}
						}
					}
				} else {
					if (-1 == var9.field2167 && var9.field2198 == null) {
						var23 = var9.method3853(10, var4, var16, var18, var17, var19, (byte)-73);
					} else {
						var23 = new class76(var3, 10, var4, var0, var1, var2, var9.field2167, var9.field2206, (class225)null);
					}

					if (null != var23 && var6.method4533(var0, var1, var2, var17, var10, var11, (class225)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field2188) {
						var24 = 15;
						if (var23 instanceof class232) {
							var24 = ((class232)var23).method4608() / 4;
							if (var24 > 30) {
								var24 = 30;
							}
						}

						for (int var25 = 0; var25 <= var10; ++var25) {
							for (int var26 = 0; var26 <= var11; ++var26) {
								if (var24 > class78.field995[var0][var1 + var25][var2 + var26]) {
									class78.field995[var0][var1 + var25][var26 + var2] = (byte)var24;
								}
							}
						}
					}

					if (0 != var9.field2178 && var7 != null) {
						var7.method4102(var1, var2, var10, var11, var9.field2175);
					}

				}
			}
		}
	}
}
