public class class52 {
	float[][] field373;
	int field372;
	int field375;
	int[] field371;
	int[] field374;
	int[] field376;

	class52() {
		class53.method1102(24);
		this.field372 = class53.method1102(16);
		this.field375 = class53.method1102(24);
		this.field371 = new int[this.field375];
		boolean var1 = class53.method1103() != 0;
		int var2;
		int var3;
		int var5;
		if (var1) {
			var2 = 0;

			for (var3 = class53.method1102(5) + 1; var2 < this.field375; ++var3) {
				int var4 = class53.method1102(class296.method5520(this.field375 - var2));

				for (var5 = 0; var5 < var4; ++var5) {
					this.field371[var2++] = var3;
				}
			}
		} else {
			boolean var14 = class53.method1103() != 0;

			for (var3 = 0; var3 < this.field375; ++var3) {
				if (var14 && class53.method1103() == 0) {
					this.field371[var3] = 0;
				} else {
					this.field371[var3] = class53.method1102(5) + 1;
				}
			}
		}

		this.method1071();
		var2 = class53.method1102(4);
		if (var2 > 0) {
			float var15 = class53.method1085(class53.method1102(32));
			float var16 = class53.method1085(class53.method1102(32));
			var5 = class53.method1102(4) + 1;
			boolean var6 = class53.method1103() != 0;
			int var7;
			if (var2 == 1) {
				var7 = method1077(this.field375, this.field372);
			} else {
				var7 = this.field375 * this.field372;
			}

			this.field374 = new int[var7];

			int var8;
			for (var8 = 0; var8 < var7; ++var8) {
				this.field374[var8] = class53.method1102(var5);
			}

			this.field373 = new float[this.field375][this.field372];
			float var9;
			int var10;
			int var11;
			if (var2 == 1) {
				for (var8 = 0; var8 < this.field375; ++var8) {
					var9 = 0.0F;
					var10 = 1;

					for (var11 = 0; var11 < this.field372; ++var11) {
						int var12 = var8 / var10 % var7;
						float var13 = (float)this.field374[var12] * var16 + var15 + var9;
						this.field373[var8][var11] = var13;
						if (var6) {
							var9 = var13;
						}

						var10 *= var7;
					}
				}
			} else {
				for (var8 = 0; var8 < this.field375; ++var8) {
					var9 = 0.0F;
					var10 = var8 * this.field372;

					for (var11 = 0; var11 < this.field372; ++var11) {
						float var17 = (float)this.field374[var10] * var16 + var15 + var9;
						this.field373[var8][var11] = var17;
						if (var6) {
							var9 = var17;
						}

						++var10;
					}
				}
			}
		}

	}

	void method1071() {
		int[] var1 = new int[this.field375];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.field375; ++var3) {
			var4 = this.field371[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				int var9;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var9 = var2[var8];
					if (var9 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.field376 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.field375; ++var3) {
			var4 = this.field371[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.field376[var6] == 0) {
							this.field376[var6] = var11;
						}

						var6 = this.field376[var6];
					} else {
						++var6;
					}

					if (var6 >= this.field376.length) {
						int[] var12 = new int[this.field376.length * 2];

						for (var10 = 0; var10 < this.field376.length; ++var10) {
							var12[var10] = this.field376[var10];
						}

						this.field376 = var12;
					}

					var8 >>>= 1;
				}

				this.field376[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	int method1070() {
		int var1;
		for (var1 = 0; this.field376[var1] >= 0; var1 = class53.method1103() != 0 ? this.field376[var1] : var1 + 1) {
		}

		return ~this.field376[var1];
	}

	float[] method1073() {
		return this.field373[this.method1070()];
	}

	static int method1077(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class75.method2081(var2, var1) > var0; --var2) {
		}

		return var2;
	}
}
