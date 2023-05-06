import java.util.concurrent.Future;

public class class19 {
	static class346 field4389;
	static long field3741;
	String field96;
	Future field100;

	class19(Future var1) {
		this.field100 = var1;
	}

	class19(String var1) {
		this.method268(var1);
	}

	void method268(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field96 = var1;
		if (this.field100 != null) {
			this.field100.cancel(true);
			this.field100 = null;
		}

	}

	public final String method269() {
		return this.field96;
	}

	public boolean method267() {
		return null != this.field96 || null == this.field100;
	}

	public final boolean method270() {
		return this.method267() ? true : this.field100.isDone();
	}

	public final class21 method271() {
		if (this.method267()) {
			return new class21(this.field96);
		} else if (!this.method270()) {
			return null;
		} else {
			try {
				return (class21)this.field100.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method268(var3);
				return new class21(var3);
			}
		}
	}

	static void method284() {
		for (class66 var1 = (class66)class66.field828.method6716(); var1 != null; var1 = (class66)class66.field828.method6725()) {
			if (var1.field830 != null) {
				var1.method1835();
			}
		}

	}

	static int method273(int var0, class75 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field776[var4].method6618();
			return 1;
		} else if (var0 == 3904) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field776[var4].field4290;
			return 1;
		} else if (var0 == 3905) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field776[var4].field4291;
			return 1;
		} else if (var0 == 3906) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field776[var4].field4293;
			return 1;
		} else if (var0 == 3907) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field776[var4].field4289;
			return 1;
		} else if (var0 == 3908) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field776[var4].field4294;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = class67.field843[--class67.field836];
				var14 = Client.field776[var4].method6615();
				class67.field843[++class67.field836 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = class67.field843[--class67.field836];
				var14 = Client.field776[var4].method6615();
				class67.field843[++class67.field836 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = class67.field843[--class67.field836];
				var14 = Client.field776[var4].method6615();
				class67.field843[++class67.field836 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = class67.field843[--class67.field836];
				var14 = Client.field776[var4].method6615();
				class67.field843[++class67.field836 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = class67.field843[--class67.field836] == 1;
					if (field4389 != null) {
						field4389.method6549(class346.field4266, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = class67.field843[--class67.field836] == 1;
					if (null != field4389) {
						field4389.method6549(class346.field4267, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					class67.field836 -= 2;
					var12 = 1 == class67.field843[class67.field836];
					boolean var13 = class67.field843[class67.field836 + 1] == 1;
					if (field4389 != null) {
						Client.field513.field486 = var13;
						field4389.method6549(Client.field513, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = class67.field843[--class67.field836] == 1;
					if (null != field4389) {
						field4389.method6549(class346.field4264, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = class67.field843[--class67.field836] == 1;
					if (field4389 != null) {
						field4389.method6549(class346.field4263, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					class67.field843[++class67.field836 - 1] = null == field4389 ? 0 : field4389.field4265.size();
					return 1;
				} else {
					class352 var5;
					if (var0 == 3920) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						class67.field843[++class67.field836 - 1] = var5.field4284;
						return 1;
					} else if (var0 == 3921) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						class67.field842[++class67.field1015 - 1] = var5.method6611();
						return 1;
					} else if (var0 == 3922) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						class67.field842[++class67.field1015 - 1] = var5.method6607();
						return 1;
					} else if (var0 == 3923) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						long var6 = class294.method2575() - field3741 - var5.field4283;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						class67.field842[++class67.field1015 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						class67.field843[++class67.field836 - 1] = var5.field4285.field4293;
						return 1;
					} else if (var0 == 3925) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						class67.field843[++class67.field836 - 1] = var5.field4285.field4291;
						return 1;
					} else if (var0 == 3926) {
						var4 = class67.field843[--class67.field836];
						var5 = (class352)field4389.field4265.get(var4);
						class67.field843[++class67.field836 - 1] = var5.field4285.field4290;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static final int method291(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	static final void method282(int var0, int var1, int var2, int var3) {
		++Client.field601;
		if (Client.field3454.field1171 >> 7 == Client.field735 && Client.field487 == Client.field3454.field1138 >> 7) {
			Client.field735 = 0;
		}

		Client.method2617();
		if (Client.field623 >= 0 && Client.field611[Client.field623] != null) {
			class36.method712(Client.field611[Client.field623], false);
		}

		class210.method4128(true);
		int var5 = class103.field1335;
		int[] var6 = class103.field1341;

		int var7;
		for (var7 = 0; var7 < var5; ++var7) {
			if (Client.field623 != var6[var7] && Client.field664 != var6[var7]) {
				class36.method712(Client.field611[var6[var7]], true);
			}
		}

		class210.method4128(false);
		class143.method3167();
		class420.method7786();
		class37.method719(var0, var1, var2, var3, true);
		var0 = Client.field555;
		var1 = Client.field768;
		var2 = Client.field767;
		var3 = Client.field770;
		class499.method8981(var0, var1, var2 + var0, var1 + var3);
		class219.method272();
		class499.method9042();
		var5 = Client.field595;
		if (Client.field589 / 256 > var5) {
			var5 = Client.field589 / 256;
		}

		if (Client.field754[4] && Client.field777[4] + 128 > var5) {
			var5 = Client.field777[4] + 128;
		}

		int var35 = Client.field758 & 2047;
		var7 = Client.field194;
		int var8 = Client.field1297;
		int var9 = Client.field1675;
		int var10 = Client.method4848(var5);
		int var12 = var3 - 334;
		if (var12 < 0) {
			var12 = 0;
		} else if (var12 > 100) {
			var12 = 100;
		}

		int var13 = Client.field775 + var12 * (Client.field762 - Client.field775) / 100;
		int var11 = var10 * var13 / 256;
		var12 = 2048 - var5 & 2047;
		var13 = 2048 - var35 & 2047;
		int var14 = 0;
		int var15 = 0;
		int var16 = var11;
		int var17;
		int var18;
		int var19;
		if (var12 != 0) {
			var17 = class219.field2512[var12];
			var18 = class219.field2516[var12];
			var19 = var18 * var15 - var17 * var11 >> 16;
			var16 = var17 * var15 + var11 * var18 >> 16;
			var15 = var19;
		}

		if (var13 != 0) {
			var17 = class219.field2512[var13];
			var18 = class219.field2516[var13];
			var19 = var14 * var18 + var17 * var16 >> 16;
			var16 = var16 * var18 - var17 * var14 >> 16;
			var14 = var19;
		}

		if (Client.field746) {
			Client.field3007 = var7 - var14;
			Client.field1345 = var8 - var15;
			Client.field1958 = var9 - var16;
			Client.field1042 = var5;
			Client.field1083 = var35;
		} else {
			Client.field257 = var7 - var14;
			Client.field1867 = var8 - var15;
			Client.field3391 = var9 - var16;
			Client.field2975 = var5;
			Client.field1531 = var35;
		}

		if (1 == Client.field505 && Client.field682 >= 2 && 0 == Client.field602 % 50 && (Client.field3454.field1171 >> 7 != Client.field194 >> 7 || Client.field1675 >> 7 != Client.field3454.field1138 >> 7)) {
			var17 = Client.field3454.field1106;
			var18 = Client.field2850 + (Client.field194 >> 7);
			var19 = Client.field2841 + (Client.field1675 >> 7);
			class289 var20 = class331.method6337(class287.field3180, Client.field753.field1385);
			var20.field3212.method8645(Client.field577);
			var20.field3212.method8698(var18);
			var20.field3212.method8688(var17);
			var20.field3212.method8859(var19);
			Client.field753.method2735(var20);
		}

		if (!Client.field746) {
			var11 = class115.method2869();
		} else {
			if (Client.field112.method2457()) {
				var12 = Client.field231;
			} else {
				var13 = class148.method3196(Client.field257, Client.field3391, Client.field231);
				if (var13 - Client.field1867 < 800 && 0 != (class78.field1006[Client.field231][Client.field257 >> 7][Client.field3391 >> 7] & 4)) {
					var12 = Client.field231;
				} else {
					var12 = 3;
				}
			}

			var11 = var12;
		}

		var12 = Client.field257;
		var13 = Client.field1867;
		var14 = Client.field3391;
		var15 = Client.field2975;
		var16 = Client.field1531;

		for (var17 = 0; var17 < 5; ++var17) {
			if (Client.field754[var17]) {
				var18 = (int)(Math.random() * (double)(Client.field755[var17] * 2 + 1) - (double)Client.field755[var17] + Math.sin((double)Client.field585[var17] * ((double)Client.field632[var17] / 100.0D)) * (double)Client.field777[var17]);
				if (var17 == 0) {
					Client.field257 += var18;
				}

				if (var17 == 1) {
					Client.field1867 += var18;
				}

				if (var17 == 2) {
					Client.field3391 += var18;
				}

				if (var17 == 3) {
					Client.field1531 = Client.field1531 + var18 & 2047;
				}

				if (var17 == 4) {
					Client.field2975 += var18;
					if (Client.field2975 < 128) {
						Client.field2975 = 128;
					}

					if (Client.field2975 > 383) {
						Client.field2975 = 383;
					}
				}
			}
		}

		var17 = class36.field242;
		var18 = class36.field243;
		if (0 != class36.field252) {
			var17 = class36.field250;
			var18 = class36.field251;
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var1 + var3) {
			var19 = var17 - var0;
			int var36 = var18 - var1;
			class233.field2771 = var19;
			class233.field2766 = var36;
			class233.field2767 = true;
			class233.field2765 = 0;
			class233.field2764 = false;
		} else {
			class233.method3187();
		}

		Client.method6316();
		class499.method9012(var0, var1, var2, var3, 0);
		Client.method6316();
		var19 = class219.method2841();
		class219.method5907(Client.field466.field216);
		class219.field2515.field2791 = Client.field582;
		Client.field180.method4385(Client.field257, Client.field1867, Client.field3391, Client.field2975, Client.field1531, var11);
		class219.method5907(false);
		if (Client.field518) {
			class499.method8999();
		}

		class219.field2515.field2791 = var19;
		Client.method6316();
		Client.field180.method4382();
		Client.field590 = 0;
		boolean var37 = false;
		int var21 = -1;
		int var22 = -1;
		int var23 = class103.field1335;
		int[] var24 = class103.field1341;

		int var25;
		for (var25 = 0; var25 < Client.field737 + var23; ++var25) {
			Object var26;
			if (var25 < var23) {
				var26 = Client.field611[var24[var25]];
				if (var24[var25] == Client.field623) {
					var37 = true;
					var21 = var25;
					continue;
				}

				if (Client.field3454 == var26) {
					var22 = var25;
					continue;
				}
			} else {
				var26 = Client.field546[Client.field548[var25 - var23]];
			}

			class34.method506((class91)var26, var25, var0, var1, var2, var3);
		}

		if (Client.field615 && var22 != -1) {
			class34.method506(Client.field3454, var22, var0, var1, var2, var3);
		}

		if (var37) {
			class34.method506(Client.field611[Client.field623], var21, var0, var1, var2, var3);
		}

		for (var25 = 0; var25 < Client.field590; ++var25) {
			int var38 = Client.field592[var25];
			int var27 = Client.field593[var25];
			int var28 = Client.field608[var25];
			int var29 = Client.field594[var25];
			boolean var30 = true;

			while (var30) {
				var30 = false;

				for (int var31 = 0; var31 < var25; ++var31) {
					if (var27 + 2 > Client.field593[var31] - Client.field594[var31] && var27 - var29 < 2 + Client.field593[var31] && var38 - var28 < Client.field608[var31] + Client.field592[var31] && var38 + var28 > Client.field592[var31] - Client.field608[var31] && Client.field593[var31] - Client.field594[var31] < var27) {
						var27 = Client.field593[var31] - Client.field594[var31];
						var30 = true;
					}
				}
			}

			Client.field708 = Client.field592[var25];
			Client.field572 = Client.field593[var25] = var27;
			String var39 = Client.field599[var25];
			if (0 == Client.field626) {
				int var32 = 16776960;
				if (Client.field587[var25] < 6) {
					var32 = Client.field716[Client.field587[var25]];
				}

				if (Client.field587[var25] == 6) {
					var32 = Client.field601 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == Client.field587[var25]) {
					var32 = Client.field601 % 20 < 10 ? 255 : '\uffff';
				}

				if (8 == Client.field587[var25]) {
					var32 = Client.field601 % 20 < 10 ? '뀀' : 8454016;
				}

				int var33;
				if (9 == Client.field587[var25]) {
					var33 = 150 - Client.field567[var25];
					if (var33 < 50) {
						var32 = var33 * 1280 + 16711680;
					} else if (var33 < 100) {
						var32 = 16776960 - (var33 - 50) * 327680;
					} else if (var33 < 150) {
						var32 = 5 * (var33 - 100) + 65280;
					}
				}

				if (10 == Client.field587[var25]) {
					var33 = 150 - Client.field567[var25];
					if (var33 < 50) {
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) {
						var32 = 16711935 - (var33 - 50) * 327680;
					} else if (var33 < 150) {
						var32 = 255 + 327680 * (var33 - 100) - 5 * (var33 - 100);
					}
				}

				if (11 == Client.field587[var25]) {
					var33 = 150 - Client.field567[var25];
					if (var33 < 50) {
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) {
						var32 = 65280 + 327685 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = 16777215 - (var33 - 100) * 327680;
					}
				}

				if (0 == Client.field597[var25]) {
					Client.field1635.method7154(var39, var0 + Client.field708, var1 + Client.field572, var32, 0);
				}

				if (Client.field597[var25] == 1) {
					Client.field1635.method7158(var39, Client.field708 + var0, Client.field572 + var1, var32, 0, Client.field601);
				}

				if (Client.field597[var25] == 2) {
					Client.field1635.method7159(var39, Client.field708 + var0, var1 + Client.field572, var32, 0, Client.field601);
				}

				if (Client.field597[var25] == 3) {
					Client.field1635.method7160(var39, var0 + Client.field708, var1 + Client.field572, var32, 0, Client.field601, 150 - Client.field567[var25]);
				}

				if (4 == Client.field597[var25]) {
					var33 = (150 - Client.field567[var25]) * (Client.field1635.method7145(var39) + 100) / 150;
					class499.method8982(Client.field708 + var0 - 50, var1, var0 + Client.field708 + 50, var3 + var1);
					Client.field1635.method7228(var39, 50 + var0 + Client.field708 - var33, var1 + Client.field572, var32, 0);
					class499.method8981(var0, var1, var0 + var2, var1 + var3);
				}

				if (Client.field597[var25] == 5) {
					var33 = 150 - Client.field567[var25];
					int var34 = 0;
					if (var33 < 25) {
						var34 = var33 - 25;
					} else if (var33 > 125) {
						var34 = var33 - 125;
					}

					class499.method8982(var0, var1 + Client.field572 - Client.field1635.field4439 - 1, var2 + var0, 5 + Client.field572 + var1);
					Client.field1635.method7154(var39, var0 + Client.field708, var1 + Client.field572 + var34, var32, 0);
					class499.method8981(var0, var1, var2 + var0, var3 + var1);
				}
			} else {
				Client.field1635.method7154(var39, Client.field708 + var0, var1 + Client.field572, 16776960, 0);
			}
		}

		Client.method6287(var0, var1);
		((class229)class219.field2515.field2795).method4566(Client.field565);
		class405.method7551();
		Client.field257 = var12;
		Client.field1867 = var13;
		Client.field3391 = var14;
		Client.field2975 = var15;
		Client.field1531 = var16;
		if (Client.field500 && class345.method3632(true, false) == 0) {
			Client.field500 = false;
		}

		if (Client.field500) {
			class499.method9012(var0, var1, var2, var3, 0);
			class260.method5271(class337.field3961, false);
		}

	}
}
