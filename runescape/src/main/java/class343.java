public class class343 extends class444 {
	byte field4218;
	class342 field4220;
	int field4216;

	class343() {
	}

	static int method6441(int var0, class75 var1, boolean var2) {
		String var12;
		if (var0 == 3100) {
			var12 = class67.field842[--class67.field1015];
			class106.method2852(0, "", var12);
			return 1;
		} else if (var0 == 3101) {
			class67.field836 -= 2;
			class215.method4243(Client.field3454, class67.field843[class67.field836], class67.field843[class67.field836 + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!class67.field854) {
				class67.field850 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var12 = class67.field842[--class67.field1015];
				var11 = 0;
				if (class372.method5232(var12)) {
					var11 = class372.method5513(var12);
				}

				class289 var15 = class331.method6337(class287.field3110, Client.field753.field1385);
				var15.field3212.method8644(var11);
				Client.field753.method2735(var15);
				return 1;
			} else {
				class289 var9;
				if (var0 == 3105) {
					var12 = class67.field842[--class67.field1015];
					var9 = class331.method6337(class287.field3164, Client.field753.field1385);
					var9.field3212.method8695(var12.length() + 1);
					var9.field3212.method8648(var12);
					Client.field753.method2735(var9);
					return 1;
				} else if (var0 == 3106) {
					var12 = class67.field842[--class67.field1015];
					var9 = class331.method6337(class287.field3153, Client.field753.field1385);
					var9.field3212.method8695(var12.length() + 1);
					var9.field3212.method8648(var12);
					Client.field753.method2735(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = class67.field843[--class67.field836];
						var5 = class67.field842[--class67.field1015];
						Client.method2846(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						class67.field836 -= 3;
						var4 = class67.field843[class67.field836];
						var11 = class67.field843[class67.field836 + 1];
						int var14 = class67.field843[class67.field836 + 2];
						class317 var16 = class166.method3349(var14);
						class371.method6891(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						class67.field836 -= 2;
						var4 = class67.field843[class67.field836];
						var11 = class67.field843[class67.field836 + 1];
						class317 var13 = var2 ? class67.field329 : class67.field6;
						class371.method6891(var13, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						Client.field4941 = class67.field843[--class67.field836] == 1;
						return 1;
					} else if (var0 == 3111) {
						class67.field843[++class67.field836 - 1] = Client.field112.method2457() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						Client.field112.method2392(class67.field843[--class67.field836] == 1);
						return 1;
					} else if (var0 == 3113) {
						var12 = class67.field842[--class67.field1015];
						boolean var10 = class67.field843[--class67.field836] == 1;
						class411.method7690(var12, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = class67.field843[--class67.field836];
						var9 = class331.method6337(class287.field3160, Client.field753.field1385);
						var9.field3212.method8642(var4);
						Client.field753.method2735(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = class67.field843[--class67.field836];
						class67.field1015 -= 2;
						var5 = class67.field842[class67.field1015];
						String var6 = class67.field842[class67.field1015 + 1];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class289 var7 = class331.method6337(class287.field3141, Client.field753.field1385);
							var7.field3212.method8642(1 + class489.method2092(var5) + class489.method2092(var6));
							var7.field3212.method8648(var5);
							var7.field3212.method8805(var4);
							var7.field3212.method8648(var6);
							Client.field753.method2735(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--class67.field836;
						return 1;
					} else if (var0 == 3118) {
						Client.field644 = class67.field843[--class67.field836] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field615 = class67.field843[--class67.field836] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (class67.field843[--class67.field836] == 1) {
							Client.field612 |= 1;
						} else {
							Client.field612 &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (class67.field843[--class67.field836] == 1) {
							Client.field612 |= 2;
						} else {
							Client.field612 &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (class67.field843[--class67.field836] == 1) {
							Client.field612 |= 4;
						} else {
							Client.field612 &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (class67.field843[--class67.field836] == 1) {
							Client.field612 |= 8;
						} else {
							Client.field612 &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.field612 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field696 = class67.field843[--class67.field836] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field610 = class67.field843[--class67.field836] == 1;
						return 1;
					} else if (var0 == 3127) {
						Client.method2913(class67.field843[--class67.field836] == 1);
						return 1;
					} else if (var0 == 3128) {
						class67.field843[++class67.field836 - 1] = Client.method178() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class67.field836 -= 2;
						Client.field583 = class67.field843[class67.field836];
						Client.field711 = class67.field843[1 + class67.field836];
						return 1;
					} else if (var0 == 3130) {
						class67.field836 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class67.field836;
						return 1;
					} else if (var0 == 3132) {
						class67.field843[++class67.field836 - 1] = class35.field211;
						class67.field843[++class67.field836 - 1] = class35.field3026;
						return 1;
					} else if (var0 == 3133) {
						--class67.field836;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						class67.field836 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field596 = 3;
						Client.field659 = class67.field843[--class67.field836];
						return 1;
					} else if (var0 == 3137) {
						Client.field596 = 2;
						Client.field659 = class67.field843[--class67.field836];
						return 1;
					} else if (var0 == 3138) {
						Client.field596 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field596 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field596 = 3;
						Client.field659 = var2 ? class67.field329.field3570 : class67.field6.field3570;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = class67.field843[--class67.field836] == 1;
							Client.field112.method2393(var8);
							return 1;
						} else if (var0 == 3142) {
							class67.field843[++class67.field836 - 1] = Client.field112.method2394() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = class67.field843[--class67.field836] == 1;
							Client.field540 = var8;
							if (!var8) {
								Client.field112.method2410("");
							}

							return 1;
						} else if (var0 == 3144) {
							class67.field843[++class67.field836 - 1] = Client.field540 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = class67.field843[--class67.field836] == 1;
							Client.field112.method2475(!var8);
							return 1;
						} else if (var0 == 3147) {
							class67.field843[++class67.field836 - 1] = Client.field112.method2478() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							class67.field843[++class67.field836 - 1] = class72.field897;
							return 1;
						} else if (var0 == 3154) {
							class67.field843[++class67.field836 - 1] = Client.method711();
							return 1;
						} else if (var0 == 3155) {
							--class67.field1015;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class67.field836 -= 2;
							return 1;
						} else if (var0 == 3158) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class67.field836;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class67.field836;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class67.field1015;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class67.field836;
							class67.field842[++class67.field1015 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class67.field836;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class67.field836 -= 2;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class67.field836 -= 2;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class67.field836 -= 2;
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class67.field836;
							return 1;
						} else if (var0 == 3173) {
							--class67.field836;
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class67.field836;
							return 1;
						} else if (var0 == 3175) {
							class67.field843[++class67.field836 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class67.field1015;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class67.field1015;
							return 1;
						} else if (var0 == 3181) {
							Client.method1206(class67.field843[--class67.field836]);
							return 1;
						} else if (var0 == 3182) {
							class67.field843[++class67.field836 - 1] = Client.method2655();
							return 1;
						} else if (var0 == 3189) {
							var4 = class67.field843[--class67.field836];
							Client.method324(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	static final void method6440(class91 var0) {
		var0.field1140 = false;
		if (-1 != var0.field1187) {
			class204 var2 = class81.method2189(var0.field1187, (byte)49);
			if (var2 != null) {
				if (!var2.method4004() && null != var2.field2300) {
					++var0.field1179;
					if (var0.field1178 < var2.field2300.length && var0.field1179 > var2.field2304[var0.field1178]) {
						var0.field1179 = 1;
						++var0.field1178;
						Client.method5500(var2, var0.field1178, var0.field1171, var0.field1138);
					}

					if (var0.field1178 >= var2.field2300.length) {
						if (var2.field2301 > 0) {
							var0.field1178 -= var2.field2301;
							if (var2.field2308) {
								++var0.field1180;
							}

							if (var0.field1178 < 0 || var0.field1178 >= var2.field2300.length || var2.field2308 && var0.field1180 >= var2.field2288) {
								var0.field1179 = 0;
								var0.field1178 = 0;
								var0.field1180 = 0;
							}
						} else {
							var0.field1179 = 0;
							var0.field1178 = 0;
						}

						Client.method5500(var2, var0.field1178, var0.field1171, var0.field1138);
					}
				} else if (var2.method4004()) {
					++var0.field1178;
					int var3 = var2.method4005();
					if (var0.field1178 < var3) {
						Client.method387(var2, var0.field1178, var0.field1171, var0.field1138);
					} else {
						if (var2.field2301 > 0) {
							var0.field1178 -= var2.field2301;
							if (var2.field2308) {
								++var0.field1180;
							}

							if (var0.field1178 < 0 || var0.field1178 >= var3 || var2.field2308 && var0.field1180 >= var2.field2288) {
								var0.field1178 = 0;
								var0.field1179 = 0;
								var0.field1180 = 0;
							}
						} else {
							var0.field1179 = 0;
							var0.field1178 = 0;
						}

						Client.method387(var2, var0.field1178, var0.field1171, var0.field1138);
					}
				} else {
					var0.field1187 = -1;
				}
			} else {
				var0.field1187 = -1;
			}
		}

		class463 var7 = new class463(var0.method2320());

		int var4;
		for (class512 var8 = (class512)var7.method8349(); var8 != null; var8 = (class512)var7.next()) {
			if (var8.field5144 != -1 && Client.field602 >= var8.field5145) {
				var4 = class194.method2180(var8.field5144).field2079;
				if (var4 == -1) {
					var8.method8051();
					--var0.field1203;
				} else {
					var8.field5143 = Math.max(var8.field5143, 0);
					class204 var5 = class81.method2189(var4, (byte)3);
					if (null != var5.field2300 && !var5.method4004()) {
						++var8.field5142;
						if (var8.field5143 < var5.field2300.length && var8.field5142 > var5.field2304[var8.field5143]) {
							var8.field5142 = 1;
							++var8.field5143;
							Client.method5500(var5, var8.field5143, var0.field1171, var0.field1138);
						}

						if (var8.field5143 >= var5.field2300.length) {
							var8.method8051();
							--var0.field1203;
						}
					} else if (var5.method4004()) {
						++var8.field5143;
						int var6 = var5.method4005();
						if (var8.field5143 < var6) {
							Client.method387(var5, var8.field5143, var0.field1171, var0.field1138);
						} else {
							var8.method8051();
							--var0.field1203;
						}
					} else {
						var8.method8051();
						--var0.field1203;
					}
				}
			}
		}

		class204 var9;
		if (var0.field1202 != -1 && var0.field1184 <= 1) {
			var9 = class81.method2189(var0.field1202, (byte)124);
			if (var9.field2313 == 1 && var0.field1211 > 0 && var0.field1192 <= Client.field602 && var0.field1193 < Client.field602) {
				var0.field1184 = 1;
				return;
			}
		}

		if (var0.field1202 != -1 && var0.field1184 == 0) {
			var9 = class81.method2189(var0.field1202, (byte)41);
			if (null != var9) {
				if (!var9.method4004() && var9.field2300 != null) {
					++var0.field1183;
					if (var0.field1182 < var9.field2300.length && var0.field1183 > var9.field2304[var0.field1182]) {
						var0.field1183 = 1;
						++var0.field1182;
						Client.method5500(var9, var0.field1182, var0.field1171, var0.field1138);
					}

					if (var0.field1182 >= var9.field2300.length) {
						var0.field1182 -= var9.field2301;
						++var0.field1185;
						if (var0.field1185 >= var9.field2288) {
							var0.field1202 = -1;
						} else if (var0.field1182 >= 0 && var0.field1182 < var9.field2300.length) {
							Client.method5500(var9, var0.field1182, var0.field1171, var0.field1138);
						} else {
							var0.field1202 = -1;
						}
					}

					var0.field1140 = var9.field2307;
				} else if (var9.method4004()) {
					++var0.field1182;
					var4 = var9.method4005();
					if (var0.field1182 < var4) {
						Client.method387(var9, var0.field1182, var0.field1171, var0.field1138);
					} else {
						var0.field1182 -= var9.field2301;
						++var0.field1185;
						if (var0.field1185 >= var9.field2288) {
							var0.field1202 = -1;
						} else if (var0.field1182 >= 0 && var0.field1182 < var4) {
							Client.method387(var9, var0.field1182, var0.field1171, var0.field1138);
						} else {
							var0.field1202 = -1;
						}
					}
				} else {
					var0.field1202 = -1;
				}
			} else {
				var0.field1202 = -1;
			}
		}

		if (var0.field1184 > 0) {
			--var0.field1184;
		}

	}
}
