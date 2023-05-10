public final class class90 extends class449 {
	int field1120;
	int field1121;
	int field1122;
	int field1123;
	int field1124;
	int field1125;
	int field1126;
	int field1127;
	int field1128;
	int field1129;
	int field1130;
	int field1131;
	int field1132;
	int field1136;

	class90() {
		this.field1130 = 31;
		this.field1126 = 0;
		this.field1132 = -1;
	}

	void method2305(int var1) {
		this.field1130 = var1;
	}

	boolean method2306(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return 0 != (this.field1130 & 1 << var1);
		} else {
			return true;
		}
	}

	public static class227 method2304(class344 var0, class344 var1, int var2, boolean var3) {
		boolean var5 = true;
		int[] var6 = var0.method6449(var2);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var0.method6454(var2, var6[var7]);
			if (null == var8) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10;
				if (var3) {
					var10 = var1.method6454(0, var9);
				} else {
					var10 = var1.method6454(var9, 0);
				}

				if (null == var10) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new class227(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}
}
