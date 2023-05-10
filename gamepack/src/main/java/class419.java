public class class419 {
	static final class419 field4636;
	final int field4635;

	static {
		field4636 = new class419(3);
	}

	class419(int var1) {
		this.field4635 = var1;
	}

	static int method7782(int var0, class75 var1, boolean var2) {
		class317 var4 = var2 ? class67.field329 : class67.field6;
		if (var0 == 1700) {
			class67.field843[++class67.field836 - 1] = var4.field3703;
			return 1;
		} else if (var0 == 1701) {
			if (-1 != var4.field3703) {
				class67.field843[++class67.field836 - 1] = var4.field3637;
			} else {
				class67.field843[++class67.field836 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			class67.field843[++class67.field836 - 1] = var4.field3571;
			return 1;
		} else if (var0 == 1707) {
			class67.field843[++class67.field836 - 1] = var4.method6142() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class67.method7734(var4);
		} else {
			return var0 == 1709 ? class67.method23(var4) : 2;
		}
	}
}
