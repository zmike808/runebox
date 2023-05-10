public class class488 extends class489 {
	static final int[] field4986;
	class506 field4985;
	int field4988;

	static {
		field4986 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public class488(int var1) {
		super(var1);
	}

	public void method8606(int[] var1) {
		this.field4985 = new class506(var1);
	}

	public void method8600(class506 var1) {
		this.field4985 = var1;
	}

	public void method8620(int var1) {
		super.field4991[++super.field4989 - 1] = (byte)(var1 + this.field4985.method9230());
	}

	public int method8602() {
		return super.field4991[++super.field4989 - 1] - this.field4985.method9230() & 255;
	}

	public boolean method8623(byte var1) {
		int var2 = super.field4991[super.field4989] - this.field4985.method9223() & 255;
		if (var2 < 128) {
			if (var1 == -1) {
				throw new IllegalStateException();
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	public int method8604() {
		int var2 = super.field4991[++super.field4989 - 1] - this.field4985.method9230() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field4991[++super.field4989 - 1] - this.field4985.method9230() & 255);
	}

	public void method8605(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var2 + var5] = (byte)(super.field4991[++super.field4989 - 1] - this.field4985.method9230());
		}

	}

	public void method8636() {
		this.field4988 = super.field4989 * 8;
	}

	public int method8607(int var1) {
		int var3 = this.field4988 >> 3;
		int var4 = 8 - (this.field4988 & 7);
		int var5 = 0;

		for (this.field4988 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field4991[var3++] & field4986[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field4991[var3] & field4986[var4];
		} else {
			var5 += super.field4991[var3] >> var4 - var1 & field4986[var1];
		}

		return var5;
	}

	public void method8608() {
		super.field4989 = (this.field4988 + 7) / 8;
	}

	public int method8635(int var1) {
		return var1 * 8 - this.field4988;
	}
}
