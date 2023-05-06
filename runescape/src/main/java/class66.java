public final class class66 extends class449 {
	static class363 field828;
	class201 field830;
	class48 field824;
	class48 field829;
	int field816;
	int field817;
	int field818;
	int field820;
	int field821;
	int field822;
	int field823;
	int field825;
	int field826;
	int field831;
	int[] field827;

	static {
		field828 = new class363();
	}

	class66() {
	}

	void method1835() {
		int var2 = this.field822;
		class201 var3 = this.field830.method3857();
		if (null != var3) {
			this.field822 = var3.field2201;
			this.field816 = var3.field2202 * 128;
			this.field825 = var3.field2205;
			this.field826 = var3.field2204;
			this.field827 = var3.field2168;
		} else {
			this.field822 = -1;
			this.field816 = 0;
			this.field825 = 0;
			this.field826 = 0;
			this.field827 = null;
		}

		if (var2 != this.field822 && this.field824 != null) {
			Client.field1574.method769(this.field824);
			this.field824 = null;
		}

	}

	static void method3796() {
		for (class66 var1 = (class66)field828.method6716(); null != var1; var1 = (class66)field828.method6725()) {
			if (var1.field824 != null) {
				Client.field1574.method769(var1.field824);
				var1.field824 = null;
			}

			if (null != var1.field829) {
				Client.field1574.method769(var1.field829);
				var1.field829 = null;
			}
		}

		field828.method6710();
	}

	static void method685(int var0, int var1, int var2, class201 var3, int var4) {
		class66 var6 = new class66();
		var6.field817 = var0;
		var6.field818 = var1 * 128;
		var6.field831 = var2 * 128;
		int var7 = var3.field2172;
		int var8 = var3.field2173;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2173;
			var8 = var3.field2172;
		}

		var6.field820 = (var1 + var7) * 128;
		var6.field821 = 128 * (var2 + var8);
		var6.field822 = var3.field2201;
		var6.field816 = var3.field2202 * 128;
		var6.field825 = var3.field2205;
		var6.field826 = var3.field2204;
		var6.field827 = var3.field2168;
		if (var3.field2198 != null) {
			var6.field830 = var3;
			var6.method1835();
		}

		field828.method6711(var6);
		if (var6.field827 != null) {
			var6.field823 = var6.field825 + (int)(Math.random() * (double)(var6.field826 - var6.field825));
		}

	}
}
