import java.lang.ref.SoftReference;

public class class279 extends class282 {
	SoftReference field3078;

	class279(Object var1, int var2) {
		super(var2);
		this.field3078 = new SoftReference(var1);
	}

	Object method5481() {
		return this.field3078.get();
	}

	boolean method5479() {
		return true;
	}
}
