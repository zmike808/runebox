public class class216 extends class449 {
	static int[] field2470;
	boolean field2474;
	boolean field2477;
	int field2463;
	int field2467;
	int field2473;
	int[] field2468;
	int[] field2469;
	int[] field2471;
	int[] field2472;
	int[] field2475;

	class216(class489 var1) {
		this.field2477 = false;
		this.field2467 = var1.method8660();
		this.field2474 = var1.method8658() == 1;
		int var2 = var1.method8658();
		if (var2 >= 1 && var2 <= 4) {
			this.field2468 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				this.field2468[var3] = var1.method8660();
			}

			if (var2 > 1) {
				this.field2469 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field2469[var3] = var1.method8658();
				}
			}

			if (var2 > 1) {
				this.field2471 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field2471[var3] = var1.method8658();
				}
			}

			this.field2472 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.field2472[var3] = var1.method8664();
			}

			this.field2473 = var1.method8658();
			this.field2463 = var1.method8658();
			this.field2475 = null;
		} else {
			throw new RuntimeException();
		}
	}

	boolean method4247(double var1, int var3, class344 var4) {
		int var5;
		for (var5 = 0; var5 < this.field2468.length; ++var5) {
			if (var4.method6455(this.field2468[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field2475 = new int[var5];

		for (int var6 = 0; var6 < this.field2468.length; ++var6) {
			class502 var7 = class453.method8084(var4, this.field2468[var6]);
			var7.method9088();
			byte[] var8 = var7.field5083;
			int[] var9 = var7.field5080;
			int var10 = this.field2472[var6];
			if ((var10 & -16777216) == 16777216) {
			}

			if ((var10 & -16777216) == 33554432) {
			}

			int var11;
			int var12;
			int var13;
			int var14;
			if ((var10 & -16777216) == 50331648) {
				var11 = var10 & 16711935;
				var12 = var10 >> 8 & 255;

				for (var13 = 0; var13 < var9.length; ++var13) {
					var14 = var9[var13];
					if ((var14 & 65535) == var14 >> 8) {
						var14 &= 255;
						var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280;
					}
				}
			}

			for (var11 = 0; var11 < var9.length; ++var11) {
				var9[var11] = class219.method2794(var9[var11], var1);
			}

			if (var6 == 0) {
				var11 = 0;
			} else {
				var11 = this.field2469[var6 - 1];
			}

			if (var11 == 0) {
				if (var7.field5081 == var3) {
					for (var12 = 0; var12 < var5; ++var12) {
						this.field2475[var12] = var9[var8[var12] & 255];
					}
				} else if (var7.field5081 == 64 && var3 == 128) {
					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13) {
						for (var14 = 0; var14 < var3; ++var14) {
							this.field2475[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field5081 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13) {
						for (var14 = 0; var14 < var3; ++var14) {
							this.field2475[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var11 == 1) {
			}

			if (var11 == 2) {
			}

			if (var11 == 3) {
			}
		}

		return true;
	}

	void method4248() {
		this.field2475 = null;
	}

	void method4249(int var1) {
		if (this.field2475 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field2473 == 1 || this.field2473 == 3) {
				if (field2470 == null || field2470.length < this.field2475.length) {
					field2470 = new int[this.field2475.length];
				}

				if (this.field2475.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field2475.length;
				var4 = var2 * var1 * this.field2463;
				var5 = var3 - 1;
				if (this.field2473 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field2470[var6] = this.field2475[var7];
				}

				var10 = this.field2475;
				this.field2475 = field2470;
				field2470 = var10;
			}

			if (this.field2473 == 2 || this.field2473 == 4) {
				if (field2470 == null || field2470.length < this.field2475.length) {
					field2470 = new int[this.field2475.length];
				}

				if (this.field2475.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field2475.length;
				var4 = var1 * this.field2463;
				var5 = var2 - 1;
				if (this.field2473 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						field2470[var8] = this.field2475[var9];
					}
				}

				var10 = this.field2475;
				this.field2475 = field2470;
				field2470 = var10;
			}

		}
	}
}
