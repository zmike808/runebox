public class class61 extends class444 {
	class413 field476;
	class413 field477;
	class513 field475;
	int field471;
	int field472;
	int field478;
	String field473;
	String field474;
	String field479;

	class61(int var1, String var2, String var3, String var4) {
		this.field476 = class413.field4605;
		this.field477 = class413.field4605;
		this.method1171(var1, var2, var3, var4);
	}

	void method1171(int var1, String var2, String var3, String var4) {
		this.field471 = class106.method3060();
		this.field472 = Client.field602;
		this.field478 = var1;
		this.field473 = var2;
		this.method1204();
		this.field474 = var3;
		this.field479 = var4;
		this.method1199();
		this.method1173();
	}

	void method1199() {
		this.field476 = class413.field4605;
	}

	final boolean method1170() {
		if (this.field476 == class413.field4605) {
			this.method1172();
		}

		return this.field476 == class413.field4602;
	}

	void method1172() {
		this.field476 = class67.field804.field811.method7640(this.field475) ? class413.field4602 : class413.field4603;
	}

	void method1173() {
		this.field477 = class413.field4605;
	}

	final boolean method1174() {
		if (class413.field4605 == this.field477) {
			this.method1183();
		}

		return class413.field4602 == this.field477;
	}

	void method1183() {
		this.field477 = class67.field804.field812.method7640(this.field475) ? class413.field4602 : class413.field4603;
	}

	final void method1204() {
		if (null != this.field473) {
			this.field475 = new class513(class360.method6697(this.field473), Client.field889);
		} else {
			this.field475 = null;
		}

	}

	static float method1205(class126 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (null != var0 && var0.method3005() != 0) {
			float var5 = (float)var0.field1512[0].field1453;
			float var6 = (float)var0.field1512[var0.method3005() - 1].field1453;
			float var7 = var6 - var5;
			if ((double)var7 == 0.0D) {
				return var0.field1512[0].field1456;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				double var9 = (double)((int)var8);
				float var11 = Math.abs((float)((double)var8 - var9));
				float var12 = var11 * var7;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (var0.field1513 == class124.field1492) {
						if ((double)var11 != 0.0D) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (var0.field1513 != class124.field1490 && class124.field1491 != var0.field1513) {
						if (class124.field1488 == var0.field1513) {
							var12 = var5 - var1;
							var17 = var0.field1512[0].field1452;
							var18 = var0.field1512[0].field1450;
							var4 = var0.field1512[0].field1456;
							if (0.0D != (double)var17) {
								var4 -= var12 * var18 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (var0.field1529 == class124.field1492) {
					if ((double)var11 != 0.0D) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (var0.field1529 != class124.field1490 && var0.field1529 != class124.field1491) {
					if (var0.field1529 == class124.field1488) {
						var12 = var1 - var6;
						var17 = var0.field1512[var0.method3005() - 1].field1454;
						var18 = var0.field1512[var0.method3005() - 1].field1451;
						var4 = var0.field1512[var0.method3005() - 1].field1456;
						if (0.0D != (double)var17) {
							var4 += var18 * var12 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = class352.method6614(var0, var12);
				float var19;
				if (var2 && var0.field1513 == class124.field1491) {
					var19 = var0.field1512[var0.method3005() - 1].field1456 - var0.field1512[0].field1456;
					var4 = (float)((double)var4 - (double)var19 * var9);
				} else if (!var2 && var0.field1529 == class124.field1491) {
					var19 = var0.field1512[var0.method3005() - 1].field1456 - var0.field1512[0].field1456;
					var4 = (float)((double)var4 + (double)var19 * var9);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}

	static void method1203(class342 var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var7 = (long)(var2 + (var1 << 16));
		class343 var9 = (class343)class345.field4242.method8381(var7);
		if (var9 == null) {
			var9 = (class343)class345.field4244.method8381(var7);
			if (null == var9) {
				var9 = (class343)class345.field4247.method8381(var7);
				if (var9 != null) {
					if (var5) {
						var9.method8040();
						class345.field4242.method8382(var9, var7);
						--class345.field4257;
						++class345.field4243;
					}

				} else {
					if (!var5) {
						var9 = (class343)class345.field4249.method8381(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class343();
					var9.field4220 = var0;
					var9.field4216 = var3;
					var9.field4218 = var4;
					if (var5) {
						class345.field4242.method8382(var9, var7);
						++class345.field4243;
					} else {
						class345.field4246.method6700(var9);
						class345.field4247.method8382(var9, var7);
						++class345.field4257;
					}

				}
			}
		}
	}

	static void method1201(int var0, int var1, int var2, int var3, String var4) {
		class317 var6 = class317.method881(var1, var2);
		if (null != var6) {
			if (var6.field3677 != null) {
				class84 var7 = new class84();
				var7.field1048 = var6;
				var7.field1045 = var0;
				var7.field1049 = var4;
				var7.field1052 = var6.field3677;
				class67.method2351(var7);
			}

			boolean var12 = true;
			if (var6.field3686 > 0) {
				var12 = method1200(var6);
			}

			if (var12) {
				int var9 = class26.method353(var6);
				int var10 = var0 - 1;
				boolean var8 = (var9 >> var10 + 1 & 1) != 0;
				if (var8) {
					class289 var11;
					if (var0 == 1) {
						var11 = class331.method6337(class287.field3191, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 2) {
						var11 = class331.method6337(class287.field3169, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 3) {
						var11 = class331.method6337(class287.field3175, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 4) {
						var11 = class331.method6337(class287.field3105, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 5) {
						var11 = class331.method6337(class287.field3147, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 6) {
						var11 = class331.method6337(class287.field3170, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 7) {
						var11 = class331.method6337(class287.field3193, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 8) {
						var11 = class331.method6337(class287.field3162, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 9) {
						var11 = class331.method6337(class287.field3125, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

					if (var0 == 10) {
						var11 = class331.method6337(class287.field3168, Client.field753.field1385);
						var11.field3212.method8644(var1);
						var11.field3212.method8642(var2);
						var11.field3212.method8642(var3);
						Client.field753.method2735(var11);
					}

				}
			}
		}
	}

	static final boolean method1200(class317 var0) {
		int var2 = var0.field3686;
		if (var2 == 205) {
			Client.field761 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				Client.field772.method5795(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				Client.field772.method5817(var3, var4 == 1);
			}

			if (var2 == 324) {
				Client.field772.method5802(0);
			}

			if (var2 == 325) {
				Client.field772.method5802(1);
			}

			if (var2 == 326) {
				class289 var5 = class331.method6337(class287.field3103, Client.field753.field1385);
				Client.field772.method5803(var5.field3212);
				Client.field753.method2735(var5);
				return true;
			} else {
				return false;
			}
		}
	}
}
