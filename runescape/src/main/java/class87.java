public class class87 implements class357 {
	static final class87 field1075;
	static final class87 field1076;
	static final class87 field1077;
	static final class87 field1078;
	static final class87 field1079;
	static final class87 field1081;
	final int field1080;
	final int field1082;

	static {
		field1081 = new class87(0, -1);
		field1075 = new class87(1, 2);
		field1076 = new class87(2, 3);
		field1077 = new class87(3, 4);
		field1078 = new class87(4, 5);
		field1079 = new class87(5, 6);
	}

	class87(int var1, int var2) {
		this.field1082 = var1;
		this.field1080 = var2;
	}

	public int method6674() {
		return this.field1080;
	}

	static class87[] method6373() {
		return new class87[]{field1075, field1079, field1076, field1081, field1078, field1077};
	}

	static final void method2230(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != Client.field112.method2405()) {
			if (Client.field112.method2405() == 0 && -1 != Client.field650) {
				class298.method1202(Client.field4548, Client.field650, 0, var0, false);
				Client.field739 = false;
			} else if (var0 == 0) {
				class298.method3735();
				Client.field739 = false;
			} else {
				class298.method4359(var0);
			}

			Client.field112.method2404(var0);
		}

	}
}
