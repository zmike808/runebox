public class class455 extends class457 {
	int field4800;
	int field4801;

	public class455(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4800 = 0;
		this.field4801 = 0;
		this.field4800 = var1;
		this.field4801 = var2;
	}

	public int method8096() {
		double var2 = this.method8116();
		return (int)Math.round((double)this.field4800 + (double)(this.field4801 - this.field4800) * var2);
	}
}
