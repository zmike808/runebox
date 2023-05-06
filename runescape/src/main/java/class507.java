public class class507 {
	boolean field5126;
	int field5115;
	int field5116;
	int field5117;
	int field5118;
	int field5119;
	int field5120;
	int field5121;
	int field5123;
	int field5124;
	int field5125;
	int field5127;
	int field5128;

	public class507() {
		this.field5124 = 0;
		this.field5123 = 0;
	}

	public void method9234(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5116 = var1;
		this.field5117 = var2;
		this.field5118 = var3;
		this.field5119 = var4;
		this.field5120 = var5;
		this.field5121 = var6;
		this.field5124 = var7;
		this.field5123 = var8;
		this.field5126 = var9;
	}

	public void method9239(int var1, int var2, int var3, int var4) {
		this.field5125 = var1;
		this.field5115 = var2;
		this.field5127 = var3;
		this.field5128 = var4;
	}

	public void method9236(class380 var1, class379 var2) {
		if (null != var2) {
			int var4 = var2.field4439;
			int var5 = Math.min(this.field5119, (int)((float)var4 * 0.9F));
			int var6 = var1.method7123(this.field5118);
			int var7 = var1.method7125(this.field5119);
			int var8 = this.field5116 - this.field5120 + var6;
			int var9 = var7 + (this.field5117 - this.field5121) + var4;
			class499.method8981(this.field5116, this.field5117, this.field5118 + this.field5116, this.field5119 + this.field5117);
			int var10 = this.field5123;
			int var11 = this.field5124;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			class384 var22 = var1.method7083(0, var10);
			class384 var13 = var1.method7083(var10, var11);
			class384 var14 = var1.method7083(var11, var1.method7006());
			class384 var15 = var1.method7083(0, this.field5124);
			int var17;
			int var19;
			if (!var13.method7255()) {
				int var16 = var2.field4440 + var2.field4441;

				for (var17 = 0; var17 < var13.method7256(); ++var17) {
					class382 var18 = var13.method7257(var17);
					var19 = var18.field4428 + var8;
					int var20 = var2.method7144(var18.field4429);
					int var21 = var18.field4431 + var9 - var4;
					class499.method9012(var19, var21, var20, var16, this.field5128);
				}
			}

			if (!var22.method7255()) {
				var2.method7157(var22, var8, var9, this.field5125, this.field5115, -1);
			}

			if (!var13.method7255()) {
				var2.method7157(var13, var8, var9, this.field5127, this.field5115, -1);
			}

			if (!var14.method7255()) {
				var2.method7157(var14, var8, var9, this.field5125, this.field5115, -1);
			}

			if (this.field5126) {
				class462 var23 = var15.method7254();
				var17 = var8 + (Integer)var23.field4887;
				int var24 = var9 + (Integer)var23.field4888;
				var19 = var24 - var5;
				class499.method9010(var17, var24, var17, var19, this.field5125);
				if (-1 != this.field5115) {
					class499.method9010(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field5115);
				}
			}

		}
	}
}
