public class class229 implements class241 {
	class216[] field2653;
	class344 field2652;
	class363 field2656;
	double field2654;
	int field2655;
	int field2657;
	int field2658;

	public class229(class344 var1, class344 var2, int var3, double var4, int var6) {
		this.field2656 = new class363();
		this.field2655 = 0;
		this.field2654 = 1.0D;
		this.field2657 = 128;
		this.field2652 = var2;
		this.field2658 = var3;
		this.field2655 = this.field2658;
		this.field2654 = var4;
		this.field2657 = var6;
		int[] var7 = var1.method6449(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.field2653 = new class216[var1.method6458(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				class489 var10 = new class489(var1.method6468(0, var7[var9]));
				this.field2653[var7[var9]] = new class216(var10);
			}
		} else {
			this.field2653 = new class216[0];
		}

	}

	public int method4559() {
		if (0 == this.field2653.length) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			class216[] var4 = this.field2653;

			for (int var5 = 0; var5 < var4.length; ++var5) {
				class216 var6 = var4[var5];
				if (null != var6 && null != var6.field2468) {
					var2 += var6.field2468.length;
					int[] var7 = var6.field2468;

					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field2652.method6457(var9)) {
							++var3;
						}
					}
				}
			}

			if (var2 == 0) {
				return 0;
			} else {
				return var3 * 100 / var2;
			}
		}
	}

	public void method4563(double var1) {
		this.field2654 = var1;
		this.method4581();
	}

	public int[] method4821(int var1) {
		class216 var3 = this.field2653[var1];
		if (var3 != null) {
			if (var3.field2475 != null) {
				this.field2656.method6712(var3);
				var3.field2477 = true;
				return var3.field2475;
			}

			boolean var4 = var3.method4247(this.field2654, this.field2657, this.field2652);
			if (var4) {
				if (0 == this.field2655) {
					class216 var5 = (class216)this.field2656.method6715();
					var5.method4248();
				} else {
					--this.field2655;
				}

				this.field2656.method6712(var3);
				var3.field2477 = true;
				return var3.field2475;
			}
		}

		return null;
	}

	public int method4822(int var1) {
		return null != this.field2653[var1] ? this.field2653[var1].field2467 : 0;
	}

	public boolean method4823(int var1) {
		return this.field2653[var1].field2474;
	}

	public boolean method4824(int var1) {
		return 64 == this.field2657;
	}

	public void method4581() {
		for (int var2 = 0; var2 < this.field2653.length; ++var2) {
			if (this.field2653[var2] != null) {
				this.field2653[var2].method4248();
			}
		}

		this.field2656 = new class363();
		this.field2655 = this.field2658;
	}

	public void method4566(int var1) {
		for (int var3 = 0; var3 < this.field2653.length; ++var3) {
			class216 var4 = this.field2653[var3];
			if (var4 != null && var4.field2473 != 0 && var4.field2477) {
				var4.method4249(var1);
				var4.field2477 = false;
			}
		}

	}

	static final void method4583(int var0, int var1, int var2) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				class78.field1002[var0][var1 + var4][var2 + var5] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				class78.field1002[var0][var1][var2 + var4] = class78.field1002[var0][var1 - 1][var2 + var4];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				class78.field1002[var0][var1 + var4][var2] = class78.field1002[var0][var1 + var4][var2 - 1];
			}
		}

		if (var1 > 0 && class78.field1002[var0][var1 - 1][var2] != 0) {
			class78.field1002[var0][var1][var2] = class78.field1002[var0][var1 - 1][var2];
		} else if (var2 > 0 && class78.field1002[var0][var1][var2 - 1] != 0) {
			class78.field1002[var0][var1][var2] = class78.field1002[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && class78.field1002[var0][var1 - 1][var2 - 1] != 0) {
			class78.field1002[var0][var1][var2] = class78.field1002[var0][var1 - 1][var2 - 1];
		}

	}
}
