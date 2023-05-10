public class class227 extends class444 {
	class217[] field2631;

	class227(class344 var1, class344 var2, int var3, boolean var4) {
		class363 var5 = new class363();
		int var6 = var1.method6458(var3);
		this.field2631 = new class217[var6];
		int[] var7 = var1.method6449(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method6468(var3, var7[var8]);
			class222 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (class222 var12 = (class222)var5.method6716(); null != var12; var12 = (class222)var5.method6725()) {
				if (var12.field2539 == var11) {
					var10 = var12;
					break;
				}
			}

			if (null == var10) {
				byte[] var13;
				if (var4) {
					var13 = var2.method6454(0, var11);
				} else {
					var13 = var2.method6454(var11, 0);
				}

				var10 = new class222(var11, var13);
				var5.method6711(var10);
			}

			this.field2631[var7[var8]] = new class217(var9, var10);
		}

	}

	public boolean method4552(int var1) {
		return this.field2631[var1].field2480;
	}

	static float method4557(class428 var0, float var1, float var2, float var3) {
		float var5 = class428.method7861(var0.field4690, var0.field4689, var1);
		if (Math.abs(var5) < class122.field1463) {
			return var1;
		} else {
			float var6 = class428.method7861(var0.field4690, var0.field4689, var2);
			if (Math.abs(var6) < class122.field1463) {
				return var2;
			} else {
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var9 = 0.0F;
				float var14 = 0.0F;
				boolean var15 = true;
				boolean var16 = false;

				do {
					var16 = false;
					if (var15) {
						var7 = var1;
						var14 = var5;
						var8 = var2 - var1;
						var9 = var8;
						var15 = false;
					}

					if (Math.abs(var14) < Math.abs(var6)) {
						var1 = var2;
						var2 = var7;
						var7 = var1;
						var5 = var6;
						var6 = var14;
						var14 = var5;
					}

					float var17 = class122.field1464 * Math.abs(var2) + var3 * 0.5F;
					float var18 = 0.5F * (var7 - var2);
					boolean var19 = Math.abs(var18) > var17 && var6 != 0.0F;
					if (var19) {
						if (Math.abs(var9) >= var17 && Math.abs(var5) > Math.abs(var6)) {
							float var13 = var6 / var5;
							float var10;
							float var11;
							if (var7 == var1) {
								var10 = var13 * var18 * 2.0F;
								var11 = 1.0F - var13;
							} else {
								var11 = var5 / var14;
								float var12 = var6 / var14;
								var10 = ((var11 - var12) * var18 * 2.0F * var11 - (var2 - var1) * (var12 - 1.0F)) * var13;
								var11 = (var11 - 1.0F) * (var12 - 1.0F) * (var13 - 1.0F);
							}

							if ((double)var10 > 0.0D) {
								var11 = -var11;
							} else {
								var10 = -var10;
							}

							var13 = var9;
							var9 = var8;
							if (var10 * 2.0F < var18 * 3.0F * var11 - Math.abs(var17 * var11) && var10 < Math.abs(var13 * 0.5F * var11)) {
								var8 = var10 / var11;
							} else {
								var8 = var18;
								var9 = var18;
							}
						} else {
							var8 = var18;
							var9 = var18;
						}

						var1 = var2;
						var5 = var6;
						if (Math.abs(var8) > var17) {
							var2 += var8;
						} else if ((double)var18 > 0.0D) {
							var2 += var17;
						} else {
							var2 -= var17;
						}

						var6 = class428.method7861(var0.field4690, var0.field4689, var2);
						if ((double)(var6 * (var14 / Math.abs(var14))) > 0.0D) {
							var15 = true;
							var16 = true;
						} else {
							var16 = true;
						}
					}
				} while(var16);

				return var2;
			}
		}
	}
}
