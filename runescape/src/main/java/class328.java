public class class328 {
	public static void method6330(class344 var0) {
		class484.field4969 = var0;
	}

	static int method6331(int var0, class75 var1, boolean var2) {
		if (var0 == 6200) {
			class67.field836 -= 2;
			Client.field759 = (short)class234.method4751(class67.field843[class67.field836]);
			if (Client.field759 <= 0) {
				Client.field759 = 256;
			}

			Client.field760 = (short)class234.method4751(class67.field843[class67.field836 + 1]);
			if (Client.field760 <= 0) {
				Client.field760 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			class67.field836 -= 2;
			Client.field775 = (short)class67.field843[class67.field836];
			if (Client.field775 <= 0) {
				Client.field775 = 256;
			}

			Client.field762 = (short)class67.field843[class67.field836 + 1];
			if (Client.field762 <= 0) {
				Client.field762 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			class67.field836 -= 4;
			Client.field573 = (short)class67.field843[class67.field836];
			if (Client.field573 <= 0) {
				Client.field573 = 1;
			}

			Client.field764 = (short)class67.field843[1 + class67.field836];
			if (Client.field764 <= 0) {
				Client.field764 = 32767;
			} else if (Client.field764 < Client.field573) {
				Client.field764 = Client.field573;
			}

			Client.field621 = (short)class67.field843[2 + class67.field836];
			if (Client.field621 <= 0) {
				Client.field621 = 1;
			}

			Client.field695 = (short)class67.field843[3 + class67.field836];
			if (Client.field695 <= 0) {
				Client.field695 = 32767;
			} else if (Client.field695 < Client.field621) {
				Client.field695 = Client.field621;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.field667 != null) {
				class37.method719(0, 0, Client.field667.field3572, Client.field667.field3586, false);
				class67.field843[++class67.field836 - 1] = Client.field767;
				class67.field843[++class67.field836 - 1] = Client.field770;
			} else {
				class67.field843[++class67.field836 - 1] = -1;
				class67.field843[++class67.field836 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			class67.field843[++class67.field836 - 1] = Client.field775;
			class67.field843[++class67.field836 - 1] = Client.field762;
			return 1;
		} else if (var0 == 6205) {
			class67.field843[++class67.field836 - 1] = class67.method879(Client.field759);
			class67.field843[++class67.field836 - 1] = class67.method879(Client.field760);
			return 1;
		} else if (var0 == 6220) {
			class67.field843[++class67.field836 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			class67.field843[++class67.field836 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			class67.field843[++class67.field836 - 1] = class35.field211;
			return 1;
		} else if (var0 == 6223) {
			class67.field843[++class67.field836 - 1] = class35.field3026;
			return 1;
		} else {
			return 2;
		}
	}
}
