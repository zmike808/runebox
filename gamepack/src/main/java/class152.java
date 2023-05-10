public class class152 extends class156 {
	byte field1738;
	int field1739;
	String field1740;
	// $FF: synthetic field
	final class157 this$0;

	class152(class157 var1) {
		this.this$0 = var1;
		this.field1740 = null;
	}

	void method3284(class489 var1) {
		if (var1.method8658() != 255) {
			--var1.field4989;
			var1.method8681();
		}

		this.field1740 = var1.method8715();
		this.field1739 = var1.method8660();
		this.field1738 = var1.method8659();
		var1.method8681();
	}

	void method3285(class160 var1) {
		class142 var3 = new class142();
		var3.field1652 = new class513(this.field1740);
		var3.field1655 = this.field1739;
		var3.field1650 = this.field1738;
		var1.method3318(var3);
	}

	static final void method3270(int var0, int var1) {
		class160 var3 = var0 >= 0 ? Client.field679[var0] : Client.field253;
		if (var3 != null && var1 >= 0 && var1 < var3.method3303()) {
			class142 var4 = (class142)var3.field1770.get(var1);
			if (var4.field1650 == -1) {
				String var5 = var4.field1652.method9256();
				class289 var6 = class331.method6337(class287.field3186, Client.field753.field1385);
				var6.field3212.method8695(3 + class489.method2092(var5));
				var6.field3212.method8695(var0);
				var6.field3212.method8642(var1);
				var6.field3212.method8648(var5);
				Client.field753.method2735(var6);
			}
		}
	}
}
