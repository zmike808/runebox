public abstract class class221 extends class499 {
	boolean field2528;
	boolean field2532;
	class237 field2531;
	int[] field2530;

	class221(class237 var1) {
		this.field2532 = false;
		this.field2528 = false;
		this.field2530 = class219.field2517;
		this.field2531 = var1;
	}

	abstract void method4325(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	abstract void method4326(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	abstract void method4327(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	abstract void method4351(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	void method4323(int[] var1, int var2, int var3, float[] var4) {
		method8979(var1, var2, var3, var4);
	}

	void method4324(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method3328(var10, var13, var14, var15, var16);
		var11 = method3328(var11, var13, var14, var15, var16);
		var12 = method3328(var12, var13, var14, var15, var16);
		this.method4326(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	void method4358(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var16 = method3328(var10, var11, var12, var13, var14);
		var10 = this.field2530[var16];
		this.method4327(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	static int method3328(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var6 = var0 >> 10 & 63;
		int var7 = var0 >> 7 & 7;
		int var8 = var0 & 127;
		int var9 = var4 & 255;
		if (var1 != -1) {
			var6 += var9 * (var1 - var6) >> 7;
		}

		if (var2 != -1) {
			var7 += (var2 - var7) * var9 >> 7;
		}

		if (var3 != -1) {
			var8 += var9 * (var3 - var8) >> 7;
		}

		return (var6 << 10 | var7 << 7 | var8) & 65535;
	}

	static void method4339(int var0, class308 var1, boolean var2) {
		class249 var4 = Client.method2302().method8168(var0);
		int var5 = Client.field3454.field1106;
		int var6 = (Client.field3454.field1171 >> 7) + Client.field2850;
		int var7 = Client.field2841 + (Client.field3454.field1138 >> 7);
		class308 var8 = new class308(var5, var6, var7);
		Client.method2302().method8177(var4, var8, var1, var2);
	}
}
