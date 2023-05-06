public final class class294 {
	static long field3363;
	static long field3364;

	public static final synchronized long method2575() {
		long var1 = System.currentTimeMillis();
		if (var1 < field3363) {
			field3364 += field3363 - var1;
		}

		field3363 = var1;
		return var1 + field3364;
	}
}
