public class class484 extends class444 {
	public static class280 field4968;
	static class344 field4969;
	int[][] field4970;
	Object[][] field4972;
	public int field4971;

	static {
		field4968 = new class280(64);
	}

	class484() {
		this.field4971 = -1;
	}

	void method8560(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method8573(var1, var3);
		}
	}

	public Object[] method8571(int var1) {
		return this.field4972 == null ? null : this.field4972[var1];
	}

	void method8573(class489 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method8658();
			if (this.field4972 == null) {
				this.field4972 = new Object[var4][];
				this.field4970 = new int[var4][];
			}

			for (int var5 = var1.method8658(); var5 != 255; var5 = var1.method8658()) {
				int var6 = var1.method8658();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method8827();
				}

				this.field4972[var5] = class485.method6992(var1, var7);
				this.field4970[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field4971 = var1.method8680((byte)53);
		}

	}

	void method8563() {
	}
}
