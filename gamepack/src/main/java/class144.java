public class class144 extends class140 {
	byte field1669;
	int field1668;
	// $FF: synthetic field
	final class143 this$0;

	class144(class143 var1) {
		this.this$0 = var1;
		this.field1668 = -1;
	}

	void method3152(class489 var1) {
		this.field1668 = var1.method8660();
		this.field1669 = var1.method8659();
	}

	void method3151(class151 var1) {
		var1.method3231(this.field1668, this.field1669);
	}

	static final void method3172(class317[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class317 var4 = var0[var3];
			if (null != var4) {
				if (0 == var4.field3598) {
					if (var4.field3707 != null) {
						method3172(var4.field3707, var1);
					}

					class83 var5 = (class83)Client.field657.method8381((long)var4.field3570);
					if (null != var5) {
						class128.method3048(var5.field1037, var1);
					}
				}

				class84 var6;
				if (var1 == 0 && null != var4.field3689) {
					var6 = new class84();
					var6.field1048 = var4;
					var6.field1052 = var4.field3689;
					class67.method2351(var6);
				}

				if (var1 == 1 && var4.field3690 != null) {
					if (var4.field3571 >= 0) {
						class317 var7 = class166.method3349(var4.field3570);
						if (var7 == null || var7.field3707 == null || var4.field3571 >= var7.field3707.length || var7.field3707[var4.field3571] != var4) {
							continue;
						}
					}

					var6 = new class84();
					var6.field1048 = var4;
					var6.field1052 = var4.field3690;
					class67.method2351(var6);
				}
			}
		}

	}
}
