public final class class242 {
	int field2821;
	int field2823;
	int field2824;
	int field2825;
	int field2827;
	int field2829;
	int field2830;
	int field2831;
	public class225 field2826;
	public class225 field2828;
	public long field2822;

	class242() {
		this.field2822 = 0L;
		this.field2831 = 0;
	}

	static final void method4834(byte[] var0, int var1, int var2, int var3, int var4, class209[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var1 + var8 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
						int[] var10000 = var5[var7].field2380[var1 + var8];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}

		class489 var13 = new class489(var0);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var2 + var10;
					class373.method6937(var13, var8, var11, var12, var3 + var11, var4 + var12, 0);
				}
			}
		}

	}

	static void method4836(class317[] var0, class317 var1, boolean var2) {
		int var4 = var1.field3593 != 0 ? var1.field3593 : var1.field3572;
		int var5 = 0 != var1.field3594 ? var1.field3594 : var1.field3586;
		class136.method3120(var0, var1.field3570, var4, var5, var2);
		if (var1.field3707 != null) {
			class136.method3120(var1.field3707, var1.field3570, var4, var5, var2);
		}

		class83 var6 = (class83)Client.field657.method8381((long)var1.field3570);
		if (null != var6) {
			Client.method4019(var6.field1037, var4, var5, var2);
		}

		if (1337 == var1.field3686) {
		}

	}
}
