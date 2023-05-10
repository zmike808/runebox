public final class class506 {
	int field5109;
	int field5110;
	int field5111;
	int field5113;
	int[] field5107;
	int[] field5112;

	public class506(int[] var1) {
		this.field5107 = new int[256];
		this.field5112 = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field5112[var2] = var1[var2];
		}

		this.method9226();
	}

	public final int method9230() {
		if (0 == this.field5109) {
			this.method9225();
			this.field5109 = 256;
		}

		return this.field5112[--this.field5109];
	}

	public final int method9223() {
		if (this.field5109 == 0) {
			this.method9225();
			this.field5109 = 256;
		}

		return this.field5112[this.field5109 - 1];
	}

	final void method9225() {
		this.field5113 += ++this.field5110;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field5107[var2];
			if (0 == (var2 & 2)) {
				if ((var2 & 1) == 0) {
					this.field5111 ^= this.field5111 << 13;
				} else {
					this.field5111 ^= this.field5111 >>> 6;
				}
			} else if ((var2 & 1) == 0) {
				this.field5111 ^= this.field5111 << 2;
			} else {
				this.field5111 ^= this.field5111 >>> 16;
			}

			this.field5111 += this.field5107[var2 + 128 & 255];
			int var4;
			this.field5107[var2] = var4 = this.field5107[(var3 & 1020) >> 2] + this.field5111 + this.field5113;
			this.field5112[var2] = this.field5113 = this.field5107[(var4 >> 8 & 1020) >> 2] + var3;
		}

	}

	final void method9226() {
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;

		int var2;
		for (var2 = 0; var2 < 4; ++var2) {
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field5112[var2];
			var4 += this.field5112[var2 + 1];
			var5 += this.field5112[var2 + 2];
			var6 += this.field5112[var2 + 3];
			var7 += this.field5112[var2 + 4];
			var8 += this.field5112[var2 + 5];
			var9 += this.field5112[var2 + 6];
			var10 += this.field5112[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field5107[var2] = var3;
			this.field5107[var2 + 1] = var4;
			this.field5107[var2 + 2] = var5;
			this.field5107[var2 + 3] = var6;
			this.field5107[var2 + 4] = var7;
			this.field5107[var2 + 5] = var8;
			this.field5107[var2 + 6] = var9;
			this.field5107[var2 + 7] = var10;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field5107[var2];
			var4 += this.field5107[var2 + 1];
			var5 += this.field5107[var2 + 2];
			var6 += this.field5107[var2 + 3];
			var7 += this.field5107[var2 + 4];
			var8 += this.field5107[var2 + 5];
			var9 += this.field5107[var2 + 6];
			var10 += this.field5107[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field5107[var2] = var3;
			this.field5107[var2 + 1] = var4;
			this.field5107[var2 + 2] = var5;
			this.field5107[var2 + 3] = var6;
			this.field5107[var2 + 4] = var7;
			this.field5107[var2 + 5] = var8;
			this.field5107[var2 + 6] = var9;
			this.field5107[var2 + 7] = var10;
		}

		this.method9225();
		this.field5109 = 256;
	}
}
