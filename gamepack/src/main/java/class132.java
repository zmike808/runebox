public class class132 {
	static int method3066(int var0, class75 var1, boolean var2) {
		int var4 = -1;
		class317 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class67.field843[--class67.field836];
			var5 = class166.method3349(var4);
		} else {
			var5 = var2 ? class67.field329 : class67.field6;
		}

		if (var0 == 1000) {
			class67.field836 -= 4;
			var5.field3579 = class67.field843[class67.field836];
			var5.field3580 = class67.field843[1 + class67.field836];
			var5.field3609 = class67.field843[2 + class67.field836];
			var5.field3576 = class67.field843[3 + class67.field836];
			Client.method3176(var5);
			Client.field466.method1349(var5);
			if (var4 != -1 && var5.field3598 == 0) {
				class242.method4836(Client.field2057[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1001) {
			class67.field836 -= 4;
			var5.field3581 = class67.field843[class67.field836];
			var5.field3658 = class67.field843[1 + class67.field836];
			var5.field3708 = class67.field843[2 + class67.field836];
			var5.field3578 = class67.field843[3 + class67.field836];
			Client.method3176(var5);
			Client.field466.method1349(var5);
			if (var4 != -1 && var5.field3598 == 0) {
				class242.method4836(Client.field2057[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var6 = class67.field843[--class67.field836] == 1;
			if (var6 != var5.field3590) {
				var5.field3590 = var6;
				Client.method3176(var5);
			}

			return 1;
		} else if (var0 == 1005) {
			var5.field3611 = class67.field843[--class67.field836] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field3718 = class67.field843[--class67.field836] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
