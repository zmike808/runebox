public class class104 {
	static final class104 field1350;
	static final class104 field1351;
	static final class104 field1352;
	static final class104 field1353;
	static final class104 field1354;
	static final class104 field1355;
	static final class104 field1356;
	static final class104 field1357;
	static final class104 field1358;
	static final class104 field1359;
	static final class104 field1360;
	static final class104 field1361;
	static final class104 field1362;
	static final class104 field1363;
	static final class104 field1364;
	static final class104 field1365;
	int field1349;

	static {
		field1358 = new class104(0);
		field1350 = new class104(1);
		field1360 = new class104(2);
		field1352 = new class104(3);
		field1351 = new class104(4);
		field1354 = new class104(5);
		field1355 = new class104(6);
		field1353 = new class104(7);
		field1356 = new class104(8);
		field1365 = new class104(9);
		field1359 = new class104(10);
		field1357 = new class104(11);
		field1361 = new class104(12);
		field1362 = new class104(13);
		field1363 = new class104(14);
		field1364 = new class104(15);
	}

	class104(int var1) {
		this.field1349 = var1;
	}

	public static int method2657(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var8 = 0.0F;

		for (int var9 = 0; var9 < var1 + 1; ++var9) {
			var8 += Math.abs(var0[var9]);
		}

		float var22 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class122.field1463;
		if (var8 <= var22) {
			return -1;
		} else {
			float[] var10 = new float[var1 + 1];

			int var11;
			for (var11 = 0; var11 < var1 + 1; ++var11) {
				var10[var11] = 1.0F / var8 * var0[var11];
			}

			while (Math.abs(var10[var1]) < var22) {
				--var1;
			}

			var11 = 0;
			if (var1 == 0) {
				return var11;
			} else if (var1 == 1) {
				var6[0] = -var10[0] / var10[1];
				boolean var23 = var3 ? var2 < var22 + var6[0] : var2 < var6[0] - var22;
				boolean var24 = var5 ? var4 > var6[0] - var22 : var4 > var22 + var6[0];
				var11 = var23 && var24 ? 1 : 0;
				if (var11 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var11;
			} else {
				class428 var12 = new class428(var10, var1);
				float[] var13 = new float[var1 + 1];

				for (int var14 = 1; var14 <= var1; ++var14) {
					var13[var14 - 1] = (float)var14 * var10[var14];
				}

				float[] var25 = new float[var1 + 1];
				int var15 = method2657(var13, var1 - 1, var2, false, var4, false, var25);
				if (var15 == -1) {
					return 0;
				} else {
					boolean var16 = false;
					float var18 = 0.0F;
					float var19 = 0.0F;
					float var20 = 0.0F;

					for (int var21 = 0; var21 <= var15; ++var21) {
						if (var11 > var1) {
							return var11;
						}

						float var17;
						if (var21 == 0) {
							var17 = var2;
							var19 = class428.method7861(var10, var1, var2);
							if (Math.abs(var19) <= var22 && var3) {
								var6[var11++] = var2;
							}
						} else {
							var17 = var20;
							var19 = var18;
						}

						if (var21 == var15) {
							var20 = var4;
							var16 = false;
						} else {
							var20 = var25[var21];
						}

						var18 = class428.method7861(var10, var1, var20);
						if (var16) {
							var16 = false;
						} else if (Math.abs(var18) < var22) {
							if (var21 != var15 || var5) {
								var6[var11++] = var20;
								var16 = true;
							}
						} else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
							var6[var11++] = class227.method4557(var12, var17, var20, 0.0F);
							if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var22) {
								var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
								--var11;
							}
						}
					}

					return var11;
				}
			}
		}
	}
}
