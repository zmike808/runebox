public class class371 {
	static char[] field4376;
	static char[] field4377;
	static char[] field4378;
	static int[] field4379;

	static {
		field4378 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4378[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4378[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4378[var0] = (char)(var0 + 48 - 52);
		}

		field4378[62] = '+';
		field4378[63] = '/';
		field4376 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4376[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4376[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4376[var0] = (char)(var0 + 48 - 52);
		}

		field4376[62] = '*';
		field4376[63] = '-';
		field4377 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4377[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4377[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4377[var0] = (char)(var0 + 48 - 52);
		}

		field4377[62] = '-';
		field4377[63] = '_';
		field4379 = new int[128];

		for (var0 = 0; var0 < field4379.length; ++var0) {
			field4379[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4379[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4379[var0] = 26 + (var0 - 97);
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4379[var0] = 52 + (var0 - 48);
		}

		int[] var2 = field4379;
		field4379[43] = 62;
		var2[42] = 62;
		int[] var1 = field4379;
		field4379[47] = 63;
		var1[45] = 63;
	}

	public static String method5231(byte[] var0) {
		return method3179(var0, 0, var0.length);
	}

	static String method3179(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(field4378[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(field4378[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(field4378[(var7 & 15) << 2 | var8 >>> 6]).append(field4378[var8 & 63]);
				} else {
					var4.append(field4378[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(field4378[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}

	static final void method6891(class317 var0, int var1, int var2) {
		if (Client.field511 == null && !Client.field669) {
			if (var0 != null) {
				class317 var6 = var0;
				int var7 = class318.method3810(class26.method353(var0));
				class317 var5;
				int var8;
				if (var7 == 0) {
					var5 = null;
				} else {
					var8 = 0;

					while (true) {
						if (var8 >= var7) {
							var5 = var6;
							break;
						}

						var6 = class166.method3349(var6.field3589);
						if (var6 == null) {
							var5 = null;
							break;
						}

						++var8;
					}
				}

				class317 var9 = var5;
				if (null == var5) {
					var9 = var0.field3652;
				}

				if (var9 != null) {
					Client.field511 = var0;
					var6 = var0;
					var7 = class318.method3810(class26.method353(var0));
					if (var7 == 0) {
						var5 = null;
					} else {
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								var5 = var6;
								break;
							}

							var6 = class166.method3349(var6.field3589);
							if (var6 == null) {
								var5 = null;
								break;
							}

							++var8;
						}
					}

					var9 = var5;
					if (var5 == null) {
						var9 = var0.field3652;
					}

					Client.field539 = var9;
					Client.field670 = var1;
					Client.field671 = var2;
					Client.field1289 = 0;
					Client.field724 = false;
					int var10 = Client.method2086();
					if (var10 != -1) {
						Client.method5493(var10);
					}

					return;
				}
			}

		}
	}
}
