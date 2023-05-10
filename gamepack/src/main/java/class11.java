import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class class11 {
	boolean field50;
	boolean field52;
	class437 field53;
	int field49;
	final class10 field54;
	final class395 field48;
	final HttpsURLConnection field51;

	public class11(URL var1, class10 var2, boolean var3) throws IOException {
		this(var1, var2, new class395(), var3);
	}

	public class11(URL var1, class10 var2, class395 var3, boolean var4) throws IOException {
		this.field52 = false;
		this.field50 = false;
		this.field49 = 300000;
		if (!var2.method78()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method72());
		} else {
			this.field51 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.field51;
				if (class109.field84 == null) {
					class109.field84 = new class16();
				}

				class16 var6 = class109.field84;
				var5.setSSLSocketFactory(var6);
			}

			this.field54 = var2;
			this.field48 = var3 != null ? var3 : new class395();
		}
	}

	public class395 method85() {
		return this.field48;
	}

	public void method98(class437 var1) {
		if (!this.field52) {
			if (var1 == null) {
				this.field48.method7396("Content-Type");
				this.field53 = null;
			} else {
				this.field53 = var1;
				if (this.field53.method8004() != null) {
					this.field48.method7371(this.field53.method8004());
				} else {
					this.field48.method7372();
				}

			}
		}
	}

	void method91(byte var1) throws ProtocolException {
		if (this.field52) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}
		} else {
			this.field51.setRequestMethod(this.field54.method72());
			this.field48.method7364(this.field51);
			if (this.field54.method73() && null != this.field53) {
				label48: {
					if (var1 <= -1) {
						throw new IllegalStateException();
					}

					this.field51.setDoOutput(true);
					ByteArrayOutputStream var2 = new ByteArrayOutputStream();

					try {
						var2.write(this.field53.method8002());
						var2.writeTo(this.field51.getOutputStream());
					} catch (IOException var8) {
						var8.printStackTrace();

						try {
							var2.close();
						} catch (IOException var6) {
							var6.printStackTrace();
						}
						break label48;
					}

					try {
						var2.close();
					} catch (IOException var7) {
						var7.printStackTrace();
					}
				}
			}

			this.field51.setConnectTimeout(this.field49);
			this.field51.setInstanceFollowRedirects(this.field50);
			this.field52 = true;
		}
	}

	boolean method92() throws IOException {
		if (!this.field52) {
			this.method91((byte)4);
		}

		this.field51.connect();
		return this.field51.getResponseCode() == -1;
	}

	class21 method88() {
		try {
			if (!this.field52 || this.field51.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var7) {
			this.field51.disconnect();
			return new class21("Error decoding REST response code: " + var7.getMessage());
		}

		class21 var2;
		try {
			var2 = new class21(this.field51);
		} catch (IOException var6) {
			class21 var4 = new class21("Error decoding REST response: " + var6.getMessage());
			this.field51.disconnect();
			return var4;
		}

		this.field51.disconnect();
		return var2;
	}

	static final void method99(class223 var0, class209[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((class78.field1006[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if (2 == (class78.field1006[1][var4][var5] & 2)) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							var1[var6].method4095(var4, var5);
						}
					}
				}
			}
		}

		class78.field1012 += (int)(Math.random() * 5.0D) - 2;
		if (class78.field1012 < -8) {
			class78.field1012 = -8;
		}

		if (class78.field1012 > 8) {
			class78.field1012 = 8;
		}

		class78.field1013 += (int)(Math.random() * 5.0D) - 2;
		if (class78.field1013 < -16) {
			class78.field1013 = -16;
		}

		if (class78.field1013 > 16) {
			class78.field1013 = 16;
		}

		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		for (var3 = 0; var3 < 4; ++var3) {
			byte[][] var46 = class78.field995[var3];
			boolean var47 = true;
			boolean var48 = true;
			boolean var7 = true;
			boolean var8 = true;
			boolean var9 = true;
			var10 = (int)Math.sqrt(5100.0D);
			var11 = var10 * 768 >> 8;

			int var20;
			int var21;
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var14 = class78.field1002[var3][var13 + 1][var12] - class78.field1002[var3][var13 - 1][var12];
					var15 = class78.field1002[var3][var13][var12 + 1] - class78.field1002[var3][var13][var12 - 1];
					var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = 96 + (var19 * -50 + var18 * -10 + var17 * -50) / var11;
					var21 = (var46[var13][var12 + 1] >> 3) + (var46[var13][var12 - 1] >> 2) + (var46[var13 + 1][var12] >> 3) + (var46[var13 - 1][var12] >> 2) + (var46[var13][var12] >> 1);
					class78.field997[var13][var12] = var20 - var21;
				}
			}

			for (var12 = 0; var12 < 104; ++var12) {
				class78.field1847[var12] = 0;
				class78.field1003[var12] = 0;
				class78.field3093[var12] = 0;
				class78.field1417[var12] = 0;
				class78.field177[var12] = 0;
			}

			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						var15 = (int)class296.method2095(15);
						var16 = class78.field1977[var3][var14][var13] & var15;
						if (var16 > 0) {
							var18 = var16 - 1;
							class195 var55 = (class195)class195.field2094.method5461((long)var18);
							class195 var52;
							if (null != var55) {
								var52 = var55;
							} else {
								byte[] var56 = class78.field2092.method6468(1, var18);
								var55 = new class195();
								if (null != var56) {
									var55.method3732(new class489(var56), var18);
								}

								var55.method3722();
								class195.field2094.method5463(var55, (long)var18);
								var52 = var55;
							}

							var10000 = class78.field1847;
							var10000[var13] += var52.field2091;
							var10000 = class78.field1003;
							var10000[var13] += var52.field2093;
							var10000 = class78.field3093;
							var10000[var13] += var52.field2096;
							var10000 = class78.field1417;
							var10000[var13] += var52.field2095;
							var10002 = class78.field177[var13]++;
						}
					}

					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						var16 = (int)class296.method2095(15);
						var17 = class78.field1977[var3][var15][var13] & var16;
						if (var17 > 0) {
							var19 = var17 - 1;
							class195 var57 = (class195)class195.field2094.method5461((long)var19);
							class195 var54;
							if (var57 != null) {
								var54 = var57;
							} else {
								byte[] var58 = class78.field2092.method6468(1, var19);
								var57 = new class195();
								if (var58 != null) {
									var57.method3732(new class489(var58), var19);
								}

								var57.method3722();
								class195.field2094.method5463(var57, (long)var19);
								var54 = var57;
							}

							var10000 = class78.field1847;
							var10000[var13] -= var54.field2091;
							var10000 = class78.field1003;
							var10000[var13] -= var54.field2093;
							var10000 = class78.field3093;
							var10000[var13] -= var54.field2096;
							var10000 = class78.field1417;
							var10000[var13] -= var54.field2095;
							var10002 = class78.field177[var13]--;
						}
					}
				}

				if (var12 >= 1 && var12 < 103) {
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;
					var17 = 0;

					for (var18 = -5; var18 < 109; ++var18) {
						var19 = var18 + 5;
						if (var19 >= 0 && var19 < 104) {
							var13 += class78.field1847[var19];
							var14 += class78.field1003[var19];
							var15 += class78.field3093[var19];
							var16 += class78.field1417[var19];
							var17 += class78.field177[var19];
						}

						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class78.field1847[var20];
							var14 -= class78.field1003[var20];
							var15 -= class78.field3093[var20];
							var16 -= class78.field1417[var20];
							var17 -= class78.field177[var20];
						}

						if (var18 >= 1 && var18 < 103 && (!Client.field493 || (class78.field1006[0][var12][var18] & 2) != 0 || 0 == (class78.field1006[var3][var12][var18] & 16))) {
							if (var3 < class78.field999) {
								class78.field999 = var3;
							}

							var21 = (int)class296.method2095(15);
							int var22 = class78.field1977[var3][var12][var18] & var21;
							int var23 = class78.field998[var3][var12][var18] & var21;
							if (var22 > 0 || var23 > 0) {
								int var24 = class78.field1002[var3][var12][var18];
								int var25 = class78.field1002[var3][var12 + 1][var18];
								int var26 = class78.field1002[var3][var12 + 1][var18 + 1];
								int var27 = class78.field1002[var3][var12][var18 + 1];
								int var28 = class78.field997[var12][var18];
								int var29 = class78.field997[var12 + 1][var18];
								int var30 = class78.field997[var12 + 1][var18 + 1];
								int var31 = class78.field997[var12][var18 + 1];
								int var32 = -1;
								int var33 = -1;
								int var34;
								int var35;
								int var36;
								if (var22 > 0) {
									var34 = var13 * 256 / var16;
									var35 = var14 / var17;
									var36 = var15 / var17;
									var32 = class332.method6339(var34, var35, var36);
									var34 = var34 + class78.field1012 & 255;
									var36 += class78.field1013;
									if (var36 < 0) {
										var36 = 0;
									} else if (var36 > 255) {
										var36 = 255;
									}

									var33 = class332.method6339(var34, var35, var36);
								}

								class203 var37;
								if (var3 > 0) {
									boolean var59 = true;
									if (var22 == 0 && 0 != class78.field1009[var3][var12][var18]) {
										var59 = false;
									}

									if (var23 > 0) {
										var36 = var23 - 1;
										var37 = (class203)class203.field2271.method5461((long)var36);
										class203 var60;
										if (var37 != null) {
											var60 = var37;
										} else {
											byte[] var38 = class78.field2273.method6468(4, var36);
											var37 = new class203();
											if (var38 != null) {
												var37.method3976(new class489(var38), var36);
											}

											var37.method3975();
											class203.field2271.method5463(var37, (long)var36);
											var60 = var37;
										}

										if (!var60.field2275) {
											var59 = false;
										}
									}

									if (var59 && var24 == var25 && var24 == var26 && var27 == var24) {
										var10000 = class78.field1783[var3][var12];
										var10000[var18] |= 2340;
									}
								}

								var34 = 0;
								if (var33 != -1) {
									var34 = class219.field2517[method101(var33, 96)];
								}

								if (var23 == 0) {
									var0.method4373(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, method101(var32, var28), method101(var32, var29), method101(var32, var30), method101(var32, var31), 0, 0, 0, 0, var34, 0);
								} else {
									var35 = class78.field1009[var3][var12][var18] + 1;
									byte var61 = class78.field1000[var3][var12][var18];
									int var62 = var23 - 1;
									class203 var39 = (class203)class203.field2271.method5461((long)var62);
									if (var39 != null) {
										var37 = var39;
									} else {
										byte[] var40 = class78.field2273.method6468(4, var62);
										var39 = new class203();
										if (var40 != null) {
											var39.method3976(new class489(var40), var62);
										}

										var39.method3975();
										class203.field2271.method5463(var39, (long)var62);
										var37 = var39;
									}

									int var63 = var37.field2281;
									int var41;
									int var42;
									int var43;
									int var44;
									if (var63 >= 0) {
										var42 = class219.field2515.field2795.method4822(var63);
										var41 = -1;
									} else if (16711935 == var37.field2283) {
										var41 = -2;
										var63 = -1;
										var42 = -2;
									} else {
										var41 = class332.method6339(var37.field2277, var37.field2278, var37.field2279);
										var43 = class78.field1012 + var37.field2277 & 255;
										var44 = var37.field2279 + class78.field1013;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var42 = class332.method6339(var43, var37.field2278, var44);
									}

									var43 = 0;
									if (var42 != -2) {
										var43 = class219.field2517[class479.method8517(var42, 96)];
									}

									if (-1 != var37.field2272) {
										var44 = var37.field2274 + class78.field1012 & 255;
										int var45 = class78.field1013 + var37.field2282;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var42 = class332.method6339(var44, var37.field2285, var45);
										var43 = class219.field2517[class479.method8517(var42, 96)];
									}

									var0.method4373(var3, var12, var18, var35, var61, var63, var24, var25, var26, var27, method101(var32, var28), method101(var32, var29), method101(var32, var30), method101(var32, var31), class479.method8517(var41, var28), class479.method8517(var41, var29), class479.method8517(var41, var30), class479.method8517(var41, var31), var34, var43);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method4372(var3, var13, var12, class78.method846(var3, var13, var12));
				}
			}

			class78.field1977[var3] = (short[][])null;
			class78.field998[var3] = (short[][])null;
			class78.field1009[var3] = (byte[][])null;
			class78.field1000[var3] = (byte[][])null;
			class78.field995[var3] = (byte[][])null;
		}

		var0.method4436(-50, -10, -50);

		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if (2 == (class78.field1006[1][var3][var4] & 2)) {
					var0.method4486(var3, var4);
				}
			}
		}

		var3 = 1;
		var4 = 2;
		var5 = 4;

		for (var6 = 0; var6 < 4; ++var6) {
			if (var6 > 0) {
				var3 <<= 3;
				var4 <<= 3;
				var5 <<= 3;
			}

			for (int var49 = 0; var49 <= var6; ++var49) {
				for (int var50 = 0; var50 <= 104; ++var50) {
					for (int var51 = 0; var51 <= 104; ++var51) {
						short var53;
						if (0 != (class78.field1783[var49][var51][var50] & var3)) {
							var10 = var50;
							var11 = var50;
							var12 = var49;

							for (var13 = var49; var10 > 0 && (class78.field1783[var49][var51][var10 - 1] & var3) != 0; --var10) {
							}

							while (var11 < 104 && (class78.field1783[var49][var51][var11 + 1] & var3) != 0) {
								++var11;
							}

							label366:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if (0 == (class78.field1783[var12 - 1][var51][var14] & var3)) {
										break label366;
									}
								}

								--var12;
							}

							label355:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if (0 == (class78.field1783[var13 + 1][var51][var14] & var3)) {
										break label355;
									}
								}

								++var13;
							}

							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var53 = 240;
								var16 = class78.field1002[var13][var51][var10] - var53;
								var17 = class78.field1002[var12][var51][var10];
								class223.method4371(var6, 1, var51 * 128, var51 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class78.field1783[var18][var51];
										var10000[var19] &= ~var3;
									}
								}
							}
						}

						if ((class78.field1783[var49][var51][var50] & var4) != 0) {
							var10 = var51;
							var11 = var51;
							var12 = var49;

							for (var13 = var49; var10 > 0 && (class78.field1783[var49][var10 - 1][var50] & var4) != 0; --var10) {
							}

							while (var11 < 104 && 0 != (class78.field1783[var49][var11 + 1][var50] & var4)) {
								++var11;
							}

							label419:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if (0 == (class78.field1783[var12 - 1][var14][var50] & var4)) {
										break label419;
									}
								}

								--var12;
							}

							label408:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if (0 == (class78.field1783[var13 + 1][var14][var50] & var4)) {
										break label408;
									}
								}

								++var13;
							}

							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var53 = 240;
								var16 = class78.field1002[var13][var10][var50] - var53;
								var17 = class78.field1002[var12][var10][var50];
								class223.method4371(var6, 2, var10 * 128, var11 * 128 + 128, var50 * 128, var50 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class78.field1783[var18][var19];
										var10000[var50] &= ~var4;
									}
								}
							}
						}

						if ((class78.field1783[var49][var51][var50] & var5) != 0) {
							var10 = var51;
							var11 = var51;
							var12 = var50;

							for (var13 = var50; var12 > 0 && (class78.field1783[var49][var51][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < 104 && 0 != (class78.field1783[var49][var51][var13 + 1] & var5)) {
								++var13;
							}

							label472:
							while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class78.field1783[var49][var10 - 1][var14] & var5) == 0) {
										break label472;
									}
								}

								--var10;
							}

							label461:
							while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class78.field1783[var49][var11 + 1][var14] & var5) == 0) {
										break label461;
									}
								}

								++var11;
							}

							if ((var13 - var12 + 1) * (1 + (var11 - var10)) >= 4) {
								var14 = class78.field1002[var49][var10][var12];
								class223.method4371(var6, 4, var10 * 128, 128 + var11 * 128, var12 * 128, 128 + var13 * 128, var14, var14);

								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class78.field1783[var49][var15];
										var10000[var16] &= ~var5;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	static final int method101(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
