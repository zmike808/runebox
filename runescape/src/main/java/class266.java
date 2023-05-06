public class class266 implements class269 {
	int field3042;
	int field3043;
	int field3044;
	int field3045;
	int field3046;
	int field3047;

	class266() {
	}

	public void method5359(class249 var1) {
		if (var1.field2895 > this.field3046) {
			var1.field2895 = this.field3046;
		}

		if (var1.field2889 < this.field3046) {
			var1.field2889 = this.field3046;
		}

		if (var1.field2897 > this.field3047) {
			var1.field2897 = this.field3047;
		}

		if (var1.field2898 < this.field3047) {
			var1.field2898 = this.field3047;
		}

	}

	public boolean method5341(int var1, int var2, int var3) {
		if (var1 >= this.field3045 && var1 < this.field3045 + this.field3042) {
			return this.field3043 == var2 >> 6 && var3 >> 6 == this.field3044;
		} else {
			return false;
		}
	}

	public boolean method5354(int var1, int var2) {
		return this.field3046 == var1 >> 6 && var2 >> 6 == this.field3047;
	}

	public int[] method5343(int var1, int var2, int var3) {
		if (!this.method5341(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field3046 * 64 - this.field3043 * 64), this.field3047 * 64 - this.field3044 * 64 + var3};
			return var5;
		}
	}

	public class308 method5344(int var1, int var2) {
		if (!this.method5354(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field3043 * 64 - this.field3046 * 64);
			int var5 = var2 + (this.field3044 * 64 - this.field3047 * 64);
			return new class308(this.field3045, var4, var5);
		}
	}

	public void method5361(class489 var1) {
		this.field3045 = var1.method8658();
		this.field3042 = var1.method8658();
		this.field3043 = var1.method8660();
		this.field3044 = var1.method8660();
		this.field3046 = var1.method8660();
		this.field3047 = var1.method8660();
		this.method5299();
	}

	void method5299() {
	}
}
