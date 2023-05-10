public class class427 {
	float field4676;
	float field4677;
	float field4678;
	float field4679;
	float field4680;
	float field4681;
	float field4682;
	float field4683;
	float field4684;
	float field4685;
	float field4686;
	float field4687;

	static {
		new class427();
	}

	class427() {
		this.method7936();
	}

	void method7936() {
		this.field4686 = 0.0F;
		this.field4685 = 0.0F;
		this.field4684 = 0.0F;
		this.field4682 = 0.0F;
		this.field4681 = 0.0F;
		this.field4680 = 0.0F;
		this.field4678 = 0.0F;
		this.field4677 = 0.0F;
		this.field4676 = 0.0F;
		this.field4683 = 1.0F;
		this.field4679 = 1.0F;
		this.field4687 = 1.0F;
	}

	void method7930(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4676;
		float var6 = this.field4679;
		float var7 = this.field4682;
		float var8 = this.field4685;
		this.field4676 = var5 * var3 - this.field4677 * var4;
		this.field4677 = this.field4677 * var3 + var4 * var5;
		this.field4679 = var3 * var6 - var4 * this.field4680;
		this.field4680 = this.field4680 * var3 + var6 * var4;
		this.field4682 = var7 * var3 - var4 * this.field4683;
		this.field4683 = this.field4683 * var3 + var4 * var7;
		this.field4685 = var3 * var8 - this.field4686 * var4;
		this.field4686 = var4 * var8 + var3 * this.field4686;
	}

	void method7931(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4687;
		float var6 = this.field4678;
		float var7 = this.field4681;
		float var8 = this.field4684;
		this.field4687 = var4 * this.field4677 + var3 * var5;
		this.field4677 = var3 * this.field4677 - var5 * var4;
		this.field4678 = var4 * this.field4680 + var6 * var3;
		this.field4680 = this.field4680 * var3 - var6 * var4;
		this.field4681 = var4 * this.field4683 + var3 * var7;
		this.field4683 = this.field4683 * var3 - var4 * var7;
		this.field4684 = var3 * var8 + var4 * this.field4686;
		this.field4686 = var3 * this.field4686 - var8 * var4;
	}

	void method7932(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4687;
		float var6 = this.field4678;
		float var7 = this.field4681;
		float var8 = this.field4684;
		this.field4687 = var5 * var3 - this.field4676 * var4;
		this.field4676 = var3 * this.field4676 + var5 * var4;
		this.field4678 = var6 * var3 - this.field4679 * var4;
		this.field4679 = var4 * var6 + var3 * this.field4679;
		this.field4681 = var3 * var7 - this.field4682 * var4;
		this.field4682 = var3 * this.field4682 + var4 * var7;
		this.field4684 = var3 * var8 - var4 * this.field4685;
		this.field4685 = var3 * this.field4685 + var4 * var8;
	}

	void method7929(float var1, float var2, float var3) {
		this.field4684 += var1;
		this.field4685 += var2;
		this.field4686 += var3;
	}

	public String toString() {
		return this.field4687 + "," + this.field4678 + "," + this.field4681 + "," + this.field4684 + "\n" + this.field4676 + "," + this.field4679 + "," + this.field4682 + "," + this.field4685 + "\n" + this.field4677 + "," + this.field4680 + "," + this.field4683 + "," + this.field4686;
	}

	static final void method7947(int var0, int var1, int var2, int var3, class503 var4, class306 var5) {
		if (var4 != null) {
			int var7 = Client.field758 & 2047;
			int var8 = var3 * var3 + var2 * var2;
			if (var8 <= 6400) {
				int var9 = class219.field2512[var7];
				int var10 = class219.field2516[var7];
				int var11 = var2 * var10 + var3 * var9 >> 16;
				int var12 = var3 * var10 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method9103(var5.field3477 / 2 + var11 - var4.field5092 / 2, var5.field3472 / 2 - var12 - var4.field5087 / 2, var0, var1, var5.field3477, var5.field3472, var5.field3475, var5.field3474);
				} else {
					var4.method9106(var11 + var0 + var5.field3477 / 2 - var4.field5092 / 2, var5.field3472 / 2 + var1 - var12 - var4.field5087 / 2);
				}

			}
		}
	}
}
