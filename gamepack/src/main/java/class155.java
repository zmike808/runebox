public class class155 extends class140 {
	int field1749;
	String field1750;
	long field1753;
	// $FF: synthetic field
	final class143 this$0;

	class155(class143 var1) {
		this.this$0 = var1;
		this.field1753 = -1L;
		this.field1750 = null;
		this.field1749 = 0;
	}

	void method3152(class489 var1) {
		if (var1.method8658() != 255) {
			--var1.field4989;
			this.field1753 = var1.method8681();
		}

		this.field1750 = var1.method8715();
		this.field1749 = var1.method8660();
	}

	void method3151(class151 var1) {
		var1.method3206(this.field1753, this.field1750, this.field1749);
	}

	public static void method3282(class319 var0) {
		class320.field3726 = var0;
	}
}
