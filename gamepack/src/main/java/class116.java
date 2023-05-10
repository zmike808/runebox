public class class116 extends class409 {
	final boolean field1435;

	public class116(boolean var1) {
		this.field1435 = var1;
	}

	int method2871(class412 var1, class412 var2) {
		if (Client.field579 == var1.field4600 && var2.field4600 == Client.field579) {
			return this.field1435 ? var1.method7576().method9260(var2.method7576()) : var2.method7576().method9260(var1.method7576());
		} else {
			return this.method7598(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2871((class412)var1, (class412)var2);
	}

	static void method2870() {
		if (class442.field4730 == null) {
			class442.field4730 = new int[65536];
			double var1 = 0.949999988079071D;

			for (int var3 = 0; var3 < 65536; ++var3) {
				double var4 = 0.0078125D + (double)(var3 >> 10 & 63) / 64.0D;
				double var6 = (double)(var3 >> 7 & 7) / 8.0D + 0.0625D;
				double var8 = (double)(var3 & 127) / 128.0D;
				double var10 = var8;
				double var12 = var8;
				double var14 = var8;
				if (var6 != 0.0D) {
					double var16;
					if (var8 < 0.5D) {
						var16 = var8 * (var6 + 1.0D);
					} else {
						var16 = var6 + var8 - var6 * var8;
					}

					double var18 = var8 * 2.0D - var16;
					double var20 = var4 + 0.3333333333333333D;
					if (var20 > 1.0D) {
						--var20;
					}

					double var24 = var4 - 0.3333333333333333D;
					if (var24 < 0.0D) {
						++var24;
					}

					if (var20 * 6.0D < 1.0D) {
						var10 = var18 + var20 * 6.0D * (var16 - var18);
					} else if (var20 * 2.0D < 1.0D) {
						var10 = var16;
					} else if (var20 * 3.0D < 2.0D) {
						var10 = var18 + 6.0D * (var16 - var18) * (0.6666666666666666D - var20);
					} else {
						var10 = var18;
					}

					if (var4 * 6.0D < 1.0D) {
						var12 = 6.0D * (var16 - var18) * var4 + var18;
					} else if (var4 * 2.0D < 1.0D) {
						var12 = var16;
					} else if (var4 * 3.0D < 2.0D) {
						var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
					} else {
						var12 = var18;
					}

					if (var24 * 6.0D < 1.0D) {
						var14 = var24 * 6.0D * (var16 - var18) + var18;
					} else if (var24 * 2.0D < 1.0D) {
						var14 = var16;
					} else if (var24 * 3.0D < 2.0D) {
						var14 = 6.0D * (0.6666666666666666D - var24) * (var16 - var18) + var18;
					} else {
						var14 = var18;
					}
				}

				var10 = Math.pow(var10, var1);
				var12 = Math.pow(var12, var1);
				var14 = Math.pow(var14, var1);
				int var26 = (int)(var10 * 256.0D);
				int var17 = (int)(var12 * 256.0D);
				int var27 = (int)(var14 * 256.0D);
				int var19 = (var26 << 16) + (var17 << 8) + var27;
				class442.field4730[var3] = var19 & 16777215;
			}

		}
	}
}
