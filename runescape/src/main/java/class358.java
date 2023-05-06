import java.util.HashMap;

public class class358 {
	static {
		new HashMap();
	}

	static final void method6676(class83 var0, boolean var1) {
		int var3 = var0.field1037;
		int var4 = (int)var0.field4745;
		var0.method8051();
		if (var1 && var3 != -1 && Client.field3037[var3]) {
			class317.field1430.method6461(var3);
			if (Client.field2057[var3] != null) {
				for (int var5 = 0; var5 < Client.field2057[var3].length; ++var5) {
					if (Client.field2057[var3][var5] != null) {
						Client.field2057[var3][var5] = null;
					}
				}

				Client.field2057[var3] = null;
				Client.field3037[var3] = false;
			}
		}

		for (class448 var6 = (class448)Client.field703.method8387(); var6 != null; var6 = (class448)Client.field703.method8384()) {
			if ((var6.field4745 >> 48 & 65535L) == (long)var3) {
				var6.method8051();
			}
		}

		class317 var7 = class166.method3349(var4);
		if (null != var7) {
			Client.method3176(var7);
		}

		if (Client.field656 != -1) {
			class128.method3048(Client.field656, 1);
		}

	}
}
