public class class247 extends class267 {
	class262 field2870;
	int field2872;
	int field2875;
	int field2876;
	final class250 field2871;
	final int field2874;

	class247(class308 var1, class308 var2, int var3, class250 var4) {
		super(var1, var2);
		this.field2874 = var3;
		this.field2871 = var4;
		this.method4862();
	}

	void method4862() {
		this.field2872 = class145.method3177(this.field2874).method3857().field2182;
		this.field2870 = this.field2871.method5001(class355.method6671(this.field2872));
		class183 var2 = class355.method6671(this.method5322());
		class503 var3 = var2.method3530(false);
		if (var3 != null) {
			this.field2876 = var3.field5088;
			this.field2875 = var3.field5093;
		} else {
			this.field2876 = 0;
			this.field2875 = 0;
		}

	}

	public int method5322() {
		return this.field2872;
	}

	class262 method5317() {
		return this.field2870;
	}

	int method5318() {
		return this.field2876;
	}

	int method5328() {
		return this.field2875;
	}
}
