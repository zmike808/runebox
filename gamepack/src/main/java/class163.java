public class class163 extends class156 {
	byte field1786;
	byte field1787;
	String field1788;
	// $FF: synthetic field
	final class157 this$0;

	class163(class157 var1) {
		this.this$0 = var1;
	}

	void method3284(class489 var1) {
		this.field1788 = var1.method8715();
		if (null != this.field1788) {
			var1.method8658();
			this.field1787 = var1.method8659();
			this.field1786 = var1.method8659();
		}

	}

	void method3285(class160 var1) {
		var1.field1773 = this.field1788;
		if (null != this.field1788) {
			var1.field1769 = this.field1787;
			var1.field1775 = this.field1786;
		}

	}

	public static void method3330(class317 var0, int var1, int var2) {
		class314 var4 = var0.field3585;
		boolean var5 = var2 != var4.field3522;
		var4.field3522 = var2;
		if (var5) {
			int var6;
			int var7;
			if (var4.field3522 == var1) {
				for (var6 = 0; var6 < class314.field3520.length; ++var6) {
					var7 = class314.field3520[var6];
					if (var4.field3519[var7] > 0 && var4.field3519[var7] < 512) {
						var4.field3519[var7] = var4.field3523[var7];
					}
				}
			} else {
				label56: {
					if (var4.field3519[0] >= 512) {
						boolean var8;
						if (var4.field3519[0] < 512) {
							var8 = false;
						} else {
							class202 var9 = class92.method2352(var4.field3519[0] - 512);
							var8 = class205.field2325.field2316 != var9.field2217 && class205.field2325.field2316 != var9.field2234;
						}

						if (!var8) {
							break label56;
						}
					}

					var4.field3519[class205.field2325.field2316] = 1;
				}

				for (var6 = 0; var6 < 7; ++var6) {
					var7 = class314.field3520[var6];
					if (var4.field3519[var7] > 0 && var4.field3519[var7] < 512) {
						class314.method3332(var2, var4.field3519, var6);
					}
				}
			}
		}

		var4.method5828();
	}
}
