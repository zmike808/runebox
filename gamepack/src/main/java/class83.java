public class class83 extends class449 {
	boolean field1039;
	int field1037;
	int field1038;

	class83() {
		this.field1039 = false;
	}

	public static synchronized void method2195(byte[] var0) {
		if (var0.length == 100 && class387.field4466 < class387.field4470) {
			class387.field4474[++class387.field4466 - 1] = var0;
		} else if (5000 == var0.length && class387.field4478 < class387.field4471) {
			class387.field4467[++class387.field4478 - 1] = var0;
		} else if (10000 == var0.length && class387.field4468 < class387.field4472) {
			class387.field4476[++class387.field4468 - 1] = var0;
		} else if (30000 == var0.length && class387.field4477 < class387.field4464) {
			class387.field4475[++class387.field4477 - 1] = var0;
		} else {
			if (null != class387.field1433) {
				for (int var2 = 0; var2 < class387.field1777.length; ++var2) {
					if (class387.field1777[var2] == var0.length && class387.field1626[var2] < class387.field1433[var2].length) {
						class387.field1433[var2][class387.field1626[var2]++] = var0;
						return;
					}
				}
			}

		}
	}
}
