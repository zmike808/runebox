public class class253 implements class269 {
	int field2937;
	int field2938;
	int field2940;
	int field2941;
	int field2942;
	int field2943;
	int field2944;
	int field2945;
	int field2946;
	int field2948;

	class253() {
	}

	public void method5359(class249 var1) {
		if (var1.field2895 > this.field2937) {
			var1.field2895 = this.field2937;
		}

		if (var1.field2889 < this.field2937) {
			var1.field2889 = this.field2937;
		}

		if (var1.field2897 > this.field2948) {
			var1.field2897 = this.field2948;
		}

		if (var1.field2898 < this.field2948) {
			var1.field2898 = this.field2948;
		}

	}

	public boolean method5341(int var1, int var2, int var3) {
		if (var1 >= this.field2943 && var1 < this.field2946 + this.field2943) {
			return var2 >= (this.field2938 << 6) + (this.field2942 << 3) && var2 <= 7 + (this.field2942 << 3) + (this.field2938 << 6) && var3 >= (this.field2940 << 6) + (this.field2944 << 3) && var3 <= (this.field2944 << 3) + (this.field2940 << 6) + 7;
		} else {
			return false;
		}
	}

	public boolean method5354(int var1, int var2) {
		return var1 >= (this.field2945 << 3) + (this.field2937 << 6) && var1 <= 7 + (this.field2937 << 6) + (this.field2945 << 3) && var2 >= (this.field2948 << 6) + (this.field2941 << 3) && var2 <= (this.field2941 << 3) + (this.field2948 << 6) + 7;
	}

	public int[] method5343(int var1, int var2, int var3) {
		if (!this.method5341(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2937 * 64 - this.field2938 * 64 + var2 + (this.field2945 * 8 - this.field2942 * 8), var3 + (this.field2948 * 64 - this.field2940 * 64) + (this.field2941 * 8 - this.field2944 * 8)};
			return var5;
		}
	}

	public class308 method5344(int var1, int var2) {
		if (!this.method5354(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2942 * 8 - this.field2945 * 8 + this.field2938 * 64 - this.field2937 * 64 + var1;
			int var5 = this.field2944 * 8 - this.field2941 * 8 + var2 + (this.field2940 * 64 - this.field2948 * 64);
			return new class308(this.field2943, var4, var5);
		}
	}

	public void method5361(class489 var1) {
		this.field2943 = var1.method8658();
		this.field2946 = var1.method8658();
		this.field2938 = var1.method8660();
		this.field2942 = var1.method8658();
		this.field2940 = var1.method8660();
		this.field2944 = var1.method8658();
		this.field2937 = var1.method8660();
		this.field2945 = var1.method8658();
		this.field2948 = var1.method8660();
		this.field2941 = var1.method8658();
		this.method5151();
	}

	void method5151() {
	}

	public static final class503 method5160(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var7 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42);
		class503 var9;
		if (!var5) {
			var9 = (class503)class202.field2216.method5461(var7);
			if (var9 != null) {
				return var9;
			}
		}

		class202 var10 = class92.method2352(var0);
		if (var1 > 1 && null != var10.field2251) {
			int var11 = -1;

			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field2264[var12] && 0 != var10.field2264[var12]) {
					var11 = var10.field2251[var12];
				}
			}

			if (var11 != -1) {
				var10 = class92.method2352(var11);
			}
		}

		class232 var21 = var10.method3925(1);
		if (var21 == null) {
			return null;
		} else {
			class503 var22 = null;
			if (-1 != var10.field2254) {
				var22 = method5160(var10.field2253, 10, 1, 0, 0, true);
				if (null == var22) {
					return null;
				}
			} else if (var10.field2265 != -1) {
				var22 = method5160(var10.field2241, var1, var2, var3, 0, false);
				if (null == var22) {
					return null;
				}
			} else if (var10.field2267 != -1) {
				var22 = method5160(var10.field2266, var1, 0, 0, 0, false);
				if (null == var22) {
					return null;
				}
			}

			int[] var13 = class238.field5067;
			int var14 = class238.field5061;
			int var15 = class499.field5060;
			float[] var16 = class238.field5063;
			int[] var17 = new int[4];
			class499.method8983(var17);
			var9 = new class503(36, 32);
			class219.method9(var9.field5089, 36, 32, (float[])null);
			class499.method8985();
			class219.method272();
			class249.method4970(16, 16);
			class219.field2515.field2790 = false;
			if (-1 != var10.field2267) {
				var22.method9106(0, 0);
			}

			int var18 = var10.field2224;
			if (var5) {
				var18 = (int)(1.5D * (double)var18);
			} else if (var2 == 2) {
				var18 = (int)((double)var18 * 1.04D);
			}

			int var19 = var18 * class219.field2512[var10.field2225] >> 16;
			int var20 = var18 * class219.field2516[var10.field2225] >> 16;
			var21.method4654();
			var21.method4705(0, var10.field2226, var10.field2260, var10.field2225, var10.field2228, var21.field2619 / 2 + var19 + var10.field2229, var20 + var10.field2229);
			if (var10.field2265 != -1) {
				var22.method9106(0, 0);
			}

			if (var2 >= 1) {
				var9.method9102(1);
			}

			if (var2 >= 2) {
				var9.method9102(16777215);
			}

			if (var3 != 0) {
				var9.method9152(var3);
			}

			class219.method9(var9.field5089, 36, 32, (float[])null);
			if (var10.field2254 != -1) {
				var22.method9106(0, 0);
			}

			if (var4 == 1 || var4 == 2 && 1 == var10.field2236) {
				class202.field1505.method7228(class102.method2631(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				class202.field2216.method5463(var9, var7);
			}

			class219.method9(var13, var14, var15, var16);
			class499.method8984(var17);
			class219.method272();
			class219.field2515.field2790 = true;
			return var9;
		}
	}
}
