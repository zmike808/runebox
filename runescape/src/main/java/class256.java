public class class256 implements class269 {
	int field2959;
	int field2960;
	int field2961;
	int field2962;
	int field2963;
	int field2964;
	int field2965;
	int field2966;
	int field2967;
	int field2968;
	int field2969;
	int field2970;
	int field2971;
	int field2972;

	class256() {
	}

	public void method5359(class249 var1) {
		if (var1.field2895 > this.field2970) {
			var1.field2895 = this.field2970;
		}

		if (var1.field2889 < this.field2970) {
			var1.field2889 = this.field2970;
		}

		if (var1.field2897 > this.field2959) {
			var1.field2897 = this.field2959;
		}

		if (var1.field2898 < this.field2959) {
			var1.field2898 = this.field2959;
		}

	}

	public boolean method5341(int var1, int var2, int var3) {
		if (var1 >= this.field2965 && var1 < this.field2960 + this.field2965) {
			return var2 >= (this.field2961 << 6) + (this.field2971 << 3) && var2 <= (this.field2967 << 3) + (this.field2961 << 6) + 7 && var3 >= (this.field2966 << 3) + (this.field2962 << 6) && var3 <= 7 + (this.field2962 << 6) + (this.field2968 << 3);
		} else {
			return false;
		}
	}

	public boolean method5354(int var1, int var2) {
		return var1 >= (this.field2970 << 6) + (this.field2969 << 3) && var1 <= 7 + (this.field2970 << 6) + (this.field2963 << 3) && var2 >= (this.field2964 << 3) + (this.field2959 << 6) && var2 <= 7 + (this.field2959 << 6) + (this.field2972 << 3);
	}

	public int[] method5343(int var1, int var2, int var3) {
		if (!this.method5341(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2969 * 8 - this.field2971 * 8 + this.field2970 * 64 - this.field2961 * 64 + var2, var3 + (this.field2959 * 64 - this.field2962 * 64) + (this.field2964 * 8 - this.field2966 * 8)};
			return var5;
		}
	}

	public class308 method5344(int var1, int var2) {
		if (!this.method5354(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field2961 * 64 - this.field2970 * 64) + (this.field2971 * 8 - this.field2969 * 8);
			int var5 = this.field2962 * 64 - this.field2959 * 64 + var2 + (this.field2966 * 8 - this.field2964 * 8);
			return new class308(this.field2965, var4, var5);
		}
	}

	public void method5361(class489 var1) {
		this.field2965 = var1.method8658();
		this.field2960 = var1.method8658();
		this.field2961 = var1.method8660();
		this.field2971 = var1.method8658();
		this.field2967 = var1.method8658();
		this.field2962 = var1.method8660();
		this.field2966 = var1.method8658();
		this.field2968 = var1.method8658();
		this.field2970 = var1.method8660();
		this.field2969 = var1.method8658();
		this.field2963 = var1.method8658();
		this.field2959 = var1.method8660();
		this.field2964 = var1.method8658();
		this.field2972 = var1.method8658();
		this.method5204();
	}

	void method5204() {
	}
}
