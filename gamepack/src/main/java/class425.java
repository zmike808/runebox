public final class class425 {
	static class425[] field4660;
	static int field4658;
	static int field4659;
	float field4661;
	float field4662;
	float field4663;
	float field4664;

	static {
		field4660 = new class425[0];
		method5791(100);
		new class425();
	}

	class425() {
		this.method7857();
	}

	public void method7840() {
		class425[] var2;
		synchronized(var2 = field4660){}
		if (field4659 < field4658 - 1) {
			field4660[++field4659 - 1] = this;
		}

	}

	void method7834(float var1, float var2, float var3, float var4) {
		this.field4661 = var1;
		this.field4662 = var2;
		this.field4663 = var3;
		this.field4664 = var4;
	}

	public void method7835(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(var4 * 0.5F));
		float var7 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4661 = var6 * var1;
		this.field4662 = var6 * var2;
		this.field4663 = var3 * var6;
		this.field4664 = var7;
	}

	final void method7857() {
		this.field4663 = 0.0F;
		this.field4662 = 0.0F;
		this.field4661 = 0.0F;
		this.field4664 = 1.0F;
	}

	public final void method7837(class425 var1) {
		this.method7834(var1.field4662 * this.field4663 + var1.field4661 * this.field4664 + var1.field4664 * this.field4661 - this.field4662 * var1.field4663, var1.field4662 * this.field4664 + (this.field4662 * var1.field4664 - this.field4663 * var1.field4661) + this.field4661 * var1.field4663, this.field4663 * var1.field4664 + var1.field4661 * this.field4662 - var1.field4662 * this.field4661 + var1.field4663 * this.field4664, this.field4664 * var1.field4664 - var1.field4661 * this.field4661 - this.field4662 * var1.field4662 - this.field4663 * var1.field4663);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class425)) {
			return false;
		} else {
			class425 var2 = (class425)var1;
			return this.field4661 == var2.field4661 && this.field4662 == var2.field4662 && this.field4663 == var2.field4663 && var2.field4664 == this.field4664;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4661;
		var2 = var2 * 31.0F + this.field4662;
		var2 = var2 * 31.0F + this.field4663;
		var2 = this.field4664 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4661 + "," + this.field4662 + "," + this.field4663 + "," + this.field4664;
	}

	static void method5791(int var0) {
		field4658 = var0;
		field4660 = new class425[var0];
		field4659 = 0;
	}

	public static class425 method3067() {
		class425[] var1;
		synchronized(var1 = field4660){}
		if (0 == field4659) {
			return new class425();
		} else {
			field4660[--field4659].method7857();
			return field4660[field4659];
		}
	}
}
