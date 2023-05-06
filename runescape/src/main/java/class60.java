public class class60 {
	class75 field464;
	int field463;
	int[] field467;
	String[] field465;

	class60() {
		this.field463 = -1;
	}

	static final void method1166(int var0, int var1, int var2, int var3) {
		if (Client.field649 == 0 && !Client.field651) {
			Client.method1986(class337.field4021, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		long var7 = -1L;

		int var9;
		for (var9 = 0; var9 < class233.method390(); ++var9) {
			long var10 = class233.method466(var9);
			if (var7 != var10) {
				var7 = var10;
				int var12 = class233.method4550(var9);
				int var13 = class233.method1168(var9);
				int var14 = class233.method4582(class233.field2773[var9]);
				int var16 = class233.method2194(class233.field2773[var9]);
				int var17 = var16;
				int var21;
				if (var14 == 2 && Client.field180.method4532(Client.field231, var12, var13, var10) >= 0) {
					class201 var18 = class145.method3177(var16);
					if (null != var18.field2198) {
						var18 = var18.method3857();
					}

					if (null == var18) {
						continue;
					}

					class90 var19 = null;

					for (class90 var20 = (class90)Client.field574.method6716(); var20 != null; var20 = (class90)Client.field574.method6725()) {
						if (var20.field1131 == Client.field231 && var20.field1121 == var12 && var20.field1122 == var13 && var17 == var20.field1128) {
							var19 = var20;
							break;
						}
					}

					if (1 == Client.field649) {
						Client.method1986(class337.field4000, Client.field497 + " " + class97.field1284 + " " + class97.method7285(65535) + var18.field2184, 1, var17, var12, var13);
					} else if (Client.field651) {
						if ((Client.field958 & 4) == 4) {
							Client.method1986(Client.field663, Client.field655 + " " + class97.field1284 + " " + class97.method7285(65535) + var18.field2184, 2, var17, var12, var13);
						}
					} else {
						String[] var29 = var18.field2174;
						if (var29 != null) {
							for (var21 = 4; var21 >= 0; --var21) {
								if ((var19 == null || var19.method2306(var21)) && null != var29[var21]) {
									short var22 = 0;
									if (var21 == 0) {
										var22 = 3;
									}

									if (var21 == 1) {
										var22 = 4;
									}

									if (var21 == 2) {
										var22 = 5;
									}

									if (var21 == 3) {
										var22 = 6;
									}

									if (var21 == 4) {
										var22 = 1001;
									}

									Client.method1986(var29[var21], class97.method7285(65535) + var18.field2184, var22, var17, var12, var13);
								}
							}
						}

						Client.method1986(class337.field4001, class97.method7285(65535) + var18.field2184, 1002, var18.field2186, var12, var13);
					}
				}

				int var28;
				class96 var30;
				int[] var31;
				class88 var35;
				if (var14 == 1) {
					class96 var25 = Client.field546[var17];
					if (null == var25) {
						continue;
					}

					if (var25.field1277.field2042 == 1 && 64 == (var25.field1171 & 127) && 64 == (var25.field1138 & 127)) {
						for (var28 = 0; var28 < Client.field737; ++var28) {
							var30 = Client.field546[Client.field548[var28]];
							if (null != var30 && var25 != var30 && var30.field1277.field2042 == 1 && var25.field1171 == var30.field1171 && var25.field1138 == var30.field1138) {
								class181.method3504(var30, Client.field548[var28], var12, var13);
							}
						}

						var28 = class103.field1335;
						var31 = class103.field1341;

						for (var21 = 0; var21 < var28; ++var21) {
							var35 = Client.field611[var31[var21]];
							if (null != var35 && var35.field1171 == var25.field1171 && var35.field1138 == var25.field1138) {
								class76.method2089(var35, var31[var21], var12, var13);
							}
						}
					}

					class181.method3504(var25, var17, var12, var13);
				}

				if (var14 == 0) {
					class88 var26 = Client.field611[var17];
					if (null == var26) {
						continue;
					}

					if (64 == (var26.field1171 & 127) && 64 == (var26.field1138 & 127)) {
						for (var28 = 0; var28 < Client.field737; ++var28) {
							var30 = Client.field546[Client.field548[var28]];
							if (var30 != null && var30.field1277.field2042 == 1 && var26.field1171 == var30.field1171 && var30.field1138 == var26.field1138) {
								class181.method3504(var30, Client.field548[var28], var12, var13);
							}
						}

						var28 = class103.field1335;
						var31 = class103.field1341;

						for (var21 = 0; var21 < var28; ++var21) {
							var35 = Client.field611[var31[var21]];
							if (null != var35 && var26 != var35 && var26.field1171 == var35.field1171 && var35.field1138 == var26.field1138) {
								class76.method2089(var35, var31[var21], var12, var13);
							}
						}
					}

					if (var17 != Client.field623) {
						class76.method2089(var26, var17, var12, var13);
					} else {
						var5 = var10;
					}
				}

				if (var14 == 3) {
					class363 var27 = Client.field624[Client.field231][var12][var13];
					if (null != var27) {
						for (class100 var32 = (class100)var27.method6733(); null != var32; var32 = (class100)var27.method6727()) {
							class202 var33 = class92.method2352(var32.field1317);
							if (1 == Client.field649) {
								Client.method1986(class337.field4000, Client.field497 + " " + class97.field1284 + " " + class97.method7285(16748608) + var33.field2261, 16, var32.field1317, var12, var13);
							} else if (Client.field651) {
								if (1 == (Client.field958 & 1)) {
									Client.method1986(Client.field663, Client.field655 + " " + class97.field1284 + " " + class97.method7285(16748608) + var33.field2261, 17, var32.field1317, var12, var13);
								}
							} else {
								String[] var34 = var33.field2220;

								for (int var36 = 4; var36 >= 0; --var36) {
									if (var32.method2612(var36)) {
										if (var34 != null && var34[var36] != null) {
											byte var23 = 0;
											if (var36 == 0) {
												var23 = 18;
											}

											if (var36 == 1) {
												var23 = 19;
											}

											if (var36 == 2) {
												var23 = 20;
											}

											if (var36 == 3) {
												var23 = 21;
											}

											if (var36 == 4) {
												var23 = 22;
											}

											Client.method1986(var34[var36], class97.method7285(16748608) + var33.field2261, var23, var32.field1317, var12, var13);
										} else if (var36 == 2) {
											Client.method1986(class337.field3837, class97.method7285(16748608) + var33.field2261, 20, var32.field1317, var12, var13);
										}
									}
								}

								Client.method1986(class337.field4001, class97.method7285(16748608) + var33.field2261, 1004, var32.field1317, var12, var13);
							}
						}
					}
				}
			}
		}

		if (var5 != -1L) {
			var9 = (int)(var5 >>> 0 & 127L);
			int var11 = class233.method3694(var5);
			class88 var24 = Client.field611[Client.field623];
			class76.method2089(var24, Client.field623, var9, var11);
		}

	}

	static void method1167(String var0) {
		Client.field1404 = var0;

		try {
			String var2 = Client.field466.getParameter(Integer.toString(18));
			String var3 = Client.field466.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var4 + "; Expires=" + class322.method3131(class294.method2575() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class27.method393(Client.field466, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var5) {
		}

	}
}
