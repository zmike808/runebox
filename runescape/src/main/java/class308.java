public class class308 {
	public int field3486;
	public int field3487;
	public int field3488;

	public class308(int var1, int var2, int var3) {
		this.field3487 = var1;
		this.field3486 = var2;
		this.field3488 = var3;
	}

	public class308(class308 var1) {
		this.field3487 = var1.field3487;
		this.field3486 = var1.field3486;
		this.field3488 = var1.field3488;
	}

	public class308(int var1) {
		if (var1 == -1) {
			this.field3487 = -1;
		} else {
			this.field3487 = var1 >> 28 & 3;
			this.field3486 = var1 >> 14 & 16383;
			this.field3488 = var1 & 16383;
		}

	}

	public int method5769() {
		return method5485(this.field3487, this.field3486, this.field3488);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof class308) ? false : this.method5768((class308)var1);
		}
	}

	boolean method5768(class308 var1) {
		if (this.field3487 != var1.field3487) {
			return false;
		} else if (var1.field3486 != this.field3486) {
			return false;
		} else {
			return this.field3488 == var1.field3488;
		}
	}

	public int hashCode() {
		return this.method5769();
	}

	public String toString() {
		return this.method5770(",");
	}

	String method5770(String var1) {
		return this.field3487 + var1 + (this.field3486 >> 6) + var1 + (this.field3488 >> 6) + var1 + (this.field3486 & 63) + var1 + (this.field3488 & 63);
	}

	static int method5485(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}
}
