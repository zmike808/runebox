public class class299 extends class49 {
	public static int field307;
	boolean field3420;
	class300 field3414;
	class302 field3403;
	class304[][] field3393;
	class304[][] field3413;
	class465 field3415;
	int field3395;
	int field3408;
	int field3416;
	int field3417;
	int[] field3396;
	int[] field3398;
	int[] field3399;
	int[] field3400;
	int[] field3401;
	int[] field3402;
	int[] field3404;
	int[] field3405;
	int[] field3406;
	int[] field3407;
	int[] field3409;
	int[] field3410;
	int[] field3411;
	int[] field3412;
	int[] field3421;
	long field3397;
	long field3418;

	public class299() {
		this.field3417 = 256;
		this.field3395 = 1000000;
		this.field3404 = new int[16];
		this.field3412 = new int[16];
		this.field3398 = new int[16];
		this.field3399 = new int[16];
		this.field3405 = new int[16];
		this.field3401 = new int[16];
		this.field3402 = new int[16];
		this.field3400 = new int[16];
		this.field3421 = new int[16];
		this.field3406 = new int[16];
		this.field3407 = new int[16];
		this.field3396 = new int[16];
		this.field3409 = new int[16];
		this.field3410 = new int[16];
		this.field3411 = new int[16];
		this.field3393 = new class304[16][128];
		this.field3413 = new class304[16][128];
		this.field3414 = new class300();
		this.field3403 = new class302(this);
		this.field3415 = new class465(128);
		this.method5587();
	}

	public synchronized void method5568(int var1) {
		this.field3417 = var1;
	}

	public int method5655() {
		return this.field3417;
	}

	public synchronized boolean method5570(class303 var1, class344 var2, class46 var3, int var4) {
		var1.method5737();
		boolean var6 = true;
		int[] var7 = null;
		if (var4 > 0) {
			var7 = new int[]{var4};
		}

		for (class446 var8 = (class446)var1.field3449.method8387(); null != var8; var8 = (class446)var1.field3449.method8384()) {
			int var9 = (int)var8.field4745;
			class301 var10 = (class301)this.field3415.method8381((long)var9);
			if (null == var10) {
				byte[] var12 = var2.method6501(var9);
				class301 var11;
				if (var12 == null) {
					var11 = null;
				} else {
					var11 = new class301(var12);
				}

				var10 = var11;
				if (null == var11) {
					var6 = false;
					continue;
				}

				this.field3415.method8382(var11, (long)var9);
			}

			if (!var10.method5722(var3, var8.field4742, var7)) {
				var6 = false;
			}
		}

		if (var6) {
			var1.method5738();
		}

		return var6;
	}

	public synchronized void method5649() {
		for (class301 var2 = (class301)this.field3415.method8387(); var2 != null; var2 = (class301)this.field3415.method8384()) {
			var2.method5724();
		}

	}

	public synchronized void method5572() {
		for (class301 var2 = (class301)this.field3415.method8387(); null != var2; var2 = (class301)this.field3415.method8384()) {
			var2.method8051();
		}

	}

	public synchronized void method5573(class303 var1, boolean var2) {
		this.method5574();
		this.field3414.method5677(var1.field3448);
		this.field3420 = var2;
		this.field3418 = 0L;
		int var4 = this.field3414.method5680();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field3414.method5681(var5);
			this.field3414.method5684(var5);
			this.field3414.method5682(var5);
		}

		this.field3416 = this.field3414.method5689();
		this.field3408 = this.field3414.field3422[this.field3416];
		this.field3397 = this.field3414.method5688(this.field3408);
	}

	public synchronized void method5574() {
		this.field3414.method5718();
		this.method5587();
	}

	public synchronized boolean method5575() {
		return this.field3414.method5687();
	}

	public synchronized void method5576(int var1, int var2) {
		this.method5577(var1, var2);
	}

	void method5577(int var1, int var2) {
		this.field3399[var1] = var2;
		this.field3401[var1] = var2 & -128;
		this.method5630(var1, var2);
	}

	void method5630(int var1, int var2) {
		if (var2 != this.field3405[var1]) {
			this.field3405[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field3413[var1][var4] = null;
			}
		}

	}

	void method5578(int var1, int var2, int var3) {
		this.method5580(var1, var2, 64);
		if (0 != (this.field3406[var1] & 2)) {
			for (class304 var5 = (class304)this.field3403.field3445.method6733(); var5 != null; var5 = (class304)this.field3403.field3445.method6727()) {
				if (var1 == var5.field3468 && var5.field3465 < 0) {
					this.field3393[var1][var5.field3455] = null;
					this.field3393[var1][var2] = var5;
					int var6 = var5.field3471 + (var5.field3460 * var5.field3459 >> 12);
					var5.field3471 += var2 - var5.field3455 << 8;
					var5.field3459 = var6 - var5.field3471;
					var5.field3460 = 4096;
					var5.field3455 = var2;
					return;
				}
			}
		}

		class301 var9 = (class301)this.field3415.method8381((long)this.field3405[var1]);
		if (var9 != null) {
			class41 var10 = var9.field3436[var2];
			if (null != var10) {
				class304 var7 = new class304();
				var7.field3468 = var1;
				var7.field3467 = var9;
				var7.field3452 = var10;
				var7.field3453 = var9.field3441[var2];
				var7.field3451 = var9.field3442[var2];
				var7.field3455 = var2;
				var7.field3456 = 1024 + var9.field3438 * var3 * var3 * var9.field3439[var2] >> 11;
				var7.field3457 = var9.field3440[var2] & 255;
				var7.field3471 = (var2 << 8) - (var9.field3437[var2] & 32767);
				var7.field3461 = 0;
				var7.field3462 = 0;
				var7.field3469 = 0;
				var7.field3465 = -1;
				var7.field3450 = 0;
				if (this.field3409[var1] == 0) {
					var7.field3464 = class48.method979(var10, this.method5592(var7), this.method5593(var7), this.method5594(var7));
				} else {
					var7.field3464 = class48.method979(var10, this.method5592(var7), 0, this.method5594(var7));
					this.method5600(var7, var9.field3437[var2] < 0);
				}

				if (var9.field3437[var2] < 0) {
					var7.field3464.method906(-1);
				}

				if (var7.field3451 >= 0) {
					class304 var8 = this.field3413[var1][var7.field3451];
					if (null != var8 && var8.field3465 < 0) {
						this.field3393[var1][var8.field3455] = null;
						var8.field3465 = 0;
					}

					this.field3413[var1][var7.field3451] = var7;
				}

				this.field3403.field3445.method6711(var7);
				this.field3393[var1][var2] = var7;
			}
		}
	}

	void method5600(class304 var1, boolean var2) {
		int var4 = var1.field3452.field280.length;
		int var5;
		if (var2 && var1.field3452.field281) {
			int var6 = var4 + var4 - var1.field3452.field284;
			var5 = (int)((long)this.field3409[var1.field3468] * (long)var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field3464.method913(true);
			}
		} else {
			var5 = (int)((long)this.field3409[var1.field3468] * (long)var4 >> 6);
		}

		var1.field3464.method912(var5);
	}

	void method5580(int var1, int var2, int var3) {
		class304 var5 = this.field3393[var1][var2];
		if (null != var5) {
			this.field3393[var1][var2] = null;
			if (0 != (this.field3406[var1] & 2)) {
				for (class304 var6 = (class304)this.field3403.field3445.method6716(); null != var6; var6 = (class304)this.field3403.field3445.method6725()) {
					if (var6.field3468 == var5.field3468 && var6.field3465 < 0 && var6 != var5) {
						var5.field3465 = 0;
						break;
					}
				}
			} else {
				var5.field3465 = 0;
			}

		}
	}

	void method5581(int var1, int var2, int var3) {
	}

	void method5636(int var1, int var2) {
	}

	void method5583(int var1, int var2) {
		this.field3402[var1] = var2;
	}

	void method5584(int var1) {
		for (class304 var3 = (class304)this.field3403.field3445.method6716(); null != var3; var3 = (class304)this.field3403.field3445.method6725()) {
			if (var1 < 0 || var3.field3468 == var1) {
				if (null != var3.field3464) {
					var3.field3464.method917(field307 / 100);
					if (var3.field3464.method1022()) {
						this.field3403.field3446.method747(var3.field3464);
					}

					var3.method5752();
				}

				if (var3.field3465 < 0) {
					this.field3393[var3.field3468][var3.field3455] = null;
				}

				var3.method8051();
			}
		}

	}

	void method5585(int var1) {
		if (var1 >= 0) {
			this.field3404[var1] = 12800;
			this.field3412[var1] = 8192;
			this.field3398[var1] = 16383;
			this.field3402[var1] = 8192;
			this.field3400[var1] = 0;
			this.field3421[var1] = 8192;
			this.method5612(var1);
			this.method5589(var1);
			this.field3406[var1] = 0;
			this.field3407[var1] = 32767;
			this.field3396[var1] = 256;
			this.field3409[var1] = 0;
			this.method5591(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5585(var1);
			}

		}
	}

	void method5569(int var1) {
		for (class304 var3 = (class304)this.field3403.field3445.method6716(); null != var3; var3 = (class304)this.field3403.field3445.method6725()) {
			if ((var1 < 0 || var1 == var3.field3468) && var3.field3465 < 0) {
				this.field3393[var3.field3468][var3.field3455] = null;
				var3.field3465 = 0;
			}
		}

	}

	void method5587() {
		this.method5584(-1);
		this.method5585(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field3405[var2] = this.field3399[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field3401[var2] = this.field3399[var2] & -128;
		}

	}

	void method5612(int var1) {
		if (0 != (this.field3406[var1] & 2)) {
			for (class304 var3 = (class304)this.field3403.field3445.method6716(); var3 != null; var3 = (class304)this.field3403.field3445.method6725()) {
				if (var3.field3468 == var1 && this.field3393[var1][var3.field3455] == null && var3.field3465 < 0) {
					var3.field3465 = 0;
				}
			}
		}

	}

	void method5589(int var1) {
		if (0 != (this.field3406[var1] & 4)) {
			for (class304 var3 = (class304)this.field3403.field3445.method6716(); var3 != null; var3 = (class304)this.field3403.field3445.method6725()) {
				if (var3.field3468 == var1) {
					var3.field3470 = 0;
				}
			}
		}

	}

	void method5590(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method5580(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method5578(var4, var5, var6);
			} else {
				this.method5580(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method5581(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field3401[var4] = (var6 << 14) + (this.field3401[var4] & -2080769);
			}

			if (var5 == 32) {
				this.field3401[var4] = (this.field3401[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 1) {
				this.field3400[var4] = (this.field3400[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 33) {
				this.field3400[var4] = (this.field3400[var4] & -128) + var6;
			}

			if (var5 == 5) {
				this.field3421[var4] = (this.field3421[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 37) {
				this.field3421[var4] = (this.field3421[var4] & -128) + var6;
			}

			if (var5 == 7) {
				this.field3404[var4] = (this.field3404[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 39) {
				this.field3404[var4] = var6 + (this.field3404[var4] & -128);
			}

			if (var5 == 10) {
				this.field3412[var4] = (this.field3412[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 42) {
				this.field3412[var4] = var6 + (this.field3412[var4] & -128);
			}

			if (var5 == 11) {
				this.field3398[var4] = (this.field3398[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 43) {
				this.field3398[var4] = var6 + (this.field3398[var4] & -128);
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field3406;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field3406;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field3406;
					var10000[var4] |= 2;
				} else {
					this.method5612(var4);
					var10000 = this.field3406;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field3407[var4] = (var6 << 7) + (this.field3407[var4] & 127);
			}

			if (var5 == 98) {
				this.field3407[var4] = var6 + (this.field3407[var4] & 16256);
			}

			if (var5 == 101) {
				this.field3407[var4] = (this.field3407[var4] & 127) + 16384 + (var6 << 7);
			}

			if (var5 == 100) {
				this.field3407[var4] = var6 + 16384 + (this.field3407[var4] & 16256);
			}

			if (var5 == 120) {
				this.method5584(var4);
			}

			if (var5 == 121) {
				this.method5585(var4);
			}

			if (var5 == 123) {
				this.method5569(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field3407[var4];
				if (var7 == 16384) {
					this.field3396[var4] = (this.field3396[var4] & -16257) + (var6 << 7);
				}
			}

			if (var5 == 38) {
				var7 = this.field3407[var4];
				if (var7 == 16384) {
					this.field3396[var4] = var6 + (this.field3396[var4] & -128);
				}
			}

			if (var5 == 16) {
				this.field3409[var4] = (this.field3409[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 48) {
				this.field3409[var4] = var6 + (this.field3409[var4] & -128);
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field3406;
					var10000[var4] |= 4;
				} else {
					this.method5589(var4);
					var10000 = this.field3406;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method5591(var4, (this.field3410[var4] & -16257) + (var6 << 7));
			}

			if (var5 == 49) {
				this.method5591(var4, (this.field3410[var4] & -128) + var6);
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method5630(var4, var5 + this.field3401[var4]);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method5636(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5583(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method5587();
			}
		}
	}

	void method5591(int var1, int var2) {
		this.field3410[var1] = var2;
		this.field3411[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	int method5592(class304 var1) {
		int var3 = (var1.field3459 * var1.field3460 >> 12) + var1.field3471;
		var3 += this.field3396[var1.field3468] * (this.field3402[var1.field3468] - 8192) >> 12;
		class297 var4 = var1.field3453;
		int var5;
		if (var4.field3381 > 0 && (var4.field3380 > 0 || this.field3400[var1.field3468] > 0)) {
			var5 = var4.field3380 << 2;
			int var6 = var4.field3378 << 1;
			if (var1.field3466 < var6) {
				var5 = var5 * var1.field3466 / var6;
			}

			var5 += this.field3400[var1.field3468] >> 7;
			double var7 = Math.sin(0.01227184630308513D * (double)(var1.field3458 & 511));
			var3 += (int)(var7 * (double)var5);
		}

		var5 = (int)((double)(256 * var1.field3452.field282) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)field307 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	int method5593(class304 var1) {
		class297 var3 = var1.field3453;
		int var4 = this.field3404[var1.field3468] * this.field3398[var1.field3468] + 4096 >> 13;
		var4 = var4 * var4 + 16384 >> 15;
		var4 = var1.field3456 * var4 + 16384 >> 15;
		var4 = 128 + this.field3417 * var4 >> 8;
		if (var3.field3376 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, (double)var3.field3376 * (double)var1.field3461 * 1.953125E-5D) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (null != var3.field3375) {
			var5 = var1.field3462;
			var6 = var3.field3375[1 + var1.field3469];
			if (var1.field3469 < var3.field3375.length - 2) {
				var7 = (var3.field3375[var1.field3469] & 255) << 8;
				var8 = (var3.field3375[var1.field3469 + 2] & 255) << 8;
				var6 += (var3.field3375[3 + var1.field3469] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var4 * var6 + 32 >> 6;
		}

		if (var1.field3465 > 0 && var3.field3374 != null) {
			var5 = var1.field3465;
			var6 = var3.field3374[1 + var1.field3450];
			if (var1.field3450 < var3.field3374.length - 2) {
				var7 = (var3.field3374[var1.field3450] & 255) << 8;
				var8 = (var3.field3374[var1.field3450 + 2] & 255) << 8;
				var6 += (var3.field3374[var1.field3450 + 3] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var6 * var4 + 32 >> 6;
		}

		return var4;
	}

	int method5594(class304 var1) {
		int var3 = this.field3412[var1.field3468];
		return var3 < 8192 ? 32 + var3 * var1.field3457 >> 6 : 16384 - ((16384 - var3) * (128 - var1.field3457) + 32 >> 6);
	}

	protected synchronized class49 method1042() {
		return this.field3403;
	}

	protected synchronized class49 method1040() {
		return null;
	}

	protected synchronized int method1044() {
		return 0;
	}

	protected synchronized void method1064(int[] var1, int var2, int var3) {
		if (this.field3414.method5687()) {
			int var4 = this.field3414.field3424 * this.field3395 / field307;

			do {
				long var5 = (long)var3 * (long)var4 + this.field3418;
				if (this.field3397 - var5 >= 0L) {
					this.field3418 = var5;
					break;
				}

				int var7 = (int)((this.field3397 - this.field3418 + (long)var4 - 1L) / (long)var4);
				this.field3418 += (long)var4 * (long)var7;
				this.field3403.method1064(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5595();
			} while(this.field3414.method5687());
		}

		this.field3403.method1064(var1, var2, var3);
	}

	protected synchronized void method1046(int var1) {
		if (this.field3414.method5687()) {
			int var2 = this.field3414.field3424 * this.field3395 / field307;

			do {
				long var3 = this.field3418 + (long)var2 * (long)var1;
				if (this.field3397 - var3 >= 0L) {
					this.field3418 = var3;
					break;
				}

				int var5 = (int)((this.field3397 - this.field3418 + (long)var2 - 1L) / (long)var2);
				this.field3418 += (long)var5 * (long)var2;
				this.field3403.method1046(var5);
				var1 -= var5;
				this.method5595();
			} while(this.field3414.method5687());
		}

		this.field3403.method1046(var1);
	}

	void method5595() {
		int var2 = this.field3416;
		int var3 = this.field3408;

		long var4;
		for (var4 = this.field3397; this.field3408 == var3; var4 = this.field3414.method5688(var3)) {
			while (this.field3414.field3422[var2] == var3) {
				this.field3414.method5681(var2);
				int var6 = this.field3414.method5685(var2);
				if (var6 == 1) {
					this.field3414.method5714();
					this.field3414.method5682(var2);
					if (this.field3414.method5690()) {
						if (!this.field3420 || var3 == 0) {
							this.method5587();
							this.field3414.method5718();
							return;
						}

						this.field3414.method5691(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					this.method5590(var6);
				}

				this.field3414.method5684(var2);
				this.field3414.method5682(var2);
			}

			var2 = this.field3414.method5689();
			var3 = this.field3414.field3422[var2];
		}

		this.field3416 = var2;
		this.field3408 = var3;
		this.field3397 = var4;
	}

	boolean method5665(class304 var1) {
		if (var1.field3464 == null) {
			if (var1.field3465 >= 0) {
				var1.method8051();
				if (var1.field3451 > 0 && this.field3413[var1.field3468][var1.field3451] == var1) {
					this.field3413[var1.field3468][var1.field3451] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	boolean method5596(class304 var1, int[] var2, int var3, int var4) {
		var1.field3463 = field307 / 100;
		if (var1.field3465 < 0 || var1.field3464 != null && !var1.field3464.method989()) {
			int var6 = var1.field3460;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3421[var1.field3468] * 4.921259842519685E-4D) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field3460 = var6;
			}

			var1.field3464.method918(this.method5592(var1));
			class297 var7 = var1.field3453;
			boolean var8 = false;
			++var1.field3466;
			var1.field3458 += var7.field3381;
			double var9 = 5.086263020833333E-6D * (double)((var1.field3459 * var1.field3460 >> 12) + (var1.field3455 - 60 << 8));
			if (var7.field3376 > 0) {
				if (var7.field3379 > 0) {
					var1.field3461 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3379 * var9) + 0.5D);
				} else {
					var1.field3461 += 128;
				}
			}

			if (null != var7.field3375) {
				if (var7.field3377 > 0) {
					var1.field3462 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3377 * var9) + 0.5D);
				} else {
					var1.field3462 += 128;
				}

				while (var1.field3469 < var7.field3375.length - 2 && var1.field3462 > (var7.field3375[var1.field3469 + 2] & 255) << 8) {
					var1.field3469 += 2;
				}

				if (var1.field3469 == var7.field3375.length - 2 && 0 == var7.field3375[1 + var1.field3469]) {
					var8 = true;
				}
			}

			if (var1.field3465 >= 0 && var7.field3374 != null && 0 == (this.field3406[var1.field3468] & 1) && (var1.field3451 < 0 || var1 != this.field3413[var1.field3468][var1.field3451])) {
				if (var7.field3382 > 0) {
					var1.field3465 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3382 * var9) + 0.5D);
				} else {
					var1.field3465 += 128;
				}

				while (var1.field3450 < var7.field3374.length - 2 && var1.field3465 > (var7.field3374[2 + var1.field3450] & 255) << 8) {
					var1.field3450 += 2;
				}

				if (var7.field3374.length - 2 == var1.field3450) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field3464.method917(var1.field3463);
				if (null != var2) {
					var1.field3464.method1064(var2, var3, var4);
				} else {
					var1.field3464.method1046(var4);
				}

				if (var1.field3464.method1022()) {
					this.field3403.field3446.method747(var1.field3464);
				}

				var1.method5752();
				if (var1.field3465 >= 0) {
					var1.method8051();
					if (var1.field3451 > 0 && this.field3413[var1.field3468][var1.field3451] == var1) {
						this.field3413[var1.field3468][var1.field3451] = null;
					}
				}

				return true;
			} else {
				var1.field3464.method916(var1.field3463, this.method5593(var1), this.method5594(var1));
				return false;
			}
		} else {
			var1.method5752();
			var1.method8051();
			if (var1.field3451 > 0 && var1 == this.field3413[var1.field3468][var1.field3451]) {
				this.field3413[var1.field3468][var1.field3451] = null;
			}

			return true;
		}
	}
}
