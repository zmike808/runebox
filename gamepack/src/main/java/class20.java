import java.io.IOException;
import java.util.concurrent.Callable;

public class class20 implements Callable {
	final class11 field107;
	// $FF: synthetic field
	final class15 this$0;

	class20(class15 var1, class11 var2) {
		this.this$0 = var1;
		this.field107 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field107.method92()) {
				class295.method5844(10L);
			}
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field107.method88();
	}

	static final void method295(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class209[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var2 + var12 > 0 && var12 + var2 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field2380[var12 + var2];
					var10000[var13 + var3] &= -16777217;
				}
			}
		}

		class489 var25 = new class489(var0);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
						int var16 = var2 + class306.method5756(var14 & 7, var15 & 7, var7);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var7 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var3 + var18;
						int var23 = (var14 & 7) + var8 + var2;
						int var24 = (var15 & 7) + var9 + var3;
						class373.method6937(var25, var1, var16, var22, var23, var24, var7);
					} else {
						class373.method6937(var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}
}
