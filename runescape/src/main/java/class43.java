import java.util.concurrent.ScheduledExecutorService;

public class class43 {
	public static class51 field300;
	public static int field1411;
	static class45 field4307;
	static ScheduledExecutorService field330;
	boolean field313;
	class49 field302;
	class49[] field305;
	class49[] field316;
	int field297;
	int field298;
	int field303;
	int field306;
	int field309;
	int field311;
	int field312;
	int field315;
	long field304;
	long field308;
	long field310;
	protected int[] field301;

	protected class43() {
		this.field303 = 32;
		this.field304 = class294.method2575();
		this.field308 = 0L;
		this.field309 = 0;
		this.field297 = 0;
		this.field311 = 0;
		this.field310 = 0L;
		this.field313 = true;
		this.field315 = 0;
		this.field305 = new class49[8];
		this.field316 = new class49[8];
	}

	public final synchronized void method813(class49 var1) {
		this.field302 = var1;
	}

	public final synchronized void method828() {
		if (this.field301 != null) {
			long var2 = class294.method2575();

			try {
				if (0L != this.field308) {
					if (var2 < this.field308) {
						return;
					}

					this.method822(this.field312);
					this.field308 = 0L;
					this.field313 = true;
				}

				int var4 = this.method823();
				if (this.field311 - var4 > this.field309) {
					this.field309 = this.field311 - var4;
				}

				int var5 = this.field298 + this.field306;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field312) {
					this.field312 += 1024;
					if (this.field312 > 16384) {
						this.field312 = 16384;
					}

					this.method825();
					this.method822(this.field312);
					var4 = 0;
					this.field313 = true;
					if (var5 + 256 > this.field312) {
						var5 = this.field312 - 256;
						this.field298 = var5 - this.field306;
					}
				}

				while (var4 < var5) {
					this.method819(this.field301, 256);
					this.method830();
					var4 += 256;
				}

				if (var2 > this.field310) {
					if (!this.field313) {
						if (this.field309 == 0 && this.field297 == 0) {
							this.method825();
							this.field308 = var2 + 2000L;
							return;
						}

						this.field298 = Math.min(this.field297, this.field309);
						this.field297 = this.field309;
					} else {
						this.field313 = false;
					}

					this.field309 = 0;
					this.field310 = var2 + 2000L;
				}

				this.field311 = var4;
			} catch (Exception var7) {
				this.method825();
				this.field308 = var2 + 2000L;
			}

			try {
				if (var2 > 500000L + this.field304) {
					var2 = this.field304;
				}

				while (var2 > 5000L + this.field304) {
					this.method818(256);
					this.field304 += (long)(256000 / class299.field307);
				}
			} catch (Exception var6) {
				this.field304 = var2;
			}

		}
	}

	public final void method815() {
		this.field313 = true;
	}

	public final synchronized void method847() {
		this.field313 = true;

		try {
			this.method826();
		} catch (Exception var3) {
			this.method825();
			this.field308 = class294.method2575() + 2000L;
		}

	}

	public final synchronized void method817(byte var1) {
		if (field4307 != null) {
			if (var1 != -1) {
				return;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (var1 != -1) {
					return;
				}

				if (this == field4307.field332[var3]) {
					if (var1 != -1) {
						throw new IllegalStateException();
					}

					field4307.field332[var3] = null;
				}

				if (null != field4307.field332[var3]) {
					var2 = false;
				}
			}

			if (var2) {
				if (var1 != -1) {
					return;
				}

				field330.shutdownNow();
				field330 = null;
				field4307 = null;
			}
		}

		this.method825();
		this.field301 = null;
	}

	final void method818(int var1) {
		this.field315 -= var1;
		if (this.field315 < 0) {
			this.field315 = 0;
		}

		if (null != this.field302) {
			this.field302.method1046(var1);
		}

	}

	final void method819(int[] var1, int var2) {
		int var3 = var2;
		if (class48.field314) {
			var3 = var2 << 1;
		}

		class385.method7296(var1, 0, var3);
		this.field315 -= var2;
		if (null != this.field302 && this.field315 <= 0) {
			this.field315 += class299.field307 >> 4;
			method4088(this.field302);
			this.method824(this.field302, this.field302.method1061());
			int var4 = 0;
			int var5 = 255;

			int var6;
			class49 var10;
			label103:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if (0 != (var9 & 1)) {
						var5 &= ~(1 << var7);
						var10 = null;
						class49 var11 = this.field305[var7];

						label97:
						while (true) {
							while (true) {
								if (null == var11) {
									break label97;
								}

								class59 var12 = var11.field365;
								if (var12 != null && var12.field461 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field364;
								} else {
									var11.field363 = true;
									int var13 = var11.method1044();
									var4 += var13;
									if (null != var12) {
										var12.field461 += var13;
									}

									if (var4 >= this.field303) {
										break label103;
									}

									class49 var14 = var11.method1042();
									if (null != var14) {
										for (int var15 = var11.field366; null != var14; var14 = var11.method1040()) {
											this.method824(var14, var15 * var14.method1061() >> 8);
										}
									}

									class49 var18 = var11.field364;
									var11.field364 = null;
									if (null == var10) {
										this.field305[var7] = var18;
									} else {
										var10.field364 = var18;
									}

									if (var18 == null) {
										this.field316[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				class49 var16 = this.field305[var6];
				class49[] var17 = this.field305;
				this.field316[var6] = null;

				for (var17[var6] = null; null != var16; var16 = var10) {
					var10 = var16.field364;
					var16.field364 = null;
				}
			}
		}

		if (this.field315 < 0) {
			this.field315 = 0;
		}

		if (this.field302 != null) {
			this.field302.method1064(var1, 0, var2);
		}

		this.field304 = class294.method2575();
	}

	final void method824(class49 var1, int var2) {
		int var4 = var2 >> 5;
		class49 var5 = this.field316[var4];
		if (var5 == null) {
			this.field305[var4] = var1;
		} else {
			var5.field364 = var1;
		}

		this.field316[var4] = var1;
		var1.field366 = var2;
	}

	protected void method821() throws Exception {
	}

	protected void method822(int var1) throws Exception {
	}

	protected int method823() throws Exception {
		return this.field312;
	}

	protected void method830() throws Exception {
	}

	protected void method825() {
	}

	protected void method826() throws Exception {
	}

	static final void method4088(class49 var0) {
		var0.field363 = false;
		if (null != var0.field365) {
			var0.field365.field461 = 0;
		}

		for (class49 var2 = var0.method1042(); var2 != null; var2 = var0.method1040()) {
			method4088(var2);
		}

	}
}
