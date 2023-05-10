public class class296 {
	static int[] field3370;

	static {
		new Object();
		field3370 = new int[33];
		field3370[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3370[var1] = var0 - 1;
			var0 += var0;
		}

	}

	public static int method3155(int var0) {
		return field3370[var0];
	}

	public static int method290(int var0) {
		var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	public static int method332(int var0, int var1, int var2) {
		int var4 = method3155(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	public static int method3116(int var0, int var1, int var2) {
		int var4 = method3155(var2 - var1 + 1);
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	public static int method1988(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	public static int method5520(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var0 + var2;
	}

	public static long method2095(int var0) {
		if (var0 > 63) {
			throw new class375("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}
}
