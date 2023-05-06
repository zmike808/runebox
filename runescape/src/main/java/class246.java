public class class246 {
	public static final class246 field2860;
	public static final class246 field2861;
	public static final class246 field2865;
	final int field2859;
	final int field2862;
	final int field2864;

	static {
		field2860 = new class246(0, 0, 4);
		field2865 = new class246(2, 1, 2);
		field2861 = new class246(1, 2, 0);
	}

	class246(int var1, int var2, int var3) {
		this.field2862 = var1;
		this.field2859 = var2;
		this.field2864 = var3;
	}

	boolean method4853(float var1) {
		return var1 >= (float)this.field2864;
	}

	static class246 method4854(int var0) {
		class246[] var2 = new class246[]{field2860, field2865, field2861};
		class246[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class246 var5 = var3[var4];
			if (var5.field2859 == var0) {
				return var5;
			}
		}

		return null;
	}
}
