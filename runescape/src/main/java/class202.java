public class class202 extends class444 {
	public static class344 field2212;
	public static class379 field1505;
	static class280 field2214;
	static class280 field2215;
	static class280 field2216;
	class464 field2248;
	int field2209;
	int field2218;
	int field2219;
	int field2235;
	int field2238;
	int field2239;
	int field2240;
	int field2241;
	int field2242;
	int field2243;
	int field2244;
	int field2245;
	int field2246;
	int field2247;
	int field2250;
	int field2256;
	int field2257;
	int field2262;
	int field2265;
	int field2270;
	int[] field2251;
	int[] field2264;
	public boolean field2231;
	public boolean field2263;
	public int field2211;
	public int field2217;
	public int field2224;
	public int field2225;
	public int field2226;
	public int field2228;
	public int field2229;
	public int field2232;
	public int field2234;
	public int field2236;
	public int field2252;
	public int field2253;
	public int field2254;
	public int field2255;
	public int field2258;
	public int field2259;
	public int field2260;
	public int field2266;
	public int field2267;
	public String field2261;
	public String[] field2220;
	public String[] field2237;
	public short[] field2221;
	public short[] field2222;
	public short[] field2223;
	public short[] field2233;

	static {
		field2214 = new class280(64);
		field2215 = new class280(50);
		field2216 = new class280(200);
	}

	class202() {
		this.field2261 = class337.field3889;
		this.field2224 = 2000;
		this.field2225 = 0;
		this.field2226 = 0;
		this.field2260 = 0;
		this.field2228 = 0;
		this.field2229 = 0;
		this.field2236 = 0;
		this.field2211 = 1;
		this.field2232 = -1;
		this.field2217 = -1;
		this.field2234 = -1;
		this.field2231 = false;
		this.field2220 = new String[]{null, null, class337.field3837, null, null};
		this.field2237 = new String[]{null, null, null, null, class337.field4088};
		this.field2238 = -2;
		this.field2239 = -1;
		this.field2240 = -1;
		this.field2270 = 0;
		this.field2242 = -1;
		this.field2219 = -1;
		this.field2244 = 0;
		this.field2245 = -1;
		this.field2246 = -1;
		this.field2247 = -1;
		this.field2243 = -1;
		this.field2209 = -1;
		this.field2250 = -1;
		this.field2253 = -1;
		this.field2254 = -1;
		this.field2235 = 128;
		this.field2256 = 128;
		this.field2257 = 128;
		this.field2258 = 0;
		this.field2259 = 0;
		this.field2255 = 0;
		this.field2252 = 0;
		this.field2263 = false;
		this.field2241 = -1;
		this.field2265 = -1;
		this.field2266 = -1;
		this.field2267 = -1;
	}

	void method3961() {
		if (this.field2236 == 1) {
			this.field2252 = 0;
		}

	}

	void method3899(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3960(var1, var3);
		}
	}

	void method3960(class489 var1, int var2) {
		if (var2 == 1) {
			this.field2218 = var1.method8660();
		} else if (var2 == 2) {
			this.field2261 = var1.method8669();
		} else if (var2 == 4) {
			this.field2224 = var1.method8660();
		} else if (var2 == 5) {
			this.field2225 = var1.method8660();
		} else if (var2 == 6) {
			this.field2226 = var1.method8660();
		} else if (var2 == 7) {
			this.field2228 = var1.method8660();
			if (this.field2228 > 32767) {
				this.field2228 -= 65536;
			}
		} else if (var2 == 8) {
			this.field2229 = var1.method8660();
			if (this.field2229 > 32767) {
				this.field2229 -= 65536;
			}
		} else if (var2 == 9) {
			var1.method8669();
		} else if (var2 == 11) {
			this.field2236 = 1;
		} else if (var2 == 12) {
			this.field2211 = var1.method8664();
		} else if (var2 == 13) {
			this.field2232 = var1.method8658();
		} else if (var2 == 14) {
			this.field2217 = var1.method8658();
		} else if (var2 == 16) {
			this.field2231 = true;
		} else if (var2 == 23) {
			this.field2239 = var1.method8660();
			this.field2270 = var1.method8658();
		} else if (var2 == 24) {
			this.field2240 = var1.method8660();
		} else if (var2 == 25) {
			this.field2242 = var1.method8660();
			this.field2244 = var1.method8658();
		} else if (var2 == 26) {
			this.field2219 = var1.method8660();
		} else if (var2 == 27) {
			this.field2234 = var1.method8658();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2220[var2 - 30] = var1.method8669();
			if (this.field2220[var2 - 30].equalsIgnoreCase(class337.field4129)) {
				this.field2220[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.field2237[var2 - 35] = var1.method8669();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method8658();
				this.field2222 = new short[var4];
				this.field2221 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2222[var5] = (short)var1.method8660();
					this.field2221[var5] = (short)var1.method8660();
				}
			} else if (var2 == 41) {
				var4 = var1.method8658();
				this.field2233 = new short[var4];
				this.field2223 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2233[var5] = (short)var1.method8660();
					this.field2223[var5] = (short)var1.method8660();
				}
			} else if (var2 == 42) {
				this.field2238 = var1.method8659();
			} else if (var2 == 65) {
				this.field2263 = true;
			} else if (var2 == 75) {
				this.field2252 = var1.method8855();
			} else if (var2 == 78) {
				this.field2245 = var1.method8660();
			} else if (var2 == 79) {
				this.field2246 = var1.method8660();
			} else if (var2 == 90) {
				this.field2247 = var1.method8660();
			} else if (var2 == 91) {
				this.field2209 = var1.method8660();
			} else if (var2 == 92) {
				this.field2243 = var1.method8660();
			} else if (var2 == 93) {
				this.field2250 = var1.method8660();
			} else if (var2 == 94) {
				var1.method8660();
			} else if (var2 == 95) {
				this.field2260 = var1.method8660();
			} else if (var2 == 97) {
				this.field2253 = var1.method8660();
			} else if (var2 == 98) {
				this.field2254 = var1.method8660();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.field2251 == null) {
					this.field2251 = new int[10];
					this.field2264 = new int[10];
				}

				this.field2251[var2 - 100] = var1.method8660();
				this.field2264[var2 - 100] = var1.method8660();
			} else if (var2 == 110) {
				this.field2235 = var1.method8660();
			} else if (var2 == 111) {
				this.field2256 = var1.method8660();
			} else if (var2 == 112) {
				this.field2257 = var1.method8660();
			} else if (var2 == 113) {
				this.field2258 = var1.method8659();
			} else if (var2 == 114) {
				this.field2259 = var1.method8659() * 5;
			} else if (var2 == 115) {
				this.field2255 = var1.method8658();
			} else if (var2 == 139) {
				this.field2241 = var1.method8660();
			} else if (var2 == 140) {
				this.field2265 = var1.method8660();
			} else if (var2 == 148) {
				this.field2266 = var1.method8660();
			} else if (var2 == 149) {
				this.field2267 = var1.method8660();
			} else if (var2 == 249) {
				this.field2248 = class77.method2107(var1, this.field2248);
			}
		}

	}

	void method3903(class202 var1, class202 var2) {
		this.field2218 = var1.field2218;
		this.field2224 = var1.field2224;
		this.field2225 = var1.field2225;
		this.field2226 = var1.field2226;
		this.field2260 = var1.field2260;
		this.field2228 = var1.field2228;
		this.field2229 = var1.field2229;
		this.field2222 = var1.field2222;
		this.field2221 = var1.field2221;
		this.field2233 = var1.field2233;
		this.field2223 = var1.field2223;
		this.field2261 = var2.field2261;
		this.field2231 = var2.field2231;
		this.field2211 = var2.field2211;
		this.field2236 = 1;
	}

	void method3904(class202 var1, class202 var2) {
		this.field2218 = var1.field2218;
		this.field2224 = var1.field2224;
		this.field2225 = var1.field2225;
		this.field2226 = var1.field2226;
		this.field2260 = var1.field2260;
		this.field2228 = var1.field2228;
		this.field2229 = var1.field2229;
		this.field2222 = var2.field2222;
		this.field2221 = var2.field2221;
		this.field2233 = var2.field2233;
		this.field2223 = var2.field2223;
		this.field2261 = var2.field2261;
		this.field2231 = var2.field2231;
		this.field2236 = var2.field2236;
		this.field2232 = var2.field2232;
		this.field2217 = var2.field2217;
		this.field2234 = var2.field2234;
		this.field2239 = var2.field2239;
		this.field2240 = var2.field2240;
		this.field2245 = var2.field2245;
		this.field2242 = var2.field2242;
		this.field2219 = var2.field2219;
		this.field2246 = var2.field2246;
		this.field2247 = var2.field2247;
		this.field2243 = var2.field2243;
		this.field2209 = var2.field2209;
		this.field2250 = var2.field2250;
		this.field2255 = var2.field2255;
		this.field2220 = var2.field2220;
		this.field2252 = var2.field2252;
		this.field2237 = new String[5];
		if (null != var2.field2237) {
			for (int var4 = 0; var4 < 4; ++var4) {
				this.field2237[var4] = var2.field2237[var4];
			}
		}

		this.field2237[4] = class337.field3843;
		this.field2211 = 0;
	}

	void method3901(class202 var1, class202 var2) {
		this.field2218 = var1.field2218;
		this.field2224 = var1.field2224;
		this.field2225 = var1.field2225;
		this.field2226 = var1.field2226;
		this.field2260 = var1.field2260;
		this.field2228 = var1.field2228;
		this.field2229 = var1.field2229;
		this.field2222 = var1.field2222;
		this.field2221 = var1.field2221;
		this.field2233 = var1.field2233;
		this.field2223 = var1.field2223;
		this.field2236 = var1.field2236;
		this.field2261 = var2.field2261;
		this.field2211 = 0;
		this.field2231 = false;
		this.field2263 = false;
	}

	public final class214 method3964(int var1) {
		int var4;
		if (null != this.field2251 && var1 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2264[var4] && this.field2264[var4] != 0) {
					var3 = this.field2251[var4];
				}
			}

			if (var3 != -1) {
				return class92.method2352(var3).method3964(1);
			}
		}

		class214 var5 = class214.method4215(field2212, this.field2218, 0);
		if (var5 == null) {
			return null;
		} else {
			if (this.field2235 != 128 || this.field2256 != 128 || this.field2257 != 128) {
				var5.method4172(this.field2235, this.field2256, this.field2257);
			}

			if (this.field2222 != null) {
				for (var4 = 0; var4 < this.field2222.length; ++var4) {
					var5.method4169(this.field2222[var4], this.field2221[var4]);
				}
			}

			if (null != this.field2233) {
				for (var4 = 0; var4 < this.field2233.length; ++var4) {
					var5.method4220(this.field2233[var4], this.field2223[var4]);
				}
			}

			return var5;
		}
	}

	public final class232 method3925(int var1) {
		if (null != this.field2251 && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2264[var4] && 0 != this.field2264[var4]) {
					var3 = this.field2251[var4];
				}
			}

			if (var3 != -1) {
				return class92.method2352(var3).method3925(1);
			}
		}

		class232 var6 = (class232)field2215.method5461((long)this.field2262);
		if (null != var6) {
			return var6;
		} else {
			class214 var7 = class214.method4215(field2212, this.field2218, 0);
			if (null == var7) {
				return null;
			} else {
				if (this.field2235 != 128 || this.field2256 != 128 || 128 != this.field2257) {
					var7.method4172(this.field2235, this.field2256, this.field2257);
				}

				int var5;
				if (this.field2222 != null) {
					for (var5 = 0; var5 < this.field2222.length; ++var5) {
						var7.method4169(this.field2222[var5], this.field2221[var5]);
					}
				}

				if (null != this.field2233) {
					for (var5 = 0; var5 < this.field2233.length; ++var5) {
						var7.method4220(this.field2233[var5], this.field2223[var5]);
					}
				}

				var6 = var7.method4177(64 + this.field2258, this.field2259 + 768, -50, -10, -50);
				var6.field2714 = true;
				field2215.method5463(var6, (long)this.field2262);
				return var6;
			}
		}
	}

	public class202 method3908(int var1) {
		if (this.field2251 != null && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2264[var4] && 0 != this.field2264[var4]) {
					var3 = this.field2251[var4];
				}
			}

			if (var3 != -1) {
				return class92.method2352(var3);
			}
		}

		return this;
	}

	public final boolean method3909(int var1) {
		int var3 = this.field2239;
		int var4 = this.field2240;
		int var5 = this.field2245;
		if (var1 == 1) {
			var3 = this.field2242;
			var4 = this.field2219;
			var5 = this.field2246;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!field2212.method6448(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !field2212.method6448(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !field2212.method6448(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	public final class214 method3922(int var1) {
		int var3 = this.field2239;
		int var4 = this.field2240;
		int var5 = this.field2245;
		if (var1 == 1) {
			var3 = this.field2242;
			var4 = this.field2219;
			var5 = this.field2246;
		}

		if (var3 == -1) {
			return null;
		} else {
			class214 var6 = class214.method4215(field2212, var3, 0);
			if (var4 != -1) {
				class214 var7 = class214.method4215(field2212, var4, 0);
				if (var5 != -1) {
					class214 var8 = class214.method4215(field2212, var5, 0);
					class214[] var9 = new class214[]{var6, var7, var8};
					var6 = new class214(var9, 3);
				} else {
					class214[] var11 = new class214[]{var6, var7};
					var6 = new class214(var11, 2);
				}
			}

			if (var1 == 0 && 0 != this.field2270) {
				var6.method4168(0, this.field2270, 0);
			}

			if (var1 == 1 && this.field2244 != 0) {
				var6.method4168(0, this.field2244, 0);
			}

			int var10;
			if (this.field2222 != null) {
				for (var10 = 0; var10 < this.field2222.length; ++var10) {
					var6.method4169(this.field2222[var10], this.field2221[var10]);
				}
			}

			if (this.field2233 != null) {
				for (var10 = 0; var10 < this.field2233.length; ++var10) {
					var6.method4220(this.field2233[var10], this.field2223[var10]);
				}
			}

			return var6;
		}
	}

	public final boolean method3911(int var1) {
		int var3 = this.field2247;
		int var4 = this.field2243;
		if (var1 == 1) {
			var3 = this.field2209;
			var4 = this.field2250;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!field2212.method6448(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !field2212.method6448(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final class214 method3912(int var1) {
		int var3 = this.field2247;
		int var4 = this.field2243;
		if (var1 == 1) {
			var3 = this.field2209;
			var4 = this.field2250;
		}

		if (var3 == -1) {
			return null;
		} else {
			class214 var5 = class214.method4215(field2212, var3, 0);
			if (var4 != -1) {
				class214 var6 = class214.method4215(field2212, var4, 0);
				class214[] var7 = new class214[]{var5, var6};
				var5 = new class214(var7, 2);
			}

			int var8;
			if (null != this.field2222) {
				for (var8 = 0; var8 < this.field2222.length; ++var8) {
					var5.method4169(this.field2222[var8], this.field2221[var8]);
				}
			}

			if (null != this.field2233) {
				for (var8 = 0; var8 < this.field2233.length; ++var8) {
					var5.method4220(this.field2233[var8], this.field2223[var8]);
				}
			}

			return var5;
		}
	}

	public int method3913(int var1, int var2) {
		class464 var5 = this.field2248;
		int var4;
		if (null == var5) {
			var4 = var2;
		} else {
			class448 var6 = (class448)var5.method8360((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = var6.field4744;
			}
		}

		return var4;
	}

	public String method3914(int var1, String var2) {
		return class187.method3620(this.field2248, var1, var2);
	}

	public int method3915() {
		if (this.field2238 != -1 && this.field2237 != null) {
			if (this.field2238 >= 0) {
				return this.field2237[this.field2238] != null ? this.field2238 : -1;
			} else {
				return class337.field4088.equalsIgnoreCase(this.field2237[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	boolean method3900() {
		return null != this.field2221;
	}

	boolean method3916() {
		return this.field2223 != null;
	}

	public static void method7135() {
		field2214.method5467();
		field2215.method5467();
		field2216.method5467();
	}

	public static void method3055() {
		field2216.method5467();
	}
}
