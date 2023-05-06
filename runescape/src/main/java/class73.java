public final class class73 extends class225 {
	boolean field942;
	class204 field947;
	double field932;
	double field943;
	double field944;
	double field945;
	double field946;
	double field948;
	double field950;
	double field953;
	int field931;
	int field933;
	int field934;
	int field935;
	int field936;
	int field937;
	int field938;
	int field939;
	int field940;
	int field941;
	int field949;
	int field951;
	int field952;
	int field954;
	int field955;

	class73(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field942 = false;
		this.field954 = 0;
		this.field955 = 0;
		this.field940 = var1;
		this.field931 = var2;
		this.field933 = var3;
		this.field934 = var4;
		this.field935 = var5;
		this.field937 = var6;
		this.field938 = var7;
		this.field939 = var8;
		this.field949 = var9;
		this.field941 = var10;
		this.field936 = var11;
		this.field942 = false;
		int var12 = class194.method2180(this.field940).field2079;
		if (var12 != -1) {
			this.field947 = class81.method2189(var12, (byte)109);
		} else {
			this.field947 = null;
		}

	}

	final void method2052(int var1, int var2, int var3, int var4) {
		double var6;
		if (!this.field942) {
			var6 = (double)(var1 - this.field933);
			double var8 = (double)(var2 - this.field934);
			double var10 = Math.sqrt(var8 * var8 + var6 * var6);
			this.field943 = (double)this.field933 + (double)this.field949 * var6 / var10;
			this.field944 = (double)this.field949 * var8 / var10 + (double)this.field934;
			this.field945 = (double)this.field935;
		}

		var6 = (double)(1 + this.field938 - var4);
		this.field946 = ((double)var1 - this.field943) / var6;
		this.field953 = ((double)var2 - this.field944) / var6;
		this.field948 = Math.sqrt(this.field953 * this.field953 + this.field946 * this.field946);
		if (!this.field942) {
			this.field932 = -this.field948 * Math.tan(0.02454369D * (double)this.field939);
		}

		this.field950 = 2.0D * ((double)var3 - this.field945 - this.field932 * var6) / (var6 * var6);
	}

	final void method2049(int var1) {
		this.field942 = true;
		this.field943 += this.field946 * (double)var1;
		this.field944 += this.field953 * (double)var1;
		this.field945 += this.field932 * (double)var1 + (double)var1 * this.field950 * 0.5D * (double)var1;
		this.field932 += this.field950 * (double)var1;
		this.field951 = (int)(Math.atan2(this.field946, this.field953) * 325.949D) + 1024 & 2047;
		this.field952 = (int)(Math.atan2(this.field932, this.field948) * 325.949D) & 2047;
		if (null != this.field947) {
			if (!this.field947.method4004()) {
				this.field955 += var1;

				while (true) {
					do {
						do {
							if (this.field955 <= this.field947.field2304[this.field954]) {
								return;
							}

							this.field955 -= this.field947.field2304[this.field954];
							++this.field954;
						} while(this.field954 < this.field947.field2300.length);

						this.field954 -= this.field947.field2301;
					} while(this.field954 >= 0 && this.field954 < this.field947.field2300.length);

					this.field954 = 0;
				}
			} else {
				this.field954 += var1;
				int var3 = this.field947.method4005();
				if (this.field954 >= var3) {
					this.field954 = var3 - this.field947.field2301;
				}
			}
		}

	}

	protected final class232 method4541() {
		class194 var2 = class194.method2180(this.field940);
		class232 var3 = var2.method3704(this.field954);
		if (var3 == null) {
			return null;
		} else {
			var3.method4594(this.field952);
			return var3;
		}
	}

	public static class180 method2060(int var0, class489 var1) {
		int var3 = var1.method8658();
		boolean var4 = 0 != (var3 & 1);
		boolean var5 = (var3 & 2) != 0;
		class180 var6 = new class180(var0);
		int var7;
		int[] var8;
		boolean var9;
		int var10;
		short var11;
		if (var4) {
			var7 = var1.method8658();
			var8 = new int[]{var7 & 15, var7 >> 4 & 15};
			var9 = var6.field1900 != null && var8.length == var6.field1900.length;

			for (var10 = 0; var10 < 2; ++var10) {
				if (var8[var10] != 15) {
					var11 = (short)var1.method8660();
					if (var9) {
						var6.field1900[var8[var10]] = var11;
					}
				}
			}
		}

		if (var5) {
			var7 = var1.method8658();
			var8 = new int[]{var7 & 15, var7 >> 4 & 15};
			var9 = var6.field1899 != null && var8.length == var6.field1899.length;

			for (var10 = 0; var10 < 2; ++var10) {
				if (15 != var8[var10]) {
					var11 = (short)var1.method8660();
					if (var9) {
						var6.field1899[var8[var10]] = var11;
					}
				}
			}
		}

		return var6;
	}
}
