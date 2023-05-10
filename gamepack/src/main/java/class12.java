import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

import java.io.IOException;

class class12 implements TlsAuthentication {
	// $FF: synthetic field
	final class14 this$2;

	class12(class14 var1) {
		this.this$2 = var1;
	}

	static final void method103(class317[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class499.method8981(var2, var3, var4, var5);
		class219.method272();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			class317 var11 = var0[var10];
			if (var11 != null && (var11.field3589 == var1 || var1 == -1412584499 && Client.field511 == var11)) {
				int var12;
				if (var8 == -1) {
					Client.field709[Client.field781] = var6 + var11.field3661;
					Client.field710[Client.field781] = var11.field3715 + var7;
					Client.field640[Client.field781] = var11.field3572;
					Client.field712[Client.field781] = var11.field3586;
					var12 = ++Client.field781 - 1;
				} else {
					var12 = var8;
				}

				var11.field3714 = var12;
				var11.field3698 = Client.field602;
				if (!var11.field3651 || !Client.method7362(var11)) {
					if (var11.field3686 > 0) {
						class36.method713(var11);
					}

					int var13 = var6 + var11.field3661;
					int var14 = var7 + var11.field3715;
					int var15 = var11.field3601;
					int var16;
					int var17;
					if (var11 == Client.field511) {
						if (var1 != -1412584499 && !var11.field3577) {
							Client.field2878 = var0;
							Client.field2685 = var6;
							Client.field1329 = var7;
							continue;
						}

						if (Client.field724 && Client.field673) {
							var16 = class36.field242;
							var17 = class36.field243;
							var16 -= Client.field670;
							var17 -= Client.field671;
							if (var16 < Client.field628) {
								var16 = Client.field628;
							}

							if (var16 + var11.field3572 > Client.field539.field3572 + Client.field628) {
								var16 = Client.field628 + Client.field539.field3572 - var11.field3572;
							}

							if (var17 < Client.field675) {
								var17 = Client.field675;
							}

							if (var11.field3586 + var17 > Client.field539.field3586 + Client.field675) {
								var17 = Client.field539.field3586 + Client.field675 - var11.field3586;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field3577) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (9 == var11.field3598) {
						var20 = var13;
						var21 = var14;
						var22 = var13 + var11.field3572;
						var23 = var11.field3586 + var14;
						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						if (var23 < var14) {
							var21 = var23;
							var23 = var14;
						}

						++var22;
						++var23;
						var16 = var20 > var2 ? var20 : var2;
						var17 = var21 > var3 ? var21 : var3;
						var18 = var22 < var4 ? var22 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var20 = var11.field3572 + var13;
						var21 = var11.field3586 + var14;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}

					if (!var11.field3651 || var16 < var18 && var17 < var19) {
						if (var11.field3686 != 0) {
							if (var11.field3686 == 1336) {
								if (Client.field112.method2399()) {
									var14 += 15;
									Client.field2832.method7153("Fps:" + class35.field204, var13 + var11.field3572, var14, 16776960, -1);
									var14 += 15;
									Runtime var45 = Runtime.getRuntime();
									var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !Client.field493) {
										var22 = 16711680;
									}

									Client.field2832.method7153("Mem:" + var21 + "k", var13 + var11.field3572, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field3686 == 1337) {
								Client.field645 = var13;
								Client.field646 = var14;
								class19.method282(var13, var14, var11.field3572, var11.field3586);
								Client.field706[var11.field3714] = true;
								class499.method8981(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3686 == 1338) {
								class156.method3290(var11, var13, var14, var12);
								class499.method8981(var2, var3, var4, var5);
								continue;
							}

							if (1339 == var11.field3686) {
								class76.method2093(var11, var13, var14, var12);
								class499.method8981(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3686 == 1400) {
								Client.field1542.method8247(var13, var14, var11.field3572, var11.field3586, Client.field602);
							}

							if (1401 == var11.field3686) {
								Client.field1542.method8264(var13, var14, var11.field3572, var11.field3586);
							}

							if (var11.field3686 == 1402) {
								class72.field1471.method2356(var13, Client.field602);
							}
						}

						if (0 == var11.field3598) {
							if (!var11.field3651 && Client.method7362(var11) && Client.field3394 != var11) {
								continue;
							}

							if (!var11.field3651) {
								if (var11.field3592 > var11.field3594 - var11.field3586) {
									var11.field3592 = var11.field3594 - var11.field3586;
								}

								if (var11.field3592 < 0) {
									var11.field3592 = 0;
								}
							}

							method103(var0, var11.field3570, var16, var17, var18, var19, var13 - var11.field3591, var14 - var11.field3592, var12);
							if (var11.field3707 != null) {
								method103(var11.field3707, var11.field3570, var16, var17, var18, var19, var13 - var11.field3591, var14 - var11.field3592, var12);
							}

							class83 var29 = (class83)Client.field657.method8381((long)var11.field3570);
							if (null != var29) {
								class14.method166(var29.field1037, var16, var17, var18, var19, var13, var14, var12);
							}

							class499.method8981(var2, var3, var4, var5);
							class219.method272();
						} else if (11 == var11.field3598) {
							if (Client.method7362(var11) && Client.field3394 != var11) {
								continue;
							}

							if (var11.field3707 != null) {
								method103(var11.field3707, var11.field3570, var16, var17, var18, var19, var13 - var11.field3591, var14 - var11.field3592, var12);
							}

							class499.method8981(var2, var3, var4, var5);
							class219.method272();
						}

						if (Client.field715 || Client.field652[var12] || Client.field713 > 1) {
							if (0 == var11.field3598 && !var11.field3651 && var11.field3594 > var11.field3586) {
								Client.method2656(var13 + var11.field3572, var14, var11.field3592, var11.field3586, var11.field3594);
							}

							if (1 != var11.field3598) {
								if (var11.field3598 == 3) {
									if (class453.method8076(var11)) {
										var20 = var11.field3596;
										if (var11 == Client.field3394 && var11.field3656 != 0) {
											var20 = var11.field3656;
										}
									} else {
										var20 = var11.field3595;
										if (var11 == Client.field3394 && 0 != var11.field3597) {
											var20 = var11.field3597;
										}
									}

									if (var11.field3599) {
										switch(var11.field3600.field5073) {
										case 1:
											class499.method8990(var13, var14, var11.field3572, var11.field3586, var11.field3595, var11.field3596);
											break;
										case 2:
											class499.method8989(var13, var14, var11.field3572, var11.field3586, var11.field3595, var11.field3596, 255 - (var11.field3601 & 255), 255 - (var11.field3602 & 255));
											break;
										default:
											if (var15 == 0) {
												class499.method9012(var13, var14, var11.field3572, var11.field3586, var20);
											} else {
												class499.method8988(var13, var14, var11.field3572, var11.field3586, var20, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										class499.method9041(var13, var14, var11.field3572, var11.field3586, var20);
									} else {
										class499.method9009(var13, var14, var11.field3572, var11.field3586, var20, 256 - (var15 & 255));
									}
								} else if (var11.field3598 == 4) {
									class379 var37 = var11.method6195();
									if (var37 == null) {
										if (class317.field3568) {
											Client.method3176(var11);
										}
									} else {
										String var44 = var11.field3716;
										if (class453.method8076(var11)) {
											var21 = var11.field3596;
											if (Client.field3394 == var11 && var11.field3656 != 0) {
												var21 = var11.field3656;
											}

											if (var11.field3634.length() > 0) {
												var44 = var11.field3634;
											}
										} else {
											var21 = var11.field3595;
											if (var11 == Client.field3394 && 0 != var11.field3597) {
												var21 = var11.field3597;
											}
										}

										if (var11.field3651 && -1 != var11.field3703) {
											class202 var46 = class92.method2352(var11.field3703);
											var44 = var46.field2261;
											if (var44 == null) {
												var44 = class337.field3889;
											}

											if ((1 == var46.field2236 || 1 != var11.field3637) && -1 != var11.field3637) {
												var44 = class97.method7285(16748608) + var44 + class97.field1291 + " " + 'x' + class340.method6374(var11.field3637);
											}
										}

										if (var11 == Client.field661) {
											var44 = class337.field4008;
											var21 = var11.field3595;
										}

										if (!var11.field3651) {
											var44 = class122.method2916(var44, var11);
										}

										var37.method7156(var44, var13, var14, var11.field3572, var11.field3586, var21, var11.field3574 ? 0 : -1, class442.method1137(var11.field3601), var11.field3636, var11.field3684, var11.field3635);
									}
								} else {
									int var25;
									int var26;
									int var41;
									if (5 == var11.field3598) {
										class503 var35;
										if (!var11.field3651) {
											var35 = var11.method6125(class453.method8076(var11), Client.field78);
											if (var35 != null) {
												var35.method9106(var13, var14);
											} else if (class317.field3568) {
												Client.method3176(var11);
											}
										} else {
											if (-1 != var11.field3703) {
												var35 = class253.method5160(var11.field3703, var11.field3637, var11.field3610, var11.field3717, var11.field3631, false);
											} else {
												var35 = var11.method6125(false, Client.field78);
											}

											if (null == var35) {
												if (class317.field3568) {
													Client.method3176(var11);
												}
											} else {
												var21 = var35.field5092;
												var22 = var35.field5087;
												if (!var11.field3659) {
													var23 = var11.field3572 * 4096 / var21;
													if (var11.field3608 != 0) {
														var35.method9192(var11.field3572 / 2 + var13, var11.field3586 / 2 + var14, var11.field3608, var23);
													} else if (var15 != 0) {
														var35.method9146(var13, var14, var11.field3572, var11.field3586, 256 - (var15 & 255));
													} else if (var11.field3572 == var21 && var22 == var11.field3586) {
														var35.method9106(var13, var14);
													} else {
														var35.method9108(var13, var14, var11.field3572, var11.field3586);
													}
												} else {
													class499.method8982(var13, var14, var11.field3572 + var13, var11.field3586 + var14);
													var23 = (var11.field3572 + (var21 - 1)) / var21;
													var41 = (var22 - 1 + var11.field3586) / var22;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var41; ++var26) {
															if (var11.field3608 != 0) {
																var35.method9192(var25 * var21 + var13 + var21 / 2, var22 / 2 + var14 + var26 * var22, var11.field3608, 4096);
															} else if (var15 != 0) {
																var35.method9112(var13 + var21 * var25, var22 * var26 + var14, 256 - (var15 & 255));
															} else {
																var35.method9106(var25 * var21 + var13, var14 + var22 * var26);
															}
														}
													}

													class499.method8981(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (var11.field3598 == 6) {
											boolean var33 = class453.method8076(var11);
											if (var33) {
												var21 = var11.field3629;
											} else {
												var21 = var11.field3618;
											}

											class232 var36 = null;
											var23 = 0;
											if (-1 != var11.field3703) {
												class202 var38 = class92.method2352(var11.field3703);
												if (var38 != null) {
													var38 = var38.method3908(var11.field3637);
													var36 = var38.method3925(1);
													if (null != var36) {
														var36.method4654();
														var23 = var36.field2619 / 2;
													} else {
														Client.method3176(var11);
													}
												}
											} else if (var11.field3657 == 5) {
												if (0 == var11.field3683) {
													var36 = Client.field772.method5805((class204)null, -1, (class204)null, -1);
												} else {
													var36 = Client.field3454.method4541();
												}
											} else if (var11.field3657 == 7) {
												var36 = var11.field3585.method5805((class204)null, -1, class81.method2189(Client.field3454.field1139, (byte)121), Client.field3454.field1178);
											} else {
												class191 var39 = null;
												class190 var40 = null;
												if (6 == var11.field3657) {
													var26 = var11.field3683;
													if (var26 >= 0 && var26 < Client.field546.length) {
														class96 var43 = Client.field546[var26];
														if (var43 != null) {
															var39 = var43.field1277;
															var40 = var43.method2515();
														}
													}
												}

												class204 var42 = null;
												var27 = -1;
												if (var21 != -1) {
													var42 = class81.method2189(var21, (byte)25);
													var27 = var11.field3705;
												}

												var36 = var11.method6121(var42, var27, var33, Client.field3454.field1097, var39, var40);
												if (var36 == null && class317.field3568) {
													Client.method3176(var11);
												}
											}

											class249.method4970(var13 + var11.field3572 / 2, var11.field3586 / 2 + var14);
											var41 = var11.field3619 * class219.field2512[var11.field3622] >> 16;
											var25 = var11.field3619 * class219.field2516[var11.field3622] >> 16;
											if (var36 != null) {
												if (!var11.field3651) {
													var36.method4705(0, var11.field3566, 0, var11.field3622, 0, var41, var25);
												} else {
													var36.method4654();
													if (var11.field3575) {
														var36.method4621(0, var11.field3566, var11.field3711, var11.field3622, var11.field3620, var11.field3709 + var41 + var23, var25 + var11.field3709, var11.field3619);
													} else {
														var36.method4705(0, var11.field3566, var11.field3711, var11.field3622, var11.field3620, var11.field3709 + var41 + var23, var11.field3709 + var25);
													}
												}
											}

											class219.method2165();
										} else {
											class379 var31;
											if (8 == var11.field3598 && Client.field1575 == var11 && Client.field648 == Client.field647) {
												var20 = 0;
												var21 = 0;
												var31 = Client.field2832;
												String var34 = var11.field3716;

												String var24;
												for (var34 = class122.method2916(var34, var11); var34.length() > 0; var21 += var31.field4439 + 1) {
													var25 = var34.indexOf(class97.field1290);
													if (var25 != -1) {
														var24 = var34.substring(0, var25);
														var34 = var34.substring(var25 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var26 = var31.method7145(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}

												var20 += 6;
												var21 += 7;
												var25 = var13 + var11.field3572 - 5 - var20;
												var26 = var11.field3586 + var14 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var20 + var25 > var4) {
													var25 = var4 - var20;
												}

												if (var26 + var21 > var5) {
													var26 = var5 - var21;
												}

												class499.method9012(var25, var26, var20, var21, 16777120);
												class499.method9041(var25, var26, var20, var21, 0);
												var34 = var11.field3716;
												var27 = var26 + var31.field4439 + 2;

												for (var34 = class122.method2916(var34, var11); var34.length() > 0; var27 += var31.field4439 + 1) {
													int var28 = var34.indexOf(class97.field1290);
													if (var28 != -1) {
														var24 = var34.substring(0, var28);
														var34 = var34.substring(var28 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var31.method7228(var24, var25 + 3, var27, 0, -1);
												}
											}

											if (9 == var11.field3598) {
												if (var11.field3604) {
													var20 = var13;
													var21 = var14 + var11.field3586;
													var22 = var13 + var11.field3572;
													var23 = var14;
												} else {
													var20 = var13;
													var21 = var14;
													var22 = var11.field3572 + var13;
													var23 = var11.field3586 + var14;
												}

												if (var11.field3603 == 1) {
													class499.method9010(var20, var21, var22, var23, var11.field3595);
												} else {
													class37.method717(var20, var21, var22, var23, var11.field3595, var11.field3603);
												}
											} else if (var11.field3598 == 12) {
												class315 var30 = var11.method6152();
												class310 var32 = var11.method6154();
												if (var30 != null && var32 != null && var30.method5903()) {
													var31 = var11.method6195();
													if (null != var31) {
														Client.field698.method9234(var13, var14, var11.field3572, var11.field3586, var30.method5960(), var30.method6059(), var30.method5901(), var30.method5902(), var30.method5900());
														var23 = var11.field3574 ? var11.field3717 : -1;
														if (!var30.method5898() && var30.method5895().method7004()) {
															Client.field698.method9239(var32.field3492, var23, var32.field3494, var32.field3490);
															Client.field698.method9236(var30.method5896(), var31);
														} else {
															Client.field698.method9239(var11.field3595, var23, var32.field3494, var32.field3490);
															Client.field698.method9236(var30.method5895(), var31);
														}

														class499.method8981(var2, var3, var4, var5);
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

	@Override
	public void notifyServerCertificate(Certificate serverCertificate) throws IOException {

	}

	@Override
	public TlsCredentials getClientCredentials(CertificateRequest certificateRequest) throws IOException {
		return null;
	}
}
