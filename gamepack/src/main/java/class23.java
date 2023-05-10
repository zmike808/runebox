public class class23 implements class51 {
	public static class344 field4311;
	static class229 field30;
	static class420 field1373;
	static class460 field4313;
	static class502[] field174;

	class23() {
	}

	public class43 method1069() {
		return new class25();
	}

	static void method323(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		class219.field2520.method4351(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method319() {
		int var13;
		if (Client.field519 == 0) {
			Client.field180 = new class223(4, 104, 104, class78.field1002);

			for (var13 = 0; var13 < 4; ++var13) {
				Client.field561[var13] = new class209(104, 104);
			}

			Client.field1396 = new class503(512, 512);
			class72.field902 = class337.field4105;
			class72.field897 = 5;
			Client.field519 = 20;
		} else if (20 == Client.field519) {
			class72.field902 = class337.field3851;
			class72.field897 = 10;
			Client.field519 = 30;
		} else if (Client.field519 == 30) {
			Client.field118 = Client.method4859(0, false, true, true, false);
			Client.field3804 = Client.method4859(1, false, true, true, false);
			Client.field1064 = Client.method4859(2, true, false, true, false);
			Client.field1069 = Client.method4859(3, false, true, true, false);
			Client.field4688 = Client.method4859(4, false, true, true, false);
			Client.field4271 = Client.method4859(5, true, true, true, false);
			Client.field4548 = Client.method4859(6, true, true, true, false);
			Client.field2098 = Client.method4859(7, false, true, true, false);
			Client.field4788 = Client.method4859(8, false, true, true, false);
			Client.field2869 = Client.method4859(9, false, true, true, false);
			Client.field4217 = Client.method4859(10, false, true, true, false);
			Client.field2102 = Client.method4859(11, false, true, true, false);
			class75.field1541 = Client.method4859(12, false, true, true, false);
			Client.field1568 = Client.method4859(13, true, false, true, false);
			Client.field2684 = Client.method4859(14, false, true, true, false);
			Client.field1532 = Client.method4859(15, false, true, true, false);
			Client.field1828 = Client.method4859(17, true, true, true, false);
			Client.field4300 = Client.method4859(18, false, true, true, false);
			Client.field159 = Client.method4859(19, false, true, true, false);
			Client.field2336 = Client.method4859(20, false, true, true, false);
			Client.field317 = Client.method4859(21, false, true, true, true);
			class72.field902 = class337.field3848;
			class72.field897 = 20;
			Client.field519 = 40;
		} else if (40 != Client.field519) {
			if (Client.field519 == 45) {
				boolean var27 = !Client.field493;
				class299.field307 = 22050;
				class48.field314 = var27;
				class43.field1411 = 2;
				class299 var15 = new class299();
				var15.method5576(9, 128);
				Client.field163 = class149.method3202(class35.field201, 0, 22050);
				Client.field163.method813(var15);
				class298.method3770(Client.field1532, Client.field2684, Client.field4688, var15);
				Client.field1997 = class149.method3202(class35.field201, 1, 2048);
				Client.field1574 = new class39();
				Client.field1997.method813(Client.field1574);
				Client.field2981 = new class56(22050, class299.field307);
				class72.field902 = class337.field3854;
				class72.field897 = 35;
				Client.field519 = 50;
				field4313 = new class460(Client.field4788, Client.field1568);
			} else if (50 == Client.field519) {
				var13 = class461.method8340().length;
				Client.field718 = field4313.method8333(class461.method8340());
				if (Client.field718.size() < var13) {
					class72.field902 = class337.field3949 + Client.field718.size() * 100 / var13 + "%";
					class72.field897 = 40;
				} else {
					Client.field4327 = (class379)Client.field718.get(class461.field4880);
					Client.field2832 = (class379)Client.field718.get(class461.field4886);
					Client.field1635 = (class379)Client.field718.get(class461.field4878);
					Client.field1437 = Client.field616.method8074();
					class72.field902 = class337.field3857;
					class72.field897 = 40;
					Client.field519 = 60;
				}
			} else {
				int var4;
				int var5;
				class342 var14;
				if (60 == Client.field519) {
					var14 = Client.field4217;
					class342 var17 = Client.field4788;
					var4 = 0;
					String[] var20 = class72.field925;

					int var21;
					String var22;
					for (var21 = 0; var21 < var20.length; ++var21) {
						var22 = var20[var21];
						if (var14.method6525(var22, "")) {
							++var4;
						}
					}

					var20 = class72.field926;

					for (var21 = 0; var21 < var20.length; ++var21) {
						var22 = var20[var21];
						if (var17.method6525(var22, "")) {
							++var4;
						}
					}

					var20 = class72.field927;

					for (var21 = 0; var21 < var20.length; ++var21) {
						var22 = var20[var21];
						if (var17.method6464(var22) != -1 && var17.method6525(var22, "")) {
							++var4;
						}
					}

					var5 = class72.method1230(Client.field4788);
					if (var4 < var5) {
						class72.field902 = class337.field3879 + var4 * 100 / var5 + "%";
						class72.field897 = 50;
					} else {
						class72.field902 = class337.field3859;
						class72.field897 = 50;
						class139.method3145(5);
						Client.field519 = 70;
					}
				} else if (70 == Client.field519) {
					if (!Client.field1064.method6521()) {
						class72.field902 = class337.field3860 + Client.field1064.method6423() + "%";
						class72.field897 = 60;
					} else if (!Client.field317.method6521()) {
						class72.field902 = class337.field3860 + (80 + class75.field1541.method6423() / 6) + "%";
						class72.field897 = 60;
					} else {
						class203.method3608(Client.field1064);
						class199.method1772(Client.field1064);
						class185.method1714(Client.field1064, Client.field2098);
						class201.method1931(Client.field1064, Client.field2098, Client.field493);
						class191.method1984(Client.field1064, Client.field2098);
						class199.method2221(Client.field1064);
						class342 var26 = Client.field1064;
						var14 = Client.field2098;
						boolean var16 = Client.field492;
						class379 var18 = Client.field4327;
						field4311 = var26;
						class202.field2212 = var14;
						class72.field1844 = var16;
						Client.field1063 = field4311.method6458(10);
						class202.field1505 = var18;
						class204.method3281(Client.field1064, Client.field118, Client.field3804);
						class194.method2895(Client.field1064, Client.field2098);
						class197.method1987(Client.field1064);
						class342 var19 = Client.field1064;
						class182.field1910 = var19;
						Client.field1909 = class182.field1910.method6458(16);
						class317.method22(Client.field1069, Client.field2098, Client.field4788, Client.field1568);
						class181.method2568(Client.field1064);
						class188.method5676(Client.field1064);
						class342 var6 = Client.field1064;
						class105.field3366 = var6;
						class342 var7 = Client.field1064;
						class198.method3743(Client.field1064);
						class199.method725(Client.field1064);
						class328.method6330(Client.field1064);
						Client.field1781 = new class474(Client.field491, 54, class67.field1736, Client.field1064);
						Client.field882 = new class474(Client.field491, 47, class67.field1736, Client.field1064);
						Client.field4387 = new class105();
						class342 var8 = Client.field1064;
						class342 var9 = Client.field4788;
						class342 var10 = Client.field1568;
						class200.field2138 = var8;
						class200.field2132 = var9;
						class200.field2133 = var10;
						class342 var11 = Client.field1064;
						class342 var12 = Client.field4788;
						class91.field1964 = var11;
						class186.field1961 = var12;
						class183.method510(Client.field1064, Client.field4788);
						class72.field902 = class337.field3903;
						class72.field897 = 60;
						Client.field519 = 80;
					}
				} else if (Client.field519 == 80) {
					var13 = 0;
					if (Client.field994 == null) {
						Client.field994 = class504.method8588(Client.field4788, field1373.field4647, 0);
					} else {
						++var13;
					}

					if (Client.field1233 == null) {
						Client.field1233 = class504.method8588(Client.field4788, field1373.field4637, 0);
					} else {
						++var13;
					}

					if (null == Client.field3826) {
						Client.field3826 = class504.method1974(Client.field4788, field1373.field4639, 0);
					} else {
						++var13;
					}

					if (Client.field256 == null) {
						Client.field256 = class115.method2860(Client.field4788, field1373.field4640, 0);
					} else {
						++var13;
					}

					if (null == Client.field4669) {
						Client.field4669 = class115.method2860(Client.field4788, field1373.field4645, 0);
					} else {
						++var13;
					}

					if (Client.field1959 == null) {
						Client.field1959 = class115.method2860(Client.field4788, field1373.field4642, 0);
					} else {
						++var13;
					}

					if (null == Client.field1348) {
						Client.field1348 = class115.method2860(Client.field4788, field1373.field4643, 0);
					} else {
						++var13;
					}

					if (Client.field1861 == null) {
						Client.field1861 = class115.method2860(Client.field4788, field1373.field4641, 0);
					} else {
						++var13;
					}

					if (Client.field4946 == null) {
						Client.field4946 = class115.method2860(Client.field4788, field1373.field4644, 0);
					} else {
						++var13;
					}

					if (null == Client.field1265) {
						Client.field1265 = class504.method1974(Client.field4788, field1373.field4646, 0);
					} else {
						++var13;
					}

					if (null == field174) {
						field174 = class504.method1974(Client.field4788, field1373.field4638, 0);
					} else {
						++var13;
					}

					if (var13 < 11) {
						class72.field902 = class337.field3862 + var13 * 100 / 12 + "%";
						class72.field897 = 70;
					} else {
						class383.field4442 = field174;
						Client.field1233.method9098();
						int var2 = (int)(Math.random() * 21.0D) - 10;
						int var3 = (int)(Math.random() * 21.0D) - 10;
						var4 = (int)(Math.random() * 21.0D) - 10;
						var5 = (int)(Math.random() * 41.0D) - 20;
						Client.field3826[0].method9071(var5 + var2, var5 + var3, var4 + var5);
						class72.field902 = class337.field3863;
						class72.field897 = 70;
						Client.field519 = 90;
					}
				} else if (90 == Client.field519) {
					if (!Client.field2869.method6521()) {
						class72.field902 = class337.field3864 + "0%";
						class72.field897 = 90;
					} else {
						field30 = new class229(Client.field2869, Client.field4788, 20, Client.field112.method2403(), Client.field493 ? 64 : 128);
						class229 var25 = field30;
						class219.field2515.field2795 = var25;
						class219.method286(Client.field112.method2403());
						Client.field519 = 100;
					}
				} else if (100 == Client.field519) {
					var13 = field30.method4559();
					if (var13 < 100) {
						class72.field902 = class337.field3864 + var13 + "%";
						class72.field897 = 90;
					} else {
						class72.field902 = class337.field3865;
						class72.field897 = 90;
						Client.field519 = 110;
					}
				} else if (Client.field519 == 110) {
					Client.field1449 = new class85();
					class35.field201.method3422(Client.field1449, 10);
					class72.field902 = class337.field3988;
					class72.field897 = 92;
					Client.field519 = 120;
				} else if (120 == Client.field519) {
					if (!Client.field4217.method6525("huffman", "")) {
						class72.field902 = class337.field4128 + 0 + "%";
						class72.field897 = 94;
					} else {
						class319 var24 = new class319(Client.field4217.method6467("huffman", ""));
						class155.method3282(var24);
						class72.field902 = class337.field3868;
						class72.field897 = 94;
						Client.field519 = 130;
					}
				} else if (Client.field519 == 130) {
					if (!Client.field1069.method6521()) {
						class72.field902 = class337.field3999 + Client.field1069.method6423() * 4 / 5 + "%";
						class72.field897 = 96;
					} else if (!class75.field1541.method6521()) {
						class72.field902 = class337.field3999 + (80 + class75.field1541.method6423() / 6) + "%";
						class72.field897 = 96;
					} else if (!Client.field1568.method6521()) {
						class72.field902 = class337.field3999 + (96 + Client.field1568.method6423() / 50) + "%";
						class72.field897 = 96;
					} else {
						class72.field902 = class337.field3861;
						class72.field897 = 98;
						if (class75.field1541.method6466("version.dat", "")) {
							class489 var23 = new class489(class75.field1541.method6467("version.dat", ""));
							var23.method8660();
						}

						Client.field519 = 140;
					}
				} else if (140 == Client.field519) {
					class72.field897 = 100;
					if (Client.field159.method6459() > 0 && !Client.field159.method6469(class268.field3055.field3058)) {
						class72.field902 = class337.field4003 + Client.field159.method6443(class268.field3055.field3058) / 10 + "%";
					} else {
						if (Client.field1542 == null) {
							Client.field1542 = new class459();
							Client.field1542.method8139(Client.field159, Client.field4300, Client.field2336, Client.field1635, Client.field718, Client.field3826);
						}

						class72.field902 = class337.field3838;
						Client.field519 = 150;
					}
				} else if (150 == Client.field519) {
					class139.method3145(10);
				}
			}
		} else {
			byte var1 = 0;
			var13 = var1 + Client.field118.method6392() * 4 / 100;
			var13 += Client.field3804.method6392() * 4 / 100;
			var13 += Client.field1064.method6392() * 2 / 100;
			var13 += Client.field1069.method6392() * 2 / 100;
			var13 += Client.field4688.method6392() * 6 / 100;
			var13 += Client.field4271.method6392() * 4 / 100;
			var13 += Client.field4548.method6392() * 2 / 100;
			var13 += Client.field2098.method6392() * 55 / 100;
			var13 += Client.field4788.method6392() * 2 / 100;
			var13 += Client.field2869.method6392() * 2 / 100;
			var13 += Client.field4217.method6392() * 2 / 100;
			var13 += Client.field2102.method6392() * 2 / 100;
			var13 += class75.field1541.method6392() * 2 / 100;
			var13 += Client.field1568.method6392() * 2 / 100;
			var13 += Client.field2684.method6392() * 2 / 100;
			var13 += Client.field1532.method6392() * 2 / 100;
			var13 += Client.field159.method6392() / 100;
			var13 += Client.field4300.method6392() / 100;
			var13 += Client.field2336.method6392() / 100;
			var13 += Client.field317.method6392() / 100;
			var13 += Client.field1828.method6391() && Client.field1828.method6521() ? 1 : 0;
			if (var13 != 100) {
				if (var13 != 0) {
					class72.field902 = class337.field3853 + var13 + "%";
				}

				class72.field897 = 30;
			} else {
				Client.method2857(Client.field118, "Animations");
				Client.method2857(Client.field3804, "Skeletons");
				Client.method2857(Client.field4688, "Sound FX");
				Client.method2857(Client.field4271, "Maps");
				Client.method2857(Client.field4548, "Music Tracks");
				Client.method2857(Client.field2098, "Models");
				Client.method2857(Client.field4788, "Sprites");
				Client.method2857(Client.field2102, "Music Jingles");
				Client.method2857(Client.field2684, "Music Samples");
				Client.method2857(Client.field1532, "Music Patches");
				Client.method2857(Client.field159, "World Map");
				Client.method2857(Client.field4300, "World Map Geography");
				Client.method2857(Client.field2336, "World Map Ground");
				field1373 = new class420();
				field1373.method7784(Client.field1828);
				class72.field902 = class337.field4032;
				class72.field897 = 30;
				Client.field519 = 45;
			}
		}
	}
}
