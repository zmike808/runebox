public abstract class class156 extends class449 {
	class156() {
	}

	abstract void method3284(class489 var1);

	abstract void method3285(class160 var1);

	static final void method3290(class317 var0, int var1, int var2, int var3) {
		Client.method6316();
		class306 var5 = var0.method6132(false, (byte)-106);
		if (null != var5) {
			class499.method8981(var1, var2, var5.field3477 + var1, var5.field3472 + var2);
			if (2 != Client.field653 && Client.field653 != 5) {
				int var6 = Client.field758 & 2047;
				int var7 = 48 + Client.field3454.field1171 / 32;
				int var8 = 464 - Client.field3454.field1138 / 32;
				Client.field1396.method9093(var1, var2, var5.field3477, var5.field3472, var7, var8, var6, 256, var5.field3475, var5.field3474);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < Client.field731; ++var9) {
					var10 = 4 * Client.field620[var9] + 2 - Client.field3454.field1171 / 32;
					var11 = 2 + Client.field733[var9] * 4 - Client.field3454.field1138 / 32;
					class427.method7947(var1, var2, var10, var11, Client.field734[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						class363 var17 = Client.field624[Client.field231][var9][var10];
						if (null != var17) {
							var12 = var9 * 4 + 2 - Client.field3454.field1171 / 32;
							var13 = var10 * 4 + 2 - Client.field3454.field1138 / 32;
							class427.method7947(var1, var2, var12, var13, Client.field4946[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < Client.field737; ++var9) {
					class96 var15 = Client.field546[Client.field548[var9]];
					if (null != var15 && var15.method2315()) {
						class191 var18 = var15.field1277;
						if (null != var18 && null != var18.field2045) {
							var18 = var18.method3642();
						}

						if (var18 != null && var18.field2037 && var18.field2048) {
							var12 = var15.field1171 / 32 - Client.field3454.field1171 / 32;
							var13 = var15.field1138 / 32 - Client.field3454.field1138 / 32;
							class427.method7947(var1, var2, var12, var13, Client.field4946[1], var5);
						}
					}
				}

				var9 = class103.field1335;
				int[] var16 = class103.field1341;

				for (var11 = 0; var11 < var9; ++var11) {
					class88 var19 = Client.field611[var16[var11]];
					if (null != var19 && var19.method2315() && !var19.field1105 && Client.field3454 != var19) {
						var13 = var19.field1171 / 32 - Client.field3454.field1171 / 32;
						int var14 = var19.field1138 / 32 - Client.field3454.field1138 / 32;
						if (var19.method2233()) {
							class427.method7947(var1, var2, var13, var14, Client.field4946[3], var5);
						} else if (Client.field3454.field1104 != 0 && var19.field1104 != 0 && Client.field3454.field1104 == var19.field1104) {
							class427.method7947(var1, var2, var13, var14, Client.field4946[4], var5);
						} else if (var19.method2276()) {
							class427.method7947(var1, var2, var13, var14, Client.field4946[5], var5);
						} else if (var19.method2241()) {
							class427.method7947(var1, var2, var13, var14, Client.field4946[6], var5);
						} else {
							class427.method7947(var1, var2, var13, var14, Client.field4946[2], var5);
						}
					}
				}

				if (0 != Client.field508 && Client.field602 % 20 < 10) {
					if (1 == Client.field508 && Client.field509 >= 0 && Client.field509 < Client.field546.length) {
						class96 var20 = Client.field546[Client.field509];
						if (null != var20) {
							var12 = var20.field1171 / 32 - Client.field3454.field1171 / 32;
							var13 = var20.field1138 / 32 - Client.field3454.field1138 / 32;
							Client.method8596(var1, var2, var12, var13, Client.field1348[1], var5);
						}
					}

					if (2 == Client.field508) {
						var11 = Client.field654 * 4 - Client.field2850 * 4 + 2 - Client.field3454.field1171 / 32;
						var12 = 2 + (Client.field512 * 4 - Client.field2841 * 4) - Client.field3454.field1138 / 32;
						Client.method8596(var1, var2, var11, var12, Client.field1348[1], var5);
					}

					if (10 == Client.field508 && Client.field510 >= 0 && Client.field510 < Client.field611.length) {
						class88 var21 = Client.field611[Client.field510];
						if (null != var21) {
							var12 = var21.field1171 / 32 - Client.field3454.field1171 / 32;
							var13 = var21.field1138 / 32 - Client.field3454.field1138 / 32;
							Client.method8596(var1, var2, var12, var13, Client.field1348[1], var5);
						}
					}
				}

				if (Client.field735 != 0) {
					var11 = 2 + Client.field735 * 4 - Client.field3454.field1171 / 32;
					var12 = 2 + Client.field487 * 4 - Client.field3454.field1138 / 32;
					class427.method7947(var1, var2, var11, var12, Client.field1348[0], var5);
				}

				if (!Client.field3454.field1105) {
					class499.method9012(var1 + var5.field3477 / 2 - 1, var2 + var5.field3472 / 2 - 1, 3, 3, 16777215);
				}
			} else {
				class499.method9017(var1, var2, 0, var5.field3475, var5.field3474);
			}

			Client.field707[var3] = true;
		}
	}
}
