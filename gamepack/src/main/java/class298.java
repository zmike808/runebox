public class class298 {
	public static int field3389;

	static {
		field3389 = 0;
	}

	public static boolean method3770(class344 var0, class344 var1, class344 var2, class299 var3) {
		Client.field3385 = var0;
		Client.field3386 = var1;
		Client.field3387 = var2;
		Client.field4942 = var3;
		return true;
	}

	public static void method1202(class344 var0, int var1, int var2, int var3, boolean var4) {
		field3389 = 1;
		Client.field3388 = var0;
		Client.field4411 = var1;
		Client.field1913 = var2;
		Client.field1324 = var3;
		Client.field1459 = var4;
		Client.field1789 = 10000;
	}

	public static void method4359(int var0) {
		if (field3389 != 0) {
			Client.field1324 = var0;
		} else {
			Client.field4942.method5568(var0);
		}

	}

	public static void method3735() {
		Client.field4942.method5574();
		field3389 = 1;
		Client.field3388 = null;
	}

	public static void method5488(int var0, class344 var1, String var2, String var3, int var4, boolean var5) {
		if (var1.method6466(var2, var3)) {
			int var7 = var1.method6464(var2);
			int var8 = var1.method6450(var7, var3);
			method2343(var0, var1, var7, var8, var4, var5);
		}

	}

	public static void method2343(int var0, class344 var1, int var2, int var3, int var4, boolean var5) {
		field3389 = 1;
		Client.field3388 = var1;
		Client.field4411 = var2;
		Client.field1913 = var3;
		Client.field1324 = var4;
		Client.field1459 = var5;
		Client.field1789 = var0;
	}

	static int method5553(class64 var0, class64 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field798;
			int var6 = var1.field798;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field801 - var1.field801;
		} else if (var2 == 3) {
			if (var0.field800.equals("-")) {
				if (var1.field800.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field800.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field800.compareTo(var1.field800);
			}
		} else if (var2 == 4) {
			return var0.method1721() ? (var1.method1721() ? 0 : 1) : (var1.method1721() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1768() ? (var1.method1768() ? 0 : 1) : (var1.method1768() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method1720() ? (var1.method1720() ? 0 : 1) : (var1.method1720() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method1717() ? (var1.method1717() ? 0 : 1) : (var1.method1717() ? -1 : 0);
		} else {
			return var0.field802 - var1.field802;
		}
	}
}
