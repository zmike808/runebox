public class class75 extends class444 {
	static class280 field972;
	static class342 field1541;
	class464[] field971;
	int field967;
	int field968;
	int field969;
	int field970;
	int[] field964;
	int[] field965;
	String field962;
	String[] field966;

	static {
		field972 = new class280(128);
	}

	class75() {
	}

	class464[] method2076(int var1) {
		return new class464[var1];
	}

	public static int method2081(int var0, int var1) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var3 * var0;
		} else {
			return var3;
		}
	}

	static class75 method6314(int var0) {
		class75 var2 = (class75)field972.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1541.method6468(var0, 0);
			if (null == var3) {
				return null;
			} else {
				var2 = class34.method508(var3);
				field972.method5463(var2, (long)var0);
				return var2;
			}
		}
	}

	static class75 method3273(int var0, int var1, int var2) {
		int var4 = (var1 << 8) + var0;
		class75 var6 = class201.method3896(var4, var0);
		if (null != var6) {
			return var6;
		} else {
			int var5 = class335.method5278(var2, var0);
			class75 var8 = (class75)field972.method5461((long)(var5 << 16));
			class75 var7;
			if (null != var8) {
				var7 = var8;
			} else {
				String var9 = String.valueOf(var5);
				int var10 = field1541.method6464(var9);
				if (var10 == -1) {
					var7 = null;
				} else {
					byte[] var11 = field1541.method6501(var10);
					if (null != var11) {
						if (var11.length <= 1) {
							var7 = null;
							return var7 != null ? var7 : null;
						}

						var8 = class34.method508(var11);
						if (var8 != null) {
							field972.method5463(var8, (long)(var5 << 16));
							var7 = var8;
							return var7 != null ? var7 : null;
						}
					}

					var7 = null;
				}
			}

			return var7 != null ? var7 : null;
		}
	}
}
