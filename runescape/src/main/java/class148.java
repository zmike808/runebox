public class class148 extends class156 {
	int field1694;
	// $FF: synthetic field
	final class157 this$0;

	class148(class157 var1) {
		this.this$0 = var1;
		this.field1694 = -1;
	}

	void method3284(class489 var1) {
		this.field1694 = var1.method8660();
		var1.method8658();
		if (var1.method8658() != 255) {
			--var1.field4989;
			var1.method8681();
		}

	}

	void method3285(class160 var1) {
		var1.method3304(this.field1694);
	}

	static final void method3194(byte[] var0, int var1, int var2, class223 var3, class209[] var4) {
		class489 var6 = new class489(var0);
		int var7 = -1;

		while (true) {
			int var8 = var6.method8780();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;

			while (true) {
				int var10 = var6.method8827();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 63;
				int var12 = var9 >> 6 & 63;
				int var13 = var9 >> 12;
				int var14 = var6.method8658();
				int var15 = var14 >> 2;
				int var16 = var14 & 3;
				int var17 = var12 + var1;
				int var18 = var11 + var2;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if (2 == (class78.field1006[1][var17][var18] & 2)) {
						var19 = var13 - 1;
					}

					class209 var20 = null;
					if (var19 >= 0) {
						var20 = var4[var19];
					}

					class208.method4067(var13, var17, var18, var7, var16, var15, var3, var20);
				}
			}
		}
	}

	static final int method3196(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && 2 == (class78.field1006[1][var4][var5] & 2)) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = var7 * class78.field1002[var6][var4 + 1][var5] + class78.field1002[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * class78.field1002[var6][var4 + 1][var5 + 1] + class78.field1002[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var8 * var10 + var9 * (128 - var8) >> 7;
		} else {
			return 0;
		}
	}
}
