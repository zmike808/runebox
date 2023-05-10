public class class403 extends class410 {
	int field4556;
	final class469 field4557;
	public class366 field4559;

	public class403(class469 var1) {
		super(400);
		this.field4556 = 1;
		this.field4559 = new class366();
		this.field4557 = var1;
	}

	class408 method7631() {
		return new class405();
	}

	class408[] method7628(int var1) {
		return new class405[var1];
	}

	public boolean method7505(class513 var1, boolean var2) {
		class405 var4 = (class405)this.method7647(var1);
		if (null == var4) {
			return false;
		} else {
			return !var2 || 0 != var4.field4600;
		}
	}

	public void method7490(class489 var1, int var2) {
		while (true) {
			if (var1.field4989 < var2) {
				boolean var4 = var1.method8658() == 1;
				class513 var5 = new class513(var1.method8669(), this.field4557);
				class513 var6 = new class513(var1.method8669(), this.field4557);
				int var7 = var1.method8660();
				int var8 = var1.method8658();
				int var9 = var1.method8658();
				boolean var10 = (var9 & 2) != 0;
				boolean var11 = 0 != (var9 & 1);
				if (var7 > 0) {
					var1.method8669();
					var1.method8658();
					var1.method8664();
				}

				var1.method8669();
				if (var5 != null && var5.method9258()) {
					class405 var12 = (class405)this.method7614(var5);
					if (var4) {
						class405 var13 = (class405)this.method7614(var6);
						if (null != var13 && var13 != var12) {
							if (var12 != null) {
								this.method7624(var13);
							} else {
								var12 = var13;
							}
						}
					}

					if (var12 != null) {
						this.method7626(var12, var5, var6);
						if (var7 != var12.field4600) {
							boolean var15 = true;

							for (class406 var14 = (class406)this.field4559.method6830(); null != var14; var14 = (class406)this.field4559.method6833()) {
								if (var14.field4573.equals(var5)) {
									if (var7 != 0 && var14.field4575 == 0) {
										var14.method8039();
										var15 = false;
									} else if (var7 == 0 && var14.field4575 != 0) {
										var14.method8039();
										var15 = false;
									}
								}
							}

							if (var15) {
								this.field4559.method6835(new class406(var5, var7));
							}
						}
					} else {
						if (this.method7610() >= 400) {
							continue;
						}

						var12 = (class405)this.method7644(var5, var6);
					}

					if (var12.field4600 != var7) {
						var12.field4598 = ++this.field4556 - 1;
						if (-1 == var12.field4600 && var7 == 0) {
							var12.field4598 = -(var12.field4598 * 1270747397) * 1907692493;
						}

						var12.field4600 = var7;
					}

					var12.field4599 = var8;
					var12.field4572 = var10;
					var12.field4571 = var11;
					continue;
				}

				throw new IllegalStateException();
			}

			this.method7621();
			return;
		}
	}

	static void method7506(class207 var0) {
		if (var0 != null && null != var0.field2346) {
			if (var0.field2346.field3571 >= 0) {
				class317 var2 = class166.method3349(var0.field2346.field3589);
				if (var2 == null || var2.field3707 == null || 0 == var2.field3707.length || var0.field2346.field3571 >= var2.field3707.length || var2.field3707[var0.field2346.field3571] != var0.field2346) {
					return;
				}
			}

			if (var0.field2346.field3598 == 11 && var0.field2345 == 0) {
				if (var0.field2346.method6141(var0.field2349, var0.field2344, 0, 0)) {
					switch(var0.field2346.method6145()) {
					case 0:
						class411.method7690(var0.field2346.method6263(), true, false);
						break;
					case 1:
						if (class201.method3898(class26.method353(var0.field2346))) {
							int[] var5 = var0.field2346.method6148();
							if (null != var5) {
								class289 var3 = class331.method6337(class287.field3138, Client.field753.field1385);
								var3.field3212.method8645(var5[0]);
								var3.field3212.method8709(var0.field2346.field3570);
								var3.field3212.method8644(var5[1]);
								var3.field3212.method8711(var0.field2346.method6146());
								var3.field3212.method8645(var5[2]);
								var3.field3212.method8734(var0.field2346.field3571);
								Client.field753.method2735(var3);
							}
						}
					}
				}
			} else if (12 == var0.field2346.field3598) {
				class315 var4 = var0.field2346.method6152();
				if (var4 != null && var4.method5899()) {
					switch(var0.field2345) {
					case 0:
						Client.field723.method4049(var0.field2346);
						var4.method5847(true);
						var4.method5886(var0.field2349, var0.field2344, Client.field722.method4076(82), Client.field722.method4076(81));
						break;
					case 1:
						var4.method5875(var0.field2349, var0.field2344);
					}
				}
			}

		}
	}
}
