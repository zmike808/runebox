import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class class188 extends class444 {
	static class280 field1983;
	static class344 field1985;
	public char field1981;
	public char field1982;
	public int field1986;
	public int field1990;
	public int[] field1987;
	public int[] field1988;
	public String field1984;
	public String[] field1989;

	static {
		field1983 = new class280(64);
	}

	class188() {
		this.field1984 = class337.field3889;
		this.field1990 = 0;
	}

	void method3623(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3610(var1, var3);
		}
	}

	void method3610(class489 var1, int var2) {
		if (var2 == 1) {
			this.field1982 = (char)var1.method8658();
		} else if (var2 == 2) {
			this.field1981 = (char)var1.method8658();
		} else if (var2 == 3) {
			this.field1984 = var1.method8669();
		} else if (var2 == 4) {
			this.field1986 = var1.method8664();
		} else {
			int var4;
			if (var2 == 5) {
				this.field1990 = var1.method8660();
				this.field1987 = new int[this.field1990];
				this.field1989 = new String[this.field1990];

				for (var4 = 0; var4 < this.field1990; ++var4) {
					this.field1987[var4] = var1.method8664();
					this.field1989[var4] = var1.method8669();
				}
			} else if (var2 == 6) {
				this.field1990 = var1.method8660();
				this.field1987 = new int[this.field1990];
				this.field1988 = new int[this.field1990];

				for (var4 = 0; var4 < this.field1990; ++var4) {
					this.field1987[var4] = var1.method8664();
					this.field1988[var4] = var1.method8664();
				}
			}
		}

	}

	public int method3609() {
		return this.field1990;
	}

	public static void method5676(class344 var0) {
		field1985 = var0;
	}

	static void method3622(class35 var0, class379 var1, class379 var2) {
		if (class72.field919) {
			class34.method511(var0);
		} else {
			if ((1 == class36.field252 || !Client.field4941 && 4 == class36.field252) && class36.field250 >= 765 + class72.field907 - 50 && class36.field251 >= 453) {
				Client.field112.method2475(!Client.field112.method2478());
				if (!Client.field112.method2478()) {
					class479.method8518(Client.field4548, "scape main", "", 255, false);
				} else {
					class298.method3735();
				}
			}

			if (5 != Client.field499) {
				if (-1L == class72.field895) {
					class72.field895 = class294.method2575() + 1000L;
				}

				long var4 = class294.method2575();
				boolean var6;
				if (null != Client.field784 && Client.field785 < Client.field784.size()) {
					while (true) {
						if (Client.field785 >= Client.field784.size()) {
							var6 = true;
							break;
						}

						class80 var7 = (class80)Client.field784.get(Client.field785);
						if (!var7.method2172()) {
							var6 = false;
							break;
						}

						++Client.field785;
					}
				} else {
					var6 = true;
				}

				if (var6 && -1L == class72.field924) {
					class72.field924 = var4;
					if (class72.field924 > class72.field895) {
						class72.field895 = class72.field924;
					}
				}

				if (10 == Client.field499 || Client.field499 == 11) {
					int var40;
					if (class67.field1736 == class359.field4317) {
						if (class36.field252 == 1 || !Client.field4941 && 4 == class36.field252) {
							var40 = 5 + class72.field907;
							short var8 = 463;
							byte var9 = 100;
							byte var10 = 35;
							if (class36.field250 >= var40 && class36.field250 <= var40 + var9 && class36.field251 >= var8 && class36.field251 <= var8 + var10) {
								class72.method2046();
								return;
							}
						}

						if (class72.field60 != null) {
							class72.method2046();
						}
					}

					var40 = class36.field252;
					int var41 = class36.field250;
					int var42 = class36.field251;
					if (var40 == 0) {
						var41 = class36.field242;
						var42 = class36.field243;
					}

					if (!Client.field4941 && var40 == 4) {
						var40 = 1;
					}

					class208 var43 = Client.field722;
					class208 var11 = var43;
					int var46;
					short var47;
					if (0 == class72.field898) {
						boolean var81 = false;

						while (var11.method4071()) {
							if (84 == var11.field2363) {
								var81 = true;
							}
						}

						var46 = class72.field1671 - 80;
						var47 = 291;
						if (var40 == 1 && var41 >= var46 - 75 && var41 <= var46 + 75 && var42 >= var47 - 20 && var42 <= var47 + 20) {
							class411.method7690(class181.method3515("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var46 = class72.field1671 + 80;
						if (var40 == 1 && var41 >= var46 - 75 && var41 <= var46 + 75 && var42 >= var47 - 20 && var42 <= var47 + 20 || var81) {
							if ((Client.field489 & 33554432) != 0) {
								class72.field904 = "";
								class72.field905 = class337.field3871;
								class72.field906 = class337.field4075;
								class72.field890 = class337.field4076;
								class72.method3061(1);
								if (Client.field540 && null != class72.field930 && class72.field930.length() > 0) {
									class72.field923 = 1;
								} else {
									class72.field923 = 0;
								}
							} else if ((Client.field489 & 4) != 0) {
								if ((Client.field489 & 1024) != 0) {
									class72.field905 = class337.field4093;
									class72.field906 = class337.field3935;
									class72.field890 = class337.field4073;
								} else {
									class72.field905 = class337.field3872;
									class72.field906 = class337.field3909;
									class72.field890 = class337.field3908;
								}

								class72.field904 = class337.field4074;
								class72.method3061(1);
								if (Client.field540 && class72.field930 != null && class72.field930.length() > 0) {
									class72.field923 = 1;
								} else {
									class72.field923 = 0;
								}
							} else if ((Client.field489 & 1024) != 0) {
								class72.field905 = class337.field4068;
								class72.field906 = class337.field4072;
								class72.field890 = class337.field4083;
								class72.field904 = class337.field4074;
								class72.method3061(1);
								if (Client.field540 && class72.field930 != null && class72.field930.length() > 0) {
									class72.field923 = 1;
								} else {
									class72.field923 = 0;
								}
							} else {
								class72.method46(false);
							}
						}
					} else {
						int var12;
						short var13;
						if (class72.field898 == 1) {
							while (true) {
								if (!var11.method4071()) {
									var12 = class72.field1671 - 80;
									var13 = 321;
									if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
										class72.method46(false);
									}

									var12 = class72.field1671 + 80;
									if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
										class72.method3061(0);
									}
									break;
								}

								if (var11.field2363 == 84) {
									class72.method46(false);
								} else if (13 == var11.field2363) {
									class72.method3061(0);
								}
							}
						} else {
							int var16;
							String var18;
							short var44;
							boolean var49;
							int var61;
							boolean var72;
							if (2 == class72.field898) {
								var44 = 201;
								var12 = var44 + 52;
								if (var40 == 1 && var42 >= var12 - 12 && var42 < var12 + 2) {
									class72.field923 = 0;
								}

								var12 += 15;
								if (var40 == 1 && var42 >= var12 - 12 && var42 < var12 + 2) {
									class72.field923 = 1;
								}

								var12 += 15;
								var44 = 361;
								if (null != class72.field1296) {
									var46 = class72.field1296.field4648 / 2;
									if (var40 == 1 && var41 >= class72.field1296.field4650 - var46 && var41 <= class72.field1296.field4650 + var46 && var42 >= var44 - 15 && var42 < var44) {
										switch(class72.field917) {
										case 1:
											class72.method4061(class337.field3915, class337.field4067, class337.field4115);
											class72.method3061(5);
											return;
										case 2:
											class411.method7690("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var46 = class72.field1671 - 80;
								var47 = 321;
								if (var40 == 1 && var41 >= var46 - 75 && var41 <= var46 + 75 && var42 >= var47 - 20 && var42 <= var47 + 20) {
									class72.field930 = class72.field930.trim();
									if (class72.field930.length() == 0) {
										class72.method4061(class337.field3957, class337.field3958, class337.field3959);
										return;
									}

									if (class72.field909.length() == 0) {
										class72.method4061(class337.field3984, class337.field4087, class337.field3962);
										return;
									}

									class72.method4061(class337.field4079, class337.field3910, class337.field3890);
									Client.method181(false);
									class139.method3145(20);
									return;
								}

								var46 = 80 + class72.field896 + 180;
								if (var40 == 1 && var41 >= var46 - 75 && var41 <= var46 + 75 && var42 >= var47 - 20 && var42 <= var47 + 20) {
									class72.method3061(0);
									class72.field930 = "";
									class72.field909 = "";
									Client.field2331 = 0;
									class72.field1374 = "";
									class72.field915 = true;
								}

								var46 = -117 + class72.field1671;
								var47 = 277;
								class72.field891 = var41 >= var46 && var41 < var46 + class72.field993 && var42 >= var47 && var42 < class72.field2097 + var47;
								if (var40 == 1 && class72.field891) {
									Client.field540 = !Client.field540;
									if (!Client.field540 && Client.field112.method2417() != null) {
										Client.field112.method2410((String)null);
									}
								}

								var46 = class72.field1671 + 24;
								var47 = 277;
								class72.field903 = var41 >= var46 && var41 < class72.field993 + var46 && var42 >= var47 && var42 < var47 + class72.field2097;
								if (var40 == 1 && class72.field903) {
									Client.field112.method2393(!Client.field112.method2394());
									if (!Client.field112.method2394()) {
										class72.field930 = "";
										Client.field112.method2410((String)null);
										if (Client.field540 && null != class72.field930 && class72.field930.length() > 0) {
											class72.field923 = 1;
										} else {
											class72.field923 = 0;
										}
									}
								}

								label1314:
								while (true) {
									Transferable var65;
									do {
										while (true) {
											label1278:
											do {
												while (true) {
													while (var11.method4071()) {
														if (var11.field2363 != 13) {
															if (class72.field923 != 0) {
																continue label1278;
															}

															char var54 = var11.field2362;

															for (var16 = 0; var16 < class72.field918.length() && var54 != class72.field918.charAt(var16); ++var16) {
															}

															if (85 == var11.field2363 && class72.field930.length() > 0) {
																class72.field930 = class72.field930.substring(0, class72.field930.length() - 1);
															}

															if (84 == var11.field2363 || var11.field2363 == 80) {
																class72.field923 = 1;
															}

															char var73 = var11.field2362;
															boolean var62 = class72.field918.indexOf(var73) != -1;
															if (var62 && class72.field930.length() < 320) {
																class72.field930 = class72.field930 + var11.field2362;
															}
														} else {
															class72.method3061(0);
															class72.field930 = "";
															class72.field909 = "";
															Client.field2331 = 0;
															class72.field1374 = "";
															class72.field915 = true;
														}
													}

													return;
												}
											} while(class72.field923 != 1);

											if (var11.field2363 == 85 && class72.field909.length() > 0) {
												class72.field909 = class72.field909.substring(0, class72.field909.length() - 1);
											} else if (84 == var11.field2363 || 80 == var11.field2363) {
												class72.field923 = 0;
												if (var11.field2363 == 84) {
													class72.field930 = class72.field930.trim();
													if (class72.field930.length() == 0) {
														class72.method4061(class337.field3957, class337.field3958, class337.field3959);
														return;
													}

													if (class72.field909.length() == 0) {
														class72.method4061(class337.field3984, class337.field4087, class337.field3962);
														return;
													}

													class72.method4061(class337.field4079, class337.field3910, class337.field3890);
													Client.method181(false);
													class139.method3145(20);
													return;
												}
											}

											if ((var11.method4076(82) || var11.method4076(87)) && 67 == var11.field2363) {
												Clipboard var57 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var65 = var57.getContents(Client.field466);
												var61 = 20 - class72.field909.length();
												break;
											}

											if (class36.method715(var11.field2362)) {
												char var64 = var11.field2362;
												var49 = class72.field918.indexOf(var64) != -1;
												if (var49 && class72.field909.length() < 20) {
													class72.field909 = class72.field909 + var11.field2362;
												}
											}
										}
									} while(var61 <= 0);

									try {
										var18 = (String)var65.getTransferData(DataFlavor.stringFlavor);
										int var78 = Math.min(var61, var18.length());
										int var80 = 0;

										while (true) {
											if (var80 >= var78) {
												class72.field909 = class72.field909 + var18.substring(0, var78);
												continue label1314;
											}

											if (!class36.method715(var18.charAt(var80))) {
												break;
											}

											char var82 = var18.charAt(var80);
											var72 = class72.field918.indexOf(var82) != -1;
											if (!var72) {
												break;
											}

											++var80;
										}

										class72.method3061(3);
										return;
									} catch (IOException var38) {
									} catch (UnsupportedFlavorException var39) {
									}
								}
							} else {
								class421 var14;
								if (class72.field898 == 3) {
									var12 = 180 + class72.field896;
									var13 = 241;
									var14 = var1.method7150(25, class337.field4100.length() - 34, class337.field4100, var12, var13);
									if (var40 == 1 && var14.method7791(var41, var42)) {
										class411.method7690(class337.field4161, true, false);
									}

									var12 = 180 + class72.field896;
									var13 = 276;
									if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
										class72.method2044(false);
									}

									var12 = 180 + class72.field896;
									var13 = 326;
									if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
										class72.method4061(class337.field3915, class337.field4067, class337.field4115);
										class72.method3061(5);
										return;
									}
								} else {
									int var15;
									if (4 == class72.field898) {
										var12 = 180 + class72.field896 - 80;
										var13 = 321;
										if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
											class72.field1374.trim();
											if (class72.field1374.length() != 6) {
												class72.method4061(class337.field3850, class337.field3877, class337.field3878);
												return;
											}

											Client.field2331 = Integer.parseInt(class72.field1374);
											class72.field1374 = "";
											Client.method181(true);
											class72.method4061(class337.field4079, class337.field3910, class337.field3890);
											class139.method3145(20);
											return;
										}

										if (var40 == 1 && var41 >= class72.field896 + 180 - 9 && var41 <= class72.field896 + 180 + 130 && var42 >= 263 && var42 <= 296) {
											class72.field915 = !class72.field915;
										}

										if (var40 == 1 && var41 >= class72.field896 + 180 - 34 && var41 <= 180 + class72.field896 + 34 && var42 >= 351 && var42 <= 363) {
											class411.method7690(class181.method3515("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
										}

										var12 = 80 + 180 + class72.field896;
										if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
											class72.method3061(0);
											class72.field930 = "";
											class72.field909 = "";
											Client.field2331 = 0;
											class72.field1374 = "";
										}

										while (var11.method4071()) {
											boolean var45 = false;

											for (var15 = 0; var15 < class72.field892.length(); ++var15) {
												if (var11.field2362 == class72.field892.charAt(var15)) {
													var45 = true;
													break;
												}
											}

											if (var11.field2363 == 13) {
												class72.method3061(0);
												class72.field930 = "";
												class72.field909 = "";
												Client.field2331 = 0;
												class72.field1374 = "";
											} else {
												if (85 == var11.field2363 && class72.field1374.length() > 0) {
													class72.field1374 = class72.field1374.substring(0, class72.field1374.length() - 1);
												}

												if (var11.field2363 == 84) {
													class72.field1374.trim();
													if (class72.field1374.length() != 6) {
														class72.method4061(class337.field3850, class337.field3877, class337.field3878);
														return;
													}

													Client.field2331 = Integer.parseInt(class72.field1374);
													class72.field1374 = "";
													Client.method181(true);
													class72.method4061(class337.field4079, class337.field3910, class337.field3890);
													class139.method3145(20);
													return;
												}

												if (var45 && class72.field1374.length() < 6) {
													class72.field1374 = class72.field1374 + var11.field2362;
												}
											}
										}
									} else if (5 == class72.field898) {
										var12 = 180 + class72.field896 - 80;
										var13 = 321;
										if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
											class72.field930 = class72.field930.trim();
											if (class72.field930.length() == 0) {
												class72.method4061(class337.field3915, class337.field4067, class337.field4115);
											} else {
												long var51 = class265.method5285((byte)-87);
												byte var48;
												if (var51 == 0L) {
													var48 = 5;
												} else {
													var18 = class72.field930;
													Random var71 = new Random();
													class489 var60 = new class489(128);
													class489 var66 = new class489(128);
													int[] var74 = new int[]{var71.nextInt(), var71.nextInt(), (int)(var51 >> 32), (int)var51};
													var60.method8695(10);

													int var79;
													for (var79 = 0; var79 < 4; ++var79) {
														var60.method8644(var71.nextInt());
													}

													var60.method8644(var74[0]);
													var60.method8644(var74[1]);
													var60.method8640(var51);
													var60.method8640(0L);

													for (var79 = 0; var79 < 4; ++var79) {
														var60.method8644(var71.nextInt());
													}

													var60.method8685(class69.field875, class69.field872);
													var66.method8695(10);

													for (var79 = 0; var79 < 3; ++var79) {
														var66.method8644(var71.nextInt());
													}

													var66.method8640(var71.nextLong());
													var66.method8854(var71.nextLong());
													class384.method7283(var66);
													var66.method8640(var71.nextLong());
													var66.method8685(class69.field875, class69.field872);
													var79 = class489.method2092(var18);
													if (var79 % 8 != 0) {
														var79 += 8 - var79 % 8;
													}

													class489 var83 = new class489(var79);
													var83.method8648(var18);
													var83.field4989 = var79;
													var83.method8901(var74);
													class489 var88 = new class489(var83.field4989 + var66.field4989 + var60.field4989 + 5);
													var88.method8695(2);
													var88.method8695(var60.field4989);
													var88.method8886(var60.field4991, 0, var60.field4989);
													var88.method8695(var66.field4989);
													var88.method8886(var66.field4991, 0, var66.field4989);
													var88.method8642(var83.field4989);
													var88.method8886(var83.field4991, 0, var83.field4989);
													String var86 = class371.method5231(var88.field4991);

													byte var52;
													try {
														URL var87 = new URL(class181.method3515("services", false) + "m=accountappeal/login.ws");
														URLConnection var89 = var87.openConnection();
														var89.setDoInput(true);
														var89.setDoOutput(true);
														var89.setConnectTimeout(5000);
														OutputStreamWriter var91 = new OutputStreamWriter(var89.getOutputStream());
														var91.write("data2=" + class398.method7435(var86) + "&dest=" + class398.method7435("passwordchoice.ws"));
														var91.flush();
														InputStream var92 = var89.getInputStream();
														var88 = new class489(new byte[1000]);

														while (true) {
															int var93 = var92.read(var88.field4991, var88.field4989, 1000 - var88.field4989);
															if (var93 == -1) {
																var91.close();
																var92.close();
																String var94 = new String(var88.field4991);
																if (var94.startsWith("OFFLINE")) {
																	var52 = 4;
																} else if (var94.startsWith("WRONG")) {
																	var52 = 7;
																} else if (var94.startsWith("RELOAD")) {
																	var52 = 3;
																} else if (var94.startsWith("Not permitted for social network accounts.")) {
																	var52 = 6;
																} else {
																	var88.method8682(var74);

																	while (var88.field4989 > 0 && var88.field4991[var88.field4989 - 1] == 0) {
																		--var88.field4989;
																	}

																	var94 = new String(var88.field4991, 0, var88.field4989);
																	if (class99.method2597(var94)) {
																		class411.method7690(var94, true, false);
																		var52 = 2;
																	} else {
																		var52 = 5;
																	}
																}
																break;
															}

															var88.field4989 += var93;
															if (var88.field4989 >= 1000) {
																var52 = 5;
																break;
															}
														}
													} catch (Throwable var34) {
														var34.printStackTrace();
														var52 = 5;
													}

													var48 = var52;
												}

												switch(var48) {
												case 2:
													class72.method4061(class337.field4009, class337.field4033, class337.field4118);
													class72.method3061(6);
													break;
												case 3:
													class72.method4061(class337.field4119, class337.field4120, class337.field3992);
													break;
												case 4:
													class72.method4061(class337.field4122, class337.field4123, class337.field4124);
													break;
												case 5:
													class72.method4061(class337.field4125, class337.field4126, class337.field4127);
													break;
												case 6:
													class72.method4061(class337.field4086, class337.field3963, class337.field4130);
													break;
												case 7:
													class72.method4061(class337.field4131, class337.field4132, class337.field4133);
												}
											}

											return;
										}

										var12 = class72.field896 + 180 + 80;
										if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
											class72.method46(true);
										}

										var47 = 361;
										if (class72.field104 != null) {
											var15 = class72.field104.field4648 / 2;
											if (var40 == 1 && var41 >= class72.field104.field4650 - var15 && var41 <= var15 + class72.field104.field4650 && var42 >= var47 - 15 && var42 < var47) {
												class411.method7690(class181.method3515("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var11.method4071()) {
											var49 = false;

											for (var16 = 0; var16 < class72.field918.length(); ++var16) {
												if (var11.field2362 == class72.field918.charAt(var16)) {
													var49 = true;
													break;
												}
											}

											if (var11.field2363 == 13) {
												class72.method46(true);
											} else {
												if (85 == var11.field2363 && class72.field930.length() > 0) {
													class72.field930 = class72.field930.substring(0, class72.field930.length() - 1);
												}

												if (var11.field2363 == 84) {
													class72.field930 = class72.field930.trim();
													if (class72.field930.length() == 0) {
														class72.method4061(class337.field3915, class337.field4067, class337.field4115);
													} else {
														long var17 = class265.method5285((byte)-50);
														byte var50;
														if (var17 == 0L) {
															var50 = 5;
														} else {
															String var20 = class72.field930;
															Random var21 = new Random();
															class489 var22 = new class489(128);
															class489 var23 = new class489(128);
															int[] var24 = new int[]{var21.nextInt(), var21.nextInt(), (int)(var17 >> 32), (int)var17};
															var22.method8695(10);

															int var25;
															for (var25 = 0; var25 < 4; ++var25) {
																var22.method8644(var21.nextInt());
															}

															var22.method8644(var24[0]);
															var22.method8644(var24[1]);
															var22.method8640(var17);
															var22.method8640(0L);

															for (var25 = 0; var25 < 4; ++var25) {
																var22.method8644(var21.nextInt());
															}

															var22.method8685(class69.field875, class69.field872);
															var23.method8695(10);

															for (var25 = 0; var25 < 3; ++var25) {
																var23.method8644(var21.nextInt());
															}

															var23.method8640(var21.nextLong());
															var23.method8854(var21.nextLong());
															class384.method7283(var23);
															var23.method8640(var21.nextLong());
															var23.method8685(class69.field875, class69.field872);
															var25 = class489.method2092(var20);
															if (0 != var25 % 8) {
																var25 += 8 - var25 % 8;
															}

															class489 var26 = new class489(var25);
															var26.method8648(var20);
															var26.field4989 = var25;
															var26.method8901(var24);
															class489 var27 = new class489(5 + var22.field4989 + var23.field4989 + var26.field4989);
															var27.method8695(2);
															var27.method8695(var22.field4989);
															var27.method8886(var22.field4991, 0, var22.field4989);
															var27.method8695(var23.field4989);
															var27.method8886(var23.field4991, 0, var23.field4989);
															var27.method8642(var26.field4989);
															var27.method8886(var26.field4991, 0, var26.field4989);
															String var28 = class371.method5231(var27.field4991);

															byte var19;
															try {
																URL var29 = new URL(class181.method3515("services", false) + "m=accountappeal/login.ws");
																URLConnection var30 = var29.openConnection();
																var30.setDoInput(true);
																var30.setDoOutput(true);
																var30.setConnectTimeout(5000);
																OutputStreamWriter var31 = new OutputStreamWriter(var30.getOutputStream());
																var31.write("data2=" + class398.method7435(var28) + "&dest=" + class398.method7435("passwordchoice.ws"));
																var31.flush();
																InputStream var32 = var30.getInputStream();
																var27 = new class489(new byte[1000]);

																while (true) {
																	int var33 = var32.read(var27.field4991, var27.field4989, 1000 - var27.field4989);
																	if (var33 == -1) {
																		var31.close();
																		var32.close();
																		String var95 = new String(var27.field4991);
																		if (var95.startsWith("OFFLINE")) {
																			var19 = 4;
																		} else if (var95.startsWith("WRONG")) {
																			var19 = 7;
																		} else if (var95.startsWith("RELOAD")) {
																			var19 = 3;
																		} else if (var95.startsWith("Not permitted for social network accounts.")) {
																			var19 = 6;
																		} else {
																			var27.method8682(var24);

																			while (var27.field4989 > 0 && 0 == var27.field4991[var27.field4989 - 1]) {
																				--var27.field4989;
																			}

																			var95 = new String(var27.field4991, 0, var27.field4989);
																			if (class99.method2597(var95)) {
																				class411.method7690(var95, true, false);
																				var19 = 2;
																			} else {
																				var19 = 5;
																			}
																		}
																		break;
																	}

																	var27.field4989 += var33;
																	if (var27.field4989 >= 1000) {
																		var19 = 5;
																		break;
																	}
																}
															} catch (Throwable var35) {
																var35.printStackTrace();
																var19 = 5;
															}

															var50 = var19;
														}

														switch(var50) {
														case 2:
															class72.method4061(class337.field4009, class337.field4033, class337.field4118);
															class72.method3061(6);
															break;
														case 3:
															class72.method4061(class337.field4119, class337.field4120, class337.field3992);
															break;
														case 4:
															class72.method4061(class337.field4122, class337.field4123, class337.field4124);
															break;
														case 5:
															class72.method4061(class337.field4125, class337.field4126, class337.field4127);
															break;
														case 6:
															class72.method4061(class337.field4086, class337.field3963, class337.field4130);
															break;
														case 7:
															class72.method4061(class337.field4131, class337.field4132, class337.field4133);
														}
													}

													return;
												}

												if (var49 && class72.field930.length() < 320) {
													class72.field930 = class72.field930 + var11.field2362;
												}
											}
										}
									} else if (class72.field898 != 6) {
										if (class72.field898 == 7) {
											if (class72.field2984 && !Client.field562) {
												var12 = class72.field1671 - 150;
												var46 = 40 + var12 + 240 + 25;
												var47 = 231;
												var15 = var47 + 40;
												if (var40 == 1 && var41 >= var12 && var41 <= var46 && var42 >= var47 && var42 <= var15) {
													var61 = var12;
													int var55 = 0;

													while (true) {
														if (var55 >= 8) {
															var16 = 0;
															break;
														}

														if (var41 <= var61 + 30) {
															var16 = var55;
															break;
														}

														var61 += 30;
														var61 += var55 != 1 && var55 != 3 ? 5 : 20;
														++var55;
													}

													class72.field910 = var16;
												}

												var16 = class72.field896 + 180 - 80;
												short var67 = 321;
												boolean var58;
												Date var63;
												SimpleDateFormat var68;
												boolean var70;
												Date var75;
												StringBuilder var76;
												Date var77;
												int var84;
												String[] var85;
												String var90;
												if (var40 == 1 && var41 >= var16 - 75 && var41 <= var16 + 75 && var42 >= var67 - 20 && var42 <= var67 + 20) {
													label1130: {
														try {
															var68 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
															var68.setLenient(false);
															var76 = new StringBuilder();
															var85 = class72.field911;
															var84 = 0;

															while (true) {
																if (var84 < var85.length) {
																	var90 = var85[var84];
																	if (var90 != null) {
																		var76.append(var90);
																		++var84;
																		continue;
																	}

																	class72.method5270("Date not valid.", "Please ensure all characters are populated.", "");
																	var63 = null;
																} else {
																	var76.append("12");
																	var63 = var68.parse(var76.toString());
																}

																var75 = var63;
																break;
															}
														} catch (ParseException var37) {
															class72.method5270("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var58 = false;
															break label1130;
														}

														if (var75 == null) {
															var58 = false;
														} else {
															var70 = class72.method2191(var75);
															var77 = class72.method2688();
															var72 = var75.after(var77);
															if (!var72) {
																class72.method5270("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var58 = false;
															} else {
																if (!var70) {
																	Client.field4479 = 8388607;
																} else {
																	Client.field4479 = (int)(var75.getTime() / 86400000L - 11745L);
																}

																var58 = true;
															}
														}
													}

													if (var58) {
														class139.method3145(50);
														return;
													}
												}

												var16 = 80 + class72.field896 + 180;
												if (var40 == 1 && var41 >= var16 - 75 && var41 <= var16 + 75 && var42 >= var67 - 20 && var42 <= var67 + 20) {
													class72.field911 = new String[8];
													class72.method46(true);
												}

												while (var11.method4071()) {
													if (101 == var11.field2363) {
														class72.field911[class72.field910] = null;
													}

													if (var11.field2363 == 85) {
														if (null == class72.field911[class72.field910] && class72.field910 > 0) {
															--class72.field910;
														}

														class72.field911[class72.field910] = null;
													}

													if (var11.field2362 >= '0' && var11.field2362 <= '9') {
														class72.field911[class72.field910] = "" + var11.field2362;
														if (class72.field910 < 7) {
															++class72.field910;
														}
													}

													if (var11.field2363 == 84) {
														label1059: {
															try {
																var68 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																var68.setLenient(false);
																var76 = new StringBuilder();
																var85 = class72.field911;
																var84 = 0;

																while (true) {
																	if (var84 >= var85.length) {
																		var76.append("12");
																		var63 = var68.parse(var76.toString());
																		break;
																	}

																	var90 = var85[var84];
																	if (var90 == null) {
																		class72.method5270("Date not valid.", "Please ensure all characters are populated.", "");
																		var63 = null;
																		break;
																	}

																	var76.append(var90);
																	++var84;
																}

																var75 = var63;
															} catch (ParseException var36) {
																class72.method5270("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var58 = false;
																break label1059;
															}

															if (var75 == null) {
																var58 = false;
															} else {
																var70 = class72.method2191(var75);
																var77 = class72.method2688();
																var72 = var75.after(var77);
																if (!var72) {
																	class72.method5270("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var58 = false;
																} else {
																	if (!var70) {
																		Client.field4479 = 8388607;
																	} else {
																		Client.field4479 = (int)(var75.getTime() / 86400000L - 11745L);
																	}

																	var58 = true;
																}
															}
														}

														if (var58) {
															class139.method3145(50);
														}

														return;
													}
												}
											} else {
												var12 = class72.field896 + 180 - 80;
												var13 = 321;
												if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
													class411.method7690(class181.method3515("secure", true) + "m=dob/set_dob.ws", true, false);
													class72.method4061(class337.field4110, class337.field4111, class337.field4112);
													class72.method3061(6);
													return;
												}

												var12 = 80 + class72.field896 + 180;
												if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
													class72.method46(true);
												}
											}
										} else if (8 == class72.field898) {
											var12 = class72.field896 + 180 - 80;
											var13 = 321;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class411.method7690("https://www.jagex.com/terms/privacy", true, false);
												class72.method4061(class337.field4110, class337.field4111, class337.field4112);
												class72.method3061(6);
												return;
											}

											var12 = 80 + class72.field896 + 180;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.method46(true);
											}
										} else if (9 == class72.field898) {
											var12 = 180 + class72.field896;
											var13 = 311;
											if (84 == var43.field2363 || var43.field2363 == 13 || var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.method2044(false);
											}
										} else if (10 == class72.field898) {
											var12 = class72.field896 + 180;
											var13 = 209;
											if (var43.field2363 == 84 || var40 == 1 && var41 >= var12 - 109 && var41 <= var12 + 109 && var42 >= var13 && var42 <= var13 + 68) {
												class72.method4061(class337.field4079, class337.field3910, class337.field3890);
												Client.field528 = class494.field5045;
												Client.method181(false);
												class139.method3145(20);
											}
										} else if (class72.field898 == 12) {
											var12 = class72.field1671;
											var13 = 233;
											var14 = var2.method7150(0, 30, class337.field3932, var12, var13);
											class421 var53 = var2.method7150(32, 32, class337.field3932, var12, var13);
											class421 var59 = var2.method7150(70, 34, class337.field3932, var12, var13);
											var46 = var13 + 17;
											class421 var69 = var2.method7150(0, 34, class337.field4143, var12, var46);
											if (var40 == 1) {
												if (var14.method7791(var41, var42)) {
													class411.method7690("https://www.jagex.com/terms", true, false);
												} else if (var53.method7791(var41, var42)) {
													class411.method7690("https://www.jagex.com/terms/privacy", true, false);
												} else if (var59.method7791(var41, var42) || var69.method7791(var41, var42)) {
													class411.method7690("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var12 = class72.field1671 - 80;
											var13 = 311;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												Client.field112.method2412(Client.field494);
												class72.method2044(true);
											}

											var12 = class72.field1671 + 80;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.field898 = 13;
											}
										} else if (class72.field898 == 13) {
											var12 = class72.field1671;
											var13 = 321;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.method2044(true);
											}
										} else if (class72.field898 == 14) {
											String var56 = "";
											switch(class72.field899) {
											case 0:
												var56 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var56 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var56 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class72.method46(false);
											}

											var46 = class72.field896 + 180;
											var47 = 276;
											if (var40 == 1 && var41 >= var46 - 75 && var41 <= var46 + 75 && var42 >= var47 - 20 && var42 <= var47 + 20) {
												class411.method7690(var56, true, false);
												class72.method4061(class337.field4110, class337.field4111, class337.field4112);
												class72.method3061(6);
												return;
											}

											var46 = class72.field896 + 180;
											var47 = 326;
											if (var40 == 1 && var41 >= var46 - 75 && var41 <= var46 + 75 && var42 >= var47 - 20 && var42 <= var47 + 20) {
												class72.method46(false);
											}
										} else if (24 == class72.field898) {
											var12 = class72.field896 + 180;
											var13 = 301;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.method2044(false);
											}
										} else if (32 == class72.field898) {
											var12 = 180 + class72.field896 - 80;
											var13 = 321;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class411.method7690(class181.method3515("secure", true) + "m=dob/set_dob.ws", true, false);
												class72.method4061(class337.field4110, class337.field4111, class337.field4112);
												class72.method3061(6);
												return;
											}

											var12 = 80 + 180 + class72.field896;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.method46(true);
											}
										} else if (class72.field898 == 33) {
											var12 = 180 + class72.field896;
											var13 = 276;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class411.method7690(class337.field4161, true, false);
											}

											var12 = 180 + class72.field896;
											var13 = 326;
											if (var40 == 1 && var41 >= var12 - 75 && var41 <= var12 + 75 && var42 >= var13 - 20 && var42 <= var13 + 20) {
												class72.method46(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var11.method4071()) {
													var44 = 321;
													if (var40 == 1 && var42 >= var44 - 20 && var42 <= var44 + 20) {
														class72.method46(true);
													}

													return;
												}
											} while(84 != var11.field2363 && var11.field2363 != 13);

											class72.method46(true);
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}

	static final void method3621(class288 var0) {
		class488 var2 = Client.field753.field1386;
		int var3;
		int var6;
		int var7;
		int var8;
		int var10;
		byte var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var32;
		int var33;
		int var34;
		int var39;
		if (var0 == class288.field3201) {
			var3 = var2.method8658();
			var32 = var2.method8658();
			var33 = (var32 >> 4 & 7) + Client.field44;
			var6 = (var32 & 7) + Client.field4883;
			var7 = var2.method8641() * 4;
			var8 = var2.method8700();
			var34 = var2.method8641();
			var10 = var2.method8660();
			var11 = var2.method8834();
			var12 = var2.method8692() * 4;
			var13 = var2.method8660();
			var14 = var2.method8719();
			byte var45 = var2.method8694();
			var15 = var45 + var33;
			var39 = var11 + var6;
			if (var33 >= 0 && var6 >= 0 && var33 < 104 && var6 < 104 && var15 >= 0 && var39 >= 0 && var15 < 104 && var39 < 104 && var8 != 65535) {
				var33 = var33 * 128 + 64;
				var6 = 64 + var6 * 128;
				var15 = 64 + var15 * 128;
				var39 = var39 * 128 + 64;
				class73 var46 = new class73(var8, Client.field231, var33, var6, class148.method3196(var33, var6, Client.field231) - var12, Client.field602 + var10, var13 + Client.field602, var3, var34, var14, var7);
				var46.method2052(var15, var39, class148.method3196(var15, var39, Client.field231) - var7, Client.field602 + var10);
				Client.field551.method6711(var46);
			}

		} else {
			if (var0 == class288.field3198) {
				var3 = var2.method8660();
				byte var4 = var2.method8694();
				byte var5 = var2.method8788();
				var6 = var2.method8691();
				var7 = (var6 >> 4 & 7) + Client.field44;
				var8 = Client.field4883 + (var6 & 7);
				byte var9 = var2.method8659();
				var10 = var2.method8660();
				var11 = var2.method8788();
				var12 = var2.method8658();
				var13 = var12 >> 2;
				var14 = var12 & 3;
				var15 = Client.field564[var13];
				int var16 = var2.method8700();
				int var17 = var2.method8701();
				class88 var18;
				if (var3 == Client.field664) {
					var18 = Client.field3454;
				} else {
					var18 = Client.field611[var3];
				}

				if (null != var18) {
					class201 var19 = class145.method3177(var17);
					int var20;
					int var21;
					if (var14 != 1 && var14 != 3) {
						var20 = var19.field2172;
						var21 = var19.field2173;
					} else {
						var20 = var19.field2173;
						var21 = var19.field2172;
					}

					int var22 = var7 + (var20 >> 1);
					int var23 = var7 + (var20 + 1 >> 1);
					int var24 = (var21 >> 1) + var8;
					int var25 = (var21 + 1 >> 1) + var8;
					int[][] var26 = class78.field1002[Client.field231];
					int var27 = var26[var22][var25] + var26[var23][var24] + var26[var22][var24] + var26[var23][var25] >> 2;
					int var28 = (var7 << 7) + (var20 << 6);
					int var29 = (var21 << 6) + (var8 << 7);
					class232 var30 = var19.method3858(var13, var14, var26, var28, var27, var29);
					if (var30 != null) {
						class34.method509(Client.field231, var7, var8, var15, -1, 0, 0, 31, var10 + 1, var16 + 1);
						var18.field1093 = Client.field602 + var10;
						var18.field1094 = var16 + Client.field602;
						var18.field1098 = var30;
						var18.field1095 = var7 * 128 + var20 * 64;
						var18.field1099 = var8 * 128 + var21 * 64;
						var18.field1086 = var27;
						byte var31;
						if (var9 > var11) {
							var31 = var9;
							var9 = var11;
							var11 = var31;
						}

						if (var4 > var5) {
							var31 = var4;
							var4 = var5;
							var5 = var31;
						}

						var18.field1100 = var7 + var9;
						var18.field1091 = var7 + var11;
						var18.field1087 = var8 + var4;
						var18.field1101 = var5 + var8;
					}
				}
			}

			if (var0 == class288.field3197) {
				var3 = var2.method8641();
				var32 = (var3 >> 4 & 7) + Client.field44;
				var33 = (var3 & 7) + Client.field4883;
				var6 = var2.method8664();
				var7 = var2.method8701();
				var8 = var2.method8664();
				if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
					class363 var43 = Client.field624[Client.field231][var32][var33];
					if (var43 != null) {
						for (class100 var37 = (class100)var43.method6716(); var37 != null; var37 = (class100)var43.method6725()) {
							if ((var7 & 32767) == var37.field1317 && var8 == var37.field1313) {
								var37.field1313 = var6;
								break;
							}
						}

						class122.method2927(var32, var33);
					}
				}

			} else {
				class100 var38;
				if (class288.field3206 == var0) {
					var2.method8691();
					var3 = var2.method8712();
					var32 = var2.method8691();
					var33 = var2.method8658();
					var6 = Client.field44 + (var33 >> 4 & 7);
					var7 = Client.field4883 + (var33 & 7);
					var8 = var2.method8700();
					var2.method8737();
					var2.method8700();
					var2.method8692();
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
						var38 = new class100();
						var38.field1317 = var8;
						var38.field1313 = var3;
						var38.method2604(var32);
						if (Client.field624[Client.field231][var6][var7] == null) {
							Client.field624[Client.field231][var6][var7] = new class363();
						}

						Client.field624[Client.field231][var6][var7].method6711(var38);
						class122.method2927(var6, var7);
					}

				} else if (var0 == class288.field3203) {
					var3 = var2.method8658();
					var32 = var2.method8641();
					var33 = Client.field44 + (var32 >> 4 & 7);
					var6 = (var32 & 7) + Client.field4883;
					var7 = var2.method8692();
					var8 = var7 >> 2;
					var34 = var7 & 3;
					var10 = Client.field564[var8];
					var39 = var2.method8737();
					if (var33 >= 0 && var6 >= 0 && var33 < 104 && var6 < 104) {
						class34.method509(Client.field231, var33, var6, var10, var39, var8, var34, var3, 0, -1);
					}

				} else {
					class363 var35;
					if (class288.field3205 == var0) {
						var3 = var2.method8692();
						var32 = (var3 >> 4 & 7) + Client.field44;
						var33 = (var3 & 7) + Client.field4883;
						var6 = var2.method8737();
						var7 = var2.method8713();
						if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
							var35 = Client.field624[Client.field231][var32][var33];
							if (null != var35) {
								for (var38 = (class100)var35.method6716(); null != var38; var38 = (class100)var35.method6725()) {
									if ((var6 & 32767) == var38.field1317 && var38.field1313 == var7) {
										var38.method8051();
										break;
									}
								}

								if (var35.method6716() == null) {
									Client.field624[Client.field231][var32][var33] = null;
								}

								class122.method2927(var32, var33);
							}
						}

					} else {
						if (class288.field3209 == var0) {
							var3 = var2.method8701();
							var32 = var2.method8692();
							var33 = var32 >> 4 & 15;
							var6 = var32 & 7;
							var7 = var2.method8691();
							var8 = Client.field44 + (var7 >> 4 & 7);
							var34 = (var7 & 7) + Client.field4883;
							var10 = var2.method8641();
							if (var8 >= 0 && var34 >= 0 && var8 < 104 && var34 < 104) {
								var39 = var33 + 1;
								if (Client.field3454.field1174[0] >= var8 - var39 && Client.field3454.field1174[0] <= var39 + var8 && Client.field3454.field1176[0] >= var34 - var39 && Client.field3454.field1176[0] <= var34 + var39 && Client.field112.method2409() != 0 && var6 > 0 && Client.field507 < 50) {
									Client.field741[Client.field507] = var3;
									Client.field603[Client.field507] = var6;
									Client.field556[Client.field507] = var10;
									Client.field745[Client.field507] = null;
									Client.field744[Client.field507] = (var34 << 8) + (var8 << 16) + var33;
									++Client.field507;
								}
							}
						}

						if (var0 == class288.field3204) {
							var3 = var2.method8701();
							var32 = var2.method8692();
							var33 = (var32 >> 4 & 7) + Client.field44;
							var6 = (var32 & 7) + Client.field4883;
							var7 = var2.method8691();
							if (var33 >= 0 && var6 >= 0 && var33 < 104 && var6 < 104) {
								var35 = Client.field624[Client.field231][var33][var6];
								if (null != var35) {
									for (var38 = (class100)var35.method6716(); null != var38; var38 = (class100)var35.method6725()) {
										if ((var3 & 32767) == var38.field1317) {
											var38.method2604(var7);
											break;
										}
									}
								}
							}

						} else if (var0 != class288.field3200) {
							if (class288.field3207 == var0) {
								var3 = var2.method8691();
								var32 = Client.field44 + (var3 >> 4 & 7);
								var33 = Client.field4883 + (var3 & 7);
								var6 = var2.method8658();
								var7 = var6 >> 2;
								var8 = var6 & 3;
								var34 = Client.field564[var7];
								if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
									class34.method509(Client.field231, var32, var33, var34, -1, var7, var8, 31, 0, -1);
								}

							} else if (var0 == class288.field3202) {
								var3 = var2.method8692();
								var32 = var2.method8660();
								var33 = var2.method8641();
								var6 = (var33 >> 4 & 7) + Client.field44;
								var7 = Client.field4883 + (var33 & 7);
								var8 = var2.method8737();
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
									var6 = var6 * 128 + 64;
									var7 = var7 * 128 + 64;
									class68 var36 = new class68(var8, Client.field231, var6, var7, class148.method3196(var6, var7, Client.field231) - var3, var32, Client.field602);
									Client.field627.method6711(var36);
								}

							}
						} else {
							var3 = var2.method8658();
							var32 = (var3 >> 4 & 7) + Client.field44;
							var33 = (var3 & 7) + Client.field4883;
							var6 = var2.method8737();
							var7 = var2.method8692();
							var8 = var7 >> 2;
							var34 = var7 & 3;
							var10 = Client.field564[var8];
							if (var32 >= 0 && var33 >= 0 && var32 < 103 && var33 < 103) {
								if (var10 == 0) {
									class240 var40 = Client.field180.method4390(Client.field231, var32, var33);
									if (var40 != null) {
										var12 = class233.method2194(var40.field2816);
										if (var8 == 2) {
											var40.field2813 = new class76(var12, 2, var34 + 4, Client.field231, var32, var33, var6, false, var40.field2813);
											var40.field2817 = new class76(var12, 2, var34 + 1 & 3, Client.field231, var32, var33, var6, false, var40.field2817);
										} else {
											var40.field2813 = new class76(var12, var8, var34, Client.field231, var32, var33, var6, false, var40.field2813);
										}

										return;
									}
								}

								if (var10 == 1) {
									class242 var41 = Client.field180.method4391(Client.field231, var32, var33);
									if (null != var41) {
										var12 = class233.method2194(var41.field2822);
										if (var8 != 4 && var8 != 5) {
											if (var8 == 6) {
												var41.field2828 = new class76(var12, 4, var34 + 4, Client.field231, var32, var33, var6, false, var41.field2828);
											} else if (var8 == 7) {
												var41.field2828 = new class76(var12, 4, (var34 + 2 & 3) + 4, Client.field231, var32, var33, var6, false, var41.field2828);
											} else if (var8 == 8) {
												var41.field2828 = new class76(var12, 4, var34 + 4, Client.field231, var32, var33, var6, false, var41.field2828);
												var41.field2826 = new class76(var12, 4, 4 + (var34 + 2 & 3), Client.field231, var32, var33, var6, false, var41.field2826);
											}
										} else {
											var41.field2828 = new class76(var12, 4, var34, Client.field231, var32, var33, var6, false, var41.field2828);
										}

										return;
									}
								}

								if (var10 == 2) {
									class243 var42 = Client.field180.method4446(Client.field231, var32, var33);
									if (var8 == 11) {
										var8 = 10;
									}

									if (null != var42) {
										var42.field2838 = new class76(class233.method2194(var42.field2846), var8, var34, Client.field231, var32, var33, var6, false, var42.field2838);
										return;
									}
								}

								if (var10 == 3) {
									class215 var44 = Client.field180.method4393(Client.field231, var32, var33);
									if (var44 != null) {
										var44.field2460 = new class76(class233.method2194(var44.field2461), 22, var34, Client.field231, var32, var33, var6, false, var44.field2460);
										return;
									}
								}

								class187.method3606(Client.field231, var32, var33, var10, var6);
							}

						}
					}
				}
			}
		}
	}
}
