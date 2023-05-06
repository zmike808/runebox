import java.util.Date;

public class class62 extends class210 {
	class62() {
	}

	protected boolean method4127(int var1, int var2, int var3, class209 var4) {
		return var2 == super.field2387 && super.field2385 == var3;
	}

	static int method1213(int var0, class75 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = class67.field842[--class67.field1015];
			var10 = class67.field843[--class67.field836];
			class67.field842[++class67.field1015 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				class67.field1015 -= 2;
				var4 = class67.field842[class67.field1015];
				var5 = class67.field842[1 + class67.field1015];
				class67.field842[++class67.field1015 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = class67.field842[--class67.field1015];
				var10 = class67.field843[--class67.field836];
				class67.field842[++class67.field1015 - 1] = var4 + class185.method3577(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = class67.field842[--class67.field1015];
				class67.field842[++class67.field1015 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = class67.field843[--class67.field836];
					long var16 = ((long)var13 + 11745L) * 86400000L;
					class67.field848.setTime(new Date(var16));
					var7 = class67.field848.get(5);
					int var18 = class67.field848.get(2);
					int var9 = class67.field848.get(1);
					class67.field842[++class67.field1015 - 1] = var7 + "-" + class67.field849[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = class67.field843[--class67.field836];
						class67.field842[++class67.field1015 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						class67.field1015 -= 2;
						class67.field843[++class67.field836 - 1] = class372.method2898(class17.method218(class67.field842[class67.field1015], class67.field842[class67.field1015 + 1], class67.field1736));
						return 1;
					} else {
						int var12;
						byte[] var15;
						class379 var17;
						if (var0 == 4108) {
							var4 = class67.field842[--class67.field1015];
							class67.field836 -= 2;
							var10 = class67.field843[class67.field836];
							var12 = class67.field843[1 + class67.field836];
							var15 = Client.field1568.method6468(var12, 0);
							var17 = new class379(var15);
							class67.field843[++class67.field836 - 1] = var17.method7198(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = class67.field842[--class67.field1015];
							class67.field836 -= 2;
							var10 = class67.field843[class67.field836];
							var12 = class67.field843[1 + class67.field836];
							var15 = Client.field1568.method6468(var12, 0);
							var17 = new class379(var15);
							class67.field843[++class67.field836 - 1] = var17.method7240(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							class67.field1015 -= 2;
							var4 = class67.field842[class67.field1015];
							var5 = class67.field842[1 + class67.field1015];
							if (class67.field843[--class67.field836] == 1) {
								class67.field842[++class67.field1015 - 1] = var4;
							} else {
								class67.field842[++class67.field1015 - 1] = var5;
							}

							return 1;
						} else if (var0 == 4111) {
							var4 = class67.field842[--class67.field1015];
							class67.field842[++class67.field1015 - 1] = class383.method7246(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = class67.field842[--class67.field1015];
							var10 = class67.field843[--class67.field836];
							class67.field842[++class67.field1015 - 1] = var4 + (char)var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = class67.field843[--class67.field836];
							class67.field843[++class67.field836 - 1] = class184.method3554((char)var13, (byte)4) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = class67.field843[--class67.field836];
							class67.field843[++class67.field836 - 1] = class70.method1983((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = class67.field843[--class67.field836];
							class67.field843[++class67.field836 - 1] = class135.method3117((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = class67.field843[--class67.field836];
							class67.field843[++class67.field836 - 1] = class150.method3204((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = class67.field842[--class67.field1015];
							if (null != var4) {
								class67.field843[++class67.field836 - 1] = var4.length();
							} else {
								class67.field843[++class67.field836 - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var4 = class67.field842[--class67.field1015];
							class67.field836 -= 2;
							var10 = class67.field843[class67.field836];
							var12 = class67.field843[1 + class67.field836];
							class67.field842[++class67.field1015 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = class67.field842[--class67.field1015];
							StringBuilder var11 = new StringBuilder(var4.length());
							boolean var14 = false;

							for (var7 = 0; var7 < var4.length(); ++var7) {
								char var8 = var4.charAt(var7);
								if (var8 == '<') {
									var14 = true;
								} else if (var8 == '>') {
									var14 = false;
								} else if (!var14) {
									var11.append(var8);
								}
							}

							class67.field842[++class67.field1015 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = class67.field842[--class67.field1015];
							var10 = class67.field843[--class67.field836];
							class67.field843[++class67.field836 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							class67.field1015 -= 2;
							var4 = class67.field842[class67.field1015];
							var5 = class67.field842[1 + class67.field1015];
							var12 = class67.field843[--class67.field836];
							class67.field843[++class67.field836 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = class67.field842[--class67.field1015];
							class67.field842[++class67.field1015 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class67.field1015 -= 3;
							var4 = class67.field842[class67.field1015];
							var5 = class67.field842[class67.field1015 + 1];
							String var6 = class67.field842[2 + class67.field1015];
							if (null == Client.field3454.field1097) {
								class67.field842[++class67.field1015 - 1] = var6;
								return 1;
							} else {
								switch(Client.field3454.field1097.field3512) {
								case 0:
									class67.field842[++class67.field1015 - 1] = var4;
									break;
								case 1:
									class67.field842[++class67.field1015 - 1] = var5;
									break;
								case 2:
								default:
									class67.field842[++class67.field1015 - 1] = var6;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class67.field1015 -= 2;
					var4 = class67.field842[class67.field1015];
					var5 = class67.field842[1 + class67.field1015];
					if (null != Client.field3454.field1097 && 0 != Client.field3454.field1097.field3522) {
						class67.field842[++class67.field1015 - 1] = var5;
					} else {
						class67.field842[++class67.field1015 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}
}
