public class class223 {
	public static boolean field2551;
	public static int field2579;
	public static int field2580;
	static boolean field2581;
	static boolean field2587;
	static boolean[][] field2604;
	static boolean[][][][] field2603;
	static class228[] field2557;
	static class228[][] field2586;
	static class243[] field2574;
	static class363 field2589;
	static int field2544;
	static int field2559;
	static int field2560;
	static int field2561;
	static int field2562;
	static int field2563;
	static int field2564;
	static int field2565;
	static int field2566;
	static int field2569;
	static int field2571;
	static int field2572;
	static int field2573;
	static int field2577;
	static int field2578;
	static int field2584;
	static int field2588;
	static int field2592;
	static int field2595;
	static int field2596;
	static int field2600;
	static int field2601;
	static int field2605;
	static int field2606;
	static int field2607;
	static int field2608;
	static int field2610;
	static int[] field2585;
	static final int[] field2556;
	static final int[] field2567;
	static final int[] field2568;
	static final int[] field2583;
	static final int[] field2590;
	static final int[] field2591;
	static final int[] field2593;
	class218[][][] field2549;
	class243[] field2552;
	int field2546;
	int field2547;
	int field2550;
	int field2558;
	int field2609;
	int[][] field2576;
	int[][] field2602;
	int[][][] field2548;
	int[][][] field2553;

	static {
		field2551 = true;
		field2600 = 0;
		field2559 = 0;
		field2574 = new class243[100];
		field2587 = false;
		field2544 = 0;
		field2577 = 0;
		field2578 = 0;
		field2579 = -1;
		field2580 = -1;
		field2581 = false;
		field2584 = 4;
		field2585 = new int[field2584];
		field2586 = new class228[field2584][500];
		field2601 = 0;
		field2557 = new class228[500];
		field2589 = new class363();
		field2590 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2591 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2583 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2593 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2567 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2556 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2568 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		field2603 = new boolean[8][32][51][51];
	}

	public class223(int var1, int var2, int var3, int[][][] var4) {
		this.field2558 = 0;
		this.field2550 = 0;
		this.field2552 = new class243[5000];
		this.field2576 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.field2602 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2609 = var1;
		this.field2546 = var2;
		this.field2547 = var3;
		this.field2549 = new class218[var1][var2][var3];
		this.field2553 = new int[var1][var2 + 1][var3 + 1];
		this.field2548 = var4;
		this.method4466();
	}

	public void method4466() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field2609; ++var1) {
			for (var2 = 0; var2 < this.field2546; ++var2) {
				for (int var3 = 0; var3 < this.field2547; ++var3) {
					this.field2549[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < field2584; ++var1) {
			for (var2 = 0; var2 < field2585[var1]; ++var2) {
				field2586[var1][var2] = null;
			}

			field2585[var1] = 0;
		}

		for (var1 = 0; var1 < this.field2550; ++var1) {
			this.field2552[var1] = null;
		}

		this.field2550 = 0;

		for (var1 = 0; var1 < field2574.length; ++var1) {
			field2574[var1] = null;
		}

	}

	public void method4437(int var1) {
		this.field2558 = var1;

		for (int var2 = 0; var2 < this.field2546; ++var2) {
			for (int var3 = 0; var3 < this.field2547; ++var3) {
				if (this.field2549[var1][var2][var3] == null) {
					this.field2549[var1][var2][var3] = new class218(var1, var2, var3);
				}
			}
		}

	}

	public void method4486(int var1, int var2) {
		class218 var3 = this.field2549[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			class218 var5 = this.field2549[var4][var1][var2] = this.field2549[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.field2498;

				for (int var6 = 0; var6 < var5.field2499; ++var6) {
					class243 var7 = var5.field2500[var6];
					if (class119.method2908(var7.field2846) && var7.field2840 == var1 && var7.field2842 == var2) {
						--var7.field2836;
					}
				}
			}
		}

		if (this.field2549[0][var1][var2] == null) {
			this.field2549[0][var1][var2] = new class218(0, var1, var2);
		}

		this.field2549[0][var1][var2].field2511 = var3;
		this.field2549[3][var1][var2] = null;
	}

	public void method4372(int var1, int var2, int var3, int var4) {
		class218 var5 = this.field2549[var1][var2][var3];
		if (var5 != null) {
			this.field2549[var1][var2][var3].field2503 = var4;
		}
	}

	public void method4373(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		class235 var21;
		int var22;
		if (var4 == 0) {
			var21 = new class235(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2549[var22][var2][var3] == null) {
					this.field2549[var22][var2][var3] = new class218(var22, var2, var3);
				}
			}

			this.field2549[var1][var2][var3].field2507 = var21;
		} else if (var4 != 1) {
			class230 var23 = new class230(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2549[var22][var2][var3] == null) {
					this.field2549[var22][var2][var3] = new class218(var22, var2, var3);
				}
			}

			this.field2549[var1][var2][var3].field2494 = var23;
		} else {
			var21 = new class235(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2549[var22][var2][var3] == null) {
					this.field2549[var22][var2][var3] = new class218(var22, var2, var3);
				}
			}

			this.field2549[var1][var2][var3].field2507 = var21;
		}
	}

	public void method4374(int var1, int var2, int var3, int var4, class225 var5, long var6, int var8) {
		if (var5 != null) {
			class215 var9 = new class215();
			var9.field2460 = var5;
			var9.field2458 = var2 * 128 + 64;
			var9.field2459 = var3 * 128 + 64;
			var9.field2462 = var4;
			var9.field2461 = var6;
			var9.field2457 = var8;
			if (this.field2549[var1][var2][var3] == null) {
				this.field2549[var1][var2][var3] = new class218(var1, var2, var3);
			}

			this.field2549[var1][var2][var3].field2497 = var9;
		}
	}

	public void method4472(int var1, int var2, int var3, int var4, class225 var5, long var6, class225 var8, class225 var9) {
		class213 var10 = new class213();
		var10.field2406 = var5;
		var10.field2403 = var2 * 128 + 64;
		var10.field2405 = var3 * 128 + 64;
		var10.field2404 = var4;
		var10.field2409 = var6;
		var10.field2407 = var8;
		var10.field2408 = var9;
		int var11 = 0;
		class218 var12 = this.field2549[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field2499; ++var13) {
				if ((var12.field2500[var13].field2849 & 256) == 256 && var12.field2500[var13].field2838 instanceof class232) {
					class232 var14 = (class232)var12.field2500[var13].field2838;
					var14.method4654();
					if (var14.field2619 > var11) {
						var11 = var14.field2619;
					}
				}
			}
		}

		var10.field2410 = var11;
		if (this.field2549[var1][var2][var3] == null) {
			this.field2549[var1][var2][var3] = new class218(var1, var2, var3);
		}

		this.field2549[var1][var2][var3].field2509 = var10;
	}

	public void method4376(int var1, int var2, int var3, int var4, class225 var5, class225 var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			class240 var12 = new class240();
			var12.field2816 = var9;
			var12.field2819 = var11;
			var12.field2812 = var2 * 128 + 64;
			var12.field2815 = var3 * 128 + 64;
			var12.field2811 = var4;
			var12.field2813 = var5;
			var12.field2817 = var6;
			var12.field2814 = var7;
			var12.field2818 = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field2549[var13][var2][var3] == null) {
					this.field2549[var13][var2][var3] = new class218(var13, var2, var3);
				}
			}

			this.field2549[var1][var2][var3].field2489 = var12;
		}
	}

	public void method4377(int var1, int var2, int var3, int var4, class225 var5, class225 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			class242 var14 = new class242();
			var14.field2822 = var11;
			var14.field2831 = var13;
			var14.field2824 = var2 * 128 + 64;
			var14.field2823 = var3 * 128 + 64;
			var14.field2830 = var4;
			var14.field2828 = var5;
			var14.field2826 = var6;
			var14.field2829 = var7;
			var14.field2825 = var8;
			var14.field2821 = var9;
			var14.field2827 = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field2549[var15][var2][var3] == null) {
					this.field2549[var15][var2][var3] = new class218(var15, var2, var3);
				}
			}

			this.field2549[var1][var2][var3].field2496 = var14;
		}
	}

	public boolean method4533(int var1, int var2, int var3, int var4, int var5, int var6, class225 var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var13 = var3 * 128 + var6 * 64;
			return this.method4381(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	public boolean method4379(int var1, int var2, int var3, int var4, int var5, class225 var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var2 + var5;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.method4381(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method4368(int var1, int var2, int var3, int var4, int var5, class225 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method4381(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	boolean method4381(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class225 var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.field2546 || var16 >= this.field2547) {
					return false;
				}

				class218 var17 = this.field2549[var1][var15][var16];
				if (var17 != null && var17.field2499 >= 5) {
					return false;
				}
			}
		}

		class243 var21 = new class243();
		var21.field2846 = var12;
		var21.field2849 = var14;
		var21.field2836 = var1;
		var21.field2837 = var6;
		var21.field2834 = var7;
		var21.field2835 = var8;
		var21.field2838 = var9;
		var21.field2839 = var10;
		var21.field2840 = var2;
		var21.field2842 = var3;
		var21.field2847 = var2 + var4 - 1;
		var21.field2843 = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var22 = var3; var22 < var3 + var5; ++var22) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var22 > var3) {
					var18 += 8;
				}

				if (var22 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field2549[var19][var16][var22] == null) {
						this.field2549[var19][var16][var22] = new class218(var19, var16, var22);
					}
				}

				class218 var23 = this.field2549[var1][var16][var22];
				var23.field2500[var23.field2499] = var21;
				var23.field2501[var23.field2499] = var18;
				var23.field2502 |= var18;
				++var23.field2499;
			}
		}

		if (var11) {
			this.field2552[this.field2550++] = var21;
		}

		return true;
	}

	public void method4382() {
		for (int var1 = 0; var1 < this.field2550; ++var1) {
			class243 var2 = this.field2552[var1];
			this.method4383(var2);
			this.field2552[var1] = null;
		}

		this.field2550 = 0;
	}

	void method4383(class243 var1) {
		for (int var2 = var1.field2840; var2 <= var1.field2847; ++var2) {
			for (int var3 = var1.field2842; var3 <= var1.field2843; ++var3) {
				class218 var4 = this.field2549[var1.field2836][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.field2499; ++var5) {
						if (var4.field2500[var5] == var1) {
							--var4.field2499;

							for (int var6 = var5; var6 < var4.field2499; ++var6) {
								var4.field2500[var6] = var4.field2500[var6 + 1];
								var4.field2501[var6] = var4.field2501[var6 + 1];
							}

							var4.field2500[var4.field2499] = null;
							break;
						}
					}

					var4.field2502 = 0;

					for (var5 = 0; var5 < var4.field2499; ++var5) {
						var4.field2502 |= var4.field2501[var5];
					}
				}
			}
		}

	}

	public void method4404(int var1, int var2, int var3, int var4) {
		class218 var5 = this.field2549[var1][var2][var3];
		if (var5 != null) {
			class242 var6 = var5.field2496;
			if (var6 != null) {
				var6.field2821 = var6.field2821 * var4 / 16;
				var6.field2827 = var6.field2827 * var4 / 16;
			}
		}
	}

	public void method4468(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 != null) {
			var4.field2489 = null;
		}
	}

	public void method4467(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 != null) {
			var4.field2496 = null;
		}
	}

	public void method4387(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field2499; ++var5) {
				class243 var6 = var4.field2500[var5];
				if (class119.method2908(var6.field2846) && var6.field2840 == var2 && var6.field2842 == var3) {
					this.method4383(var6);
					return;
				}
			}

		}
	}

	public void method4384(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 != null) {
			var4.field2497 = null;
		}
	}

	public void method4463(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 != null) {
			var4.field2509 = null;
		}
	}

	public class240 method4390(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		return var4 == null ? null : var4.field2489;
	}

	public class242 method4391(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		return var4 == null ? null : var4.field2496;
	}

	public class243 method4446(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field2499; ++var5) {
				class243 var6 = var4.field2500[var5];
				if (class119.method2908(var6.field2846) && var6.field2840 == var2 && var6.field2842 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public class215 method4393(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		return var4 != null && var4.field2497 != null ? var4.field2497 : null;
	}

	public long method4394(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		return var4 != null && var4.field2489 != null ? var4.field2489.field2816 : 0L;
	}

	public long method4395(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		return var4 != null && var4.field2496 != null ? var4.field2496.field2822 : 0L;
	}

	public long method4396(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field2499; ++var5) {
				class243 var6 = var4.field2500[var5];
				if (class119.method2908(var6.field2846) && var6.field2840 == var2 && var6.field2842 == var3) {
					return var6.field2846;
				}
			}

			return 0L;
		}
	}

	public long method4397(int var1, int var2, int var3) {
		class218 var4 = this.field2549[var1][var2][var3];
		return var4 != null && var4.field2497 != null ? var4.field2497.field2461 : 0L;
	}

	public int method4532(int var1, int var2, int var3, long var4) {
		class218 var6 = this.field2549[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.field2489 != null && var6.field2489.field2816 == var4) {
			return var6.field2489.field2819 & 255;
		} else if (var6.field2496 != null && var6.field2496.field2822 == var4) {
			return var6.field2496.field2831 & 255;
		} else if (var6.field2497 != null && var6.field2497.field2461 == var4) {
			return var6.field2497.field2457 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field2499; ++var7) {
				if (var6.field2500[var7].field2846 == var4) {
					return var6.field2500[var7].field2849 & 255;
				}
			}

			return -1;
		}
	}

	public void method4436(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2609; ++var4) {
			for (int var5 = 0; var5 < this.field2546; ++var5) {
				for (int var6 = 0; var6 < this.field2547; ++var6) {
					class218 var7 = this.field2549[var4][var5][var6];
					if (var7 != null) {
						class240 var8 = var7.field2489;
						class214 var10;
						if (var8 != null && var8.field2813 instanceof class214) {
							class214 var9 = (class214)var8.field2813;
							this.method4401(var9, var4, var5, var6, 1, 1);
							if (var8.field2817 instanceof class214) {
								var10 = (class214)var8.field2817;
								this.method4401(var10, var4, var5, var6, 1, 1);
								class214.method4176(var9, var10, 0, 0, 0, false);
								var8.field2817 = var10.method4177(var10.field2433, var10.field2425, var1, var2, var3);
							}

							var8.field2813 = var9.method4177(var9.field2433, var9.field2425, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.field2499; ++var12) {
							class243 var14 = var7.field2500[var12];
							if (var14 != null && var14.field2838 instanceof class214) {
								class214 var11 = (class214)var14.field2838;
								this.method4401(var11, var4, var5, var6, var14.field2847 - var14.field2840 + 1, var14.field2843 - var14.field2842 + 1);
								var14.field2838 = var11.method4177(var11.field2433, var11.field2425, var1, var2, var3);
							}
						}

						class215 var13 = var7.field2497;
						if (var13 != null && var13.field2460 instanceof class214) {
							var10 = (class214)var13.field2460;
							this.method4400(var10, var4, var5, var6);
							var13.field2460 = var10.method4177(var10.field2433, var10.field2425, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	void method4400(class214 var1, int var2, int var3, int var4) {
		class218 var5;
		class214 var6;
		if (var3 < this.field2546) {
			var5 = this.field2549[var2][var3 + 1][var4];
			if (var5 != null && var5.field2497 != null && var5.field2497.field2460 instanceof class214) {
				var6 = (class214)var5.field2497.field2460;
				class214.method4176(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.field2546) {
			var5 = this.field2549[var2][var3][var4 + 1];
			if (var5 != null && var5.field2497 != null && var5.field2497.field2460 instanceof class214) {
				var6 = (class214)var5.field2497.field2460;
				class214.method4176(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.field2546 && var4 < this.field2547) {
			var5 = this.field2549[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.field2497 != null && var5.field2497.field2460 instanceof class214) {
				var6 = (class214)var5.field2497.field2460;
				class214.method4176(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.field2546 && var4 > 0) {
			var5 = this.field2549[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.field2497 != null && var5.field2497.field2460 instanceof class214) {
				var6 = (class214)var5.field2497.field2460;
				class214.method4176(var1, var6, 128, 0, -128, true);
			}
		}

	}

	void method4401(class214 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.field2609) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.field2546) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.field2547 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								class218 var15 = this.field2549[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.field2548[var12][var13][var14] + this.field2548[var12][var13 + 1][var14] + this.field2548[var12][var13][var14 + 1] + this.field2548[var12][var13 + 1][var14 + 1]) / 4 - (this.field2548[var2][var3][var4] + this.field2548[var2][var3 + 1][var4] + this.field2548[var2][var3][var4 + 1] + this.field2548[var2][var3 + 1][var4 + 1]) / 4;
									class240 var17 = var15.field2489;
									if (var17 != null) {
										class214 var18;
										if (var17.field2813 instanceof class214) {
											var18 = (class214)var17.field2813;
											class214.method4176(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.field2817 instanceof class214) {
											var18 = (class214)var17.field2817;
											class214.method4176(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.field2499; ++var23) {
										class243 var19 = var15.field2500[var23];
										if (var19 != null && var19.field2838 instanceof class214) {
											class214 var20 = (class214)var19.field2838;
											int var21 = var19.field2847 - var19.field2840 + 1;
											int var22 = var19.field2843 - var19.field2842 + 1;
											class214.method4176(var1, var20, (var19.field2840 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field2842 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	public void method4481(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		class218 var7 = this.field2549[var4][var5][var6];
		if (var7 != null) {
			class235 var8 = var7.field2507;
			int var10;
			if (var8 != null) {
				int var18 = var8.field2788;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				class230 var9 = var7.field2494;
				if (var9 != null) {
					var10 = var9.field2670;
					int var11 = var9.field2669;
					int var12 = var9.field2672;
					int var13 = var9.field2680;
					int[] var14 = this.field2576[var10];
					int[] var15 = this.field2602[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	public void method4405(int var1, int var2, int var3, boolean var4) {
		if (!method4409() || var4) {
			field2587 = true;
			field2581 = var4;
			field2544 = var1;
			field2577 = var2;
			field2578 = var3;
			field2579 = -1;
			field2580 = -1;
		}
	}

	public void method4386() {
		field2581 = true;
	}

	public void method4385(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.field2546 * 128) {
			var1 = this.field2546 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.field2547 * 128) {
			var3 = this.field2547 * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		++field2560;
		field2592 = class219.field2512[var4];
		field2588 = class219.field2516[var4];
		field2572 = class219.field2512[var5];
		field2573 = class219.field2516[var5];
		field2604 = field2603[(var4 - 128) / 32][var5 / 64];
		field2595 = var1;
		field2571 = var2;
		field2569 = var3;
		field2565 = var1 / 128;
		field2566 = var3 / 128;
		field2559 = var6;
		field2561 = field2565 - 25;
		if (field2561 < 0) {
			field2561 = 0;
		}

		field2563 = field2566 - 25;
		if (field2563 < 0) {
			field2563 = 0;
		}

		field2562 = field2565 + 25;
		if (field2562 > this.field2546) {
			field2562 = this.field2546;
		}

		field2564 = field2566 + 25;
		if (field2564 > this.field2547) {
			field2564 = this.field2547;
		}

		this.method4415();
		field2600 = 0;

		int var7;
		class218[][] var8;
		int var9;
		int var10;
		for (var7 = this.field2558; var7 < this.field2609; ++var7) {
			var8 = this.field2549[var7];

			for (var9 = field2561; var9 < field2562; ++var9) {
				for (var10 = field2563; var10 < field2564; ++var10) {
					class218 var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field2503 > var6 || !field2604[var9 - field2565 + 25][var10 - field2566 + 25] && this.field2548[var7][var9][var10] - var2 < 2000) {
							var11.field2493 = false;
							var11.field2506 = false;
							var11.field2504 = 0;
						} else {
							var11.field2493 = true;
							var11.field2506 = true;
							if (var11.field2499 > 0) {
								var11.field2495 = true;
							} else {
								var11.field2495 = false;
							}

							++field2600;
						}
					}
				}
			}
		}

		int var12;
		int var13;
		int var14;
		class218 var15;
		int var16;
		for (var7 = this.field2558; var7 < this.field2609; ++var7) {
			var8 = this.field2549[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field2565 + var9;
				var16 = field2565 - var9;
				if (var10 >= field2561 || var16 < field2562) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2566 + var12;
						var14 = field2566 - var12;
						if (var10 >= field2561) {
							if (var13 >= field2563) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, true);
								}
							}

							if (var14 < field2564) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, true);
								}
							}
						}

						if (var16 < field2562) {
							if (var13 >= field2563) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, true);
								}
							}

							if (var14 < field2564) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, true);
								}
							}
						}

						if (field2600 == 0) {
							field2587 = false;
							return;
						}
					}
				}
			}
		}

		for (var7 = this.field2558; var7 < this.field2609; ++var7) {
			var8 = this.field2549[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field2565 + var9;
				var16 = field2565 - var9;
				if (var10 >= field2561 || var16 < field2562) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2566 + var12;
						var14 = field2566 - var12;
						if (var10 >= field2561) {
							if (var13 >= field2563) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, false);
								}
							}

							if (var14 < field2564) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, false);
								}
							}
						}

						if (var16 < field2562) {
							if (var13 >= field2563) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, false);
								}
							}

							if (var14 < field2564) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field2493) {
									this.method4410(var15, false);
								}
							}
						}

						if (field2600 == 0) {
							field2587 = false;
							return;
						}
					}
				}
			}
		}

		field2587 = false;
	}

	void method4410(class218 var1, boolean var2) {
		field2589.method6711(var1);

		while (true) {
			class218 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			class218[][] var8;
			class218 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										class240 var10;
										class243 var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										class218 var33;
										while (true) {
											do {
												var3 = (class218)field2589.method6714();
												if (var3 == null) {
													return;
												}
											} while(!var3.field2506);

											var4 = var3.field2505;
											var5 = var3.field2491;
											var6 = var3.field2498;
											var7 = var3.field2492;
											var8 = this.field2549[var6];
											if (!var3.field2493) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.field2549[var6 - 1][var4][var5];
													if (var9 != null && var9.field2506) {
														continue;
													}
												}

												if (var4 <= field2565 && var4 > field2561) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.field2506 && (var9.field2493 || (var3.field2502 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= field2565 && var4 < field2562 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.field2506 && (var9.field2493 || (var3.field2502 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= field2566 && var5 > field2563) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.field2506 && (var9.field2493 || (var3.field2502 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= field2566 && var5 < field2564 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.field2506 && (var9.field2493 || (var3.field2502 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.field2493 = false;
											if (var3.field2511 != null) {
												var9 = var3.field2511;
												if (var9.field2507 != null) {
													if (!this.method4370(0, var4, var5)) {
														this.method4411(var9.field2507, 0, field2592, field2588, field2572, field2573, var4, var5);
													}
												} else if (var9.field2494 != null && !this.method4370(0, var4, var5)) {
													this.method4441(var9.field2494, field2592, field2588, field2572, field2573, var4, var5);
												}

												var10 = var9.field2489;
												if (var10 != null) {
													var10.field2813.method4539(0, field2592, field2588, field2572, field2573, var10.field2812 - field2595, var10.field2811 - field2571, var10.field2815 - field2569, var10.field2816);
												}

												for (var11 = 0; var11 < var9.field2499; ++var11) {
													var12 = var9.field2500[var11];
													if (var12 != null) {
														var12.field2838.method4539(var12.field2839, field2592, field2588, field2572, field2573, var12.field2837 - field2595, var12.field2835 - field2571, var12.field2834 - field2569, var12.field2846);
													}
												}
											}

											var22 = false;
											if (var3.field2507 != null) {
												if (!this.method4370(var7, var4, var5)) {
													var22 = true;
													if (var3.field2507.field2782 != 12345678 || field2587 && var6 <= field2544) {
														this.method4411(var3.field2507, var7, field2592, field2588, field2572, field2573, var4, var5);
													}
												}
											} else if (var3.field2494 != null && !this.method4370(var7, var4, var5)) {
												var22 = true;
												this.method4441(var3.field2494, field2592, field2588, field2572, field2573, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											class240 var23 = var3.field2489;
											class242 var13 = var3.field2496;
											if (var23 != null || var13 != null) {
												if (field2565 == var4) {
													++var21;
												} else if (field2565 < var4) {
													var21 += 2;
												}

												if (field2566 == var5) {
													var21 += 3;
												} else if (field2566 > var5) {
													var21 += 6;
												}

												var11 = field2590[var21];
												var3.field2510 = field2583[var21];
											}

											if (var23 != null) {
												if ((var23.field2814 & field2591[var21]) != 0) {
													if (var23.field2814 == 16) {
														var3.field2504 = 3;
														var3.field2508 = field2593[var21];
														var3.field2490 = 3 - var3.field2508;
													} else if (var23.field2814 == 32) {
														var3.field2504 = 6;
														var3.field2508 = field2567[var21];
														var3.field2490 = 6 - var3.field2508;
													} else if (var23.field2814 == 64) {
														var3.field2504 = 12;
														var3.field2508 = field2556[var21];
														var3.field2490 = 12 - var3.field2508;
													} else {
														var3.field2504 = 9;
														var3.field2508 = field2568[var21];
														var3.field2490 = 9 - var3.field2508;
													}
												} else {
													var3.field2504 = 0;
												}

												if ((var23.field2814 & var11) != 0 && !this.method4417(var7, var4, var5, var23.field2814)) {
													var23.field2813.method4539(0, field2592, field2588, field2572, field2573, var23.field2812 - field2595, var23.field2811 - field2571, var23.field2815 - field2569, var23.field2816);
												}

												if ((var23.field2818 & var11) != 0 && !this.method4417(var7, var4, var5, var23.field2818)) {
													var23.field2817.method4539(0, field2592, field2588, field2572, field2573, var23.field2812 - field2595, var23.field2811 - field2571, var23.field2815 - field2569, var23.field2816);
												}
											}

											if (var13 != null && !this.method4418(var7, var4, var5, var13.field2828.field2619)) {
												if ((var13.field2829 & var11) != 0) {
													var13.field2828.method4539(0, field2592, field2588, field2572, field2573, var13.field2824 - field2595 + var13.field2821, var13.field2830 - field2571, var13.field2823 - field2569 + var13.field2827, var13.field2822);
												} else if (var13.field2829 == 256) {
													var14 = var13.field2824 - field2595;
													var15 = var13.field2830 - field2571;
													var16 = var13.field2823 - field2569;
													var17 = var13.field2825;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.field2828.method4539(0, field2592, field2588, field2572, field2573, var14 + var13.field2821, var15, var16 + var13.field2827, var13.field2822);
													} else if (var13.field2826 != null) {
														var13.field2826.method4539(0, field2592, field2588, field2572, field2573, var14, var15, var16, var13.field2822);
													}
												}
											}

											if (var22) {
												class215 var27 = var3.field2497;
												if (var27 != null) {
													var27.field2460.method4539(0, field2592, field2588, field2572, field2573, var27.field2458 - field2595, var27.field2462 - field2571, var27.field2459 - field2569, var27.field2461);
												}

												class213 var31 = var3.field2509;
												if (var31 != null && var31.field2410 == 0) {
													if (var31.field2407 != null) {
														var31.field2407.method4539(0, field2592, field2588, field2572, field2573, var31.field2403 - field2595, var31.field2404 - field2571, var31.field2405 - field2569, var31.field2409);
													}

													if (var31.field2408 != null) {
														var31.field2408.method4539(0, field2592, field2588, field2572, field2573, var31.field2403 - field2595, var31.field2404 - field2571, var31.field2405 - field2569, var31.field2409);
													}

													if (var31.field2406 != null) {
														var31.field2406.method4539(0, field2592, field2588, field2572, field2573, var31.field2403 - field2595, var31.field2404 - field2571, var31.field2405 - field2569, var31.field2409);
													}
												}
											}

											var14 = var3.field2502;
											if (var14 != 0) {
												if (var4 < field2565 && (var14 & 4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.field2506) {
														field2589.method6711(var33);
													}
												}

												if (var5 < field2566 && (var14 & 2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.field2506) {
														field2589.method6711(var33);
													}
												}

												if (var4 > field2565 && (var14 & 1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.field2506) {
														field2589.method6711(var33);
													}
												}

												if (var5 > field2566 && (var14 & 8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.field2506) {
														field2589.method6711(var33);
													}
												}
											}
											break;
										}

										if (var3.field2504 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.field2499; ++var21) {
												if (var3.field2500[var21].field2845 != field2560 && (var3.field2501[var21] & var3.field2504) == var3.field2508) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = var3.field2489;
												if (!this.method4417(var7, var4, var5, var10.field2814)) {
													var10.field2813.method4539(0, field2592, field2588, field2572, field2573, var10.field2812 - field2595, var10.field2811 - field2571, var10.field2815 - field2569, var10.field2816);
												}

												var3.field2504 = 0;
											}
										}

										if (!var3.field2495) {
											break;
										}

										try {
											int var25 = var3.field2499;
											var3.field2495 = false;
											var21 = 0;

											label563:
											for (var11 = 0; var11 < var25; ++var11) {
												var12 = var3.field2500[var11];
												if (var12.field2845 != field2560) {
													for (var26 = var12.field2840; var26 <= var12.field2847; ++var26) {
														for (var14 = var12.field2842; var14 <= var12.field2843; ++var14) {
															var33 = var8[var26][var14];
															if (var33.field2493) {
																var3.field2495 = true;
																continue label563;
															}

															if (var33.field2504 != 0) {
																var16 = 0;
																if (var26 > var12.field2840) {
																	++var16;
																}

																if (var26 < var12.field2847) {
																	var16 += 4;
																}

																if (var14 > var12.field2842) {
																	var16 += 8;
																}

																if (var14 < var12.field2843) {
																	var16 += 2;
																}

																if ((var16 & var33.field2504) == var3.field2490) {
																	var3.field2495 = true;
																	continue label563;
																}
															}
														}
													}

													field2574[var21++] = var12;
													var26 = field2565 - var12.field2840;
													var14 = var12.field2847 - field2565;
													if (var14 > var26) {
														var26 = var14;
													}

													var15 = field2566 - var12.field2842;
													var16 = var12.field2843 - field2566;
													if (var16 > var15) {
														var12.field2844 = var26 + var16;
													} else {
														var12.field2844 = var26 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var24 = -1;

												for (var26 = 0; var26 < var21; ++var26) {
													class243 var34 = field2574[var26];
													if (var34.field2845 != field2560) {
														if (var34.field2844 > var11) {
															var11 = var34.field2844;
															var24 = var26;
														} else if (var34.field2844 == var11) {
															var15 = var34.field2837 - field2595;
															var16 = var34.field2834 - field2569;
															var17 = field2574[var24].field2837 - field2595;
															var18 = field2574[var24].field2834 - field2569;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												class243 var35 = field2574[var24];
												var35.field2845 = field2560;
												if (!this.method4419(var7, var35.field2840, var35.field2847, var35.field2842, var35.field2843, var35.field2838.field2619)) {
													var35.field2838.method4539(var35.field2839, field2592, field2588, field2572, field2573, var35.field2837 - field2595, var35.field2835 - field2571, var35.field2834 - field2569, var35.field2846);
												}

												for (var14 = var35.field2840; var14 <= var35.field2847; ++var14) {
													for (var15 = var35.field2842; var15 <= var35.field2843; ++var15) {
														class218 var36 = var8[var14][var15];
														if (var36.field2504 != 0) {
															field2589.method6711(var36);
														} else if ((var14 != var4 || var15 != var5) && var36.field2506) {
															field2589.method6711(var36);
														}
													}
												}
											}

											if (!var3.field2495) {
												break;
											}
										} catch (Exception var20) {
											var3.field2495 = false;
											break;
										}
									}
								} while(!var3.field2506);
							} while(var3.field2504 != 0);

							if (var4 > field2565 || var4 <= field2561) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while(var9 != null && var9.field2506);

						if (var4 < field2565 || var4 >= field2562 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while(var9 != null && var9.field2506);

					if (var5 > field2566 || var5 <= field2563) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while(var9 != null && var9.field2506);

				if (var5 < field2566 || var5 >= field2564 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while(var9 != null && var9.field2506);

			var3.field2506 = false;
			--field2600;
			class213 var29 = var3.field2509;
			if (var29 != null && var29.field2410 != 0) {
				if (var29.field2407 != null) {
					var29.field2407.method4539(0, field2592, field2588, field2572, field2573, var29.field2403 - field2595, var29.field2404 - field2571 - var29.field2410, var29.field2405 - field2569, var29.field2409);
				}

				if (var29.field2408 != null) {
					var29.field2408.method4539(0, field2592, field2588, field2572, field2573, var29.field2403 - field2595, var29.field2404 - field2571 - var29.field2410, var29.field2405 - field2569, var29.field2409);
				}

				if (var29.field2406 != null) {
					var29.field2406.method4539(0, field2592, field2588, field2572, field2573, var29.field2403 - field2595, var29.field2404 - field2571 - var29.field2410, var29.field2405 - field2569, var29.field2409);
				}
			}

			if (var3.field2510 != 0) {
				class242 var30 = var3.field2496;
				if (var30 != null && !this.method4418(var7, var4, var5, var30.field2828.field2619)) {
					if ((var30.field2829 & var3.field2510) != 0) {
						var30.field2828.method4539(0, field2592, field2588, field2572, field2573, var30.field2824 - field2595 + var30.field2821, var30.field2830 - field2571, var30.field2823 - field2569 + var30.field2827, var30.field2822);
					} else if (var30.field2829 == 256) {
						var11 = var30.field2824 - field2595;
						var24 = var30.field2830 - field2571;
						var26 = var30.field2823 - field2569;
						var14 = var30.field2825;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}

						if (var16 >= var15) {
							var30.field2828.method4539(0, field2592, field2588, field2572, field2573, var11 + var30.field2821, var24, var26 + var30.field2827, var30.field2822);
						} else if (var30.field2826 != null) {
							var30.field2826.method4539(0, field2592, field2588, field2572, field2573, var11, var24, var26, var30.field2822);
						}
					}
				}

				class240 var28 = var3.field2489;
				if (var28 != null) {
					if ((var28.field2818 & var3.field2510) != 0 && !this.method4417(var7, var4, var5, var28.field2818)) {
						var28.field2817.method4539(0, field2592, field2588, field2572, field2573, var28.field2812 - field2595, var28.field2811 - field2571, var28.field2815 - field2569, var28.field2816);
					}

					if ((var28.field2814 & var3.field2510) != 0 && !this.method4417(var7, var4, var5, var28.field2814)) {
						var28.field2813.method4539(0, field2592, field2588, field2572, field2573, var28.field2812 - field2595, var28.field2811 - field2571, var28.field2815 - field2569, var28.field2816);
					}
				}
			}

			class218 var32;
			if (var6 < this.field2609 - 1) {
				var32 = this.field2549[var6 + 1][var4][var5];
				if (var32 != null && var32.field2506) {
					field2589.method6711(var32);
				}
			}

			if (var4 < field2565) {
				var32 = var8[var4 + 1][var5];
				if (var32 != null && var32.field2506) {
					field2589.method6711(var32);
				}
			}

			if (var5 < field2566) {
				var32 = var8[var4][var5 + 1];
				if (var32 != null && var32.field2506) {
					field2589.method6711(var32);
				}
			}

			if (var4 > field2565) {
				var32 = var8[var4 - 1][var5];
				if (var32 != null && var32.field2506) {
					field2589.method6711(var32);
				}
			}

			if (var5 > field2566) {
				var32 = var8[var4][var5 - 1];
				if (var32 != null && var32.field2506) {
					field2589.method6711(var32);
				}
			}
		}
	}

	void method4411(class235 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - field2595;
		int var11;
		int var12 = var11 = (var8 << 7) - field2569;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field2548[var2][var7][var8] - field2571;
		int var18 = this.field2548[var2][var7 + 1][var8] - field2571;
		int var19 = this.field2548[var2][var7 + 1][var8 + 1] - field2571;
		int var20 = this.field2548[var2][var7][var8 + 1] - field2571;
		int var21 = var12 * var5 + var10 * var6 >> 16;
		var12 = var12 * var6 - var10 * var5 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var12 * var3 >> 16;
		var12 = var17 * var3 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var11 * var5 + var14 * var6 >> 16;
			var11 = var11 * var6 - var14 * var5 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var11 * var3 >> 16;
			var11 = var18 * var3 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var16 * var5 + var13 * var6 >> 16;
				var16 = var16 * var6 - var13 * var5 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var16 * var3 >> 16;
				var16 = var19 * var3 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var15 * var3 >> 16;
					var15 = var20 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = class219.method3433() + var10 * class219.method2841() / var12;
						int var23 = class219.method165() + var17 * class219.method2841() / var12;
						int var24 = class219.method3433() + var14 * class219.method2841() / var11;
						int var25 = class219.method165() + var18 * class219.method2841() / var11;
						int var26 = class219.method3433() + var13 * class219.method2841() / var16;
						int var27 = class219.method165() + var19 * class219.method2841() / var16;
						int var28 = class219.method3433() + var9 * class219.method2841() / var15;
						int var29 = class219.method165() + var21 * class219.method2841() / var15;
						float var30 = class231.method2567(var12);
						float var31 = class231.method2567(var11);
						float var32 = class231.method2567(var16);
						float var33 = class231.method2567(var15);
						class219.field2515.field2789 = 0;
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							class219.field2515.field2799 = false;
							var34 = class219.method47();
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
								class219.field2515.field2799 = true;
							}

							if (field2587 && method4450(field2577, field2578, var27, var29, var25, var26, var28, var24)) {
								field2579 = var7;
								field2580 = var8;
							}

							if (var1.field2786 == -1) {
								if (var1.field2782 != 12345678) {
									class219.method4820(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2782, var1.field2785, var1.field2783);
								}
							} else if (!field2551) {
								if (var1.field2787) {
									class219.method4245(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2782, var1.field2785, var1.field2783, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2786);
								} else {
									class219.method4245(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2782, var1.field2785, var1.field2783, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2786);
								}
							} else {
								var35 = class219.field2515.field2795.method4822(var1.field2786);
								class219.method4820(var27, var29, var25, var26, var28, var24, var32, var33, var31, method4413(var35, var1.field2782), method4413(var35, var1.field2785), method4413(var35, var1.field2783));
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							class219.field2515.field2799 = false;
							var34 = class219.method47();
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
								class219.field2515.field2799 = true;
							}

							if (field2587 && method4450(field2577, field2578, var23, var25, var29, var22, var24, var28)) {
								field2579 = var7;
								field2580 = var8;
							}

							if (var1.field2786 == -1) {
								if (var1.field2784 != 12345678) {
									class219.method4820(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field2784, var1.field2783, var1.field2785);
								}
							} else if (!field2551) {
								class219.method4245(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field2784, var1.field2783, var1.field2785, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2786);
							} else {
								var35 = class219.field2515.field2795.method4822(var1.field2786);
								class219.method4820(var23, var25, var29, var22, var24, var28, var30, var31, var33, method4413(var35, var1.field2784), method4413(var35, var1.field2783), method4413(var35, var1.field2785));
							}
						}

					}
				}
			}
		}
	}

	void method4441(class230 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.field2671.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2671[var9] - field2595;
			var11 = var1.field2660[var9] - field2571;
			var12 = var1.field2679[var9] - field2569;
			var13 = var12 * var4 + var10 * var5 >> 16;
			var12 = var12 * var5 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var11 * var3 - var12 * var2 >> 16;
			var12 = var11 * var2 + var12 * var3 >> 16;
			if (var12 < 50) {
				return;
			}

			if (var1.field2668 != null) {
				class230.field2677[var9] = var10;
				class230.field2678[var9] = var13;
				class230.field2661[var9] = var12;
			}

			class230.field2674[var9] = class219.method3433() + var10 * class219.method2841() / var12;
			class230.field2675[var9] = class219.method165() + var13 * class219.method2841() / var12;
			class230.field2676[var9] = class231.method2567(var12);
		}

		class219.field2515.field2789 = 0;
		var8 = var1.field2665.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2665[var9];
			var11 = var1.field2663[var9];
			var12 = var1.field2666[var9];
			var13 = class230.field2674[var10];
			int var14 = class230.field2674[var11];
			int var15 = class230.field2674[var12];
			int var16 = class230.field2675[var10];
			int var17 = class230.field2675[var11];
			int var18 = class230.field2675[var12];
			float var19 = class230.field2676[var10];
			float var20 = class230.field2676[var11];
			float var21 = class230.field2676[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				class219.field2515.field2799 = false;
				int var22 = class219.method47();
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
					class219.field2515.field2799 = true;
				}

				if (field2587 && method4450(field2577, field2578, var16, var17, var18, var13, var14, var15)) {
					field2579 = var6;
					field2580 = var7;
				}

				if (var1.field2668 != null && var1.field2668[var9] != -1) {
					if (!field2551) {
						if (var1.field2667) {
							class219.method4245(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2662[var9], var1.field2673[var9], var1.field2664[var9], class230.field2677[0], class230.field2677[1], class230.field2677[3], class230.field2678[0], class230.field2678[1], class230.field2678[3], class230.field2661[0], class230.field2661[1], class230.field2661[3], var1.field2668[var9]);
						} else {
							class219.method4245(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2662[var9], var1.field2673[var9], var1.field2664[var9], class230.field2677[var10], class230.field2677[var11], class230.field2677[var12], class230.field2678[var10], class230.field2678[var11], class230.field2678[var12], class230.field2661[var10], class230.field2661[var11], class230.field2661[var12], var1.field2668[var9]);
						}
					} else {
						int var23 = class219.field2515.field2795.method4822(var1.field2668[var9]);
						class219.method4820(var16, var17, var18, var13, var14, var15, var19, var20, var21, method4413(var23, var1.field2662[var9]), method4413(var23, var1.field2673[var9]), method4413(var23, var1.field2664[var9]));
					}
				} else if (var1.field2662[var9] != 12345678) {
					class219.method4820(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2662[var9], var1.field2673[var9], var1.field2664[var9]);
				}
			}
		}

	}

	void method4415() {
		int var1 = field2585[field2559];
		class228[] var2 = field2586[field2559];
		field2601 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			class228 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field2650 == 1) {
				var5 = var4.field2634 - field2565 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field2638 - field2566 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2637 - field2566 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field2604[var5][var6++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field2595 - var4.field2648;
						if (var9 > 32) {
							var4.field2645 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2645 = 2;
							var9 = -var9;
						}

						var4.field2649 = (var4.field2641 - field2569 << 8) / var9;
						var4.field2639 = (var4.field2642 - field2569 << 8) / var9;
						var4.field2636 = (var4.field2643 - field2571 << 8) / var9;
						var4.field2651 = (var4.field2644 - field2571 << 8) / var9;
						field2557[field2601++] = var4;
					}
				}
			} else if (var4.field2650 == 2) {
				var5 = var4.field2638 - field2566 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field2634 - field2565 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2635 - field2565 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field2604[var6++][var5]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field2569 - var4.field2641;
						if (var9 > 32) {
							var4.field2645 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2645 = 4;
							var9 = -var9;
						}

						var4.field2646 = (var4.field2648 - field2595 << 8) / var9;
						var4.field2647 = (var4.field2640 - field2595 << 8) / var9;
						var4.field2636 = (var4.field2643 - field2571 << 8) / var9;
						var4.field2651 = (var4.field2644 - field2571 << 8) / var9;
						field2557[field2601++] = var4;
					}
				}
			} else if (var4.field2650 == 4) {
				var5 = var4.field2643 - field2571;
				if (var5 > 128) {
					var6 = var4.field2638 - field2566 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2637 - field2566 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var8 = var4.field2634 - field2565 + 25;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.field2635 - field2565 + 25;
						if (var9 > 50) {
							var9 = 50;
						}

						boolean var10 = false;

						label145:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (field2604[var11][var12]) {
									var10 = true;
									break label145;
								}
							}
						}

						if (var10) {
							var4.field2645 = 5;
							var4.field2646 = (var4.field2648 - field2595 << 8) / var5;
							var4.field2647 = (var4.field2640 - field2595 << 8) / var5;
							var4.field2649 = (var4.field2641 - field2569 << 8) / var5;
							var4.field2639 = (var4.field2642 - field2569 << 8) / var5;
							field2557[field2601++] = var4;
						}
					}
				}
			}
		}

	}

	boolean method4370(int var1, int var2, int var3) {
		int var4 = this.field2553[var1][var2][var3];
		if (var4 == -field2560) {
			return false;
		} else if (var4 == field2560) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4420(var5 + 1, this.field2548[var1][var2][var3], var6 + 1) && this.method4420(var5 + 128 - 1, this.field2548[var1][var2 + 1][var3], var6 + 1) && this.method4420(var5 + 128 - 1, this.field2548[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4420(var5 + 1, this.field2548[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2553[var1][var2][var3] = field2560;
				return true;
			} else {
				this.field2553[var1][var2][var3] = -field2560;
				return false;
			}
		}
	}

	boolean method4417(int var1, int var2, int var3, int var4) {
		if (!this.method4370(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.field2548[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > field2595) {
						if (!this.method4420(var5, var7, var6)) {
							return false;
						}

						if (!this.method4420(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4420(var5, var8, var6)) {
							return false;
						}

						if (!this.method4420(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4420(var5, var9, var6)) {
						return false;
					}

					if (!this.method4420(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < field2569) {
						if (!this.method4420(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4420(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4420(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4420(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4420(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4420(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < field2595) {
						if (!this.method4420(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4420(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4420(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4420(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4420(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4420(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > field2569) {
						if (!this.method4420(var5, var7, var6)) {
							return false;
						}

						if (!this.method4420(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4420(var5, var8, var6)) {
							return false;
						}

						if (!this.method4420(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4420(var5, var9, var6)) {
						return false;
					}

					if (!this.method4420(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4420(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4420(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4420(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4420(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4420(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	boolean method4418(int var1, int var2, int var3, int var4) {
		if (!this.method4370(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4420(var5 + 1, this.field2548[var1][var2][var3] - var4, var6 + 1) && this.method4420(var5 + 128 - 1, this.field2548[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4420(var5 + 128 - 1, this.field2548[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4420(var5 + 1, this.field2548[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method4419(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.method4370(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4420(var7 + 1, this.field2548[var1][var2][var4] - var6, var8 + 1) && this.method4420(var7 + 128 - 1, this.field2548[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4420(var7 + 128 - 1, this.field2548[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4420(var7 + 1, this.field2548[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2553[var1][var7][var8] == -field2560) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.field2548[var1][var2][var4] - var6;
			if (!this.method4420(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4420(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4420(var7, var9, var11)) {
						return false;
					} else if (!this.method4420(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method4420(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < field2601; ++var4) {
			class228 var5 = field2557[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2645 == 1) {
				var6 = var5.field2648 - var1;
				if (var6 > 0) {
					var7 = var5.field2641 + (var5.field2649 * var6 >> 8);
					var8 = var5.field2642 + (var5.field2639 * var6 >> 8);
					var9 = var5.field2643 + (var5.field2636 * var6 >> 8);
					var10 = var5.field2644 + (var5.field2651 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2645 == 2) {
				var6 = var1 - var5.field2648;
				if (var6 > 0) {
					var7 = var5.field2641 + (var5.field2649 * var6 >> 8);
					var8 = var5.field2642 + (var5.field2639 * var6 >> 8);
					var9 = var5.field2643 + (var5.field2636 * var6 >> 8);
					var10 = var5.field2644 + (var5.field2651 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2645 == 3) {
				var6 = var5.field2641 - var3;
				if (var6 > 0) {
					var7 = var5.field2648 + (var5.field2646 * var6 >> 8);
					var8 = var5.field2640 + (var5.field2647 * var6 >> 8);
					var9 = var5.field2643 + (var5.field2636 * var6 >> 8);
					var10 = var5.field2644 + (var5.field2651 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2645 == 4) {
				var6 = var3 - var5.field2641;
				if (var6 > 0) {
					var7 = var5.field2648 + (var5.field2646 * var6 >> 8);
					var8 = var5.field2640 + (var5.field2647 * var6 >> 8);
					var9 = var5.field2643 + (var5.field2636 * var6 >> 8);
					var10 = var5.field2644 + (var5.field2651 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2645 == 5) {
				var6 = var2 - var5.field2643;
				if (var6 > 0) {
					var7 = var5.field2648 + (var5.field2646 * var6 >> 8);
					var8 = var5.field2640 + (var5.field2647 * var6 >> 8);
					var9 = var5.field2641 + (var5.field2649 * var6 >> 8);
					var10 = var5.field2642 + (var5.field2639 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public static void method4371(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		class228 var8 = new class228();
		var8.field2634 = var2 / 128;
		var8.field2635 = var3 / 128;
		var8.field2638 = var4 / 128;
		var8.field2637 = var5 / 128;
		var8.field2650 = var1;
		var8.field2648 = var2;
		var8.field2640 = var3;
		var8.field2641 = var4;
		var8.field2642 = var5;
		var8.field2643 = var6;
		var8.field2644 = var7;
		field2586[var0][field2585[var0]++] = var8;
	}

	public static void method4403(int[] var0, int var1, int var2, int var3, int var4) {
		field2607 = 0;
		field2608 = 0;
		field2596 = var3;
		field2610 = var4;
		field2605 = var3 / 2;
		field2606 = var4 / 2;
		boolean[][][][] var5 = new boolean[var0.length][32][53][53];

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) {
			for (var7 = 0; var7 < 2048; var7 += 64) {
				field2592 = class219.field2512[var6];
				field2588 = class219.field2516[var6];
				field2572 = class219.field2512[var7];
				field2573 = class219.field2516[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (int var10 = -26; var10 < 26; ++var10) {
					for (var11 = -26; var11 < 26; ++var11) {
						var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128) {
							if (method4494(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) {
			for (var7 = 0; var7 < 32; ++var7) {
				for (var8 = -25; var8 < 25; ++var8) {
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;

						label76:
						for (var11 = -1; var11 <= 1; ++var11) {
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}

						field2603[var6][var7][var8 + 25][var9 + 25] = var16;
					}
				}
			}
		}

	}

	static boolean method4494(int var0, int var1, int var2) {
		int var3 = var2 * field2572 + var0 * field2573 >> 16;
		int var4 = var2 * field2573 - var0 * field2572 >> 16;
		int var5 = var1 * field2592 + var4 * field2588 >> 16;
		int var6 = var1 * field2588 - var4 * field2592 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = field2605 + var3 * 128 / var5;
			int var8 = field2606 + var6 * 128 / var5;
			return var7 >= field2607 && var7 <= field2596 && var8 >= field2608 && var8 <= field2610;
		} else {
			return false;
		}
	}

	public static boolean method4409() {
		return field2581 && field2579 != -1;
	}

	public static void method4408() {
		field2579 = -1;
		field2581 = false;
	}

	static final int method4413(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static boolean method4450(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
