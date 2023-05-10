public class class339 implements class357 {
	static final class339 field4168;
	static final class339 field4169;
	static final class339 field4171;
	static final class339 field4172;
	static final class339 field4173;
	static final class339 field4174;
	static final class339 field4175;
	static final class339 field4176;
	static final class339 field4177;
	static final class339 field4178;
	static final class339 field4179;
	static final class339 field4180;
	static final class339 field4181;
	static final class339 field4182;
	static final class339 field4183;
	static final class339 field4184;
	static final class339 field4187;
	final int field4188;
	public final boolean field4170;
	public final boolean field4186;
	public final int field4185;

	static {
		field4181 = new class339(0, -1, true, false, true);
		field4168 = new class339(1, 0, true, true, true);
		field4169 = new class339(2, 1, true, true, false);
		field4178 = new class339(3, 2, false, false, true);
		field4184 = new class339(4, 3, false, false, true);
		field4172 = new class339(5, 10, false, false, true);
		field4173 = new class339(6, 22, false, false, true);
		field4174 = new class339(7, 41, false, false, true);
		field4175 = new class339(8, 42, false, false, true);
		field4176 = new class339(9, 43, false, false, true);
		field4177 = new class339(10, 44, false, false, true);
		field4187 = new class339(11, 45, false, false, true);
		field4179 = new class339(12, 46, false, false, true);
		field4182 = new class339(13, 47, false, false, true);
		field4180 = new class339(14, 48, false, false, true);
		field4171 = new class339(15, 49, false, false, true);
		field4183 = new class339(16, 52, false, false, true);
	}

	class339(int var1, int var2, boolean var3, boolean var4, boolean var5) {
		this.field4188 = var1;
		this.field4185 = var2;
		this.field4186 = var4;
		this.field4170 = var5;
	}

	public int method6674() {
		return this.field4188;
	}

	public static class339[] method6352() {
		return new class339[]{field4178, field4181, field4177, field4169, field4184, field4183, field4173, field4176, field4182, field4187, field4175, field4180, field4168, field4179, field4172, field4174, field4171};
	}

	static void method6370(class84 var0, int var1, int var2) {
		Object[] var4 = var0.field1052;
		class75 var5;
		int var22;
		if (class293.method5522(var0.field1051)) {
			class67.field4480 = (class272)var4[0];
			class183 var6 = class355.method6671(class67.field4480.field3069);
			var5 = class75.method3273(var0.field1051, var6.field1917, var6.field1937);
		} else {
			var22 = (Integer)var4[0];
			var5 = class75.method6314(var22);
		}

		if (null != var5) {
			class67.field836 = 0;
			class67.field1015 = 0;
			var22 = -1;
			int[] var7 = var5.field964;
			int[] var8 = var5.field965;
			byte var9 = -1;
			class67.field846 = 0;
			class67.field850 = false;
			boolean var10 = false;
			int var11 = 0;

			int var14;
			try {
				class67.field845 = new int[var5.field967];
				int var24 = 0;
				class67.field851 = new String[var5.field968];
				int var25 = 0;

				int var15;
				String var36;
				for (var14 = 1; var14 < var4.length; ++var14) {
					if (var4[var14] instanceof Integer) {
						var15 = (Integer)var4[var14];
						if (var15 == -2147483647) {
							var15 = var0.field1043;
						}

						if (var15 == -2147483646) {
							var15 = var0.field1044;
						}

						if (var15 == -2147483645) {
							var15 = var0.field1048 != null ? 1713081171 * var0.field1048.field3570 * 346484955 : -1;
						}

						if (var15 == -2147483644) {
							var15 = var0.field1045;
						}

						if (var15 == -2147483643) {
							var15 = null != var0.field1048 ? 55577617 * var0.field1048.field3571 * -1274125071 : -1;
						}

						if (var15 == -2147483642) {
							var15 = var0.field1046 != null ? var0.field1046.field3570 : -1;
						}

						if (var15 == -2147483641) {
							var15 = null != var0.field1046 ? 55577617 * var0.field1046.field3571 * -1274125071 : -1;
						}

						if (var15 == -2147483640) {
							var15 = var0.field1047;
						}

						if (var15 == -2147483639) {
							var15 = var0.field1041;
						}

						class67.field845[var24++] = var15;
					} else if (var4[var14] instanceof String) {
						var36 = (String)var4[var14];
						if (var36.equals("event_opbase")) {
							var36 = var0.field1049;
						}

						class67.field851[var25++] = var36;
					}
				}

				class67.field853 = var0.field1050;

				while (true) {
					while (true) {
						while (true) {
							while (true) {
								while (true) {
									while (true) {
										while (true) {
											while (true) {
												while (true) {
													while (true) {
														while (true) {
															while (true) {
																while (true) {
																	while (true) {
																		while (true) {
																			while (true) {
																				while (true) {
																					while (true) {
																						while (true) {
																							while (true) {
																								while (true) {
																									while (true) {
																										while (true) {
																											while (true) {
																												while (true) {
																													label311:
																													while (true) {
																														++var11;
																														if (var11 > var1) {
																															throw new RuntimeException();
																														}

																														++var22;
																														int var23 = var7[var22];
																														if (var23 < 100) {
																															if (var23 != 0) {
																																if (var23 != 1) {
																																	if (var23 != 2) {
																																		if (var23 != 3) {
																																			if (var23 != 6) {
																																				if (var23 != 7) {
																																					if (var23 != 8) {
																																						if (var23 != 9) {
																																							if (var23 != 10) {
																																								if (var23 != 21) {
																																									if (var23 != 25) {
																																										if (var23 != 27) {
																																											if (var23 != 31) {
																																												if (var23 != 32) {
																																													if (var23 != 33) {
																																														if (var23 != 34) {
																																															if (var23 != 35) {
																																																if (var23 != 36) {
																																																	if (var23 != 37) {
																																																		if (var23 != 38) {
																																																			if (var23 != 39) {
																																																				int var18;
																																																				if (var23 != 40) {
																																																					if (var23 != 42) {
																																																						if (var23 != 43) {
																																																							if (var23 == 44) {
																																																								var14 = var8[var22] >> 16;
																																																								var15 = var8[var22] & 65535;
																																																								int var28 = class67.field843[--class67.field836];
																																																								if (var28 >= 0 && var28 <= 5000) {
																																																									class67.field841[var14] = var28;
																																																									byte var31 = -1;
																																																									if (var15 == 105) {
																																																										var31 = 0;
																																																									}

																																																									var18 = 0;

																																																									while (true) {
																																																										if (var18 >= var28) {
																																																											continue label311;
																																																										}

																																																										class67.field839[var14][var18] = var31;
																																																										++var18;
																																																									}
																																																								}

																																																								throw new RuntimeException();
																																																							} else if (var23 == 45) {
																																																								var14 = var8[var22];
																																																								var15 = class67.field843[--class67.field836];
																																																								if (var15 < 0 || var15 >= class67.field841[var14]) {
																																																									throw new RuntimeException();
																																																								}

																																																								class67.field843[++class67.field836 - 1] = class67.field839[var14][var15];
																																																							} else if (var23 == 46) {
																																																								var14 = var8[var22];
																																																								class67.field836 -= 2;
																																																								var15 = class67.field843[class67.field836];
																																																								if (var15 < 0 || var15 >= class67.field841[var14]) {
																																																									throw new RuntimeException();
																																																								}

																																																								class67.field839[var14][var15] = class67.field843[class67.field836 + 1];
																																																							} else {
																																																								String var32;
																																																								if (var23 == 47) {
																																																									var32 = Client.field4387.method2665(var8[var22]);
																																																									if (var32 == null) {
																																																										var32 = class337.field3889;
																																																									}

																																																									class67.field842[++class67.field1015 - 1] = var32;
																																																								} else if (var23 == 48) {
																																																									Client.field4387.method2664(var8[var22], class67.field842[--class67.field1015]);
																																																								} else if (var23 == 49) {
																																																									var32 = Client.field4387.method2671(var8[var22]);
																																																									class67.field842[++class67.field1015 - 1] = var32;
																																																								} else if (var23 == 50) {
																																																									Client.field4387.method2662(var8[var22], class67.field842[--class67.field1015]);
																																																								} else if (var23 == 60) {
																																																									class464 var34 = var5.field971[var8[var22]];
																																																									class448 var38 = (class448)var34.method8360((long)class67.field843[--class67.field836]);
																																																									if (null != var38) {
																																																										var22 += var38.field4744;
																																																									}
																																																								} else {
																																																									Integer var35;
																																																									if (var23 == 74) {
																																																										var35 = class67.field1598.method3260(var8[var22]);
																																																										if (null == var35) {
																																																											class67.field843[++class67.field836 - 1] = -1;
																																																										} else {
																																																											class67.field843[++class67.field836 - 1] = var35;
																																																										}
																																																									} else {
																																																										if (var23 != 76) {
																																																											throw new IllegalStateException();
																																																										}

																																																										var35 = Client.field1340.method7957(var8[var22]);
																																																										if (var35 == null) {
																																																											class67.field843[++class67.field836 - 1] = -1;
																																																										} else {
																																																											class67.field843[++class67.field836 - 1] = var35;
																																																										}
																																																									}
																																																								}
																																																							}
																																																						} else {
																																																							Client.field4387.method2684(var8[var22], class67.field843[--class67.field836]);
																																																						}
																																																					} else {
																																																						class67.field843[++class67.field836 - 1] = Client.field4387.method2660(var8[var22]);
																																																					}
																																																				} else {
																																																					var14 = var8[var22];
																																																					class75 var37 = class75.method6314(var14);
																																																					int[] var27 = new int[var37.field967];
																																																					String[] var17 = new String[var37.field968];

																																																					for (var18 = 0; var18 < var37.field970; ++var18) {
																																																						var27[var18] = class67.field843[var18 + (class67.field836 - var37.field970)];
																																																					}

																																																					for (var18 = 0; var18 < var37.field969; ++var18) {
																																																						var17[var18] = class67.field842[var18 + (class67.field1015 - var37.field969)];
																																																					}

																																																					class67.field836 -= var37.field970;
																																																					class67.field1015 -= var37.field969;
																																																					class60 var33 = new class60();
																																																					var33.field464 = var5;
																																																					var33.field463 = var22;
																																																					var33.field467 = class67.field845;
																																																					var33.field465 = class67.field851;
																																																					class67.field847[++class67.field846 - 1] = var33;
																																																					var5 = var37;
																																																					var7 = var37.field964;
																																																					var8 = var37.field965;
																																																					var22 = -1;
																																																					class67.field845 = var27;
																																																					class67.field851 = var17;
																																																				}
																																																			} else {
																																																				--class67.field1015;
																																																			}
																																																		} else {
																																																			--class67.field836;
																																																		}
																																																	} else {
																																																		var14 = var8[var22];
																																																		class67.field1015 -= var14;
																																																		var36 = class261.method5272(class67.field842, class67.field1015, var14);
																																																		class67.field842[++class67.field1015 - 1] = var36;
																																																	}
																																																} else {
																																																	class67.field851[var8[var22]] = class67.field842[--class67.field1015];
																																																}
																																															} else {
																																																class67.field842[++class67.field1015 - 1] = class67.field851[var8[var22]];
																																															}
																																														} else {
																																															class67.field845[var8[var22]] = class67.field843[--class67.field836];
																																														}
																																													} else {
																																														class67.field843[++class67.field836 - 1] = class67.field845[var8[var22]];
																																													}
																																												} else {
																																													class67.field836 -= 2;
																																													if (class67.field843[class67.field836] >= class67.field843[1 + class67.field836]) {
																																														var22 += var8[var22];
																																													}
																																												}
																																											} else {
																																												class67.field836 -= 2;
																																												if (class67.field843[class67.field836] <= class67.field843[1 + class67.field836]) {
																																													var22 += var8[var22];
																																												}
																																											}
																																										} else {
																																											var14 = var8[var22];
																																											class307.method5489(var14, class67.field843[--class67.field836]);
																																										}
																																									} else {
																																										var14 = var8[var22];
																																										class67.field843[++class67.field836 - 1] = class307.method5179(var14);
																																									}
																																								} else {
																																									if (class67.field846 == 0) {
																																										while (class67.field838.size() > 0) {
																																											class98 var30 = (class98)class67.field838.remove(0);
																																											class61.method1201(var30.method2580(), var30.method2578(), var30.method2579(), var30.method2582(), "");
																																										}

																																										if (class67.field850) {
																																											class67.field850 = false;
																																											Client.method3203();
																																										}

																																										if (!var10 && var2 > 0 && var11 >= var2) {
																																											class388.method7339("Warning: Script " + var5.field962 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
																																										}

																																										return;
																																									}

																																									class60 var29 = class67.field847[--class67.field846];
																																									var5 = var29.field464;
																																									var7 = var5.field964;
																																									var8 = var5.field965;
																																									var22 = var29.field463;
																																									class67.field845 = var29.field467;
																																									class67.field851 = var29.field465;
																																								}
																																							} else {
																																								class67.field836 -= 2;
																																								if (class67.field843[class67.field836] > class67.field843[class67.field836 + 1]) {
																																									var22 += var8[var22];
																																								}
																																							}
																																						} else {
																																							class67.field836 -= 2;
																																							if (class67.field843[class67.field836] < class67.field843[class67.field836 + 1]) {
																																								var22 += var8[var22];
																																							}
																																						}
																																					} else {
																																						class67.field836 -= 2;
																																						if (class67.field843[1 + class67.field836] == class67.field843[class67.field836]) {
																																							var22 += var8[var22];
																																						}
																																					}
																																				} else {
																																					class67.field836 -= 2;
																																					if (class67.field843[1 + class67.field836] != class67.field843[class67.field836]) {
																																						var22 += var8[var22];
																																					}
																																				}
																																			} else {
																																				var22 += var8[var22];
																																			}
																																		} else {
																																			class67.field842[++class67.field1015 - 1] = var5.field966[var22];
																																		}
																																	} else {
																																		var14 = var8[var22];
																																		class307.field3482[var14] = class67.field843[--class67.field836];
																																		class8.method54(var14);
																																	}
																																} else {
																																	var14 = var8[var22];
																																	class67.field843[++class67.field836 - 1] = class307.field3482[var14];
																																}
																															} else {
																																class67.field843[++class67.field836 - 1] = var8[var22];
																															}
																														} else {
																															boolean var26;
																															if (1 == var5.field965[var22]) {
																																var26 = true;
																															} else {
																																var26 = false;
																															}

																															var15 = class34.method512(var23, var5, var26);
																															switch(var15) {
																															case 0:
																																while (class67.field838.size() > 0) {
																																	class98 var16 = (class98)class67.field838.remove(0);
																																	class61.method1201(var16.method2580(), var16.method2578(), var16.method2579(), var16.method2582(), "");
																																}

																																if (class67.field850) {
																																	class67.field850 = false;
																																	Client.method3203();
																																}

																																if (!var10 && var2 > 0 && var11 >= var2) {
																																	class388.method7339("Warning: Script " + var5.field962 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
																																}

																																return;
																															case 1:
																															default:
																																break;
																															case 2:
																																throw new IllegalStateException();
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
											}
										}
									}
								}
							}
						}
					}
				}
			} catch (Exception var21) {
				var10 = true;
				StringBuilder var13 = new StringBuilder(30);
				var13.append("").append(var5.field4745).append(" ");

				for (var14 = class67.field846 - 1; var14 >= 0; --var14) {
					var13.append("").append(class67.field847[var14].field464.field4745).append(" ");
				}

				var13.append("").append(var9);
				class388.method7339(var13.toString(), var21);

				while (class67.field838.size() > 0) {
					class98 var12 = (class98)class67.field838.remove(0);
					class61.method1201(var12.method2580(), var12.method2578(), var12.method2579(), var12.method2582(), "");
				}

				if (class67.field850) {
					class67.field850 = false;
					Client.method3203();
				}

				if (!var10 && var2 > 0 && var11 >= var2) {
					class388.method7339("Warning: Script " + var5.field962 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
				}

			}
		}
	}
}
