public class class86 implements class357 {
	static final class86 field1065;
	static final class86 field1066;
	static final class86 field1068;
	static final class86 field1071;
	static final class86 field1073;
	final int field1067;
	final int field1070;

	static {
		field1066 = new class86(0, -1);
		field1073 = new class86(1, 1);
		field1071 = new class86(2, 7);
		field1065 = new class86(3, 8);
		field1068 = new class86(4, 9);
	}

	class86(int var1, int var2) {
		this.field1067 = var1;
		this.field1070 = var2;
	}

	public int method6674() {
		return this.field1070;
	}

	static class86[] method2928() {
		return new class86[]{field1065, field1073, field1068, field1071, field1066};
	}

	static final void method2219(int var0, int var1) {
		if (Client.field633 >= 2 || Client.field649 != 0 || Client.field651) {
			if (Client.field644) {
				int var3 = Client.method2086();
				String var4;
				if (1 == Client.field649 && Client.field633 < 2) {
					var4 = class337.field4000 + class337.field4010 + Client.field497 + " " + class97.field1284;
				} else if (Client.field651 && Client.field633 < 2) {
					var4 = Client.field663 + class337.field4010 + Client.field655 + " " + class97.field1284;
				} else {
					var4 = class405.method7550(var3);
				}

				if (Client.field633 > 2) {
					var4 = var4 + class97.method7285(16777215) + " " + '/' + " " + (Client.field633 - 2) + class337.field4004;
				}

				Client.field1635.method7194(var4, var0 + 4, var1 + 15, 16777215, 0, Client.field602 / 1000);
			}
		}
	}
}
