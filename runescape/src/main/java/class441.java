public class class441 {
	static final int[] field4722;
	static final int[] field4728;

	static {
		field4722 = new int[2048];
		field4728 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4722[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4728[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
