public class class454 extends class456 {
	int field4794;
	int field4795;
	int field4796;
	int field4797;
	int field4798;
	int field4799;

	public class454(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field4795 = 0;
		this.field4799 = 0;
		this.field4796 = 0;
		this.field4794 = 0;
		this.field4798 = 0;
		this.field4797 = 0;
		this.field4795 = var1;
		this.field4799 = var2;
		this.field4796 = var3;
		this.field4794 = var4;
		this.field4798 = var5;
		this.field4797 = var6;
	}

	public int method8107() {
		double var2 = this.method8116();
		return (int)Math.round((double)(this.field4794 - this.field4795) * var2 + (double)this.field4795);
	}

	public int method8102() {
		double var2 = this.method8116();
		return (int)Math.round(var2 * (double)(this.field4798 - this.field4799) + (double)this.field4799);
	}

	public int method8103() {
		double var2 = this.method8116();
		return (int)Math.round((double)this.field4796 + (double)(this.field4797 - this.field4796) * var2);
	}
}
