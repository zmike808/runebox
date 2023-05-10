public class class248 implements class269 {
	int field2879;
	int field2880;
	int field2881;
	int field2882;
	int field2883;
	int field2884;
	int field2885;
	int field2886;
	int field2887;
	int field2888;

	class248() {
	}

	public void method5359(class249 var1) {
		if (var1.field2895 > this.field2879) {
			var1.field2895 = this.field2879;
		}

		if (var1.field2889 < this.field2886) {
			var1.field2889 = this.field2886;
		}

		if (var1.field2897 > this.field2885) {
			var1.field2897 = this.field2885;
		}

		if (var1.field2898 < this.field2888) {
			var1.field2898 = this.field2888;
		}

	}

	public boolean method5341(int var1, int var2, int var3) {
		if (var1 >= this.field2880 && var1 < this.field2880 + this.field2887) {
			return var2 >> 6 >= this.field2881 && var2 >> 6 <= this.field2882 && var3 >> 6 >= this.field2884 && var3 >> 6 <= this.field2883;
		} else {
			return false;
		}
	}

	public boolean method5354(int var1, int var2) {
		return var1 >> 6 >= this.field2879 && var1 >> 6 <= this.field2886 && var2 >> 6 >= this.field2885 && var2 >> 6 <= this.field2888;
	}

	public int[] method5343(int var1, int var2, int var3) {
		if (!this.method5341(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field2879 * 64 - this.field2881 * 64), this.field2885 * 64 - this.field2884 * 64 + var3};
			return var5;
		}
	}

	public class308 method5344(int var1, int var2) {
		if (!this.method5354(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2881 * 64 - this.field2879 * 64 + var1;
			int var5 = var2 + (this.field2884 * 64 - this.field2885 * 64);
			return new class308(this.field2880, var4, var5);
		}
	}

	public void method5361(class489 var1) {
		this.field2880 = var1.method8658();
		this.field2887 = var1.method8658();
		this.field2881 = var1.method8660();
		this.field2884 = var1.method8660();
		this.field2882 = var1.method8660();
		this.field2883 = var1.method8660();
		this.field2879 = var1.method8660();
		this.field2885 = var1.method8660();
		this.field2886 = var1.method8660();
		this.field2888 = var1.method8660();
		this.method4891();
	}

	void method4891() {
	}
}
