public class class233 {
	public static boolean field2764;
	public static boolean field2767;
	public static int field2765;
	public static int field2766;
	public static int field2771;
	public static long[] field2773;
	static int field1419;
	static int field1980;
	static int field269;
	static int field2768;
	static int field2769;
	static int field2770;
	static int field2772;
	static int field3367;
	static int field45;

	static {
		field2767 = false;
		field2771 = 0;
		field2766 = 0;
		field2764 = false;
		field2765 = 0;
		field2773 = new long[1000];
	}

	public static int method390() {
		return field2765;
	}

	public static long method466(int var0) {
		return field2773[var0];
	}

	public static int method4550(int var0) {
		long var3 = field2773[var0];
		int var2 = (int)(var3 >>> 0 & 127L);
		return var2;
	}

	public static int method1168(int var0) {
		return method3694(field2773[var0]);
	}

	public static int method3694(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	public static int method4582(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	public static int method2194(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	public static long method4549(int var0, int var1, int var2, boolean var3, int var4) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	public static final void method3187() {
		field2767 = false;
		field2765 = 0;
	}

	static final void method1960(long var0) {
		field2773[++field2765 - 1] = var0;
	}

	static final int method2061() {
		return field2771;
	}

	static final void method2982() {
		if (!field2764) {
			int var1 = class223.field2592;
			int var2 = class223.field2588;
			int var3 = class223.field2572;
			int var4 = class223.field2573;
			byte var5 = 50;
			short var6 = 3500;
			int var7 = (field2771 - class219.method3433()) * var5 / class219.method2841();
			int var8 = (field2766 - class219.method165()) * var5 / class219.method2841();
			int var9 = (field2771 - class219.method3433()) * var6 / class219.method2841();
			int var10 = (field2766 - class219.method165()) * var6 / class219.method2841();
			int var12 = var2 * var8 + var1 * var5 >> 16;
			int var13 = var2 * var5 - var1 * var8 >> 16;
			int var14 = var6 * var1 + var2 * var10 >> 16;
			int var15 = var2 * var6 - var10 * var1 >> 16;
			int var11 = class231.method7338(var7, var13, var4, var3);
			int var16 = class231.method8017(var7, var13, var4, var3);
			var7 = var11;
			var11 = class231.method7338(var9, var15, var4, var3);
			int var17 = class231.method8017(var9, var15, var4, var3);
			field2768 = (var7 + var11) / 2;
			field3367 = (var12 + var14) / 2;
			field2769 = (var17 + var16) / 2;
			field2770 = (var11 - var7) / 2;
			field1419 = (var14 - var12) / 2;
			field269 = (var17 - var16) / 2;
			field1980 = Math.abs(field2770);
			field2772 = Math.abs(field1419);
			field45 = Math.abs(field269);
		}
	}

	static final boolean method7956(class232 var0, int var1, int var2, int var3, int var4) {
		boolean var6 = field2767;
		if (!var6) {
			return false;
		} else {
			method2982();
			class224 var7 = (class224)var0.field2723.get(var1);
			int var8 = var7.field2617 + var2;
			int var9 = var3 + var7.field2611;
			int var10 = var7.field2615 + var4;
			int var11 = var7.field2614;
			int var12 = var7.field2618;
			int var13 = var7.field2616;
			int var14 = field2768 - var8;
			int var15 = field3367 - var9;
			int var16 = field2769 - var10;
			if (Math.abs(var14) > field1980 + var11) {
				return false;
			} else if (Math.abs(var15) > var12 + field2772) {
				return false;
			} else if (Math.abs(var16) > field45 + var13) {
				return false;
			} else if (Math.abs(var16 * field1419 - var15 * field269) > var12 * field45 + var13 * field2772) {
				return false;
			} else if (Math.abs(field269 * var14 - var16 * field2770) > field1980 * var13 + var11 * field45) {
				return false;
			} else {
				return Math.abs(var15 * field2770 - field1419 * var14) <= field1980 * var12 + field2772 * var11;
			}
		}
	}

	static final void method4749(class317[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class317 var10 = var0[var9];
			if (null != var10 && var1 == var10.field3589 && (var10.method6134() || class26.method353(var10) != 0 || var10 == Client.field539)) {
				if (var10.field3651) {
					if (Client.method7362(var10)) {
						continue;
					}
				} else if (0 == var10.field3598 && Client.field3394 != var10 && Client.method7362(var10)) {
					continue;
				}

				if (11 == var10.field3598) {
					if (var10.method6175(Client.field78)) {
						if (var10.method6142()) {
							Client.method3176(var10);
							class242.method4836(var10.field3707, var10, true);
						}

						if (var10.field3654 != null) {
							class84 var11 = new class84();
							var11.field1048 = var10;
							var11.field1052 = var10.field3654;
							Client.field699.method6711(var11);
						}
					}
				} else if (var10.field3598 == 12 && var10.method6200()) {
					Client.method3176(var10);
				}

				int var27 = var10.field3661 + var6;
				int var12 = var10.field3715 + var7;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (9 == var10.field3598) {
					var17 = var27;
					var18 = var12;
					var19 = var10.field3572 + var27;
					int var20 = var10.field3586 + var12;
					if (var19 < var27) {
						var17 = var19;
						var19 = var27;
					}

					if (var20 < var12) {
						var18 = var20;
						var20 = var12;
					}

					++var19;
					++var20;
					var13 = var17 > var2 ? var17 : var2;
					var14 = var18 > var3 ? var18 : var3;
					var15 = var19 < var4 ? var19 : var4;
					var16 = var20 < var5 ? var20 : var5;
				} else {
					var17 = var27 + var10.field3572;
					var18 = var12 + var10.field3586;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}

				if (var10 == Client.field511) {
					Client.field756 = true;
					Client.field677 = var27;
					Client.field678 = var12;
				}

				boolean var28 = false;
				if (var10.field3582) {
					switch(Client.field596) {
					case 0:
						var28 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field659 == var10.field3570 >>> 16) {
							var28 = true;
						}
						break;
					case 3:
						if (Client.field659 == var10.field3570) {
							var28 = true;
						}
					}
				}

				if (var28 || !var10.field3651 || var13 < var15 && var14 < var16) {
					if (var10.field3651) {
						class84 var29;
						if (var10.field3611) {
							if (class36.field242 >= var13 && class36.field243 >= var14 && class36.field242 < var15 && class36.field243 < var16) {
								for (var29 = (class84)Client.field699.method6716(); null != var29; var29 = (class84)Client.field699.method6725()) {
									if (var29.field1040) {
										var29.method8051();
										var29.field1048.field3672 = false;
									}
								}

								Client.method5149();
								if (0 == Client.field1289) {
									Client.field511 = null;
									Client.field539 = null;
								}

								if (!Client.field669) {
									Client.method3297();
								}
							}
						} else if (var10.field3718 && class36.field242 >= var13 && class36.field243 >= var14 && class36.field242 < var15 && class36.field243 < var16) {
							for (var29 = (class84)Client.field699.method6716(); null != var29; var29 = (class84)Client.field699.method6725()) {
								if (var29.field1040 && var29.field1052 == var29.field1048.field3679) {
									var29.method8051();
								}
							}
						}
					}

					var18 = class36.field242;
					var19 = class36.field243;
					if (class36.field252 != 0) {
						var18 = class36.field250;
						var19 = class36.field251;
					}

					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (var10.field3686 == 1337) {
						if (!Client.field500 && !Client.field669 && var30) {
							class60.method1166(var18, var19, var13, var14);
						}
					} else if (1338 == var10.field3686) {
						Client.method5753(var10, var27, var12);
					} else {
						if (1400 == var10.field3686) {
							Client.field1542.method8141(class36.field242, class36.field243, var30, var27, var12, var10.field3572, var10.field3586);
						}

						if (!Client.field669 && var30) {
							if (var10.field3686 == 1400) {
								Client.field1542.method8192(var27, var12, var10.field3572, var10.field3586, var18, var19);
							} else {
								class336.method6355(var10);
							}
						}

						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field3646.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && var10.field3646[var21] != null) {
									for (var24 = 0; var24 < var10.field3646[var21].length; ++var24) {
										boolean var25 = false;
										if (null != var10.field3644) {
											var25 = Client.field722.method4076(var10.field3646[var21][var24]);
										}

										if (Client.method2193(var10.field3646[var21][var24]) || var25) {
											var22 = true;
											if (null != var10.field3644 && var10.field3644[var21] > Client.field602) {
												break;
											}

											byte var26 = var10.field3647[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !Client.field722.method4076(86) && !Client.field722.method4076(82) && !Client.field722.method4076(81)) && ((var26 & 2) == 0 || Client.field722.method4076(86)) && ((var26 & 1) == 0 || Client.field722.method4076(82)) && (0 == (var26 & 4) || Client.field722.method4076(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var21 < 10) {
										class61.method1201(var21 + 1, var10.field3570, var10.field3571, var10.field3703, "");
									} else if (var21 == 10) {
										Client.method3392();
										Client.method287(var10.field3570, var10.field3571, class318.method3742(class26.method353(var10)), var10.field3703);
										Client.field663 = Client.method5750(var10);
										if (Client.field663 == null) {
											Client.field663 = class337.field3889;
										}

										Client.field655 = var10.field3650 + class97.method7285(16777215);
									}

									var24 = var10.field3628[var21];
									if (null == var10.field3644) {
										var10.field3644 = new int[var10.field3646.length];
									}

									if (var10.field3671 == null) {
										var10.field3671 = new int[var10.field3646.length];
									}

									if (var24 != 0) {
										if (0 == var10.field3644[var21]) {
											var10.field3644[var21] = Client.field602 + var24 + var10.field3671[var21];
										} else {
											var10.field3644[var21] = var24 + Client.field602;
										}
									} else {
										var10.field3644[var21] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && null != var10.field3644) {
									var10.field3644[var21] = 0;
								}
							}
						}

						if (var10.field3651) {
							if (class36.field242 >= var13 && class36.field243 >= var14 && class36.field242 < var15 && class36.field243 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}

							boolean var31 = false;
							if ((1 == class36.field232 || !Client.field4941 && 4 == class36.field232) && var30) {
								var31 = true;
							}

							var22 = false;
							if ((1 == class36.field252 || !Client.field4941 && class36.field252 == 4) && class36.field250 >= var13 && class36.field251 >= var14 && class36.field250 < var15 && class36.field251 < var16) {
								var22 = true;
							}

							if (var22) {
								class371.method6891(var10, class36.field250 - var27, class36.field251 - var12);
							}

							if (var10.method6143()) {
								if (var22) {
									Client.field702.method6711(new class207(0, class36.field242 - var27, class36.field243 - var12, var10));
								}

								if (var31) {
									Client.field702.method6711(new class207(1, class36.field242 - var27, class36.field243 - var12, var10));
								}
							}

							if (var10.field3686 == 1400) {
								Client.field1542.method8142(var18, var19, var30 & var31, var30 & var22);
							}

							if (null != Client.field511 && var10 != Client.field511 && var30 && class318.method5749(class26.method353(var10))) {
								Client.field672 = var10;
							}

							if (var10 == Client.field539) {
								Client.field673 = true;
								Client.field628 = var27;
								Client.field675 = var12;
							}

							if (var10.field3624) {
								class84 var32;
								if (var30 && 0 != Client.field697 && null != var10.field3679) {
									var32 = new class84();
									var32.field1040 = true;
									var32.field1048 = var10;
									var32.field1044 = Client.field697;
									var32.field1052 = var10.field3679;
									Client.field699.method6711(var32);
								}

								if (null != Client.field511 || Client.field669) {
									var22 = false;
									var31 = false;
									var30 = false;
								}

								if (!var10.field3663 && var22) {
									var10.field3663 = true;
									if (var10.field3694 != null) {
										var32 = new class84();
										var32.field1040 = true;
										var32.field1048 = var10;
										var32.field1043 = class36.field250 - var27;
										var32.field1044 = class36.field251 - var12;
										var32.field1052 = var10.field3694;
										Client.field699.method6711(var32);
									}
								}

								if (var10.field3663 && var31 && null != var10.field3660) {
									var32 = new class84();
									var32.field1040 = true;
									var32.field1048 = var10;
									var32.field1043 = class36.field242 - var27;
									var32.field1044 = class36.field243 - var12;
									var32.field1052 = var10.field3660;
									Client.field699.method6711(var32);
								}

								if (var10.field3663 && !var31) {
									var10.field3663 = false;
									if (null != var10.field3633) {
										var32 = new class84();
										var32.field1040 = true;
										var32.field1048 = var10;
										var32.field1043 = class36.field242 - var27;
										var32.field1044 = class36.field243 - var12;
										var32.field1052 = var10.field3633;
										Client.field701.method6711(var32);
									}
								}

								if (var31 && null != var10.field3662) {
									var32 = new class84();
									var32.field1040 = true;
									var32.field1048 = var10;
									var32.field1043 = class36.field242 - var27;
									var32.field1044 = class36.field243 - var12;
									var32.field1052 = var10.field3662;
									Client.field699.method6711(var32);
								}

								if (!var10.field3672 && var30) {
									var10.field3672 = true;
									if (null != var10.field3687) {
										var32 = new class84();
										var32.field1040 = true;
										var32.field1048 = var10;
										var32.field1043 = class36.field242 - var27;
										var32.field1044 = class36.field243 - var12;
										var32.field1052 = var10.field3687;
										Client.field699.method6711(var32);
									}
								}

								if (var10.field3672 && var30 && null != var10.field3664) {
									var32 = new class84();
									var32.field1040 = true;
									var32.field1048 = var10;
									var32.field1043 = class36.field242 - var27;
									var32.field1044 = class36.field243 - var12;
									var32.field1052 = var10.field3664;
									Client.field699.method6711(var32);
								}

								if (var10.field3672 && !var30) {
									var10.field3672 = false;
									if (null != var10.field3665) {
										var32 = new class84();
										var32.field1040 = true;
										var32.field1048 = var10;
										var32.field1043 = class36.field242 - var27;
										var32.field1044 = class36.field243 - var12;
										var32.field1052 = var10.field3665;
										Client.field701.method6711(var32);
									}
								}

								if (null != var10.field3676) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3676;
									Client.field700.method6711(var32);
								}

								int var35;
								class84 var37;
								int var38;
								if (var10.field3670 != null && Client.field514 > var10.field3561) {
									if (null != var10.field3584 && Client.field514 - var10.field3561 <= 32) {
										label643:
										for (var38 = var10.field3561; var38 < Client.field514; ++var38) {
											var24 = Client.field740[var38 & 31];

											for (var35 = 0; var35 < var10.field3584.length; ++var35) {
												if (var24 == var10.field3584[var35]) {
													var37 = new class84();
													var37.field1048 = var10;
													var37.field1052 = var10.field3670;
													Client.field699.method6711(var37);
													break label643;
												}
											}
										}
									} else {
										var32 = new class84();
										var32.field1048 = var10;
										var32.field1052 = var10.field3670;
										Client.field699.method6711(var32);
									}

									var10.field3561 = Client.field514;
								}

								if (null != var10.field3615 && Client.field684 > var10.field3712) {
									if (null != var10.field3673 && Client.field684 - var10.field3712 <= 32) {
										label619:
										for (var38 = var10.field3712; var38 < Client.field684; ++var38) {
											var24 = Client.field720[var38 & 31];

											for (var35 = 0; var35 < var10.field3673.length; ++var35) {
												if (var24 == var10.field3673[var35]) {
													var37 = new class84();
													var37.field1048 = var10;
													var37.field1052 = var10.field3615;
													Client.field699.method6711(var37);
													break label619;
												}
											}
										}
									} else {
										var32 = new class84();
										var32.field1048 = var10;
										var32.field1052 = var10.field3615;
										Client.field699.method6711(var32);
									}

									var10.field3712 = Client.field684;
								}

								if (null != var10.field3674 && Client.field686 > var10.field3701) {
									if (var10.field3675 != null && Client.field686 - var10.field3701 <= 32) {
										label595:
										for (var38 = var10.field3701; var38 < Client.field686; ++var38) {
											var24 = Client.field685[var38 & 31];

											for (var35 = 0; var35 < var10.field3675.length; ++var35) {
												if (var10.field3675[var35] == var24) {
													var37 = new class84();
													var37.field1048 = var10;
													var37.field1052 = var10.field3674;
													Client.field699.method6711(var37);
													break label595;
												}
											}
										}
									} else {
										var32 = new class84();
										var32.field1048 = var10;
										var32.field1052 = var10.field3674;
										Client.field699.method6711(var32);
									}

									var10.field3701 = Client.field686;
								}

								if (Client.field752 > var10.field3710 && null != var10.field3680) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3680;
									Client.field699.method6711(var32);
								}

								if (Client.field690 > var10.field3710 && null != var10.field3692) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3692;
									Client.field699.method6711(var32);
								}

								if (Client.field691 > var10.field3710 && null != var10.field3623) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3623;
									Client.field699.method6711(var32);
								}

								if (Client.field692 > var10.field3710 && var10.field3638 != null) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3638;
									Client.field699.method6711(var32);
								}

								if (Client.field693 > var10.field3710 && var10.field3567 != null) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3567;
									Client.field699.method6711(var32);
								}

								if (Client.field763 > var10.field3710 && null != var10.field3645) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3645;
									Client.field699.method6711(var32);
								}

								if (Client.field769 > var10.field3710 && null != var10.field3693) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3693;
									Client.field699.method6711(var32);
								}

								if (Client.field566 > var10.field3710 && var10.field3688 != null) {
									var32 = new class84();
									var32.field1048 = var10;
									var32.field1052 = var10.field3688;
									Client.field699.method6711(var32);
								}

								var10.field3710 = Client.field680;
								if (null != var10.field3681) {
									for (var38 = 0; var38 < Client.field488; ++var38) {
										class84 var36 = new class84();
										var36.field1048 = var10;
										var36.field1047 = Client.field557[var38];
										var36.field1041 = Client.field725[var38];
										var36.field1052 = var10.field3681;
										Client.field699.method6711(var36);
									}
								}

								class84 var39;
								int[] var40;
								if (var10.field3682 != null) {
									var40 = Client.field722.method4072();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class84();
										var39.field1048 = var10;
										var39.field1047 = var40[var24];
										var39.field1052 = var10.field3682;
										Client.field699.method6711(var39);
									}
								}

								if (var10.field3583 != null) {
									var40 = Client.field722.method4069();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class84();
										var39.field1048 = var10;
										var39.field1047 = var40[var24];
										var39.field1052 = var10.field3583;
										Client.field699.method6711(var39);
									}
								}
							}
						}

						if (!var10.field3651) {
							if (null != Client.field511 || Client.field669) {
								continue;
							}

							if ((var10.field3614 >= 0 || 0 != var10.field3597) && class36.field242 >= var13 && class36.field243 >= var14 && class36.field242 < var15 && class36.field243 < var16) {
								if (var10.field3614 >= 0) {
									Client.field3394 = var0[var10.field3614];
								} else {
									Client.field3394 = var10;
								}
							}

							if (8 == var10.field3598 && class36.field242 >= var13 && class36.field243 >= var14 && class36.field242 < var15 && class36.field243 < var16) {
								Client.field1575 = var10;
							}

							if (var10.field3594 > var10.field3586) {
								class167.method3417(var10, var27 + var10.field3572, var12, var10.field3586, var10.field3594, class36.field242, class36.field243);
							}
						}

						if (0 == var10.field3598) {
							method4749(var0, var10.field3570, var13, var14, var15, var16, var27 - var10.field3591, var12 - var10.field3592);
							if (null != var10.field3707) {
								method4749(var10.field3707, var10.field3570, var13, var14, var15, var16, var27 - var10.field3591, var12 - var10.field3592);
							}

							class83 var33 = (class83)Client.field657.method8381((long)var10.field3570);
							if (var33 != null) {
								if (0 == var33.field1038 && class36.field242 >= var13 && class36.field243 >= var14 && class36.field242 < var15 && class36.field243 < var16 && !Client.field669) {
									for (class84 var34 = (class84)Client.field699.method6716(); null != var34; var34 = (class84)Client.field699.method6725()) {
										if (var34.field1040) {
											var34.method8051();
											var34.field1048.field3672 = false;
										}
									}

									if (Client.field1289 == 0) {
										Client.field511 = null;
										Client.field539 = null;
									}

									if (!Client.field669) {
										Client.method3297();
									}
								}

								Client.method726(var33.field1037, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}

	}
}
