final class class102 implements class309 {
	// $FF: synthetic field
	final class317 val$cc;

	class102(class317 var1) {
		this.val$cc = var1;
	}

	public void method5787() {
		if (this.val$cc != null && this.val$cc.method6155().field3504 != null) {
			class84 var2 = new class84();
			var2.method2200(this.val$cc);
			var2.method2198(this.val$cc.method6155().field3504);
			Client.method6594().method6711(var2);
		}

	}

	static final String method2631(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class337.field3946 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class337.field4012 + "</col>";
		}
	}
}
