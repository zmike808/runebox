public class class64 {
	static class64[] field179;
	static int field792;
	static int field806;
	static int[] field793;
	static int[] field794;
	int field797;
	int field798;
	int field801;
	int field802;
	int field805;
	String field799;
	String field800;

	static {
		field792 = 0;
		field806 = 0;
		field793 = new int[]{1, 1, 1, 1};
		field794 = new int[]{0, 1, 2, 3};
	}

	class64() {
	}

	boolean method1717() {
		return 0 != (1 & this.field797);
	}

	boolean method1718() {
		return (65536 & this.field797) != 0;
	}

	boolean method1768() {
		return 0 != (2 & this.field797);
	}

	boolean method1720() {
		return 0 != (4 & this.field797);
	}

	boolean method1721() {
		return 0 != (8 & this.field797);
	}

	boolean method1750() {
		return 0 != (536870912 & this.field797);
	}

	boolean method1723() {
		return 0 != (33554432 & this.field797);
	}

	boolean method1724() {
		return 0 != (1073741824 & this.field797);
	}

	boolean method1725() {
		return (256 & this.field797) != 0;
	}

	boolean method1726() {
		return 0 != (134217728 & this.field797);
	}

	static int method1773(int var0) {
		class77 var2 = (class77)class106.field1376.get(var0);
		return var2 == null ? 0 : var2.method2108();
	}

	static void method9063(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (var0 != field794[var6]) {
				var3[var5] = field794[var6];
				var4[var5] = field793[var6];
				++var5;
			}
		}

		field794 = var3;
		field793 = var4;
		class124.method2990(field179, 0, field179.length - 1, field794, field793);
	}

	static void method3054(int var0, boolean var1, int var2, boolean var3) {
		if (field179 != null) {
			class14.method174(0, field179.length - 1, var0, var1, var2, var3);
		}

	}

	static class64 method4548() {
		field806 = 0;
		return method1958();
	}

	static class64 method1958() {
		return field806 < field792 ? field179[++field806 - 1] : null;
	}
}
