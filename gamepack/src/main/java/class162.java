public class class162 extends class140 {
	String field1782;
	long field1784;
	// $FF: synthetic field
	final class143 this$0;

	class162(class143 var1) {
		this.this$0 = var1;
		this.field1784 = -1L;
		this.field1782 = null;
	}

	void method3152(class489 var1) {
		if (var1.method8658() != 255) {
			--var1.field4989;
			this.field1784 = var1.method8681();
		}

		this.field1782 = var1.method8715();
	}

	void method3151(class151 var1) {
		var1.method3216(this.field1784, this.field1782);
	}
}
