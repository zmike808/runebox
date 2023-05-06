public class class255 extends class267 {
	final class262 field2955;
	final int field2953;
	final int field2954;
	final int field2956;

	class255(class308 var1, class308 var2, int var3, class262 var4) {
		super(var1, var2);
		this.field2956 = var3;
		this.field2955 = var4;
		class183 var5 = class355.method6671(this.method5322());
		class503 var6 = var5.method3530(false);
		if (var6 != null) {
			this.field2954 = var6.field5088;
			this.field2953 = var6.field5093;
		} else {
			this.field2954 = 0;
			this.field2953 = 0;
		}

	}

	public int method5322() {
		return this.field2956;
	}

	class262 method5317() {
		return this.field2955;
	}

	int method5318() {
		return this.field2954;
	}

	int method5328() {
		return this.field2953;
	}
}
