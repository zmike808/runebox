public class class41 extends class59 {
	int field283;
	public boolean field281;
	public byte[] field280;
	public int field282;
	public int field284;

	class41(int var1, byte[] var2, int var3, int var4) {
		this.field282 = var1;
		this.field280 = var2;
		this.field284 = var3;
		this.field283 = var4;
	}

	class41(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field282 = var1;
		this.field280 = var2;
		this.field284 = var3;
		this.field283 = var4;
		this.field281 = var5;
	}

	public class41 method788(class56 var1) {
		this.field280 = var1.method1126(this.field280);
		this.field282 = var1.method1127(this.field282);
		if (this.field284 == this.field283) {
			this.field284 = this.field283 = var1.method1135(this.field284);
		} else {
			this.field284 = var1.method1135(this.field284);
			this.field283 = var1.method1135(this.field283);
			if (this.field284 == this.field283) {
				--this.field284;
			}
		}

		return this;
	}
}
