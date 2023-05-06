public class class191 extends class444 {
	static class280 field2010;
	static class280 field2011;
	static class344 field2007;
	static class344 field2008;
	class464 field2041;
	int field2017;
	int field2033;
	int field2039;
	int field2040;
	int field2044;
	int field2047;
	int[] field2015;
	int[] field2051;
	int[] field2053;
	short[] field2032;
	short[] field2034;
	short[] field2052;
	public boolean field2014;
	public boolean field2025;
	public boolean field2028;
	public boolean field2037;
	public boolean field2048;
	public int field2009;
	public int field2012;
	public int field2016;
	public int field2018;
	public int field2019;
	public int field2020;
	public int field2021;
	public int field2022;
	public int field2023;
	public int field2024;
	public int field2026;
	public int field2029;
	public int field2030;
	public int field2031;
	public int field2038;
	public int field2042;
	public int field2046;
	public int field2049;
	public int field2050;
	public int[] field2045;
	public String field2013;
	public String[] field2036;
	public short[] field2027;
	public short[] field2035;

	static {
		field2010 = new class280(64);
		field2011 = new class280(50);
	}

	class191() {
		this.field2013 = class337.field3889;
		this.field2042 = 1;
		this.field2050 = -1;
		this.field2018 = -1;
		this.field2019 = -1;
		this.field2020 = -1;
		this.field2021 = -1;
		this.field2022 = -1;
		this.field2023 = -1;
		this.field2049 = -1;
		this.field2009 = -1;
		this.field2026 = -1;
		this.field2038 = -1;
		this.field2024 = -1;
		this.field2029 = -1;
		this.field2030 = -1;
		this.field2031 = -1;
		this.field2036 = new String[5];
		this.field2037 = true;
		this.field2046 = -1;
		this.field2039 = 128;
		this.field2040 = 128;
		this.field2028 = false;
		this.field2044 = 0;
		this.field2017 = 0;
		this.field2016 = 32;
		this.field2033 = -1;
		this.field2047 = -1;
		this.field2048 = true;
		this.field2014 = true;
		this.field2025 = false;
		this.field2051 = null;
		this.field2052 = null;
	}

	void method3645() {
	}

	void method3637(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3659(var1, var3);
		}
	}

	void method3659(class489 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method8658();
			this.field2015 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2015[var5] = var1.method8660();
			}
		} else if (var2 == 2) {
			this.field2013 = var1.method8669();
		} else if (var2 == 12) {
			this.field2042 = var1.method8658();
		} else if (var2 == 13) {
			this.field2050 = var1.method8660();
		} else if (var2 == 14) {
			this.field2020 = var1.method8660();
		} else if (var2 == 15) {
			this.field2018 = var1.method8660();
		} else if (var2 == 16) {
			this.field2019 = var1.method8660();
		} else if (var2 == 17) {
			this.field2020 = var1.method8660();
			this.field2021 = var1.method8660();
			this.field2022 = var1.method8660();
			this.field2023 = var1.method8660();
		} else if (var2 == 18) {
			var1.method8660();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2036[var2 - 30] = var1.method8669();
			if (this.field2036[var2 - 30].equalsIgnoreCase(class337.field4129)) {
				this.field2036[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method8658();
			this.field2032 = new short[var4];
			this.field2027 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2032[var5] = (short)var1.method8660();
				this.field2027[var5] = (short)var1.method8660();
			}
		} else if (var2 == 41) {
			var4 = var1.method8658();
			this.field2034 = new short[var4];
			this.field2035 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2034[var5] = (short)var1.method8660();
				this.field2035[var5] = (short)var1.method8660();
			}
		} else if (var2 == 60) {
			var4 = var1.method8658();
			this.field2053 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2053[var5] = var1.method8660();
			}
		} else if (var2 == 93) {
			this.field2037 = false;
		} else if (var2 == 95) {
			this.field2046 = var1.method8660();
		} else if (var2 == 97) {
			this.field2039 = var1.method8660();
		} else if (var2 == 98) {
			this.field2040 = var1.method8660();
		} else if (var2 == 99) {
			this.field2028 = true;
		} else if (var2 == 100) {
			this.field2044 = var1.method8659();
		} else if (var2 == 101) {
			this.field2017 = var1.method8659() * 5;
		} else {
			int var6;
			if (var2 == 102) {
				var4 = var1.method8658();
				var5 = 0;

				for (var6 = var4; var6 != 0; var6 >>= 1) {
					++var5;
				}

				this.field2051 = new int[var5];
				this.field2052 = new short[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					if ((var4 & 1 << var7) == 0) {
						this.field2051[var7] = -1;
						this.field2052[var7] = -1;
					} else {
						this.field2051[var7] = var1.method8710();
						this.field2052[var7] = (short)var1.method8675();
					}
				}
			} else if (var2 == 103) {
				this.field2016 = var1.method8660();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.field2048 = false;
				} else if (var2 == 109) {
					this.field2014 = false;
				} else if (var2 == 111) {
					this.field2025 = true;
				} else if (var2 == 114) {
					this.field2049 = var1.method8660();
				} else if (var2 == 115) {
					this.field2049 = var1.method8660();
					this.field2009 = var1.method8660();
					this.field2026 = var1.method8660();
					this.field2038 = var1.method8660();
				} else if (var2 == 116) {
					this.field2024 = var1.method8660();
				} else if (var2 == 117) {
					this.field2024 = var1.method8660();
					this.field2029 = var1.method8660();
					this.field2030 = var1.method8660();
					this.field2031 = var1.method8660();
				} else if (var2 == 249) {
					this.field2041 = class77.method2107(var1, this.field2041);
				}
			} else {
				this.field2033 = var1.method8660();
				if (65535 == this.field2033) {
					this.field2033 = -1;
				}

				this.field2047 = var1.method8660();
				if (this.field2047 == 65535) {
					this.field2047 = -1;
				}

				var4 = -1;
				if (var2 == 118) {
					var4 = var1.method8660();
					if (var4 == 65535) {
						var4 = -1;
					}
				}

				var5 = var1.method8658();
				this.field2045 = new int[var5 + 2];

				for (var6 = 0; var6 <= var5; ++var6) {
					this.field2045[var6] = var1.method8660();
					if (this.field2045[var6] == 65535) {
						this.field2045[var6] = -1;
					}
				}

				this.field2045[var5 + 1] = var4;
			}
		}

	}

	public final class232 method3639(class204 var1, int var2, class204 var3, int var4, class190 var5) {
		if (null != this.field2045) {
			class191 var12 = this.method3642();
			return var12 == null ? null : var12.method3639(var1, var2, var3, var4, var5);
		} else {
			long var7 = (long)this.field2012;
			if (null != var5) {
				var7 |= var5.field2003 << 16;
			}

			class232 var9 = (class232)field2011.method5461(var7);
			if (var9 == null) {
				class214 var10 = this.method3641(this.field2015, var5);
				if (var10 == null) {
					return null;
				}

				var9 = var10.method4177(64 + this.field2044, this.field2017 + 850, -30, -50, -30);
				field2011.method5463(var9, var7);
			}

			class232 var11;
			if (null != var1 && var3 != null) {
				var11 = var1.method4045(var9, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.method3998(var9, var2);
			} else if (var3 != null) {
				var11 = var3.method3998(var9, var4);
			} else {
				var11 = var9.method4593(true);
			}

			if (this.field2039 != 128 || this.field2040 != 128) {
				var11.method4663(this.field2039, this.field2040, this.field2039);
			}

			return var11;
		}
	}

	public final class214 method3640(class190 var1) {
		if (null != this.field2045) {
			class191 var3 = this.method3642();
			return null == var3 ? null : var3.method3640(var1);
		} else {
			return this.method3641(this.field2053, var1);
		}
	}

	class214 method3641(int[] var1, class190 var2) {
		int[] var4 = var1;
		if (var2 != null && var2.field2002 != null) {
			var4 = var2.field2002;
		}

		if (null == var4) {
			return null;
		} else {
			boolean var5 = false;

			for (int var6 = 0; var6 < var4.length; ++var6) {
				if (var4[var6] != -1 && !field2007.method6448(var4[var6], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				class214[] var10 = new class214[var4.length];

				for (int var7 = 0; var7 < var4.length; ++var7) {
					var10[var7] = class214.method4215(field2007, var4[var7], 0);
				}

				class214 var11;
				if (var10.length == 1) {
					var11 = var10[0];
					if (null == var11) {
						var11 = new class214(var10, var10.length);
					}
				} else {
					var11 = new class214(var10, var10.length);
				}

				short[] var8;
				int var9;
				if (null != this.field2032) {
					var8 = this.field2027;
					if (var2 != null && null != var2.field2001) {
						var8 = var2.field2001;
					}

					for (var9 = 0; var9 < this.field2032.length; ++var9) {
						var11.method4169(this.field2032[var9], var8[var9]);
					}
				}

				if (this.field2034 != null) {
					var8 = this.field2035;
					if (null != var2 && var2.field2004 != null) {
						var8 = var2.field2004;
					}

					for (var9 = 0; var9 < this.field2034.length; ++var9) {
						var11.method4220(this.field2034[var9], var8[var9]);
					}
				}

				return var11;
			}
		}
	}

	public final class191 method3642() {
		int var2 = -1;
		if (-1 != this.field2033) {
			var2 = class307.method5179(this.field2033);
		} else if (this.field2047 != -1) {
			var2 = class307.field3482[this.field2047];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2045.length - 1) {
			var3 = this.field2045[var2];
		} else {
			var3 = this.field2045[this.field2045.length - 1];
		}

		return var3 != -1 ? method6482(var3) : null;
	}

	public boolean method3643() {
		if (this.field2045 == null) {
			return true;
		} else {
			int var2 = -1;
			if (-1 != this.field2033) {
				var2 = class307.method5179(this.field2033);
			} else if (-1 != this.field2047) {
				var2 = class307.field3482[this.field2047];
			}

			if (var2 >= 0 && var2 < this.field2045.length) {
				return -1 != this.field2045[var2];
			} else {
				return this.field2045[this.field2045.length - 1] != -1;
			}
		}
	}

	public int method3644(int var1, int var2) {
		class464 var5 = this.field2041;
		int var4;
		if (null == var5) {
			var4 = var2;
		} else {
			class448 var6 = (class448)var5.method8360((long)var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = var6.field4744;
			}
		}

		return var4;
	}

	public String method3691(int var1, String var2) {
		return class187.method3620(this.field2041, var1, var2);
	}

	public boolean method3646() {
		return null != this.field2051 && this.field2052 != null;
	}

	public int[] method3647() {
		return this.field2051;
	}

	public int method3648(int var1) {
		return null != this.field2051 && var1 < this.field2051.length ? this.field2051[var1] : -1;
	}

	public short[] method3649() {
		return this.field2052;
	}

	public short method3653(int var1) {
		return null != this.field2052 && var1 < this.field2052.length ? this.field2052[var1] : -1;
	}

	public static void method1984(class344 var0, class344 var1) {
		field2008 = var0;
		field2007 = var1;
	}

	public static class191 method6482(int var0) {
		class191 var2 = (class191)field2010.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2008.method6468(9, var0);
			var2 = new class191();
			var2.field2012 = var0;
			if (null != var3) {
				var2.method3637(new class489(var3));
			}

			var2.method3645();
			field2010.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static void method3459() {
		field2010.method5467();
		field2011.method5467();
	}
}
