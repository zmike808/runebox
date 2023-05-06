public class class123 {
	boolean field1473;
	boolean field1480;
	class426 field1481;
	class426 field1483;
	class426 field1486;
	class426[] field1477;
	class426[] field1478;
	float[][] field1474;
	float[][] field1475;
	float[][] field1484;
	float[][] field1485;
	final class426[] field1476;
	public class123 field1479;
	public final int field1482;

	public class123(int var1, class489 var2, boolean var3) {
		this.field1486 = new class426();
		this.field1480 = true;
		this.field1481 = new class426();
		this.field1473 = true;
		this.field1483 = new class426();
		this.field1482 = var2.method8855();
		this.field1476 = new class426[var1];
		this.field1477 = new class426[this.field1476.length];
		this.field1478 = new class426[this.field1476.length];
		this.field1475 = new float[this.field1476.length][3];

		for (int var4 = 0; var4 < this.field1476.length; ++var4) {
			this.field1476[var4] = new class426(var2, var3);
			this.field1475[var4][0] = var2.method8666();
			this.field1475[var4][1] = var2.method8666();
			this.field1475[var4][2] = var2.method8666();
		}

		this.method2932();
	}

	void method2932() {
		this.field1484 = new float[this.field1476.length][3];
		this.field1474 = new float[this.field1476.length][3];
		this.field1485 = new float[this.field1476.length][3];
		class426[] var3;
		synchronized(var3 = class426.field4666){}
		class426 var2;
		if (0 == class134.field4668) {
			var2 = new class426();
		} else {
			class426.field4666[--class134.field4668].method7867();
			var2 = class426.field4666[class134.field4668];
		}

		class426 var6 = var2;

		for (int var4 = 0; var4 < this.field1476.length; ++var4) {
			class426 var5 = this.method2933(var4);
			var6.method7869(var5);
			var6.method7884();
			this.field1484[var4] = var6.method7863();
			this.field1474[var4][0] = var5.field4671[12];
			this.field1474[var4][1] = var5.field4671[13];
			this.field1474[var4][2] = var5.field4671[14];
			this.field1485[var4] = var5.method7909();
		}

		var6.method7866();
	}

	class426 method2933(int var1) {
		return this.field1476[var1];
	}

	class426 method2934(int var1) {
		if (this.field1477[var1] == null) {
			this.field1477[var1] = new class426(this.method2933(var1));
			if (this.field1479 != null) {
				this.field1477[var1].method7873(this.field1479.method2934(var1));
			} else {
				this.field1477[var1].method7873(class426.field4665);
			}
		}

		return this.field1477[var1];
	}

	class426 method2946(int var1) {
		if (this.field1478[var1] == null) {
			this.field1478[var1] = new class426(this.method2934(var1));
			this.field1478[var1].method7884();
		}

		return this.field1478[var1];
	}

	void method2948(class426 var1) {
		this.field1486.method7869(var1);
		this.field1480 = true;
		this.field1473 = true;
	}

	class426 method2937() {
		return this.field1486;
	}

	class426 method2958() {
		if (this.field1480) {
			this.field1481.method7869(this.method2937());
			if (this.field1479 != null) {
				this.field1481.method7873(this.field1479.method2958());
			}

			this.field1480 = false;
		}

		return this.field1481;
	}

	public class426 method2936(int var1) {
		if (this.field1473) {
			this.field1483.method7869(this.method2946(var1));
			this.field1483.method7873(this.method2958());
			this.field1473 = false;
		}

		return this.field1483;
	}

	float[] method2954(int var1) {
		return this.field1484[var1];
	}

	float[] method2940(int var1) {
		return this.field1474[var1];
	}

	float[] method2941(int var1) {
		return this.field1485[var1];
	}

	static final void method2981(int var0, int var1, int var2, int var3) {
		for (int var5 = var1; var5 <= var1 + var3; ++var5) {
			for (int var6 = var0; var6 <= var2 + var0; ++var6) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					class78.field995[0][var6][var5] = 127;
					if (var6 == var0 && var6 > 0) {
						class78.field1002[0][var6][var5] = class78.field1002[0][var6 - 1][var5];
					}

					if (var0 + var2 == var6 && var6 < 103) {
						class78.field1002[0][var6][var5] = class78.field1002[0][var6 + 1][var5];
					}

					if (var5 == var1 && var5 > 0) {
						class78.field1002[0][var6][var5] = class78.field1002[0][var6][var5 - 1];
					}

					if (var5 == var1 + var3 && var5 < 103) {
						class78.field1002[0][var6][var5] = class78.field1002[0][var6][var5 + 1];
					}
				}
			}
		}

	}
}
