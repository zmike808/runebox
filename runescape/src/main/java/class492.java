public final class class492 {
	static class491 field5041;
	static int[] field2342;

	static {
		field5041 = new class491();
	}

	public static int method8932(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		class491 var5;
		synchronized(var5 = field5041){}
		field5041.field5028 = var2;
		field5041.field5009 = var4;
		field5041.field5008 = var0;
		field5041.field5016 = 0;
		field5041.field5010 = var1;
		field5041.field5015 = 0;
		field5041.field5026 = 0;
		field5041.field5007 = 0;
		field5041.field5011 = 0;
		method8941(field5041);
		var1 -= field5041.field5010;
		field5041.field5028 = null;
		field5041.field5008 = null;
		return var1;
	}

	static void method8920(class491 var0) {
		byte var2 = var0.field5012;
		int var3 = var0.field5013;
		int var4 = var0.field5021;
		int var5 = var0.field5019;
		int[] var6 = field2342;
		int var7 = var0.field5018;
		byte[] var8 = var0.field5008;
		int var9 = var0.field5016;
		int var10 = var0.field5010;
		int var12 = var0.field5036 + 1;

		label61:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label61;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label61;
						}

						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}

					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						++var4;
						if (var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								++var4;
								if (var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										++var4;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										++var4;
									}
								}
							}
						}
						continue label61;
					}

					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.field5011;
		var0.field5011 += var10 - var10;
		if (var0.field5011 < var13) {
		}

		var0.field5012 = var2;
		var0.field5013 = var3;
		var0.field5021 = var4;
		var0.field5019 = var5;
		field2342 = var6;
		var0.field5018 = var7;
		var0.field5008 = var8;
		var0.field5016 = var9;
		var0.field5010 = var10;
	}

	static void method8941(class491 var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.field5002 = -240280401;
		if (field2342 == null) {
			field2342 = new int[var0.field5002 * -2133275808];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method8922(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8922(var0);
				var1 = method8938(var0);
				if (var1 != 0) {
				}

				var0.field5017 = 0;
				var1 = method8922(var0);
				var0.field5017 = var0.field5017 << 8 | var1 & 255;
				var1 = method8922(var0);
				var0.field5017 = var0.field5017 << 8 | var1 & 255;
				var1 = method8922(var0);
				var0.field5017 = var0.field5017 << 8 | var1 & 255;

				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method8938(var0);
					if (var1 == 1) {
						var0.field5025[var35] = true;
					} else {
						var0.field5025[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; ++var35) {
					var0.field5024[var35] = false;
				}

				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field5025[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method8938(var0);
							if (var1 == 1) {
								var0.field5024[var35 * 16 + var36] = true;
							}
						}
					}
				}

				method8924(var0);
				int var38 = var0.field5023 + 2;
				int var39 = method8931(3, var0);
				int var40 = method8931(15, var0);

				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;

					while (true) {
						var1 = method8938(var0);
						if (var1 == 0) {
							var0.field5031[var35] = (byte)var36;
							break;
						}

						++var36;
					}
				}

				byte[] var27 = new byte[6];

				byte var29;
				for (var29 = 0; var29 < var39; var27[var29] = var29++) {
				}

				for (var35 = 0; var35 < var40; ++var35) {
					var29 = var0.field5031[var35];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field5029[var35] = var28;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var49 = method8931(5, var0);

					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method8938(var0);
							if (var1 == 0) {
								var0.field5005[var37][var35] = (byte)var49;
								break;
							}

							var1 = method8938(var0);
							if (var1 == 0) {
								++var49;
							} else {
								--var49;
							}
						}
					}
				}

				for (var37 = 0; var37 < var39; ++var37) {
					byte var2 = 32;
					byte var3 = 0;

					for (var35 = 0; var35 < var38; ++var35) {
						if (var0.field5005[var37][var35] > var3) {
							var3 = var0.field5005[var37][var35];
						}

						if (var0.field5005[var37][var35] < var2) {
							var2 = var0.field5005[var37][var35];
						}
					}

					method8925(var0.field5032[var37], var0.field5033[var37], var0.field5034[var37], var0.field5005[var37], var2, var3, var38);
					var0.field5035[var37] = var2;
				}

				int var41 = var0.field5023 + 1;
				int var42 = -1;
				byte var43 = 0;

				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field5020[var35] = 0;
				}

				int var56 = 4095;

				int var54;
				int var55;
				for (var54 = 15; var54 >= 0; --var54) {
					for (var55 = 15; var55 >= 0; --var55) {
						var0.field5027[var56] = (byte)(var54 * 16 + var55);
						--var56;
					}

					var0.field5014[var54] = var56 + 1;
				}

				int var46 = 0;
				byte var53;
				if (var43 == 0) {
					++var42;
					var43 = 50;
					var53 = var0.field5029[var42];
					var22 = var0.field5035[var53];
					var23 = var0.field5032[var53];
					var25 = var0.field5034[var53];
					var24 = var0.field5033[var53];
				}

				int var44 = var43 - 1;
				int var50 = var22;

				int var51;
				byte var52;
				for (var51 = method8931(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
					++var50;
					var52 = method8938(var0);
				}

				int var45 = var25[var51 - var24[var50]];

				while (true) {
					int[] var10000;
					int var10002;
					while (var45 != var41) {
						if (var45 != 0 && var45 != 1) {
							int var33 = var45 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field5014[0];

								for (var1 = var0.field5027[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field5027[var34] = var0.field5027[var34 - 1];
									var0.field5027[var34 - 1] = var0.field5027[var34 - 2];
									var0.field5027[var34 - 2] = var0.field5027[var34 - 3];
									var0.field5027[var34 - 3] = var0.field5027[var34 - 4];
								}

								while (var33 > 0) {
									var0.field5027[var30 + var33] = var0.field5027[var30 + var33 - 1];
									--var33;
								}

								var0.field5027[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field5014[var31] + var32;

								for (var1 = var0.field5027[var30]; var30 > var0.field5014[var31]; --var30) {
									var0.field5027[var30] = var0.field5027[var30 - 1];
								}

								for (var10002 = var0.field5014[var31]++; var31 > 0; --var31) {
									var10002 = var0.field5014[var31]--;
									var0.field5027[var0.field5014[var31]] = var0.field5027[var0.field5014[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field5014[0]--;
								var0.field5027[var0.field5014[0]] = var1;
								if (var0.field5014[0] == 0) {
									var56 = 4095;

									for (var54 = 15; var54 >= 0; --var54) {
										for (var55 = 15; var55 >= 0; --var55) {
											var0.field5027[var56] = var0.field5027[var0.field5014[var54] + var55];
											--var56;
										}

										var0.field5014[var54] = var56 + 1;
									}
								}
							}

							var10002 = var0.field5020[var0.field5004[var1 & 255] & 255]++;
							field2342[var46] = var0.field5004[var1 & 255] & 255;
							++var46;
							if (var44 == 0) {
								++var42;
								var44 = 50;
								var53 = var0.field5029[var42];
								var22 = var0.field5035[var53];
								var23 = var0.field5032[var53];
								var25 = var0.field5034[var53];
								var24 = var0.field5033[var53];
							}

							--var44;
							var50 = var22;

							for (var51 = method8931(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
								++var50;
								var52 = method8938(var0);
							}

							var45 = var25[var51 - var24[var50]];
						} else {
							int var47 = -1;
							int var48 = 1;

							do {
								if (var45 == 0) {
									var47 += var48;
								} else if (var45 == 1) {
									var47 += var48 * 2;
								}

								var48 *= 2;
								if (var44 == 0) {
									++var42;
									var44 = 50;
									var53 = var0.field5029[var42];
									var22 = var0.field5035[var53];
									var23 = var0.field5032[var53];
									var25 = var0.field5034[var53];
									var24 = var0.field5033[var53];
								}

								--var44;
								var50 = var22;

								for (var51 = method8931(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
									++var50;
									var52 = method8938(var0);
								}

								var45 = var25[var51 - var24[var50]];
							} while(var45 == 0 || var45 == 1);

							++var47;
							var1 = var0.field5004[var0.field5027[var0.field5014[0]] & 255];
							var10000 = var0.field5020;

							for (var10000[var1 & 255] += var47; var47 > 0; --var47) {
								field2342[var46] = var1 & 255;
								++var46;
							}
						}
					}

					var0.field5013 = 0;
					var0.field5012 = 0;
					var0.field5022[0] = 0;

					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field5022[var35] = var0.field5020[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field5022;
						var10000[var35] += var0.field5022[var35 - 1];
					}

					for (var35 = 0; var35 < var46; ++var35) {
						var1 = (byte)(field2342[var35] & 255);
						var10000 = field2342;
						int var10001 = var0.field5022[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field5022[var1 & 255]++;
					}

					var0.field5018 = field2342[var0.field5017] >> 8;
					var0.field5021 = 0;
					var0.field5018 = field2342[var0.field5018];
					var0.field5019 = (byte)(var0.field5018 & 255);
					var0.field5018 >>= 8;
					++var0.field5021;
					var0.field5036 = var46;
					method8920(var0);
					if (var0.field5021 == var0.field5036 + 1 && var0.field5013 == 0) {
						var26 = true;
						break;
					}

					var26 = false;
					break;
				}
			}

			return;
		}
	}

	static byte method8922(class491 var0) {
		return (byte)method8931(8, var0);
	}

	static byte method8938(class491 var0) {
		return (byte)method8931(1, var0);
	}

	static int method8931(int var0, class491 var1) {
		while (var1.field5015 < var0) {
			var1.field5026 = var1.field5026 << 8 | var1.field5028[var1.field5009] & 255;
			var1.field5015 += 8;
			++var1.field5009;
			++var1.field5007;
			if (var1.field5007 == 0) {
			}
		}

		int var2 = var1.field5026 >> var1.field5015 - var0 & (1 << var0) - 1;
		var1.field5015 -= var0;
		return var2;
	}

	static void method8924(class491 var0) {
		var0.field5023 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field5024[var1]) {
				var0.field5004[var0.field5023] = (byte)var1;
				++var0.field5023;
			}
		}

	}

	static void method8925(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}
}
