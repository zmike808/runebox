import java.util.concurrent.ThreadFactory;

final class class131 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	static int method3064(int var0, class75 var1, boolean var2) {
		if (var0 == 3300) {
			class67.field843[++class67.field836 - 1] = Client.field602;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				class67.field836 -= 2;
				var4 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class67.field843[++class67.field836 - 1] = class81.method2301(var4, var5);
				return 1;
			} else if (var0 == 3302) {
				class67.field836 -= 2;
				var4 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				class67.field843[++class67.field836 - 1] = class81.method7979(var4, var5);
				return 1;
			} else if (var0 == 3303) {
				class67.field836 -= 2;
				var4 = class67.field843[class67.field836];
				var5 = class67.field843[class67.field836 + 1];
				class67.field843[++class67.field836 - 1] = class81.method7731(var4, var5);
				return 1;
			} else if (var0 == 3304) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = class181.method1212(var4).field1905;
				return 1;
			} else if (var0 == 3305) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = Client.field743[var4];
				return 1;
			} else if (var0 == 3306) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = Client.field629[var4];
				return 1;
			} else if (var0 == 3307) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = Client.field630[var4];
				return 1;
			} else {
				int var6;
				if (var0 == 3308) {
					var4 = Client.field231;
					var5 = Client.field2850 + (Client.field3454.field1171 >> 7);
					var6 = Client.field2841 + (Client.field3454.field1138 >> 7);
					class67.field843[++class67.field836 - 1] = var6 + (var5 << 14) + (var4 << 28);
					return 1;
				} else if (var0 == 3309) {
					var4 = class67.field843[--class67.field836];
					class67.field843[++class67.field836 - 1] = var4 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var4 = class67.field843[--class67.field836];
					class67.field843[++class67.field836 - 1] = var4 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var4 = class67.field843[--class67.field836];
					class67.field843[++class67.field836 - 1] = var4 & 16383;
					return 1;
				} else if (var0 == 3312) {
					class67.field843[++class67.field836 - 1] = Client.field492 ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					class67.field836 -= 2;
					var4 = 32768 + class67.field843[class67.field836];
					var5 = class67.field843[class67.field836 + 1];
					class67.field843[++class67.field836 - 1] = class81.method2301(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					class67.field836 -= 2;
					var4 = 32768 + class67.field843[class67.field836];
					var5 = class67.field843[1 + class67.field836];
					class67.field843[++class67.field836 - 1] = class81.method7979(var4, var5);
					return 1;
				} else if (var0 == 3315) {
					class67.field836 -= 2;
					var4 = class67.field843[class67.field836] + 32768;
					var5 = class67.field843[1 + class67.field836];
					class67.field843[++class67.field836 - 1] = class81.method7731(var4, var5);
					return 1;
				} else if (var0 == 3316) {
					if (Client.field682 >= 2) {
						class67.field843[++class67.field836 - 1] = Client.field682;
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					class67.field843[++class67.field836 - 1] = Client.field545;
					return 1;
				} else if (var0 == 3318) {
					class67.field843[++class67.field836 - 1] = Client.field579;
					return 1;
				} else if (var0 == 3321) {
					class67.field843[++class67.field836 - 1] = Client.field625 / 100;
					return 1;
				} else if (var0 == 3322) {
					class67.field843[++class67.field836 - 1] = Client.field683;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field666) {
						class67.field843[++class67.field836 - 1] = 1;
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					class67.field843[++class67.field836 - 1] = Client.field489;
					return 1;
				} else if (var0 == 3325) {
					class67.field836 -= 4;
					var4 = class67.field843[class67.field836];
					var5 = class67.field843[class67.field836 + 1];
					var6 = class67.field843[2 + class67.field836];
					int var7 = class67.field843[3 + class67.field836];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					class67.field843[++class67.field836 - 1] = var4;
					return 1;
				} else if (var0 == 3326) {
					class67.field843[++class67.field836 - 1] = Client.field503;
					return 1;
				} else if (var0 == 3327) {
					class67.field843[++class67.field836 - 1] = Client.field504;
					return 1;
				} else if (var0 == 3331) {
					class67.field843[++class67.field836 - 1] = Client.field625;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
