import java.util.Arrays;
import java.util.HashMap;

public class class232 extends class225 {
	static boolean field2738;
	static boolean[] field2725;
	static boolean[] field2726;
	static byte[] field2687;
	static byte[] field2689;
	static char[] field2755;
	static char[][] field2736;
	static class232 field2724;
	static class232 field2727;
	static class426 field2690;
	static class426 field2691;
	static class426 field2692;
	static float[] field2706;
	static float[] field2729;
	static int field2735;
	static int field2746;
	static int field2748;
	static int[] field2688;
	static int[] field2696;
	static int[] field2717;
	static int[] field2728;
	static int[] field2730;
	static int[] field2732;
	static int[] field2733;
	static int[] field2737;
	static int[] field2739;
	static int[] field2740;
	static int[] field2741;
	static int[] field2742;
	static int[] field2743;
	static int[] field2744;
	static int[] field2747;
	static int[] field2750;
	static int[] field2761;
	static int[][] field2701;
	static final float field2758;
	byte[] field2704;
	byte[] field2705;
	byte[] field2710;
	int field2718;
	int field2719;
	int field2720;
	int field2731;
	int field2749;
	int[] field2694;
	int[] field2695;
	int[] field2698;
	int[] field2699;
	int[] field2700;
	int[] field2702;
	int[] field2703;
	int[] field2711;
	int[] field2721;
	int[] field2745;
	int[] field2760;
	int[] field2763;
	int[][] field2712;
	int[][] field2713;
	int[][] field2716;
	int[][] field2751;
	HashMap field2723;
	short[] field2707;
	public boolean field2714;
	public byte field2708;
	public byte field2715;
	public byte field2754;
	public byte field2757;
	public byte field2762;
	public int field2693;
	public int field2697;
	public int field2709;
	public short field2756;

	static {
		field2724 = new class232();
		field2687 = new byte[1];
		field2727 = new class232();
		field2689 = new byte[1];
		field2690 = new class426();
		field2691 = new class426();
		field2692 = new class426();
		field2725 = new boolean[6500];
		field2726 = new boolean[6500];
		field2747 = new int[6500];
		field2728 = new int[6500];
		field2729 = new float[6500];
		field2730 = new int[6500];
		field2717 = new int[6500];
		field2732 = new int[6500];
		field2761 = new int[6500];
		field2755 = new char[6000];
		field2736 = new char[6000][512];
		field2737 = new int[12];
		field2701 = new int[12][2000];
		field2739 = new int[2000];
		field2740 = new int[2000];
		field2741 = new int[12];
		field2742 = new int[10];
		field2743 = new int[10];
		field2744 = new int[10];
		field2706 = new float[10];
		field2738 = true;
		field2750 = class219.field2512;
		field2688 = class219.field2516;
		field2696 = class219.field2517;
		field2733 = class219.field2514;
		field2758 = class231.method2567(50);
	}

	class232() {
		this.field2693 = 0;
		this.field2697 = 0;
		this.field2708 = 0;
		this.field2709 = 0;
		this.field2714 = false;
		this.field2723 = new HashMap();
	}

	public class232(class232[] var1, int var2) {
		this.field2693 = 0;
		this.field2697 = 0;
		this.field2708 = 0;
		this.field2709 = 0;
		this.field2714 = false;
		this.field2723 = new HashMap();
		this.field2693 = 0;
		this.field2697 = 0;
		this.field2709 = 0;
		this.field2708 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			class232 var4 = var1[var3];
			if (var4 != null) {
				this.field2693 += var4.field2693;
				this.field2697 += var4.field2697;
				this.field2709 += var4.field2709;
				if (this.field2708 == -1) {
					this.field2708 = var4.field2708;
				}
			}
		}

		this.method4667(this.field2693, this.field2697, this.field2709);
		this.field2693 = 0;
		this.field2697 = 0;
		this.field2709 = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method4704(var1[var3]);
		}

	}

	public class232(int var1, int var2, int var3, byte var4) {
		this.field2693 = 0;
		this.field2697 = 0;
		this.field2708 = 0;
		this.field2709 = 0;
		this.field2714 = false;
		this.field2723 = new HashMap();
		this.method4667(var1, var2, var3);
		this.field2708 = var4;
		this.field2693 = 0;
		this.field2697 = 0;
		this.field2709 = 0;
	}

	void method4667(int var1, int var2, int var3) {
		this.field2694 = new int[var1];
		this.field2695 = new int[var1];
		this.field2763 = new int[var1];
		this.field2698 = new int[var2];
		this.field2699 = new int[var2];
		this.field2700 = new int[var2];
		this.field2721 = new int[var2];
		this.field2702 = new int[var2];
		this.field2703 = new int[var2];
		if (var3 > 0) {
			this.field2760 = new int[var3];
			this.field2711 = new int[var3];
			this.field2745 = new int[var3];
		}

	}

	void method4595(class232 var1) {
		int var2 = this.field2698.length;
		if (this.field2704 == null && (var1.field2704 != null || this.field2708 != var1.field2708)) {
			this.field2704 = new byte[var2];
			Arrays.fill(this.field2704, this.field2708);
		}

		if (this.field2705 == null && var1.field2705 != null) {
			this.field2705 = new byte[var2];
			Arrays.fill(this.field2705, (byte)0);
		}

		if (this.field2707 == null && var1.field2707 != null) {
			this.field2707 = new short[var2];
			Arrays.fill(this.field2707, (short)-1);
		}

		if (this.field2710 == null && var1.field2710 != null) {
			this.field2710 = new byte[var2];
			Arrays.fill(this.field2710, (byte)-1);
		}

	}

	public void method4704(class232 var1) {
		if (var1 != null) {
			this.method4595(var1);

			int var2;
			for (var2 = 0; var2 < var1.field2697; ++var2) {
				this.field2698[this.field2697] = var1.field2698[var2] + this.field2693;
				this.field2699[this.field2697] = var1.field2699[var2] + this.field2693;
				this.field2700[this.field2697] = var1.field2700[var2] + this.field2693;
				this.field2721[this.field2697] = var1.field2721[var2];
				this.field2702[this.field2697] = var1.field2702[var2];
				this.field2703[this.field2697] = var1.field2703[var2];
				if (this.field2704 != null) {
					this.field2704[this.field2697] = var1.field2704 != null ? var1.field2704[var2] : var1.field2708;
				}

				if (this.field2705 != null && var1.field2705 != null) {
					this.field2705[this.field2697] = var1.field2705[var2];
				}

				if (this.field2707 != null) {
					this.field2707[this.field2697] = var1.field2707 != null ? var1.field2707[var2] : -1;
				}

				if (this.field2710 != null) {
					if (var1.field2710 != null && var1.field2710[var2] != -1) {
						this.field2710[this.field2697] = (byte)(var1.field2710[var2] + this.field2709);
					} else {
						this.field2710[this.field2697] = -1;
					}
				}

				++this.field2697;
			}

			for (var2 = 0; var2 < var1.field2709; ++var2) {
				this.field2760[this.field2709] = var1.field2760[var2] + this.field2693;
				this.field2711[this.field2709] = var1.field2711[var2] + this.field2693;
				this.field2745[this.field2709] = var1.field2745[var2] + this.field2693;
				++this.field2709;
			}

			for (var2 = 0; var2 < var1.field2693; ++var2) {
				this.field2694[this.field2693] = var1.field2694[var2];
				this.field2695[this.field2693] = var1.field2695[var2];
				this.field2763[this.field2693] = var1.field2763[var2];
				++this.field2693;
			}

		}
	}

	public class232 method4597(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method4654();
		int var7 = var2 - this.field2720;
		int var8 = var2 + this.field2720;
		int var9 = var4 - this.field2720;
		int var10 = var4 + this.field2720;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class232 var11;
				if (var5) {
					var11 = new class232();
					var11.field2693 = this.field2693;
					var11.field2697 = this.field2697;
					var11.field2709 = this.field2709;
					var11.field2694 = this.field2694;
					var11.field2763 = this.field2763;
					var11.field2698 = this.field2698;
					var11.field2699 = this.field2699;
					var11.field2700 = this.field2700;
					var11.field2721 = this.field2721;
					var11.field2702 = this.field2702;
					var11.field2703 = this.field2703;
					var11.field2704 = this.field2704;
					var11.field2705 = this.field2705;
					var11.field2710 = this.field2710;
					var11.field2707 = this.field2707;
					var11.field2708 = this.field2708;
					var11.field2760 = this.field2760;
					var11.field2711 = this.field2711;
					var11.field2745 = this.field2745;
					var11.field2713 = this.field2713;
					var11.field2751 = this.field2751;
					var11.field2714 = this.field2714;
					var11.field2695 = new int[var11.field2693];
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
					for (var12 = 0; var12 < var11.field2693; ++var12) {
						var13 = this.field2694[var12] + var2;
						var14 = this.field2763[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2695[var12] = this.field2695[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2693; ++var12) {
						var13 = (-this.field2695[var12] << 16) / super.field2619;
						if (var13 < var6) {
							var14 = this.field2694[var12] + var2;
							var15 = this.field2763[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2695[var12] = this.field2695[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method4605();
				return var11;
			}
		} else {
			return this;
		}
	}

	public class232 method4593(boolean var1) {
		if (!var1 && field2687.length < this.field2697) {
			field2687 = new byte[this.field2697 + 100];
		}

		return this.method4600(var1, field2724, field2687);
	}

	public class232 method4599(boolean var1) {
		if (!var1 && field2689.length < this.field2697) {
			field2689 = new byte[this.field2697 + 100];
		}

		return this.method4600(var1, field2727, field2689);
	}

	class232 method4600(boolean var1, class232 var2, byte[] var3) {
		var2.field2693 = this.field2693;
		var2.field2697 = this.field2697;
		var2.field2709 = this.field2709;
		if (var2.field2694 == null || var2.field2694.length < this.field2693) {
			var2.field2694 = new int[this.field2693 + 100];
			var2.field2695 = new int[this.field2693 + 100];
			var2.field2763 = new int[this.field2693 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.field2693; ++var4) {
			var2.field2694[var4] = this.field2694[var4];
			var2.field2695[var4] = this.field2695[var4];
			var2.field2763[var4] = this.field2763[var4];
		}

		if (var1) {
			var2.field2705 = this.field2705;
		} else {
			var2.field2705 = var3;
			if (this.field2705 == null) {
				for (var4 = 0; var4 < this.field2697; ++var4) {
					var2.field2705[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field2697; ++var4) {
					var2.field2705[var4] = this.field2705[var4];
				}
			}
		}

		var2.field2698 = this.field2698;
		var2.field2699 = this.field2699;
		var2.field2700 = this.field2700;
		var2.field2721 = this.field2721;
		var2.field2702 = this.field2702;
		var2.field2703 = this.field2703;
		var2.field2704 = this.field2704;
		var2.field2710 = this.field2710;
		var2.field2707 = this.field2707;
		var2.field2708 = this.field2708;
		var2.field2760 = this.field2760;
		var2.field2711 = this.field2711;
		var2.field2745 = this.field2745;
		var2.field2713 = this.field2713;
		var2.field2751 = this.field2751;
		var2.field2712 = this.field2712;
		var2.field2716 = this.field2716;
		var2.field2714 = this.field2714;
		var2.method4605();
		var2.field2762 = 0;
		return var2;
	}

	void method4601(int var1) {
		if (!this.field2723.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2688[var1];
			int var9 = field2750[var1];

			for (int var10 = 0; var10 < this.field2693; ++var10) {
				int var11 = class231.method3169(this.field2694[var10], this.field2763[var10], var8, var9);
				int var12 = this.field2695[var10];
				int var13 = class160.method3326(this.field2694[var10], this.field2763[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}
			}

			class224 var14 = new class224((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var15 = true;
			if (var14.field2614 < 32) {
				var14.field2614 = 32;
			}

			if (var14.field2616 < 32) {
				var14.field2616 = 32;
			}

			if (this.field2714) {
				boolean var16 = true;
				var14.field2614 += 8;
				var14.field2616 += 8;
			}

			this.field2723.put(var1, var14);
		}
	}

	public void method4654() {
		if (this.field2718 != 1) {
			this.field2718 = 1;
			super.field2619 = 0;
			this.field2719 = 0;
			this.field2720 = 0;

			for (int var1 = 0; var1 < this.field2693; ++var1) {
				int var2 = this.field2694[var1];
				int var3 = this.field2695[var1];
				int var4 = this.field2763[var1];
				if (-var3 > super.field2619) {
					super.field2619 = -var3;
				}

				if (var3 > this.field2719) {
					this.field2719 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.field2720) {
					this.field2720 = var5;
				}
			}

			this.field2720 = (int)(Math.sqrt((double)this.field2720) + 0.99D);
			this.field2749 = (int)(Math.sqrt((double)(this.field2720 * this.field2720 + super.field2619 * super.field2619)) + 0.99D);
			this.field2731 = this.field2749 + (int)(Math.sqrt((double)(this.field2720 * this.field2720 + this.field2719 * this.field2719)) + 0.99D);
		}
	}

	void method4699() {
		if (this.field2718 != 2) {
			this.field2718 = 2;
			this.field2720 = 0;

			for (int var1 = 0; var1 < this.field2693; ++var1) {
				int var2 = this.field2694[var1];
				int var3 = this.field2695[var1];
				int var4 = this.field2763[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.field2720) {
					this.field2720 = var5;
				}
			}

			this.field2720 = (int)(Math.sqrt((double)this.field2720) + 0.99D);
			this.field2749 = this.field2720;
			this.field2731 = this.field2720 + this.field2720;
		}
	}

	public int method4608() {
		this.method4654();
		return this.field2720;
	}

	public void method4605() {
		this.field2718 = 0;
		this.field2723.clear();
	}

	public void method4642(class227 var1, int var2) {
		if (this.field2713 != null) {
			if (var2 != -1) {
				class217 var3 = var1.field2631[var2];
				class222 var4 = var3.field2482;
				field2746 = 0;
				field2735 = 0;
				field2748 = 0;

				for (int var5 = 0; var5 < var3.field2483; ++var5) {
					int var6 = var3.field2484[var5];
					this.method4613(var4.field2540[var6], var4.field2543[var6], var3.field2485[var5], var3.field2479[var5], var3.field2486[var5]);
				}

				this.method4605();
			}
		}
	}

	public void method4607(class134 var1, int var2) {
		class222 var3 = var1.field1591;
		class220 var4 = var3.method4363();
		if (var4 != null) {
			var3.method4363().method4303(var1, var2);
			this.method4609(var3.method4363(), var1.method3078());
		}

		if (var1.method3073()) {
			this.method4617(var1, var2);
		}

		this.method4605();
	}

	void method4617(class134 var1, int var2) {
		class222 var3 = var1.field1591;

		for (int var4 = 0; var4 < var3.field2534; ++var4) {
			int var5 = var3.field2540[var4];
			if (var5 == 5 && var1.field1593 != null && var1.field1593[var4] != null && var1.field1593[var4][0] != null && this.field2751 != null && this.field2705 != null) {
				class126 var6 = var1.field1593[var4][0];
				int[] var7 = var3.field2543[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.field2751.length) {
						int[] var11 = this.field2751[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.field2705[var13] & 255) + var6.method2999(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.field2705[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	void method4609(class220 var1, int var2) {
		this.method4628(var1, var2);
	}

	public void method4610(class227 var1, int var2, class227 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				class217 var6 = var1.field2631[var2];
				class217 var7 = var3.field2631[var4];
				class222 var8 = var6.field2482;
				field2746 = 0;
				field2735 = 0;
				field2748 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field2483; ++var11) {
					for (var12 = var6.field2484[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.field2540[var12] == 0) {
						this.method4613(var8.field2540[var12], var8.field2543[var12], var6.field2485[var11], var6.field2479[var11], var6.field2486[var11]);
					}
				}

				field2746 = 0;
				field2735 = 0;
				field2748 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.field2483; ++var11) {
					for (var12 = var7.field2484[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.field2540[var12] == 0) {
						this.method4613(var8.field2540[var12], var8.field2543[var12], var7.field2485[var11], var7.field2479[var11], var7.field2486[var11]);
					}
				}

				this.method4605();
			} else {
				this.method4642(var1, var2);
			}
		}
	}

	public void method4647(class222 var1, class134 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class220 var7 = var1.method4363();
		if (var7 != null) {
			var7.method4320(var2, var3, var4, var5);
			if (var6) {
				this.method4609(var7, var2.method3078());
			}
		}

		if (!var5 && var2.method3073()) {
			this.method4617(var2, var3);
		}

	}

	public void method4612(class227 var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.method4642(var1, var2);
		} else {
			class217 var5 = var1.field2631[var2];
			class222 var6 = var5.field2482;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			field2746 = 0;
			field2735 = 0;
			field2748 = 0;

			for (int var9 = 0; var9 < var5.field2483; ++var9) {
				int var10;
				for (var10 = var5.field2484[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.field2540[var10] == 0) {
						this.method4613(var6.field2540[var10], var6.field2543[var10], var5.field2485[var9], var5.field2479[var9], var5.field2486[var9]);
					}
				} else if (var10 != var8 || var6.field2540[var10] == 0) {
					this.method4613(var6.field2540[var10], var6.field2543[var10], var5.field2485[var9], var5.field2479[var9], var5.field2486[var9]);
				}
			}

		}
	}

	void method4613(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field2746 = 0;
			field2735 = 0;
			field2748 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.field2713.length) {
					int[] var19 = this.field2713[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						field2746 += this.field2694[var12];
						field2735 += this.field2695[var12];
						field2748 += this.field2763[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				field2746 = field2746 / var7 + var3;
				field2735 = field2735 / var7 + var4;
				field2748 = field2748 / var7 + var5;
			} else {
				field2746 = var3;
				field2735 = var4;
				field2748 = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2713.length) {
						var9 = this.field2713[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2694;
							var10000[var11] += var3;
							var10000 = this.field2695;
							var10000[var11] += var4;
							var10000 = this.field2763;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2713.length) {
						var9 = this.field2713[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2694;
							var10000[var11] -= field2746;
							var10000 = this.field2695;
							var10000[var11] -= field2735;
							var10000 = this.field2763;
							var10000[var11] -= field2748;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2750[var14];
								var16 = field2688[var14];
								var17 = this.field2695[var11] * var15 + this.field2694[var11] * var16 >> 16;
								this.field2695[var11] = this.field2695[var11] * var16 - this.field2694[var11] * var15 >> 16;
								this.field2694[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2750[var12];
								var16 = field2688[var12];
								var17 = this.field2695[var11] * var16 - this.field2763[var11] * var15 >> 16;
								this.field2763[var11] = this.field2695[var11] * var15 + this.field2763[var11] * var16 >> 16;
								this.field2695[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2750[var13];
								var16 = field2688[var13];
								var17 = this.field2763[var11] * var15 + this.field2694[var11] * var16 >> 16;
								this.field2763[var11] = this.field2763[var11] * var16 - this.field2694[var11] * var15 >> 16;
								this.field2694[var11] = var17;
							}

							var10000 = this.field2694;
							var10000[var11] += field2746;
							var10000 = this.field2695;
							var10000[var11] += field2735;
							var10000 = this.field2763;
							var10000[var11] += field2748;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2713.length) {
						var9 = this.field2713[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2694;
							var10000[var11] -= field2746;
							var10000 = this.field2695;
							var10000[var11] -= field2735;
							var10000 = this.field2763;
							var10000[var11] -= field2748;
							this.field2694[var11] = this.field2694[var11] * var3 / 128;
							this.field2695[var11] = this.field2695[var11] * var4 / 128;
							this.field2763[var11] = this.field2763[var11] * var5 / 128;
							var10000 = this.field2694;
							var10000[var11] += field2746;
							var10000 = this.field2695;
							var10000[var11] += field2735;
							var10000 = this.field2763;
							var10000[var11] += field2748;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.field2751 != null && this.field2705 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field2751.length) {
							var9 = this.field2751[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.field2705[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.field2705[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	public void method4684() {
		for (int var1 = 0; var1 < this.field2693; ++var1) {
			int var2 = this.field2694[var1];
			this.field2694[var1] = this.field2763[var1];
			this.field2763[var1] = -var2;
		}

		this.method4605();
	}

	public void method4615() {
		for (int var1 = 0; var1 < this.field2693; ++var1) {
			this.field2694[var1] = -this.field2694[var1];
			this.field2763[var1] = -this.field2763[var1];
		}

		this.method4605();
	}

	public void method4602() {
		for (int var1 = 0; var1 < this.field2693; ++var1) {
			int var2 = this.field2763[var1];
			this.field2763[var1] = this.field2694[var1];
			this.field2694[var1] = -var2;
		}

		this.method4605();
	}

	public void method4594(int var1) {
		int var2 = field2750[var1];
		int var3 = field2688[var1];

		for (int var4 = 0; var4 < this.field2693; ++var4) {
			int var5 = this.field2695[var4] * var3 - this.field2763[var4] * var2 >> 16;
			this.field2763[var4] = this.field2695[var4] * var2 + this.field2763[var4] * var3 >> 16;
			this.field2695[var4] = var5;
		}

		this.method4605();
	}

	public void method4611(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2693; ++var4) {
			int[] var10000 = this.field2694;
			var10000[var4] += var1;
			var10000 = this.field2695;
			var10000[var4] += var2;
			var10000 = this.field2763;
			var10000[var4] += var3;
		}

		this.method4605();
	}

	public void method4663(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2693; ++var4) {
			this.field2694[var4] = this.field2694[var4] * var1 / 128;
			this.field2695[var4] = this.field2695[var4] * var2 / 128;
			this.field2763[var4] = this.field2763[var4] * var3 / 128;
		}

		this.method4605();
	}

	public final void method4705(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.field2718 != 2 && this.field2718 != 1) {
			this.method4699();
		}

		int var8 = class219.method3433();
		int var9 = class219.method165();
		int var10 = field2750[var1];
		int var11 = field2688[var1];
		int var12 = field2750[var2];
		int var13 = field2688[var2];
		int var14 = field2750[var3];
		int var15 = field2688[var3];
		int var16 = field2750[var4];
		int var17 = field2688[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < this.field2693; ++var19) {
			int var20 = this.field2694[var19];
			int var21 = this.field2695[var19];
			int var22 = this.field2763[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2730[var19] = var22 - var18;
			field2747[var19] = var8 + var20 * class219.method2841() / var22;
			field2728[var19] = var9 + var23 * class219.method2841() / var22;
			field2729[var19] = class231.method2567(var22);
			if (this.field2709 > 0) {
				field2717[var19] = var20;
				field2732[var19] = var23;
				field2761[var19] = var22;
			}
		}

		try {
			this.method4622(false, false, false, 0L);
		} catch (Exception var24) {
		}

	}

	public final void method4621(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.field2718 != 2 && this.field2718 != 1) {
			this.method4699();
		}

		int var9 = class219.method3433();
		int var10 = class219.method165();
		int var11 = field2750[var1];
		int var12 = field2688[var1];
		int var13 = field2750[var2];
		int var14 = field2688[var2];
		int var15 = field2750[var3];
		int var16 = field2688[var3];
		int var17 = field2750[var4];
		int var18 = field2688[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.field2693; ++var20) {
			int var21 = this.field2694[var20];
			int var22 = this.field2695[var20];
			int var23 = this.field2763[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2730[var20] = var23 - var19;
			field2747[var20] = var9 + var21 * class219.method2841() / var8;
			field2728[var20] = var10 + var24 * class219.method2841() / var8;
			field2729[var20] = class231.method2567(var8);
			if (this.field2709 > 0) {
				field2717[var20] = var21;
				field2732[var20] = var24;
				field2761[var20] = var23;
			}
		}

		try {
			this.method4622(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	void method4539(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.field2718 != 1) {
			this.method4654();
		}

		this.method4601(var1);
		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = this.field2720 * var3 >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var6 * var5 >> 16;
			int var16 = (var15 - this.field2720) * class219.method2841();
			if (var16 / var14 < class219.method5283()) {
				int var17 = (var15 + this.field2720) * class219.method2841();
				int var18 = var17 / var14;
				int var19 = class219.field2515.field2800;
				if (var18 > var19) {
					int var20 = var7 * var3 - var11 * var2 >> 16;
					int var21 = this.field2720 * var2 >> 16;
					int var22 = var21 + (this.field2719 * var3 >> 16);
					int var23 = (var20 + var22) * class219.method2841();
					int var24 = var23 / var14;
					int var25 = class219.field2515.field2802;
					if (var24 > var25) {
						int var26 = var21 + (super.field2619 * var3 >> 16);
						int var27 = (var20 - var26) * class219.method2841();
						if (var27 / var14 < class219.method3159()) {
							int var28 = var13 + (super.field2619 * var2 >> 16);
							boolean var29 = false;
							boolean var30 = false;
							if (var12 - var28 <= 50) {
								var30 = true;
							}

							boolean var31 = var30 || this.field2709 > 0;
							int var32 = class233.method2061();
							int var33 = class233.field2766;
							boolean var35 = class233.field2767;
							boolean var37 = class174.method3458(var9);
							boolean var38 = false;
							int var40;
							int var41;
							int var42;
							if (var37 && var35) {
								boolean var39 = false;
								if (field2738) {
									var39 = class233.method7956(this, var1, var6, var7, var8);
								} else {
									var40 = var12 - var13;
									if (var40 <= 50) {
										var40 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var40;
									} else {
										var17 /= var14;
										var16 /= var40;
									}

									if (var20 > 0) {
										var27 /= var14;
										var23 /= var40;
									} else {
										var23 /= var14;
										var27 /= var40;
									}

									var41 = var32 - class219.method3433();
									var42 = var33 - class219.method165();
									if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
										var39 = true;
									}
								}

								if (var39) {
									if (this.field2714) {
										class233.method1960(var9);
									} else {
										var38 = true;
									}
								}
							}

							int var49 = class219.method3433();
							var40 = class219.method165();
							var41 = 0;
							var42 = 0;
							if (var1 != 0) {
								var41 = field2750[var1];
								var42 = field2688[var1];
							}

							for (int var43 = 0; var43 < this.field2693; ++var43) {
								int var44 = this.field2694[var43];
								int var45 = this.field2695[var43];
								int var46 = this.field2763[var43];
								int var47;
								if (var1 != 0) {
									var47 = var46 * var41 + var44 * var42 >> 16;
									var46 = var46 * var42 - var44 * var41 >> 16;
									var44 = var47;
								}

								var44 += var6;
								var45 += var7;
								var46 += var8;
								var47 = var46 * var4 + var44 * var5 >> 16;
								var46 = var46 * var5 - var44 * var4 >> 16;
								var44 = var47;
								var47 = var45 * var3 - var46 * var2 >> 16;
								var46 = var45 * var2 + var46 * var3 >> 16;
								field2730[var43] = var46 - var12;
								if (var46 >= 50) {
									field2747[var43] = var49 + var44 * class219.method2841() / var46;
									field2728[var43] = var40 + var47 * class219.method2841() / var46;
									field2729[var43] = class231.method2567(var46);
								} else {
									field2747[var43] = -5000;
									var29 = true;
								}

								if (var31) {
									field2717[var43] = var44;
									field2732[var43] = var47;
									field2761[var43] = var46;
								}
							}

							try {
								this.method4622(var29, var38, this.field2714, var9);
							} catch (Exception var48) {
							}

						}
					}
				}
			}
		}
	}

	final void method4622(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.field2731 < 6000) {
			int var6;
			for (var6 = 0; var6 < this.field2731; ++var6) {
				field2755[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.field2697; ++var7) {
				if (this.field2703[var7] != -2) {
					var8 = this.field2698[var7];
					var9 = this.field2699[var7];
					var10 = this.field2700[var7];
					var11 = field2747[var8];
					var12 = field2747[var9];
					var13 = field2747[var10];
					int var17;
					int var33;
					if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
						var33 = field2717[var8];
						var15 = field2717[var9];
						var16 = field2717[var10];
						var17 = field2732[var8];
						var18 = field2732[var9];
						int var19 = field2732[var10];
						int var20 = field2761[var8];
						int var21 = field2761[var9];
						int var22 = field2761[var10];
						var33 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var19;
						int var24 = var20 * var16 - var33 * var22;
						int var25 = var33 * var19 - var17 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2726[var7] = true;
							int var26 = (field2730[var8] + field2730[var9] + field2730[var10]) / 3 + this.field2749;
							field2736[var26][field2755[var26]++] = var7;
						}
					} else {
						if (var2) {
							var15 = field2728[var8];
							var16 = field2728[var9];
							var17 = field2728[var10];
							var18 = class233.field2766 + var6;
							boolean var14;
							if (var18 < var15 && var18 < var16 && var18 < var17) {
								var14 = false;
							} else {
								var18 = class233.field2766 - var6;
								if (var18 > var15 && var18 > var16 && var18 > var17) {
									var14 = false;
								} else {
									var18 = var6 + class233.field2771;
									if (var18 < var11 && var18 < var12 && var18 < var13) {
										var14 = false;
									} else {
										var18 = class233.field2771 - var6;
										if (var18 > var11 && var18 > var12 && var18 > var13) {
											var14 = false;
										} else {
											var14 = true;
										}
									}
								}
							}

							if (var14) {
								class233.method1960(var4);
								var2 = false;
							}
						}

						if ((var11 - var12) * (field2728[var10] - field2728[var9]) - (field2728[var8] - field2728[var9]) * (var13 - var12) > 0) {
							field2726[var7] = false;
							var33 = class219.method47();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var33 && var12 <= var33 && var13 <= var33) {
								field2725[var7] = false;
							} else {
								field2725[var7] = true;
							}

							var15 = (field2730[var8] + field2730[var9] + field2730[var10]) / 3 + this.field2749;
							field2736[var15][field2755[var15]++] = var7;
						}
					}
				}
			}

			int var27;
			char var28;
			char[] var29;
			if (this.field2704 == null) {
				for (var27 = this.field2731 - 1; var27 >= 0; --var27) {
					var28 = field2755[var27];
					if (var28 > 0) {
						var29 = field2736[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							this.method4623(var29[var10]);
						}
					}
				}

			} else {
				for (var27 = 0; var27 < 12; ++var27) {
					field2737[var27] = 0;
					field2741[var27] = 0;
				}

				for (var27 = this.field2731 - 1; var27 >= 0; --var27) {
					var28 = field2755[var27];
					if (var28 > 0) {
						var29 = field2736[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							char var30 = var29[var10];
							byte var31 = this.field2704[var30];
							var13 = field2737[var31]++;
							field2701[var31][var13] = var30;
							if (var31 < 10) {
								int[] var36 = field2741;
								var36[var31] += var27;
							} else if (var31 == 10) {
								field2739[var13] = var27;
							} else {
								field2740[var13] = var27;
							}
						}
					}
				}

				var27 = 0;
				if (field2737[1] > 0 || field2737[2] > 0) {
					var27 = (field2741[1] + field2741[2]) / (field2737[1] + field2737[2]);
				}

				var8 = 0;
				if (field2737[3] > 0 || field2737[4] > 0) {
					var8 = (field2741[3] + field2741[4]) / (field2737[3] + field2737[4]);
				}

				var9 = 0;
				if (field2737[6] > 0 || field2737[8] > 0) {
					var9 = (field2741[6] + field2741[8]) / (field2737[6] + field2737[8]);
				}

				var11 = 0;
				var12 = field2737[10];
				int[] var32 = field2701[10];
				int[] var34 = field2739;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2737[11];
					var32 = field2701[11];
					var34 = field2740;
				}

				if (var11 < var12) {
					var10 = var34[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var27) {
						this.method4623(var32[var11++]);
						if (var11 == var12 && var32 != field2701[11]) {
							var11 = 0;
							var12 = field2737[11];
							var32 = field2701[11];
							var34 = field2740;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.method4623(var32[var11++]);
						if (var11 == var12 && var32 != field2701[11]) {
							var11 = 0;
							var12 = field2737[11];
							var32 = field2701[11];
							var34 = field2740;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.method4623(var32[var11++]);
						if (var11 == var12 && var32 != field2701[11]) {
							var11 = 0;
							var12 = field2737[11];
							var32 = field2701[11];
							var34 = field2740;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2737[var15];
					int[] var35 = field2701[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.method4623(var35[var18]);
					}
				}

				while (var10 != -1000) {
					this.method4623(var32[var11++]);
					if (var11 == var12 && var32 != field2701[11]) {
						var11 = 0;
						var32 = field2701[11];
						var12 = field2737[11];
						var34 = field2740;
					}

					if (var11 < var12) {
						var10 = var34[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	final void method4623(int var1) {
		if (field2726[var1]) {
			this.method4634(var1);
		} else {
			int var2 = this.field2698[var1];
			int var3 = this.field2699[var1];
			int var4 = this.field2700[var1];
			class219.field2515.field2799 = field2725[var1];
			if (this.field2705 == null) {
				class219.field2515.field2789 = 0;
			} else {
				class219.field2515.field2789 = this.field2705[var1] & 255;
			}

			this.method4625(var1, field2728[var2], field2728[var3], field2728[var4], field2747[var2], field2747[var3], field2747[var4], field2729[var2], field2729[var3], field2729[var4], this.field2721[var1], this.field2702[var1], this.field2703[var1]);
		}
	}

	boolean method4624(int var1) {
		return this.field2762 > 0 && var1 < this.field2756;
	}

	final void method4625(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		int var21;
		if (this.field2707 != null && this.field2707[var1] != -1) {
			int var20;
			int var22;
			if (this.field2710 != null && this.field2710[var1] != -1) {
				int var23 = this.field2710[var1] & 255;
				var20 = this.field2760[var23];
				var21 = this.field2711[var23];
				var22 = this.field2745[var23];
			} else {
				var20 = this.field2698[var1];
				var21 = this.field2699[var1];
				var22 = this.field2700[var1];
			}

			if (this.field2703[var1] == -1) {
				class23.method323(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2717[var20], field2717[var21], field2717[var22], field2732[var20], field2732[var21], field2732[var22], field2761[var20], field2761[var21], field2761[var22], this.field2707[var1]);
			} else {
				class23.method323(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2717[var20], field2717[var21], field2717[var22], field2732[var20], field2732[var21], field2732[var22], field2761[var20], field2761[var21], field2761[var22], this.field2707[var1]);
			}
		} else {
			boolean var14 = this.method4624(var1);
			byte var16;
			byte var17;
			byte var18;
			if (this.field2703[var1] == -1 && var14) {
				var21 = field2696[this.field2721[var1]];
				var16 = this.field2757;
				var17 = this.field2715;
				var18 = this.field2754;
				byte var19 = this.field2762;
				class219.field2520.method4358(var2, var3, var4, var5, var6, var7, var8, var9, var10, var21, var16, var17, var18, var19);
			} else if (this.field2703[var1] == -1) {
				class219.method3178(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2696[this.field2721[var1]]);
			} else if (var14) {
				byte var15 = this.field2757;
				var16 = this.field2715;
				var17 = this.field2754;
				var18 = this.field2762;
				class219.field2520.method4324(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var15, var16, var17, var18);
			} else {
				class219.method4820(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	final void method4634(int var1) {
		int var2 = class219.method3433();
		int var3 = class219.method165();
		int var4 = 0;
		int var5 = this.field2698[var1];
		int var6 = this.field2699[var1];
		int var7 = this.field2700[var1];
		int var8 = field2761[var5];
		int var9 = field2761[var6];
		int var10 = field2761[var7];
		if (this.field2705 == null) {
			class219.field2515.field2789 = 0;
		} else {
			class219.field2515.field2789 = this.field2705[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2742[var4] = field2747[var5];
			field2743[var4] = field2728[var5];
			field2706[var4] = field2729[var7];
			field2744[var4++] = this.field2721[var1];
		} else {
			var11 = field2717[var5];
			var12 = field2732[var5];
			var13 = this.field2721[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * field2733[var10 - var8];
				field2742[var4] = var2 + (var11 + ((field2717[var7] - var11) * var14 >> 16)) * class219.method2841() / 50;
				field2743[var4] = var3 + (var12 + ((field2732[var7] - var12) * var14 >> 16)) * class219.method2841() / 50;
				field2706[var4] = field2758;
				field2744[var4++] = var13 + ((this.field2703[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * field2733[var9 - var8];
				field2742[var4] = var2 + (var11 + ((field2717[var6] - var11) * var14 >> 16)) * class219.method2841() / 50;
				field2743[var4] = var3 + (var12 + ((field2732[var6] - var12) * var14 >> 16)) * class219.method2841() / 50;
				field2706[var4] = field2758;
				field2744[var4++] = var13 + ((this.field2702[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2742[var4] = field2747[var6];
			field2743[var4] = field2728[var6];
			field2706[var4] = field2729[var7];
			field2744[var4++] = this.field2702[var1];
		} else {
			var11 = field2717[var6];
			var12 = field2732[var6];
			var13 = this.field2702[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * field2733[var8 - var9];
				field2742[var4] = var2 + (var11 + ((field2717[var5] - var11) * var14 >> 16)) * class219.method2841() / 50;
				field2743[var4] = var3 + (var12 + ((field2732[var5] - var12) * var14 >> 16)) * class219.method2841() / 50;
				field2706[var4] = field2758;
				field2744[var4++] = var13 + ((this.field2721[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * field2733[var10 - var9];
				field2742[var4] = var2 + (var11 + ((field2717[var7] - var11) * var14 >> 16)) * class219.method2841() / 50;
				field2743[var4] = var3 + (var12 + ((field2732[var7] - var12) * var14 >> 16)) * class219.method2841() / 50;
				field2744[var4++] = var13 + ((this.field2703[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2742[var4] = field2747[var7];
			field2743[var4] = field2728[var7];
			field2706[var4] = field2729[var7];
			field2744[var4++] = this.field2703[var1];
		} else {
			var11 = field2717[var7];
			var12 = field2732[var7];
			var13 = this.field2703[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * field2733[var9 - var10];
				field2742[var4] = var2 + (var11 + ((field2717[var6] - var11) * var14 >> 16)) * class219.method2841() / 50;
				field2743[var4] = var3 + (var12 + ((field2732[var6] - var12) * var14 >> 16)) * class219.method2841() / 50;
				field2706[var4] = field2758;
				field2744[var4++] = var13 + ((this.field2702[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * field2733[var8 - var10];
				field2742[var4] = var2 + (var11 + ((field2717[var5] - var11) * var14 >> 16)) * class219.method2841() / 50;
				field2743[var4] = var3 + (var12 + ((field2732[var5] - var12) * var14 >> 16)) * class219.method2841() / 50;
				field2706[var4] = field2758;
				field2744[var4++] = var13 + ((this.field2721[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2742[0];
		var12 = field2742[1];
		var13 = field2742[2];
		var14 = field2743[0];
		int var15 = field2743[1];
		int var16 = field2743[2];
		float var17 = field2706[0];
		float var18 = field2706[1];
		float var19 = field2706[2];
		class219.field2515.field2799 = false;
		int var20 = class219.method47();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				class219.field2515.field2799 = true;
			}

			this.method4625(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2742[3] < 0 || field2742[3] > var20) {
				class219.field2515.field2799 = true;
			}

			int var22;
			int var23;
			int var24;
			if (this.field2707 != null && this.field2707[var1] != -1) {
				int var38;
				if (this.field2710 != null && this.field2710[var1] != -1) {
					var24 = this.field2710[var1] & 255;
					var38 = this.field2760[var24];
					var22 = this.field2711[var24];
					var23 = this.field2745[var24];
				} else {
					var38 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var41 = this.field2707[var1];
				if (this.field2703[var1] == -1) {
					class23.method323(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field2721[var1], this.field2721[var1], this.field2721[var1], field2717[var38], field2717[var22], field2717[var23], field2732[var38], field2732[var22], field2732[var23], field2761[var38], field2761[var22], field2761[var23], var41);
					class23.method323(var14, var16, field2743[3], var11, var13, field2742[3], var17, var19, field2706[3], this.field2721[var1], this.field2721[var1], this.field2721[var1], field2717[var38], field2717[var22], field2717[var23], field2732[var38], field2732[var22], field2732[var23], field2761[var38], field2761[var22], field2761[var23], var41);
				} else {
					class23.method323(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2], field2717[var38], field2717[var22], field2717[var23], field2732[var38], field2732[var22], field2732[var23], field2761[var38], field2761[var22], field2761[var23], var41);
					class23.method323(var14, var16, field2743[3], var11, var13, field2742[3], var17, var19, field2706[3], field2744[0], field2744[2], field2744[3], field2717[var38], field2717[var22], field2717[var23], field2732[var38], field2732[var22], field2732[var23], field2761[var38], field2761[var22], field2761[var23], var41);
				}
			} else {
				boolean var21 = this.method4624(var1);
				byte var25;
				byte var26;
				if (this.field2703[var1] == -1 && var21) {
					var22 = field2696[this.field2721[var1]];
					byte var39 = this.field2757;
					byte var40 = this.field2715;
					var25 = this.field2754;
					var26 = this.field2762;
					class219.field2520.method4358(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var39, var40, var25, var26);
					int var42 = field2743[3];
					int var43 = field2742[3];
					float var44 = field2706[3];
					byte var45 = this.field2757;
					byte var46 = this.field2715;
					byte var47 = this.field2754;
					byte var48 = this.field2762;
					class219.field2520.method4358(var14, var16, var42, var11, var13, var43, var17, var19, var44, var22, var45, var46, var47, var48);
				} else if (this.field2703[var1] == -1) {
					var22 = field2696[this.field2721[var1]];
					class219.method3178(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					class219.method3178(var14, var16, field2743[3], var11, var13, field2742[3], var17, var19, field2706[3], var22);
				} else if (var21) {
					var22 = field2744[0];
					var23 = field2744[1];
					var24 = field2744[2];
					var25 = this.field2757;
					var26 = this.field2754;
					byte var27 = this.field2715;
					byte var28 = this.field2762;
					class219.field2520.method4324(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var23, var24, var25, var26, var27, var28);
					int var29 = field2743[3];
					int var30 = field2742[3];
					int var31 = field2744[0];
					int var32 = field2744[2];
					int var33 = field2744[3];
					byte var34 = this.field2757;
					byte var35 = this.field2754;
					byte var36 = this.field2715;
					byte var37 = this.field2762;
					class219.field2520.method4324(var14, var16, var29, var11, var13, var30, 0.0F, 0.0F, 0.0F, var31, var32, var33, var34, var35, var36, var37);
				} else {
					class219.method4820(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2]);
					class219.method4820(var14, var16, field2743[3], var11, var13, field2742[3], var17, var19, field2706[3], field2744[0], field2744[2], field2744[3]);
				}
			}
		}

	}

	void method4618(int var1, class426 var2) {
		float var3 = (float)this.field2694[var1];
		float var4 = (float)(-this.field2695[var1]);
		float var5 = (float)(-this.field2763[var1]);
		float var6 = 1.0F;
		this.field2694[var1] = (int)(var2.field4671[0] * var3 + var2.field4671[4] * var4 + var2.field4671[8] * var5 + var2.field4671[12] * var6);
		this.field2695[var1] = -((int)(var2.field4671[1] * var3 + var2.field4671[5] * var4 + var2.field4671[9] * var5 + var2.field4671[13] * var6));
		this.field2763[var1] = -((int)(var2.field4671[2] * var3 + var2.field4671[6] * var4 + var2.field4671[10] * var5 + var2.field4671[14] * var6));
	}

	void method4628(class220 var1, int var2) {
		if (this.field2712 != null) {
			for (int var3 = 0; var3 < this.field2693; ++var3) {
				int[] var4 = this.field2712[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2716[var3];
					field2690.method7868();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class123 var8 = var1.method4300(var7);
						if (var8 != null) {
							field2691.method7870((float)var5[var6] / 255.0F);
							field2692.method7869(var8.method2936(var2));
							field2692.method7873(field2691);
							field2690.method7872(field2692);
						}
					}

					this.method4618(var3, field2690);
				}
			}

		}
	}
}
