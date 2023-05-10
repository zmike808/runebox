public class class289 extends class449 {
	static class289[] field3216;
	static int field3214;
	class287 field3210;
	int field3211;
	public class488 field3212;
	public int field3213;

	static {
		field3216 = new class289[300];
		field3214 = 0;
	}

	class289() {
	}

	public void method5501() {
		if (field3214 < field3216.length) {
			field3216[++field3214 - 1] = this;
		}
	}

	static class289 method3714() {
		return field3214 == 0 ? new class289() : field3216[--field3214];
	}

	public static class289 method8504() {
		class289 var1 = method3714();
		var1.field3210 = null;
		var1.field3211 = 0;
		var1.field3212 = new class488(5000);
		return var1;
	}
}
