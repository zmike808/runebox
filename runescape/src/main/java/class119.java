public class class119 extends class409 {
	final boolean field1447;

	public class119(boolean var1) {
		this.field1447 = var1;
	}

	int method2899(class412 var1, class412 var2) {
		if (var1.field4600 != 0 && 0 != var2.field4600) {
			return this.field1447 ? var1.method7576().method9260(var2.method7576()) : var2.method7576().method9260(var1.method7576());
		} else {
			return this.method7598(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2899((class412)var1, (class412)var2);
	}

	static boolean method2908(long var0) {
		return class233.method4582(var0) == 2;
	}

	static int method2900(int var0, class75 var1, boolean var2) {
		if (var0 == 5000) {
			class67.field843[++class67.field836 - 1] = Client.field717;
			return 1;
		} else if (var0 == 5001) {
			class67.field836 -= 3;
			Client.field717 = class67.field843[class67.field836];
			class67.field2100 = class508.method7469(class67.field843[class67.field836 + 1]);
			if (class67.field2100 == null) {
				class67.field2100 = class508.field5129;
			}

			Client.field578 = class67.field843[2 + class67.field836];
			class289 var14 = class331.method6337(class287.field3137, Client.field753.field1385);
			var14.field3212.method8695(Client.field717);
			var14.field3212.method8695(class67.field2100.field5132);
			var14.field3212.method8695(Client.field578);
			Client.field753.method2735(var14);
			return 1;
		} else {
			String var4;
			class289 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = class67.field842[--class67.field1015];
				class67.field836 -= 2;
				var9 = class67.field843[class67.field836];
				var11 = class67.field843[class67.field836 + 1];
				var7 = class331.method6337(class287.field3172, Client.field753.field1385);
				var7.field3212.method8695(class489.method2092(var4) + 2);
				var7.field3212.method8648(var4);
				var7.field3212.method8695(var9 - 1);
				var7.field3212.method8695(var11);
				Client.field753.method2735(var7);
				return 1;
			} else {
				class61 var6;
				int var8;
				if (var0 == 5003) {
					class67.field836 -= 2;
					var8 = class67.field843[class67.field836];
					var9 = class67.field843[1 + class67.field836];
					var6 = class106.method2317(var8, var9);
					if (var6 != null) {
						class67.field843[++class67.field836 - 1] = var6.field471;
						class67.field843[++class67.field836 - 1] = var6.field472;
						class67.field842[++class67.field1015 - 1] = null != var6.field473 ? var6.field473 : "";
						class67.field842[++class67.field1015 - 1] = null != var6.field474 ? var6.field474 : "";
						class67.field842[++class67.field1015 - 1] = var6.field479 != null ? var6.field479 : "";
						class67.field843[++class67.field836 - 1] = var6.method1170() ? 1 : (var6.method1174() ? 2 : 0);
					} else {
						class67.field843[++class67.field836 - 1] = -1;
						class67.field843[++class67.field836 - 1] = 0;
						class67.field842[++class67.field1015 - 1] = "";
						class67.field842[++class67.field1015 - 1] = "";
						class67.field842[++class67.field1015 - 1] = "";
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else {
					class61 var5;
					if (var0 == 5004) {
						var8 = class67.field843[--class67.field836];
						var5 = class106.method2211(var8);
						if (null != var5) {
							class67.field843[++class67.field836 - 1] = var5.field478;
							class67.field843[++class67.field836 - 1] = var5.field472;
							class67.field842[++class67.field1015 - 1] = null != var5.field473 ? var5.field473 : "";
							class67.field842[++class67.field1015 - 1] = null != var5.field474 ? var5.field474 : "";
							class67.field842[++class67.field1015 - 1] = var5.field479 != null ? var5.field479 : "";
							class67.field843[++class67.field836 - 1] = var5.method1170() ? 1 : (var5.method1174() ? 2 : 0);
						} else {
							class67.field843[++class67.field836 - 1] = -1;
							class67.field843[++class67.field836 - 1] = 0;
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field842[++class67.field1015 - 1] = "";
							class67.field843[++class67.field836 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (class67.field2100 == null) {
							class67.field843[++class67.field836 - 1] = -1;
						} else {
							class67.field843[++class67.field836 - 1] = class67.field2100.field5132;
						}

						return 1;
					} else {
						class289 var12;
						if (var0 == 5008) {
							var4 = class67.field842[--class67.field1015];
							var9 = class67.field843[--class67.field836];
							var12 = class315.method5985(var9, var4, class67.field1736, -1);
							Client.field753.method2735(var12);
							return 1;
						} else if (var0 == 5009) {
							class67.field1015 -= 2;
							var4 = class67.field842[class67.field1015];
							String var10 = class67.field842[class67.field1015 + 1];
							var12 = class331.method6337(class287.field3157, Client.field753.field1385);
							var12.field3212.method8642(0);
							int var13 = var12.field3212.field4989;
							var12.field3212.method8648(var4);
							class320.method4969(var12.field3212, var10);
							var12.field3212.method8654(var12.field3212.field4989 - var13);
							Client.field753.method2735(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = class67.field842[--class67.field1015];
							class67.field836 -= 2;
							var9 = class67.field843[class67.field836];
							var11 = class67.field843[1 + class67.field836];
							var7 = class315.method5985(var9, var4, class67.field1736, var11);
							Client.field753.method2735(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								class67.field843[++class67.field836 - 1] = Client.field578;
								return 1;
							} else if (var0 == 5017) {
								var8 = class67.field843[--class67.field836];
								class67.field843[++class67.field836 - 1] = class64.method1773(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = class67.field843[--class67.field836];
								class67.field843[++class67.field836 - 1] = class106.method4551(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = class67.field843[--class67.field836];
								class67.field843[++class67.field836 - 1] = class106.method2886(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = class67.field842[--class67.field1015];
								class76.method2096(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field719 = class67.field842[--class67.field1015].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								class67.field842[++class67.field1015 - 1] = Client.field719;
								return 1;
							} else if (var0 == 5023) {
								var4 = class67.field842[--class67.field1015];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								class67.field836 -= 2;
								var8 = class67.field843[class67.field836];
								var9 = class67.field843[class67.field836 + 1];
								var6 = class106.method2317(var8, var9);
								if (null != var6) {
									class67.field843[++class67.field836 - 1] = var6.field471;
									class67.field843[++class67.field836 - 1] = var6.field472;
									class67.field842[++class67.field1015 - 1] = null != var6.field473 ? var6.field473 : "";
									class67.field842[++class67.field1015 - 1] = null != var6.field474 ? var6.field474 : "";
									class67.field842[++class67.field1015 - 1] = null != var6.field479 ? var6.field479 : "";
									class67.field843[++class67.field836 - 1] = var6.method1170() ? 1 : (var6.method1174() ? 2 : 0);
									class67.field842[++class67.field1015 - 1] = "";
									class67.field843[++class67.field836 - 1] = 0;
								} else {
									class67.field843[++class67.field836 - 1] = -1;
									class67.field843[++class67.field836 - 1] = 0;
									class67.field842[++class67.field1015 - 1] = "";
									class67.field842[++class67.field1015 - 1] = "";
									class67.field842[++class67.field1015 - 1] = "";
									class67.field843[++class67.field836 - 1] = 0;
									class67.field842[++class67.field1015 - 1] = "";
									class67.field843[++class67.field836 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var8 = class67.field843[--class67.field836];
								var5 = class106.method2211(var8);
								if (null != var5) {
									class67.field843[++class67.field836 - 1] = var5.field478;
									class67.field843[++class67.field836 - 1] = var5.field472;
									class67.field842[++class67.field1015 - 1] = null != var5.field473 ? var5.field473 : "";
									class67.field842[++class67.field1015 - 1] = var5.field474 != null ? var5.field474 : "";
									class67.field842[++class67.field1015 - 1] = var5.field479 != null ? var5.field479 : "";
									class67.field843[++class67.field836 - 1] = var5.method1170() ? 1 : (var5.method1174() ? 2 : 0);
									class67.field842[++class67.field1015 - 1] = "";
									class67.field843[++class67.field836 - 1] = 0;
								} else {
									class67.field843[++class67.field836 - 1] = -1;
									class67.field843[++class67.field836 - 1] = 0;
									class67.field842[++class67.field1015 - 1] = "";
									class67.field842[++class67.field1015 - 1] = "";
									class67.field842[++class67.field1015 - 1] = "";
									class67.field843[++class67.field836 - 1] = 0;
									class67.field842[++class67.field1015 - 1] = "";
									class67.field843[++class67.field836 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (Client.field3454 != null && null != Client.field3454.field1089) {
								var4 = Client.field3454.field1089.method9256();
							} else {
								var4 = "";
							}

							class67.field842[++class67.field1015 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}
}
