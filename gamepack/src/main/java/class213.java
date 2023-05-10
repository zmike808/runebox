public final class class213 {
	class225 field2406;
	class225 field2407;
	class225 field2408;
	int field2403;
	int field2404;
	int field2405;
	int field2410;
	long field2409;

	class213() {
	}

	static final void method4152(boolean var0, class488 var1) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var1.method8635(Client.field753.field1388) >= var3 + 12) {
				int var5 = var1.method8607(var3);
				if (var4 - 1 != var5) {
					boolean var6 = false;
					if (null == Client.field546[var5]) {
						Client.field546[var5] = new class96();
						var6 = true;
					}

					class96 var7 = Client.field546[var5];
					Client.field548[++Client.field737 - 1] = var5;
					var7.field1195 = Client.field602;
					int var10;
					if (var0) {
						var10 = var1.method8607(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method8607(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					boolean var11 = var1.method8607(1) == 1;
					if (var11) {
						var1.method8607(32);
					}

					int var12 = var1.method8607(1);
					if (var12 == 1) {
						Client.field550[++Client.field549 - 1] = var5;
					}

					int var8 = var1.method8607(1);
					var7.field1277 = class191.method6482(var1.method8607(14));
					int var9;
					if (var0) {
						var9 = var1.method8607(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method8607(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					int var13 = Client.field694[var1.method8607(3)];
					if (var6) {
						var7.field1168 = var7.field1144 = var13;
					}

					Client.method3168(var7);
					if (var7.field1191 == 0) {
						var7.field1144 = 0;
					}

					var7.method2507(var9 + Client.field3454.field1174[0], var10 + Client.field3454.field1176[0], var8 == 1);
					continue;
				}
			}

			var1.method8608();
			return;
		}
	}
}
