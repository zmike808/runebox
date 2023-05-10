public class class336 {
	static {
		int var0 = 0;
		int var1 = 0;
		class331[] var2 = class331.method18();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class331 var4 = var2[var3];
			if (var4.field3797 > var0) {
				var0 = var4.field3797;
			}

			if (var4.field3798 > var1) {
				var1 = var4.field3798;
			}
		}

	}

	static final void method6355(class317 var0) {
		String var2;
		int var3;
		int var4;
		if (1 == var0.field3573) {
			var2 = var0.field3700;
			var3 = var0.field3570;
			var4 = var0.field3703;
			Client.method4754(var2, "", 24, 0, 0, var3, var4, false);
		}

		if (var0.field3573 == 2 && !Client.field651) {
			var2 = Client.method5750(var0);
			if (var2 != null) {
				Client.method3141(var2, class97.method7285(65280) + var0.field3699, 25, 0, -1, var0.field3570, var0.field3703);
			}
		}

		if (var0.field3573 == 3) {
			Client.method1986(class337.field4145, "", 26, 0, 0, var0.field3570);
		}

		if (4 == var0.field3573) {
			Client.method1986(var0.field3700, "", 28, 0, 0, var0.field3570);
		}

		if (var0.field3573 == 5) {
			Client.method1986(var0.field3700, "", 29, 0, 0, var0.field3570);
		}

		if (6 == var0.field3573 && Client.field661 == null) {
			Client.method1986(var0.field3700, "", 30, 0, -1, var0.field3570);
		}

		if (var0.field3651) {
			if (Client.field651) {
				if (class84.method2202(class26.method353(var0)) && (Client.field958 & 32) == 32) {
					Client.method3141(Client.field663, Client.field655 + " " + class97.field1284 + " " + var0.field3650, 58, 0, var0.field3571, var0.field3570, var0.field3703);
				}
			} else {
				for (int var7 = 9; var7 >= 5; --var7) {
					int var5 = class26.method353(var0);
					boolean var9 = 0 != (var5 >> var7 + 1 & 1);
					String var8;
					if (!var9 && null == var0.field3677) {
						var8 = null;
					} else if (null != var0.field3648 && var0.field3648.length > var7 && null != var0.field3648[var7] && var0.field3648[var7].trim().length() != 0) {
						var8 = var0.field3648[var7];
					} else {
						var8 = null;
					}

					if (var8 != null) {
						Client.method3141(var8, var0.field3650, 1007, var7 + 1, var0.field3571, var0.field3570, var0.field3703);
					}
				}

				var2 = Client.method5750(var0);
				if (null != var2) {
					Client.method3141(var2, var0.field3650, 25, 0, var0.field3571, var0.field3570, var0.field3703);
				}

				for (var3 = 4; var3 >= 0; --var3) {
					int var6 = class26.method353(var0);
					boolean var12 = 0 != (var6 >> var3 + 1 & 1);
					String var10;
					if (!var12 && null == var0.field3677) {
						var10 = null;
					} else if (var0.field3648 != null && var0.field3648.length > var3 && var0.field3648[var3] != null && var0.field3648[var3].trim().length() != 0) {
						var10 = var0.field3648[var3];
					} else {
						var10 = null;
					}

					if (null != var10) {
						Client.method4754(var10, var0.field3650, 57, var3 + 1, var0.field3571, var0.field3570, var0.field3703, var0.field3719);
					}
				}

				var4 = class26.method353(var0);
				boolean var11 = (var4 & 1) != 0;
				if (var11) {
					Client.method1986(class337.field3842, "", 30, 0, var0.field3571, var0.field3570);
				}
			}
		}

	}
}
