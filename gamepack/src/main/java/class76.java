public class class76 extends class225 {
	class204 field987;
	int field975;
	int field976;
	int field977;
	int field978;
	int field979;
	int field980;
	int field981;
	int field982;

	class76(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class225 var9) {
		this.field980 = var1;
		this.field981 = var2;
		this.field976 = var3;
		this.field975 = var4;
		this.field977 = var5;
		this.field979 = var6;
		if (var7 != -1) {
			this.field987 = class81.method2189(var7, (byte)2);
			this.field978 = 0;
			this.field982 = Client.field602 - 1;
			if (this.field987.field2315 == 0 && var9 != null && var9 instanceof class76) {
				class76 var10 = (class76)var9;
				if (var10.field987 == this.field987) {
					this.field978 = var10.field978;
					this.field982 = var10.field982;
					return;
				}
			}

			if (var8 && this.field987.field2301 != -1) {
				if (!this.field987.method4004()) {
					this.field978 = (int)(Math.random() * (double)this.field987.field2300.length);
					this.field982 -= (int)(Math.random() * (double)this.field987.field2304[this.field978]);
				} else {
					this.field978 = (int)(Math.random() * (double)this.field987.method4005());
				}
			}
		}

	}

	protected final class232 method4541() {
		int var3;
		if (null != this.field987) {
			int var2 = Client.field602 - this.field982;
			if (var2 > 100 && this.field987.field2301 > 0) {
				var2 = 100;
			}

			if (this.field987.method4004()) {
				var3 = this.field987.method4005();
				this.field978 += var2;
				var2 = 0;
				if (this.field978 >= var3) {
					this.field978 = var3 - this.field987.field2301;
					if (this.field978 < 0 || this.field978 > var3) {
						this.field987 = null;
					}
				}
			} else {
				label68: {
					do {
						do {
							if (var2 <= this.field987.field2304[this.field978]) {
								break label68;
							}

							var2 -= this.field987.field2304[this.field978];
							++this.field978;
						} while(this.field978 < this.field987.field2300.length);

						this.field978 -= this.field987.field2301;
					} while(this.field978 >= 0 && this.field978 < this.field987.field2300.length);

					this.field987 = null;
				}
			}

			this.field982 = Client.field602 - var2;
		}

		class201 var13 = class145.method3177(this.field980);
		if (var13.field2198 != null) {
			var13 = var13.method3857();
		}

		if (var13 == null) {
			return null;
		} else {
			int var4;
			if (this.field976 != 1 && 3 != this.field976) {
				var3 = var13.field2172;
				var4 = var13.field2173;
			} else {
				var3 = var13.field2173;
				var4 = var13.field2172;
			}

			int var5 = this.field977 + (var3 >> 1);
			int var6 = this.field977 + (var3 + 1 >> 1);
			int var7 = (var4 >> 1) + this.field979;
			int var8 = this.field979 + (var4 + 1 >> 1);
			int[][] var9 = class78.field1002[this.field975];
			int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
			int var11 = (var3 << 6) + (this.field977 << 7);
			int var12 = (var4 << 6) + (this.field979 << 7);
			return var13.method3855(this.field981, this.field976, var9, var11, var10, var12, this.field987, this.field978);
		}
	}

	static final void method2096(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Client.field112.method2392(!Client.field112.method2457());
			if (Client.field112.method2457()) {
				class106.method2852(99, "", "Roofs are now all hidden");
			} else {
				class106.method2852(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var2 = class372.method5513(var0.substring(5).trim()) == 1;
			Client.field466.method532(var2);
			class219.method5907(var2);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.field518 = !Client.field518;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.field112.method2387();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.field615 = !Client.field615;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.field644 = !Client.field644;
		}

		if (Client.field682 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				Client.field1542.field4867 = !Client.field1542.field4867;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.field112.method2427(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.field112.method2427(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Client.method6595();
			}
		}

		class289 var3 = class331.method6337(class287.field3181, Client.field753.field1385);
		var3.field3212.method8695(var0.length() + 1);
		var3.field3212.method8648(var0);
		Client.field753.method2735(var3);
	}

	static final void method2089(class88 var0, int var1, int var2, int var3) {
		if (var0 != Client.field3454) {
			if (Client.field633 < 400) {
				String var5;
				if (0 == var0.field1085) {
					var5 = var0.field1103[0] + var0.field1089 + var0.field1103[1] + class81.method2187(var0.field1102, Client.field3454.field1102) + " " + class97.field1287 + class337.field4006 + var0.field1102 + class97.field1288 + var0.field1103[2];
				} else {
					var5 = var0.field1103[0] + var0.field1089 + var0.field1103[1] + " " + class97.field1287 + class337.field4007 + var0.field1085 + class97.field1288 + var0.field1103[2];
				}

				int var6;
				if (Client.field649 == 1) {
					Client.method1986(class337.field4000, Client.field497 + " " + class97.field1284 + " " + class97.method7285(16777215) + var5, 14, var1, var2, var3);
				} else if (Client.field651) {
					if ((Client.field958 & 8) == 8) {
						Client.method1986(Client.field663, Client.field655 + " " + class97.field1284 + " " + class97.method7285(16777215) + var5, 15, var1, var2, var3);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (null != Client.field736[var6]) {
							short var7 = 0;
							if (Client.field736[var6].equalsIgnoreCase(class337.field4002)) {
								if (Client.field501 == class99.field1309) {
									continue;
								}

								if (Client.field501 == class99.field1306 || class99.field1307 == Client.field501 && var0.field1102 > Client.field3454.field1102) {
									var7 = 2000;
								}

								if (Client.field3454.field1104 != 0 && var0.field1104 != 0) {
									if (var0.field1104 == Client.field3454.field1104) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.field501 == class99.field1308 && var0.method2241()) {
									var7 = 2000;
								}
							} else if (Client.field588[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = var7 + Client.field598[var6];
							Client.method1986(Client.field736[var6], class97.method7285(16777215) + var5, var9, var1, var2, var3);
						}
					}
				}

				for (var6 = 0; var6 < Client.field633; ++var6) {
					if (23 == Client.field636[var6]) {
						Client.field581[var6] = class97.method7285(16777215) + var5;
						break;
					}
				}

			}
		}
	}

	static final void method2093(class317 var0, int var1, int var2, int var3) {
		class306 var5 = var0.method6132(false, (byte)65);
		if (var5 != null) {
			if (Client.field653 < 3) {
				Client.field994.method9093(var1, var2, var5.field3477, var5.field3472, 25, 25, Client.field758, 256, var5.field3475, var5.field3474);
			} else {
				class499.method9017(var1, var2, 0, var5.field3475, var5.field3474);
			}

		}
	}
}
