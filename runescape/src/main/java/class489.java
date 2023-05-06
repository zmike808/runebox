import java.math.BigInteger;

public class class489 extends class449 {
	static int[] field4993;
	static long[] field4994;
	public byte[] field4991;
	public int field4989;

	static {
		field4993 = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if (1 == (var0 & 1)) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			field4993[var1] = var0;
		}

		field4994 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if (1L == (var4 & 1L)) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field4994[var2] = var4;
		}

	}

	public class489(int var1) {
		this.field4991 = class258.method5258(var1);
		this.field4989 = 0;
	}

	public class489(int var1, boolean var2) {
		this.field4991 = class387.method7337(var1, var2);
	}

	public class489(byte[] var1) {
		this.field4991 = var1;
		this.field4989 = 0;
	}

	public void method8722() {
		if (null != this.field4991) {
			class83.method2195(this.field4991);
		}

		this.field4991 = null;
	}

	public void method8695(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)var1;
	}

	public void method8642(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)var1;
	}

	public void method8702(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 16);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)var1;
	}

	public void method8644(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 24);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 16);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)var1;
	}

	public void method8854(long var1) {
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 40));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 32));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 24));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 16));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 8));
		this.field4991[++this.field4989 - 1] = (byte)((int)var1);
	}

	public void method8640(long var1) {
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 56));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 48));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 40));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 32));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 24));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 16));
		this.field4991[++this.field4989 - 1] = (byte)((int)(var1 >> 8));
		this.field4991[++this.field4989 - 1] = (byte)((int)var1);
	}

	public void method8647(boolean var1) {
		this.method8695(var1 ? 1 : 0);
	}

	public void method8648(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field4989 += class261.method5276(var1, 0, var1.length(), this.field4991, this.field4989);
			this.field4991[++this.field4989 - 1] = 0;
		}
	}

	public void method8782(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field4991[++this.field4989 - 1] = 0;
			this.field4989 += class261.method5276(var1, 0, var1.length(), this.field4991, this.field4989);
			this.field4991[++this.field4989 - 1] = 0;
		}
	}

	public void method8650(CharSequence var1) {
		int var3 = class174.method3457(var1);
		this.field4991[++this.field4989 - 1] = 0;
		this.method8657(var3);
		this.field4989 += class353.method6629(this.field4991, this.field4989, var1);
	}

	public void method8886(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			this.field4991[++this.field4989 - 1] = var1[var5];
		}

	}

	public void method8652(class489 var1) {
		this.method8886(var1.field4991, 0, var1.field4989);
	}

	public void method8653(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field4991[this.field4989 - var1 - 4] = (byte)(var1 >> 24);
			this.field4991[this.field4989 - var1 - 3] = (byte)(var1 >> 16);
			this.field4991[this.field4989 - var1 - 2] = (byte)(var1 >> 8);
			this.field4991[this.field4989 - var1 - 1] = (byte)var1;
		}
	}

	public void method8654(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field4991[this.field4989 - var1 - 2] = (byte)(var1 >> 8);
			this.field4991[this.field4989 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8655(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field4991[this.field4989 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8656(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method8695(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method8642(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8657(int var1) {
		if (0 != (var1 & -128)) {
			if ((var1 & -16384) != 0) {
				if (0 != (var1 & -2097152)) {
					if ((var1 & -268435456) != 0) {
						this.method8695(var1 >>> 28 | 128);
					}

					this.method8695(var1 >>> 21 | 128);
				}

				this.method8695(var1 >>> 14 | 128);
			}

			this.method8695(var1 >>> 7 | 128);
		}

		this.method8695(var1 & 127);
	}

	public int method8658() {
		return this.field4991[++this.field4989 - 1] & 255;
	}

	public byte method8659() {
		return this.field4991[++this.field4989 - 1];
	}

	public int method8660() {
		this.field4989 += 2;
		return (this.field4991[this.field4989 - 1] & 255) + ((this.field4991[this.field4989 - 2] & 255) << 8);
	}

	public int method8855() {
		this.field4989 += 2;
		int var2 = (this.field4991[this.field4989 - 1] & 255) + ((this.field4991[this.field4989 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method8662() {
		this.field4989 += 3;
		return ((this.field4991[this.field4989 - 2] & 255) << 8) + ((this.field4991[this.field4989 - 3] & 255) << 16) + (this.field4991[this.field4989 - 1] & 255);
	}

	public int method8719() {
		this.field4989 += 3;
		int var2 = (this.field4991[this.field4989 - 1] & 255) + ((this.field4991[this.field4989 - 2] & 255) << 8) + ((this.field4991[this.field4989 - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method8664() {
		this.field4989 += 4;
		return ((this.field4991[this.field4989 - 3] & 255) << 16) + ((this.field4991[this.field4989 - 4] & 255) << 24) + ((this.field4991[this.field4989 - 2] & 255) << 8) + (this.field4991[this.field4989 - 1] & 255);
	}

	public long method8681() {
		long var2 = (long)this.method8664() & 4294967295L;
		long var4 = (long)this.method8664() & 4294967295L;
		return (var2 << 32) + var4;
	}

	public float method8666() {
		return Float.intBitsToFloat(this.method8664());
	}

	public boolean method8706() {
		return (this.method8658() & 1) == 1;
	}

	public String method8715() {
		if (0 == this.field4991[this.field4989]) {
			++this.field4989;
			return null;
		} else {
			return this.method8669();
		}
	}

	public String method8669() {
		int var2 = this.field4989;

		while (this.field4991[++this.field4989 - 1] != 0) {
		}

		int var3 = this.field4989 - var2 - 1;
		return var3 == 0 ? "" : method8902(this.field4991, var2, var3);
	}

	public String method8670() {
		byte var2 = this.field4991[++this.field4989 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field4989;

			while (this.field4991[++this.field4989 - 1] != 0) {
			}

			int var4 = this.field4989 - var3 - 1;
			return var4 == 0 ? "" : method8902(this.field4991, var3, var4);
		}
	}

	public String method8638() {
		byte var2 = this.field4991[++this.field4989 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method8766();
			if (var3 + this.field4989 > this.field4991.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field4991;
				int var6 = this.field4989;
				char[] var7 = new char[var3];
				int var8 = 0;
				int var9 = var6;

				int var12;
				for (int var10 = var6 + var3; var9 < var10; var7[var8++] = (char)var12) {
					int var11 = var5[var9++] & 255;
					if (var11 < 128) {
						if (var11 == 0) {
							var12 = 65533;
						} else {
							var12 = var11;
						}
					} else if (var11 < 192) {
						var12 = 65533;
					} else if (var11 < 224) {
						if (var9 < var10 && 128 == (var5[var9] & 192)) {
							var12 = (var11 & 31) << 6 | var5[var9++] & 63;
							if (var12 < 128) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 240) {
						if (var9 + 1 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192)) {
							var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 < 2048) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 248) {
						if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192) && 128 == (var5[var9 + 2] & 192)) {
							var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 >= 65536 && var12 <= 1114111) {
								var12 = 65533;
							} else {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else {
						var12 = 65533;
					}
				}

				String var4 = new String(var7, 0, var8);
				this.field4989 += var3;
				return var4;
			}
		}
	}

	public void method8676(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			var1[var5] = this.field4991[++this.field4989 - 1];
		}

	}

	public int method8673() {
		int var2 = this.field4991[this.field4989] & 255;
		return var2 < 128 ? this.method8658() - 64 : this.method8660() - 49152;
	}

	public int method8827() {
		int var2 = this.field4991[this.field4989] & 255;
		return var2 < 128 ? this.method8658() : this.method8660() - 32768;
	}

	public int method8675() {
		int var2 = this.field4991[this.field4989] & 255;
		return var2 < 128 ? this.method8658() - 1 : this.method8660() - 32769;
	}

	public int method8780() {
		int var2 = 0;

		int var3;
		for (var3 = this.method8827(); var3 == 32767; var3 = this.method8827()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	public int method8892() {
		return this.field4991[this.field4989] < 0 ? this.method8664() & Integer.MAX_VALUE : this.method8660();
	}

	public int method8710() {
		if (this.field4991[this.field4989] < 0) {
			return this.method8664() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method8660();
			return var2 == 32767 ? -1 : var2;
		}
	}

	public int method8766() {
		byte var2 = this.field4991[++this.field4989 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field4991[++this.field4989 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public int method8680(byte var1) {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method8658();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		if (var1 == -1) {
			throw new IllegalStateException();
		} else {
			return var3;
		}
	}

	public void method8901(int[] var1) {
		int var3 = this.field4989 / 8;
		this.field4989 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method8664();
			int var6 = this.method8664();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
				var7 += var8;
			}

			this.field4989 -= 8;
			this.method8644(var5);
			this.method8644(var6);
		}

	}

	public void method8682(int[] var1) {
		int var3 = this.field4989 / 8;
		this.field4989 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method8664();
			int var6 = this.method8664();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
				var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= var8;
			}

			this.field4989 -= 8;
			this.method8644(var5);
			this.method8644(var6);
		}

	}

	public void method8731(int[] var1, int var2, int var3) {
		int var5 = this.field4989;
		this.field4989 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method8664();
			int var9 = this.method8664();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
				var10 += var11;
			}

			this.field4989 -= 8;
			this.method8644(var8);
			this.method8644(var9);
		}

		this.field4989 = var5;
	}

	public void method8684(int[] var1, int var2, int var3) {
		int var5 = this.field4989;
		this.field4989 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method8664();
			int var9 = this.method8664();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10) {
				var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
				var10 -= var11;
			}

			this.field4989 -= 8;
			this.method8644(var8);
			this.method8644(var9);
		}

		this.field4989 = var5;
	}

	public void method8685(BigInteger var1, BigInteger var2) {
		int var4 = this.field4989;
		this.field4989 = 0;
		byte[] var5 = new byte[var4];
		this.method8676(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field4989 = 0;
		this.method8642(var8.length);
		this.method8886(var8, 0, var8.length);
	}

	public int method8842(int var1) {
		int var3 = method4046(this.field4991, var1, this.field4989);
		this.method8644(var3);
		return var3;
	}

	public boolean method8687() {
		this.field4989 -= 4;
		int var2 = method4046(this.field4991, 0, this.field4989);
		int var3 = this.method8664();
		return var2 == var3;
	}

	public void method8688(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 + 128);
	}

	public void method8716(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(0 - var1);
	}

	public void method8805(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(128 - var1);
	}

	public int method8691() {
		return this.field4991[++this.field4989 - 1] - 128 & 255;
	}

	public int method8692() {
		return 0 - this.field4991[++this.field4989 - 1] & 255;
	}

	public int method8641() {
		return 128 - this.field4991[++this.field4989 - 1] & 255;
	}

	public byte method8788() {
		return (byte)(this.field4991[++this.field4989 - 1] - 128);
	}

	public byte method8834() {
		return (byte)(0 - this.field4991[++this.field4989 - 1]);
	}

	public byte method8694() {
		return (byte)(128 - this.field4991[++this.field4989 - 1]);
	}

	public void method8734(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)var1;
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
	}

	public void method8698(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)(var1 + 128);
	}

	public void method8859(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 + 128);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
	}

	public int method8737() {
		this.field4989 += 2;
		return ((this.field4991[this.field4989 - 1] & 255) << 8) + (this.field4991[this.field4989 - 2] & 255);
	}

	public int method8700() {
		this.field4989 += 2;
		return ((this.field4991[this.field4989 - 2] & 255) << 8) + (this.field4991[this.field4989 - 1] - 128 & 255);
	}

	public int method8701() {
		this.field4989 += 2;
		return ((this.field4991[this.field4989 - 1] & 255) << 8) + (this.field4991[this.field4989 - 2] - 128 & 255);
	}

	public int method8821() {
		this.field4989 += 2;
		int var2 = (this.field4991[this.field4989 - 2] & 255) + ((this.field4991[this.field4989 - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method8703() {
		this.field4989 += 2;
		int var2 = (this.field4991[this.field4989 - 1] - 128 & 255) + ((this.field4991[this.field4989 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method8704() {
		this.field4989 += 2;
		int var2 = ((this.field4991[this.field4989 - 1] & 255) << 8) + (this.field4991[this.field4989 - 2] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public void method8705(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 16);
		this.field4991[++this.field4989 - 1] = (byte)var1;
	}

	public int method8686() {
		this.field4989 += 3;
		return ((this.field4991[this.field4989 - 2] & 255) << 8) + ((this.field4991[this.field4989 - 1] & 255) << 16) + (this.field4991[this.field4989 - 3] & 255);
	}

	public int method8707() {
		this.field4989 += 3;
		return ((this.field4991[this.field4989 - 2] & 255) << 16) + ((this.field4991[this.field4989 - 3] & 255) << 8) + (this.field4991[this.field4989 - 1] & 255);
	}

	public int method8708() {
		this.field4989 += 3;
		int var2 = ((this.field4991[this.field4989 - 1] & 255) << 16) + ((this.field4991[this.field4989 - 2] & 255) << 8) + (this.field4991[this.field4989 - 3] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public void method8709(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)var1;
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 16);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 24);
	}

	public void method8645(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
		this.field4991[++this.field4989 - 1] = (byte)var1;
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 24);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 16);
	}

	public void method8711(int var1) {
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 16);
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 24);
		this.field4991[++this.field4989 - 1] = (byte)var1;
		this.field4991[++this.field4989 - 1] = (byte)(var1 >> 8);
	}

	public int method8712() {
		this.field4989 += 4;
		return ((this.field4991[this.field4989 - 2] & 255) << 16) + ((this.field4991[this.field4989 - 1] & 255) << 24) + ((this.field4991[this.field4989 - 3] & 255) << 8) + (this.field4991[this.field4989 - 4] & 255);
	}

	public int method8713() {
		this.field4989 += 4;
		return ((this.field4991[this.field4989 - 2] & 255) << 24) + ((this.field4991[this.field4989 - 1] & 255) << 16) + ((this.field4991[this.field4989 - 4] & 255) << 8) + (this.field4991[this.field4989 - 3] & 255);
	}

	public int method8714() {
		this.field4989 += 4;
		return (this.field4991[this.field4989 - 2] & 255) + ((this.field4991[this.field4989 - 4] & 255) << 16) + ((this.field4991[this.field4989 - 3] & 255) << 24) + ((this.field4991[this.field4989 - 1] & 255) << 8);
	}

	static int method4046(byte[] var0, int var1, int var2) {
		int var4 = -1;

		for (int var5 = var1; var5 < var2; ++var5) {
			var4 = var4 >>> 8 ^ field4993[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}

	public static int method4335(byte[] var0, int var1) {
		return method4046(var0, 0, var1);
	}

	public static int method2092(String var0) {
		return var0.length() + 1;
	}

	public static int method3498(String var0) {
		return var0.length() + 2;
	}

	public static String method8902(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var7 = var0[var1 + var6] & 255;
			if (var7 != 0) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = class370.field4373[var7 - 128];
					if (var8 == 0) {
						var8 = '?';
					}

					var7 = var8;
				}

				var4[var5++] = (char)var7;
			}
		}

		return new String(var4, 0, var5);
	}
}
