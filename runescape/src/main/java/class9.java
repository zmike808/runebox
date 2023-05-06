public class class9 {
	final int field32;
	final int field33;
	final String field34;

	class9(int var1, int var2, String var3) {
		this.field33 = var1;
		this.field32 = var2;
		this.field34 = var3;
	}

	class9(class489 var1) {
		this(var1.method8658(), var1.method8658(), var1.method8669());
	}

	String method70() {
		return Integer.toHexString(this.field33) + Integer.toHexString(this.field32) + this.field34;
	}

	int method66() {
		return this.field32;
	}
}
