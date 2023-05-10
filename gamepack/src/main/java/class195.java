public class class195 extends class444 {
	public static class280 field2094;
	int field2090;
	public int field2091;
	public int field2093;
	public int field2095;
	public int field2096;

	static {
		field2094 = new class280(64);
	}

	public class195() {
		this.field2090 = 0;
	}

	public void method3722() {
		this.method3725(this.field2090);
	}

	public void method3732(class489 var1, int var2) {
		while (true) {
			int var4 = var1.method8658();
			if (var4 == 0) {
				return;
			}

			this.method3724(var1, var4, var2);
		}
	}

	void method3724(class489 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2090 = var1.method8662();
		}

	}

	void method3725(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var11 + var9) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var7 == var11) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2093 = (int)(var15 * 256.0D);
		this.field2096 = (int)(var17 * 256.0D);
		if (this.field2093 < 0) {
			this.field2093 = 0;
		} else if (this.field2093 > 255) {
			this.field2093 = 255;
		}

		if (this.field2096 < 0) {
			this.field2096 = 0;
		} else if (this.field2096 > 255) {
			this.field2096 = 255;
		}

		if (var17 > 0.5D) {
			this.field2095 = (int)((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field2095 = (int)(512.0D * var17 * var15);
		}

		if (this.field2095 < 1) {
			this.field2095 = 1;
		}

		this.field2091 = (int)((double)this.field2095 * var13);
	}

	public static String method3721(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class374.field4386[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	public static void method5528() {
		field2094.method5467();
	}
}
