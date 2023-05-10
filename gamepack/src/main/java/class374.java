public final class class374 {
	static long[] field4385;
	static final char[] field4386;

	static {
		field4386 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4385 = new long[12];

		for (int var0 = 0; var0 < field4385.length; ++var0) {
			field4385[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	static long method3455(CharSequence var0) {
		long var2 = 0L;
		int var4 = var0.length();

		for (int var5 = 0; var5 < var4; ++var5) {
			var2 *= 37L;
			char var6 = var0.charAt(var5);
			if (var6 >= 'A' && var6 <= 'Z') {
				var2 += (long)(var6 + 1 - 65);
			} else if (var6 >= 'a' && var6 <= 'z') {
				var2 += (long)(var6 + 1 - 97);
			} else if (var6 >= '0' && var6 <= '9') {
				var2 += (long)(var6 + 27 - 48);
			}

			if (var2 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var2 % 37L && 0L != var2) {
			var2 /= 37L;
		}

		return var2;
	}

	static void method6951(int var0, int var1, int var2, int var3, byte var4) {
		class81 var5 = (class81)class81.field1022.method8381((long)var0);
		if (var5 == null) {
			if (var4 <= -1) {
				throw new IllegalStateException();
			}

			var5 = new class81();
			class81.field1022.method8382(var5, (long)var0);
		}

		if (var5.field1023.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field1023.length; ++var8) {
				if (var4 <= -1) {
					throw new IllegalStateException();
				}

				var6[var8] = var5.field1023[var8];
				var7[var8] = var5.field1027[var8];
			}

			for (var8 = var5.field1023.length; var8 < var1; ++var8) {
				if (var4 <= -1) {
					throw new IllegalStateException();
				}

				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field1023 = var6;
			var5.field1027 = var7;
		}

		var5.field1023[var1] = var2;
		var5.field1027[var1] = var3;
	}

	public static String method2074(CharSequence var0) {
		String var2 = class195.method3721(method3455(var0));
		if (null == var2) {
			var2 = "";
		}

		return var2;
	}
}
