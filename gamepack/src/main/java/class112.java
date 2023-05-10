public class class112 extends class409 {
	final boolean field1421;

	public class112(boolean var1) {
		this.field1421 = var1;
	}

	int method2824(class412 var1, class412 var2) {
		if (Client.field579 == var1.field4600) {
			if (Client.field579 != var2.field4600) {
				return this.field1421 ? -1 : 1;
			}
		} else if (var2.field4600 == Client.field579) {
			return this.field1421 ? 1 : -1;
		}

		return this.method7598(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method2824((class412)var1, (class412)var2);
	}

	static final void method2833() {
		if (Client.field231 != Client.field730) {
			Client.field730 = Client.field231;
			int var1 = Client.field231;
			int[] var2 = Client.field1396.field5089;
			int var3 = var2.length;

			int var4;
			for (var4 = 0; var4 < var3; ++var4) {
				var2[var4] = 0;
			}

			int var5;
			int var6;
			for (var4 = 1; var4 < 103; ++var4) {
				var5 = 2048 * (103 - var4) + 24628;

				for (var6 = 1; var6 < 103; ++var6) {
					if ((class78.field1006[var1][var6][var4] & 24) == 0) {
						Client.field180.method4481(var2, var5, 512, var1, var6, var4);
					}

					if (var1 < 3 && (class78.field1006[var1 + 1][var6][var4] & 8) != 0) {
						Client.field180.method4481(var2, var5, 512, var1 + 1, var6, var4);
					}

					var5 += 4;
				}
			}

			var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			Client.field1396.method9097();

			int var7;
			for (var6 = 1; var6 < 103; ++var6) {
				for (var7 = 1; var7 < 103; ++var7) {
					if (0 == (class78.field1006[var1][var7][var6] & 24)) {
						class150.method3205(var1, var7, var6, var4, var5);
					}

					if (var1 < 3 && (class78.field1006[var1 + 1][var7][var6] & 8) != 0) {
						class150.method3205(var1 + 1, var7, var6, var4, var5);
					}
				}
			}

			Client.field731 = 0;

			for (var6 = 0; var6 < 104; ++var6) {
				for (var7 = 0; var7 < 104; ++var7) {
					long var8 = Client.field180.method4397(Client.field231, var6, var7);
					if (var8 != 0L) {
						int var10 = class233.method2194(var8);
						int var11 = class145.method3177(var10).field2182;
						if (var11 >= 0 && class355.method6671(var11).field1926) {
							Client.field734[Client.field731] = class355.method6671(var11).method3530(false);
							Client.field620[Client.field731] = var6;
							Client.field733[Client.field731] = var7;
							++Client.field731;
						}
					}
				}
			}

			class35.field2381.method9050();
		}

	}
}
