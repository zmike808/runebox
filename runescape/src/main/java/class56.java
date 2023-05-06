public class class56 {
	int field416;
	int field418;
	int[][] field422;

	public class56(int var1, int var2) {
		if (var1 != var2) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.field418 = var1;
			this.field416 = var2;
			this.field422 = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.field422[var7];
				double var9 = (double)var7 / (double)var1 + 6.0D;
				int var11 = (int)Math.floor(var9 - 7.0D + 1.0D);
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D);
				}
			}

		}
	}

	byte[] method1126(byte[] var1) {
		if (this.field422 != null) {
			int var3 = (int)((long)this.field416 * (long)var1.length / (long)this.field418) + 14;
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;

			int var7;
			for (var7 = 0; var7 < var1.length; ++var7) {
				byte var8 = var1[var7];
				int[] var9 = this.field422[var6];

				int var10;
				for (var10 = 0; var10 < 14; ++var10) {
					var4[var5 + var10] += var9[var10] * var8;
				}

				var6 += this.field416;
				var10 = var6 / this.field418;
				var5 += var10;
				var6 -= var10 * this.field418;
			}

			var1 = new byte[var3];

			for (var7 = 0; var7 < var3; ++var7) {
				int var11 = 32768 + var4[var7] >> 16;
				if (var11 < -128) {
					var1[var7] = -128;
				} else if (var11 > 127) {
					var1[var7] = 127;
				} else {
					var1[var7] = (byte)var11;
				}
			}
		}

		return var1;
	}

	int method1127(int var1) {
		if (this.field422 != null) {
			var1 = (int)((long)var1 * (long)this.field416 / (long)this.field418);
		}

		return var1;
	}

	int method1135(int var1) {
		if (this.field422 != null) {
			var1 = (int)((long)this.field416 * (long)var1 / (long)this.field418) + 6;
		}

		return var1;
	}

	static void method1128(class379 var0, class379 var1) {
		int var5;
		int var6;
		if (null == class72.field4945) {
			class342 var4 = Client.field4788;
			class503[] var3;
			if (!var4.method6466("sl_back", "")) {
				var3 = null;
			} else {
				var5 = var4.method6464("sl_back");
				var6 = var4.method6450(var5, "");
				var3 = class115.method2860(var4, var5, var6);
			}

			class72.field4945 = var3;
		}

		if (null == class72.field88) {
			class72.field88 = class504.method6113(Client.field4788, "sl_flags", "");
		}

		if (class72.field120 == null) {
			class72.field120 = class504.method6113(Client.field4788, "sl_arrows", "");
		}

		if (class72.field803 == null) {
			class72.field803 = class504.method6113(Client.field4788, "sl_stars", "");
		}

		if (class72.field4189 == null) {
			class72.field4189 = class297.method5550(Client.field4788, "leftarrow", "");
		}

		if (class72.field71 == null) {
			class72.field71 = class297.method5550(Client.field4788, "rightarrow", "");
		}

		class499.method9012(class72.field907, 23, 765, 480, 0);
		class499.method8990(class72.field907, 0, 125, 23, 12425273, 9135624);
		class499.method8990(125 + class72.field907, 0, 640, 23, 5197647, 2697513);
		var0.method7154(class337.field4149, class72.field907 + 62, 15, 0, -1);
		if (null != class72.field803) {
			class72.field803[1].method9072(class72.field907 + 140, 1);
			var1.method7228(class337.field4150, class72.field907 + 152, 10, 16777215, -1);
			class72.field803[0].method9072(class72.field907 + 140, 12);
			var1.method7228(class337.field4151, 152 + class72.field907, 21, 16777215, -1);
		}

		if (class72.field120 != null) {
			int var23 = class72.field907 + 280;
			if (class64.field794[0] == 0 && class64.field793[0] == 0) {
				class72.field120[2].method9072(var23, 4);
			} else {
				class72.field120[0].method9072(var23, 4);
			}

			if (class64.field794[0] == 0 && 1 == class64.field793[0]) {
				class72.field120[3].method9072(var23 + 15, 4);
			} else {
				class72.field120[1].method9072(var23 + 15, 4);
			}

			var0.method7228(class337.field4152, var23 + 32, 17, 16777215, -1);
			int var25 = class72.field907 + 390;
			if (1 == class64.field794[0] && 0 == class64.field793[0]) {
				class72.field120[2].method9072(var25, 4);
			} else {
				class72.field120[0].method9072(var25, 4);
			}

			if (class64.field794[0] == 1 && 1 == class64.field793[0]) {
				class72.field120[3].method9072(var25 + 15, 4);
			} else {
				class72.field120[1].method9072(var25 + 15, 4);
			}

			var0.method7228(class337.field4153, var25 + 32, 17, 16777215, -1);
			var5 = class72.field907 + 500;
			if (2 == class64.field794[0] && 0 == class64.field793[0]) {
				class72.field120[2].method9072(var5, 4);
			} else {
				class72.field120[0].method9072(var5, 4);
			}

			if (class64.field794[0] == 2 && class64.field793[0] == 1) {
				class72.field120[3].method9072(var5 + 15, 4);
			} else {
				class72.field120[1].method9072(var5 + 15, 4);
			}

			var0.method7228(class337.field4154, var5 + 32, 17, 16777215, -1);
			var6 = class72.field907 + 610;
			if (class64.field794[0] == 3 && class64.field793[0] == 0) {
				class72.field120[2].method9072(var6, 4);
			} else {
				class72.field120[0].method9072(var6, 4);
			}

			if (3 == class64.field794[0] && 1 == class64.field793[0]) {
				class72.field120[3].method9072(var6 + 15, 4);
			} else {
				class72.field120[1].method9072(var6 + 15, 4);
			}

			var0.method7228(class337.field4155, var6 + 32, 17, 16777215, -1);
		}

		class499.method9012(class72.field907 + 708, 4, 50, 16, 0);
		var1.method7154(class337.field4095, 25 + 708 + class72.field907, 16, 16777215, -1);
		class72.field920 = -1;
		if (class72.field4945 != null) {
			byte var24 = 88;
			byte var26 = 19;
			var5 = 765 / (var24 + 1) - 1;
			var6 = 480 / (var26 + 1);

			int var7;
			int var8;
			do {
				var7 = var6;
				var8 = var5;
				if (var6 * (var5 - 1) >= class64.field792) {
					--var5;
				}

				if (var5 * (var6 - 1) >= class64.field792) {
					--var6;
				}

				if ((var6 - 1) * var5 >= class64.field792) {
					--var6;
				}
			} while(var6 != var7 || var8 != var5);

			var7 = (765 - var24 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			var8 = (480 - var6 * var26) / (var6 + 1);
			if (var8 > 5) {
				var8 = 5;
			}

			int var9 = (765 - var24 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (480 - var26 * var6 - var8 * (var6 - 1)) / 2;
			int var11 = (class64.field792 + var6 - 1) / var6;
			class72.field922 = var11 - var5;
			if (class72.field4189 != null && class72.field921 > 0) {
				class72.field4189.method9072(8, class35.field3026 / 2 - class72.field4189.field5082 / 2);
			}

			if (class72.field71 != null && class72.field921 < class72.field922) {
				class72.field71.method9072(class35.field211 - class72.field71.field5081 - 8, class35.field3026 / 2 - class72.field71.field5082 / 2);
			}

			int var12 = var10 + 23;
			int var13 = class72.field907 + var9;
			int var14 = 0;
			boolean var15 = false;
			int var16 = class72.field921;

			int var17;
			for (var17 = var6 * var16; var17 < class64.field792 && var16 - class72.field921 < var5; ++var17) {
				class64 var18 = class64.field179[var17];
				boolean var19 = true;
				String var20 = Integer.toString(var18.field798);
				if (-1 == var18.field798) {
					var20 = class337.field3982;
					var19 = false;
				} else if (var18.field798 > 1980) {
					var20 = class337.field4157;
					var19 = false;
				}

				class104 var21 = null;
				int var22 = 0;
				if (var18.method1723()) {
					var21 = var18.method1717() ? class104.field1353 : class104.field1355;
				} else if (var18.method1718()) {
					var21 = var18.method1717() ? class104.field1364 : class104.field1363;
				} else if (var18.method1750()) {
					var22 = 16711680;
					var21 = var18.method1717() ? class104.field1354 : class104.field1351;
				} else if (var18.method1724()) {
					var21 = var18.method1717() ? class104.field1365 : class104.field1356;
				} else if (var18.method1720()) {
					var21 = var18.method1717() ? class104.field1352 : class104.field1360;
				} else if (var18.method1725()) {
					var21 = var18.method1717() ? class104.field1357 : class104.field1359;
				} else if (var18.method1726()) {
					var21 = var18.method1717() ? class104.field1362 : class104.field1361;
				}

				if (null == var21 || var21.field1349 >= class72.field4945.length) {
					var21 = var18.method1717() ? class104.field1350 : class104.field1358;
				}

				if (class36.field242 >= var13 && class36.field243 >= var12 && class36.field242 < var13 + var24 && class36.field243 < var26 + var12 && var19) {
					class72.field920 = var17;
					class72.field4945[var21.field1349].method9120(var13, var12, 128, 16777215);
					var15 = true;
				} else {
					class72.field4945[var21.field1349].method9104(var13, var12);
				}

				if (null != class72.field88) {
					class72.field88[(var18.method1717() ? 8 : 0) + var18.field801].method9072(var13 + 29, var12);
				}

				var0.method7154(Integer.toString(var18.field802), var13 + 15, 5 + var26 / 2 + var12, var22, -1);
				var1.method7154(var20, var13 + 60, 5 + var26 / 2 + var12, 268435455, -1);
				var12 += var8 + var26;
				++var14;
				if (var14 >= var6) {
					var12 = var10 + 23;
					var13 += var24 + var7;
					var14 = 0;
					++var16;
				}
			}

			if (var15) {
				var17 = var1.method7145(class64.field179[class72.field920].field800) + 6;
				int var27 = var1.field4439 + 8;
				int var28 = class36.field243 + 25;
				if (var27 + var28 > 480) {
					var28 = class36.field243 - 25 - var27;
				}

				class499.method9012(class36.field242 - var17 / 2, var28, var17, var27, 16777120);
				class499.method9041(class36.field242 - var17 / 2, var28, var17, var27, 0);
				var1.method7154(class64.field179[class72.field920].field800, class36.field242, 4 + var1.field4439 + var28, 0, -1);
			}
		}

		class35.field2381.method9051(0, 0);
	}

	static void method1134(int var0) {
		Client.field714 = 0L;
		if (var0 >= 2) {
			Client.field715 = true;
		} else {
			Client.field715 = false;
		}

		if (Client.method6581() == 1) {
			Client.field466.method523(765, 503);
		} else {
			Client.field466.method523(7680, 2160);
		}

		if (Client.field499 >= 25) {
			Client.method12();
		}

	}

	static final void method1136(int var0, int var1, boolean var2) {
		if (!var2 || Client.field165 != var0 || Client.field4672 != var1) {
			Client.field165 = var0;
			Client.field4672 = var1;
			class139.method3145(25);
			class260.method5271(class337.field3961, true);
			int var4 = Client.field2850;
			int var5 = Client.field2841;
			Client.field2850 = (var0 - 6) * 8;
			Client.field2841 = 8 * (var1 - 6);
			int var6 = Client.field2850 - var4;
			int var7 = Client.field2841 - var5;
			var4 = Client.field2850;
			var5 = Client.field2841;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class96 var9 = Client.field546[var8];
				if (null != var9) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field1174;
						var10000[var10] -= var6;
						var10000 = var9.field1176;
						var10000[var10] -= var7;
					}

					var9.field1171 -= var6 * 128;
					var9.field1138 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				class88 var20 = Client.field611[var8];
				if (var20 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field1174;
						var10000[var10] -= var6;
						var10000 = var20.field1176;
						var10000[var10] -= var7;
					}

					var20.field1171 -= var6 * 128;
					var20.field1138 -= var7 * 128;
				}
			}

			byte var19 = 0;
			byte var21 = 104;
			byte var22 = 1;
			if (var6 < 0) {
				var19 = 103;
				var21 = -1;
				var22 = -1;
			}

			byte var11 = 0;
			byte var12 = 104;
			byte var13 = 1;
			if (var7 < 0) {
				var11 = 103;
				var12 = -1;
				var13 = -1;
			}

			int var15;
			for (int var14 = var19; var21 != var14; var14 += var22) {
				for (var15 = var11; var15 != var12; var15 += var13) {
					int var16 = var6 + var14;
					int var17 = var15 + var7;

					for (int var18 = 0; var18 < 4; ++var18) {
						if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
							Client.field624[var18][var14][var15] = Client.field624[var18][var16][var17];
						} else {
							Client.field624[var18][var14][var15] = null;
						}
					}
				}
			}

			for (class90 var23 = (class90)Client.field574.method6716(); var23 != null; var23 = (class90)Client.field574.method6725()) {
				var23.field1121 -= var6;
				var23.field1122 -= var7;
				if (var23.field1121 < 0 || var23.field1122 < 0 || var23.field1121 >= 104 || var23.field1122 >= 104) {
					var23.method8051();
				}
			}

			if (Client.field735 != 0) {
				Client.field735 -= var6;
				Client.field487 -= var7;
			}

			Client.field507 = 0;
			Client.field746 = false;
			Client.field257 -= var6 << 7;
			Client.field3391 -= var7 << 7;
			Client.field194 -= var6 << 7;
			Client.field1675 -= var7 << 7;
			Client.field730 = -1;
			Client.field627.method6710();
			Client.field551.method6710();

			for (var15 = 0; var15 < 4; ++var15) {
				Client.field561[var15].method4115();
			}

		}
	}

	static final void method1125(class88 var0, int var1, int var2, class211 var3) {
		int var5 = var0.field1174[0];
		int var6 = var0.field1176[0];
		int var7 = var0.method2262();
		if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
			if (var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
				int var10 = var0.method2262();
				Client.field787.field2387 = var1;
				Client.field787.field2385 = var2;
				Client.field787.field2383 = 1;
				Client.field787.field2384 = 1;
				class62 var11 = Client.field787;
				int var12 = class145.method3173(var5, var6, var10, var11, Client.field561[var0.field1106], true, Client.field788, Client.field789);
				if (var12 >= 1) {
					for (int var13 = 0; var13 < var12 - 1; ++var13) {
						var0.method2246(Client.field788[var13], Client.field789[var13], var3);
					}

				}
			}
		}
	}
}
