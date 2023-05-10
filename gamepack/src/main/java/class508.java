public class class508 {
	public static final class508 field5129;
	static final class508 field5130;
	static final class508 field5131;
	public final int field5132;

	static {
		field5131 = new class508(0);
		field5129 = new class508(1);
		field5130 = new class508(2);
	}

	class508(int var1) {
		this.field5132 = var1;
	}

	public static class508 method7469(int var0) {
		class508[] var2 = new class508[]{field5131, field5130, field5129};
		class508[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class508 var5 = var3[var4];
			if (var5.field5132 == var0) {
				return var5;
			}
		}

		return null;
	}
}
