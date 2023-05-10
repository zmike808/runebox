public class class81 extends class449 {
	static class465 field1022;
	int[] field1023;
	int[] field1027;

	static {
		field1022 = new class465(32);
	}

	class81() {
		this.field1023 = new int[]{-1};
		this.field1027 = new int[]{0};
	}

	static int method2301(int var0, int var1) {
		class81 var3 = (class81)field1022.method8381((long)var0);
		if (var3 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field1023.length ? var3.field1023[var1] : -1;
		}
	}

	static int method7979(int var0, int var1) {
		class81 var3 = (class81)field1022.method8381((long)var0);
		if (var3 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field1027.length ? var3.field1027[var1] : 0;
		}
	}

	static int method7731(int var0, int var1) {
		class81 var3 = (class81)field1022.method8381((long)var0);
		if (null == var3) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field1027.length; ++var5) {
				if (var1 == var3.field1023[var5]) {
					var4 += var3.field1027[var5];
				}
			}

			return var4;
		}
	}

	public static class204 method2189(int var0, byte var1) {
		class204 var2 = (class204)class204.field2287.method5461((long)var0);
		if (null != var2) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			} else {
				return var2;
			}
		} else {
			byte[] var3 = class204.field2311.method6468(12, var0);
			var2 = new class204();
			if (var3 != null) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				var2.method3995(new class489(var3));
			}

			var2.method3997();
			class204.field2287.method5463(var2, (long)var0);
			return var2;
		}
	}

	static void method4981(int var0) {
		class81 var2 = (class81)field1022.method8381((long)var0);
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.field1023.length; ++var3) {
				var2.field1023[var3] = -1;
				var2.field1027[var3] = 0;
			}

		}
	}

	static final String method2187(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return class97.method7285(16711680);
		} else if (var3 < -6) {
			return class97.method7285(16723968);
		} else if (var3 < -3) {
			return class97.method7285(16740352);
		} else if (var3 < 0) {
			return class97.method7285(16756736);
		} else if (var3 > 9) {
			return class97.method7285(65280);
		} else if (var3 > 6) {
			return class97.method7285(4259584);
		} else if (var3 > 3) {
			return class97.method7285(8453888);
		} else {
			return var3 > 0 ? class97.method7285(12648192) : class97.method7285(16776960);
		}
	}
}
