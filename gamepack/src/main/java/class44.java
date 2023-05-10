public class class44 {
	int field318;
	int field320;
	int field321;
	int field322;
	int field323;
	int field324;
	int field326;
	int field327;
	int field328;
	int[] field319;
	int[] field325;

	class44() {
		this.field320 = 2;
		this.field319 = new int[2];
		this.field325 = new int[2];
		this.field319[0] = 0;
		this.field319[1] = 65535;
		this.field325[0] = 0;
		this.field325[1] = 65535;
	}

	final void method866(class489 var1) {
		this.field318 = var1.method8658();
		this.field321 = var1.method8664();
		this.field322 = var1.method8664();
		this.method876(var1);
	}

	final void method876(class489 var1) {
		this.field320 = var1.method8658();
		this.field319 = new int[this.field320];
		this.field325 = new int[this.field320];

		for (int var2 = 0; var2 < this.field320; ++var2) {
			this.field319[var2] = var1.method8660();
			this.field325[var2] = var1.method8660();
		}

	}

	final void method871() {
		this.field324 = 0;
		this.field326 = 0;
		this.field323 = 0;
		this.field327 = 0;
		this.field328 = 0;
	}

	final int method868(int var1) {
		if (this.field328 >= this.field324) {
			this.field327 = this.field325[this.field326++] << 15;
			if (this.field326 >= this.field320) {
				this.field326 = this.field320 - 1;
			}

			this.field324 = (int)((double)this.field319[this.field326] / 65536.0D * (double)var1);
			if (this.field324 > this.field328) {
				this.field323 = ((this.field325[this.field326] << 15) - this.field327) / (this.field324 - this.field328);
			}
		}

		this.field327 += this.field323;
		++this.field328;
		return this.field327 - this.field323 >> 15;
	}
}
