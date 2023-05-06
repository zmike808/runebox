public class class201 extends class444 {
	public static class280 field2160;
	static boolean field2191;
	static class214[] field2163;
	static class280 field2159;
	static class280 field2161;
	static class280 field2185;
	static class344 field1762;
	boolean field2180;
	boolean field2187;
	boolean field2196;
	class464 field2203;
	int field2162;
	int field2164;
	int field2177;
	int field2183;
	int field2189;
	int field2190;
	int field2192;
	int field2193;
	int field2194;
	int field2199;
	int field2200;
	int[] field2165;
	int[] field2166;
	short[] field2157;
	short[] field2169;
	short[] field2170;
	short[] field2171;
	public boolean field2175;
	public boolean field2179;
	public boolean field2188;
	public boolean field2195;
	public boolean field2206;
	public int field2167;
	public int field2172;
	public int field2173;
	public int field2176;
	public int field2178;
	public int field2181;
	public int field2182;
	public int field2186;
	public int field2197;
	public int field2201;
	public int field2202;
	public int field2204;
	public int field2205;
	public int field2207;
	public int[] field2168;
	public int[] field2198;
	public String field2184;
	public String[] field2174;

	static {
		field2191 = false;
		field2159 = new class280(4096);
		field2160 = new class280(500);
		field2161 = new class280(30);
		field2185 = new class280(30);
		field2163 = new class214[4];
	}

	class201() {
		this.field2184 = class337.field3889;
		this.field2172 = 1;
		this.field2173 = 1;
		this.field2178 = 2;
		this.field2175 = true;
		this.field2176 = -1;
		this.field2177 = -1;
		this.field2180 = false;
		this.field2179 = false;
		this.field2167 = -1;
		this.field2181 = 16;
		this.field2164 = 0;
		this.field2183 = 0;
		this.field2174 = new String[5];
		this.field2182 = -1;
		this.field2197 = -1;
		this.field2187 = false;
		this.field2188 = true;
		this.field2189 = 128;
		this.field2190 = 128;
		this.field2162 = 128;
		this.field2192 = 0;
		this.field2193 = 0;
		this.field2194 = 0;
		this.field2195 = false;
		this.field2196 = false;
		this.field2207 = -1;
		this.field2199 = -1;
		this.field2200 = -1;
		this.field2201 = -1;
		this.field2202 = 0;
		this.field2205 = 0;
		this.field2204 = 0;
		this.field2206 = true;
	}

	void method3849() {
		if (this.field2176 == -1) {
			this.field2176 = 0;
			if (null != this.field2165 && (null == this.field2166 || this.field2166[0] == 10)) {
				this.field2176 = 1;
			}

			for (int var2 = 0; var2 < 5; ++var2) {
				if (this.field2174[var2] != null) {
					this.field2176 = 1;
				}
			}
		}

		if (-1 == this.field2207) {
			this.field2207 = this.field2178 != 0 ? 1 : 0;
		}

	}

	void method3850(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3851(var1, var3, (byte)16);
		}
	}

	void method3851(class489 var1, int var2, byte var3) {
		int var4;
		int var5;
		if (var2 == 1) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			var4 = var1.method8658();
			if (var4 > 0) {
				if (var3 == -1) {
					return;
				}

				if (this.field2165 != null) {
					if (var3 == -1) {
						throw new IllegalStateException();
					}

					if (!field2191) {
						var1.field4989 += var4 * 3;
						return;
					}

					if (var3 == -1) {
						return;
					}
				}

				this.field2166 = new int[var4];
				this.field2165 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					if (var3 == -1) {
						throw new IllegalStateException();
					}

					this.field2165[var5] = var1.method8660();
					this.field2166[var5] = var1.method8658();
				}
			}
		} else if (var2 == 2) {
			this.field2184 = var1.method8669();
		} else if (var2 == 5) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			var4 = var1.method8658();
			if (var4 > 0) {
				if (this.field2165 != null && !field2191) {
					var1.field4989 += var4 * 2;
				} else {
					this.field2166 = null;
					this.field2165 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						if (var3 == -1) {
							throw new IllegalStateException();
						}

						this.field2165[var5] = var1.method8660();
					}
				}
			}
		} else if (var2 == 14) {
			if (var3 == -1) {
				return;
			}

			this.field2172 = var1.method8658();
		} else if (var2 == 15) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2173 = var1.method8658();
		} else if (var2 == 17) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2178 = 0;
			this.field2175 = false;
		} else if (var2 == 18) {
			this.field2175 = false;
		} else if (var2 == 19) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2176 = var1.method8658();
		} else if (var2 == 21) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2177 = 0;
		} else if (var2 == 22) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2180 = true;
		} else if (var2 == 23) {
			this.field2179 = true;
		} else if (var2 == 24) {
			this.field2167 = var1.method8660();
			if (65535 == this.field2167) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2167 = -1;
			}
		} else if (var2 == 27) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2178 = 1;
		} else if (var2 == 28) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2181 = var1.method8658();
		} else if (var2 == 29) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			this.field2164 = var1.method8659();
		} else if (var2 == 39) {
			this.field2183 = var1.method8659() * 25;
		} else {
			if (var2 >= 30) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				if (var2 < 35) {
					this.field2174[var2 - 30] = var1.method8669();
					if (this.field2174[var2 - 30].equalsIgnoreCase(class337.field4129)) {
						if (var3 == -1) {
							throw new IllegalStateException();
						}

						this.field2174[var2 - 30] = null;
					}

					return;
				}
			}

			if (var2 == 40) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				var4 = var1.method8658();
				this.field2171 = new short[var4];
				this.field2169 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2171[var5] = (short)var1.method8660();
					this.field2169[var5] = (short)var1.method8660();
				}
			} else if (var2 == 41) {
				if (var3 == -1) {
					return;
				}

				var4 = var1.method8658();
				this.field2170 = new short[var4];
				this.field2157 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					if (var3 == -1) {
						throw new IllegalStateException();
					}

					this.field2170[var5] = (short)var1.method8660();
					this.field2157[var5] = (short)var1.method8660();
				}
			} else if (var2 == 61) {
				var1.method8660();
			} else if (var2 == 62) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2187 = true;
			} else if (var2 == 64) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2188 = false;
			} else if (var2 == 65) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2189 = var1.method8660();
			} else if (var2 == 66) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2190 = var1.method8660();
			} else if (var2 == 67) {
				if (var3 == -1) {
					return;
				}

				this.field2162 = var1.method8660();
			} else if (var2 == 68) {
				this.field2197 = var1.method8660();
			} else if (var2 == 69) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				var1.method8658();
			} else if (var2 == 70) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2192 = var1.method8855();
			} else if (var2 == 71) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2193 = var1.method8855();
			} else if (var2 == 72) {
				if (var3 == -1) {
					return;
				}

				this.field2194 = var1.method8855();
			} else if (var2 == 73) {
				if (var3 == -1) {
					return;
				}

				this.field2195 = true;
			} else if (var2 == 74) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.field2196 = true;
			} else if (var2 == 75) {
				if (var3 == -1) {
					return;
				}

				this.field2207 = var1.method8658();
			} else {
				if (var2 != 77) {
					if (var2 != 92) {
						if (var2 == 78) {
							if (var3 == -1) {
								throw new IllegalStateException();
							}

							this.field2201 = var1.method8660();
							this.field2202 = var1.method8658();
							return;
						} else if (var2 == 79) {
							if (var3 == -1) {
								throw new IllegalStateException();
							}

							this.field2205 = var1.method8660();
							this.field2204 = var1.method8660();
							this.field2202 = var1.method8658();
							var4 = var1.method8658();
							this.field2168 = new int[var4];

							for (var5 = 0; var5 < var4; ++var5) {
								this.field2168[var5] = var1.method8660();
							}

							return;
						} else if (var2 == 81) {
							this.field2177 = var1.method8658() * 256;
							return;
						} else if (var2 == 82) {
							if (var3 == -1) {
								return;
							}

							this.field2182 = var1.method8660();
							return;
						} else {
							if (var2 == 89) {
								if (var3 == -1) {
									throw new IllegalStateException();
								}

								this.field2206 = false;
							} else if (var2 == 249) {
								this.field2203 = class77.method2107(var1, this.field2203);
								return;
							}

							return;
						}
					}

					if (var3 == -1) {
						throw new IllegalStateException();
					}
				}

				this.field2199 = var1.method8660();
				if (this.field2199 == 65535) {
					if (var3 == -1) {
						return;
					}

					this.field2199 = -1;
				}

				this.field2200 = var1.method8660();
				if (this.field2200 == 65535) {
					this.field2200 = -1;
				}

				var4 = -1;
				if (var2 == 92) {
					if (var3 == -1) {
						throw new IllegalStateException();
					}

					var4 = var1.method8660();
					if (var4 == 65535) {
						if (var3 == -1) {
							return;
						}

						var4 = -1;
					}
				}

				var5 = var1.method8658();
				this.field2198 = new int[var5 + 2];

				for (int var6 = 0; var6 <= var5; ++var6) {
					this.field2198[var6] = var1.method8660();
					if (this.field2198[var6] == 65535) {
						if (var3 == -1) {
							throw new IllegalStateException();
						}

						this.field2198[var6] = -1;
					}
				}

				this.field2198[var5 + 1] = var4;
			}
		}

	}

	public final boolean method3852(int var1) {
		if (this.field2166 != null) {
			for (int var5 = 0; var5 < this.field2166.length; ++var5) {
				if (this.field2166[var5] == var1) {
					return field1762.method6448(this.field2165[var5] & 65535, 0);
				}
			}

			return true;
		} else if (null == this.field2165) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var4 = 0; var4 < this.field2165.length; ++var4) {
				var3 &= field1762.method6448(this.field2165[var4] & 65535, 0);
			}

			return var3;
		}
	}

	public final boolean method3864() {
		if (this.field2165 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2165.length; ++var3) {
				var2 &= field1762.method6448(this.field2165[var3] & 65535, 0);
			}

			return var2;
		}
	}

	public final class225 method3853(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
		long var8;
		if (this.field2166 == null) {
			if (var7 >= -1) {
				throw new IllegalStateException();
			}

			var8 = (long)((this.field2186 << 10) + var2);
		} else {
			var8 = (long)(var2 + (this.field2186 << 10) + (var1 << 3));
		}

		Object var10 = (class225)field2161.method5461(var8);
		if (null == var10) {
			if (var7 >= -1) {
				throw new IllegalStateException();
			}

			class214 var11 = this.method3856(var1, var2);
			if (var11 == null) {
				if (var7 >= -1) {
					throw new IllegalStateException();
				}

				return null;
			}

			if (!this.field2180) {
				if (var7 >= -1) {
					throw new IllegalStateException();
				}

				var10 = var11.method4177(64 + this.field2164, 768 + this.field2183, -50, -10, -50);
			} else {
				var11.field2433 = (short)(this.field2164 + 64);
				var11.field2425 = (short)(this.field2183 + 768);
				var11.method4237();
				var10 = var11;
			}

			field2161.method5463((class444)var10, var8);
		}

		if (this.field2180) {
			if (var7 >= -1) {
				throw new IllegalStateException();
			}

			var10 = ((class214)var10).method4185();
		}

		if (this.field2177 >= 0) {
			if (var7 >= -1) {
				throw new IllegalStateException();
			}

			if (var10 instanceof class232) {
				var10 = ((class232)var10).method4597(var3, var4, var5, var6, true, this.field2177);
			} else if (var10 instanceof class214) {
				if (var7 >= -1) {
					throw new IllegalStateException();
				}

				var10 = ((class214)var10).method4162(var3, var4, var5, var6, true, this.field2177);
			}
		}

		return (class225)var10;
	}

	public final class232 method3858(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (null == this.field2166) {
			var8 = (long)((this.field2186 << 10) + var2);
		} else {
			var8 = (long)((this.field2186 << 10) + (var1 << 3) + var2);
		}

		class232 var10 = (class232)field2185.method5461(var8);
		if (var10 == null) {
			class214 var11 = this.method3856(var1, var2);
			if (var11 == null) {
				return null;
			}

			var10 = var11.method4177(this.field2164 + 64, 768 + this.field2183, -50, -10, -50);
			field2185.method5463(var10, var8);
		}

		if (this.field2177 >= 0) {
			var10 = var10.method4597(var3, var4, var5, var6, true, this.field2177);
		}

		return var10;
	}

	public final class232 method3855(int var1, int var2, int[][] var3, int var4, int var5, int var6, class204 var7, int var8) {
		long var10;
		if (null == this.field2166) {
			var10 = (long)(var2 + (this.field2186 << 10));
		} else {
			var10 = (long)(var2 + (this.field2186 << 10) + (var1 << 3));
		}

		class232 var12 = (class232)field2185.method5461(var10);
		if (var12 == null) {
			class214 var13 = this.method3856(var1, var2);
			if (var13 == null) {
				return null;
			}

			var12 = var13.method4177(64 + this.field2164, 768 + this.field2183, -50, -10, -50);
			field2185.method5463(var12, var10);
		}

		if (var7 == null && -1 == this.field2177) {
			return var12;
		} else {
			if (null != var7) {
				var12 = var7.method4028(var12, var8, var2);
			} else {
				var12 = var12.method4593(true);
			}

			if (this.field2177 >= 0) {
				var12 = var12.method4597(var3, var4, var5, var6, false, this.field2177);
			}

			return var12;
		}
	}

	final class214 method3856(int var1, int var2) {
		class214 var4 = null;
		boolean var5;
		int var6;
		int var8;
		if (this.field2166 == null) {
			if (var1 != 10) {
				return null;
			}

			if (null == this.field2165) {
				return null;
			}

			var5 = this.field2187;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}

			var6 = this.field2165.length;

			for (int var7 = 0; var7 < var6; ++var7) {
				var8 = this.field2165[var7];
				if (var5) {
					var8 += 65536;
				}

				var4 = (class214)field2160.method5461((long)var8);
				if (null == var4) {
					var4 = class214.method4215(field1762, var8 & 65535, 0);
					if (var4 == null) {
						return null;
					}

					if (var5) {
						var4.method4171();
					}

					field2160.method5463(var4, (long)var8);
				}

				if (var6 > 1) {
					field2163[var7] = var4;
				}
			}

			if (var6 > 1) {
				var4 = new class214(field2163, var6);
			}
		} else {
			int var9 = -1;

			for (var6 = 0; var6 < this.field2166.length; ++var6) {
				if (this.field2166[var6] == var1) {
					var9 = var6;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var6 = this.field2165[var9];
			boolean var10 = this.field2187 ^ var2 > 3;
			if (var10) {
				var6 += 65536;
			}

			var4 = (class214)field2160.method5461((long)var6);
			if (null == var4) {
				var4 = class214.method4215(field1762, var6 & 65535, 0);
				if (null == var4) {
					return null;
				}

				if (var10) {
					var4.method4171();
				}

				field2160.method5463(var4, (long)var6);
			}
		}

		if (128 == this.field2189 && 128 == this.field2190 && this.field2162 == 128) {
			var5 = false;
		} else {
			var5 = true;
		}

		boolean var11;
		if (this.field2192 == 0 && 0 == this.field2193 && this.field2194 == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		class214 var12 = new class214(var4, var2 == 0 && !var5 && !var11, this.field2171 == null, this.field2170 == null, true);
		if (var1 == 4 && var2 > 3) {
			var12.method4233(256);
			var12.method4168(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var12.method4164();
		} else if (var2 == 2) {
			var12.method4167();
		} else if (var2 == 3) {
			var12.method4166();
		}

		if (this.field2171 != null) {
			for (var8 = 0; var8 < this.field2171.length; ++var8) {
				var12.method4169(this.field2171[var8], this.field2169[var8]);
			}
		}

		if (null != this.field2170) {
			for (var8 = 0; var8 < this.field2170.length; ++var8) {
				var12.method4220(this.field2170[var8], this.field2157[var8]);
			}
		}

		if (var5) {
			var12.method4172(this.field2189, this.field2190, this.field2162);
		}

		if (var11) {
			var12.method4168(this.field2192, this.field2193, this.field2194);
		}

		return var12;
	}

	public final class201 method3857() {
		int var2 = -1;
		if (-1 != this.field2199) {
			var2 = class307.method5179(this.field2199);
		} else if (this.field2200 != -1) {
			var2 = class307.field3482[this.field2200];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2198.length - 1) {
			var3 = this.field2198[var2];
		} else {
			var3 = this.field2198[this.field2198.length - 1];
		}

		return var3 != -1 ? class145.method3177(var3) : null;
	}

	public int method3863(int var1, int var2) {
		class464 var5 = this.field2203;
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

	public String method3885(int var1, String var2) {
		return class187.method3620(this.field2203, var1, var2);
	}

	public boolean method3860() {
		if (this.field2198 == null) {
			return this.field2201 != -1 || null != this.field2168;
		} else {
			for (int var2 = 0; var2 < this.field2198.length; ++var2) {
				if (-1 != this.field2198[var2]) {
					class201 var3 = class145.method3177(this.field2198[var2]);
					if (-1 != var3.field2201 || var3.field2168 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public static boolean method3898(int var0) {
		return 0 != (var0 >> 22 & 1);
	}

	public static void method1931(class344 var0, class344 var1, boolean var2) {
		class145.field2158 = var0;
		field1762 = var1;
		field2191 = var2;
	}

	static class75 method3896(int var0, int var1) {
		class75 var3 = (class75)class75.field972.method5461((long)(var0 << 16));
		if (var3 != null) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = class75.field1541.method6464(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = class75.field1541.method6501(var5);
				if (var6 != null) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = class34.method508(var6);
					if (var3 != null) {
						class75.field972.method5463(var3, (long)(var0 << 16));
						return var3;
					}
				}

				return null;
			}
		}
	}

	public static void method189() {
		field2159.method5467();
		field2160.method5467();
		field2161.method5467();
		field2185.method5467();
	}

	static int method3869(int var0, class75 var1, boolean var2) {
		if (var0 == 3200) {
			class67.field836 -= 3;
			Client.method3071(class67.field843[class67.field836], class67.field843[1 + class67.field836], class67.field843[class67.field836 + 2]);
			return 1;
		} else if (var0 == 3201) {
			class2.method11(class67.field843[--class67.field836]);
			return 1;
		} else if (var0 == 3202) {
			class67.field836 -= 2;
			class209.method4118(class67.field843[class67.field836], class67.field843[class67.field836 + 1]);
			return 1;
		} else {
			class87 var4;
			class86 var5;
			int var6;
			int var7;
			String var10;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				boolean var9;
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					if (var0 == 3211) {
						return 1;
					} else {
						int var11;
						int var13;
						if (var0 == 3216) {
							var11 = class67.field843[--class67.field836];
							var13 = 0;
							class87 var17 = (class87)class199.method3788(class87.method6373(), var11);
							if (var17 != null) {
								var13 = class87.field1081 != var17 ? 1 : 0;
							}

							class67.field843[++class67.field836 - 1] = var13;
							return 1;
						} else if (var0 == 3218) {
							var11 = class67.field843[--class67.field836];
							var13 = 0;
							class86 var16 = (class86)class199.method3788(class86.method2928(), var11);
							if (var16 != null) {
								var13 = var16 != class86.field1066 ? 1 : 0;
							}

							class67.field843[++class67.field836 - 1] = var13;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							return 2;
						} else {
							var4 = class87.field1081;
							var5 = class86.field1066;
							var9 = true;
							boolean var15 = true;
							int var8;
							if (var0 == 3217) {
								var8 = class67.field843[--class67.field836];
								var4 = (class87)class199.method3788(class87.method6373(), var8);
								if (null == var4) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}

							if (var0 == 3219) {
								var8 = class67.field843[--class67.field836];
								var5 = (class86)class199.method3788(class86.method2928(), var8);
								if (null == var5) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}

							String var12;
							byte var14;
							if (class86.field1066 == var5) {
								switch(var4.field1082) {
								case 1:
								case 2:
								case 3:
									var14 = 0;
									var7 = 1;
									break;
								case 4:
									var14 = 0;
									var7 = Integer.MAX_VALUE;
									break;
								case 5:
									var14 = 0;
									var7 = 100;
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var4.toString());
									throw new RuntimeException(var12);
								}
							} else {
								switch(var5.field1067) {
								case 1:
									var14 = 0;
									var7 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var14 = 0;
									var7 = 100;
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var5.toString());
									throw new RuntimeException(var12);
								}
							}

							class67.field843[++class67.field836 - 1] = var14;
							class67.field843[++class67.field836 - 1] = var7;
							return 1;
						}
					}
				} else {
					var4 = class87.field1081;
					var5 = class86.field1066;
					var9 = false;
					if (var0 == 3214) {
						var7 = class67.field843[--class67.field836];
						var4 = (class87)class199.method3788(class87.method6373(), var7);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == 3215) {
						var7 = class67.field843[--class67.field836];
						var5 = (class86)class199.method3788(class86.method2928(), var7);
						if (null == var5) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == 3210) {
						var7 = class67.field843[--class67.field836];
						var4 = (class87)class199.method3788(class87.method6373(), var7);
						if (var4 == null) {
							var5 = (class86)class199.method3788(class86.method2928(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3182) {
						var4 = class87.field1079;
					} else if (var0 == 3204) {
						var5 = class86.field1071;
					} else if (var0 == 3206) {
						var5 = class86.field1065;
					} else if (var0 == 3208) {
						var5 = class86.field1068;
					}

					if (var5 == class86.field1066) {
						switch(var4.field1082) {
						case 1:
							var6 = Client.field112.method2394() ? 1 : 0;
							break;
						case 2:
							var6 = Client.field112.method2478() ? 1 : 0;
							break;
						case 3:
							var6 = Client.field112.method2399() ? 1 : 0;
							break;
						case 4:
							var6 = Client.field112.method2411();
							break;
						case 5:
							var6 = Client.method2655();
							break;
						default:
							var10 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var10);
						}
					} else {
						switch(var5.field1067) {
						case 1:
							var6 = Client.field112.method2457() ? 1 : 0;
							break;
						case 2:
							var7 = Client.field112.method2405();
							var6 = Math.round((float)(var7 * 100) / 255.0F);
							break;
						case 3:
							var7 = Client.field112.method2407();
							var6 = Math.round((float)(var7 * 100) / 127.0F);
							break;
						case 4:
							var7 = Client.field112.method2409();
							var6 = Math.round((float)(var7 * 100) / 127.0F);
							break;
						default:
							var10 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var10);
						}
					}

					class67.field843[++class67.field836 - 1] = var6;
					return 1;
				}
			} else {
				var4 = class87.field1081;
				var5 = class86.field1066;
				var6 = class67.field843[--class67.field836];
				if (var0 == 3212) {
					var7 = class67.field843[--class67.field836];
					var4 = (class87)class199.method3788(class87.method6373(), var7);
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var7));
					}
				}

				if (var0 == 3213) {
					var7 = class67.field843[--class67.field836];
					var5 = (class86)class199.method3788(class86.method2928(), var7);
					if (var5 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var7));
					}
				}

				if (var0 == 3209) {
					var7 = class67.field843[--class67.field836];
					var4 = (class87)class199.method3788(class87.method6373(), var7);
					if (null == var4) {
						var5 = (class86)class199.method3788(class86.method2928(), var7);
						if (null == var5) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var7));
						}
					}
				} else if (var0 == 3181) {
					var4 = class87.field1079;
				} else if (var0 == 3203) {
					var5 = class86.field1071;
				} else if (var0 == 3205) {
					var5 = class86.field1065;
				} else if (var0 == 3207) {
					var5 = class86.field1068;
				}

				if (class86.field1066 == var5) {
					switch(var4.field1082) {
					case 1:
						Client.field112.method2393(var6 == 1);
						break;
					case 2:
						Client.field112.method2475(var6 == 1);
						break;
					case 3:
						Client.field112.method2427(var6 == 1);
						break;
					case 4:
						if (var6 < 0) {
							var6 = 0;
						}

						Client.field112.method2484(var6);
						break;
					case 5:
						Client.method1206(var6);
						break;
					default:
						var10 = String.format("Unkown device option: %s.", var4.toString());
						throw new RuntimeException(var10);
					}
				} else {
					switch(var5.field1067) {
					case 1:
						Client.field112.method2392(var6 == 1);
						break;
					case 2:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 255) / 100.0F);
						class87.method2230(var7);
						break;
					case 3:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 127) / 100.0F);
						Client.method3062(var7);
						break;
					case 4:
						var6 = Math.min(Math.max(var6, 0), 100);
						var7 = Math.round((float)(var6 * 127) / 100.0F);
						Client.method3119(var7);
						break;
					default:
						var10 = String.format("Unkown game option: %s.", var5.toString());
						throw new RuntimeException(var10);
					}
				}

				return 1;
			}
		}
	}
}
