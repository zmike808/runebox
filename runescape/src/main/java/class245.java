public class class245 {
	public static String method4852(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class374.field4386[(int)(var6 - var0 * 37L)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	static int method4850(int var0, class75 var1, boolean var2) {
		class317 var4 = var2 ? class67.field329 : class67.field6;
		if (var0 == 1500) {
			class67.field843[++class67.field836 - 1] = var4.field3661;
			return 1;
		} else if (var0 == 1501) {
			class67.field843[++class67.field836 - 1] = var4.field3715;
			return 1;
		} else if (var0 == 1502) {
			class67.field843[++class67.field836 - 1] = var4.field3572;
			return 1;
		} else if (var0 == 1503) {
			class67.field843[++class67.field836 - 1] = var4.field3586;
			return 1;
		} else if (var0 == 1504) {
			class67.field843[++class67.field836 - 1] = var4.field3590 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			class67.field843[++class67.field836 - 1] = var4.field3589;
			return 1;
		} else {
			return 2;
		}
	}
}
