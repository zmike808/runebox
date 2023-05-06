public class class302 extends class49 {
	static int field4876;
	class299 field3444;
	class363 field3445;
	class39 field3446;

	class302(class299 var1) {
		this.field3445 = new class363();
		this.field3446 = new class39();
		this.field3444 = var1;
	}

	protected class49 method1042() {
		class304 var1 = (class304)this.field3445.method6716();
		if (var1 == null) {
			return null;
		} else {
			return (class49)(null != var1.field3464 ? var1.field3464 : this.method1040());
		}
	}

	protected class49 method1040() {
		class304 var1;
		do {
			var1 = (class304)this.field3445.method6725();
			if (var1 == null) {
				return null;
			}
		} while(var1.field3464 == null);

		return var1.field3464;
	}

	protected int method1044() {
		return 0;
	}

	protected void method1064(int[] var1, int var2, int var3) {
		this.field3446.method1064(var1, var2, var3);

		for (class304 var6 = (class304)this.field3445.method6716(); var6 != null; var6 = (class304)this.field3445.method6725()) {
			if (!this.field3444.method5665(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3463) {
						this.method5731(var6, var1, var4, var5, var5 + var4);
						var6.field3463 -= var5;
						break;
					}

					this.method5731(var6, var1, var4, var6.field3463, var4 + var5);
					var4 += var6.field3463;
					var5 -= var6.field3463;
				} while(!this.field3444.method5596(var6, var1, var4, var5));
			}
		}

	}

	protected void method1046(int var1) {
		this.field3446.method1046(var1);

		for (class304 var3 = (class304)this.field3445.method6716(); var3 != null; var3 = (class304)this.field3445.method6725()) {
			if (!this.field3444.method5665(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3463) {
						this.method5730(var3, var2);
						var3.field3463 -= var2;
						break;
					}

					this.method5730(var3, var3.field3463);
					var2 -= var3.field3463;
				} while(!this.field3444.method5596(var3, (int[])null, 0, var2));
			}
		}

	}

	void method5731(class304 var1, int[] var2, int var3, int var4, int var5) {
		if (0 != (this.field3444.field3406[var1.field3468] & 4) && var1.field3465 < 0) {
			int var7 = this.field3444.field3411[var1.field3468] / class299.field307;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field3470) / var7;
				if (var8 > var4) {
					var1.field3470 += var7 * var4;
					break;
				}

				var1.field3464.method1064(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field3470 += var7 * var8 - 1048576;
				int var9 = class299.field307 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				class48 var11 = var1.field3464;
				if (this.field3444.field3409[var1.field3468] == 0) {
					var1.field3464 = class48.method979(var1.field3452, var11.method919(), var11.method910(), var11.method942());
				} else {
					var1.field3464 = class48.method979(var1.field3452, var11.method919(), 0, var11.method942());
					this.field3444.method5600(var1, var1.field3467.field3437[var1.field3455] < 0);
					var1.field3464.method1015(var9, var11.method910());
				}

				if (var1.field3467.field3437[var1.field3455] < 0) {
					var1.field3464.method906(-1);
				}

				var11.method917(var9);
				var11.method1064(var2, var3, var5 - var3);
				if (var11.method1022()) {
					this.field3446.method747(var11);
				}
			}
		}

		var1.field3464.method1064(var2, var3, var4);
	}

	void method5730(class304 var1, int var2) {
		if (0 != (this.field3444.field3406[var1.field3468] & 4) && var1.field3465 < 0) {
			int var4 = this.field3444.field3411[var1.field3468] / class299.field307;
			int var5 = (var4 + 1048575 - var1.field3470) / var4;
			var1.field3470 = var4 * var2 + var1.field3470 & 1048575;
			if (var5 <= var2) {
				if (this.field3444.field3409[var1.field3468] == 0) {
					var1.field3464 = class48.method979(var1.field3452, var1.field3464.method919(), var1.field3464.method910(), var1.field3464.method942());
				} else {
					var1.field3464 = class48.method979(var1.field3452, var1.field3464.method919(), 0, var1.field3464.method942());
					this.field3444.method5600(var1, var1.field3467.field3437[var1.field3455] < 0);
				}

				if (var1.field3467.field3437[var1.field3455] < 0) {
					var1.field3464.method906(-1);
				}

				var2 = var1.field3470 / var4;
			}
		}

		var1.field3464.method1046(var2);
	}

	static int method5729(int var0, class75 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = class67.field843[--class67.field836];
			class67.field842[++class67.field1015 - 1] = class92.method2352(var4).field2261;
			return 1;
		} else {
			class202 var6;
			int var7;
			if (var0 == 4201) {
				class67.field836 -= 2;
				var4 = class67.field843[class67.field836];
				var7 = class67.field843[1 + class67.field836];
				var6 = class92.method2352(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field2220[var7 - 1] != null) {
					class67.field842[++class67.field1015 - 1] = var6.field2220[var7 - 1];
				} else {
					class67.field842[++class67.field1015 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				class67.field836 -= 2;
				var4 = class67.field843[class67.field836];
				var7 = class67.field843[class67.field836 + 1];
				var6 = class92.method2352(var4);
				if (var7 >= 1 && var7 <= 5 && null != var6.field2237[var7 - 1]) {
					class67.field842[++class67.field1015 - 1] = var6.field2237[var7 - 1];
				} else {
					class67.field842[++class67.field1015 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = class92.method2352(var4).field2211;
				return 1;
			} else if (var0 == 4204) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = class92.method2352(var4).field2236 == 1 ? 1 : 0;
				return 1;
			} else {
				class202 var5;
				if (var0 == 4205) {
					var4 = class67.field843[--class67.field836];
					var5 = class92.method2352(var4);
					if (var5.field2254 == -1 && var5.field2253 >= 0) {
						class67.field843[++class67.field836 - 1] = var5.field2253;
					} else {
						class67.field843[++class67.field836 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4206) {
					var4 = class67.field843[--class67.field836];
					var5 = class92.method2352(var4);
					if (var5.field2254 >= 0 && var5.field2253 >= 0) {
						class67.field843[++class67.field836 - 1] = var5.field2253;
					} else {
						class67.field843[++class67.field836 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4207) {
					var4 = class67.field843[--class67.field836];
					class67.field843[++class67.field836 - 1] = class92.method2352(var4).field2231 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = class67.field843[--class67.field836];
					var5 = class92.method2352(var4);
					if (-1 == var5.field2267 && var5.field2266 >= 0) {
						class67.field843[++class67.field836 - 1] = var5.field2266;
					} else {
						class67.field843[++class67.field836 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4209) {
					var4 = class67.field843[--class67.field836];
					var5 = class92.method2352(var4);
					if (var5.field2267 >= 0 && var5.field2266 >= 0) {
						class67.field843[++class67.field836 - 1] = var5.field2266;
					} else {
						class67.field843[++class67.field836 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4210) {
					String var8 = class67.field842[--class67.field1015];
					var7 = class67.field843[--class67.field836];
					class69.method1981(var8, var7 == 1);
					class67.field843[++class67.field836 - 1] = Client.field3040;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						field4876 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = class67.field843[--class67.field836];
						var7 = class92.method2352(var4).method3915();
						if (var7 == -1) {
							class67.field843[++class67.field836 - 1] = var7;
						} else {
							class67.field843[++class67.field836 - 1] = var7 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var4 = class67.field843[--class67.field836];
						class67.field843[++class67.field836 - 1] = class92.method2352(var4).field2232;
						return 1;
					} else if (var0 == 4215) {
						var4 = class67.field843[--class67.field836];
						class67.field843[++class67.field836 - 1] = class92.method2352(var4).field2217;
						return 1;
					} else if (var0 == 4216) {
						var4 = class67.field843[--class67.field836];
						class67.field843[++class67.field836 - 1] = class92.method2352(var4).field2234;
						return 1;
					} else if (var0 == 4217) {
						var4 = class67.field843[--class67.field836];
						var5 = class92.method2352(var4);
						class67.field843[++class67.field836 - 1] = var5.field2252;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (Client.field4549 != null && field4876 < Client.field3040) {
						class67.field843[++class67.field836 - 1] = Client.field4549[++field4876 - 1] & '\uffff';
					} else {
						class67.field843[++class67.field836 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
