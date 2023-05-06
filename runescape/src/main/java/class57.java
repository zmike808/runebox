public class class57 {
	static float field430;
	static float[][] field425;
	static int[][] field434;
	int[] field427;
	int[] field429;
	int[][][] field423;
	int[][][] field426;

	static {
		field425 = new float[2][8];
		field434 = new int[2][8];
	}

	class57() {
		this.field429 = new int[2];
		this.field423 = new int[2][2][4];
		this.field426 = new int[2][2][4];
		this.field427 = new int[2];
	}

	float method1139(int var1, int var2, float var3) {
		float var4 = (float)this.field426[var1][0][var2] + var3 * (float)(this.field426[var1][1][var2] - this.field426[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	float method1141(int var1, int var2, float var3) {
		float var4 = (float)this.field423[var1][0][var2] + var3 * (float)(this.field423[var1][1][var2] - this.field423[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method1140(var4);
	}

	int method1154(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field427[0] + (float)(this.field427[1] - this.field427[0]) * var2;
			var3 *= 0.0030517578F;
			field430 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			class58.field431 = (int)(field430 * 65536.0F);
		}

		if (this.field429[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1139(var1, 0, var2);
			field425[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method1141(var1, 0, var2));
			field425[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field429[var1]; ++var4) {
				var3 = this.method1139(var1, var4, var2);
				float var5 = var3 * -2.0F * (float)Math.cos((double)this.method1141(var1, var4, var2));
				float var6 = var3 * var3;
				field425[var1][var4 * 2 + 1] = field425[var1][var4 * 2 - 1] * var6;
				field425[var1][var4 * 2] = field425[var1][var4 * 2 - 1] * var5 + field425[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field425[var1];
					var10000[var7] += field425[var1][var7 - 1] * var5 + field425[var1][var7 - 2] * var6;
				}

				var10000 = field425[var1];
				var10000[1] += field425[var1][0] * var5 + var6;
				var10000 = field425[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field429[0] * 2; ++var4) {
					var10000 = field425[0];
					var10000[var4] *= field430;
				}
			}

			for (var4 = 0; var4 < this.field429[var1] * 2; ++var4) {
				field434[var1][var4] = (int)(field425[var1][var4] * 65536.0F);
			}

			return this.field429[var1] * 2;
		}
	}

	final void method1138(class489 var1, class44 var2) {
		int var3 = var1.method8658();
		this.field429[0] = var3 >> 4;
		this.field429[1] = var3 & 15;
		if (var3 != 0) {
			this.field427[0] = var1.method8660();
			this.field427[1] = var1.method8660();
			int var4 = var1.method8658();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field429[var5]; ++var6) {
					this.field423[var5][0][var6] = var1.method8660();
					this.field426[var5][0][var6] = var1.method8660();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field429[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field423[var5][1][var6] = var1.method8660();
						this.field426[var5][1][var6] = var1.method8660();
					} else {
						this.field423[var5][1][var6] = this.field423[var5][0][var6];
						this.field426[var5][1][var6] = this.field426[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field427[1] != this.field427[0]) {
				var2.method876(var1);
			}
		} else {
			int[] var7 = this.field427;
			this.field427[1] = 0;
			var7[0] = 0;
		}

	}

	static float method1140(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
