public class class291 implements class286 {
	public static final class291 field3339;
	public static final class291 field3342;
	public static final class291 field3343;
	public static final class291 field3345;
	static final class291 field3340;
	static final class291 field3344;
	static final class291[] field3346;
	public final int field3347;

	static {
		field3345 = new class291(14);
		field3340 = new class291(15);
		field3343 = new class291(16);
		field3342 = new class291(18);
		field3339 = new class291(19);
		field3344 = new class291(27);
		field3346 = new class291[32];
		class291[] var0 = method505();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3346[var0[var1].field3347] = var0[var1];
		}

	}

	class291(int var1) {
		this.field3347 = var1;
	}

	static class291[] method505() {
		return new class291[]{field3342, field3344, field3340, field3343, field3345, field3339};
	}
}
