public class class214 extends class225 {
	static int field2454;
	static int[] field2412;
	static int[] field2435;
	static int[] field2452;
	static int[] field2453;
	boolean field2446;
	byte field2429;
	byte[] field2424;
	byte[] field2426;
	byte[] field2431;
	byte[] field2443;
	byte[] field2445;
	class226[] field2441;
	class234[] field2442;
	class234[] field2455;
	int field2415;
	int field2419;
	int field2434;
	int field2439;
	int field2444;
	int field2447;
	int field2448;
	int field2450;
	int[] field2416;
	int[] field2417;
	int[] field2418;
	int[] field2420;
	int[] field2422;
	int[] field2423;
	int[] field2436;
	int[] field2456;
	int[][] field2413;
	int[][] field2430;
	int[][] field2438;
	int[][] field2440;
	short[] field2427;
	short[] field2428;
	short[] field2432;
	short[] field2437;
	short[] field2449;
	public short field2425;
	public short field2433;

	static {
		field2452 = new int[10000];
		field2453 = new int[10000];
		field2454 = 0;
		field2435 = class219.field2512;
		field2412 = class219.field2516;
	}

	class214() {
		this.field2415 = 0;
		this.field2419 = 0;
		this.field2429 = 0;
		this.field2446 = false;
	}

	class214(byte[] var1) {
		this.field2415 = 0;
		this.field2419 = 0;
		this.field2429 = 0;
		this.field2446 = false;
		class489 var2 = new class489(10);
		var2.method8642(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method4156(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method4195(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method4158(var1);
		} else {
			this.method4159(var1);
		}

	}

	public class214(class214[] var1, int var2) {
		this.field2415 = 0;
		this.field2419 = 0;
		this.field2429 = 0;
		this.field2446 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field2415 = 0;
		this.field2419 = 0;
		this.field2444 = 0;
		this.field2429 = -1;

		int var10;
		class214 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field2415 += var11.field2415;
				this.field2419 += var11.field2419;
				this.field2444 += var11.field2444;
				if (var11.field2424 != null) {
					var4 = true;
				} else {
					if (this.field2429 == -1) {
						this.field2429 = var11.field2429;
					}

					if (this.field2429 != var11.field2429) {
						var4 = true;
					}
				}

				var3 |= var11.field2443 != null;
				var5 |= var11.field2445 != null;
				var6 |= var11.field2436 != null;
				var7 |= var11.field2428 != null;
				var8 |= var11.field2426 != null;
				var9 |= var11.field2413 != null;
			}
		}

		this.field2416 = new int[this.field2415];
		this.field2417 = new int[this.field2415];
		this.field2418 = new int[this.field2415];
		this.field2423 = new int[this.field2415];
		this.field2420 = new int[this.field2419];
		this.field2456 = new int[this.field2419];
		this.field2422 = new int[this.field2419];
		if (var3) {
			this.field2443 = new byte[this.field2419];
		}

		if (var4) {
			this.field2424 = new byte[this.field2419];
		}

		if (var5) {
			this.field2445 = new byte[this.field2419];
		}

		if (var6) {
			this.field2436 = new int[this.field2419];
		}

		if (var7) {
			this.field2428 = new short[this.field2419];
		}

		if (var8) {
			this.field2426 = new byte[this.field2419];
		}

		if (var9) {
			this.field2413 = new int[this.field2415][];
			this.field2440 = new int[this.field2415][];
		}

		this.field2427 = new short[this.field2419];
		if (this.field2444 > 0) {
			this.field2431 = new byte[this.field2444];
			this.field2432 = new short[this.field2444];
			this.field2449 = new short[this.field2444];
			this.field2437 = new short[this.field2444];
		}

		this.field2415 = 0;
		this.field2419 = 0;
		this.field2444 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field2419; ++var12) {
					if (var3 && var11.field2443 != null) {
						this.field2443[this.field2419] = var11.field2443[var12];
					}

					if (var4) {
						if (var11.field2424 != null) {
							this.field2424[this.field2419] = var11.field2424[var12];
						} else {
							this.field2424[this.field2419] = var11.field2429;
						}
					}

					if (var5 && var11.field2445 != null) {
						this.field2445[this.field2419] = var11.field2445[var12];
					}

					if (var6 && var11.field2436 != null) {
						this.field2436[this.field2419] = var11.field2436[var12];
					}

					if (var7) {
						if (var11.field2428 != null) {
							this.field2428[this.field2419] = var11.field2428[var12];
						} else {
							this.field2428[this.field2419] = -1;
						}
					}

					if (var8) {
						if (var11.field2426 != null && var11.field2426[var12] != -1) {
							this.field2426[this.field2419] = (byte)(var11.field2426[var12] + this.field2444);
						} else {
							this.field2426[this.field2419] = -1;
						}
					}

					this.field2427[this.field2419] = var11.field2427[var12];
					this.field2420[this.field2419] = this.method4189(var11, var11.field2420[var12]);
					this.field2456[this.field2419] = this.method4189(var11, var11.field2456[var12]);
					this.field2422[this.field2419] = this.method4189(var11, var11.field2422[var12]);
					++this.field2419;
				}

				for (var12 = 0; var12 < var11.field2444; ++var12) {
					byte var13 = this.field2431[this.field2444] = var11.field2431[var12];
					if (var13 == 0) {
						this.field2432[this.field2444] = (short)this.method4189(var11, var11.field2432[var12]);
						this.field2449[this.field2444] = (short)this.method4189(var11, var11.field2449[var12]);
						this.field2437[this.field2444] = (short)this.method4189(var11, var11.field2437[var12]);
					}

					++this.field2444;
				}
			}
		}

	}

	public class214(class214 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field2415 = 0;
		this.field2419 = 0;
		this.field2429 = 0;
		this.field2446 = false;
		this.field2415 = var1.field2415;
		this.field2419 = var1.field2419;
		this.field2444 = var1.field2444;
		int var6;
		if (var2) {
			this.field2416 = var1.field2416;
			this.field2417 = var1.field2417;
			this.field2418 = var1.field2418;
		} else {
			this.field2416 = new int[this.field2415];
			this.field2417 = new int[this.field2415];
			this.field2418 = new int[this.field2415];

			for (var6 = 0; var6 < this.field2415; ++var6) {
				this.field2416[var6] = var1.field2416[var6];
				this.field2417[var6] = var1.field2417[var6];
				this.field2418[var6] = var1.field2418[var6];
			}
		}

		if (var3) {
			this.field2427 = var1.field2427;
		} else {
			this.field2427 = new short[this.field2419];

			for (var6 = 0; var6 < this.field2419; ++var6) {
				this.field2427[var6] = var1.field2427[var6];
			}
		}

		if (!var4 && var1.field2428 != null) {
			this.field2428 = new short[this.field2419];

			for (var6 = 0; var6 < this.field2419; ++var6) {
				this.field2428[var6] = var1.field2428[var6];
			}
		} else {
			this.field2428 = var1.field2428;
		}

		if (var5) {
			this.field2445 = var1.field2445;
		} else {
			this.field2445 = new byte[this.field2419];
			if (var1.field2445 == null) {
				for (var6 = 0; var6 < this.field2419; ++var6) {
					this.field2445[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field2419; ++var6) {
					this.field2445[var6] = var1.field2445[var6];
				}
			}
		}

		this.field2420 = var1.field2420;
		this.field2456 = var1.field2456;
		this.field2422 = var1.field2422;
		this.field2443 = var1.field2443;
		this.field2424 = var1.field2424;
		this.field2426 = var1.field2426;
		this.field2429 = var1.field2429;
		this.field2431 = var1.field2431;
		this.field2432 = var1.field2432;
		this.field2449 = var1.field2449;
		this.field2437 = var1.field2437;
		this.field2423 = var1.field2423;
		this.field2436 = var1.field2436;
		this.field2430 = var1.field2430;
		this.field2438 = var1.field2438;
		this.field2455 = var1.field2455;
		this.field2441 = var1.field2441;
		this.field2442 = var1.field2442;
		this.field2413 = var1.field2413;
		this.field2440 = var1.field2440;
		this.field2433 = var1.field2433;
		this.field2425 = var1.field2425;
	}

	void method4156(byte[] var1) {
		class489 var2 = new class489(var1);
		class489 var3 = new class489(var1);
		class489 var4 = new class489(var1);
		class489 var5 = new class489(var1);
		class489 var6 = new class489(var1);
		class489 var7 = new class489(var1);
		class489 var8 = new class489(var1);
		var2.field4989 = var1.length - 26;
		int var9 = var2.method8660();
		int var10 = var2.method8660();
		int var11 = var2.method8658();
		int var12 = var2.method8658();
		int var13 = var2.method8658();
		int var14 = var2.method8658();
		int var15 = var2.method8658();
		int var16 = var2.method8658();
		int var17 = var2.method8658();
		int var18 = var2.method8658();
		int var19 = var2.method8660();
		int var20 = var2.method8660();
		int var21 = var2.method8660();
		int var22 = var2.method8660();
		int var23 = var2.method8660();
		int var24 = var2.method8660();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field2431 = new byte[var11];
			var2.field4989 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field2431[var28] = var2.method8659();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field2415 = var9;
		this.field2419 = var10;
		this.field2444 = var11;
		this.field2416 = new int[var9];
		this.field2417 = new int[var9];
		this.field2418 = new int[var9];
		this.field2420 = new int[var10];
		this.field2456 = new int[var10];
		this.field2422 = new int[var10];
		if (var17 == 1) {
			this.field2423 = new int[var9];
		}

		if (var12 == 1) {
			this.field2443 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2424 = new byte[var10];
		} else {
			this.field2429 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2445 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2436 = new int[var10];
		}

		if (var16 == 1) {
			this.field2428 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2426 = new byte[var10];
		}

		if (var18 == 1) {
			this.field2413 = new int[var9][];
			this.field2440 = new int[var9][];
		}

		this.field2427 = new short[var10];
		if (var11 > 0) {
			this.field2432 = new short[var11];
			this.field2449 = new short[var11];
			this.field2437 = new short[var11];
		}

		var2.field4989 = var11;
		var3.field4989 = var40;
		var4.field4989 = var41;
		var5.field4989 = var42;
		var6.field4989 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method8658();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method8673();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method8673();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method8673();
			}

			this.field2416[var53] = var50 + var55;
			this.field2417[var53] = var51 + var56;
			this.field2418[var53] = var52 + var57;
			var50 = this.field2416[var53];
			var51 = this.field2417[var53];
			var52 = this.field2418[var53];
			if (var17 == 1) {
				this.field2423[var53] = var6.method8658();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method8658();
				this.field2413[var53] = new int[var54];
				this.field2440[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field2413[var53][var55] = var6.method8658();
					this.field2440[var53][var55] = var6.method8658();
				}
			}
		}

		var2.field4989 = var39;
		var3.field4989 = var30;
		var4.field4989 = var32;
		var5.field4989 = var35;
		var6.field4989 = var33;
		var7.field4989 = var37;
		var8.field4989 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field2427[var53] = (short)var2.method8660();
			if (var12 == 1) {
				this.field2443[var53] = var3.method8659();
			}

			if (var13 == 255) {
				this.field2424[var53] = var4.method8659();
			}

			if (var14 == 1) {
				this.field2445[var53] = var5.method8659();
			}

			if (var15 == 1) {
				this.field2436[var53] = var6.method8658();
			}

			if (var16 == 1) {
				this.field2428[var53] = (short)(var7.method8660() - 1);
			}

			if (this.field2426 != null && this.field2428[var53] != -1) {
				this.field2426[var53] = (byte)(var8.method8658() - 1);
			}
		}

		var2.field4989 = var36;
		var3.field4989 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method8658();
			if (var58 == 1) {
				var53 = var2.method8673() + var56;
				var54 = var2.method8673() + var53;
				var55 = var2.method8673() + var54;
				var56 = var55;
				this.field2420[var57] = var53;
				this.field2456[var57] = var54;
				this.field2422[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method8673() + var56;
				var56 = var55;
				this.field2420[var57] = var53;
				this.field2456[var57] = var54;
				this.field2422[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method8673() + var56;
				var56 = var55;
				this.field2420[var57] = var53;
				this.field2456[var57] = var54;
				this.field2422[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method8673() + var56;
				var56 = var55;
				this.field2420[var57] = var53;
				this.field2456[var57] = var59;
				this.field2422[var57] = var55;
			}
		}

		var2.field4989 = var43;
		var3.field4989 = var44;
		var4.field4989 = var45;
		var5.field4989 = var46;
		var6.field4989 = var47;
		var7.field4989 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field2431[var57] & 255;
			if (var58 == 0) {
				this.field2432[var57] = (short)var2.method8660();
				this.field2449[var57] = (short)var2.method8660();
				this.field2437[var57] = (short)var2.method8660();
			}
		}

		var2.field4989 = var28;
		var57 = var2.method8658();
		if (var57 != 0) {
			new class239();
			var2.method8660();
			var2.method8660();
			var2.method8660();
			var2.method8664();
		}

	}

	void method4195(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class489 var4 = new class489(var1);
		class489 var5 = new class489(var1);
		class489 var6 = new class489(var1);
		class489 var7 = new class489(var1);
		class489 var8 = new class489(var1);
		var4.field4989 = var1.length - 23;
		int var9 = var4.method8660();
		int var10 = var4.method8660();
		int var11 = var4.method8658();
		int var12 = var4.method8658();
		int var13 = var4.method8658();
		int var14 = var4.method8658();
		int var15 = var4.method8658();
		int var16 = var4.method8658();
		int var17 = var4.method8658();
		int var18 = var4.method8660();
		int var19 = var4.method8660();
		int var20 = var4.method8660();
		int var21 = var4.method8660();
		int var22 = var4.method8660();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field2415 = var9;
		this.field2419 = var10;
		this.field2444 = var11;
		this.field2416 = new int[var9];
		this.field2417 = new int[var9];
		this.field2418 = new int[var9];
		this.field2420 = new int[var10];
		this.field2456 = new int[var10];
		this.field2422 = new int[var10];
		if (var11 > 0) {
			this.field2431 = new byte[var11];
			this.field2432 = new short[var11];
			this.field2449 = new short[var11];
			this.field2437 = new short[var11];
		}

		if (var16 == 1) {
			this.field2423 = new int[var9];
		}

		if (var12 == 1) {
			this.field2443 = new byte[var10];
			this.field2426 = new byte[var10];
			this.field2428 = new short[var10];
		}

		if (var13 == 255) {
			this.field2424 = new byte[var10];
		} else {
			this.field2429 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2445 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2436 = new int[var10];
		}

		if (var17 == 1) {
			this.field2413 = new int[var9][];
			this.field2440 = new int[var9][];
		}

		this.field2427 = new short[var10];
		var4.field4989 = var23;
		var5.field4989 = var34;
		var6.field4989 = var35;
		var7.field4989 = var47;
		var8.field4989 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method8658();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method8673();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method8673();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method8673();
			}

			this.field2416[var40] = var37 + var42;
			this.field2417[var40] = var38 + var43;
			this.field2418[var40] = var39 + var44;
			var37 = this.field2416[var40];
			var38 = this.field2417[var40];
			var39 = this.field2418[var40];
			if (var16 == 1) {
				this.field2423[var40] = var8.method8658();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method8658();
				this.field2413[var40] = new int[var41];
				this.field2440[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field2413[var40][var42] = var8.method8658();
					this.field2440[var40][var42] = var8.method8658();
				}
			}
		}

		var4.field4989 = var32;
		var5.field4989 = var28;
		var6.field4989 = var26;
		var7.field4989 = var30;
		var8.field4989 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field2427[var40] = (short)var4.method8660();
			if (var12 == 1) {
				var41 = var5.method8658();
				if ((var41 & 1) == 1) {
					this.field2443[var40] = 1;
					var2 = true;
				} else {
					this.field2443[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field2426[var40] = (byte)(var41 >> 2);
					this.field2428[var40] = this.field2427[var40];
					this.field2427[var40] = 127;
					if (this.field2428[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field2426[var40] = -1;
					this.field2428[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field2424[var40] = var6.method8659();
			}

			if (var14 == 1) {
				this.field2445[var40] = var7.method8659();
			}

			if (var15 == 1) {
				this.field2436[var40] = var8.method8658();
			}
		}

		var4.field4989 = var31;
		var5.field4989 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method8658();
			if (var45 == 1) {
				var40 = var4.method8673() + var43;
				var41 = var4.method8673() + var40;
				var42 = var4.method8673() + var41;
				var43 = var42;
				this.field2420[var44] = var40;
				this.field2456[var44] = var41;
				this.field2422[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method8673() + var43;
				var43 = var42;
				this.field2420[var44] = var40;
				this.field2456[var44] = var41;
				this.field2422[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method8673() + var43;
				var43 = var42;
				this.field2420[var44] = var40;
				this.field2456[var44] = var41;
				this.field2422[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method8673() + var43;
				var43 = var42;
				this.field2420[var44] = var40;
				this.field2456[var44] = var46;
				this.field2422[var44] = var42;
			}
		}

		var4.field4989 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field2431[var44] = 0;
			this.field2432[var44] = (short)var4.method8660();
			this.field2449[var44] = (short)var4.method8660();
			this.field2437[var44] = (short)var4.method8660();
		}

		if (this.field2426 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field2426[var45] & 255;
				if (var46 != 255) {
					if ((this.field2432[var46] & '\uffff') == this.field2420[var45] && (this.field2449[var46] & '\uffff') == this.field2456[var45] && (this.field2437[var46] & '\uffff') == this.field2422[var45]) {
						this.field2426[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field2426 = null;
			}
		}

		if (!var3) {
			this.field2428 = null;
		}

		if (!var2) {
			this.field2443 = null;
		}

	}

	void method4158(byte[] var1) {
		class489 var2 = new class489(var1);
		class489 var3 = new class489(var1);
		class489 var4 = new class489(var1);
		class489 var5 = new class489(var1);
		class489 var6 = new class489(var1);
		class489 var7 = new class489(var1);
		class489 var8 = new class489(var1);
		var2.field4989 = var1.length - 23;
		int var9 = var2.method8660();
		int var10 = var2.method8660();
		int var11 = var2.method8658();
		int var12 = var2.method8658();
		int var13 = var2.method8658();
		int var14 = var2.method8658();
		int var15 = var2.method8658();
		int var16 = var2.method8658();
		int var17 = var2.method8658();
		int var18 = var2.method8660();
		int var19 = var2.method8660();
		int var20 = var2.method8660();
		int var21 = var2.method8660();
		int var22 = var2.method8660();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field2431 = new byte[var11];
			var2.field4989 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field2431[var26] = var2.method8659();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field2415 = var9;
		this.field2419 = var10;
		this.field2444 = var11;
		this.field2416 = new int[var9];
		this.field2417 = new int[var9];
		this.field2418 = new int[var9];
		this.field2420 = new int[var10];
		this.field2456 = new int[var10];
		this.field2422 = new int[var10];
		if (var17 == 1) {
			this.field2423 = new int[var9];
		}

		if (var12 == 1) {
			this.field2443 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2424 = new byte[var10];
		} else {
			this.field2429 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2445 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2436 = new int[var10];
		}

		if (var16 == 1) {
			this.field2428 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2426 = new byte[var10];
		}

		this.field2427 = new short[var10];
		if (var11 > 0) {
			this.field2432 = new short[var11];
			this.field2449 = new short[var11];
			this.field2437 = new short[var11];
		}

		var2.field4989 = var11;
		var3.field4989 = var38;
		var4.field4989 = var39;
		var5.field4989 = var40;
		var6.field4989 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method8658();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method8673();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method8673();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method8673();
			}

			this.field2416[var51] = var48 + var53;
			this.field2417[var51] = var49 + var54;
			this.field2418[var51] = var50 + var55;
			var48 = this.field2416[var51];
			var49 = this.field2417[var51];
			var50 = this.field2418[var51];
			if (var17 == 1) {
				this.field2423[var51] = var6.method8658();
			}
		}

		var2.field4989 = var37;
		var3.field4989 = var28;
		var4.field4989 = var30;
		var5.field4989 = var33;
		var6.field4989 = var31;
		var7.field4989 = var35;
		var8.field4989 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field2427[var51] = (short)var2.method8660();
			if (var12 == 1) {
				this.field2443[var51] = var3.method8659();
			}

			if (var13 == 255) {
				this.field2424[var51] = var4.method8659();
			}

			if (var14 == 1) {
				this.field2445[var51] = var5.method8659();
			}

			if (var15 == 1) {
				this.field2436[var51] = var6.method8658();
			}

			if (var16 == 1) {
				this.field2428[var51] = (short)(var7.method8660() - 1);
			}

			if (this.field2426 != null && this.field2428[var51] != -1) {
				this.field2426[var51] = (byte)(var8.method8658() - 1);
			}
		}

		var2.field4989 = var34;
		var3.field4989 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method8658();
			if (var56 == 1) {
				var51 = var2.method8673() + var54;
				var52 = var2.method8673() + var51;
				var53 = var2.method8673() + var52;
				var54 = var53;
				this.field2420[var55] = var51;
				this.field2456[var55] = var52;
				this.field2422[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method8673() + var54;
				var54 = var53;
				this.field2420[var55] = var51;
				this.field2456[var55] = var52;
				this.field2422[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method8673() + var54;
				var54 = var53;
				this.field2420[var55] = var51;
				this.field2456[var55] = var52;
				this.field2422[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method8673() + var54;
				var54 = var53;
				this.field2420[var55] = var51;
				this.field2456[var55] = var57;
				this.field2422[var55] = var53;
			}
		}

		var2.field4989 = var41;
		var3.field4989 = var42;
		var4.field4989 = var43;
		var5.field4989 = var44;
		var6.field4989 = var45;
		var7.field4989 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field2431[var55] & 255;
			if (var56 == 0) {
				this.field2432[var55] = (short)var2.method8660();
				this.field2449[var55] = (short)var2.method8660();
				this.field2437[var55] = (short)var2.method8660();
			}
		}

		var2.field4989 = var26;
		var55 = var2.method8658();
		if (var55 != 0) {
			new class239();
			var2.method8660();
			var2.method8660();
			var2.method8660();
			var2.method8664();
		}

	}

	void method4159(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class489 var4 = new class489(var1);
		class489 var5 = new class489(var1);
		class489 var6 = new class489(var1);
		class489 var7 = new class489(var1);
		class489 var8 = new class489(var1);
		var4.field4989 = var1.length - 18;
		int var9 = var4.method8660();
		int var10 = var4.method8660();
		int var11 = var4.method8658();
		int var12 = var4.method8658();
		int var13 = var4.method8658();
		int var14 = var4.method8658();
		int var15 = var4.method8658();
		int var16 = var4.method8658();
		int var17 = var4.method8660();
		int var18 = var4.method8660();
		int var19 = var4.method8660();
		int var20 = var4.method8660();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field2415 = var9;
		this.field2419 = var10;
		this.field2444 = var11;
		this.field2416 = new int[var9];
		this.field2417 = new int[var9];
		this.field2418 = new int[var9];
		this.field2420 = new int[var10];
		this.field2456 = new int[var10];
		this.field2422 = new int[var10];
		if (var11 > 0) {
			this.field2431 = new byte[var11];
			this.field2432 = new short[var11];
			this.field2449 = new short[var11];
			this.field2437 = new short[var11];
		}

		if (var16 == 1) {
			this.field2423 = new int[var9];
		}

		if (var12 == 1) {
			this.field2443 = new byte[var10];
			this.field2426 = new byte[var10];
			this.field2428 = new short[var10];
		}

		if (var13 == 255) {
			this.field2424 = new byte[var10];
		} else {
			this.field2429 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2445 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2436 = new int[var10];
		}

		this.field2427 = new short[var10];
		var4.field4989 = var21;
		var5.field4989 = var32;
		var6.field4989 = var33;
		var7.field4989 = var45;
		var8.field4989 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method8658();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method8673();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method8673();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method8673();
			}

			this.field2416[var38] = var35 + var40;
			this.field2417[var38] = var36 + var41;
			this.field2418[var38] = var37 + var42;
			var35 = this.field2416[var38];
			var36 = this.field2417[var38];
			var37 = this.field2418[var38];
			if (var16 == 1) {
				this.field2423[var38] = var8.method8658();
			}
		}

		var4.field4989 = var30;
		var5.field4989 = var26;
		var6.field4989 = var24;
		var7.field4989 = var28;
		var8.field4989 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field2427[var38] = (short)var4.method8660();
			if (var12 == 1) {
				var39 = var5.method8658();
				if ((var39 & 1) == 1) {
					this.field2443[var38] = 1;
					var2 = true;
				} else {
					this.field2443[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field2426[var38] = (byte)(var39 >> 2);
					this.field2428[var38] = this.field2427[var38];
					this.field2427[var38] = 127;
					if (this.field2428[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field2426[var38] = -1;
					this.field2428[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field2424[var38] = var6.method8659();
			}

			if (var14 == 1) {
				this.field2445[var38] = var7.method8659();
			}

			if (var15 == 1) {
				this.field2436[var38] = var8.method8658();
			}
		}

		var4.field4989 = var29;
		var5.field4989 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method8658();
			if (var43 == 1) {
				var38 = var4.method8673() + var41;
				var39 = var4.method8673() + var38;
				var40 = var4.method8673() + var39;
				var41 = var40;
				this.field2420[var42] = var38;
				this.field2456[var42] = var39;
				this.field2422[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method8673() + var41;
				var41 = var40;
				this.field2420[var42] = var38;
				this.field2456[var42] = var39;
				this.field2422[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method8673() + var41;
				var41 = var40;
				this.field2420[var42] = var38;
				this.field2456[var42] = var39;
				this.field2422[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method8673() + var41;
				var41 = var40;
				this.field2420[var42] = var38;
				this.field2456[var42] = var44;
				this.field2422[var42] = var40;
			}
		}

		var4.field4989 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field2431[var42] = 0;
			this.field2432[var42] = (short)var4.method8660();
			this.field2449[var42] = (short)var4.method8660();
			this.field2437[var42] = (short)var4.method8660();
		}

		if (this.field2426 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field2426[var43] & 255;
				if (var44 != 255) {
					if ((this.field2432[var44] & '\uffff') == this.field2420[var43] && (this.field2449[var44] & '\uffff') == this.field2456[var43] && (this.field2437[var44] & '\uffff') == this.field2422[var43]) {
						this.field2426[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field2426 = null;
			}
		}

		if (!var3) {
			this.field2428 = null;
		}

		if (!var2) {
			this.field2443 = null;
		}

	}

	final int method4189(class214 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field2416[var2];
		int var5 = var1.field2417[var2];
		int var6 = var1.field2418[var2];

		for (int var7 = 0; var7 < this.field2415; ++var7) {
			if (var4 == this.field2416[var7] && var5 == this.field2417[var7] && var6 == this.field2418[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field2416[this.field2415] = var4;
			this.field2417[this.field2415] = var5;
			this.field2418[this.field2415] = var6;
			if (var1.field2423 != null) {
				this.field2423[this.field2415] = var1.field2423[var2];
			}

			if (var1.field2413 != null) {
				this.field2413[this.field2415] = var1.field2413[var2];
				this.field2440[this.field2415] = var1.field2440[var2];
			}

			var3 = this.field2415++;
		}

		return var3;
	}

	public class214 method4185() {
		class214 var1 = new class214();
		if (this.field2443 != null) {
			var1.field2443 = new byte[this.field2419];

			for (int var2 = 0; var2 < this.field2419; ++var2) {
				var1.field2443[var2] = this.field2443[var2];
			}
		}

		var1.field2415 = this.field2415;
		var1.field2419 = this.field2419;
		var1.field2444 = this.field2444;
		var1.field2416 = this.field2416;
		var1.field2417 = this.field2417;
		var1.field2418 = this.field2418;
		var1.field2420 = this.field2420;
		var1.field2456 = this.field2456;
		var1.field2422 = this.field2422;
		var1.field2424 = this.field2424;
		var1.field2445 = this.field2445;
		var1.field2426 = this.field2426;
		var1.field2427 = this.field2427;
		var1.field2428 = this.field2428;
		var1.field2429 = this.field2429;
		var1.field2431 = this.field2431;
		var1.field2432 = this.field2432;
		var1.field2449 = this.field2449;
		var1.field2437 = this.field2437;
		var1.field2423 = this.field2423;
		var1.field2436 = this.field2436;
		var1.field2430 = this.field2430;
		var1.field2438 = this.field2438;
		var1.field2455 = this.field2455;
		var1.field2441 = this.field2441;
		var1.field2433 = this.field2433;
		var1.field2425 = this.field2425;
		return var1;
	}

	public class214 method4162(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method4175();
		int var7 = var2 + this.field2448;
		int var8 = var2 + this.field2439;
		int var9 = var4 + this.field2434;
		int var10 = var4 + this.field2450;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class214 var11;
				if (var5) {
					var11 = new class214();
					var11.field2415 = this.field2415;
					var11.field2419 = this.field2419;
					var11.field2444 = this.field2444;
					var11.field2416 = this.field2416;
					var11.field2418 = this.field2418;
					var11.field2420 = this.field2420;
					var11.field2456 = this.field2456;
					var11.field2422 = this.field2422;
					var11.field2443 = this.field2443;
					var11.field2424 = this.field2424;
					var11.field2445 = this.field2445;
					var11.field2426 = this.field2426;
					var11.field2427 = this.field2427;
					var11.field2428 = this.field2428;
					var11.field2429 = this.field2429;
					var11.field2431 = this.field2431;
					var11.field2432 = this.field2432;
					var11.field2449 = this.field2449;
					var11.field2437 = this.field2437;
					var11.field2423 = this.field2423;
					var11.field2436 = this.field2436;
					var11.field2430 = this.field2430;
					var11.field2438 = this.field2438;
					var11.field2433 = this.field2433;
					var11.field2425 = this.field2425;
					var11.field2417 = new int[var11.field2415];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field2415; ++var12) {
						var13 = this.field2416[var12] + var2;
						var14 = this.field2418[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2417[var12] = this.field2417[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2415; ++var12) {
						var13 = (-this.field2417[var12] << 16) / super.field2619;
						if (var13 < var6) {
							var14 = this.field2416[var12] + var2;
							var15 = this.field2418[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2417[var12] = this.field2417[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method4174();
				return var11;
			}
		} else {
			return this;
		}
	}

	void method4170() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field2423 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2415; ++var3) {
				var4 = this.field2423[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2430 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2430[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2415; this.field2430[var4][var1[var4]++] = var3++) {
				var4 = this.field2423[var3];
			}

			this.field2423 = null;
		}

		if (this.field2436 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2419; ++var3) {
				var4 = this.field2436[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2438 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2438[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2419; this.field2438[var4][var1[var4]++] = var3++) {
				var4 = this.field2436[var3];
			}

			this.field2436 = null;
		}

	}

	public void method4164() {
		for (int var1 = 0; var1 < this.field2415; ++var1) {
			int var2 = this.field2416[var1];
			this.field2416[var1] = this.field2418[var1];
			this.field2418[var1] = -var2;
		}

		this.method4174();
	}

	public void method4167() {
		for (int var1 = 0; var1 < this.field2415; ++var1) {
			this.field2416[var1] = -this.field2416[var1];
			this.field2418[var1] = -this.field2418[var1];
		}

		this.method4174();
	}

	public void method4166() {
		for (int var1 = 0; var1 < this.field2415; ++var1) {
			int var2 = this.field2418[var1];
			this.field2418[var1] = this.field2416[var1];
			this.field2416[var1] = -var2;
		}

		this.method4174();
	}

	public void method4233(int var1) {
		int var2 = field2435[var1];
		int var3 = field2412[var1];

		for (int var4 = 0; var4 < this.field2415; ++var4) {
			int var5 = this.field2418[var4] * var2 + this.field2416[var4] * var3 >> 16;
			this.field2418[var4] = this.field2418[var4] * var3 - this.field2416[var4] * var2 >> 16;
			this.field2416[var4] = var5;
		}

		this.method4174();
	}

	public void method4168(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2415; ++var4) {
			int[] var10000 = this.field2416;
			var10000[var4] += var1;
			var10000 = this.field2417;
			var10000[var4] += var2;
			var10000 = this.field2418;
			var10000[var4] += var3;
		}

		this.method4174();
	}

	public void method4169(short var1, short var2) {
		for (int var3 = 0; var3 < this.field2419; ++var3) {
			if (this.field2427[var3] == var1) {
				this.field2427[var3] = var2;
			}
		}

	}

	public void method4220(short var1, short var2) {
		if (this.field2428 != null) {
			for (int var3 = 0; var3 < this.field2419; ++var3) {
				if (this.field2428[var3] == var1) {
					this.field2428[var3] = var2;
				}
			}

		}
	}

	public void method4171() {
		int var1;
		for (var1 = 0; var1 < this.field2415; ++var1) {
			this.field2418[var1] = -this.field2418[var1];
		}

		for (var1 = 0; var1 < this.field2419; ++var1) {
			int var2 = this.field2420[var1];
			this.field2420[var1] = this.field2422[var1];
			this.field2422[var1] = var2;
		}

		this.method4174();
	}

	public void method4172(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2415; ++var4) {
			this.field2416[var4] = this.field2416[var4] * var1 / 128;
			this.field2417[var4] = this.field2417[var4] * var2 / 128;
			this.field2418[var4] = this.field2418[var4] * var3 / 128;
		}

		this.method4174();
	}

	public void method4237() {
		if (this.field2455 == null) {
			this.field2455 = new class234[this.field2415];

			int var1;
			for (var1 = 0; var1 < this.field2415; ++var1) {
				this.field2455[var1] = new class234();
			}

			for (var1 = 0; var1 < this.field2419; ++var1) {
				int var2 = this.field2420[var1];
				int var3 = this.field2456[var1];
				int var4 = this.field2422[var1];
				int var5 = this.field2416[var3] - this.field2416[var2];
				int var6 = this.field2417[var3] - this.field2417[var2];
				int var7 = this.field2418[var3] - this.field2418[var2];
				int var8 = this.field2416[var4] - this.field2416[var2];
				int var9 = this.field2417[var4] - this.field2417[var2];
				int var10 = this.field2418[var4] - this.field2418[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field2443 == null) {
					var15 = 0;
				} else {
					var15 = this.field2443[var1];
				}

				if (var15 == 0) {
					class234 var16 = this.field2455[var2];
					var16.field2779 += var11;
					var16.field2777 += var12;
					var16.field2778 += var13;
					++var16.field2776;
					var16 = this.field2455[var3];
					var16.field2779 += var11;
					var16.field2777 += var12;
					var16.field2778 += var13;
					++var16.field2776;
					var16 = this.field2455[var4];
					var16.field2779 += var11;
					var16.field2777 += var12;
					var16.field2778 += var13;
					++var16.field2776;
				} else if (var15 == 1) {
					if (this.field2441 == null) {
						this.field2441 = new class226[this.field2419];
					}

					class226 var17 = this.field2441[var1] = new class226();
					var17.field2624 = var11;
					var17.field2622 = var12;
					var17.field2621 = var13;
				}
			}

		}
	}

	void method4174() {
		this.field2455 = null;
		this.field2442 = null;
		this.field2441 = null;
		this.field2446 = false;
	}

	void method4175() {
		if (!this.field2446) {
			super.field2619 = 0;
			this.field2447 = 0;
			this.field2448 = 999999;
			this.field2439 = -999999;
			this.field2450 = -99999;
			this.field2434 = 99999;

			for (int var1 = 0; var1 < this.field2415; ++var1) {
				int var2 = this.field2416[var1];
				int var3 = this.field2417[var1];
				int var4 = this.field2418[var1];
				if (var2 < this.field2448) {
					this.field2448 = var2;
				}

				if (var2 > this.field2439) {
					this.field2439 = var2;
				}

				if (var4 < this.field2434) {
					this.field2434 = var4;
				}

				if (var4 > this.field2450) {
					this.field2450 = var4;
				}

				if (-var3 > super.field2619) {
					super.field2619 = -var3;
				}

				if (var3 > this.field2447) {
					this.field2447 = var3;
				}
			}

			this.field2446 = true;
		}
	}

	public final class232 method4177(int var1, int var2, int var3, int var4, int var5) {
		this.method4237();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class232 var8 = new class232();
		var8.field2721 = new int[this.field2419];
		var8.field2702 = new int[this.field2419];
		var8.field2703 = new int[this.field2419];
		if (this.field2444 > 0 && this.field2426 != null) {
			int[] var9 = new int[this.field2444];

			int var10;
			for (var10 = 0; var10 < this.field2419; ++var10) {
				if (this.field2426[var10] != -1) {
					++var9[this.field2426[var10] & 255];
				}
			}

			var8.field2709 = 0;

			for (var10 = 0; var10 < this.field2444; ++var10) {
				if (var9[var10] > 0 && this.field2431[var10] == 0) {
					++var8.field2709;
				}
			}

			var8.field2760 = new int[var8.field2709];
			var8.field2711 = new int[var8.field2709];
			var8.field2745 = new int[var8.field2709];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field2444; ++var11) {
				if (var9[var11] > 0 && this.field2431[var11] == 0) {
					var8.field2760[var10] = this.field2432[var11] & '\uffff';
					var8.field2711[var10] = this.field2449[var11] & '\uffff';
					var8.field2745[var10] = this.field2437[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field2710 = new byte[this.field2419];

			for (var11 = 0; var11 < this.field2419; ++var11) {
				if (this.field2426[var11] != -1) {
					var8.field2710[var11] = (byte)var9[this.field2426[var11] & 255];
				} else {
					var8.field2710[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field2419; ++var16) {
			byte var17;
			if (this.field2443 == null) {
				var17 = 0;
			} else {
				var17 = this.field2443[var16];
			}

			byte var18;
			if (this.field2445 == null) {
				var18 = 0;
			} else {
				var18 = this.field2445[var16];
			}

			short var12;
			if (this.field2428 == null) {
				var12 = -1;
			} else {
				var12 = this.field2428[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			class234 var13;
			int var14;
			class226 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field2441[var16];
						var14 = var1 + (var3 * var19.field2624 + var4 * var19.field2622 + var5 * var19.field2621) / (var7 + var7 / 2);
						var8.field2721[var16] = method4160(this.field2427[var16] & '\uffff', var14);
						var8.field2703[var16] = -1;
					} else if (var17 == 3) {
						var8.field2721[var16] = 128;
						var8.field2703[var16] = -1;
					} else {
						var8.field2703[var16] = -2;
					}
				} else {
					int var15 = this.field2427[var16] & '\uffff';
					if (this.field2442 != null && this.field2442[this.field2420[var16]] != null) {
						var13 = this.field2442[this.field2420[var16]];
					} else {
						var13 = this.field2455[this.field2420[var16]];
					}

					var14 = var1 + (var3 * var13.field2779 + var4 * var13.field2777 + var5 * var13.field2778) / (var7 * var13.field2776);
					var8.field2721[var16] = method4160(var15, var14);
					if (this.field2442 != null && this.field2442[this.field2456[var16]] != null) {
						var13 = this.field2442[this.field2456[var16]];
					} else {
						var13 = this.field2455[this.field2456[var16]];
					}

					var14 = var1 + (var3 * var13.field2779 + var4 * var13.field2777 + var5 * var13.field2778) / (var7 * var13.field2776);
					var8.field2702[var16] = method4160(var15, var14);
					if (this.field2442 != null && this.field2442[this.field2422[var16]] != null) {
						var13 = this.field2442[this.field2422[var16]];
					} else {
						var13 = this.field2455[this.field2422[var16]];
					}

					var14 = var1 + (var3 * var13.field2779 + var4 * var13.field2777 + var5 * var13.field2778) / (var7 * var13.field2776);
					var8.field2703[var16] = method4160(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field2441[var16];
					var14 = var1 + (var3 * var19.field2624 + var4 * var19.field2622 + var5 * var19.field2621) / (var7 + var7 / 2);
					var8.field2721[var16] = method4179(var14);
					var8.field2703[var16] = -1;
				} else {
					var8.field2703[var16] = -2;
				}
			} else {
				if (this.field2442 != null && this.field2442[this.field2420[var16]] != null) {
					var13 = this.field2442[this.field2420[var16]];
				} else {
					var13 = this.field2455[this.field2420[var16]];
				}

				var14 = var1 + (var3 * var13.field2779 + var4 * var13.field2777 + var5 * var13.field2778) / (var7 * var13.field2776);
				var8.field2721[var16] = method4179(var14);
				if (this.field2442 != null && this.field2442[this.field2456[var16]] != null) {
					var13 = this.field2442[this.field2456[var16]];
				} else {
					var13 = this.field2455[this.field2456[var16]];
				}

				var14 = var1 + (var3 * var13.field2779 + var4 * var13.field2777 + var5 * var13.field2778) / (var7 * var13.field2776);
				var8.field2702[var16] = method4179(var14);
				if (this.field2442 != null && this.field2442[this.field2422[var16]] != null) {
					var13 = this.field2442[this.field2422[var16]];
				} else {
					var13 = this.field2455[this.field2422[var16]];
				}

				var14 = var1 + (var3 * var13.field2779 + var4 * var13.field2777 + var5 * var13.field2778) / (var7 * var13.field2776);
				var8.field2703[var16] = method4179(var14);
			}
		}

		this.method4170();
		var8.field2693 = this.field2415;
		var8.field2694 = this.field2416;
		var8.field2695 = this.field2417;
		var8.field2763 = this.field2418;
		var8.field2697 = this.field2419;
		var8.field2698 = this.field2420;
		var8.field2699 = this.field2456;
		var8.field2700 = this.field2422;
		var8.field2704 = this.field2424;
		var8.field2705 = this.field2445;
		var8.field2708 = this.field2429;
		var8.field2713 = this.field2430;
		var8.field2751 = this.field2438;
		var8.field2707 = this.field2428;
		var8.field2712 = this.field2413;
		var8.field2716 = this.field2440;
		return var8;
	}

	public static class214 method4215(class344 var0, int var1, int var2) {
		byte[] var3 = var0.method6468(var1, var2);
		return var3 == null ? null : new class214(var3);
	}

	static void method4176(class214 var0, class214 var1, int var2, int var3, int var4, boolean var5) {
		var0.method4175();
		var0.method4237();
		var1.method4175();
		var1.method4237();
		++field2454;
		int var6 = 0;
		int[] var7 = var1.field2416;
		int var8 = var1.field2415;

		int var9;
		for (var9 = 0; var9 < var0.field2415; ++var9) {
			class234 var10 = var0.field2455[var9];
			if (var10.field2776 != 0) {
				int var11 = var0.field2417[var9] - var3;
				if (var11 <= var1.field2447) {
					int var12 = var0.field2416[var9] - var2;
					if (var12 >= var1.field2448 && var12 <= var1.field2439) {
						int var13 = var0.field2418[var9] - var4;
						if (var13 >= var1.field2434 && var13 <= var1.field2450) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class234 var15 = var1.field2455[var14];
								if (var12 == var7[var14] && var13 == var1.field2418[var14] && var11 == var1.field2417[var14] && var15.field2776 != 0) {
									if (var0.field2442 == null) {
										var0.field2442 = new class234[var0.field2415];
									}

									if (var1.field2442 == null) {
										var1.field2442 = new class234[var8];
									}

									class234 var16 = var0.field2442[var9];
									if (var16 == null) {
										var16 = var0.field2442[var9] = new class234(var10);
									}

									class234 var17 = var1.field2442[var14];
									if (var17 == null) {
										var17 = var1.field2442[var14] = new class234(var15);
									}

									var16.field2779 += var15.field2779;
									var16.field2777 += var15.field2777;
									var16.field2778 += var15.field2778;
									var16.field2776 += var15.field2776;
									var17.field2779 += var10.field2779;
									var17.field2777 += var10.field2777;
									var17.field2778 += var10.field2778;
									var17.field2776 += var10.field2776;
									++var6;
									field2452[var9] = field2454;
									field2453[var14] = field2454;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field2419; ++var9) {
				if (field2452[var0.field2420[var9]] == field2454 && field2452[var0.field2456[var9]] == field2454 && field2452[var0.field2422[var9]] == field2454) {
					if (var0.field2443 == null) {
						var0.field2443 = new byte[var0.field2419];
					}

					var0.field2443[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field2419; ++var9) {
				if (field2453[var1.field2420[var9]] == field2454 && field2453[var1.field2456[var9]] == field2454 && field2453[var1.field2422[var9]] == field2454) {
					if (var1.field2443 == null) {
						var1.field2443 = new byte[var1.field2419];
					}

					var1.field2443[var9] = 2;
				}
			}

		}
	}

	static final int method4160(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static final int method4179(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
