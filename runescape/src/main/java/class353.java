public class class353 {
	byte field4296;
	public int field4289;
	public int field4290;
	public int field4291;
	public int field4293;
	public int field4294;

	public class353() {
	}

	public class353(class489 var1, boolean var2) {
		this.field4296 = var1.method8659();
		this.field4290 = var1.method8660();
		this.field4291 = var1.method8664();
		this.field4293 = var1.method8664();
		this.field4289 = var1.method8664();
		this.field4294 = var1.method8664();
		if (var2) {
			this.method6619(class341.method6388(var1));
		}

	}

	void method6619(Integer var1) {
	}

	public int method6615() {
		return this.field4296 & 7;
	}

	public int method6618() {
		return (this.field4296 & 8) == 8 ? 1 : 0;
	}

	void method6625(int var1) {
		this.field4296 &= -8;
		this.field4296 = (byte)(this.field4296 | var1 & 7);
	}

	void method6621(int var1) {
		this.field4296 &= -9;
		if (var1 == 1) {
			this.field4296 = (byte)(this.field4296 | 8);
		}

	}

	public static int method6629(byte[] var0, int var1, CharSequence var2) {
		int var4 = var2.length();
		int var5 = var1;

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var2.charAt(var6);
			if (var7 <= 127) {
				var0[var5++] = (byte)var7;
			} else if (var7 <= 2047) {
				var0[var5++] = (byte)(192 | var7 >> 6);
				var0[var5++] = (byte)(128 | var7 & '?');
			} else {
				var0[var5++] = (byte)(224 | var7 >> '\f');
				var0[var5++] = (byte)(128 | var7 >> 6 & 63);
				var0[var5++] = (byte)(128 | var7 & '?');
			}
		}

		return var5 - var1;
	}
}
