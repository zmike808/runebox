public class class440 {
	static final int[] field4719;
	static final int[] field4720;

	static {
		field4719 = new int[16384];
		field4720 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4719[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4720[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	public static float method5751(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
	}

	public static int method2827(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	public static int method2602(int var0) {
		return field4719[var0 & 16383];
	}
}
