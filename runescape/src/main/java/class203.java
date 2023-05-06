public class class203 extends class444 {
	public static class280 field2271;
	public boolean field2275;
	public int field2272;
	public int field2274;
	public int field2277;
	public int field2278;
	public int field2279;
	public int field2281;
	public int field2282;
	public int field2283;
	public int field2285;

	static {
		field2271 = new class280(64);
	}

	public class203() {
		this.field2283 = 0;
		this.field2281 = -1;
		this.field2275 = true;
		this.field2272 = -1;
	}

	public void method3975() {
		if (this.field2272 != -1) {
			this.method3978(this.field2272);
			this.field2274 = this.field2277;
			this.field2285 = this.field2278;
			this.field2282 = this.field2279;
		}

		this.method3978(this.field2283);
	}

	public void method3976(class489 var1, int var2) {
		while (true) {
			int var4 = var1.method8658();
			if (var4 == 0) {
				return;
			}

			this.method3977(var1, var4, var2);
		}
	}

	void method3977(class489 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2283 = var1.method8662();
		} else if (var2 == 2) {
			this.field2281 = var1.method8658();
		} else if (var2 == 5) {
			this.field2275 = false;
		} else if (var2 == 7) {
			this.field2272 = var1.method8662();
		} else if (var2 == 8) {
		}

	}

	void method3978(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var11 + var9) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var11 == var7) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2277 = (int)(var13 * 256.0D);
		this.field2278 = (int)(var15 * 256.0D);
		this.field2279 = (int)(var17 * 256.0D);
		if (this.field2278 < 0) {
			this.field2278 = 0;
		} else if (this.field2278 > 255) {
			this.field2278 = 255;
		}

		if (this.field2279 < 0) {
			this.field2279 = 0;
		} else if (this.field2279 > 255) {
			this.field2279 = 255;
		}

	}

	public static void method3608(class344 var0) {
		class78.field2273 = var0;
	}

	static void method3974(class64 var0) {
		if (var0.method1717() != Client.field492) {
			Client.field492 = var0.method1717();
			boolean var2 = var0.method1717();
			if (class72.field1844 != var2) {
				class202.method7135();
				class72.field1844 = var2;
			}
		}

		if (Client.field489 != var0.field797) {
			class342 var4 = Client.field4788;
			int var3 = var0.field797;
			if ((var3 & 536870912) != 0) {
				class72.field123 = class297.method5550(var4, "logo_deadman_mode", "");
			} else if (0 != (var3 & 1073741824)) {
				class72.field123 = class297.method5550(var4, "logo_seasonal_mode", "");
			} else if ((var3 & 256) != 0) {
				class72.field123 = class297.method5550(var4, "logo_speedrunning", "");
			} else {
				class72.field123 = class297.method5550(var4, "logo", "");
			}
		}

		Client.field1420 = var0.field799;
		Client.field579 = var0.field802;
		Client.field489 = var0.field797;
		Client.field4569 = 0 == Client.field490 ? 43594 : var0.field802 + 40000;
		Client.field1566 = 0 == Client.field490 ? 443 : 50000 + var0.field802;
		Client.field1024 = Client.field4569;
	}
}
