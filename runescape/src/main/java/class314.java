import java.util.Arrays;

public class class314 {
	public static int field1944;
	public static short[] field2957;
	public static short[] field3518;
	public static short[][] field3508;
	public static short[][] field4708;
	static class280 field3509;
	static final int[] field3520;
	boolean field3517;
	class180[] field3516;
	int[] field3510;
	int[] field3519;
	int[] field3523;
	long field3514;
	long field3515;
	public int field3512;
	public int field3513;
	public int field3522;

	static {
		field3520 = new int[]{class205.field2324.field2316, class205.field2325.field2316, class205.field2320.field2316, class205.field2322.field2316, class205.field2319.field2316, class205.field2323.field2316, class205.field2328.field2316};
		field3509 = new class280(260);
	}

	public class314() {
		this.field3512 = -1;
		this.field3522 = 0;
		this.field3517 = false;
	}

	class314(class314 var1) {
		this.field3512 = -1;
		this.field3522 = 0;
		this.field3517 = false;
		int[] var2 = Arrays.copyOf(var1.field3519, var1.field3519.length);
		int[] var3 = Arrays.copyOf(var1.field3523, var1.field3523.length);
		class180[] var4 = (class180[])(var1.field3516 != null ? (class180[])Arrays.copyOf(var1.field3516, var1.field3516.length) : null);
		int[] var5 = Arrays.copyOf(var1.field3510, var1.field3510.length);
		this.method5797(var3, var2, var4, false, var5, var1.field3522, var1.field3513, var1.field3512);
	}

	public void method5797(int[] var1, int[] var2, class180[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3516 = var3;
		this.field3517 = var4;
		this.field3512 = var8;
		this.method5798(var1, var2, var5, var6, var7);
	}

	public void method5798(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (null == var1) {
			var1 = this.method5806(var4);
		}

		if (null == var2) {
			var2 = this.method5806(var4);
		}

		this.field3523 = var1;
		this.field3519 = var2;
		this.field3510 = var3;
		this.field3522 = var4;
		this.field3513 = var5;
		this.method5818();
	}

	int[] method5806(int var1) {
		int[] var3 = new int[12];

		for (int var4 = 0; var4 < 7; ++var4) {
			method3332(var1, var3, var4);
		}

		return var3;
	}

	public void method5795(int var1, boolean var2) {
		if (var1 != 1 || 1 != this.field3522) {
			int var4 = this.field3519[field3520[var1]];
			if (var4 != 0) {
				var4 -= 256;

				class185 var5;
				do {
					if (!var2) {
						--var4;
						if (var4 < 0) {
							var4 = field1944 - 1;
						}
					} else {
						++var4;
						if (var4 >= field1944) {
							var4 = 0;
						}
					}

					var5 = class185.method2619(var4);
				} while(null == var5 || var5.field1953 || var5.field1952 != var1 + (1 == this.field3522 ? 7 : 0));

				this.field3519[field3520[var1]] = var4 + 256;
				this.method5818();
			}
		}
	}

	public void method5817(int var1, boolean var2) {
		int var4 = this.field3510[var1];
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = field3508[var1].length - 1;
				}
			} while(!class151.method3262(var1, var4));
		} else {
			do {
				++var4;
				if (var4 >= field3508[var1].length) {
					var4 = 0;
				}
			} while(!class151.method3262(var1, var4));
		}

		this.field3510[var1] = var4;
		this.method5818();
	}

	public void method5802(int var1) {
		if (this.field3522 != var1) {
			this.method5798((int[])null, (int[])null, this.field3510, var1, -1);
		}
	}

	public void method5803(class489 var1) {
		var1.method8695(this.field3522);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field3519[field3520[var3]];
			if (var4 == 0) {
				var1.method8695(-1);
			} else {
				var1.method8695(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.method8695(this.field3510[var3]);
		}

	}

	void method5818() {
		long var2 = this.field3514;
		int var4 = this.field3519[5];
		int var5 = this.field3519[9];
		this.field3519[5] = var5;
		this.field3519[9] = var4;
		this.field3514 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field3514 <<= 4;
			if (this.field3519[var6] >= 256) {
				this.field3514 += (long)(this.field3519[var6] - 256);
			}
		}

		if (this.field3519[0] >= 256) {
			this.field3514 += (long)(this.field3519[0] - 256 >> 4);
		}

		if (this.field3519[1] >= 256) {
			this.field3514 += (long)(this.field3519[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field3514 <<= 3;
			this.field3514 += (long)this.field3510[var6];
		}

		this.field3514 <<= 1;
		this.field3514 += (long)this.field3522;
		this.field3519[5] = var4;
		this.field3519[9] = var5;
		if (var2 != 0L && this.field3514 != var2 || this.field3517) {
			field3509.method5460(var2);
		}

	}

	public class232 method5805(class204 var1, int var2, class204 var3, int var4) {
		if (-1 != this.field3513) {
			return class191.method6482(this.field3513).method3639(var1, var2, var3, var4, (class190)null);
		} else {
			long var6 = this.field3514;
			int[] var8 = this.field3519;
			if (var1 != null && (var1.field2309 >= 0 || var1.field2310 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field3519[var9];
				}

				if (var1.field2309 >= 0) {
					var6 += (long)(var1.field2309 - this.field3519[5] << 40);
					var8[5] = var1.field2309;
				}

				if (var1.field2310 >= 0) {
					var6 += (long)(var1.field2310 - this.field3519[3] << 48);
					var8[3] = var1.field2310;
				}
			}

			class232 var19 = (class232)field3509.method5461(var6);
			if (null == var19) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512 && !class185.method2619(var12 - 256).method3564()) {
						var10 = true;
					}

					if (var12 >= 512 && !class92.method2352(var12 - 512).method3909(this.field3522)) {
						var10 = true;
					}
				}

				if (var10) {
					if (-1L != this.field3515) {
						var19 = (class232)field3509.method5461(this.field3515);
					}

					if (null == var19) {
						return null;
					}
				}

				if (var19 == null) {
					class214[] var21 = new class214[12];
					var12 = 0;

					int var14;
					for (int var13 = 0; var13 < 12; ++var13) {
						var14 = var8[var13];
						if (var14 >= 256 && var14 < 512) {
							class214 var15 = class185.method2619(var14 - 256).method3558();
							if (var15 != null) {
								var21[var12++] = var15;
							}
						}

						if (var14 >= 512) {
							class202 var23 = class92.method2352(var14 - 512);
							class214 var16 = var23.method3922(this.field3522);
							if (var16 != null) {
								if (null != this.field3516) {
									class180 var17 = this.field3516[var13];
									if (var17 != null) {
										int var18;
										if (var17.field1900 != null && var23.field2222 != null && var23.field2221.length == var17.field1900.length) {
											for (var18 = 0; var18 < var23.field2222.length; ++var18) {
												var16.method4169(var23.field2221[var18], var17.field1900[var18]);
											}
										}

										if (null != var17.field1899 && var23.field2233 != null && var17.field1899.length == var23.field2223.length) {
											for (var18 = 0; var18 < var23.field2233.length; ++var18) {
												var16.method4220(var23.field2223[var18], var17.field1899[var18]);
											}
										}
									}
								}

								var21[var12++] = var16;
							}
						}
					}

					class214 var22 = new class214(var21, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field3510[var14] < field3508[var14].length) {
							var22.method4169(field3518[var14], field3508[var14][this.field3510[var14]]);
						}

						if (this.field3510[var14] < field4708[var14].length) {
							var22.method4169(field2957[var14], field4708[var14][this.field3510[var14]]);
						}
					}

					var19 = var22.method4177(64, 850, -30, -50, -30);
					field3509.method5463(var19, var6);
					this.field3515 = var6;
				}
			}

			class232 var20;
			if (var1 == null && var3 == null) {
				var20 = var19.method4593(true);
			} else if (var1 != null && null != var3) {
				var20 = var1.method4045(var19, var2, var3, var4);
			} else if (null != var1) {
				var20 = var1.method3998(var19, var2);
			} else {
				var20 = var3.method3998(var19, var4);
			}

			return var20;
		}
	}

	class214 method5823() {
		if (-1 != this.field3513) {
			return class191.method6482(this.field3513).method3640((class190)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field3519[var3];
				if (var4 >= 256 && var4 < 512 && !class185.method2619(var4 - 256).method3559()) {
					var2 = true;
				}

				if (var4 >= 512 && !class92.method2352(var4 - 512).method3911(this.field3522)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				class214[] var8 = new class214[12];
				var4 = 0;

				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = this.field3519[var5];
					class214 var7;
					if (var6 >= 256 && var6 < 512) {
						var7 = class185.method2619(var6 - 256).method3560();
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}

					if (var6 >= 512) {
						var7 = class92.method2352(var6 - 512).method3912(this.field3522);
						if (null != var7) {
							var8[var4++] = var7;
						}
					}
				}

				class214 var9 = new class214(var8, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field3510[var6] < field3508[var6].length) {
						var9.method4169(field3518[var6], field3508[var6][this.field3510[var6]]);
					}

					if (this.field3510[var6] < field4708[var6].length) {
						var9.method4169(field2957[var6], field4708[var6][this.field3510[var6]]);
					}
				}

				return var9;
			}
		}
	}

	public int method5807() {
		return this.field3513 == -1 ? (this.field3519[11] << 5) + (this.field3519[8] << 10) + (this.field3510[0] << 25) + (this.field3510[4] << 20) + (this.field3519[0] << 15) + this.field3519[1] : 305419896 + class191.method6482(this.field3513).field2012;
	}

	void method5828() {
		this.method5798(this.field3523, this.field3519, this.field3510, this.field3522, this.field3513);
	}

	public static byte[] method5843(CharSequence var0, byte var1) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			if (var1 >= -1) {
				throw new IllegalStateException();
			}

			char var5 = var0.charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		return var3;
	}

	static void method3332(int var0, int[] var1, int var2) {
		for (int var4 = 0; var4 < field1944; ++var4) {
			class185 var5 = class185.method2619(var4);
			if (var5 != null && !var5.field1953 && (var0 == 1 ? 7 : 0) + var2 == var5.field1952) {
				var1[field3520[var2]] = var4 + 256;
				break;
			}
		}

	}

	public static void method6567() {
		field3509.method5467();
	}
}
