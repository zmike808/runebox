public abstract class class457 {
	double field4805;
	int field4802;
	int field4803;
	int field4804;

	class457(int var1, int var2) {
		this.field4804 = 0;
		this.field4802 = 0;
		this.field4805 = 0.0D;
		this.field4803 = 0;
		this.field4804 = var1;
		this.field4802 = 0;
		this.field4803 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4805 = class71.method1989(this.field4802, this.field4804, this.field4803);
	}

	public void method8110() {
		if (this.field4802 < this.field4804) {
			++this.field4802;
			this.field4805 = class71.method1989(this.field4802, this.field4804, this.field4803);
		}

	}

	double method8116() {
		return this.field4805;
	}
}
