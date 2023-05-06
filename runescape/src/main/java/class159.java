public class class159 extends class140 {
	int field1766;
	// $FF: synthetic field
	final class143 this$0;

	class159(class143 var1) {
		this.this$0 = var1;
		this.field1766 = -1;
	}

	void method3152(class489 var1) {
		this.field1766 = var1.method8660();
	}

	void method3151(class151 var1) {
		var1.method3208(this.field1766, (byte)-1);
	}

	static void method3300() {
		if (class35.field1817.toLowerCase().indexOf("microsoft") != -1) {
			class29.field156[186] = 57;
			class29.field156[187] = 27;
			class29.field156[188] = 71;
			class29.field156[189] = 26;
			class29.field156[190] = 72;
			class29.field156[191] = 73;
			class29.field156[192] = 58;
			class29.field156[219] = 42;
			class29.field156[220] = 74;
			class29.field156[221] = 43;
			class29.field156[222] = 59;
			class29.field156[223] = 28;
		} else {
			class29.field156[44] = 71;
			class29.field156[45] = 26;
			class29.field156[46] = 72;
			class29.field156[47] = 73;
			class29.field156[59] = 57;
			class29.field156[61] = 27;
			class29.field156[91] = 42;
			class29.field156[92] = 74;
			class29.field156[93] = 43;
			class29.field156[192] = 28;
			class29.field156[222] = 58;
			class29.field156[520] = 59;
		}

	}

	static void method3299(class317 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field3572;
		int var6 = var0.field3586;
		if (var0.field3708 == 0) {
			var0.field3572 = var0.field3581;
		} else if (var0.field3708 == 1) {
			var0.field3572 = var1 - var0.field3581;
		} else if (var0.field3708 == 2) {
			var0.field3572 = var1 * var0.field3581 >> 14;
		}

		if (var0.field3578 == 0) {
			var0.field3586 = var0.field3658;
		} else if (var0.field3578 == 1) {
			var0.field3586 = var2 - var0.field3658;
		} else if (var0.field3578 == 2) {
			var0.field3586 = var2 * var0.field3658 >> 14;
		}

		if (var0.field3708 == 4) {
			var0.field3572 = var0.field3587 * var0.field3586 / var0.field3588;
		}

		if (4 == var0.field3578) {
			var0.field3586 = var0.field3588 * var0.field3572 / var0.field3587;
		}

		if (1337 == var0.field3686) {
			Client.field667 = var0;
		}

		if (12 == var0.field3598) {
			var0.method6152().method5852(var0.field3572, var0.field3586);
		}

		if (var3 && null != var0.field3691 && (var0.field3572 != var5 || var0.field3586 != var6)) {
			class84 var7 = new class84();
			var7.field1048 = var0;
			var7.field1052 = var0.field3691;
			Client.field699.method6711(var7);
		}

	}
}
