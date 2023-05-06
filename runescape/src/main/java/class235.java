public final class class235 {
	boolean field2787;
	int field2782;
	int field2783;
	int field2784;
	int field2785;
	int field2786;
	int field2788;

	class235(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.field2787 = true;
		this.field2784 = var1;
		this.field2783 = var2;
		this.field2782 = var3;
		this.field2785 = var4;
		this.field2786 = var5;
		this.field2788 = var6;
		this.field2787 = var7;
	}

	public static String method4753(class489 var0) {
		String var2;
		try {
			int var3 = var0.method8827();
			if (var3 > 32767) {
				var3 = 32767;
			}

			byte[] var4 = new byte[var3];
			var0.field4989 += class320.field3726.method6290(var0.field4991, var0.field4989, var4, 0, var3);
			String var5 = class489.method8902(var4, 0, var3);
			var2 = var5;
		} catch (Exception var6) {
			var2 = "Cabbage";
		}

		return var2;
	}

	static int method4752(int var0, class75 var1, boolean var2) {
		class317 var4;
		if (var0 == 2700) {
			var4 = class166.method3349(class67.field843[--class67.field836]);
			class67.field843[++class67.field836 - 1] = var4.field3703;
			return 1;
		} else if (var0 == 2701) {
			var4 = class166.method3349(class67.field843[--class67.field836]);
			if (var4.field3703 != -1) {
				class67.field843[++class67.field836 - 1] = var4.field3637;
			} else {
				class67.field843[++class67.field836 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var6 = class67.field843[--class67.field836];
			class83 var5 = (class83)Client.field657.method8381((long)var6);
			if (null != var5) {
				class67.field843[++class67.field836 - 1] = 1;
			} else {
				class67.field843[++class67.field836 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2706) {
			class67.field843[++class67.field836 - 1] = Client.field656;
			return 1;
		} else if (var0 == 2707) {
			var4 = class166.method3349(class67.field843[--class67.field836]);
			class67.field843[++class67.field836 - 1] = var4.method6142() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = class166.method3349(class67.field843[--class67.field836]);
			return class67.method7734(var4);
		} else if (var0 == 2709) {
			var4 = class166.method3349(class67.field843[--class67.field836]);
			return class67.method23(var4);
		} else {
			return 2;
		}
	}
}
