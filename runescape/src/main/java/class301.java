public class class301 extends class449 {
	byte[] field3439;
	byte[] field3440;
	byte[] field3442;
	class297[] field3441;
	class41[] field3436;
	int field3438;
	int[] field3443;
	short[] field3437;

	class301(byte[] var1) {
		this.field3436 = new class41[128];
		this.field3437 = new short[128];
		this.field3439 = new byte[128];
		this.field3440 = new byte[128];
		this.field3441 = new class297[128];
		this.field3442 = new byte[128];
		this.field3443 = new int[128];
		class489 var2 = new class489(var1);

		int var3;
		for (var3 = 0; 0 != var2.field4991[var3 + var2.field4989]; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.method8659();
		}

		++var2.field4989;
		++var3;
		var5 = var2.field4989;
		var2.field4989 += var3;

		int var6;
		for (var6 = 0; var2.field4991[var2.field4989 + var6] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.method8659();
		}

		++var2.field4989;
		++var6;
		var8 = var2.field4989;
		var2.field4989 += var6;

		int var9;
		for (var9 = 0; var2.field4991[var2.field4989 + var9] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.method8659();
		}

		++var2.field4989;
		++var9;
		byte[] var38 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var38[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.method8658();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}

					var13 = var15;
				}

				var38[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		class297[] var39 = new class297[var12];

		class297 var40;
		for (var14 = 0; var14 < var39.length; ++var14) {
			var40 = var39[var14] = new class297();
			int var16 = var2.method8658();
			if (var16 > 0) {
				var40.field3375 = new byte[var16 * 2];
			}

			var16 = var2.method8658();
			if (var16 > 0) {
				var40.field3374 = new byte[2 + var16 * 2];
				var40.field3374[1] = 64;
			}
		}

		var14 = var2.method8658();
		byte[] var41 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.method8658();
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.field4991[var17 + var2.field4989] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.method8659();
		}

		++var2.field4989;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method8658();
			this.field3437[var20] = (short)var19;
		}

		var19 = 0;

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method8658();
			var50 = this.field3437;
			var50[var20] = (short)(var50[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.method8766();
			}

			var50 = this.field3437;
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field3443[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (0 != this.field3443[var24]) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.field4991[var5++] - 1;
				}

				this.field3442[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (0 != this.field3443[var25]) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.field4991[var8++] + 16 << 2;
				}

				this.field3440[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		class297 var44 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3443[var26] != 0) {
				if (var20 == 0) {
					var44 = var39[var38[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3441[var26] = var44;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field3443[var27] > 0) {
					var26 = var2.method8658() + 1;
				}
			}

			this.field3439[var27] = (byte)var26;
			--var20;
		}

		this.field3438 = var2.method8658() + 1;

		class297 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field3375 != null) {
				for (var29 = 1; var29 < var28.field3375.length; var29 += 2) {
					var28.field3375[var29] = var2.method8659();
				}
			}

			if (null != var28.field3374) {
				for (var29 = 3; var29 < var28.field3374.length - 2; var29 += 2) {
					var28.field3374[var29] = var2.method8659();
				}
			}
		}

		if (var41 != null) {
			for (var27 = 1; var27 < var41.length; var27 += 2) {
				var41[var27] = var2.method8659();
			}
		}

		if (null != var42) {
			for (var27 = 1; var27 < var42.length; var27 += 2) {
				var42[var27] = var2.method8659();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (null != var28.field3374) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3374.length; var29 += 2) {
					var19 = var19 + 1 + var2.method8658();
					var28.field3374[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field3375 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3375.length; var29 += 2) {
					var19 = var19 + 1 + var2.method8658();
					var28.field3375[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (null != var41) {
			var19 = var2.method8658();
			var41[0] = (byte)var19;

			for (var27 = 2; var27 < var41.length; var27 += 2) {
				var19 = var19 + 1 + var2.method8658();
				var41[var27] = (byte)var19;
			}

			var49 = var41[0];
			byte var45 = var41[1];

			for (var29 = 0; var29 < var49; ++var29) {
				this.field3439[var29] = (byte)(this.field3439[var29] * var45 + 32 >> 6);
			}

			for (var29 = 2; var29 < var41.length; var29 += 2) {
				var30 = var41[var29];
				byte var31 = var41[var29 + 1];
				var32 = (var30 - var49) * var45 + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					this.field3439[var33] = (byte)(32 + var34 * this.field3439[var33] >> 6);
					var32 += var31 - var45;
				}

				var49 = var30;
				var45 = var31;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				this.field3439[var47] = (byte)(32 + this.field3439[var47] * var45 >> 6);
			}

			var40 = null;
		}

		if (null != var42) {
			var19 = var2.method8658();
			var42[0] = (byte)var19;

			for (var27 = 2; var27 < var42.length; var27 += 2) {
				var19 = var19 + 1 + var2.method8658();
				var42[var27] = (byte)var19;
			}

			var49 = var42[0];
			int var46 = var42[1] << 1;

			for (var29 = 0; var29 < var49; ++var29) {
				var47 = var46 + (this.field3440[var29] & 255);
				if (var47 < 0) {
					var47 = 0;
				}

				if (var47 > 128) {
					var47 = 128;
				}

				this.field3440[var29] = (byte)var47;
			}

			int var48;
			for (var29 = 2; var29 < var42.length; var29 += 2) {
				var30 = var42[var29];
				var48 = var42[var29 + 1] << 1;
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					int var37 = (this.field3440[var33] & 255) + var34;
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.field3440[var33] = (byte)var37;
					var32 += var48 - var46;
				}

				var49 = var30;
				var46 = var48;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				var48 = var46 + (this.field3440[var47] & 255);
				if (var48 < 0) {
					var48 = 0;
				}

				if (var48 > 128) {
					var48 = 128;
				}

				this.field3440[var47] = (byte)var48;
			}

			Object var43 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3376 = var2.method8658();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (null != var28.field3375) {
				var28.field3377 = var2.method8658();
			}

			if (null != var28.field3374) {
				var28.field3382 = var2.method8658();
			}

			if (var28.field3376 > 0) {
				var28.field3379 = var2.method8658();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3381 = var2.method8658();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field3381 > 0) {
				var28.field3380 = var2.method8658();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field3380 > 0) {
				var28.field3378 = var2.method8658();
			}
		}

	}

	boolean method5722(class46 var1, byte[] var2, int[] var3) {
		boolean var5 = true;
		int var6 = 0;
		class41 var7 = null;

		for (int var8 = 0; var8 < 128; ++var8) {
			if (var2 == null || var2[var8] != 0) {
				int var9 = this.field3443[var8];
				if (var9 != 0) {
					if (var9 != var6) {
						var6 = var9--;
						if (0 == (var9 & 1)) {
							var7 = var1.method886(var9 >> 2, var3);
						} else {
							var7 = var1.method887(var9 >> 2, var3);
						}

						if (null == var7) {
							var5 = false;
						}
					}

					if (null != var7) {
						this.field3436[var8] = var7;
						this.field3443[var8] = 0;
					}
				}
			}
		}

		return var5;
	}

	void method5724() {
		this.field3443 = null;
	}
}
