public class class197 extends class444 {
	public static class280 field2105;
	static class344 field2104;
	static final int[] field2108;
	public int field2103;
	public int field2106;
	public int field2107;

	static {
		field2105 = new class280(64);
		field2108 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2108[var1] = var0 - 1;
			var0 += var0;
		}

	}

	class197() {
	}

	void method3746(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3753(var1, var3);
		}
	}

	void method3753(class489 var1, int var2) {
		if (var2 == 1) {
			this.field2107 = var1.method8660();
			this.field2106 = var1.method8658();
			this.field2103 = var1.method8658();
		}

	}

	public static void method1987(class344 var0) {
		field2104 = var0;
	}

	public static class197 method3298(int var0) {
		class197 var2 = (class197)field2105.method5461((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2104.method6468(14, var0);
			var2 = new class197();
			if (var3 != null) {
				var2.method3746(new class489(var3));
			}

			field2105.method5463(var2, (long)var0);
			return var2;
		}
	}
}
