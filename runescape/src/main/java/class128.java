public class class128 implements class357 {
	static final class128 field1545;
	static final class128 field1546;
	static final class128 field1547;
	static final class128 field1548;
	static final class128 field1549;
	static final class128 field1550;
	static final class128 field1551;
	static final class128 field1552;
	static final class128 field1553;
	static final class128 field1554;
	static final class128 field1555;
	static final class128 field1556;
	static final class128 field1557;
	static final class128 field1559;
	static final class128 field1560;
	static final class128 field1561;
	static final class128 field1567;
	final int field1562;
	final int field1563;
	final int field1564;

	static {
		field1546 = new class128(0, 0, (String)null, -1);
		field1548 = new class128(1, 1, (String)null, 0);
		field1547 = new class128(2, 2, (String)null, 1);
		field1545 = new class128(3, 3, (String)null, 2);
		field1567 = new class128(4, 4, (String)null, 3);
		field1561 = new class128(5, 5, (String)null, 4);
		field1551 = new class128(6, 6, (String)null, 5);
		field1552 = new class128(7, 7, (String)null, 6);
		field1553 = new class128(8, 8, (String)null, 7);
		field1554 = new class128(9, 9, (String)null, 8);
		field1555 = new class128(10, 10, (String)null, 0);
		field1549 = new class128(11, 11, (String)null, 1);
		field1557 = new class128(12, 12, (String)null, 2);
		field1550 = new class128(13, 13, (String)null, 3);
		field1556 = new class128(14, 14, (String)null, 4);
		field1560 = new class128(15, 15, (String)null, 5);
		field1559 = new class128(16, 16, (String)null, 0);
	}

	class128(int var1, int var2, String var3, int var4) {
		this.field1562 = var1;
		this.field1563 = var2;
		this.field1564 = var4;
	}

	public int method6674() {
		return this.field1563;
	}

	int method3042() {
		return this.field1564;
	}

	static class128[] method2926() {
		return new class128[]{field1546, field1548, field1547, field1545, field1567, field1561, field1551, field1552, field1553, field1554, field1555, field1549, field1557, field1550, field1556, field1560, field1559};
	}

	static class128 method2877(int var0) {
		class128 var2 = (class128)class199.method3788(method2926(), var0);
		if (null == var2) {
			var2 = field1546;
		}

		return var2;
	}

	static final void method3047(boolean var0, class488 var1) {
		Client.field689 = var0;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.field689) {
			var3 = var1.method8737();
			int var4 = var1.method8737();
			var5 = var1.method8660();
			Client.field2848 = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Client.field2848[var6][var7] = var1.method8664();
				}
			}

			Client.field3064 = new int[var5];
			Client.field4877 = new int[var5];
			Client.field4199 = new int[var5];
			Client.field11 = new byte[var5][];
			Client.field834 = new byte[var5][];
			var5 = 0;

			for (var6 = (var4 - 6) / 8; var6 <= (var4 + 6) / 8; ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
					var8 = (var6 << 8) + var7;
					Client.field3064[var5] = var8;
					Client.field4877[var5] = Client.field4271.method6464("m" + var6 + "_" + var7);
					Client.field4199[var5] = Client.field4271.method6464("l" + var6 + "_" + var7);
					++var5;
				}
			}

			class56.method1136(var4, var3, true);
		} else {
			var3 = var1.method8737();
			boolean var16 = var1.method8658() == 1;
			var5 = var1.method8701();
			var6 = var1.method8660();
			var1.method8636();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method8607(1);
						if (var10 == 1) {
							Client.field563[var7][var8][var9] = var1.method8607(26);
						} else {
							Client.field563[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.method8608();
			Client.field2848 = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					Client.field2848[var7][var8] = var1.method8664();
				}
			}

			Client.field3064 = new int[var6];
			Client.field4877 = new int[var6];
			Client.field4199 = new int[var6];
			Client.field11 = new byte[var6][];
			Client.field834 = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = Client.field563[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (Client.field3064[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								Client.field3064[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								Client.field4877[var6] = Client.field4271.method6464("m" + var14 + "_" + var15);
								Client.field4199[var6] = Client.field4271.method6464("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			class56.method1136(var3, var5, !var16);
		}

	}

	static final void method3048(int var0, int var1) {
		if (class45.method882(var0)) {
			class144.method3172(Client.field2057[var0], var1);
		}
	}
}
