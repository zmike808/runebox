import java.util.HashMap;
import java.util.Map;

public class class204 extends class444 {
	public static class280 field2287;
	public static class280 field2295;
	public static class280 field2302;
	static boolean field2298;
	static class344 field2291;
	static class344 field2292;
	static class344 field2311;
	boolean[] field2290;
	int field2286;
	int field2299;
	int[] field2297;
	int[] field2305;
	public boolean field2307;
	public boolean field2308;
	public int field2288;
	public int field2294;
	public int field2296;
	public int field2301;
	public int field2309;
	public int field2310;
	public int field2313;
	public int field2314;
	public int field2315;
	public int[] field2300;
	public int[] field2303;
	public int[] field2304;
	public Map field2312;

	static {
		field2298 = false;
		field2287 = new class280(64);
		field2302 = new class280(100);
		field2295 = new class280(100);
	}

	class204() {
		this.field2296 = -1;
		this.field2286 = 0;
		this.field2299 = 0;
		this.field2301 = -1;
		this.field2307 = false;
		this.field2294 = 5;
		this.field2309 = -1;
		this.field2310 = -1;
		this.field2288 = 99;
		this.field2308 = false;
		this.field2313 = -1;
		this.field2314 = -1;
		this.field2315 = 2;
	}

	void method3995(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method4033(var1, var3);
		}
	}

	void method4033(class489 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method8660();
			this.field2304 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2304[var5] = var1.method8660();
			}

			this.field2300 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2300[var5] = var1.method8660();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2300[var5] += var1.method8660() << 16;
			}
		} else if (var2 == 2) {
			this.field2301 = var1.method8660();
		} else if (var2 == 3) {
			var4 = var1.method8658();
			this.field2305 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2305[var5] = var1.method8658();
			}

			this.field2305[var4] = 9999999;
		} else if (var2 == 4) {
			this.field2307 = true;
		} else if (var2 == 5) {
			this.field2294 = var1.method8658();
		} else if (var2 == 6) {
			this.field2309 = var1.method8660();
		} else if (var2 == 7) {
			this.field2310 = var1.method8660();
		} else if (var2 == 8) {
			this.field2288 = var1.method8658();
			this.field2308 = true;
		} else if (var2 == 9) {
			this.field2313 = var1.method8658();
		} else if (var2 == 10) {
			this.field2314 = var1.method8658();
		} else if (var2 == 11) {
			this.field2315 = var1.method8658();
		} else if (var2 == 12) {
			var4 = var1.method8658();
			this.field2297 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2297[var5] = var1.method8660();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2297[var5] += var1.method8660() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.method8658();
			this.field2303 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2303[var5] = var1.method8662();
			}
		} else if (var2 == 14) {
			this.field2296 = var1.method8664();
		} else if (var2 == 15) {
			var4 = var1.method8660();
			this.field2312 = new HashMap();

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method8660();
				int var7 = var1.method8662();
				this.field2312.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field2286 = var1.method8660();
			this.field2299 = var1.method8660();
		} else if (var2 == 17) {
			this.field2290 = new boolean[256];

			for (var4 = 0; var4 < this.field2290.length; ++var4) {
				this.field2290[var4] = false;
			}

			var4 = var1.method8658();

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2290[var1.method8658()] = true;
			}
		}

	}

	void method3997() {
		if (this.field2313 == -1) {
			if (null == this.field2305 && null == this.field2290) {
				this.field2313 = 0;
			} else {
				this.field2313 = 2;
			}
		}

		if (-1 == this.field2314) {
			if (null == this.field2305 && this.field2290 == null) {
				this.field2314 = 0;
			} else {
				this.field2314 = 2;
			}
		}

	}

	public class232 method3998(class232 var1, int var2) {
		class232 var5;
		if (!this.method4004()) {
			var2 = this.field2300[var2];
			class227 var6 = method5280(var2 >> 16);
			var2 &= 65535;
			if (null == var6) {
				return var1.method4593(true);
			} else {
				var5 = var1.method4593(!var6.method4552(var2));
				var5.method4642(var6, var2);
				return var5;
			}
		} else {
			class134 var4 = method2616(this.field2296);
			if (null == var4) {
				return var1.method4593(true);
			} else {
				var5 = var1.method4593(!var4.method3073());
				var5.method4607(var4, var2);
				return var5;
			}
		}
	}

	class232 method4028(class232 var1, int var2, int var3) {
		class232 var6;
		if (!this.method4004()) {
			var2 = this.field2300[var2];
			class227 var7 = method5280(var2 >> 16);
			var2 &= 65535;
			if (var7 == null) {
				return var1.method4593(true);
			} else {
				var6 = var1.method4593(!var7.method4552(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method4602();
				} else if (var3 == 2) {
					var6.method4615();
				} else if (var3 == 3) {
					var6.method4684();
				}

				var6.method4642(var7, var2);
				if (var3 == 1) {
					var6.method4684();
				} else if (var3 == 2) {
					var6.method4615();
				} else if (var3 == 3) {
					var6.method4602();
				}

				return var6;
			}
		} else {
			class134 var5 = method2616(this.field2296);
			if (null == var5) {
				return var1.method4593(true);
			} else {
				var6 = var1.method4593(!var5.method3073());
				var3 &= 3;
				if (var3 == 1) {
					var6.method4602();
				} else if (var3 == 2) {
					var6.method4615();
				} else if (var3 == 3) {
					var6.method4684();
				}

				var6.method4607(var5, var2);
				if (var3 == 1) {
					var6.method4684();
				} else if (var3 == 2) {
					var6.method4615();
				} else if (var3 == 3) {
					var6.method4602();
				}

				return var6;
			}
		}
	}

	class232 method4020(class232 var1, int var2) {
		class232 var5;
		if (!this.method4004()) {
			var2 = this.field2300[var2];
			class227 var6 = method5280(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method4599(true);
			} else {
				var5 = var1.method4599(!var6.method4552(var2));
				var5.method4642(var6, var2);
				return var5;
			}
		} else {
			class134 var4 = method2616(this.field2296);
			if (var4 == null) {
				return var1.method4599(true);
			} else {
				var5 = var1.method4599(!var4.method3073());
				var5.method4607(var4, var2);
				return var5;
			}
		}
	}

	public class232 method4045(class232 var1, int var2, class204 var3, int var4) {
		if (field2298 && !this.method4004() && !var3.method4004()) {
			return this.method4002(var1, var2, var3, var4);
		} else {
			class232 var6 = var1.method4593(false);
			boolean var7 = false;
			class227 var8 = null;
			class222 var9 = null;
			class134 var10;
			if (this.method4004()) {
				var10 = this.method4024();
				if (null == var10) {
					return var6;
				}

				if (var3.method4004() && this.field2290 == null) {
					var6.method4607(var10, var2);
					return var6;
				}

				var9 = var10.field1591;
				var6.method4647(var9, var10, var2, this.field2290, false, !var3.method4004());
			} else {
				var2 = this.field2300[var2];
				var8 = method5280(var2 >> 16);
				var2 &= 65535;
				if (var8 == null) {
					return var3.method3998(var1, var4);
				}

				if (!var3.method4004() && (this.field2305 == null || var4 == -1)) {
					var6.method4642(var8, var2);
					return var6;
				}

				if (this.field2305 == null || var4 == -1) {
					var6.method4642(var8, var2);
					return var6;
				}

				var7 = var3.method4004();
				if (!var7) {
					var6.method4612(var8, var2, this.field2305, false);
				}
			}

			if (var3.method4004()) {
				var10 = var3.method4024();
				if (var10 == null) {
					return var6;
				}

				if (var9 == null) {
					var9 = var10.field1591;
				}

				var6.method4647(var9, var10, var4, this.field2290, true, true);
			} else {
				var4 = var3.field2300[var4];
				class227 var11 = method5280(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method3998(var1, var2);
				}

				var6.method4612(var11, var4, this.field2305, true);
			}

			if (var7 && var8 != null) {
				var6.method4612(var8, var2, this.field2305, false);
			}

			var6.method4605();
			return var6;
		}
	}

	class232 method4002(class232 var1, int var2, class204 var3, int var4) {
		var2 = this.field2300[var2];
		class227 var6 = method5280(var2 >> 16);
		var2 &= 65535;
		if (null == var6) {
			return var3.method3998(var1, var4);
		} else {
			var4 = var3.field2300[var4];
			class227 var7 = method5280(var4 >> 16);
			var4 &= 65535;
			class232 var8;
			if (null == var7) {
				var8 = var1.method4593(!var6.method4552(var2));
				var8.method4642(var6, var2);
				return var8;
			} else {
				var8 = var1.method4593(!var6.method4552(var2) & !var7.method4552(var4));
				var8.method4610(var6, var2, var7, var4, this.field2305);
				return var8;
			}
		}
	}

	public class232 method3999(class232 var1, int var2) {
		if (!this.method4004()) {
			int var4 = this.field2300[var2];
			class227 var5 = method5280(var4 >> 16);
			var4 &= 65535;
			if (var5 == null) {
				return var1.method4593(true);
			} else {
				class227 var6 = null;
				int var7 = 0;
				if (this.field2297 != null && var2 < this.field2297.length) {
					var7 = this.field2297[var2];
					var6 = method5280(var7 >> 16);
					var7 &= 65535;
				}

				class232 var8;
				if (null != var6 && var7 != 65535) {
					var8 = var1.method4593(!var5.method4552(var4) & !var6.method4552(var7));
					var8.method4642(var5, var4);
					var8.method4642(var6, var7);
					return var8;
				} else {
					var8 = var1.method4593(!var5.method4552(var4));
					var8.method4642(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method3998(var1, var2);
		}
	}

	public boolean method4004() {
		return this.field2296 >= 0;
	}

	public int method4005() {
		return this.field2299 - this.field2286;
	}

	class134 method4024() {
		return this.method4004() ? method2616(this.field2296) : null;
	}

	public static void method3281(class344 var0, class344 var1, class344 var2) {
		field2311 = var0;
		field2291 = var1;
		field2292 = var2;
	}

	static class227 method5280(int var0) {
		class227 var2 = (class227)field2302.method5461((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = class90.method2304(field2291, field2292, var0, false);
			if (var2 != null) {
				field2302.method5463(var2, (long)var0);
			}

			return var2;
		}
	}

	static class134 method2616(int var0) {
		if (class21.method305(var0) != 0) {
			return null;
		} else {
			class134 var3 = (class134)field2295.method5461((long)var0);
			class134 var2;
			if (null != var3) {
				var2 = var3;
			} else {
				var3 = class212.method4147(field2291, field2292, var0, false);
				if (null != var3) {
					field2295.method5463(var3, (long)var0);
				}

				var2 = var3;
			}

			return var2;
		}
	}
}
