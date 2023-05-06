public class class187 {
	static String method3620(class464 var0, int var1, String var2) {
		if (null == var0) {
			return var2;
		} else {
			class445 var4 = (class445)var0.method8360((long)var1);
			return var4 == null ? var2 : (String)var4.field4741;
		}
	}

	static final boolean method3606(int var0, int var1, int var2, int var3, int var4) {
		class90 var6 = null;

		for (class90 var7 = (class90)Client.field574.method6716(); var7 != null; var7 = (class90)Client.field574.method6725()) {
			if (var0 == var7.field1131 && var1 == var7.field1121 && var2 == var7.field1122 && var7.field1120 == var3) {
				var6 = var7;
				break;
			}
		}

		if (var6 != null) {
			var6.field1136 = var4;
			return true;
		} else {
			return false;
		}
	}
}
