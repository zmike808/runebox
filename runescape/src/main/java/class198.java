public class class198 extends class444 {
	static class280 field2115;
	static class344 field2114;
	boolean field2117;
	char field2116;
	public int field2121;
	public String field2118;

	static {
		field2115 = new class280(64);
	}

	class198() {
		this.field2117 = true;
	}

	void method3772() {
	}

	void method3763(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3762(var1, var3);
		}
	}

	void method3762(class489 var1, int var2) {
		if (var2 == 1) {
			byte var5 = var1.method8659();
			int var6 = var5 & 255;
			if (var6 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var6, 16));
			}

			if (var6 >= 128 && var6 < 160) {
				char var7 = class370.field4373[var6 - 128];
				if (var7 == 0) {
					var7 = '?';
				}

				var6 = var7;
			}

			char var4 = (char)var6;
			this.field2116 = var4;
		} else if (var2 == 2) {
			this.field2121 = var1.method8664();
		} else if (var2 == 4) {
			this.field2117 = false;
		} else if (var2 == 5) {
			this.field2118 = var1.method8669();
		}

	}

	public boolean method3765() {
		return this.field2116 == 's';
	}

	public static void method3743(class344 var0) {
		field2114 = var0;
	}

	public static class198 method513(int var0) {
		class198 var2 = (class198)field2115.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2114.method6468(11, var0);
			var2 = new class198();
			if (var3 != null) {
				var2.method3763(new class489(var3));
			}

			var2.method3772();
			field2115.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static void method3343() {
		field2115.method5467();
	}

	static void method3786(class126 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var10 = var4 - var1;
			if (0.0D != (double)var10) {
				float var11 = var2 - var1;
				float var12 = var3 - var1;
				float[] var13 = new float[]{var11 / var10, var12 / var10};
				var0.field1510 = var13[0] == 0.33333334F && 0.6666667F == var13[1];
				float var14 = var13[0];
				float var15 = var13[1];
				if ((double)var13[0] < 0.0D) {
					var13[0] = 0.0F;
				}

				if ((double)var13[1] > 1.0D) {
					var13[1] = 1.0F;
				}

				float var16;
				if ((double)var13[0] > 1.0D || var13[1] < -1.0F) {
					var13[1] = 1.0F - var13[1];
					if (var13[0] < 0.0F) {
						var13[0] = 0.0F;
					}

					if (var13[1] < 0.0F) {
						var13[1] = 0.0F;
					}

					if (var13[0] > 1.0F || var13[1] > 1.0F) {
						var16 = (float)(1.0D + (double)var13[1] * ((double)var13[1] - 2.0D) + (double)((var13[0] - 2.0F + var13[1]) * var13[0]));
						if (class122.field1463 + var16 > 0.0F) {
							class122.method2780(var13);
						}
					}

					var13[1] = 1.0F - var13[1];
				}

				if (var14 != var13[0]) {
					float var10000 = var1 + var10 * var13[0];
					if ((double)var14 != 0.0D) {
						var6 = var5 + var13[0] * (var6 - var5) / var14;
					}
				}

				if (var13[1] != var15) {
					var3 = var10 * var13[1] + var1;
					if ((double)var15 != 1.0D) {
						var7 = (float)((double)var8 - (double)(var8 - var7) * (1.0D - (double)var13[1]) / (1.0D - (double)var15));
					}
				}

				var0.field1514 = var1;
				var0.field1522 = var4;
				class122.method3272(0.0F, var13[0], var13[1], 1.0F, var0);
				var16 = var6 - var5;
				float var17 = var7 - var6;
				float var18 = var8 - var7;
				float var19 = var17 - var16;
				var0.field1523 = var18 - var17 - var19;
				var0.field1518 = var19 + var19 + var19;
				var0.field1521 = var16 + var16 + var16;
				var0.field1520 = var5;
			}
		}
	}
}
