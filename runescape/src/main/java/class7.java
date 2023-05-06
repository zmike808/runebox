public class class7 implements class357 {
	public static final class7 field18;
	static class502 field1767;
	static class502 field3362;
	static class502 field3727;
	static class502 field4399;
	static class502 field4718;
	static class502 field894;
	static class502 field908;
	static class502 field914;
	static class502[] field1704;
	static String field98;
	final int field17;
	final int field19;

	static {
		field18 = new class7(0, 0);
	}

	class7(int var1, int var2) {
		this.field19 = var1;
		this.field17 = var2;
	}

	public int method6674() {
		return this.field17;
	}

	static void method42(class379 var0, class379 var1, class379 var2) {
		class72.field907 = (class35.field211 - 765) / 2;
		class72.field896 = class72.field907 + 202;
		class72.field1671 = 180 + class72.field896;
		if (class72.field919) {
			class56.method1128(var0, var1);
		} else {
			class72.field1498.method9104(class72.field907, 0);
			class72.field2125.method9104(class72.field907 + 382, 0);
			class72.field123.method9072(class72.field907 + 382 - class72.field123.field5081 / 2, 18);
			int var5;
			if (Client.field499 == 0 || Client.field499 == 5) {
				byte var4 = 20;
				var0.method7154(class337.field4060, 180 + class72.field896, 245 - var4, 16777215, -1);
				var5 = 253 - var4;
				class499.method9041(class72.field896 + 180 - 152, var5, 304, 34, 9179409);
				class499.method9041(class72.field896 + 180 - 151, var5 + 1, 302, 32, 0);
				class499.method9012(class72.field896 + 180 - 150, var5 + 2, class72.field897 * 3, 30, 9179409);
				class499.method9012(180 + class72.field896 - 150 + class72.field897 * 3, var5 + 2, 300 - class72.field897 * 3, 30, 0);
				var0.method7154(class72.field902, 180 + class72.field896, 276 - var4, 16777215, -1);
			}

			String var6;
			String var7;
			short var18;
			int var19;
			short var20;
			if (Client.field499 == 20) {
				field914.method9072(class72.field896 + 180 - field914.field5081 / 2, 271 - field914.field5082 / 2);
				var18 = 201;
				var0.method7154(class72.field905, 180 + class72.field896, var18, 16776960, 0);
				var19 = var18 + 15;
				var0.method7154(class72.field906, class72.field896 + 180, var19, 16776960, 0);
				var19 += 15;
				var0.method7154(class72.field890, class72.field896 + 180, var19, 16776960, 0);
				var19 += 15;
				var19 += 7;
				if (4 != class72.field898 && 10 != class72.field898) {
					var0.method7228(class337.field3869, class72.field896 + 180 - 110, var19, 16777215, 0);
					var20 = 200;

					for (var6 = class72.method288(); var0.method7145(var6) > var20; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.method7228(class383.method7246(var6), 180 + class72.field896 - 70, var19, 16777215, 0);
					var19 += 15;

					for (var7 = class372.method6329(class72.field909); var0.method7145(var7) > var20; var7 = var7.substring(1)) {
					}

					var0.method7228(class337.field4089 + var7, 180 + class72.field896 - 108, var19, 16777215, 0);
					var19 += 15;
				}
			}

			if (10 == Client.field499 || Client.field499 == 11 || Client.field499 == 50) {
				field914.method9072(class72.field896, 171);
				short var21;
				if (0 == class72.field898) {
					var18 = 251;
					var0.method7154(class337.field4091, class72.field896 + 180, var18, 16776960, 0);
					var19 = var18 + 30;
					var5 = 180 + class72.field896 - 80;
					var21 = 291;
					field3362.method9072(var5 - 73, var21 - 20);
					var0.method7155(class337.field4092, var5 - 73, var21 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 180 + class72.field896 + 80;
					field3362.method9072(var5 - 73, var21 - 20);
					var0.method7155(class337.field4034, var5 - 73, var21 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (1 == class72.field898) {
					var0.method7154(class72.field904, class72.field896 + 180, 201, 16776960, 0);
					var18 = 236;
					var0.method7154(class72.field905, class72.field896 + 180, var18, 16777215, 0);
					var19 = var18 + 15;
					var0.method7154(class72.field906, class72.field896 + 180, var19, 16777215, 0);
					var19 += 15;
					var0.method7154(class72.field890, class72.field896 + 180, var19, 16777215, 0);
					var19 += 15;
					var5 = class72.field896 + 180 - 80;
					var21 = 321;
					field3362.method9072(var5 - 73, var21 - 20);
					var0.method7154(class337.field3842, var5, var21 + 5, 16777215, 0);
					var5 = class72.field896 + 180 + 80;
					field3362.method9072(var5 - 73, var21 - 20);
					var0.method7154(class337.field4095, var5, var21 + 5, 16777215, 0);
				} else {
					int var8;
					if (class72.field898 == 2) {
						var18 = 201;
						var0.method7154(class72.field905, class72.field1671, var18, 16776960, 0);
						var19 = var18 + 15;
						var0.method7154(class72.field906, class72.field1671, var19, 16776960, 0);
						var19 += 15;
						var0.method7154(class72.field890, class72.field1671, var19, 16776960, 0);
						var19 += 15;
						var19 += 7;
						var0.method7228(class337.field3869, class72.field1671 - 110, var19, 16777215, 0);
						var20 = 200;

						for (var6 = class72.method288(); var0.method7145(var6) > var20; var6 = var6.substring(1)) {
						}

						var0.method7228(class383.method7246(var6) + (0 == class72.field923 & Client.field602 % 40 < 20 ? class97.method7285(16776960) + class97.field1286 : ""), class72.field1671 - 70, var19, 16777215, 0);
						var19 += 15;

						for (var7 = class372.method6329(class72.field909); var0.method7145(var7) > var20; var7 = var7.substring(1)) {
						}

						var0.method7228(class337.field4089 + var7 + (class72.field923 == 1 & Client.field602 % 40 < 20 ? class97.method7285(16776960) + class97.field1286 : ""), class72.field1671 - 108, var19, 16777215, 0);
						var19 += 15;
						var18 = 277;
						var8 = -117 + class72.field1671;
						boolean var10 = Client.field540;
						boolean var11 = class72.field891;
						class502 var9 = var10 ? (var11 ? field908 : field1767) : (var11 ? field894 : class72.field893);
						var9.method9072(var8, var18);
						var8 += var9.field5081 + 5;
						var1.method7228(class337.field4096, var8, var18 + 13, 16776960, 0);
						var8 = class72.field1671 + 24;
						boolean var14 = Client.field112.method2394();
						boolean var15 = class72.field903;
						class502 var13 = var14 ? (var15 ? field908 : field1767) : (var15 ? field894 : class72.field893);
						var13.method9072(var8, var18);
						var8 += var13.field5081 + 5;
						var1.method7228(class337.field4097, var8, var18 + 13, 16776960, 0);
						var19 = var18 + 15;
						int var16 = class72.field1671 - 80;
						short var17 = 321;
						field3362.method9072(var16 - 73, var17 - 20);
						var0.method7154(class337.field4094, var16, var17 + 5, 16777215, 0);
						var16 = 80 + class72.field1671;
						field3362.method9072(var16 - 73, var17 - 20);
						var0.method7154(class337.field4095, var16, var17 + 5, 16777215, 0);
						var18 = 357;
						switch(class72.field917) {
						case 2:
							field98 = class337.field4109;
							break;
						default:
							field98 = class337.field4107;
						}

						class72.field1296 = new class421(class72.field1671, var18, var1.method7145(field98), 11);
						class72.field104 = new class421(class72.field1671, var18, var1.method7145(class337.field4108), 11);
						var1.method7154(field98, class72.field1671, var18, 16777215, 0);
					} else if (3 == class72.field898) {
						var18 = 201;
						var0.method7154(class337.field4098, class72.field896 + 180, var18, 16776960, 0);
						var19 = var18 + 20;
						var1.method7154(class337.field4066, class72.field896 + 180, var19, 16776960, 0);
						var19 += 20;
						var1.method7154(class337.field4100, class72.field896 + 180, var19, 16776960, 0);
						var19 += 15;
						var5 = class72.field896 + 180;
						var21 = 276;
						field3362.method9072(var5 - 73, var21 - 20);
						var2.method7154(class337.field4101, var5, var21 + 5, 16777215, 0);
						var5 = 180 + class72.field896;
						var21 = 326;
						field3362.method9072(var5 - 73, var21 - 20);
						var2.method7154(class337.field4102, var5, var21 + 5, 16777215, 0);
					} else {
						int var23;
						short var24;
						if (class72.field898 == 4) {
							var0.method7154(class337.field4077, 180 + class72.field896, 201, 16776960, 0);
							var18 = 236;
							var0.method7154(class72.field905, class72.field896 + 180, var18, 16777215, 0);
							var19 = var18 + 15;
							var0.method7154(class72.field906, 180 + class72.field896, var19, 16777215, 0);
							var19 += 15;
							var0.method7154(class72.field890, class72.field896 + 180, var19, 16777215, 0);
							var19 += 15;
							var0.method7228(class337.field4090 + class372.method6329(class72.field1374) + (Client.field602 % 40 < 20 ? class97.method7285(16776960) + class97.field1286 : ""), class72.field896 + 180 - 108, var19, 16777215, 0);
							var19 -= 8;
							var0.method7228(class337.field3845, class72.field896 + 180 - 9, var19, 16776960, 0);
							var19 += 15;
							var0.method7228(class337.field3846, 180 + class72.field896 - 9, var19, 16776960, 0);
							var5 = class72.field896 + 180 - 9 + var0.method7145(class337.field3846) + 15;
							var23 = var19 - var0.field4439;
							class502 var22;
							if (class72.field915) {
								var22 = field1767;
							} else {
								var22 = class72.field893;
							}

							var22.method9072(var5, var23);
							var19 += 15;
							var8 = 180 + class72.field896 - 80;
							var24 = 321;
							field3362.method9072(var8 - 73, var24 - 20);
							var0.method7154(class337.field3842, var8, var24 + 5, 16777215, 0);
							var8 = 80 + class72.field896 + 180;
							field3362.method9072(var8 - 73, var24 - 20);
							var0.method7154(class337.field4095, var8, var24 + 5, 16777215, 0);
							var1.method7154(class337.field4078, 180 + class72.field896, var24 + 36, 255, 0);
						} else if (class72.field898 == 5) {
							var0.method7154(class337.field3953, class72.field896 + 180, 201, 16776960, 0);
							var18 = 221;
							var2.method7154(class72.field905, class72.field896 + 180, var18, 16776960, 0);
							var19 = var18 + 15;
							var2.method7154(class72.field906, 180 + class72.field896, var19, 16776960, 0);
							var19 += 15;
							var2.method7154(class72.field890, 180 + class72.field896, var19, 16776960, 0);
							var19 += 15;
							var19 += 14;
							var0.method7228(class337.field4104, 180 + class72.field896 - 145, var19, 16777215, 0);
							var20 = 174;

							for (var6 = class72.method288(); var0.method7145(var6) > var20; var6 = var6.substring(1)) {
							}

							var0.method7228(class383.method7246(var6) + (Client.field602 % 40 < 20 ? class97.method7285(16776960) + class97.field1286 : ""), class72.field896 + 180 - 34, var19, 16777215, 0);
							var19 += 15;
							int var25 = 180 + class72.field896 - 80;
							short var26 = 321;
							field3362.method9072(var25 - 73, var26 - 20);
							var0.method7154(class337.field4070, var25, var26 + 5, 16777215, 0);
							var25 = 80 + 180 + class72.field896;
							field3362.method9072(var25 - 73, var26 - 20);
							var0.method7154(class337.field4106, var25, var26 + 5, 16777215, 0);
							var26 = 356;
							var1.method7154(class337.field4108, class72.field1671, var26, 268435455, 0);
						} else if (6 == class72.field898) {
							var18 = 201;
							var0.method7154(class72.field905, 180 + class72.field896, var18, 16776960, 0);
							var19 = var18 + 15;
							var0.method7154(class72.field906, 180 + class72.field896, var19, 16776960, 0);
							var19 += 15;
							var0.method7154(class72.field890, class72.field896 + 180, var19, 16776960, 0);
							var19 += 15;
							var5 = 180 + class72.field896;
							var21 = 321;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field4106, var5, var21 + 5, 16777215, 0);
						} else if (class72.field898 == 7) {
							if (class72.field2984 && !Client.field562) {
								var18 = 201;
								var0.method7154(class72.field905, class72.field1671, var18, 16776960, 0);
								var19 = var18 + 15;
								var0.method7154(class72.field906, class72.field1671, var19, 16776960, 0);
								var19 += 15;
								var0.method7154(class72.field890, class72.field1671, var19, 16776960, 0);
								var5 = class72.field1671 - 150;
								var19 += 10;

								for (var23 = 0; var23 < 8; ++var23) {
									field3362.method9083(var5, var19, 30, 40);
									boolean var27 = class72.field910 == var23 & Client.field602 % 40 < 20;
									var0.method7228((class72.field911[var23] == null ? "" : class72.field911[var23]) + (var27 ? class97.method7285(16776960) + class97.field1286 : ""), var5 + 10, var19 + 27, 16777215, 0);
									if (var23 != 1 && var23 != 3) {
										var5 += 35;
									} else {
										var5 += 50;
										var0.method7228(class383.method7246("/"), var5 - 13, var19 + 27, 16777215, 0);
									}
								}

								var23 = class72.field1671 - 80;
								short var28 = 321;
								field3362.method9072(var23 - 73, var28 - 20);
								var0.method7154("Submit", var23, var28 + 5, 16777215, 0);
								var23 = 80 + class72.field1671;
								field3362.method9072(var23 - 73, var28 - 20);
								var0.method7154(class337.field4095, var23, var28 + 5, 16777215, 0);
							} else {
								var18 = 216;
								var0.method7154(class337.field4134, class72.field896 + 180, var18, 16776960, 0);
								var19 = var18 + 15;
								var2.method7154(class337.field3894, 180 + class72.field896, var19, 16776960, 0);
								var19 += 15;
								var2.method7154(class337.field4136, 180 + class72.field896, var19, 16776960, 0);
								var19 += 15;
								var5 = class72.field896 + 180 - 80;
								var21 = 321;
								field3362.method9072(var5 - 73, var21 - 20);
								var0.method7154(class337.field4064, var5, var21 + 5, 16777215, 0);
								var5 = 180 + class72.field896 + 80;
								field3362.method9072(var5 - 73, var21 - 20);
								var0.method7154(class337.field4106, var5, var21 + 5, 16777215, 0);
							}
						} else if (8 == class72.field898) {
							var18 = 216;
							var0.method7154(class337.field3975, class72.field896 + 180, var18, 16776960, 0);
							var19 = var18 + 15;
							var2.method7154(class337.field4069, 180 + class72.field896, var19, 16776960, 0);
							var19 += 15;
							var2.method7154(class337.field3977, class72.field896 + 180, var19, 16776960, 0);
							var19 += 15;
							var5 = class72.field896 + 180 - 80;
							var21 = 321;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field3895, var5, var21 + 5, 16777215, 0);
							var5 = 80 + class72.field896 + 180;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field4106, var5, var21 + 5, 16777215, 0);
						} else if (9 == class72.field898) {
							var18 = 221;
							var0.method7154(class72.field905, 180 + class72.field896, var18, 16776960, 0);
							var19 = var18 + 25;
							var0.method7154(class72.field906, class72.field896 + 180, var19, 16776960, 0);
							var19 += 25;
							var0.method7154(class72.field890, 180 + class72.field896, var19, 16776960, 0);
							var5 = 180 + class72.field896;
							var21 = 311;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field4101, var5, var21 + 5, 16777215, 0);
						} else if (10 == class72.field898) {
							var19 = class72.field896 + 180;
							var20 = 209;
							var0.method7154(class337.field4091, 180 + class72.field896, var20, 16776960, 0);
							var5 = var20 + 20;
							field4718.method9072(var19 - 109, var5);
							if (class72.field912.isEmpty()) {
								field4399.method9072(var19 - 48, var5 + 18);
							} else {
								field4399.method9072(var19 - 48, var5 + 5);
								var0.method7154(class72.field912, var19, var5 + 68 - 15, 16776960, 0);
							}
						} else if (12 == class72.field898) {
							var19 = class72.field1671;
							var20 = 216;
							var2.method7154(class337.field3973, var19, var20, 16777215, 0);
							var5 = var20 + 17;
							var2.method7154(class337.field3932, var19, var5, 16777215, 0);
							var5 += 17;
							var2.method7154(class337.field4143, var19, var5, 16777215, 0);
							var5 += 17;
							var2.method7154(class337.field4144, var19, var5, 16777215, 0);
							var19 = class72.field1671 - 80;
							var20 = 311;
							field3362.method9072(var19 - 73, var20 - 20);
							var0.method7154(class337.field4147, var19, var20 + 5, 16777215, 0);
							var19 = 80 + class72.field1671;
							field3362.method9072(var19 - 73, var20 - 20);
							var0.method7154(class337.field4148, var19, var20 + 5, 16777215, 0);
						} else if (13 == class72.field898) {
							var18 = 231;
							var2.method7154(class337.field3867, class72.field896 + 180, var18, 16777215, 0);
							var19 = var18 + 20;
							var2.method7154(class337.field4146, class72.field896 + 180, var19, 16777215, 0);
							var5 = class72.field896 + 180;
							var18 = 311;
							field3362.method9072(var5 - 73, var18 - 20);
							var0.method7154(class337.field4106, var5, var18 + 5, 16777215, 0);
						} else if (class72.field898 == 14) {
							var18 = 201;
							String var30 = "";
							var6 = "";
							var7 = "";
							switch(class72.field899) {
							case 0:
								var30 = class337.field3891;
								var6 = class337.field4005;
								var7 = class337.field3893;
								break;
							case 1:
								var30 = class337.field3930;
								var6 = class337.field4099;
								var7 = class337.field3945;
								break;
							case 2:
								var30 = class337.field3978;
								var6 = class337.field4156;
								var7 = class337.field3968;
								break;
							default:
								class72.method46(false);
							}

							var0.method7154(var30, class72.field896 + 180, var18, 16776960, 0);
							var19 = var18 + 20;
							var0.method7154(var6, 180 + class72.field896, var19, 16776960, 0);
							var19 += 20;
							var0.method7154(var7, class72.field896 + 180, var19, 16776960, 0);
							var8 = class72.field896 + 180;
							var24 = 276;
							field3362.method9072(var8 - 73, var24 - 20);
							if (1 == class72.field899) {
								var0.method7154(class337.field3875, var8, var24 + 5, 16777215, 0);
							} else {
								var0.method7154(class337.field4055, var8, var24 + 5, 16777215, 0);
							}

							var8 = 180 + class72.field896;
							var24 = 326;
							field3362.method9072(var8 - 73, var24 - 20);
							var0.method7154(class337.field4106, var8, var24 + 5, 16777215, 0);
						} else if (24 == class72.field898) {
							var18 = 221;
							var0.method7154(class72.field905, class72.field896 + 180, var18, 16777215, 0);
							var19 = var18 + 15;
							var0.method7154(class72.field906, class72.field896 + 180, var19, 16777215, 0);
							var19 += 15;
							var0.method7154(class72.field890, class72.field896 + 180, var19, 16777215, 0);
							var19 += 15;
							var5 = class72.field896 + 180;
							var21 = 301;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field4135, var5, var21 + 5, 16777215, 0);
						} else if (32 == class72.field898) {
							var18 = 216;
							var0.method7154(class337.field4134, class72.field896 + 180, var18, 16776960, 0);
							var19 = var18 + 15;
							var2.method7154(class337.field3894, class72.field896 + 180, var19, 16776960, 0);
							var19 += 15;
							var2.method7154(class337.field4136, class72.field896 + 180, var19, 16776960, 0);
							var19 += 15;
							var5 = 180 + class72.field896 - 80;
							var21 = 321;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field4064, var5, var21 + 5, 16777215, 0);
							var5 = 180 + class72.field896 + 80;
							field3362.method9072(var5 - 73, var21 - 20);
							var0.method7154(class337.field4106, var5, var21 + 5, 16777215, 0);
						} else if (33 == class72.field898) {
							var18 = 201;
							var0.method7154(class72.field905, 180 + class72.field896, var18, 16776960, 0);
							var19 = var18 + 20;
							var1.method7154(class72.field906, 180 + class72.field896, var19, 16776960, 0);
							var19 += 20;
							var1.method7154(class72.field890, 180 + class72.field896, var19, 16776960, 0);
							var19 += 15;
							var5 = 180 + class72.field896;
							var21 = 276;
							field3362.method9072(var5 - 73, var21 - 20);
							var2.method7154(class337.field4160, var5, var21 + 5, 16777215, 0);
							var5 = class72.field896 + 180;
							var21 = 326;
							field3362.method9072(var5 - 73, var21 - 20);
							var2.method7154(class337.field4106, var5, var21 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.field499 >= 10) {
				int[] var32 = new int[4];
				class499.method8983(var32);
				class499.method8981(class72.field907, 0, 765 + class72.field907, class35.field3026);
				class72.field1471.method2356(class72.field907 - 22, Client.field602);
				class72.field1471.method2356(class72.field907 + 765 + 22 - 128, Client.field602);
				class499.method8984(var32);
			}

			field1704[Client.field112.method2478() ? 1 : 0].method9072(765 + class72.field907 - 40, 463);
			if (Client.field499 > 5 && class359.field4317 == class67.field1736) {
				if (field3727 != null) {
					var19 = class72.field907 + 5;
					var20 = 463;
					byte var31 = 100;
					byte var29 = 35;
					field3727.method9072(var19, var20);
					var0.method7154(class337.field4057 + " " + Client.field579, var31 / 2 + var19, var20 + var29 / 2 - 2, 16777215, 0);
					if (class72.field60 != null) {
						var1.method7154(class337.field4158, var31 / 2 + var19, 12 + var29 / 2 + var20, 16777215, 0);
					} else {
						var1.method7154(class337.field4159, var19 + var31 / 2, var29 / 2 + var20 + 12, 16777215, 0);
					}
				} else {
					field3727 = class297.method5550(Client.field4788, "sl_button", "");
				}
			}

		}
	}
}
