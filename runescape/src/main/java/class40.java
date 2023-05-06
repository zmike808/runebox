public class class40 {
	class58[] field277;
	int field278;
	int field279;

	class40(class489 var1) {
		this.field277 = new class58[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method8658();
			if (var3 != 0) {
				--var1.field4989;
				this.field277[var2] = new class58();
				this.field277[var2].method1160(var1);
			}
		}

		this.field278 = var1.method8660();
		this.field279 = var1.method8660();
	}

	public class41 method775() {
		byte[] var1 = this.method777();
		return new class41(22050, var1, this.field278 * 22050 / 1000, this.field279 * 22050 / 1000);
	}

	public final int method776() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field277[var2] != null && this.field277[var2].field445 / 20 < var1) {
				var1 = this.field277[var2].field445 / 20;
			}
		}

		if (this.field278 < this.field279 && this.field278 / 20 < var1) {
			var1 = this.field278 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field277[var2] != null) {
					class58 var10000 = this.field277[var2];
					var10000.field445 -= var1 * 20;
				}
			}

			if (this.field278 < this.field279) {
				this.field278 -= var1 * 20;
				this.field279 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	final byte[] method777() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field277[var2] != null && this.field277[var2].field443 + this.field277[var2].field445 > var1) {
				var1 = this.field277[var2].field443 + this.field277[var2].field445;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field277[var4] != null) {
					int var5 = this.field277[var4].field443 * 22050 / 1000;
					int var6 = this.field277[var4].field445 * 22050 / 1000;
					int[] var7 = this.field277[var4].method1157(var5, this.field277[var4].field443);

					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if ((var9 + 128 & -256) != 0) {
							var9 = var9 >> 31 ^ 127;
						}

						var3[var8 + var6] = (byte)var9;
					}
				}
			}

			return var3;
		}
	}

	public static class40 method774(class344 var0, int var1, int var2) {
		byte[] var3 = var0.method6468(var1, var2);
		return var3 == null ? null : new class40(new class489(var3));
	}
}
