import java.util.Arrays;

public final class class426 {
	public static class426[] field4666;
	public static final class426 field4665;
	static int field4670;
	public float[] field4671;

	static {
		field4666 = new class426[0];
		method5313(100);
		field4665 = new class426();
	}

	public class426() {
		this.field4671 = new float[16];
		this.method7867();
	}

	public class426(class426 var1) {
		this.field4671 = new float[16];
		this.method7869(var1);
	}

	public class426(class489 var1, boolean var2) {
		this.field4671 = new float[16];
		this.method7864(var1, var2);
	}

	public void method7866() {
		class426[] var2;
		synchronized(var2 = field4666){}
		if (class134.field4668 < field4670 - 1) {
			field4666[++class134.field4668 - 1] = this;
		}

	}

	void method7864(class489 var1, boolean var2) {
		if (var2) {
			class427 var4 = new class427();
			var4.method7930(class440.method5751(var1.method8855()));
			var4.method7931(class440.method5751(var1.method8855()));
			var4.method7932(class440.method5751(var1.method8855()));
			var4.method7929((float)var1.method8855(), (float)var1.method8855(), (float)var1.method8855());
			this.method7875(var4);
		} else {
			for (int var5 = 0; var5 < 16; ++var5) {
				this.field4671[var5] = var1.method8666();
			}
		}

	}

	float[] method7865() {
		float[] var2 = new float[3];
		if ((double)this.field4671[2] < 0.999D && (double)this.field4671[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field4671[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field4671[6] / var3, (double)this.field4671[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field4671[1] / var3, (double)this.field4671[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field4671[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field4671[9]), (double)this.field4671[5]);
		}

		return var2;
	}

	public float[] method7863() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field4671[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field4671[2];
			var7 = (double)this.field4671[10];
			double var9 = (double)this.field4671[4];
			double var11 = (double)this.field4671[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field4671[1];
			var7 = (double)this.field4671[0];
			if (this.field4671[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	public void method7867() {
		this.field4671[0] = 1.0F;
		this.field4671[1] = 0.0F;
		this.field4671[2] = 0.0F;
		this.field4671[3] = 0.0F;
		this.field4671[4] = 0.0F;
		this.field4671[5] = 1.0F;
		this.field4671[6] = 0.0F;
		this.field4671[7] = 0.0F;
		this.field4671[8] = 0.0F;
		this.field4671[9] = 0.0F;
		this.field4671[10] = 1.0F;
		this.field4671[11] = 0.0F;
		this.field4671[12] = 0.0F;
		this.field4671[13] = 0.0F;
		this.field4671[14] = 0.0F;
		this.field4671[15] = 1.0F;
	}

	public void method7868() {
		this.field4671[0] = 0.0F;
		this.field4671[1] = 0.0F;
		this.field4671[2] = 0.0F;
		this.field4671[3] = 0.0F;
		this.field4671[4] = 0.0F;
		this.field4671[5] = 0.0F;
		this.field4671[6] = 0.0F;
		this.field4671[7] = 0.0F;
		this.field4671[8] = 0.0F;
		this.field4671[9] = 0.0F;
		this.field4671[10] = 0.0F;
		this.field4671[11] = 0.0F;
		this.field4671[12] = 0.0F;
		this.field4671[13] = 0.0F;
		this.field4671[14] = 0.0F;
		this.field4671[15] = 0.0F;
	}

	public void method7869(class426 var1) {
		System.arraycopy(var1.field4671, 0, this.field4671, 0, 16);
	}

	public void method7870(float var1) {
		this.method7908(var1, var1, var1);
	}

	public void method7908(float var1, float var2, float var3) {
		this.method7867();
		this.field4671[0] = var1;
		this.field4671[5] = var2;
		this.field4671[10] = var3;
	}

	public void method7872(class426 var1) {
		for (int var3 = 0; var3 < this.field4671.length; ++var3) {
			float[] var10000 = this.field4671;
			var10000[var3] += var1.field4671[var3];
		}

	}

	public void method7873(class426 var1) {
		float var3 = this.field4671[3] * var1.field4671[12] + this.field4671[2] * var1.field4671[8] + var1.field4671[4] * this.field4671[1] + var1.field4671[0] * this.field4671[0];
		float var4 = var1.field4671[13] * this.field4671[3] + var1.field4671[1] * this.field4671[0] + this.field4671[1] * var1.field4671[5] + var1.field4671[9] * this.field4671[2];
		float var5 = this.field4671[0] * var1.field4671[2] + var1.field4671[6] * this.field4671[1] + this.field4671[2] * var1.field4671[10] + var1.field4671[14] * this.field4671[3];
		float var6 = this.field4671[2] * var1.field4671[11] + this.field4671[1] * var1.field4671[7] + this.field4671[0] * var1.field4671[3] + this.field4671[3] * var1.field4671[15];
		float var7 = this.field4671[5] * var1.field4671[4] + this.field4671[4] * var1.field4671[0] + var1.field4671[8] * this.field4671[6] + this.field4671[7] * var1.field4671[12];
		float var8 = var1.field4671[13] * this.field4671[7] + this.field4671[6] * var1.field4671[9] + this.field4671[5] * var1.field4671[5] + var1.field4671[1] * this.field4671[4];
		float var9 = var1.field4671[2] * this.field4671[4] + this.field4671[5] * var1.field4671[6] + var1.field4671[10] * this.field4671[6] + var1.field4671[14] * this.field4671[7];
		float var10 = this.field4671[6] * var1.field4671[11] + var1.field4671[3] * this.field4671[4] + var1.field4671[7] * this.field4671[5] + this.field4671[7] * var1.field4671[15];
		float var11 = var1.field4671[0] * this.field4671[8] + this.field4671[9] * var1.field4671[4] + var1.field4671[8] * this.field4671[10] + this.field4671[11] * var1.field4671[12];
		float var12 = var1.field4671[13] * this.field4671[11] + this.field4671[9] * var1.field4671[5] + var1.field4671[1] * this.field4671[8] + this.field4671[10] * var1.field4671[9];
		float var13 = this.field4671[11] * var1.field4671[14] + var1.field4671[6] * this.field4671[9] + var1.field4671[2] * this.field4671[8] + this.field4671[10] * var1.field4671[10];
		float var14 = var1.field4671[3] * this.field4671[8] + var1.field4671[7] * this.field4671[9] + this.field4671[10] * var1.field4671[11] + this.field4671[11] * var1.field4671[15];
		float var15 = this.field4671[14] * var1.field4671[8] + var1.field4671[4] * this.field4671[13] + this.field4671[12] * var1.field4671[0] + this.field4671[15] * var1.field4671[12];
		float var16 = this.field4671[12] * var1.field4671[1] + this.field4671[13] * var1.field4671[5] + this.field4671[14] * var1.field4671[9] + this.field4671[15] * var1.field4671[13];
		float var17 = var1.field4671[14] * this.field4671[15] + var1.field4671[2] * this.field4671[12] + this.field4671[13] * var1.field4671[6] + var1.field4671[10] * this.field4671[14];
		float var18 = var1.field4671[7] * this.field4671[13] + this.field4671[12] * var1.field4671[3] + this.field4671[14] * var1.field4671[11] + var1.field4671[15] * this.field4671[15];
		this.field4671[0] = var3;
		this.field4671[1] = var4;
		this.field4671[2] = var5;
		this.field4671[3] = var6;
		this.field4671[4] = var7;
		this.field4671[5] = var8;
		this.field4671[6] = var9;
		this.field4671[7] = var10;
		this.field4671[8] = var11;
		this.field4671[9] = var12;
		this.field4671[10] = var13;
		this.field4671[11] = var14;
		this.field4671[12] = var15;
		this.field4671[13] = var16;
		this.field4671[14] = var17;
		this.field4671[15] = var18;
	}

	public void method7874(class425 var1) {
		float var3 = var1.field4664 * var1.field4664;
		float var4 = var1.field4664 * var1.field4661;
		float var5 = var1.field4662 * var1.field4664;
		float var6 = var1.field4664 * var1.field4663;
		float var7 = var1.field4661 * var1.field4661;
		float var8 = var1.field4661 * var1.field4662;
		float var9 = var1.field4663 * var1.field4661;
		float var10 = var1.field4662 * var1.field4662;
		float var11 = var1.field4663 * var1.field4662;
		float var12 = var1.field4663 * var1.field4663;
		this.field4671[0] = var7 + var3 - var12 - var10;
		this.field4671[1] = var6 + var8 + var6 + var8;
		this.field4671[2] = var9 + (var9 - var5 - var5);
		this.field4671[4] = var8 + (var8 - var6 - var6);
		this.field4671[5] = var10 + var3 - var7 - var12;
		this.field4671[6] = var11 + var4 + var11 + var4;
		this.field4671[8] = var5 + var9 + var5 + var9;
		this.field4671[9] = var11 - var4 - var4 + var11;
		this.field4671[10] = var3 + var12 - var10 - var7;
	}

	void method7875(class427 var1) {
		this.field4671[0] = var1.field4687;
		this.field4671[1] = var1.field4676;
		this.field4671[2] = var1.field4677;
		this.field4671[3] = 0.0F;
		this.field4671[4] = var1.field4678;
		this.field4671[5] = var1.field4679;
		this.field4671[6] = var1.field4680;
		this.field4671[7] = 0.0F;
		this.field4671[8] = var1.field4681;
		this.field4671[9] = var1.field4682;
		this.field4671[10] = var1.field4683;
		this.field4671[11] = 0.0F;
		this.field4671[12] = var1.field4684;
		this.field4671[13] = var1.field4685;
		this.field4671[14] = var1.field4686;
		this.field4671[15] = 1.0F;
	}

	float method7876() {
		return this.field4671[8] * this.field4671[7] * this.field4671[2] * this.field4671[13] + this.field4671[2] * this.field4671[5] * this.field4671[11] * this.field4671[12] + (this.field4671[4] * this.field4671[2] * this.field4671[9] * this.field4671[15] + this.field4671[12] * this.field4671[1] * this.field4671[7] * this.field4671[10] + (this.field4671[8] * this.field4671[6] * this.field4671[1] * this.field4671[15] + this.field4671[14] * this.field4671[1] * this.field4671[4] * this.field4671[11] + (this.field4671[0] * this.field4671[7] * this.field4671[9] * this.field4671[14] + this.field4671[0] * this.field4671[6] * this.field4671[11] * this.field4671[13] + (this.field4671[5] * this.field4671[0] * this.field4671[10] * this.field4671[15] - this.field4671[14] * this.field4671[5] * this.field4671[0] * this.field4671[11] - this.field4671[15] * this.field4671[0] * this.field4671[6] * this.field4671[9]) - this.field4671[10] * this.field4671[0] * this.field4671[7] * this.field4671[13] - this.field4671[1] * this.field4671[4] * this.field4671[10] * this.field4671[15]) - this.field4671[12] * this.field4671[11] * this.field4671[1] * this.field4671[6] - this.field4671[14] * this.field4671[1] * this.field4671[7] * this.field4671[8]) - this.field4671[2] * this.field4671[4] * this.field4671[11] * this.field4671[13] - this.field4671[15] * this.field4671[2] * this.field4671[5] * this.field4671[8]) - this.field4671[12] * this.field4671[9] * this.field4671[2] * this.field4671[7] - this.field4671[9] * this.field4671[3] * this.field4671[4] * this.field4671[14] + this.field4671[13] * this.field4671[10] * this.field4671[4] * this.field4671[3] + this.field4671[3] * this.field4671[5] * this.field4671[8] * this.field4671[14] - this.field4671[12] * this.field4671[5] * this.field4671[3] * this.field4671[10] - this.field4671[8] * this.field4671[6] * this.field4671[3] * this.field4671[13] + this.field4671[12] * this.field4671[3] * this.field4671[6] * this.field4671[9];
	}

	public void method7884() {
		float var2 = 1.0F / this.method7876();
		float var3 = var2 * (this.field4671[7] * this.field4671[9] * this.field4671[14] + this.field4671[11] * this.field4671[6] * this.field4671[13] + (this.field4671[5] * this.field4671[10] * this.field4671[15] - this.field4671[14] * this.field4671[5] * this.field4671[11] - this.field4671[6] * this.field4671[9] * this.field4671[15]) - this.field4671[13] * this.field4671[7] * this.field4671[10]);
		float var4 = (-this.field4671[1] * this.field4671[10] * this.field4671[15] + this.field4671[1] * this.field4671[11] * this.field4671[14] + this.field4671[15] * this.field4671[2] * this.field4671[9] - this.field4671[11] * this.field4671[2] * this.field4671[13] - this.field4671[14] * this.field4671[3] * this.field4671[9] + this.field4671[3] * this.field4671[10] * this.field4671[13]) * var2;
		float var5 = var2 * (this.field4671[7] * this.field4671[2] * this.field4671[13] + (this.field4671[15] * this.field4671[6] * this.field4671[1] - this.field4671[1] * this.field4671[7] * this.field4671[14] - this.field4671[15] * this.field4671[5] * this.field4671[2]) + this.field4671[14] * this.field4671[3] * this.field4671[5] - this.field4671[6] * this.field4671[3] * this.field4671[13]);
		float var6 = var2 * (this.field4671[9] * this.field4671[3] * this.field4671[6] + (this.field4671[5] * this.field4671[2] * this.field4671[11] + this.field4671[1] * this.field4671[7] * this.field4671[10] + this.field4671[11] * this.field4671[6] * -this.field4671[1] - this.field4671[9] * this.field4671[2] * this.field4671[7] - this.field4671[10] * this.field4671[3] * this.field4671[5]));
		float var7 = var2 * (this.field4671[12] * this.field4671[10] * this.field4671[7] + (this.field4671[15] * this.field4671[8] * this.field4671[6] + this.field4671[11] * this.field4671[4] * this.field4671[14] + this.field4671[15] * -this.field4671[4] * this.field4671[10] - this.field4671[6] * this.field4671[11] * this.field4671[12] - this.field4671[7] * this.field4671[8] * this.field4671[14]));
		float var8 = (this.field4671[12] * this.field4671[2] * this.field4671[11] + (this.field4671[15] * this.field4671[10] * this.field4671[0] - this.field4671[14] * this.field4671[11] * this.field4671[0] - this.field4671[8] * this.field4671[2] * this.field4671[15]) + this.field4671[14] * this.field4671[3] * this.field4671[8] - this.field4671[12] * this.field4671[3] * this.field4671[10]) * var2;
		float var9 = var2 * (this.field4671[12] * this.field4671[6] * this.field4671[3] + (this.field4671[15] * -this.field4671[0] * this.field4671[6] + this.field4671[14] * this.field4671[7] * this.field4671[0] + this.field4671[2] * this.field4671[4] * this.field4671[15] - this.field4671[2] * this.field4671[7] * this.field4671[12] - this.field4671[14] * this.field4671[4] * this.field4671[3]));
		float var10 = var2 * (this.field4671[4] * this.field4671[3] * this.field4671[10] + this.field4671[8] * this.field4671[7] * this.field4671[2] + (this.field4671[0] * this.field4671[6] * this.field4671[11] - this.field4671[10] * this.field4671[7] * this.field4671[0] - this.field4671[11] * this.field4671[2] * this.field4671[4]) - this.field4671[6] * this.field4671[3] * this.field4671[8]);
		float var11 = var2 * (this.field4671[13] * this.field4671[7] * this.field4671[8] + this.field4671[5] * this.field4671[11] * this.field4671[12] + (this.field4671[15] * this.field4671[9] * this.field4671[4] - this.field4671[4] * this.field4671[11] * this.field4671[13] - this.field4671[8] * this.field4671[5] * this.field4671[15]) - this.field4671[12] * this.field4671[7] * this.field4671[9]);
		float var12 = var2 * (this.field4671[9] * -this.field4671[0] * this.field4671[15] + this.field4671[0] * this.field4671[11] * this.field4671[13] + this.field4671[1] * this.field4671[8] * this.field4671[15] - this.field4671[1] * this.field4671[11] * this.field4671[12] - this.field4671[8] * this.field4671[3] * this.field4671[13] + this.field4671[12] * this.field4671[9] * this.field4671[3]);
		float var13 = var2 * (this.field4671[5] * this.field4671[0] * this.field4671[15] - this.field4671[13] * this.field4671[0] * this.field4671[7] - this.field4671[1] * this.field4671[4] * this.field4671[15] + this.field4671[12] * this.field4671[7] * this.field4671[1] + this.field4671[3] * this.field4671[4] * this.field4671[13] - this.field4671[3] * this.field4671[5] * this.field4671[12]);
		float var14 = (this.field4671[4] * this.field4671[1] * this.field4671[11] + this.field4671[9] * this.field4671[0] * this.field4671[7] + -this.field4671[0] * this.field4671[5] * this.field4671[11] - this.field4671[1] * this.field4671[7] * this.field4671[8] - this.field4671[3] * this.field4671[4] * this.field4671[9] + this.field4671[3] * this.field4671[5] * this.field4671[8]) * var2;
		float var15 = (this.field4671[12] * this.field4671[9] * this.field4671[6] + (this.field4671[9] * -this.field4671[4] * this.field4671[14] + this.field4671[4] * this.field4671[10] * this.field4671[13] + this.field4671[8] * this.field4671[5] * this.field4671[14] - this.field4671[12] * this.field4671[10] * this.field4671[5] - this.field4671[8] * this.field4671[6] * this.field4671[13])) * var2;
		float var16 = (this.field4671[12] * this.field4671[1] * this.field4671[10] + (this.field4671[9] * this.field4671[0] * this.field4671[14] - this.field4671[10] * this.field4671[0] * this.field4671[13] - this.field4671[14] * this.field4671[1] * this.field4671[8]) + this.field4671[8] * this.field4671[2] * this.field4671[13] - this.field4671[2] * this.field4671[9] * this.field4671[12]) * var2;
		float var17 = var2 * (this.field4671[14] * this.field4671[1] * this.field4671[4] + this.field4671[5] * -this.field4671[0] * this.field4671[14] + this.field4671[6] * this.field4671[0] * this.field4671[13] - this.field4671[12] * this.field4671[1] * this.field4671[6] - this.field4671[4] * this.field4671[2] * this.field4671[13] + this.field4671[5] * this.field4671[2] * this.field4671[12]);
		float var18 = var2 * (this.field4671[10] * this.field4671[5] * this.field4671[0] - this.field4671[9] * this.field4671[6] * this.field4671[0] - this.field4671[10] * this.field4671[1] * this.field4671[4] + this.field4671[8] * this.field4671[1] * this.field4671[6] + this.field4671[4] * this.field4671[2] * this.field4671[9] - this.field4671[8] * this.field4671[5] * this.field4671[2]);
		this.field4671[0] = var3;
		this.field4671[1] = var4;
		this.field4671[2] = var5;
		this.field4671[3] = var6;
		this.field4671[4] = var7;
		this.field4671[5] = var8;
		this.field4671[6] = var9;
		this.field4671[7] = var10;
		this.field4671[8] = var11;
		this.field4671[9] = var12;
		this.field4671[10] = var13;
		this.field4671[11] = var14;
		this.field4671[12] = var15;
		this.field4671[13] = var16;
		this.field4671[14] = var17;
		this.field4671[15] = var18;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7863();
		this.method7865();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4671[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4671);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class426)) {
			return false;
		} else {
			class426 var2 = (class426)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4671[var3] != this.field4671[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public float[] method7909() {
		float[] var2 = new float[3];
		class424 var3 = new class424(this.field4671[0], this.field4671[1], this.field4671[2]);
		class424 var4 = new class424(this.field4671[4], this.field4671[5], this.field4671[6]);
		class424 var5 = new class424(this.field4671[8], this.field4671[9], this.field4671[10]);
		var2[0] = var3.method7830();
		var2[1] = var4.method7830();
		var2[2] = var5.method7830();
		return var2;
	}

	static void method5313(int var0) {
		field4670 = var0;
		field4666 = new class426[var0];
		class134.field4668 = 0;
	}
}
