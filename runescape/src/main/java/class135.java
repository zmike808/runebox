public class class135 implements class357 {
	static final class135 field1600;
	static final class135 field1601;
	static final class135 field1603;
	static final class135 field1604;
	static final class135 field1605;
	static final class135 field1606;
	static final class135 field1607;
	static final class135 field1608;
	static final class135 field1611;
	final int field1609;
	final int field1610;

	static {
		field1604 = new class135(0, 0);
		field1611 = new class135(1, 1);
		field1603 = new class135(2, 2);
		field1606 = new class135(3, 3);
		field1600 = new class135(4, 4);
		field1605 = new class135(5, 5);
		field1601 = new class135(6, 6);
		field1607 = new class135(7, 7);
		field1608 = new class135(8, 8);
	}

	class135(int var1, int var2) {
		this.field1609 = var1;
		this.field1610 = var2;
	}

	public int method6674() {
		return this.field1610;
	}

	static class135[] method7927() {
		return new class135[]{field1604, field1611, field1603, field1606, field1600, field1605, field1601, field1607, field1608};
	}

	static class135 method3327(int var0) {
		class135 var2 = (class135)class199.method3788(method7927(), var0);
		if (var2 == null) {
			var2 = field1608;
		}

		return var2;
	}

	public static boolean method3117(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
