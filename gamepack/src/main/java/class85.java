public class class85 implements Runnable {
	boolean field1062;
	int field1056;
	int[] field1054;
	int[] field1057;
	Object field1055;
	long[] field1059;

	class85() {
		this.field1062 = true;
		this.field1055 = new Object();
		this.field1056 = 0;
		this.field1057 = new int[500];
		this.field1054 = new int[500];
		this.field1059 = new long[500];
	}

	public void run() {
		for (; this.field1062; class295.method5844(50L)) {
			Object var1;
			synchronized(var1 = this.field1055){}
			if (this.field1056 < 500) {
				this.field1057[this.field1056] = class36.field242;
				this.field1054[this.field1056] = class36.field243;
				this.field1059[this.field1056] = class36.field246;
				++this.field1056;
			}
		}

	}

	static int method2212(int var0, class75 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = Client.field231;
			int var17 = (Client.field3454.field1171 >> 7) + Client.field2850;
			int var13 = Client.field2841 + (Client.field3454.field1138 >> 7);
			Client.method2302().method8297(var4, var17, var13, true);
			return 1;
		} else {
			class249 var8;
			if (var0 == 6601) {
				var4 = class67.field843[--class67.field836];
				String var16 = "";
				var8 = Client.method2302().method8168(var4);
				if (null != var8) {
					var16 = var8.method4916();
				}

				class67.field842[++class67.field1015 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = class67.field843[--class67.field836];
				Client.method2302().method8151(var4);
				return 1;
			} else if (var0 == 6603) {
				class67.field843[++class67.field836 - 1] = Client.method2302().method8165();
				return 1;
			} else if (var0 == 6604) {
				var4 = class67.field843[--class67.field836];
				Client.method2302().method8150(var4);
				return 1;
			} else if (var0 == 6605) {
				class67.field843[++class67.field836 - 1] = Client.method2302().method8167() ? 1 : 0;
				return 1;
			} else {
				class308 var15;
				if (var0 == 6606) {
					var15 = new class308(class67.field843[--class67.field836]);
					Client.method2302().method8195(var15.field3486, var15.field3488);
					return 1;
				} else if (var0 == 6607) {
					var15 = new class308(class67.field843[--class67.field836]);
					Client.method2302().method8170(var15.field3486, var15.field3488);
					return 1;
				} else if (var0 == 6608) {
					var15 = new class308(class67.field843[--class67.field836]);
					Client.method2302().method8171(var15.field3487, var15.field3486, var15.field3488);
					return 1;
				} else if (var0 == 6609) {
					var15 = new class308(class67.field843[--class67.field836]);
					Client.method2302().method8252(var15.field3487, var15.field3486, var15.field3488);
					return 1;
				} else if (var0 == 6610) {
					class67.field843[++class67.field836 - 1] = Client.method2302().method8173();
					class67.field843[++class67.field836 - 1] = Client.method2302().method8174();
					return 1;
				} else {
					class249 var12;
					if (var0 == 6611) {
						var4 = class67.field843[--class67.field836];
						var12 = Client.method2302().method8168(var4);
						if (var12 == null) {
							class67.field843[++class67.field836 - 1] = 0;
						} else {
							class67.field843[++class67.field836 - 1] = var12.method4925().method5769();
						}

						return 1;
					} else if (var0 == 6612) {
						var4 = class67.field843[--class67.field836];
						var12 = Client.method2302().method8168(var4);
						if (var12 == null) {
							class67.field843[++class67.field836 - 1] = 0;
							class67.field843[++class67.field836 - 1] = 0;
						} else {
							class67.field843[++class67.field836 - 1] = (var12.method4920() - var12.method4919() + 1) * 64;
							class67.field843[++class67.field836 - 1] = (var12.method4906() - var12.method4960() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var4 = class67.field843[--class67.field836];
						var12 = Client.method2302().method8168(var4);
						if (var12 == null) {
							class67.field843[++class67.field836 - 1] = 0;
							class67.field843[++class67.field836 - 1] = 0;
							class67.field843[++class67.field836 - 1] = 0;
							class67.field843[++class67.field836 - 1] = 0;
						} else {
							class67.field843[++class67.field836 - 1] = var12.method4919() * 64;
							class67.field843[++class67.field836 - 1] = var12.method4960() * 64;
							class67.field843[++class67.field836 - 1] = var12.method4920() * 64 + 64 - 1;
							class67.field843[++class67.field836 - 1] = var12.method4906() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var4 = class67.field843[--class67.field836];
						var12 = Client.method2302().method8168(var4);
						if (var12 == null) {
							class67.field843[++class67.field836 - 1] = -1;
						} else {
							class67.field843[++class67.field836 - 1] = var12.method4915();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Client.method2302().method8175();
						if (null == var15) {
							class67.field843[++class67.field836 - 1] = -1;
							class67.field843[++class67.field836 - 1] = -1;
						} else {
							class67.field843[++class67.field836 - 1] = var15.field3486;
							class67.field843[++class67.field836 - 1] = var15.field3488;
						}

						return 1;
					} else if (var0 == 6616) {
						class67.field843[++class67.field836 - 1] = Client.method2302().method8224();
						return 1;
					} else if (var0 == 6617) {
						var15 = new class308(class67.field843[--class67.field836]);
						var12 = Client.method2302().method8293();
						if (null == var12) {
							class67.field843[++class67.field836 - 1] = -1;
							class67.field843[++class67.field836 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method4959(var15.field3487, var15.field3486, var15.field3488);
							if (null == var11) {
								class67.field843[++class67.field836 - 1] = -1;
								class67.field843[++class67.field836 - 1] = -1;
							} else {
								class67.field843[++class67.field836 - 1] = var11[0];
								class67.field843[++class67.field836 - 1] = var11[1];
							}

							return 1;
						}
					} else {
						class308 var6;
						if (var0 == 6618) {
							var15 = new class308(class67.field843[--class67.field836]);
							var12 = Client.method2302().method8293();
							if (var12 == null) {
								class67.field843[++class67.field836 - 1] = -1;
								class67.field843[++class67.field836 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method4911(var15.field3486, var15.field3488);
								if (null == var6) {
									class67.field843[++class67.field836 - 1] = -1;
								} else {
									class67.field843[++class67.field836 - 1] = var6.method5769();
								}

								return 1;
							}
						} else {
							class308 var9;
							if (var0 == 6619) {
								class67.field836 -= 2;
								var4 = class67.field843[class67.field836];
								var9 = new class308(class67.field843[class67.field836 + 1]);
								class221.method4339(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								class67.field836 -= 2;
								var4 = class67.field843[class67.field836];
								var9 = new class308(class67.field843[1 + class67.field836]);
								class221.method4339(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								class67.field836 -= 2;
								var4 = class67.field843[class67.field836];
								var9 = new class308(class67.field843[1 + class67.field836]);
								var8 = Client.method2302().method8168(var4);
								if (var8 == null) {
									class67.field843[++class67.field836 - 1] = 0;
									return 1;
								} else {
									class67.field843[++class67.field836 - 1] = var8.method4964(var9.field3487, var9.field3486, var9.field3488) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								class67.field843[++class67.field836 - 1] = Client.method2302().method8209();
								class67.field843[++class67.field836 - 1] = Client.method2302().method8225();
								return 1;
							} else if (var0 == 6623) {
								var15 = new class308(class67.field843[--class67.field836]);
								var12 = Client.method2302().method8299(var15.field3487, var15.field3486, var15.field3488);
								if (var12 == null) {
									class67.field843[++class67.field836 - 1] = -1;
								} else {
									class67.field843[++class67.field836 - 1] = var12.method4953();
								}

								return 1;
							} else if (var0 == 6624) {
								Client.method2302().method8178(class67.field843[--class67.field836]);
								return 1;
							} else if (var0 == 6625) {
								Client.method2302().method8179();
								return 1;
							} else if (var0 == 6626) {
								Client.method2302().method8180(class67.field843[--class67.field836]);
								return 1;
							} else if (var0 == 6627) {
								Client.method2302().method8211();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = class67.field843[--class67.field836] == 1;
									Client.method2302().method8182(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = class67.field843[--class67.field836];
									Client.method2302().method8183(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = class67.field843[--class67.field836];
									Client.method2302().method8184(var4);
									return 1;
								} else if (var0 == 6631) {
									Client.method2302().method8275();
									return 1;
								} else if (var0 == 6632) {
									var14 = class67.field843[--class67.field836] == 1;
									Client.method2302().method8186(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										class67.field836 -= 2;
										var4 = class67.field843[class67.field836];
										var10 = 1 == class67.field843[1 + class67.field836];
										Client.method2302().method8187(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										class67.field836 -= 2;
										var4 = class67.field843[class67.field836];
										var10 = class67.field843[1 + class67.field836] == 1;
										Client.method2302().method8277(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										class67.field843[++class67.field836 - 1] = Client.method2302().method8268() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = class67.field843[--class67.field836];
										class67.field843[++class67.field836 - 1] = Client.method2302().method8189(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = class67.field843[--class67.field836];
										class67.field843[++class67.field836 - 1] = Client.method2302().method8190(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class67.field836 -= 2;
										var4 = class67.field843[class67.field836];
										var9 = new class308(class67.field843[1 + class67.field836]);
										var6 = Client.method2302().method8329(var4, var9);
										if (null == var6) {
											class67.field843[++class67.field836 - 1] = -1;
										} else {
											class67.field843[++class67.field836 - 1] = var6.method5769();
										}

										return 1;
									} else {
										class267 var7;
										if (var0 == 6639) {
											var7 = Client.method2302().method8164();
											if (var7 == null) {
												class67.field843[++class67.field836 - 1] = -1;
												class67.field843[++class67.field836 - 1] = -1;
											} else {
												class67.field843[++class67.field836 - 1] = var7.method5322();
												class67.field843[++class67.field836 - 1] = var7.field3050.method5769();
											}

											return 1;
										} else if (var0 == 6640) {
											var7 = Client.method2302().method8196();
											if (var7 == null) {
												class67.field843[++class67.field836 - 1] = -1;
												class67.field843[++class67.field836 - 1] = -1;
											} else {
												class67.field843[++class67.field836 - 1] = var7.method5322();
												class67.field843[++class67.field836 - 1] = var7.field3050.method5769();
											}

											return 1;
										} else {
											class183 var5;
											if (var0 == 6693) {
												var4 = class67.field843[--class67.field836];
												var5 = class355.method6671(var4);
												if (null == var5.field1920) {
													class67.field842[++class67.field1015 - 1] = "";
												} else {
													class67.field842[++class67.field1015 - 1] = var5.field1920;
												}

												return 1;
											} else if (var0 == 6694) {
												var4 = class67.field843[--class67.field836];
												var5 = class355.method6671(var4);
												class67.field843[++class67.field836 - 1] = var5.field1922;
												return 1;
											} else if (var0 == 6695) {
												var4 = class67.field843[--class67.field836];
												var5 = class355.method6671(var4);
												if (null == var5) {
													class67.field843[++class67.field836 - 1] = -1;
												} else {
													class67.field843[++class67.field836 - 1] = var5.field1937;
												}

												return 1;
											} else if (var0 == 6696) {
												var4 = class67.field843[--class67.field836];
												var5 = class355.method6671(var4);
												if (null == var5) {
													class67.field843[++class67.field836 - 1] = -1;
												} else {
													class67.field843[++class67.field836 - 1] = var5.field1929;
												}

												return 1;
											} else if (var0 == 6697) {
												class67.field843[++class67.field836 - 1] = class67.field4480.field3069;
												return 1;
											} else if (var0 == 6698) {
												class67.field843[++class67.field836 - 1] = class67.field4480.field3070.method5769();
												return 1;
											} else if (var0 == 6699) {
												class67.field843[++class67.field836 - 1] = class67.field4480.field3071.method5769();
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
				}
			}
		}
	}
}
