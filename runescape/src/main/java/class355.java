import java.util.HashMap;

public class class355 {
	static int[] field1074;
	class421 field4302;
	int field4305;
	int[] field4303;
	int[] field4306;
	final HashMap field4304;

	public class355() {
		this.field4304 = new HashMap();
		this.field4302 = new class421(0, 0);
		this.field4303 = new int[2048];
		this.field4306 = new int[2048];
		this.field4305 = 0;
		field1074 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class113.method2847((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			field1074[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field1074.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class113.method2847((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field1074.length; ++var1) {
				field1074[var1] = var5;
			}
		}

	}

	void method6652(int var1) {
		int var3 = 1 + var1 * 2;
		double var5 = (double)((float)var1 / 3.0F);
		int var7 = var1 * 2 + 1;
		double[] var8 = new double[var7];
		int var9 = -var1;

		for (int var10 = 0; var9 <= var1; ++var10) {
			var8[var10] = class422.method391((double)var9, 0.0D, var5);
			++var9;
		}

		double[] var15 = var8;
		double var16 = var8[var1] * var8[var1];
		int[] var17 = new int[var3 * var3];
		boolean var11 = false;

		for (int var12 = 0; var12 < var3; ++var12) {
			for (int var13 = 0; var13 < var3; ++var13) {
				int var14 = var17[var13 + var12 * var3] = (int)(var15[var12] * var15[var13] / var16 * 256.0D);
				if (!var11 && var14 > 0) {
					var11 = true;
				}
			}
		}

		class503 var18 = new class503(var17, var3, var3);
		this.field4304.put(var1, var18);
	}

	class503 method6653(int var1) {
		if (!this.field4304.containsKey(var1)) {
			this.method6652(var1);
		}

		return (class503)this.field4304.get(var1);
	}

	public final void method6654(int var1, int var2) {
		if (this.field4305 < this.field4303.length) {
			this.field4303[this.field4305] = var1;
			this.field4306[this.field4305] = var2;
			++this.field4305;
		}
	}

	public final void method6659() {
		this.field4305 = 0;
	}

	public final void method6658(int var1, int var2, class503 var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		class503 var7 = this.method6653(var6);
		int var8 = 1 + var6 * 2;
		class421 var9 = new class421(0, 0, var3.field5088, var3.field5093);
		class421 var10 = new class421(0, 0);
		this.field4302.method7788(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field4305; ++var11) {
			var12 = this.field4303[var11];
			var13 = this.field4306[var11];
			int var14 = (int)((float)(var12 - var1) * var4) - var6;
			int var15 = (int)((float)var3.field5093 - var4 * (float)(var13 - var2)) - var6;
			this.field4302.method7790(var14, var15);
			this.field4302.method7805(var9, var10);
			this.method6655(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field5089.length; ++var11) {
			if (0 == var3.field5089[var11]) {
				var3.field5089[var11] = -16777216;
			} else {
				var12 = (var3.field5089[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field5089[var11] = -16777216;
				} else {
					if (var12 > field1074.length) {
						var12 = field1074.length;
					}

					var13 = field1074[var12 - 1];
					var3.field5089[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	void method6655(class503 var1, class503 var2, class421 var3) {
		if (0 != var3.field4648 && var3.field4651 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (0 == var3.field4650) {
				var5 = var1.field5088 - var3.field4648;
			}

			if (0 == var3.field4649) {
				var6 = var1.field5093 - var3.field4651;
			}

			int var7 = var1.field5088 * var6 + var5;
			int var8 = var3.field4649 * var2.field5088 + var3.field4650;

			for (int var9 = 0; var9 < var3.field4651; ++var9) {
				for (int var10 = 0; var10 < var3.field4648; ++var10) {
					int[] var10000 = var2.field5089;
					int var10001 = var8++;
					var10000[var10001] += var1.field5089[var7++];
				}

				var7 += var1.field5088 - var3.field4648;
				var8 += var2.field5088 - var3.field4648;
			}

		}
	}

	public static class183 method6671(int var0) {
		return var0 >= 0 && var0 < class183.field1915.length && class183.field1915[var0] != null ? class183.field1915[var0] : new class183(var0);
	}
}
