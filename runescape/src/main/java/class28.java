import java.util.Arrays;

public class class28 {
	int[] field141;
	int[] field147;

	public class28() {
		this.field141 = new int[112];
		this.field147 = new int[192];
		Arrays.fill(this.field141, 3);
		Arrays.fill(this.field147, 3);
	}

	public void method408(int var1, int var2) {
		if (this.method415(var1) && this.method428(var2)) {
			this.field141[var1] = var2;
		}

	}

	public void method409(char var1, int var2) {
		if (this.method447(var1) && this.method428(var2)) {
			this.field147[var1] = var2;
		}

	}

	public int method410(int var1) {
		return this.method415(var1) ? this.field141[var1] : 0;
	}

	public int method411(char var1) {
		return this.method447(var1) ? this.field147[var1] : 0;
	}

	public boolean method412(int var1) {
		return this.method415(var1) && (1 == this.field141[var1] || this.field141[var1] == 3);
	}

	public boolean method413(char var1) {
		return this.method447(var1) && (this.field147[var1] == 1 || this.field147[var1] == 3);
	}

	public boolean method414(int var1) {
		return this.method415(var1) && (this.field141[var1] == 2 || 3 == this.field141[var1]);
	}

	public boolean method442(char var1) {
		return this.method447(var1) && (2 == this.field147[var1] || 3 == this.field147[var1]);
	}

	boolean method415(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	boolean method447(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	boolean method428(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	static final void method419() {
		class359.method6682(false);
		Client.field560 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < Client.field11.length; ++var2) {
			if (Client.field4877[var2] != -1 && null == Client.field11[var2]) {
				Client.field11[var2] = Client.field4271.method6468(Client.field4877[var2], 0);
				if (null == Client.field11[var2]) {
					var1 = false;
					++Client.field560;
				}
			}

			if (-1 != Client.field4199[var2] && Client.field834[var2] == null) {
				Client.field834[var2] = Client.field4271.method6447(Client.field4199[var2], 0, Client.field2848[var2]);
				if (null == Client.field834[var2]) {
					var1 = false;
					++Client.field560;
				}
			}
		}

		if (!var1) {
			Client.field622 = 1;
		} else {
			Client.field558 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < Client.field11.length; ++var2) {
				byte[] var3 = Client.field834[var2];
				if (null != var3) {
					var4 = 64 * (Client.field3064[var2] >> 8) - Client.field2850;
					var5 = (Client.field3064[var2] & 255) * 64 - Client.field2841;
					if (Client.field689) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= class185.method3555(var3, var4, var5);
				}
			}

			if (!var1) {
				Client.field622 = 2;
			} else {
				if (Client.field622 != 0) {
					class260.method5271(class337.field3961 + class97.field1290 + class97.field1287 + 100 + "%" + class97.field1288, true);
				}

				Client.method6316();
				Client.field180.method4466();

				for (var2 = 0; var2 < 4; ++var2) {
					Client.field561[var2].method4115();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							class78.field1006[var2][var16][var4] = 0;
						}
					}
				}

				Client.method6316();
				class78.method3134();
				var2 = Client.field11.length;
				class66.method3796();
				class359.method6682(true);
				int var18;
				if (!Client.field689) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (Client.field3064[var16] >> 8) * 64 - Client.field2850;
						var5 = (Client.field3064[var16] & 255) * 64 - Client.field2841;
						var6 = Client.field11[var16];
						if (var6 != null) {
							Client.method6316();
							class242.method4834(var6, var4, var5, Client.field165 * 8 - 48, Client.field4672 * 8 - 48, Client.field561);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (Client.field3064[var16] >> 8) * 64 - Client.field2850;
						var5 = (Client.field3064[var16] & 255) * 64 - Client.field2841;
						var6 = Client.field11[var16];
						if (null == var6 && Client.field4672 < 800) {
							Client.method6316();
							class123.method2981(var4, var5, 64, 64);
						}
					}

					class359.method6682(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = Client.field834[var16];
						if (null != var17) {
							var5 = 64 * (Client.field3064[var16] >> 8) - Client.field2850;
							var18 = 64 * (Client.field3064[var16] & 255) - Client.field2841;
							Client.method6316();
							class148.method3194(var17, var5, var18, Client.field180, Client.field561);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (Client.field689) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						Client.method6316();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = Client.field563[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = (var10 / 8 << 8) + var11 / 8;

									for (int var13 = 0; var13 < Client.field3064.length; ++var13) {
										if (var12 == Client.field3064[var13] && null != Client.field11[var13]) {
											int var14 = 8 * (var10 - var4);
											int var15 = 8 * (var11 - var5);
											class20.method295(Client.field11[var13], var16, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, var14, var15, Client.field561);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									class229.method4583(var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = Client.field563[0][var16][var4];
							if (var5 == -1) {
								class123.method2981(var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					class359.method6682(true);

					for (var16 = 0; var16 < 4; ++var16) {
						Client.method6316();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = Client.field563[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < Client.field3064.length; ++var12) {
										if (Client.field3064[var12] == var11 && null != Client.field834[var12]) {
											class78.method2110(Client.field834[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, Client.field180, Client.field561);
											break;
										}
									}
								}
							}
						}
					}
				}

				class359.method6682(true);
				Client.method6316();
				class11.method99(Client.field180, Client.field561);
				class359.method6682(true);
				var16 = class78.field999;
				if (var16 > Client.field231) {
					var16 = Client.field231;
				}

				if (var16 < Client.field231 - 1) {
					var16 = Client.field231 - 1;
				}

				if (Client.field493) {
					Client.field180.method4437(class78.field999);
				} else {
					Client.field180.method4437(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						class122.method2927(var4, var5);
					}
				}

				Client.method6316();
				class26.method380();
				class201.field2160.method5467();
				class289 var20;
				if (Client.field466.method669()) {
					var20 = class331.method6337(class287.field3135, Client.field753.field1385);
					var20.field3212.method8644(1057001181);
					Client.field753.method2735(var20);
				}

				if (!Client.field689) {
					var4 = (Client.field165 - 6) / 8;
					var5 = (6 + Client.field165) / 8;
					var18 = (Client.field4672 - 6) / 8;
					var7 = (Client.field4672 + 6) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								Client.field4271.method6470("m" + var8 + "_" + var9);
								Client.field4271.method6470("l" + var8 + "_" + var9);
							}
						}
					}
				}

				class139.method3145(30);
				Client.method6316();
				class78.method4547();
				var20 = class331.method6337(class287.field3173, Client.field753.field1385);
				Client.field753.method2735(var20);
				class96.method2569();
			}
		}
	}
}
