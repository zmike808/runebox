public final class class68 extends class225 {
	boolean field858;
	class204 field861;
	int field855;
	int field856;
	int field857;
	int field859;
	int field860;
	int field862;
	int field863;
	int field864;

	class68(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field864 = 0;
		this.field855 = 0;
		this.field858 = false;
		this.field863 = var1;
		this.field857 = var2;
		this.field862 = var3;
		this.field859 = var4;
		this.field860 = var5;
		this.field856 = var7 + var6;
		int var8 = class194.method2180(this.field863).field2079;
		if (var8 != -1) {
			this.field858 = false;
			this.field861 = class81.method2189(var8, (byte)52);
		} else {
			this.field858 = true;
		}

	}

	final void method1964(int var1) {
		if (!this.field858) {
			this.field855 += var1;
			if (!this.field861.method4004()) {
				while (this.field855 > this.field861.field2304[this.field864]) {
					this.field855 -= this.field861.field2304[this.field864];
					++this.field864;
					if (this.field864 >= this.field861.field2300.length) {
						this.field858 = true;
						break;
					}
				}
			} else {
				this.field864 += var1;
				if (this.field864 >= this.field861.method4005()) {
					this.field858 = true;
				}
			}

		}
	}

	protected final class232 method4541() {
		class194 var2 = class194.method2180(this.field863);
		class232 var3;
		if (!this.field858) {
			var3 = var2.method3704(this.field864);
		} else {
			var3 = var2.method3704(-1);
		}

		return var3 == null ? null : var3;
	}

	static final void method1970(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (Client.field2975 < var0) {
			Client.field2975 += Client.field1938 * (var0 - Client.field2975) / 1000 + Client.field4214;
			if (Client.field2975 > var0) {
				Client.field2975 = var0;
			}
		} else if (Client.field2975 > var0) {
			Client.field2975 -= Client.field1938 * (Client.field2975 - var0) / 1000 + Client.field4214;
			if (Client.field2975 < var0) {
				Client.field2975 = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - Client.field1531;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			Client.field1531 += var3 * Client.field1938 / 1000 + Client.field4214;
			Client.field1531 &= 2047;
		} else if (var3 < 0) {
			Client.field1531 -= Client.field4214 + -var3 * Client.field1938 / 1000;
			Client.field1531 &= 2047;
		}

		int var4 = var1 - Client.field1531;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			Client.field1531 = var1;
		}

	}
}
