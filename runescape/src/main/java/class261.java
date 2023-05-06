public final class class261 {
	final int[] field3017;

	class261() {
		this.field3017 = new int[4096];
	}

	class261(int[] var1) {
		this.field3017 = var1;
	}

	final int method5275(int var1, int var2) {
		return this.field3017[var2 * 64 + var1];
	}

	public static String method5272(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var9 = var0[var1];
			return null == var9 ? "null" : var9.toString();
		} else {
			int var4 = var1 + var2;
			int var5 = 0;

			for (int var6 = var1; var6 < var4; ++var6) {
				CharSequence var7 = var0[var6];
				if (null == var7) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}

			StringBuilder var10 = new StringBuilder(var5);

			for (int var11 = var1; var11 < var4; ++var11) {
				CharSequence var8 = var0[var11];
				if (null == var8) {
					var10.append("null");
				} else {
					var10.append(var8);
				}
			}

			return var10.toString();
		}
	}

	public static int method5276(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(var7 + var1);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var3[var7 + var4] = -128;
				} else if (var8 == 8218) {
					var3[var4 + var7] = -126;
				} else if (var8 == 402) {
					var3[var7 + var4] = -125;
				} else if (var8 == 8222) {
					var3[var4 + var7] = -124;
				} else if (var8 == 8230) {
					var3[var7 + var4] = -123;
				} else if (var8 == 8224) {
					var3[var7 + var4] = -122;
				} else if (var8 == 8225) {
					var3[var7 + var4] = -121;
				} else if (var8 == 710) {
					var3[var4 + var7] = -120;
				} else if (var8 == 8240) {
					var3[var7 + var4] = -119;
				} else if (var8 == 352) {
					var3[var7 + var4] = -118;
				} else if (var8 == 8249) {
					var3[var7 + var4] = -117;
				} else if (var8 == 338) {
					var3[var4 + var7] = -116;
				} else if (var8 == 381) {
					var3[var4 + var7] = -114;
				} else if (var8 == 8216) {
					var3[var4 + var7] = -111;
				} else if (var8 == 8217) {
					var3[var7 + var4] = -110;
				} else if (var8 == 8220) {
					var3[var7 + var4] = -109;
				} else if (var8 == 8221) {
					var3[var7 + var4] = -108;
				} else if (var8 == 8226) {
					var3[var4 + var7] = -107;
				} else if (var8 == 8211) {
					var3[var7 + var4] = -106;
				} else if (var8 == 8212) {
					var3[var7 + var4] = -105;
				} else if (var8 == 732) {
					var3[var7 + var4] = -104;
				} else if (var8 == 8482) {
					var3[var7 + var4] = -103;
				} else if (var8 == 353) {
					var3[var7 + var4] = -102;
				} else if (var8 == 8250) {
					var3[var4 + var7] = -101;
				} else if (var8 == 339) {
					var3[var4 + var7] = -100;
				} else if (var8 == 382) {
					var3[var7 + var4] = -98;
				} else if (var8 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var4 + var7] = 63;
				}
			} else {
				var3[var7 + var4] = (byte)var8;
			}
		}

		return var6;
	}
}
