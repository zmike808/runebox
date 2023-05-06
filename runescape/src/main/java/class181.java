public class class181 extends class444 {
	static class280 field1906;
	static class344 field1904;
	public int field1905;

	static {
		field1906 = new class280(64);
	}

	class181() {
		this.field1905 = 0;
	}

	void method3509(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3506(var1, var3);
		}
	}

	void method3506(class489 var1, int var2) {
		if (var2 == 2) {
			this.field1905 = var1.method8660();
		}

	}

	public static void method2568(class344 var0) {
		field1904 = var0;
	}

	public static class181 method1212(int var0) {
		class181 var2 = (class181)field1906.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1904.method6468(5, var0);
			var2 = new class181();
			if (var3 != null) {
				var2.method3509(new class489(var3));
			}

			field1906.method5463(var2, (long)var0);
			return var2;
		}
	}

	static final void method3504(class96 var0, int var1, int var2, int var3) {
		class191 var5 = var0.field1277;
		if (Client.field633 < 400) {
			if (var5.field2045 != null) {
				var5 = var5.method3642();
			}

			if (null != var5) {
				if (var5.field2048) {
					if (!var5.field2025 || var1 == Client.field665) {
						String var6 = var0.method2540();
						int var7;
						if (0 != var5.field2046 && var0.field1212 != 0) {
							var7 = var0.field1212 != -1 ? var0.field1212 : var5.field2046;
							var6 = var6 + class81.method2187(var7, Client.field3454.field1102) + " " + class97.field1287 + class337.field4006 + var7 + class97.field1288;
						}

						if (var5.field2025 && Client.field642) {
							Client.method1986(class337.field4001, class97.method7285(16776960) + var6, 1003, var1, var2, var3);
						}

						if (1 == Client.field649) {
							Client.method1986(class337.field4000, Client.field497 + " " + class97.field1284 + " " + class97.method7285(16776960) + var6, 7, var1, var2, var3);
						} else if (Client.field651) {
							if (2 == (Client.field958 & 2)) {
								Client.method1986(Client.field663, Client.field655 + " " + class97.field1284 + " " + class97.method7285(16776960) + var6, 8, var1, var2, var3);
							}
						} else {
							var7 = var5.field2025 && Client.field642 ? 2000 : 0;
							String[] var8 = var5.field2036;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method2537(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class337.field4002)) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										Client.method1986(var8[var9], class97.method7285(16776960) + var6, var10, var1, var2, var3);
									}
								}
							}

							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method2537(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase(class337.field4002)) {
										short var11 = 0;
										if (class99.field1309 != Client.field517) {
											if (class99.field1306 == Client.field517 || Client.field517 == class99.field1307 && var5.field2046 > Client.field3454.field1102) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											Client.method1986(var8[var9], class97.method7285(16776960) + var6, var10, var1, var2, var3);
										}
									}
								}
							}

							if (!var5.field2025 || !Client.field642) {
								Client.method1986(class337.field4001, class97.method7285(16776960) + var6, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	static String method3515(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (Client.field490 == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.field490 == 2) {
			var0 = var0 + "-wtqa";
		} else if (3 == Client.field490) {
			var0 = var0 + "-wtwip";
		} else if (5 == Client.field490) {
			var0 = var0 + "-wti";
		} else if (Client.field490 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (Client.field1404 != null) {
			var4 = "/p=" + Client.field1404;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + class67.field1736 + "/a=" + Client.field4601 + var4 + "/";
	}

	public static boolean method3516() {
		return Client.field511 != null;
	}
}
