public class class297 {
	byte[] field3374;
	byte[] field3375;
	int field3376;
	int field3377;
	int field3378;
	int field3379;
	int field3380;
	int field3381;
	int field3382;

	class297() {
	}

	public static class502 method5550(class344 var0, String var1, String var2) {
		if (!var0.method6466(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method6464(var1);
			int var5 = var0.method6450(var4, var2);
			byte[] var8 = var0.method6468(var4, var5);
			boolean var7;
			if (var8 == null) {
				var7 = false;
			} else {
				class486.method8595(var8);
				var7 = true;
			}

			class502 var6;
			if (!var7) {
				var6 = null;
			} else {
				var6 = class337.method6356();
			}

			return var6;
		}
	}
}
