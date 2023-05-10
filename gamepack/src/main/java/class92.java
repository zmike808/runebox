public class class92 extends class449 {
	int field1216;
	int field1217;
	int field1218;
	int field1219;

	class92(int var1, int var2, int var3, int var4) {
		this.field1218 = var1;
		this.field1217 = var2;
		this.field1216 = var3;
		this.field1219 = var4;
	}

	void method2347(int var1, int var2, int var3, int var4) {
		this.field1218 = var1;
		this.field1217 = var2;
		this.field1216 = var3;
		this.field1219 = var4;
	}

	public static class202 method2352(int var0) {
		class202 var2 = (class202)class202.field2214.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class23.field4311.method6468(10, var0);
			var2 = new class202();
			var2.field2262 = var0;
			if (null != var3) {
				var2.method3899(new class489(var3));
			}

			var2.method3961();
			if (-1 != var2.field2254) {
				var2.method3903(method2352(var2.field2254), method2352(var2.field2253));
			}

			if (var2.field2265 != -1) {
				var2.method3904(method2352(var2.field2265), method2352(var2.field2241));
			}

			if (var2.field2267 != -1) {
				var2.method3901(method2352(var2.field2267), method2352(var2.field2266));
			}

			if (!class72.field1844 && var2.field2231) {
				var2.field2261 = class337.field3995;
				var2.field2263 = false;

				int var4;
				for (var4 = 0; var4 < var2.field2220.length; ++var4) {
					var2.field2220[var4] = null;
				}

				for (var4 = 0; var4 < var2.field2237.length; ++var4) {
					if (var4 != 4) {
						var2.field2237[var4] = null;
					}
				}

				var2.field2238 = -2;
				var2.field2255 = 0;
				if (var2.field2248 != null) {
					boolean var7 = false;

					for (class449 var5 = var2.field2248.method8363(); null != var5; var5 = var2.field2248.method8366()) {
						class198 var6 = class198.method513((int)var5.field4745);
						if (var6.field2117) {
							var5.method8051();
						} else {
							var7 = true;
						}
					}

					if (!var7) {
						var2.field2248 = null;
					}
				}
			}

			class202.field2214.method5463(var2, (long)var0);
			return var2;
		}
	}
}
