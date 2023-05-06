public class class10 implements class357 {
	public static final class10 field40;
	public static final class10 field46;
	static final class10 field37;
	static final class10 field38;
	static final class10 field47;
	boolean field42;
	boolean field43;
	int field35;
	String field41;

	static {
		field46 = new class10(0, "POST", true, true);
		field40 = new class10(1, "GET", true, false);
		field37 = new class10(2, "PUT", false, true);
		field38 = new class10(3, "PATCH", false, true);
		field47 = new class10(4, "DELETE", false, true);
	}

	class10(int var1, String var2, boolean var3, boolean var4) {
		this.field35 = var1;
		this.field41 = var2;
		this.field42 = var3;
		this.field43 = var4;
	}

	boolean method78() {
		return this.field42;
	}

	public String method72() {
		return this.field41;
	}

	boolean method73() {
		return this.field43;
	}

	public int method6674() {
		return this.field35;
	}
}
