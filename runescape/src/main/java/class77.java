public class class77 {
	class61[] field988;
	int field990;

	class77() {
		this.field988 = new class61[100];
	}

	class61 method2098(int var1, String var2, String var3, String var4) {
		class61 var6 = this.field988[99];

		for (int var7 = this.field990; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field988[var7] = this.field988[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new class61(var1, var2, var4, var3);
		} else {
			var6.method8051();
			var6.method8040();
			var6.method1171(var1, var2, var4, var3);
		}

		this.field988[0] = var6;
		if (this.field990 < 100) {
			++this.field990;
		}

		return var6;
	}

	class61 method2099(int var1) {
		return var1 >= 0 && var1 < this.field990 ? this.field988[var1] : null;
	}

	int method2108() {
		return this.field990;
	}

	static final class464 method2107(class489 var0, class464 var1) {
		int var3 = var0.method8658();
		int var4;
		if (null == var1) {
			var4 = class296.method1988(var3);
			var1 = new class464(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method8658() == 1;
			int var6 = var0.method8662();
			Object var7;
			if (var5) {
				var7 = new class445(var0.method8669());
			} else {
				var7 = new class448(var0.method8664());
			}

			var1.method8361((class449)var7, (long)var6);
		}

		return var1;
	}
}
