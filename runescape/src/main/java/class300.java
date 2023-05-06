public class class300 {
	static final byte[] field3423;
	class489 field3431;
	int field3424;
	int field3428;
	int[] field3422;
	int[] field3425;
	int[] field3427;
	int[] field3430;
	long field3435;

	static {
		field3423 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	class300() {
		this.field3431 = new class489((byte[])null);
	}

	class300(byte[] var1) {
		this.field3431 = new class489((byte[])null);
		this.method5677(var1);
	}

	void method5677(byte[] var1) {
		this.field3431.field4991 = var1;
		this.field3431.field4989 = 10;
		int var2 = this.field3431.method8660();
		this.field3424 = this.field3431.method8660();
		this.field3428 = 500000;
		this.field3430 = new int[var2];

		class489 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field4989 += var5) {
			int var4 = this.field3431.method8664();
			var5 = this.field3431.method8664();
			if (var4 == 1297379947) {
				this.field3430[var3] = this.field3431.field4989;
				++var3;
			}

			var10000 = this.field3431;
		}

		this.field3435 = 0L;
		this.field3425 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field3425[var3] = this.field3430[var3];
		}

		this.field3422 = new int[var2];
		this.field3427 = new int[var2];
	}

	void method5718() {
		this.field3431.field4991 = null;
		this.field3430 = null;
		this.field3425 = null;
		this.field3422 = null;
		this.field3427 = null;
	}

	boolean method5687() {
		return this.field3431.field4991 != null;
	}

	int method5680() {
		return this.field3425.length;
	}

	void method5681(int var1) {
		this.field3431.field4989 = this.field3425[var1];
	}

	void method5682(int var1) {
		this.field3425[var1] = this.field3431.field4989;
	}

	void method5714() {
		this.field3431.field4989 = -1;
	}

	void method5684(int var1) {
		int var2 = this.field3431.method8766();
		int[] var10000 = this.field3422;
		var10000[var1] += var2;
	}

	int method5685(int var1) {
		int var2 = this.method5686(var1);
		return var2;
	}

	int method5686(int var1) {
		byte var2 = this.field3431.field4991[this.field3431.field4989];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3427[var1] = var5;
			++this.field3431.field4989;
		} else {
			var5 = this.field3427[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method5701(var1, var5);
		} else {
			int var3 = this.field3431.method8766();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field3431.field4991[this.field3431.field4989] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field3431.field4989;
					this.field3427[var1] = var4;
					return this.method5701(var1, var4);
				}
			}

			class489 var10000 = this.field3431;
			var10000.field4989 += var3;
			return 0;
		}
	}

	int method5701(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field3431.method8658();
			var4 = this.field3431.method8766();
			class489 var10000;
			if (var7 == 47) {
				var10000 = this.field3431;
				var10000.field4989 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field3431.method8662();
				var4 -= 3;
				int var6 = this.field3422[var1];
				this.field3435 += (long)var6 * (long)(this.field3428 - var5);
				this.field3428 = var5;
				var10000 = this.field3431;
				var10000.field4989 += var4;
				return 2;
			} else {
				var10000 = this.field3431;
				var10000.field4989 += var4;
				return 3;
			}
		} else {
			byte var3 = field3423[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field3431.method8658() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field3431.method8658() << 16;
			}

			return var4;
		}
	}

	long method5688(int var1) {
		return this.field3435 + (long)var1 * (long)this.field3428;
	}

	int method5689() {
		int var1 = this.field3425.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field3425[var4] >= 0 && this.field3422[var4] < var3) {
				var2 = var4;
				var3 = this.field3422[var4];
			}
		}

		return var2;
	}

	boolean method5690() {
		int var1 = this.field3425.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field3425[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method5691(long var1) {
		this.field3435 = var1;
		int var3 = this.field3425.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3422[var4] = 0;
			this.field3427[var4] = 0;
			this.field3431.field4989 = this.field3430[var4];
			this.method5684(var4);
			this.field3425[var4] = this.field3431.field4989;
		}

	}
}
