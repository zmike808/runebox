import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class115 extends class409 {
	final boolean field1429;

	public class115(boolean var1) {
		this.field1429 = var1;
	}

	int method2859(class412 var1, class412 var2) {
		if (var1.field4600 != var2.field4600) {
			return this.field1429 ? var1.field4600 - var2.field4600 : var2.field4600 - var1.field4600;
		} else {
			return this.method7598(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2859((class412)var1, (class412)var2);
	}

	public static class503[] method2860(class344 var0, int var1, int var2) {
		byte[] var5 = var0.method6468(var1, var2);
		boolean var4;
		if (null == var5) {
			var4 = false;
		} else {
			class486.method8595(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			class503[] var6 = new class503[class504.field5102];

			for (int var7 = 0; var7 < class504.field5102; ++var7) {
				class503 var8 = var6[var7] = new class503();
				var8.field5092 = class504.field5100;
				var8.field5087 = class504.field5099;
				var8.field5090 = class504.field5101[var7];
				var8.field5091 = class504.field94[var7];
				var8.field5088 = class504.field1302[var7];
				var8.field5093 = class504.field1644[var7];
				int var9 = var8.field5093 * var8.field5088;
				byte[] var10 = class504.field2113[var7];
				var8.field5089 = new int[var9];

				for (int var11 = 0; var11 < var9; ++var11) {
					var8.field5089[var11] = class504.field4525[var10[var11] & 255];
				}
			}

			class504.method7448();
			return var6;
		}
	}

	public static void method2868(class489 var0, int var1) {
		class38 var3 = new class38();
		var3.field262 = var0.method8658();
		var3.field265 = var0.method8664();
		var3.field263 = new int[var3.field262];
		var3.field264 = new int[var3.field262];
		var3.field261 = new Field[var3.field262];
		var3.field266 = new int[var3.field262];
		var3.field267 = new Method[var3.field262];
		var3.field268 = new byte[var3.field262][][];

		for (int var4 = 0; var4 < var3.field262; ++var4) {
			try {
				int var5 = var0.method8658();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method8669();
						var7 = var0.method8669();
						var8 = var0.method8658();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method8669();
						}

						String var26 = var0.method8669();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method8664();
								var11[var12] = new byte[var13];
								var0.method8676(var11[var12], 0, var13);
							}
						}

						var3.field263[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = class34.method504(var9[var13]);
						}

						Class var28 = class34.method504(var26);
						if (class34.method504(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = class34.method504(var6).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var18.length == var27.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var28 == var17.getReturnType()) {
										var3.field267[var4] = var17;
									}
								}
							}
						}

						var3.field268[var4] = var11;
					}
				} else {
					var6 = var0.method8669();
					var7 = var0.method8669();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method8664();
					}

					var3.field263[var4] = var5;
					var3.field266[var4] = var8;
					if (class34.method504(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field261[var4] = class34.method504(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field264[var4] = -1;
			} catch (SecurityException var22) {
				var3.field264[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field264[var4] = -3;
			} catch (Exception var24) {
				var3.field264[var4] = -4;
			} catch (Throwable var25) {
				var3.field264[var4] = -5;
			}
		}

		class37.field255.method6793(var3);
	}

	static int method2867(int var0, class75 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			class67.field836 -= 2;
			var10 = class67.field843[class67.field836];
			var5 = class67.field843[1 + class67.field836];
			class67.field843[++class67.field836 - 1] = var5 + var10;
			return 1;
		} else if (var0 == 4001) {
			class67.field836 -= 2;
			var10 = class67.field843[class67.field836];
			var5 = class67.field843[1 + class67.field836];
			class67.field843[++class67.field836 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			class67.field836 -= 2;
			var10 = class67.field843[class67.field836];
			var5 = class67.field843[1 + class67.field836];
			class67.field843[++class67.field836 - 1] = var10 * var5;
			return 1;
		} else if (var0 == 4003) {
			class67.field836 -= 2;
			var10 = class67.field843[class67.field836];
			var5 = class67.field843[class67.field836 + 1];
			class67.field843[++class67.field836 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = (int)(Math.random() * (double)var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = (int)(Math.random() * (double)(var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				class67.field836 -= 5;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				var6 = class67.field843[class67.field836 + 2];
				var7 = class67.field843[class67.field836 + 3];
				var8 = class67.field843[4 + class67.field836];
				class67.field843[++class67.field836 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
				return 1;
			} else if (var0 == 4007) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				class67.field843[++class67.field836 - 1] = var10 * var5 / 100 + var10;
				return 1;
			} else if (var0 == 4008) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				class67.field843[++class67.field836 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = 0 != (var10 & 1 << var5) ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				if (var10 == 0) {
					class67.field843[++class67.field836 - 1] = 0;
				} else {
					class67.field843[++class67.field836 - 1] = (int)Math.pow((double)var10, (double)var5);
				}

				return 1;
			} else if (var0 == 4013) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				if (var10 == 0) {
					class67.field843[++class67.field836 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						class67.field843[++class67.field836 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						class67.field843[++class67.field836 - 1] = var10;
						break;
					case 2:
						class67.field843[++class67.field836 - 1] = (int)Math.sqrt((double)var10);
						break;
					case 3:
						class67.field843[++class67.field836 - 1] = (int)Math.cbrt((double)var10);
						break;
					case 4:
						class67.field843[++class67.field836 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
						break;
					default:
						class67.field843[++class67.field836 - 1] = (int)Math.pow((double)var10, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				class67.field843[++class67.field836 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				class67.field843[++class67.field836 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				class67.field836 -= 3;
				long var11 = (long)class67.field843[class67.field836];
				long var12 = (long)class67.field843[class67.field836 + 1];
				long var13 = (long)class67.field843[2 + class67.field836];
				class67.field843[++class67.field836 - 1] = (int)(var13 * var11 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = class296.method290(class67.field843[--class67.field836]);
				class67.field843[++class67.field836 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				class67.field836 -= 3;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				var6 = class67.field843[2 + class67.field836];
				class67.field843[++class67.field836 - 1] = class296.method3116(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				class67.field836 -= 3;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				var6 = class67.field843[class67.field836 + 2];
				class67.field843[++class67.field836 - 1] = class296.method332(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				class67.field836 -= 3;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				var6 = class67.field843[2 + class67.field836];
				var7 = 31 - var6;
				class67.field843[++class67.field836 - 1] = var10 << var7 >>> var5 + var7;
				return 1;
			} else if (var0 == 4030) {
				class67.field836 -= 4;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				var6 = class67.field843[2 + class67.field836];
				var7 = class67.field843[class67.field836 + 3];
				var10 = class296.method332(var10, var6, var7);
				var8 = class296.method3155(var7 - var6 + 1);
				if (var5 > var8) {
					var5 = var8;
				}

				class67.field843[++class67.field836 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				class67.field843[class67.field836 - 1] = class440.method2602(class67.field843[class67.field836 - 1]);
				return 1;
			} else if (var0 == 4033) {
				class67.field843[class67.field836 - 1] = class413.method7704(class67.field843[class67.field836 - 1]);
				return 1;
			} else if (var0 == 4034) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				var6 = class440.method2827(var10, var5);
				class67.field843[++class67.field836 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				class67.field843[class67.field836 - 1] = Math.abs(class67.field843[class67.field836 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = class67.field842[--class67.field1015];
				var5 = -1;
				if (class372.method5232(var4)) {
					var5 = class372.method5513(var4);
				}

				class67.field843[++class67.field836 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	static final int method2869() {
		if (Client.field112.method2457()) {
			return Client.field231;
		} else {
			int var1 = 3;
			if (Client.field2975 < 310) {
				int var2;
				int var3;
				if (Client.field505 == 1) {
					var2 = Client.field194 >> 7;
					var3 = Client.field1675 >> 7;
				} else {
					var2 = Client.field3454.field1171 >> 7;
					var3 = Client.field3454.field1138 >> 7;
				}

				int var4 = Client.field257 >> 7;
				int var5 = Client.field3391 >> 7;
				if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
					return Client.field231;
				}

				if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
					return Client.field231;
				}

				if (0 != (class78.field1006[Client.field231][var4][var5] & 4)) {
					var1 = Client.field231;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				if (var3 > var5) {
					var7 = var3 - var5;
				} else {
					var7 = var5 - var3;
				}

				int var8;
				int var9;
				if (var6 > var7) {
					var8 = var7 * 65536 / var6;
					var9 = 32768;

					while (var2 != var4) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if (0 != (class78.field1006[Client.field231][var4][var5] & 4)) {
							var1 = Client.field231;
						}

						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if (0 != (class78.field1006[Client.field231][var4][var5] & 4)) {
								var1 = Client.field231;
							}
						}
					}
				} else if (var7 > 0) {
					var8 = var6 * 65536 / var7;
					var9 = 32768;

					while (var5 != var3) {
						if (var5 < var3) {
							++var5;
						} else if (var5 > var3) {
							--var5;
						}

						if (0 != (class78.field1006[Client.field231][var4][var5] & 4)) {
							var1 = Client.field231;
						}

						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if (0 != (class78.field1006[Client.field231][var4][var5] & 4)) {
								var1 = Client.field231;
							}
						}
					}
				}
			}

			if (Client.field3454.field1171 >= 0 && Client.field3454.field1138 >= 0 && Client.field3454.field1171 < 13312 && Client.field3454.field1138 < 13312) {
				if ((class78.field1006[Client.field231][Client.field3454.field1171 >> 7][Client.field3454.field1138 >> 7] & 4) != 0) {
					var1 = Client.field231;
				}

				return var1;
			} else {
				return Client.field231;
			}
		}
	}
}
