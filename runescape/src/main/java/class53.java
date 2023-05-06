public class class53 extends class449 {
	static boolean field379;
	static boolean[] field377;
	static byte[] field409;
	static class42[] field394;
	static class47[] field390;
	static class50[] field391;
	static float[] field392;
	static float[] field399;
	static float[] field401;
	static float[] field402;
	static float[] field404;
	static float[] field405;
	static float[] field410;
	static int field380;
	static int field384;
	static int field385;
	static int field387;
	static int[] field383;
	static int[] field406;
	static int[] field407;
	boolean field382;
	boolean field386;
	byte[] field408;
	byte[][] field398;
	float[] field395;
	int field378;
	int field381;
	int field389;
	int field393;
	int field396;
	int field397;
	int field400;
	int field403;

	static {
		field379 = false;
	}

	class53(byte[] var1) {
		this.method1086(var1);
	}

	void method1086(byte[] var1) {
		class489 var2 = new class489(var1);
		this.field378 = var2.method8664();
		this.field403 = var2.method8664();
		this.field400 = var2.method8664();
		this.field381 = var2.method8664();
		if (this.field381 < 0) {
			this.field381 = ~this.field381;
			this.field382 = true;
		}

		int var3 = var2.method8664();
		this.field398 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method8658();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method8676(var7, 0, var5);
			this.field398[var4] = var7;
		}

	}

	float[] method1088(int var1) {
		method1083(this.field398[var1], 0);
		method1103();
		int var2 = method1102(class296.method5520(field383.length - 1));
		boolean var3 = field377[var2];
		int var4 = var3 ? field387 : field380;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = method1103() != 0;
			var6 = method1103() != 0;
		}

		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (field380 >> 2);
			var9 = (var4 >> 2) + (field380 >> 2);
			var10 = field380 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}

		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (field380 >> 2);
			var12 = var4 - (var4 >> 2) + (field380 >> 2);
			var13 = field380 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}

		class50 var14 = field391[field383[var2]];
		int var16 = var14.field368;
		int var17 = var14.field367[var16];
		boolean var15 = !field394[var17].method794();
		boolean var40 = var15;

		for (var17 = 0; var17 < var14.field369; ++var17) {
			class47 var18 = field390[var14.field370[var17]];
			float[] var19 = field399;
			var18.method895(var19, var4 >> 1, var40);
		}

		int var41;
		if (!var15) {
			var17 = var14.field368;
			var41 = var14.field367[var17];
			field394[var41].method795(field399, var4 >> 1);
		}

		int var42;
		if (var15) {
			for (var17 = var4 >> 1; var17 < var4; ++var17) {
				field399[var17] = 0.0F;
			}
		} else {
			var17 = var4 >> 1;
			var41 = var4 >> 2;
			var42 = var4 >> 3;
			float[] var20 = field399;

			int var21;
			for (var21 = 0; var21 < var17; ++var21) {
				var20[var21] *= 0.5F;
			}

			for (var21 = var17; var21 < var4; ++var21) {
				var20[var21] = -var20[var4 - var21 - 1];
			}

			float[] var46 = var3 ? field392 : field410;
			float[] var22 = var3 ? field404 : field401;
			float[] var23 = var3 ? field405 : field402;
			int[] var24 = var3 ? field407 : field406;

			int var25;
			float var26;
			float var27;
			float var28;
			float var29;
			for (var25 = 0; var25 < var41; ++var25) {
				var26 = var20[var25 * 4] - var20[var4 - var25 * 4 - 1];
				var27 = var20[var25 * 4 + 2] - var20[var4 - var25 * 4 - 3];
				var28 = var46[var25 * 2];
				var29 = var46[var25 * 2 + 1];
				var20[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
				var20[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
			}

			float var30;
			float var31;
			for (var25 = 0; var25 < var42; ++var25) {
				var26 = var20[var17 + 3 + var25 * 4];
				var27 = var20[var17 + 1 + var25 * 4];
				var28 = var20[var25 * 4 + 3];
				var29 = var20[var25 * 4 + 1];
				var20[var17 + 3 + var25 * 4] = var26 + var28;
				var20[var17 + 1 + var25 * 4] = var27 + var29;
				var30 = var46[var17 - 4 - var25 * 4];
				var31 = var46[var17 - 3 - var25 * 4];
				var20[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
				var20[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
			}

			var25 = class296.method5520(var4 - 1);

			int var47;
			int var48;
			int var49;
			int var50;
			for (var47 = 0; var47 < var25 - 3; ++var47) {
				var48 = var4 >> var47 + 2;
				var49 = 8 << var47;

				for (var50 = 0; var50 < 2 << var47; ++var50) {
					int var51 = var4 - var48 * 2 * var50;
					int var52 = var4 - var48 * (var50 * 2 + 1);

					for (int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
						int var33 = var32 * 4;
						float var34 = var20[var51 - 1 - var33];
						float var35 = var20[var51 - 3 - var33];
						float var36 = var20[var52 - 1 - var33];
						float var37 = var20[var52 - 3 - var33];
						var20[var51 - 1 - var33] = var34 + var36;
						var20[var51 - 3 - var33] = var35 + var37;
						float var38 = var46[var32 * var49];
						float var39 = var46[var32 * var49 + 1];
						var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
						var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
					}
				}
			}

			for (var47 = 1; var47 < var42 - 1; ++var47) {
				var48 = var24[var47];
				if (var47 < var48) {
					var49 = var47 * 8;
					var50 = var48 * 8;
					var30 = var20[var49 + 1];
					var20[var49 + 1] = var20[var50 + 1];
					var20[var50 + 1] = var30;
					var30 = var20[var49 + 3];
					var20[var49 + 3] = var20[var50 + 3];
					var20[var50 + 3] = var30;
					var30 = var20[var49 + 5];
					var20[var49 + 5] = var20[var50 + 5];
					var20[var50 + 5] = var30;
					var30 = var20[var49 + 7];
					var20[var49 + 7] = var20[var50 + 7];
					var20[var50 + 7] = var30;
				}
			}

			for (var47 = 0; var47 < var17; ++var47) {
				var20[var47] = var20[var47 * 2 + 1];
			}

			for (var47 = 0; var47 < var42; ++var47) {
				var20[var4 - 1 - var47 * 2] = var20[var47 * 4];
				var20[var4 - 2 - var47 * 2] = var20[var47 * 4 + 1];
				var20[var4 - var41 - 1 - var47 * 2] = var20[var47 * 4 + 2];
				var20[var4 - var41 - 2 - var47 * 2] = var20[var47 * 4 + 3];
			}

			for (var47 = 0; var47 < var42; ++var47) {
				var27 = var23[var47 * 2];
				var28 = var23[var47 * 2 + 1];
				var29 = var20[var17 + var47 * 2];
				var30 = var20[var17 + var47 * 2 + 1];
				var31 = var20[var4 - 2 - var47 * 2];
				float var53 = var20[var4 - 1 - var47 * 2];
				float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
				var20[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
				var20[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
				var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
				var20[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
				var20[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var20[var47] = var20[var47 * 2 + var17] * var22[var47 * 2] + var20[var47 * 2 + 1 + var17] * var22[var47 * 2 + 1];
				var20[var17 - 1 - var47] = var20[var47 * 2 + var17] * var22[var47 * 2 + 1] - var20[var47 * 2 + 1 + var17] * var22[var47 * 2];
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var20[var4 - var41 + var47] = -var20[var47];
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var20[var47] = var20[var41 + var47];
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var20[var41 + var47] = -var20[var41 - var47 - 1];
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var20[var17 + var47] = var20[var4 - var47 - 1];
			}

			float[] var10000;
			for (var47 = var8; var47 < var9; ++var47) {
				var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
				var10000 = field399;
				var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}

			for (var47 = var11; var47 < var12; ++var47) {
				var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var10000 = field399;
				var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}
		}

		float[] var43 = null;
		if (this.field396 > 0) {
			var41 = this.field396 + var4 >> 2;
			var43 = new float[var41];
			int var45;
			if (!this.field386) {
				for (var42 = 0; var42 < this.field397; ++var42) {
					var45 = (this.field396 >> 1) + var42;
					var43[var42] += this.field395[var45];
				}
			}

			if (!var15) {
				for (var42 = var8; var42 < var4 >> 1; ++var42) {
					var45 = var43.length - (var4 >> 1) + var42;
					var43[var45] += field399[var42];
				}
			}
		}

		float[] var44 = this.field395;
		this.field395 = field399;
		field399 = var44;
		this.field396 = var4;
		this.field397 = var12 - (var4 >> 1);
		this.field386 = var15;
		return var43;
	}

	class41 method1091(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field408 == null) {
				this.field396 = 0;
				this.field395 = new float[field387];
				this.field408 = new byte[this.field403];
				this.field393 = 0;
				this.field389 = 0;
			}

			for (; this.field389 < this.field398.length; ++this.field389) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1088(this.field389);
				if (var2 != null) {
					int var3 = this.field393;
					int var4 = var2.length;
					if (var4 > this.field403 - var3) {
						var4 = this.field403 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field408[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field393;
					}

					this.field393 = var3;
				}
			}

			this.field395 = null;
			byte[] var7 = this.field408;
			this.field408 = null;
			return new class41(this.field378, var7, this.field400, this.field381, this.field382);
		}
	}

	static float method1085(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	static void method1083(byte[] var0, int var1) {
		field409 = var0;
		field384 = var1;
		field385 = 0;
	}

	static int method1103() {
		int var0 = field409[field384] >> field385 & 1;
		++field385;
		field384 += field385 >> 3;
		field385 &= 7;
		return var0;
	}

	static int method1102(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - field385; var0 -= var3) {
			var3 = 8 - field385;
			int var4 = (1 << var3) - 1;
			var1 += (field409[field384] >> field385 & var4) << var2;
			field385 = 0;
			++field384;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (field409[field384] >> field385 & var3) << var2;
			field385 += var0;
		}

		return var1;
	}

	static void method1087(byte[] var0) {
		method1083(var0, 0);
		field380 = 1 << method1102(4);
		field387 = 1 << method1102(4);
		field399 = new float[field387];

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var1 = 0; var1 < 2; ++var1) {
			var2 = var1 != 0 ? field387 : field380;
			var3 = var2 >> 1;
			var4 = var2 >> 2;
			var5 = var2 >> 3;
			float[] var6 = new float[var3];

			for (int var7 = 0; var7 < var4; ++var7) {
				var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
				var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
			}

			float[] var19 = new float[var3];

			for (int var8 = 0; var8 < var4; ++var8) {
				var19[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
				var19[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
			}

			float[] var20 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var20[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
				var20[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
			}

			int[] var21 = new int[var5];
			int var10 = class296.method5520(var5 - 1);

			for (int var11 = 0; var11 < var5; ++var11) {
				int var15 = var11;
				int var16 = var10;

				int var17;
				for (var17 = 0; var16 > 0; --var16) {
					var17 = var17 << 1 | var15 & 1;
					var15 >>>= 1;
				}

				var21[var11] = var17;
			}

			if (var1 != 0) {
				field392 = var6;
				field404 = var19;
				field405 = var20;
				field407 = var21;
			} else {
				field410 = var6;
				field401 = var19;
				field402 = var20;
				field406 = var21;
			}
		}

		var1 = method1102(8) + 1;
		class47.field388 = new class52[var1];

		for (var2 = 0; var2 < var1; ++var2) {
			class47.field388[var2] = new class52();
		}

		var2 = method1102(6) + 1;

		for (var3 = 0; var3 < var2; ++var3) {
			method1102(16);
		}

		var2 = method1102(6) + 1;
		field394 = new class42[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field394[var3] = new class42();
		}

		var3 = method1102(6) + 1;
		field390 = new class47[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field390[var4] = new class47();
		}

		var4 = method1102(6) + 1;
		field391 = new class50[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field391[var5] = new class50();
		}

		var5 = method1102(6) + 1;
		field377 = new boolean[var5];
		field383 = new int[var5];

		for (int var18 = 0; var18 < var5; ++var18) {
			field377[var18] = method1103() != 0;
			method1102(16);
			method1102(16);
			field383[var18] = method1102(8);
		}

	}

	static boolean method1084(class344 var0) {
		if (!field379) {
			byte[] var1 = var0.method6468(0, 0);
			if (var1 == null) {
				return false;
			}

			method1087(var1);
			field379 = true;
		}

		return true;
	}

	static class53 method1090(class344 var0, int var1, int var2) {
		if (!method1084(var0)) {
			var0.method6448(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method6468(var1, var2);
			return var3 == null ? null : new class53(var3);
		}
	}
}
