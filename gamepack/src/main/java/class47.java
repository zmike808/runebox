public class class47 {
	static class52[] field388;
	int field341;
	int field342;
	int field343;
	int field344;
	int field345;
	int field346;
	int[] field347;

	class47() {
		this.field342 = class53.method1102(16);
		this.field345 = class53.method1102(24);
		this.field343 = class53.method1102(24);
		this.field344 = class53.method1102(24) + 1;
		this.field341 = class53.method1102(6) + 1;
		this.field346 = class53.method1102(8);
		int[] var1 = new int[this.field341];

		int var2;
		for (var2 = 0; var2 < this.field341; ++var2) {
			int var3 = 0;
			int var4 = class53.method1102(3);
			boolean var5 = class53.method1103() != 0;
			if (var5) {
				var3 = class53.method1102(5);
			}

			var1[var2] = var3 << 3 | var4;
		}

		this.field347 = new int[this.field341 * 8];

		for (var2 = 0; var2 < this.field341 * 8; ++var2) {
			this.field347[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class53.method1102(8) : -1;
		}

	}

	void method895(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = field388[this.field346].field372;
			int var5 = this.field343 - this.field345;
			int var6 = var5 / this.field344;
			int[] var7 = new int[var6];

			for (int var8 = 0; var8 < 8; ++var8) {
				int var9 = 0;

				while (var9 < var6) {
					int var10;
					int var11;
					if (var8 == 0) {
						var10 = field388[this.field346].method1070();

						for (var11 = var4 - 1; var11 >= 0; --var11) {
							if (var9 + var11 < var6) {
								var7[var9 + var11] = var10 % this.field341;
							}

							var10 /= this.field341;
						}
					}

					for (var10 = 0; var10 < var4; ++var10) {
						var11 = var7[var9];
						int var12 = this.field347[var11 * 8 + var8];
						if (var12 >= 0) {
							int var13 = this.field345 + var9 * this.field344;
							class52 var14 = field388[var12];
							int var15;
							if (this.field342 == 0) {
								var15 = this.field344 / var14.field372;

								for (int var19 = 0; var19 < var15; ++var19) {
									float[] var20 = var14.method1073();

									for (int var18 = 0; var18 < var14.field372; ++var18) {
										var1[var13 + var19 + var18 * var15] += var20[var18];
									}
								}
							} else {
								var15 = 0;

								while (var15 < this.field344) {
									float[] var16 = var14.method1073();

									for (int var17 = 0; var17 < var14.field372; ++var17) {
										var1[var13 + var15] += var16[var17];
										++var15;
									}
								}
							}
						}

						++var9;
						if (var9 >= var6) {
							break;
						}
					}
				}
			}

		}
	}
}
