public class class485 {
	static final int field4974;
	static final int field4975;

	static {
		field4974 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field4975 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	public static int method6945(int var0) {
		return var0 >>> 12;
	}

	public static int method7769(int var0) {
		return var0 >>> 4 & field4975;
	}

	public static int method3189(int var0) {
		return (var0 & field4974) - 1;
	}

	static Object[] method6992(class489 var0, int[] var1) {
		int var3 = var0.method8827();
		Object[] var4 = new Object[var3 * var1.length];

		for (int var5 = 0; var5 < var3; ++var5) {
			for (int var6 = 0; var6 < var1.length; ++var6) {
				int var7 = var6 + var5 * var1.length;
				class479 var8 = class477.method2658(var1[var6]);
				var4[var7] = var8.method8510(var0);
			}
		}

		return var4;
	}
}
