public class class98 {
	int field1299;
	int field1300;
	int field1301;
	int field1303;

	class98(int var1, int var2, int var3, int var4) {
		this.field1303 = var1;
		this.field1300 = var2;
		this.field1301 = var3;
		this.field1299 = var4;
	}

	int method2580() {
		return this.field1303;
	}

	int method2578() {
		return this.field1300;
	}

	int method2579() {
		return this.field1301;
	}

	int method2582() {
		return this.field1299;
	}

	static int method2593(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}
}
