public class class453 extends class456 {
	double field4786;
	double field4789;
	double field4790;
	double field4791;
	double field4793;
	int field4787;
	int field4792;

	public class453(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field4792 = 0;
		this.field4787 = 0;
		this.field4791 = 0.0D;
		this.field4789 = 0.0D;
		this.field4790 = 0.0D;
		this.field4793 = 0.0D;
		this.field4786 = 0.0D;
		this.field4792 = var3;
		this.field4787 = var6;
		if ((var4 - var7) * (var8 - var2) == (var7 - var1) * (var5 - var8)) {
			this.field4791 = (double)var4;
			this.field4789 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var8 + var5)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field4791 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
			this.field4789 = var13 + var19 * (this.field4791 - var11);
			this.field4790 = Math.sqrt(Math.pow(this.field4791 - (double)var1, 2.0D) + Math.pow(this.field4789 - (double)var2, 2.0D));
			this.field4793 = Math.atan2((double)var2 - this.field4789, (double)var1 - this.field4791);
			double var23 = Math.atan2((double)var8 - this.field4789, (double)var7 - this.field4791);
			this.field4786 = Math.atan2((double)var5 - this.field4789, (double)var4 - this.field4791);
			boolean var25 = this.field4793 <= var23 && var23 <= this.field4786 || this.field4786 <= var23 && var23 <= this.field4793;
			if (!var25) {
				this.field4786 += (double)(this.field4793 - this.field4786 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	public int method8107() {
		double var2 = this.method8116();
		double var4 = this.field4793 + var2 * (this.field4786 - this.field4793);
		return (int)Math.round(this.field4791 + this.field4790 * Math.cos(var4));
	}

	public int method8102() {
		double var2 = this.method8116();
		double var4 = (this.field4786 - this.field4793) * var2 + this.field4793;
		return (int)Math.round(this.field4789 + this.field4790 * Math.sin(var4));
	}

	public int method8103() {
		double var2 = this.method8116();
		return (int)Math.round((double)(this.field4787 - this.field4792) * var2 + (double)this.field4792);
	}

	public static class502 method8084(class344 var0, int var1) {
		byte[] var4 = var0.method6501(var1);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class486.method8595(var4);
			var3 = true;
		}

		return !var3 ? null : class337.method6356();
	}

	static final boolean method8076(class317 var0) {
		if (null == var0.field3696) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field3696.length; ++var2) {
				int var3 = class80.method2174(var0, var2);
				int var4 = var0.field3697[var2];
				if (var0.field3696[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field3696[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var0.field3696[var2]) {
					if (var3 == var4) {
						return false;
					}
				} else if (var4 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
