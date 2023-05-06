public class class34 {
	int field192;
	int field193;

	class34(int var1, int var2) {
		this.field192 = var1;
		this.field193 = var2;
	}

	boolean method500(class30 var1) {
		if (null == var1) {
			return false;
		} else {
			switch(this.field192) {
			case 1:
				return var1.method463(this.field193);
			case 2:
				return var1.method456(this.field193);
			case 3:
				return var1.method455((char)this.field193);
			case 4:
				return var1.method458(1 == this.field193);
			default:
				return false;
			}
		}
	}

	static class75 method508(byte[] var0) {
		class75 var2 = new class75();
		class489 var3 = new class489(var0);
		var3.field4989 = var3.field4991.length - 2;
		int var4 = var3.method8660();
		int var5 = var3.field4991.length - 2 - var4 - 12;
		var3.field4989 = var5;
		int var6 = var3.method8664();
		var2.field967 = var3.method8660();
		var2.field968 = var3.method8660();
		var2.field970 = var3.method8660();
		var2.field969 = var3.method8660();
		int var7 = var3.method8658();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field971 = var2.method2076(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method8660();
				class464 var10 = new class464(var9 > 0 ? class296.method1988(var9) : 1);
				var2.field971[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.method8664();
					int var12 = var3.method8664();
					var10.method8361(new class448(var12), (long)var11);
				}
			}
		}

		var3.field4989 = 0;
		var2.field962 = var3.method8715();
		var2.field964 = new int[var6];
		var2.field965 = new int[var6];
		var2.field966 = new String[var6];

		for (var8 = 0; var3.field4989 < var5; var2.field964[var8++] = var9) {
			var9 = var3.method8660();
			if (var9 == 3) {
				var2.field966[var8] = var3.method8669();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field965[var8] = var3.method8664();
			} else {
				var2.field965[var8] = var3.method8658();
			}
		}

		return var2;
	}

	static Class method504(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Class.forName(var0);
		}
	}

	static int method512(int var0, class75 var1, boolean var2) {
		if (var0 < 1000) {
			return class93.method2384(var0, var1, var2);
		} else if (var0 < 1100) {
			return class132.method3066(var0, var1, var2);
		} else if (var0 < 1200) {
			return class32.method475(var0, var1, var2);
		} else if (var0 < 1300) {
			return class105.method2696(var0, var1, var2);
		} else if (var0 < 1400) {
			return class199.method3809(var0, var1, var2);
		} else if (var0 < 1500) {
			return class122.method2914(var0, var1, var2, (byte)-1);
		} else if (var0 < 1600) {
			return class245.method4850(var0, var1, var2);
		} else if (var0 < 1700) {
			return class409.method7596(var0, var1, var2);
		} else if (var0 < 1800) {
			return class419.method7782(var0, var1, var2);
		} else if (var0 < 1900) {
			return class219.method4297(var0, var1, var2);
		} else if (var0 < 2000) {
			return class14.method176(var0, var1, var2);
		} else if (var0 < 2100) {
			return class132.method3066(var0, var1, var2);
		} else if (var0 < 2200) {
			return class32.method475(var0, var1, var2);
		} else if (var0 < 2300) {
			return class105.method2696(var0, var1, var2);
		} else if (var0 < 2400) {
			return class199.method3809(var0, var1, var2);
		} else if (var0 < 2500) {
			return class122.method2914(var0, var1, var2, (byte)-1);
		} else if (var0 < 2600) {
			return class32.method472(var0, var1, var2);
		} else if (var0 < 2700) {
			return class36.method714(var0, var1, var2);
		} else if (var0 < 2800) {
			return class235.method4752(var0, var1, var2);
		} else if (var0 < 2900) {
			return class67.method507(var0, var1, var2);
		} else if (var0 < 3000) {
			return class14.method176(var0, var1, var2);
		} else if (var0 < 3200) {
			return class343.method6441(var0, var1, var2);
		} else if (var0 < 3300) {
			return class201.method3869(var0, var1, var2);
		} else if (var0 < 3400) {
			return class131.method3064(var0, var1, var2);
		} else if (var0 < 3500) {
			return class381.method7140(var0, var1, var2);
		} else if (var0 < 3600) {
			return class200.method3847(var0, var1, var2);
		} else if (var0 < 3700) {
			return class270.method5370(var0, var1, var2);
		} else if (var0 < 3800) {
			return class67.method3993(var0, var1, var2);
		} else if (var0 < 3900) {
			return class479.method8516(var0, var1, var2);
		} else if (var0 < 4000) {
			return class19.method273(var0, var1, var2);
		} else if (var0 < 4100) {
			return class115.method2867(var0, var1, var2);
		} else if (var0 < 4200) {
			return class62.method1213(var0, var1, var2);
		} else if (var0 < 4300) {
			return class302.method5729(var0, var1, var2);
		} else if (var0 < 5100) {
			return class119.method2900(var0, var1, var2);
		} else if (var0 < 5400) {
			return class111.method2815(var0, var1, var2);
		} else if (var0 < 5600) {
			return class168.method3431(var0, var1, var2);
		} else if (var0 < 5700) {
			return class67.method1234(var0, var1, var2);
		} else if (var0 < 6300) {
			return class328.method6331(var0, var1, var2);
		} else if (var0 < 6600) {
			return class249.method4968(var0, var1, var2);
		} else if (var0 < 6700) {
			return class85.method2212(var0, var1, var2);
		} else if (var0 < 6800) {
			return class67.method5486(var0, var1, var2);
		} else if (var0 < 6900) {
			return class67.method6442(var0, var1, var2);
		} else if (var0 < 7000) {
			return class113.method2848(var0, var1, var2);
		} else if (var0 < 7100) {
			return class67.method880(var0, var1, var2);
		} else if (var0 < 7200) {
			return class164.method3333(var0, var1, var2);
		} else if (var0 < 7300) {
			return class67.method216(var0, var1, var2);
		} else if (var0 < 7500) {
			return class67.method3036(var0, var1, var2);
		} else if (var0 < 7600) {
			return class145.method3174(var0, var1, var2);
		} else {
			return var0 < 7700 ? class67.method1834(var0, var1, var2) : 2;
		}
	}

	static void method511(class35 var0) {
		class208 var2 = Client.field722;
		class208 var3 = var2;

		while (var3.method4071()) {
			if (var3.field2363 == 13) {
				class72.method3147();
				return;
			}

			if (var3.field2363 == 96) {
				if (class72.field921 > 0 && null != class72.field4189) {
					--class72.field921;
				}
			} else if (97 == var3.field2363 && class72.field921 < class72.field922 && null != class72.field71) {
				++class72.field921;
			}
		}

		if (1 == class36.field252 || !Client.field4941 && class36.field252 == 4) {
			int var4 = class72.field907 + 280;
			if (class36.field250 >= var4 && class36.field250 <= var4 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(0, 0);
				return;
			}

			if (class36.field250 >= var4 + 15 && class36.field250 <= var4 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(0, 1);
				return;
			}

			int var5 = 390 + class72.field907;
			if (class36.field250 >= var5 && class36.field250 <= var5 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(1, 0);
				return;
			}

			if (class36.field250 >= var5 + 15 && class36.field250 <= var5 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(1, 1);
				return;
			}

			int var6 = 500 + class72.field907;
			if (class36.field250 >= var6 && class36.field250 <= var6 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(2, 0);
				return;
			}

			if (class36.field250 >= var6 + 15 && class36.field250 <= var6 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(2, 1);
				return;
			}

			int var7 = class72.field907 + 610;
			if (class36.field250 >= var7 && class36.field250 <= var7 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(3, 0);
				return;
			}

			if (class36.field250 >= var7 + 15 && class36.field250 <= var7 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
				class64.method9063(3, 1);
				return;
			}

			if (class36.field250 >= 708 + class72.field907 && class36.field251 >= 4 && class36.field250 <= 708 + class72.field907 + 50 && class36.field251 <= 20) {
				class72.method3147();
				return;
			}

			if (class72.field920 != -1) {
				class64 var8 = class64.field179[class72.field920];
				class203.method3974(var8);
				class72.method3147();
				return;
			}

			if (class72.field921 > 0 && null != class72.field4189 && class36.field250 >= 0 && class36.field250 <= class72.field4189.field5081 && class36.field251 >= class35.field3026 / 2 - 50 && class36.field251 <= class35.field3026 / 2 + 50) {
				--class72.field921;
			}

			if (class72.field921 < class72.field922 && null != class72.field71 && class36.field250 >= class35.field211 - class72.field71.field5081 - 5 && class36.field250 <= class35.field211 && class36.field251 >= class35.field3026 / 2 - 50 && class36.field251 <= class35.field3026 / 2 + 50) {
				++class72.field921;
			}
		}

	}

	static final void method506(class91 var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.method2315()) {
			if (var0 instanceof class96) {
				class191 var7 = ((class96)var0).field1277;
				if (null != var7.field2045) {
					var7 = var7.method3642();
				}

				if (null == var7) {
					return;
				}
			}

			int var76 = class103.field1335;
			int[] var8 = class103.field1341;
			boolean var9 = var1 < var76;
			int var10 = -2;
			int var11;
			if (var0.field1149 != null && (!var9 || !var0.field1145 && (Client.field717 == 4 || !var0.field1177 && (0 == Client.field717 || Client.field717 == 3 || Client.field717 == 1 && ((class88)var0).method2233())))) {
				var11 = var0.field1196;
				class375.method6952(var0.field1171, var0.field1138, var11);
				if (Client.field708 > -1 && Client.field590 < Client.field591) {
					Client.field608[Client.field590] = Client.field1635.method7145(var0.field1149) / 2;
					Client.field594[Client.field590] = Client.field1635.field4439;
					Client.field592[Client.field590] = Client.field708;
					Client.field593[Client.field590] = Client.field572 - var10;
					Client.field587[Client.field590] = var0.field1162;
					Client.field597[Client.field590] = var0.field1207;
					Client.field567[Client.field590] = var0.field1161;
					Client.field599[Client.field590] = var0.field1149;
					++Client.field590;
					var10 += 12;
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var0.field1170.method6757()) {
				Client.method2909(var0, var0.field1196 + 15);

				for (class95 var77 = (class95)var0.field1170.method6798(); null != var77; var77 = (class95)var0.field1170.method6767()) {
					class92 var12 = var77.method2490(Client.field602);
					if (null == var12) {
						if (var77.method2493()) {
							var77.method8051();
						}
					} else {
						class186 var13 = var77.field1266;
						class503 var14 = var13.method3583();
						class503 var15 = var13.method3584();
						int var17 = 0;
						if (var14 != null && var15 != null) {
							if (var13.field1973 * 2 < var15.field5088) {
								var17 = var13.field1973;
							}

							var16 = var15.field5088 - var17 * 2;
						} else {
							var16 = var13.field1966;
						}

						int var18 = 255;
						boolean var19 = true;
						int var20 = Client.field602 - var12.field1218;
						int var21 = var12.field1216 * var16 / var13.field1966;
						int var22;
						int var91;
						if (var12.field1219 > var20) {
							var22 = var13.field1972 == 0 ? 0 : var13.field1972 * (var20 / var13.field1972);
							var23 = var16 * var12.field1217 / var13.field1966;
							var91 = var23 + var22 * (var21 - var23) / var12.field1219;
						} else {
							var91 = var21;
							var22 = var13.field1969 + var12.field1219 - var20;
							if (var13.field1967 >= 0) {
								var18 = (var22 << 8) / (var13.field1969 - var13.field1967);
							}
						}

						if (var12.field1216 > 0 && var91 < 1) {
							var91 = 1;
						}

						if (var14 != null && var15 != null) {
							if (var16 == var91) {
								var91 += var17 * 2;
							} else {
								var91 += var17;
							}

							var22 = var14.field5093;
							var10 += var22;
							var23 = Client.field708 + var2 - (var16 >> 1);
							var24 = Client.field572 + var3 - var10;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var14.method9112(var23, var24, var18);
								class499.method8982(var23, var24, var23 + var91, var24 + var22);
								var15.method9112(var23, var24, var18);
							} else {
								var14.method9106(var23, var24);
								class499.method8982(var23, var24, var91 + var23, var24 + var22);
								var15.method9106(var23, var24);
							}

							class499.method8981(var2, var3, var4 + var2, var3 + var5);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.field708 > -1) {
								var22 = var2 + Client.field708 - (var16 >> 1);
								var23 = Client.field572 + var3 - var10;
								class499.method9012(var22, var23, var91, 5, 65280);
								class499.method9012(var22 + var91, var23, var16 - var91, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			class88 var78;
			int var79;
			if (var9 && var0.field1159 == Client.field602 && class14.method173((class88)var0)) {
				var78 = (class88)var0;
				if (var9) {
					var79 = 15 + var0.field1196;
					class375.method6952(var0.field1171, var0.field1138, var79);
					class383 var81 = (class383)Client.field718.get(class461.field4886);
					var10 += 4;
					var81.method7154(var78.field1089.method9256(), Client.field708 + var2, Client.field572 + var3 - var10, 16777215, 0);
					var10 += 18;
				}
			}

			if (var9) {
				var78 = (class88)var0;
				if (var78.field1105) {
					return;
				}

				if (-1 != var78.field1090 || -1 != var78.field1108) {
					var79 = 15 + var0.field1196;
					class375.method6952(var0.field1171, var0.field1138, var79);
					if (Client.field708 > -1) {
						if (var78.field1090 != -1) {
							var10 += 25;
							Client.field256[var78.field1090].method9106(var2 + Client.field708 - 12, Client.field572 + var3 - var10);
						}

						if (var78.field1108 != -1) {
							var10 += 25;
							Client.field4669[var78.field1108].method9106(Client.field708 + var2 - 12, var3 + Client.field572 - var10);
						}
					}
				}

				if (var1 >= 0 && 10 == Client.field508 && Client.field510 == var8[var1]) {
					var79 = var0.field1196 + 15;
					class375.method6952(var0.field1171, var0.field1138, var79);
					if (Client.field708 > -1) {
						var10 += Client.field1959[1].field5093;
						Client.field1959[1].method9106(var2 + Client.field708 - 12, Client.field572 + var3 - var10);
					}
				}
			} else {
				class96 var80 = (class96)var0;
				int[] var82 = var80.method2509();
				short[] var83 = var80.method2521();
				int var85;
				if (var83 != null && null != var82) {
					for (var85 = 0; var85 < var83.length; ++var85) {
						if (var83[var85] >= 0 && var82[var85] >= 0) {
							long var86 = (long)var82[var85] << 8 | (long)var83[var85];
							class503 var89 = (class503)Client.field742.method7457(var86);
							if (var89 == null) {
								class503[] var90 = class115.method2860(Client.field4788, var82[var85], 0);
								if (null != var90 && var83[var85] < var90.length) {
									var89 = var90[var83[var85]];
									Client.field742.method7438(var86, var89);
								}
							}

							if (null != var89) {
								Client.method2909(var0, var0.field1196 + 15);
								if (Client.field708 > -1) {
									var89.method9106(Client.field708 + var2 - (var89.field5088 >> 1), Client.field572 + (var3 - var89.field5093) - 4);
								}
							}
						}
					}
				}

				if (1 == Client.field508 && Client.field509 == Client.field548[var1 - var76] && Client.field602 % 20 < 10) {
					var85 = 15 + var0.field1196;
					class375.method6952(var0.field1171, var0.field1138, var85);
					if (Client.field708 > -1) {
						Client.field1959[0].method9106(var2 + Client.field708 - 12, Client.field572 + var3 - 28);
					}
				}
			}

			for (var11 = 0; var11 < 4; ++var11) {
				var79 = var0.field1205[var11];
				int var84 = var0.field1165[var11];
				class200 var87 = null;
				int var88 = 0;
				if (var84 >= 0) {
					if (var79 <= Client.field602) {
						continue;
					}

					var87 = class200.method2983(var0.field1165[var11]);
					var88 = var87.field2143;
					if (var87 != null && null != var87.field2153) {
						var87 = var87.method3823();
						if (var87 == null) {
							var0.field1205[var11] = -1;
							continue;
						}
					}
				} else if (var79 < 0) {
					continue;
				}

				var16 = var0.field1163[var11];
				class200 var93 = null;
				if (var16 >= 0) {
					var93 = class200.method2983(var16);
					if (null != var93 && var93.field2153 != null) {
						var93 = var93.method3823();
					}
				}

				if (var79 - var88 <= Client.field602) {
					if (null == var87) {
						var0.field1205[var11] = -1;
					} else {
						Client.method2909(var0, var0.field1196 / 2);
						if (Client.field708 > -1) {
							boolean var92 = true;
							if (var11 == 1) {
								Client.field572 -= 20;
							}

							if (var11 == 2) {
								Client.field708 -= 15;
								Client.field572 -= 10;
							}

							if (var11 == 3) {
								Client.field708 += 15;
								Client.field572 -= 10;
							}

							class503 var96 = null;
							class503 var94 = null;
							class503 var95 = null;
							class503 var97 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class503 var31 = null;
							class503 var32 = null;
							class503 var33 = null;
							class503 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var96 = var87.method3818();
							int var44;
							if (null != var96) {
								var23 = var96.field5088;
								var44 = var96.field5093;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var96.field5090;
							}

							var94 = var87.method3819();
							if (null != var94) {
								var24 = var94.field5088;
								var44 = var94.field5093;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var94.field5090;
							}

							var95 = var87.method3813();
							if (var95 != null) {
								var25 = var95.field5088;
								var44 = var95.field5093;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var95.field5090;
							}

							var97 = var87.method3821();
							if (var97 != null) {
								var26 = var97.field5088;
								var44 = var97.field5093;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var97.field5090;
							}

							if (var93 != null) {
								var31 = var93.method3818();
								if (var31 != null) {
									var35 = var31.field5088;
									var44 = var31.field5093;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.field5090;
								}

								var32 = var93.method3819();
								if (var32 != null) {
									var36 = var32.field5088;
									var44 = var32.field5093;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.field5090;
								}

								var33 = var93.method3813();
								if (null != var33) {
									var37 = var33.field5088;
									var44 = var33.field5093;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.field5090;
								}

								var34 = var93.method3821();
								if (null != var34) {
									var38 = var34.field5088;
									var44 = var34.field5093;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.field5090;
								}
							}

							class379 var98 = var87.method3833();
							if (null == var98) {
								var98 = Client.field4327;
							}

							class379 var45;
							if (null != var93) {
								var45 = var93.method3833();
								if (var45 == null) {
									var45 = Client.field4327;
								}
							} else {
								var45 = Client.field4327;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var87.method3817(var0.field1166[var11]);
							int var99 = var98.method7145(var46);
							if (var93 != null) {
								var47 = var93.method3817(var0.field1142[var11]);
								var49 = var45.method7145(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (null == var95 && var97 == null) {
									var50 = 1;
								} else {
									var50 = 1 + var99 / var24;
								}
							}

							if (null != var93 && var36 > 0) {
								if (null == var33 && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var50 * var24;
								var52 += var57;
								var56 += (var57 - var99) / 2;
							} else {
								var52 += var99;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var93 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var36 * var51;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var0.field1205[var11] - Client.field602;
							int var64 = var87.field2131 - var87.field2131 * var63 / var87.field2143;
							int var65 = var87.field2148 * var63 / var87.field2143 + -var87.field2148;
							int var66 = var2 + Client.field708 - (var52 >> 1) + var64;
							int var67 = var3 + Client.field572 - 12 + var65;
							int var68 = var67;
							int var69 = var67 + var43;
							int var70 = var67 + 15 + var87.field2152;
							int var71 = var70 - var98.field4440;
							int var72 = var98.field4441 + var70;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (null != var93) {
								var73 = var93.field2152 + var67 + 15;
								var74 = var73 - var45.field4440;
								var75 = var73 + var45.field4441;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var87.field2155 >= 0) {
								var74 = (var63 << 8) / (var87.field2143 - var87.field2155);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var96 != null) {
									var96.method9112(var66 + var53 - var27, var67, var74);
								}

								if (null != var95) {
									var95.method9112(var54 + var66 - var29, var67, var74);
								}

								if (var94 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var94.method9112(var75 * var24 + (var55 + var66 - var28), var67, var74);
									}
								}

								if (var97 != null) {
									var97.method9112(var66 + var57 - var30, var67, var74);
								}

								var98.method7141(var46, var56 + var66, var70, var87.field2141, 0, var74);
								if (null != var93) {
									if (null != var31) {
										var31.method9112(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.method9112(var59 + var66 - var41, var67, var74);
									}

									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method9112(var66 + var60 - var40 + var36 * var75, var67, var74);
										}
									}

									if (var34 != null) {
										var34.method9112(var61 + var66 - var42, var67, var74);
									}

									var45.method7141(var47, var66 + var62, var73, var93.field2141, 0, var74);
								}
							} else {
								if (var96 != null) {
									var96.method9106(var53 + var66 - var27, var67);
								}

								if (null != var95) {
									var95.method9106(var54 + var66 - var29, var67);
								}

								if (null != var94) {
									for (var75 = 0; var75 < var50; ++var75) {
										var94.method9106(var24 * var75 + (var55 + var66 - var28), var67);
									}
								}

								if (var97 != null) {
									var97.method9106(var66 + var57 - var30, var67);
								}

								var98.method7228(var46, var66 + var56, var70, var87.field2141 | -16777216, 0);
								if (null != var93) {
									if (var31 != null) {
										var31.method9106(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.method9106(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method9106(var66 + var60 - var40 + var75 * var36, var67);
										}
									}

									if (null != var34) {
										var34.method9106(var66 + var61 - var42, var67);
									}

									var45.method7228(var47, var66 + var62, var73, var93.field2141 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	static final void method509(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class90 var11 = null;

		for (class90 var12 = (class90)Client.field574.method6716(); null != var12; var12 = (class90)Client.field574.method6725()) {
			if (var12.field1131 == var0 && var12.field1121 == var1 && var2 == var12.field1122 && var3 == var12.field1120) {
				var11 = var12;
				break;
			}
		}

		if (var11 == null) {
			var11 = new class90();
			var11.field1131 = var0;
			var11.field1120 = var3;
			var11.field1121 = var1;
			var11.field1122 = var2;
			var11.field1136 = -1;
			class106.method2704(var11);
			Client.field574.method6711(var11);
		}

		var11.field1128 = var4;
		var11.field1125 = var5;
		var11.field1127 = var6;
		var11.field1126 = var8;
		var11.field1132 = var9;
		var11.method2305(var7);
	}
}
