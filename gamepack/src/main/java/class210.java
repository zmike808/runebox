import java.net.URL;

public abstract class class210 {
	public int field2383;
	public int field2384;
	public int field2385;
	public int field2387;

	protected class210() {
	}

	protected abstract boolean method4127(int var1, int var2, int var3, class209 var4);

	static boolean method4134(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class32.field176.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var5 = 0; var5 < var0.length(); ++var5) {
						if (var11.indexOf(var0.charAt(var5)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var4 = class27.method395(class32.field175, var2, new Object[]{(new URL(class32.field175.getCodeBase(), var0)).toString()});
				return var4 != null;
			} catch (Throwable var7) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class32.field175.getAppletContext().showDocument(new URL(class32.field175.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class27.method394(class32.field175, "loggedout");
			} catch (Throwable var10) {
			}

			try {
				class32.field175.getAppletContext().showDocument(new URL(class32.field175.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var9) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static byte[] method4133(CharSequence var0) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
				if (var5 == 8364) {
					var3[var4] = -128;
				} else if (var5 == 8218) {
					var3[var4] = -126;
				} else if (var5 == 402) {
					var3[var4] = -125;
				} else if (var5 == 8222) {
					var3[var4] = -124;
				} else if (var5 == 8230) {
					var3[var4] = -123;
				} else if (var5 == 8224) {
					var3[var4] = -122;
				} else if (var5 == 8225) {
					var3[var4] = -121;
				} else if (var5 == 710) {
					var3[var4] = -120;
				} else if (var5 == 8240) {
					var3[var4] = -119;
				} else if (var5 == 352) {
					var3[var4] = -118;
				} else if (var5 == 8249) {
					var3[var4] = -117;
				} else if (var5 == 338) {
					var3[var4] = -116;
				} else if (var5 == 381) {
					var3[var4] = -114;
				} else if (var5 == 8216) {
					var3[var4] = -111;
				} else if (var5 == 8217) {
					var3[var4] = -110;
				} else if (var5 == 8220) {
					var3[var4] = -109;
				} else if (var5 == 8221) {
					var3[var4] = -108;
				} else if (var5 == 8226) {
					var3[var4] = -107;
				} else if (var5 == 8211) {
					var3[var4] = -106;
				} else if (var5 == 8212) {
					var3[var4] = -105;
				} else if (var5 == 732) {
					var3[var4] = -104;
				} else if (var5 == 8482) {
					var3[var4] = -103;
				} else if (var5 == 353) {
					var3[var4] = -102;
				} else if (var5 == 8250) {
					var3[var4] = -101;
				} else if (var5 == 339) {
					var3[var4] = -100;
				} else if (var5 == 382) {
					var3[var4] = -98;
				} else if (var5 == 376) {
					var3[var4] = -97;
				} else {
					var3[var4] = 63;
				}
			} else {
				var3[var4] = (byte)var5;
			}
		}

		return var3;
	}

	static final void method4128(boolean var0) {
		for (int var2 = 0; var2 < Client.field737; ++var2) {
			class96 var3 = Client.field546[Client.field548[var2]];
			if (var3 != null && var3.method2315() && var0 == var3.field1277.field2028 && var3.field1277.method3643()) {
				int var4 = var3.field1171 >> 7;
				int var5 = var3.field1138 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (1 == var3.field1141 && 64 == (var3.field1171 & 127) && 64 == (var3.field1138 & 127)) {
						if (Client.field601 == Client.field535[var4][var5]) {
							continue;
						}

						Client.field535[var4][var5] = Client.field601;
					}

					long var6 = class233.method4549(0, 0, 1, !var3.field1277.field2048, Client.field548[var2]);
					var3.field1159 = Client.field602;
					Client.field180.method4379(Client.field231, var3.field1171, var3.field1138, class148.method3196(var3.field1141 * 64 - 64 + var3.field1171, var3.field1141 * 64 - 64 + var3.field1138, Client.field231), 60 + (var3.field1141 * 64 - 64), var3, var3.field1144, var6, var3.field1140);
				}
			}
		}

	}
}
