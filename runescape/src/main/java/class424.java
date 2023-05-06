public class class424 {
	float field4653;
	float field4655;
	float field4656;

	static {
		new class424(0.0F, 0.0F, 0.0F);
		new class424(1.0F, 1.0F, 1.0F);
		new class424(1.0F, 0.0F, 0.0F);
		new class424(0.0F, 1.0F, 0.0F);
		new class424(0.0F, 0.0F, 1.0F);
	}

	class424(float var1, float var2, float var3) {
		this.field4656 = var1;
		this.field4653 = var2;
		this.field4655 = var3;
	}

	final float method7830() {
		return (float)Math.sqrt((double)(this.field4655 * this.field4655 + this.field4656 * this.field4656 + this.field4653 * this.field4653));
	}

	public String toString() {
		return this.field4656 + ", " + this.field4653 + ", " + this.field4655;
	}
}
