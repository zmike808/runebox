public class class352 {
	String field4286;
	String field4287;
	public final class353 field4285;
	public final int field4284;
	public final long field4283;

	class352(class489 var1, byte var2, int var3) {
		this.field4286 = var1.method8669();
		this.field4287 = var1.method8669();
		this.field4284 = var1.method8660();
		this.field4283 = var1.method8681();
		int var4 = var1.method8664();
		int var5 = var1.method8664();
		this.field4285 = new class353();
		this.field4285.method6625(2);
		this.field4285.method6621(var2);
		this.field4285.field4291 = var4;
		this.field4285.field4293 = var5;
		this.field4285.field4289 = 0;
		this.field4285.field4294 = 0;
		this.field4285.field4290 = var3;
	}

	public String method6611() {
		return this.field4286;
	}

	public String method6607() {
		return this.field4287;
	}

	static float method6614(class126 var0, float var1) {
		if (var0 != null && var0.method3005() != 0) {
			if (var1 < (float)var0.field1512[0].field1453) {
				return class124.field1497 == var0.field1513 ? var0.field1512[0].field1456 : class61.method1205(var0, var1, true);
			} else if (var1 > (float)var0.field1512[var0.method3005() - 1].field1453) {
				return class124.field1497 == var0.field1529 ? var0.field1512[var0.method3005() - 1].field1456 : class61.method1205(var0, var1, false);
			} else if (var0.field1509) {
				return var0.field1512[0].field1456;
			} else {
				class121 var3 = var0.method3004(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (var3 == null) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					float var8;
					if ((double)var3.field1454 == 0.0D && (double)var3.field1451 == 0.0D) {
						var4 = true;
					} else if (Float.MAX_VALUE == var3.field1454 && Float.MAX_VALUE == var3.field1451) {
						var5 = true;
					} else if (null != var3.field1455) {
						if (var0.field1525) {
							var6 = (float)var3.field1453;
							float var10 = var3.field1456;
							var7 = var6 + var3.field1454 * 0.33333334F;
							float var11 = var10 + var3.field1451 * 0.33333334F;
							float var9 = (float)var3.field1455.field1453;
							float var13 = var3.field1455.field1456;
							var8 = var9 - 0.33333334F * var3.field1455.field1452;
							float var12 = var13 - 0.33333334F * var3.field1455.field1450;
							if (var0.field1524) {
								class198.method3786(var0, var6, var7, var8, var9, var10, var11, var12, var13);
							} else if (var0 != null) {
								var0.field1514 = var6;
								float var14 = var9 - var6;
								float var15 = var13 - var10;
								float var16 = var7 - var6;
								float var17 = 0.0F;
								float var18 = 0.0F;
								if ((double)var16 != 0.0D) {
									var17 = (var11 - var10) / var16;
								}

								var16 = var9 - var8;
								if (0.0D != (double)var16) {
									var18 = (var13 - var12) / var16;
								}

								float var19 = 1.0F / (var14 * var14);
								float var20 = var14 * var17;
								float var21 = var18 * var14;
								var0.field1516 = (var21 + var20 - var15 - var15) * var19 / var14;
								var0.field1517 = (var15 + var15 + var15 - var20 - var20 - var21) * var19;
								var0.field1530 = var17;
								var0.field1519 = var10;
							}

							var0.field1525 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field1456;
					} else if (var5) {
						return var1 != (float)var3.field1453 && null != var3.field1455 ? var3.field1455.field1456 : var3.field1456;
					} else if (var0.field1524) {
						if (null == var0) {
							var6 = 0.0F;
						} else {
							if (var1 == var0.field1514) {
								var7 = 0.0F;
							} else if (var0.field1522 == var1) {
								var7 = 1.0F;
							} else {
								var7 = (var1 - var0.field1514) / (var0.field1522 - var0.field1514);
							}

							if (var0.field1510) {
								var8 = var7;
							} else {
								class122.field1469[3] = var0.field1519;
								class122.field1469[2] = var0.field1530;
								class122.field1469[1] = var0.field1517;
								class122.field1469[0] = var0.field1516 - var7;
								class122.field1466[0] = 0.0F;
								class122.field1466[1] = 0.0F;
								class122.field1466[2] = 0.0F;
								class122.field1466[3] = 0.0F;
								class122.field1466[4] = 0.0F;
								int var22 = class104.method2657(class122.field1469, 3, 0.0F, true, 1.0F, true, class122.field1466);
								if (var22 == 1) {
									var8 = class122.field1466[0];
								} else {
									var8 = 0.0F;
								}
							}

							var6 = var0.field1520 + (var0.field1521 + (var0.field1523 * var8 + var0.field1518) * var8) * var8;
						}

						return var6;
					} else {
						return class122.method192(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
