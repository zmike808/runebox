public class class199 extends class444 {
	static class280 field2129;
	static class344 field2127;
	class464 field2128;

	static {
		field2129 = new class280(64);
	}

	class199() {
	}

	void method3800() {
	}

	void method3789(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3787(var1, var3);
		}
	}

	void method3787(class489 var1, int var2) {
		if (var2 == 249) {
			this.field2128 = class77.method2107(var1, this.field2128);
		}

	}

	public int method3791(int var1, int var2) {
		class464 var5 = this.field2128;
		int var4;
		if (var5 == null) {
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

	public String method3792(int var1, String var2) {
		return class187.method3620(this.field2128, var1, var2);
	}

	public static class357 method3788(class357[] var0, int var1) {
		class357[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class357 var5 = var3[var4];
			if (var1 == var5.method6674()) {
				return var5;
			}
		}

		return null;
	}

	public static void method1772(class344 var0) {
		class78.field2092 = var0;
	}

	public static void method2221(class344 var0) {
		field2127 = var0;
	}

	public static void method725(class344 var0) {
		class482.field4962 = var0;
	}

	public static class199 method3745(int var0) {
		class199 var2 = (class199)field2129.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2127.method6468(34, var0);
			var2 = new class199();
			if (null != var3) {
				var2.method3789(new class489(var3));
			}

			var2.method3800();
			field2129.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static void method2196() {
		field2129.method5467();
	}

	static int method3809(int var0, class75 var1, boolean var2) {
		boolean var4 = true;
		class317 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class166.method3349(class67.field843[--class67.field836]);
			var4 = false;
		} else {
			var5 = var2 ? class67.field329 : class67.field6;
		}

		int var10;
		if (var0 == 1300) {
			var10 = class67.field843[--class67.field836] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method6133(var10, class67.field842[--class67.field1015]);
				return 1;
			} else {
				--class67.field1015;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				class67.field836 -= 2;
				var10 = class67.field843[class67.field836];
				var11 = class67.field843[1 + class67.field836];
				var5.field3652 = class317.method881(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field3577 = class67.field843[--class67.field836] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field3653 = class67.field843[--class67.field836];
				return 1;
			} else if (var0 == 1304) {
				var5.field3639 = class67.field843[--class67.field836];
				return 1;
			} else if (var0 == 1305) {
				var5.field3650 = class67.field842[--class67.field1015];
				return 1;
			} else if (var0 == 1306) {
				var5.field3713 = class67.field842[--class67.field1015];
				return 1;
			} else if (var0 == 1307) {
				var5.field3648 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field3719 = class67.field843[--class67.field836] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class67.field836;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					byte var9;
					if (var0 == 1351) {
						class67.field836 -= 2;
						var9 = 10;
						var7 = new byte[]{(byte)class67.field843[class67.field836]};
						byte[] var12 = new byte[]{(byte)class67.field843[class67.field836 + 1]};
						class67.method64(var5, var9, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						class67.field836 -= 3;
						var10 = class67.field843[class67.field836] - 1;
						var11 = class67.field843[class67.field836 + 1];
						var8 = class67.field843[class67.field836 + 2];
						if (var10 >= 0 && var10 <= 9) {
							class67.method1982(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = 10;
						var11 = class67.field843[--class67.field836];
						var8 = class67.field843[--class67.field836];
						class67.method1982(var5, var9, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--class67.field836;
						var10 = class67.field843[class67.field836] - 1;
						if (var10 >= 0 && var10 <= 9) {
							class67.method6694(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = 10;
						class67.method6694(var5, var9);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						class67.field836 -= 10;

						for (var8 = 0; var8 < 10 && class67.field843[var8 + class67.field836] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte)class67.field843[class67.field836 + var8];
								var7[var8 / 2] = (byte)class67.field843[1 + class67.field836 + var8];
							}
						}
					} else {
						class67.field836 -= 2;
						var6 = new byte[]{(byte)class67.field843[class67.field836]};
						var7 = new byte[]{(byte)class67.field843[1 + class67.field836]};
					}

					var8 = class67.field843[--class67.field836] - 1;
					if (var8 >= 0 && var8 <= 9) {
						class67.method64(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
