public class class375 extends RuntimeException {
	public class375(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	static final void method6952(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = class148.method3196(var0, var1, Client.field231) - var2;
			var0 -= Client.field257;
			var4 -= Client.field1867;
			var1 -= Client.field3391;
			int var5 = class219.field2512[Client.field2975];
			int var6 = class219.field2516[Client.field2975];
			int var7 = class219.field2512[Client.field1531];
			int var8 = class219.field2516[Client.field1531];
			int var9 = var8 * var0 + var7 * var1 >> 16;
			var1 = var1 * var8 - var7 * var0 >> 16;
			var0 = var9;
			var9 = var6 * var4 - var5 * var1 >> 16;
			var1 = var1 * var6 + var4 * var5 >> 16;
			if (var1 >= 50) {
				Client.field708 = Client.field767 / 2 + var0 * Client.field582 / var1;
				Client.field572 = Client.field770 / 2 + var9 * Client.field582 / var1;
			} else {
				Client.field708 = -1;
				Client.field572 = -1;
			}

		} else {
			Client.field708 = -1;
			Client.field572 = -1;
		}
	}
}
