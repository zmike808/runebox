public abstract class class321 {
	class321() {
	}

	abstract byte[] method6308();

	abstract void method6305(byte[] var1);

	public static Object method2790(byte[] var0, boolean var1) {
		if (null == var0) {
			return null;
		} else if (var0.length > 136) {
			class323 var3 = new class323();
			var3.method6305(var0);
			return var3;
		} else {
			return var1 ? method3171(var0) : var0;
		}
	}

	public static byte[] method3599(Object var0, boolean var1) {
		if (null == var0) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var7 = (byte[])((byte[])var0);
			if (var1) {
				int var5 = var7.length;
				byte[] var6 = new byte[var5];
				System.arraycopy(var7, 0, var6, 0, var5);
				return var6;
			} else {
				return var7;
			}
		} else if (var0 instanceof class321) {
			class321 var3 = (class321)var0;
			return var3.method6308();
		} else {
			throw new IllegalArgumentException();
		}
	}

	static byte[] method3171(byte[] var0) {
		int var2 = var0.length;
		byte[] var3 = new byte[var2];
		System.arraycopy(var0, 0, var3, 0, var2);
		return var3;
	}
}
