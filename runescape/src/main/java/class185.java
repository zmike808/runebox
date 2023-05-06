public class class185 extends class444 {
	static class280 field1945;
	static class344 field1946;
	static class344 field1951;
	int[] field1947;
	int[] field1956;
	short[] field1942;
	short[] field1943;
	short[] field1948;
	short[] field1949;
	public boolean field1953;
	public int field1952;

	static {
		field1945 = new class280(64);
	}

	class185() {
		this.field1952 = -1;
		this.field1947 = new int[]{-1, -1, -1, -1, -1};
		this.field1953 = false;
	}

	void method3576(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3557(var1, var3, (byte)33);
		}
	}

	void method3557(class489 var1, int var2, byte var3) {
		if (var2 == 1) {
			if (var3 <= -1) {
				throw new IllegalStateException();
			}

			this.field1952 = var1.method8658();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				if (var3 <= -1) {
					return;
				}

				var4 = var1.method8658();
				this.field1956 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					if (var3 <= -1) {
						throw new IllegalStateException();
					}

					this.field1956[var5] = var1.method8660();
				}
			} else if (var2 == 3) {
				this.field1953 = true;
			} else if (var2 == 40) {
				if (var3 <= -1) {
					throw new IllegalStateException();
				}

				var4 = var1.method8658();
				this.field1948 = new short[var4];
				this.field1949 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					if (var3 <= -1) {
						throw new IllegalStateException();
					}

					this.field1948[var5] = (short)var1.method8660();
					this.field1949[var5] = (short)var1.method8660();
				}
			} else if (var2 == 41) {
				if (var3 <= -1) {
					return;
				}

				var4 = var1.method8658();
				this.field1942 = new short[var4];
				this.field1943 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					if (var3 <= -1) {
						throw new IllegalStateException();
					}

					this.field1942[var5] = (short)var1.method8660();
					this.field1943[var5] = (short)var1.method8660();
				}
			} else if (var2 >= 60) {
				if (var3 <= -1) {
					return;
				}

				if (var2 < 70) {
					this.field1947[var2 - 60] = var1.method8660();
				}
			}
		}

	}

	public boolean method3564() {
		if (this.field1956 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1956.length; ++var3) {
				if (!field1946.method6448(this.field1956[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	public class214 method3558() {
		if (this.field1956 == null) {
			return null;
		} else {
			class214[] var2 = new class214[this.field1956.length];

			for (int var3 = 0; var3 < this.field1956.length; ++var3) {
				var2[var3] = class214.method4215(field1946, this.field1956[var3], 0);
			}

			class214 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new class214(var2, var2.length);
			}

			int var4;
			if (this.field1948 != null) {
				for (var4 = 0; var4 < this.field1948.length; ++var4) {
					var5.method4169(this.field1948[var4], this.field1949[var4]);
				}
			}

			if (this.field1942 != null) {
				for (var4 = 0; var4 < this.field1942.length; ++var4) {
					var5.method4220(this.field1942[var4], this.field1943[var4]);
				}
			}

			return var5;
		}
	}

	public boolean method3559() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field1947[var3] != -1 && !field1946.method6448(this.field1947[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	public class214 method3560() {
		class214[] var2 = new class214[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field1947[var4] != -1) {
				var2[var3++] = class214.method4215(field1946, this.field1947[var4], 0);
			}
		}

		class214 var6 = new class214(var2, var3);
		int var5;
		if (null != this.field1948) {
			for (var5 = 0; var5 < this.field1948.length; ++var5) {
				var6.method4169(this.field1948[var5], this.field1949[var5]);
			}
		}

		if (null != this.field1942) {
			for (var5 = 0; var5 < this.field1942.length; ++var5) {
				var6.method4220(this.field1942[var5], this.field1943[var5]);
			}
		}

		return var6;
	}

	public static void method1714(class344 var0, class344 var1) {
		field1951 = var0;
		field1946 = var1;
		class314.field1944 = field1951.method6458(3);
	}

	public static class185 method2619(int var0) {
		class185 var2 = (class185)field1945.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1951.method6468(3, var0);
			var2 = new class185();
			if (null != var3) {
				var2.method3576(new class489(var3));
			}

			field1945.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static String method3577(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var4 = var0;
			String var3;
			if (var1 && var0 >= 0) {
				int var5 = 2;

				for (int var6 = var0 / 10; var6 != 0; ++var5) {
					var6 /= 10;
				}

				char[] var7 = new char[var5];
				var7[0] = '+';

				for (int var8 = var5 - 1; var8 > 0; --var8) {
					int var9 = var4;
					var4 /= 10;
					int var10 = var9 - var4 * 10;
					if (var10 >= 10) {
						var7[var8] = (char)(var10 + 87);
					} else {
						var7[var8] = (char)(var10 + 48);
					}
				}

				var3 = new String(var7);
			} else {
				var3 = Integer.toString(var0, 10);
			}

			return var3;
		} else {
			return Integer.toString(var0);
		}
	}

	public static void method20() {
		field1945.method5467();
	}

	static final boolean method3555(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		class489 var5 = new class489(var0);
		int var6 = -1;

		label57:
		while (true) {
			int var7 = var5.method8780();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method8827();
					if (var10 == 0) {
						continue label57;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method8658() >> 2;
					int var14 = var12 + var1;
					int var15 = var2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class201 var16 = class145.method3177(var6);
						if (var13 != 22 || !Client.field493 || 0 != var16.field2176 || var16.field2178 == 1 || var16.field2195) {
							if (!var16.method3864()) {
								++Client.field558;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method8827();
				if (var10 == 0) {
					break;
				}

				var5.method8658();
			}
		}
	}

	static final boolean method3568(int var0, int var1, int var2, class210 var3, class209 var4) {
		int var6 = var0;
		int var7 = var1;
		byte var8 = 64;
		byte var9 = 64;
		int var10 = var0 - var8;
		int var11 = var1 - var9;
		class212.field2402[var8][var9] = 99;
		class212.field2397[var8][var9] = 0;
		byte var12 = 0;
		int var13 = 0;
		class212.field2398[var12] = var0;
		int var21 = var12 + 1;
		class212.field2396[var12] = var1;
		int[][] var14 = var4.field2380;

		while (true) {
			label259:
			while (true) {
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				do {
					do {
						do {
							label236:
							do {
								if (var21 == var13) {
									class212.field95 = var6;
									class212.field4535 = var7;
									return false;
								}

								var6 = class212.field2398[var13];
								var7 = class212.field2396[var13];
								var13 = var13 + 1 & 4095;
								var19 = var6 - var10;
								var20 = var7 - var11;
								var15 = var6 - var4.field2375;
								var16 = var7 - var4.field2377;
								if (var3.method4127(var2, var6, var7, var4)) {
									class212.field95 = var6;
									class212.field4535 = var7;
									return true;
								}

								var17 = 1 + class212.field2397[var19][var20];
								if (var19 > 0 && 0 == class212.field2402[var19 - 1][var20] && 0 == (var14[var15 - 1][var16] & 19136782) && 0 == (var14[var15 - 1][var16 + var2 - 1] & 19136824)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class212.field2398[var21] = var6 - 1;
											class212.field2396[var21] = var7;
											var21 = var21 + 1 & 4095;
											class212.field2402[var19 - 1][var20] = 2;
											class212.field2397[var19 - 1][var20] = var17;
											break;
										}

										if (0 != (var14[var15 - 1][var18 + var16] & 19136830)) {
											break;
										}

										++var18;
									}
								}

								if (var19 < 128 - var2 && 0 == class212.field2402[var19 + 1][var20] && (var14[var15 + var2][var16] & 19136899) == 0 && 0 == (var14[var2 + var15][var2 + var16 - 1] & 19136992)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class212.field2398[var21] = var6 + 1;
											class212.field2396[var21] = var7;
											var21 = var21 + 1 & 4095;
											class212.field2402[var19 + 1][var20] = 8;
											class212.field2397[var19 + 1][var20] = var17;
											break;
										}

										if ((var14[var2 + var15][var18 + var16] & 19136995) != 0) {
											break;
										}

										++var18;
									}
								}

								if (var20 > 0 && class212.field2402[var19][var20 - 1] == 0 && 0 == (var14[var15][var16 - 1] & 19136782) && 0 == (var14[var2 + var15 - 1][var16 - 1] & 19136899)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class212.field2398[var21] = var6;
											class212.field2396[var21] = var7 - 1;
											var21 = var21 + 1 & 4095;
											class212.field2402[var19][var20 - 1] = 1;
											class212.field2397[var19][var20 - 1] = var17;
											break;
										}

										if (0 != (var14[var15 + var18][var16 - 1] & 19136911)) {
											break;
										}

										++var18;
									}
								}

								if (var20 < 128 - var2 && class212.field2402[var19][var20 + 1] == 0 && (var14[var15][var16 + var2] & 19136824) == 0 && (var14[var2 + var15 - 1][var2 + var16] & 19136992) == 0) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class212.field2398[var21] = var6;
											class212.field2396[var21] = var7 + 1;
											var21 = var21 + 1 & 4095;
											class212.field2402[var19][var20 + 1] = 4;
											class212.field2397[var19][var20 + 1] = var17;
											break;
										}

										if ((var14[var18 + var15][var2 + var16] & 19137016) != 0) {
											break;
										}

										++var18;
									}
								}

								if (var19 > 0 && var20 > 0 && class212.field2402[var19 - 1][var20 - 1] == 0 && 0 == (var14[var15 - 1][var16 - 1] & 19136782)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2) {
											class212.field2398[var21] = var6 - 1;
											class212.field2396[var21] = var7 - 1;
											var21 = var21 + 1 & 4095;
											class212.field2402[var19 - 1][var20 - 1] = 3;
											class212.field2397[var19 - 1][var20 - 1] = var17;
											break;
										}

										if (0 != (var14[var15 - 1][var16 - 1 + var18] & 19136830) || 0 != (var14[var18 + (var15 - 1)][var16 - 1] & 19136911)) {
											break;
										}

										++var18;
									}
								}

								if (var19 < 128 - var2 && var20 > 0 && 0 == class212.field2402[var19 + 1][var20 - 1] && (var14[var2 + var15][var16 - 1] & 19136899) == 0) {
									var18 = 1;

									while (true) {
										if (var18 >= var2) {
											class212.field2398[var21] = var6 + 1;
											class212.field2396[var21] = var7 - 1;
											var21 = var21 + 1 & 4095;
											class212.field2402[var19 + 1][var20 - 1] = 9;
											class212.field2397[var19 + 1][var20 - 1] = var17;
											break;
										}

										if ((var14[var15 + var2][var18 + (var16 - 1)] & 19136995) != 0 || (var14[var18 + var15][var16 - 1] & 19136911) != 0) {
											break;
										}

										++var18;
									}
								}

								if (var19 > 0 && var20 < 128 - var2 && 0 == class212.field2402[var19 - 1][var20 + 1] && 0 == (var14[var15 - 1][var16 + var2] & 19136824)) {
									for (var18 = 1; var18 < var2; ++var18) {
										if ((var14[var15 - 1][var18 + var16] & 19136830) != 0 || (var14[var18 + (var15 - 1)][var2 + var16] & 19137016) != 0) {
											continue label236;
										}
									}

									class212.field2398[var21] = var6 - 1;
									class212.field2396[var21] = var7 + 1;
									var21 = var21 + 1 & 4095;
									class212.field2402[var19 - 1][var20 + 1] = 6;
									class212.field2397[var19 - 1][var20 + 1] = var17;
								}
							} while(var19 >= 128 - var2);
						} while(var20 >= 128 - var2);
					} while(class212.field2402[var19 + 1][var20 + 1] != 0);
				} while(0 != (var14[var15 + var2][var2 + var16] & 19136992));

				for (var18 = 1; var18 < var2; ++var18) {
					if ((var14[var15 + var18][var16 + var2] & 19137016) != 0 || (var14[var15 + var2][var16 + var18] & 19136995) != 0) {
						continue label259;
					}
				}

				class212.field2398[var21] = var6 + 1;
				class212.field2396[var21] = var7 + 1;
				var21 = var21 + 1 & 4095;
				class212.field2402[var19 + 1][var20 + 1] = 12;
				class212.field2397[var19 + 1][var20 + 1] = var17;
			}
		}
	}
}
