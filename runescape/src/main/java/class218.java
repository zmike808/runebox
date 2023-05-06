import java.io.IOException;

public final class class218 extends class449 {
	boolean field2493;
	boolean field2495;
	boolean field2506;
	class213 field2509;
	class215 field2497;
	class218 field2511;
	class230 field2494;
	class235 field2507;
	class240 field2489;
	class242 field2496;
	class243[] field2500;
	int field2490;
	int field2491;
	int field2492;
	int field2498;
	int field2499;
	int field2502;
	int field2503;
	int field2504;
	int field2505;
	int field2508;
	int field2510;
	int[] field2501;

	class218(int var1, int var2, int var3) {
		this.field2500 = new class243[5];
		this.field2501 = new int[5];
		this.field2502 = 0;
		this.field2492 = this.field2498 = var1;
		this.field2505 = var2;
		this.field2491 = var3;
	}

	public static boolean method4258() {
		long var1 = class294.method2575();
		int var3 = (int)(var1 - class345.field4260);
		class345.field4260 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		class345.field4251 += var3;
		if (class345.field4250 == 0 && 0 == class345.field4245 && 0 == class345.field4257 && 0 == class345.field4243) {
			return true;
		} else if (class345.field4241 == null) {
			return false;
		} else {
			try {
				if (class345.field4251 > 30000) {
					throw new IOException();
				} else {
					class343 var4;
					class489 var5;
					while (class345.field4245 < 200 && class345.field4243 > 0) {
						var4 = (class343)class345.field4242.method8387();
						var5 = new class489(4);
						var5.method8695(1);
						var5.method8702((int)var4.field4745);
						class345.field4241.method7710(var5.field4991, 0, 4);
						class345.field4244.method8382(var4, var4.field4745);
						--class345.field4243;
						++class345.field4245;
					}

					while (class345.field4250 < 200 && class345.field4257 > 0) {
						var4 = (class343)class345.field4246.method6702();
						var5 = new class489(4);
						var5.method8695(0);
						var5.method8702((int)var4.field4745);
						class345.field4241.method7710(var5.field4991, 0, 4);
						var4.method8040();
						class345.field4249.method8382(var4, var4.field4745);
						--class345.field4257;
						++class345.field4250;
					}

					for (int var19 = 0; var19 < 100; ++var19) {
						int var20 = class345.field4241.method7707();
						if (var20 < 0) {
							throw new IOException();
						}

						if (var20 == 0) {
							break;
						}

						class345.field4251 = 0;
						byte var6 = 0;
						if (class345.field973 == null) {
							var6 = 8;
						} else if (0 == class345.field4254) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						int var11;
						byte[] var10000;
						int var10001;
						class489 var23;
						if (var6 > 0) {
							var7 = var6 - class345.field4252.field4989;
							if (var7 > var20) {
								var7 = var20;
							}

							class345.field4241.method7713(class345.field4252.field4991, class345.field4252.field4989, var7);
							if (class345.field4256 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = class345.field4252.field4991;
									var10001 = class345.field4252.field4989 + var8;
									var10000[var10001] ^= class345.field4256;
								}
							}

							var23 = class345.field4252;
							var23.field4989 += var7;
							if (class345.field4252.field4989 < var6) {
								break;
							}

							if (null == class345.field973) {
								class345.field4252.field4989 = 0;
								var8 = class345.field4252.method8658();
								var9 = class345.field4252.method8660();
								int var10 = class345.field4252.method8658();
								var11 = class345.field4252.method8664();
								long var12 = (long)((var8 << 16) + var9);
								class343 var14 = (class343)class345.field4244.method8381(var12);
								class345.field4248 = true;
								if (var14 == null) {
									var14 = (class343)class345.field4249.method8381(var12);
									class345.field4248 = false;
								}

								if (null == var14) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								class345.field973 = var14;
								class345.field4253 = new class489(var15 + var11 + class345.field973.field4218);
								class345.field4253.method8695(var10);
								class345.field4253.method8644(var11);
								class345.field4254 = 8;
								class345.field4252.field4989 = 0;
							} else if (class345.field4254 == 0) {
								if (-1 == class345.field4252.field4991[0]) {
									class345.field4254 = 1;
									class345.field4252.field4989 = 0;
								} else {
									class345.field973 = null;
								}
							}
						} else {
							var7 = class345.field4253.field4991.length - class345.field973.field4218;
							var8 = 512 - class345.field4254;
							if (var8 > var7 - class345.field4253.field4989) {
								var8 = var7 - class345.field4253.field4989;
							}

							if (var8 > var20) {
								var8 = var20;
							}

							class345.field4241.method7713(class345.field4253.field4991, class345.field4253.field4989, var8);
							if (class345.field4256 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = class345.field4253.field4991;
									var10001 = var9 + class345.field4253.field4989;
									var10000[var10001] ^= class345.field4256;
								}
							}

							var23 = class345.field4253;
							var23.field4989 += var8;
							class345.field4254 += var8;
							if (var7 == class345.field4253.field4989) {
								if (class345.field973.field4745 == 16711935L) {
									class345.field929 = class345.field4253;

									for (var9 = 0; var9 < 256; ++var9) {
										class342 var21 = class345.field4240[var9];
										if (var21 != null) {
											class345.field929.field4989 = var9 * 8 + 5;
											if (class345.field929.field4989 >= class345.field929.field4991.length) {
												if (!var21.field4212) {
													throw new RuntimeException("");
												}

												var21.method6417();
											} else {
												var11 = class345.field929.method8664();
												int var22 = class345.field929.method8664();
												var21.method6396(var11, var22);
											}
										}
									}
								} else {
									class345.field4255.reset();
									class345.field4255.update(class345.field4253.field4991, 0, var7);
									var9 = (int)class345.field4255.getValue();
									if (var9 != class345.field973.field4216) {
										try {
											class345.field4241.method7711();
										} catch (Exception var17) {
										}

										++class345.field4262;
										class345.field4241 = null;
										class345.field4256 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									class345.field4262 = 0;
									class345.field4261 = 0;
									class345.field973.field4220.method6397((int)(class345.field973.field4745 & 65535L), class345.field4253.field4991, 16711680L == (class345.field973.field4745 & 16711680L), class345.field4248);
								}

								class345.field973.method8051();
								if (class345.field4248) {
									--class345.field4245;
								} else {
									--class345.field4250;
								}

								class345.field4254 = 0;
								class345.field973 = null;
								class345.field4253 = null;
							} else {
								if (class345.field4254 != 512) {
									break;
								}

								class345.field4254 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var18) {
				try {
					class345.field4241.method7711();
				} catch (Exception var16) {
				}

				++class345.field4261;
				class345.field4241 = null;
				return false;
			}
		}
	}
}
