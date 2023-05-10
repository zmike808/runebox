import java.util.Random;

public class class58 {
	static int field431;
	static int[] field448;
	static int[] field449;
	static int[] field450;
	static int[] field454;
	static int[] field457;
	static int[] field458;
	static int[] field459;
	static int[] field460;
	class44 field436;
	class44 field437;
	class44 field438;
	class44 field439;
	class44 field440;
	class44 field441;
	class44 field442;
	class44 field452;
	class44 field453;
	class57 field455;
	int field443;
	int field445;
	int field446;
	int field447;
	int[] field435;
	int[] field444;
	int[] field451;

	static {
		field450 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field450[var1] = (var0.nextInt() & 2) - 1;
		}

		field454 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field454[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field449 = new int[220500];
		field459 = new int[5];
		field457 = new int[5];
		field458 = new int[5];
		field448 = new int[5];
		field460 = new int[5];
	}

	class58() {
		this.field435 = new int[]{0, 0, 0, 0, 0};
		this.field444 = new int[]{0, 0, 0, 0, 0};
		this.field451 = new int[]{0, 0, 0, 0, 0};
		this.field446 = 0;
		this.field447 = 100;
		this.field443 = 500;
		this.field445 = 0;
	}

	final int[] method1157(int var1, int var2) {
		class385.method7296(field449, 0, var1);
		if (var2 < 10) {
			return field449;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field453.method871();
			this.field436.method871();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field437 != null) {
				this.field437.method871();
				this.field438.method871();
				var5 = (int)((double)(this.field437.field322 - this.field437.field321) * 32.768D / var3);
				var6 = (int)((double)this.field437.field321 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field439 != null) {
				this.field439.method871();
				this.field440.method871();
				var8 = (int)((double)(this.field439.field322 - this.field439.field321) * 32.768D / var3);
				var9 = (int)((double)this.field439.field321 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field435[var11] != 0) {
					field459[var11] = 0;
					field457[var11] = (int)((double)this.field451[var11] * var3);
					field458[var11] = (this.field435[var11] << 14) / 100;
					field448[var11] = (int)((double)(this.field453.field322 - this.field453.field321) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field444[var11]) / var3);
					field460[var11] = (int)((double)this.field453.field321 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field453.method868(var1);
				var13 = this.field436.method868(var1);
				if (this.field437 != null) {
					var14 = this.field437.method868(var1);
					var15 = this.field438.method868(var1);
					var12 += this.method1158(var7, var15, this.field437.field318) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field439 != null) {
					var14 = this.field439.method868(var1);
					var15 = this.field440.method868(var1);
					var13 = var13 * ((this.method1158(var10, var15, this.field439.field318) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field435[var14] != 0) {
						var15 = var11 + field457[var14];
						if (var15 < var1) {
							var10000 = field449;
							var10000[var15] += this.method1158(field459[var14], var13 * field458[var14] >> 15, this.field453.field318);
							var10000 = field459;
							var10000[var14] += (var12 * field448[var14] >> 16) + field460[var14];
						}
					}
				}
			}

			int var16;
			if (this.field441 != null) {
				this.field441.method871();
				this.field442.method871();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field441.method868(var1);
					var16 = this.field442.method868(var1);
					if (var20) {
						var12 = this.field441.field321 + ((this.field441.field322 - this.field441.field321) * var15 >> 8);
					} else {
						var12 = this.field441.field321 + ((this.field441.field322 - this.field441.field321) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field449[var14] = 0;
					}
				}
			}

			if (this.field446 > 0 && this.field447 > 0) {
				var11 = (int)((double)this.field446 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field449;
					var10000[var12] += field449[var12 - var11] * this.field447 / 100;
				}
			}

			if (this.field455.field429[0] > 0 || this.field455.field429[1] > 0) {
				this.field452.method871();
				var11 = this.field452.method868(var1 + 1);
				var12 = this.field455.method1154(0, (float)var11 / 65536.0F);
				var13 = this.field455.method1154(1, (float)var11 / 65536.0F);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field449[var14 + var12] * (long)field431 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field449[var14 + var12 - 1 - var17] * (long)class57.field434[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field449[var14 - 1 - var17] * (long)class57.field434[1][var17] >> 16);
						}

						field449[var14] = var16;
						var11 = this.field452.method868(var1 + 1);
						++var14;
					}

					boolean var21 = true;
					var15 = 128;

					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)field449[var14 + var12] * (long)field431 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field449[var14 + var12 - 1 - var18] * (long)class57.field434[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field449[var14 - 1 - var18] * (long)class57.field434[1][var18] >> 16);
							}

							field449[var14] = var17;
							var11 = this.field452.method868(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field449[var14 + var12 - 1 - var18] * (long)class57.field434[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field449[var14 - 1 - var18] * (long)class57.field434[1][var18] >> 16);
								}

								field449[var14] = var17;
								this.field452.method868(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field455.method1154(0, (float)var11 / 65536.0F);
						var13 = this.field455.method1154(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field449[var11] < -32768) {
					field449[var11] = -32768;
				}

				if (field449[var11] > 32767) {
					field449[var11] = 32767;
				}
			}

			return field449;
		}
	}

	final int method1158(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field454[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field450[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	final void method1160(class489 var1) {
		this.field453 = new class44();
		this.field453.method866(var1);
		this.field436 = new class44();
		this.field436.method866(var1);
		int var2 = var1.method8658();
		if (var2 != 0) {
			--var1.field4989;
			this.field437 = new class44();
			this.field437.method866(var1);
			this.field438 = new class44();
			this.field438.method866(var1);
		}

		var2 = var1.method8658();
		if (var2 != 0) {
			--var1.field4989;
			this.field439 = new class44();
			this.field439.method866(var1);
			this.field440 = new class44();
			this.field440.method866(var1);
		}

		var2 = var1.method8658();
		if (var2 != 0) {
			--var1.field4989;
			this.field441 = new class44();
			this.field441.method866(var1);
			this.field442 = new class44();
			this.field442.method866(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method8827();
			if (var4 == 0) {
				break;
			}

			this.field435[var3] = var4;
			this.field444[var3] = var1.method8673();
			this.field451[var3] = var1.method8827();
		}

		this.field446 = var1.method8827();
		this.field447 = var1.method8827();
		this.field443 = var1.method8660();
		this.field445 = var1.method8660();
		this.field455 = new class57();
		this.field452 = new class44();
		this.field455.method1138(var1, this.field452);
	}
}
