public class class89 {
	static final boolean method2303(int var0, int var1, class210 var2, class209 var3) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class212.field2402[var7][var8] = 99;
		class212.field2397[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class212.field2398[var11] = var0;
		byte var10001 = var11;
		int var19 = var11 + 1;
		class212.field2396[var10001] = var1;
		int[][] var13 = var3.field2380;

		while (var12 != var19) {
			var5 = class212.field2398[var12];
			var6 = class212.field2396[var12];
			var12 = var12 + 1 & 4095;
			int var17 = var5 - var9;
			int var18 = var6 - var10;
			int var14 = var5 - var3.field2375;
			int var15 = var6 - var3.field2377;
			if (var2.method4127(1, var5, var6, var3)) {
				class212.field95 = var5;
				class212.field4535 = var6;
				return true;
			}

			int var16 = 1 + class212.field2397[var17][var18];
			if (var17 > 0 && class212.field2402[var17 - 1][var18] == 0 && 0 == (var13[var14 - 1][var15] & 19136776)) {
				class212.field2398[var19] = var5 - 1;
				class212.field2396[var19] = var6;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17 - 1][var18] = 2;
				class212.field2397[var17 - 1][var18] = var16;
			}

			if (var17 < 127 && 0 == class212.field2402[var17 + 1][var18] && 0 == (var13[var14 + 1][var15] & 19136896)) {
				class212.field2398[var19] = var5 + 1;
				class212.field2396[var19] = var6;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17 + 1][var18] = 8;
				class212.field2397[var17 + 1][var18] = var16;
			}

			if (var18 > 0 && class212.field2402[var17][var18 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
				class212.field2398[var19] = var5;
				class212.field2396[var19] = var6 - 1;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17][var18 - 1] = 1;
				class212.field2397[var17][var18 - 1] = var16;
			}

			if (var18 < 127 && 0 == class212.field2402[var17][var18 + 1] && 0 == (var13[var14][var15 + 1] & 19136800)) {
				class212.field2398[var19] = var5;
				class212.field2396[var19] = var6 + 1;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17][var18 + 1] = 4;
				class212.field2397[var17][var18 + 1] = var16;
			}

			if (var17 > 0 && var18 > 0 && 0 == class212.field2402[var17 - 1][var18 - 1] && (var13[var14 - 1][var15 - 1] & 19136782) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
				class212.field2398[var19] = var5 - 1;
				class212.field2396[var19] = var6 - 1;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17 - 1][var18 - 1] = 3;
				class212.field2397[var17 - 1][var18 - 1] = var16;
			}

			if (var17 < 127 && var18 > 0 && class212.field2402[var17 + 1][var18 - 1] == 0 && 0 == (var13[var14 + 1][var15 - 1] & 19136899) && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
				class212.field2398[var19] = var5 + 1;
				class212.field2396[var19] = var6 - 1;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17 + 1][var18 - 1] = 9;
				class212.field2397[var17 + 1][var18 - 1] = var16;
			}

			if (var17 > 0 && var18 < 127 && 0 == class212.field2402[var17 - 1][var18 + 1] && (var13[var14 - 1][var15 + 1] & 19136824) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][var15 + 1] & 19136800) == 0) {
				class212.field2398[var19] = var5 - 1;
				class212.field2396[var19] = var6 + 1;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17 - 1][var18 + 1] = 6;
				class212.field2397[var17 - 1][var18 + 1] = var16;
			}

			if (var17 < 127 && var18 < 127 && class212.field2402[var17 + 1][var18 + 1] == 0 && 0 == (var13[var14 + 1][var15 + 1] & 19136992) && (var13[var14 + 1][var15] & 19136896) == 0 && 0 == (var13[var14][var15 + 1] & 19136800)) {
				class212.field2398[var19] = var5 + 1;
				class212.field2396[var19] = var6 + 1;
				var19 = var19 + 1 & 4095;
				class212.field2402[var17 + 1][var18 + 1] = 12;
				class212.field2397[var17 + 1][var18 + 1] = var16;
			}
		}

		class212.field95 = var5;
		class212.field4535 = var6;
		return false;
	}
}
