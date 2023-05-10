public class class307 {
	public static int[] field3481;
	public static int[] field3482;
	static int[] field3483;

	static {
		field3483 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field3483[var1] = var0 - 1;
			var0 += var0;
		}

		field3481 = new int[4000];
		field3482 = new int[4000];
	}

	public static int method5179(int var0) {
		class197 var2 = class197.method3298(var0);
		int var3 = var2.field2107;
		int var4 = var2.field2106;
		int var5 = var2.field2103;
		int var6 = field3483[var5 - var4];
		return field3482[var3] >> var4 & var6;
	}

	public static void method5489(int var0, int var1) {
		class197 var3 = class197.method3298(var0);
		int var4 = var3.field2107;
		int var5 = var3.field2106;
		int var6 = var3.field2103;
		int var7 = field3483[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		field3482[var4] = field3482[var4] & ~var7 | var1 << var5 & var7;
	}
}
