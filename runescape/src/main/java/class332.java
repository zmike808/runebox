public class class332 {
	static final class332 field3801;
	static final class332 field3802;
	static final class332 field3805;
	static final class332 field3806;
	final int field3800;
	public final String field3803;

	static {
		field3806 = new class332("LIVE", 0);
		field3801 = new class332("BUILDLIVE", 3);
		field3802 = new class332("RC", 1);
		field3805 = new class332("WIP", 2);
	}

	class332(String var1, int var2) {
		this.field3803 = var1;
		this.field3800 = var2;
	}

	public static class332 method3188(int var0) {
		class332[] var2 = new class332[]{field3806, field3801, field3802, field3805};
		class332[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class332 var5 = var3[var4];
			if (var0 == var5.field3800) {
				return var5;
			}
		}

		return null;
	}

	static final int method6339(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
		return var4;
	}
}
