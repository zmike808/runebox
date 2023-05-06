public abstract class class49 extends class449 {
	class49 field364;
	class59 field365;
	int field366;
	volatile boolean field363;

	protected class49() {
		this.field363 = true;
	}

	protected abstract class49 method1040();

	protected abstract class49 method1042();

	protected abstract int method1044();

	protected abstract void method1046(int var1);

	protected abstract void method1064(int[] var1, int var2, int var3);

	int method1061() {
		return 255;
	}

	final void method1045(int[] var1, int var2, int var3) {
		if (this.field363) {
			this.method1064(var1, var2, var3);
		} else {
			this.method1046(var3);
		}

	}
}
