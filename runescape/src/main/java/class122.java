public class class122 {
	public static final float field1463;
	public static final float field1464;
	static float[] field1466;
	static float[] field1469;

	static {
		field1463 = Math.ulp(1.0F);
		field1464 = field1463 * 2.0F;
		field1469 = new float[4];
		field1466 = new float[5];
	}

	static float method192(class126 var0, float var1) {
		if (null == var0) {
			return 0.0F;
		} else {
			float var3 = var1 - var0.field1514;
			return var0.field1519 + var3 * (var0.field1530 + var3 * (var0.field1516 * var3 + var0.field1517));
		}
	}

	static void method2780(float[] var0) {
		if (field1463 + var0[0] < 1.3333334F) {
			float var2 = var0[0] - 2.0F;
			float var3 = var0[0] - 1.0F;
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
			float var5 = 0.5F * (-var2 + var4);
			if (field1463 + var0[1] > var5) {
				var0[1] = var5 - field1463;
			} else {
				var5 = 0.5F * (-var2 - var4);
				if (var0[1] < field1463 + var5) {
					var0[1] = var5 + field1463;
				}
			}
		} else {
			var0[0] = 1.3333334F - field1463;
			var0[1] = 0.33333334F - field1463;
		}

	}

	static void method3272(float var0, float var1, float var2, float var3, class126 var4) {
		float var6 = var1 - var0;
		float var7 = var2 - var1;
		float var8 = var3 - var2;
		float var9 = var7 - var6;
		var4.field1519 = var8 - var7 - var9;
		var4.field1530 = var9 + var9 + var9;
		var4.field1517 = var6 + var6 + var6;
		var4.field1516 = var0;
	}

	static int method2914(int var0, class75 var1, boolean var2, byte var3) {
		class317 var4;
		if (var0 >= 2000) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var0 -= 1000;
			var4 = class166.method3349(class67.field843[--class67.field836]);
		} else {
			class317 var10000;
			if (var2) {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				var10000 = class67.field329;
			} else {
				var10000 = class67.field6;
			}

			var4 = var10000;
		}

		String var5 = class67.field842[--class67.field1015];
		int[] var6 = null;
		if (var5.length() > 0) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			if (var5.charAt(var5.length() - 1) == 'Y') {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				int var7 = class67.field843[--class67.field836];
				if (var7 > 0) {
					for (var6 = new int[var7]; var7-- > 0; var6[var7] = class67.field843[--class67.field836]) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}
					}
				}

				var5 = var5.substring(0, var5.length() - 1);
			}
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				var10[var8] = class67.field842[--class67.field1015];
			} else {
				var10[var8] = new Integer(class67.field843[--class67.field836]);
			}
		}

		var8 = class67.field843[--class67.field836];
		if (var8 != -1) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == 1400) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3694 = var10;
		} else if (var0 == 1401) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3662 = var10;
		} else if (var0 == 1402) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3633 = var10;
		} else if (var0 == 1403) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3687 = var10;
		} else if (var0 == 1404) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3665 = var10;
		} else if (var0 == 1405) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3666 = var10;
		} else if (var0 == 1406) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3669 = var10;
		} else if (var0 == 1407) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3670 = var10;
			var4.field3584 = var6;
		} else if (var0 == 1408) {
			var4.field3676 = var10;
		} else if (var0 == 1409) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3677 = var10;
		} else if (var0 == 1410) {
			var4.field3667 = var10;
		} else if (var0 == 1411) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3660 = var10;
		} else if (var0 == 1412) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3664 = var10;
		} else if (var0 == 1414) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3615 = var10;
			var4.field3673 = var6;
		} else if (var0 == 1415) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3674 = var10;
			var4.field3675 = var6;
		} else if (var0 == 1416) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3625 = var10;
		} else if (var0 == 1417) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3679 = var10;
		} else if (var0 == 1418) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3680 = var10;
		} else if (var0 == 1419) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3681 = var10;
		} else if (var0 == 1420) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3692 = var10;
		} else if (var0 == 1421) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3623 = var10;
		} else if (var0 == 1422) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3688 = var10;
		} else if (var0 == 1423) {
			var4.field3689 = var10;
		} else if (var0 == 1424) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3690 = var10;
		} else if (var0 == 1425) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3645 = var10;
		} else if (var0 == 1426) {
			var4.field3693 = var10;
		} else if (var0 == 1427) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3691 = var10;
		} else if (var0 == 1428) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3638 = var10;
		} else if (var0 == 1429) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3567 = var10;
		} else if (var0 == 1430) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3682 = var10;
		} else if (var0 == 1431) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3583 = var10;
		} else if (var0 == 1434) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3654 = var10;
		} else if (var0 == 1435) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			var4.field3678 = var10;
		} else {
			label419: {
				if (var0 >= 1436) {
					if (var3 != -1) {
						throw new IllegalStateException();
					}

					if (var0 <= 1439) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}

						class313 var9 = var4.method6155();
						if (null != var9) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							if (var0 == 1436) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								var9.field3501 = var10;
							} else if (var0 == 1437) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								var9.field3506 = var10;
							} else if (var0 == 1438) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								var9.field3505 = var10;
							} else if (var0 == 1439) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								var9.field3504 = var10;
							}
						}
						break label419;
					}
				}

				return 2;
			}
		}

		var4.field3624 = true;
		return 1;
	}

	static void method2930() {
		Client.field753.method2742();
		Client.field753.field1386.field4989 = 0;
		Client.field753.field1382 = null;
		Client.field753.field1392 = null;
		Client.field753.field1393 = null;
		Client.field753.field1387 = null;
		Client.field753.field1388 = 0;
		Client.field753.field1390 = 0;
		Client.field545 = 0;
		Client.field633 = 0;
		Client.field669 = false;
		Client.field653 = 0;
		Client.field735 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			Client.field611[var1] = null;
		}

		Client.field3454 = null;

		for (var1 = 0; var1 < Client.field546.length; ++var1) {
			class96 var2 = Client.field546[var1];
			if (var2 != null) {
				var2.field1160 = -1;
				var2.field1172 = false;
			}
		}

		class81.field1022 = new class465(32);
		class139.method3145(30);

		for (var1 = 0; var1 < 100; ++var1) {
			Client.field706[var1] = true;
		}

		Client.method12();
	}

	static final void method2927(int var0, int var1) {
		class363 var3 = Client.field624[Client.field231][var0][var1];
		if (var3 == null) {
			Client.field180.method4463(Client.field231, var0, var1);
		} else {
			long var4 = -99999999L;
			class100 var6 = null;

			class100 var7;
			for (var7 = (class100)var3.method6716(); var7 != null; var7 = (class100)var3.method6725()) {
				class202 var8 = class92.method2352(var7.field1317);
				long var9 = (long)var8.field2211;
				if (1 == var8.field2236) {
					var9 *= var7.field1313 < Integer.MAX_VALUE ? (long)(1 + var7.field1313) : (long)var7.field1313;
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (null == var6) {
				Client.field180.method4463(Client.field231, var0, var1);
			} else {
				var3.method6712(var6);
				class100 var12 = null;
				class100 var13 = null;

				for (var7 = (class100)var3.method6716(); null != var7; var7 = (class100)var3.method6725()) {
					if (var6.field1317 != var7.field1317) {
						if (var12 == null) {
							var12 = var7;
						}

						if (var12.field1317 != var7.field1317 && var13 == null) {
							var13 = var7;
						}
					}
				}

				long var10 = class233.method4549(var0, var1, 3, false, 0);
				Client.field180.method4472(Client.field231, var0, var1, class148.method3196(64 + var0 * 128, 64 + var1 * 128, Client.field231), var6, var10, var12, var13);
			}
		}
	}

	static String method2916(String var0, class317 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					String var5 = var0.substring(0, var4);
					int var7 = class80.method2174(var1, var3 - 1);
					String var6;
					if (var7 < 999999999) {
						var6 = Integer.toString(var7);
					} else {
						var6 = "*";
					}

					var0 = var5 + var6 + var0.substring(var4 + 2);
				}
			}
		}

		return var0;
	}
}
