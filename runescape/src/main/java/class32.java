import java.applet.Applet;

public class class32 {
	public static Applet field175;
	public static String field176;

	static {
		field175 = null;
		field176 = "";
	}

	static boolean method1229(String var0, int var1) {
		return class210.method4134(var0, var1, "openjs");
	}

	static int method475(int var0, class75 var1, boolean var2) {
		int var5 = -1;
		class317 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class67.field843[--class67.field836];
			var4 = class166.method3349(var5);
		} else {
			var4 = var2 ? class67.field329 : class67.field6;
		}

		int var14;
		if (var0 == 1100) {
			class67.field836 -= 2;
			var14 = class67.field843[class67.field836];
			int var11 = class67.field843[class67.field836 + 1];
			if (var4.field3598 == 12) {
				class315 var8 = var4.method6152();
				if (var8 != null && var8.method5856(var14, var11)) {
					Client.method3176(var4);
				}
			} else {
				var4.field3591 = var14;
				if (var4.field3591 > var4.field3593 - var4.field3572) {
					var4.field3591 = var4.field3593 - var4.field3572;
				}

				if (var4.field3591 < 0) {
					var4.field3591 = 0;
				}

				var4.field3592 = var11;
				if (var4.field3592 > var4.field3594 - var4.field3586) {
					var4.field3592 = var4.field3594 - var4.field3586;
				}

				if (var4.field3592 < 0) {
					var4.field3592 = 0;
				}

				Client.method3176(var4);
			}

			return 1;
		} else if (var0 == 1101) {
			var4.field3595 = class67.field843[--class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.field3599 = class67.field843[--class67.field836] == 1;
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.field3601 = class67.field843[--class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.field3603 = class67.field843[--class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.field3605 = class67.field843[--class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.field3608 = class67.field843[--class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.field3659 = class67.field843[--class67.field836] == 1;
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.field3657 = 1;
			var4.field3683 = class67.field843[--class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1109) {
			class67.field836 -= 6;
			var4.field3620 = class67.field843[class67.field836];
			var4.field3709 = class67.field843[class67.field836 + 1];
			var4.field3622 = class67.field843[class67.field836 + 2];
			var4.field3566 = class67.field843[class67.field836 + 3];
			var4.field3711 = class67.field843[class67.field836 + 4];
			var4.field3619 = class67.field843[5 + class67.field836];
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1110) {
			var14 = class67.field843[--class67.field836];
			if (var4.field3618 != var14) {
				var4.field3618 = var14;
				var4.field3705 = 0;
				var4.field3706 = 0;
				Client.method3176(var4);
			}

			return 1;
		} else if (var0 == 1111) {
			var4.field3575 = class67.field843[--class67.field836] == 1;
			Client.method3176(var4);
			return 1;
		} else if (var0 == 1112) {
			String var15 = class67.field842[--class67.field1015];
			if (!var15.equals(var4.field3716)) {
				var4.field3716 = var15;
				Client.method3176(var4);
			}

			return 1;
		} else {
			class315 var9;
			if (var0 == 1113) {
				var4.field3632 = class67.field843[--class67.field836];
				if (var4.field3598 == 12) {
					var9 = var4.method6152();
					if (var9 != null) {
						var9.method5975();
					}
				}

				Client.method3176(var4);
				return 1;
			} else if (var0 == 1114) {
				class67.field836 -= 3;
				if (12 == var4.field3598) {
					var9 = var4.method6152();
					if (var9 != null) {
						var9.method5857(class67.field843[class67.field836], class67.field843[class67.field836 + 1]);
						var9.method5858(class67.field843[2 + class67.field836]);
					}
				} else {
					var4.field3636 = class67.field843[class67.field836];
					var4.field3684 = class67.field843[class67.field836 + 1];
					var4.field3635 = class67.field843[2 + class67.field836];
				}

				Client.method3176(var4);
				return 1;
			} else if (var0 == 1115) {
				var4.field3574 = class67.field843[--class67.field836] == 1;
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1116) {
				var4.field3610 = class67.field843[--class67.field836];
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1117) {
				var4.field3717 = class67.field843[--class67.field836];
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1118) {
				var4.field3612 = class67.field843[--class67.field836] == 1;
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1119) {
				var4.field3556 = class67.field843[--class67.field836] == 1;
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1120) {
				class67.field836 -= 2;
				var4.field3593 = class67.field843[class67.field836];
				var4.field3594 = class67.field843[class67.field836 + 1];
				Client.method3176(var4);
				if (var5 != -1 && 0 == var4.field3598) {
					class242.method4836(Client.field2057[var5 >> 16], var4, false);
				}

				return 1;
			} else if (var0 == 1121) {
				Client.method2190(var4.field3570, var4.field3571);
				Client.field661 = var4;
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1122) {
				var4.field3606 = class67.field843[--class67.field836];
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1123) {
				var4.field3596 = class67.field843[--class67.field836];
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1124) {
				var4.field3602 = class67.field843[--class67.field836];
				Client.method3176(var4);
				return 1;
			} else if (var0 == 1125) {
				var14 = class67.field843[--class67.field836];
				class501 var10 = (class501)class199.method3788(class501.method6635(), var14);
				if (var10 != null) {
					var4.field3600 = var10;
					Client.method3176(var4);
				}

				return 1;
			} else {
				boolean var12;
				if (var0 == 1126) {
					var12 = class67.field843[--class67.field836] == 1;
					var4.field3604 = var12;
					return 1;
				} else if (var0 == 1127) {
					var12 = class67.field843[--class67.field836] == 1;
					var4.field3630 = var12;
					return 1;
				} else if (var0 == 1129) {
					var4.field3607 = class67.field842[--class67.field1015];
					Client.method3176(var4);
					return 1;
				} else if (var0 == 1130) {
					var4.method6136(class67.field842[--class67.field1015], Client.field78, Client.method2055());
					return 1;
				} else if (var0 == 1131) {
					class67.field836 -= 2;
					var4.method6226(class67.field843[class67.field836], class67.field843[class67.field836 + 1]);
					return 1;
				} else if (var0 == 1132) {
					var4.method6140(class67.field842[--class67.field1015], class67.field843[--class67.field836]);
					return 1;
				} else {
					class310 var13;
					if (var0 == 1133) {
						--class67.field836;
						var13 = var4.method6154();
						if (var13 != null) {
							var13.field3494 = class67.field843[class67.field836];
							Client.method3176(var4);
						}

						return 1;
					} else if (var0 == 1134) {
						--class67.field836;
						var13 = var4.method6154();
						if (null != var13) {
							var13.field3490 = class67.field843[class67.field836];
							Client.method3176(var4);
						}

						return 1;
					} else if (var0 == 1135) {
						--class67.field1015;
						var9 = var4.method6152();
						if (null != var9) {
							var4.field3634 = class67.field842[class67.field1015];
						}

						return 1;
					} else if (var0 == 1136) {
						--class67.field836;
						var13 = var4.method6154();
						if (var13 != null) {
							var13.field3492 = class67.field843[class67.field836];
							Client.method3176(var4);
						}

						return 1;
					} else if (var0 == 1137) {
						--class67.field836;
						var9 = var4.method6152();
						if (var9 != null && var9.method5853(class67.field843[class67.field836])) {
							Client.method3176(var4);
						}

						return 1;
					} else if (var0 == 1138) {
						--class67.field836;
						var9 = var4.method6152();
						if (var9 != null && var9.method6096(class67.field843[class67.field836])) {
							Client.method3176(var4);
						}

						return 1;
					} else if (var0 == 1139) {
						--class67.field836;
						var9 = var4.method6152();
						if (null != var9 && var9.method5855(class67.field843[class67.field836])) {
							Client.method3176(var4);
						}

						return 1;
					} else {
						class315 var7;
						if (var0 == 1140) {
							var12 = class67.field843[--class67.field836] == 1;
							Client.field723.method4051();
							var7 = var4.method6152();
							if (null != var7 && var7.method5847(var12)) {
								if (var12) {
									Client.field723.method4049(var4);
								}

								Client.method3176(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var12 = class67.field843[--class67.field836] == 1;
							if (!var12 && Client.field723.method4060() == var4) {
								Client.field723.method4051();
								Client.method3176(var4);
							}

							var7 = var4.method6152();
							if (var7 != null) {
								var7.method5848(var12);
							}

							return 1;
						} else if (var0 == 1142) {
							class67.field836 -= 2;
							var9 = var4.method6152();
							if (var9 != null && var9.method5871(class67.field843[class67.field836], class67.field843[1 + class67.field836])) {
								Client.method3176(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--class67.field836;
							var9 = var4.method6152();
							if (null != var9 && var9.method5871(class67.field843[class67.field836], class67.field843[class67.field836])) {
								Client.method3176(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--class67.field836;
							var9 = var4.method6152();
							if (var9 != null) {
								var9.method5860(class67.field843[class67.field836]);
								Client.method3176(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--class67.field836;
							var9 = var4.method6152();
							if (null != var9) {
								var9.method5846(class67.field843[class67.field836]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class67.field836;
							var9 = var4.method6152();
							if (var9 != null) {
								var9.method5862(class67.field843[class67.field836]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class67.field836;
							var9 = var4.method6152();
							if (null != var9) {
								var9.method5861(class67.field843[class67.field836]);
								Client.method3176(var4);
							}

							return 1;
						} else {
							class28 var6;
							if (var0 == 1148) {
								class67.field836 -= 2;
								var6 = var4.method6127();
								if (null != var6) {
									var6.method408(class67.field843[class67.field836], class67.field843[class67.field836 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class67.field836 -= 2;
								var6 = var4.method6127();
								if (var6 != null) {
									var6.method409((char)class67.field843[class67.field836], class67.field843[class67.field836 + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var4.method6135(class67.field842[--class67.field1015], Client.field78);
								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	static int method472(int var0, class75 var1, boolean var2) {
		class317 var4 = class166.method3349(class67.field843[--class67.field836]);
		if (var0 == 2500) {
			class67.field843[++class67.field836 - 1] = var4.field3661;
			return 1;
		} else if (var0 == 2501) {
			class67.field843[++class67.field836 - 1] = var4.field3715;
			return 1;
		} else if (var0 == 2502) {
			class67.field843[++class67.field836 - 1] = var4.field3572;
			return 1;
		} else if (var0 == 2503) {
			class67.field843[++class67.field836 - 1] = var4.field3586;
			return 1;
		} else if (var0 == 2504) {
			class67.field843[++class67.field836 - 1] = var4.field3590 ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			class67.field843[++class67.field836 - 1] = var4.field3589;
			return 1;
		} else {
			return 2;
		}
	}
}
