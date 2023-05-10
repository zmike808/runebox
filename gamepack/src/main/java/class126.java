public class class126 {
	boolean field1509;
	boolean field1510;
	boolean field1524;
	boolean field1525;
	class121[] field1512;
	class124 field1513;
	class124 field1529;
	float field1508;
	float field1511;
	float field1514;
	float field1516;
	float field1517;
	float field1518;
	float field1519;
	float field1520;
	float field1521;
	float field1522;
	float field1523;
	float field1530;
	float[] field1526;
	int field1515;
	int field1527;
	int field1528;

	class126() {
		this.field1525 = true;
		this.field1515 = 0;
	}

	int method2997(class489 var1, int var2) {
		int var4 = var1.method8660();
		class135.method3327(var1.method8658());
		this.field1513 = class93.method2368(var1.method8658());
		this.field1529 = class93.method2368(var1.method8658());
		this.field1524 = var1.method8658() != 0;
		this.field1512 = new class121[var4];
		class121 var5 = null;

		for (int var6 = 0; var6 < var4; ++var6) {
			class121 var7 = new class121();
			var7.method2911(var1, var2);
			this.field1512[var6] = var7;
			if (null != var5) {
				var5.field1455 = var7;
			}

			var5 = var7;
		}

		return var4;
	}

	void method3020() {
		this.field1527 = this.field1512[0].field1453;
		this.field1528 = this.field1512[this.method3005() - 1].field1453;
		this.field1526 = new float[this.method3009() + 1];

		for (int var2 = this.method3000(); var2 <= this.method3022(); ++var2) {
			this.field1526[var2 - this.method3000()] = class352.method6614(this, (float)var2);
		}

		this.field1512 = null;
		this.field1508 = class352.method6614(this, (float)(this.method3000() - 1));
		this.field1511 = class352.method6614(this, (float)(this.method3022() + 1));
	}

	public float method2999(int var1) {
		if (var1 < this.method3000()) {
			return this.field1508;
		} else {
			return var1 > this.method3022() ? this.field1511 : this.field1526[var1 - this.method3000()];
		}
	}

	int method3000() {
		return this.field1527;
	}

	int method3022() {
		return this.field1528;
	}

	int method3009() {
		return this.method3022() - this.method3000();
	}

	int method3003(float var1) {
		if (this.field1515 < 0 || (float)this.field1512[this.field1515].field1453 > var1 || this.field1512[this.field1515].field1455 != null && (float)this.field1512[this.field1515].field1455.field1453 <= var1) {
			if (var1 >= (float)this.method3000() && var1 <= (float)this.method3022()) {
				int var3 = this.method3005();
				int var4 = this.field1515;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;

					do {
						int var7 = var5 + var6 >> 1;
						if (var1 < (float)this.field1512[var7].field1453) {
							if (var1 > (float)this.field1512[var7 - 1].field1453) {
								var4 = var7 - 1;
								break;
							}

							var6 = var7 - 1;
						} else {
							if (var1 <= (float)this.field1512[var7].field1453) {
								var4 = var7;
								break;
							}

							if (var1 < (float)this.field1512[var7 + 1].field1453) {
								var4 = var7;
								break;
							}

							var5 = var7 + 1;
						}
					} while(var5 <= var6);
				}

				if (var4 != this.field1515) {
					this.field1515 = var4;
					this.field1525 = true;
				}

				return this.field1515;
			} else {
				return -1;
			}
		} else {
			return this.field1515;
		}
	}

	class121 method3004(float var1) {
		int var3 = this.method3003(var1);
		return var3 >= 0 && var3 < this.field1512.length ? this.field1512[var3] : null;
	}

	int method3005() {
		return null == this.field1512 ? 0 : this.field1512.length;
	}

	public static class484 method3030(int var0) {
		class484 var2 = (class484)class484.field4968.method5461((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class484.field4969.method6468(38, var0);
			var2 = new class484();
			if (null != var3) {
				var2.method8560(new class489(var3));
			}

			var2.method8563();
			class484.field4968.method5463(var2, (long)var0);
			return var2;
		}
	}
}
