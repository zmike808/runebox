public class class124 implements class357 {
	static final class124 field1488;
	static final class124 field1490;
	static final class124 field1491;
	static final class124 field1492;
	static final class124 field1497;
	final int field1494;
	final int field1496;

	static {
		field1497 = new class124(0, 0);
		field1488 = new class124(1, 1);
		field1490 = new class124(2, 2);
		field1491 = new class124(3, 3);
		field1492 = new class124(4, 4);
	}

	class124(int var1, int var2) {
		this.field1496 = var1;
		this.field1494 = var2;
	}

	public int method6674() {
		return this.field1494;
	}

	static void method2990(class64[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var2 + var1) / 2;
			class64 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var7].field805;
							var13 = var9.field805;
						} else if (1 == var3[var11]) {
							var12 = var0[var7].field798;
							var13 = var9.field798;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (3 == var3[var11]) {
							var12 = var0[var7].method1717() ? 1 : 0;
							var13 = var9.method1717() ? 1 : 0;
						} else {
							var12 = var0[var7].field802;
							var13 = var9.field802;
						}

						if (var13 != var12) {
							if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var6].field805;
							var13 = var9.field805;
						} else if (var3[var11] == 1) {
							var12 = var0[var6].field798;
							var13 = var9.field798;
							if (var12 == -1 && 1 == var4[var11]) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (3 == var3[var11]) {
							var12 = var0[var6].method1717() ? 1 : 0;
							var13 = var9.method1717() ? 1 : 0;
						} else {
							var12 = var0[var6].field802;
							var13 = var9.field802;
						}

						if (var12 != var13) {
							if ((1 != var4[var11] || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					class64 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method2990(var0, var1, var7, var3, var4);
			method2990(var0, var7 + 1, var2, var3, var4);
		}

	}

	static class124[] method2698() {
		return new class124[]{field1497, field1488, field1490, field1491, field1492};
	}
}
