public class class45 implements Runnable {
	volatile class43[] field332;

	class45() {
		this.field332 = new class43[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class43 var2 = this.field332[var1];
				if (null != var2) {
					var2.method828();
				}
			}
		} catch (Exception var3) {
			class388.method7339((String)null, var3);
		}

	}

	public static boolean method882(int var0) {
		if (Client.field3037[var0]) {
			return true;
		} else if (!class317.field1430.method6510(var0)) {
			return false;
		} else {
			int var2 = class317.field1430.method6458(var0);
			if (var2 == 0) {
				Client.field3037[var0] = true;
				return true;
			} else {
				if (Client.field2057[var0] == null) {
					Client.field2057[var0] = new class317[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) {
					if (Client.field2057[var0][var3] == null) {
						byte[] var4 = class317.field1430.method6468(var0, var3);
						if (var4 != null) {
							Client.field2057[var0][var3] = new class317();
							Client.field2057[var0][var3].field3570 = var3 + (var0 << 16);
							if (var4[0] == -1) {
								Client.field2057[var0][var3].method6122(new class489(var4));
							} else {
								Client.field2057[var0][var3].method6130(new class489(var4));
							}
						}
					}
				}

				Client.field3037[var0] = true;
				return true;
			}
		}
	}
}
