public class class482 extends class444 {
	static class280 field4959;
	static class344 field4962;
	public int[][] field4960;
	public Object[][] field4961;

	static {
		field4959 = new class280(64);
	}

	class482() {
	}

	void method8531(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method8532(var1, var3);
		}
	}

	void method8532(class489 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method8658();
			if (null == this.field4960) {
				this.field4960 = new int[var4][];
			}

			for (int var5 = var1.method8658(); var5 != 255; var5 = var1.method8658()) {
				int var6 = var5 & 127;
				boolean var7 = 0 != (var5 & 128);
				int[] var8 = new int[var1.method8658()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method8827();
				}

				this.field4960[var6] = var8;
				if (var7) {
					if (null == this.field4961) {
						this.field4961 = new Object[this.field4960.length][];
					}

					this.field4961[var6] = class485.method6992(var1, var8);
				}
			}
		}

	}

	void method8536() {
	}

	public static class482 method6343(int var0) {
		class482 var2 = (class482)field4959.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field4962.method6468(39, var0);
			var2 = new class482();
			if (var3 != null) {
				var2.method8531(new class489(var3));
			}

			var2.method8536();
			field4959.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static void method7284() {
		field4959.method5467();
	}
}
