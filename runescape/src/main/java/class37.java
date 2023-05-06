public class class37 {
	public static class365 field255;

	static {
		field255 = new class365();
	}

	static final void method719(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = Client.field759;
		} else if (var6 >= 100) {
			var7 = Client.field760;
		} else {
			var7 = var6 * (Client.field760 - Client.field759) / 100 + Client.field759;
		}

		int var8 = var3 * var7 * 512 / (var2 * 334);
		int var9;
		int var10;
		short var17;
		if (var8 < Client.field621) {
			var17 = Client.field621;
			var7 = var2 * var17 * 334 / (var3 * 512);
			if (var7 > Client.field764) {
				var7 = Client.field764;
				var9 = 512 * var7 * var3 / (var17 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					class499.method8980();
					class499.method9012(var0, var1, var10, var3, -16777216);
					class499.method9012(var2 + var0 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > Client.field695) {
			var17 = Client.field695;
			var7 = var2 * var17 * 334 / (var3 * 512);
			if (var7 < Client.field573) {
				var7 = Client.field573;
				var9 = var2 * var17 * 334 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					class499.method8980();
					class499.method9012(var0, var1, var2, var10, -16777216);
					class499.method9012(var0, var1 + var3 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		Client.field582 = var3 * var7 / 334;
		if (var2 != Client.field767 || Client.field770 != var3) {
			int[] var18 = new int[9];

			for (var10 = 0; var10 < var18.length; ++var10) {
				int var11 = var10 * 32 + 128 + 15;
				int var12 = Client.method4848(var11);
				int var13 = class219.field2512[var11];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = Client.field775 + var15 * (Client.field762 - Client.field775) / 100;
				int var14 = var12 * var16 / 256;
				var18[var10] = var14 * var13 >> 16;
			}

			class223.method4403(var18, 500, 800, var2 * 334 / var3, 334);
		}

		Client.field555 = var0;
		Client.field768 = var1;
		Client.field767 = var2;
		Client.field770 = var3;
	}

	static final void method717(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = var2 - var0;
		int var8 = var3 - var1;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8 >= 0 ? var8 : -var8;
		int var11 = var9;
		if (var9 < var10) {
			var11 = var10;
		}

		if (var11 != 0) {
			int var12 = (var7 << 16) / var11;
			int var13 = (var8 << 16) / var11;
			if (var13 <= var12) {
				var12 = -var12;
			} else {
				var13 = -var13;
			}

			int var14 = var5 * var13 >> 17;
			int var15 = 1 + var13 * var5 >> 17;
			int var16 = var12 * var5 >> 17;
			int var17 = var5 * var12 + 1 >> 17;
			var0 -= class499.field5064;
			var1 -= class499.field5065;
			int var18 = var0 + var14;
			int var19 = var0 - var15;
			int var20 = var7 + var0 - var15;
			int var21 = var0 + var7 + var14;
			int var22 = var16 + var1;
			int var23 = var1 - var17;
			int var24 = var1 + var8 - var17;
			int var25 = var1 + var8 + var16;
			class219.method3523(var18, var19, var20);
			class219.method3178(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			class219.method3523(var18, var20, var21);
			class219.method3178(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
