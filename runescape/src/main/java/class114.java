public class class114 extends class409 {
	final boolean field1427;

	public class114(boolean var1) {
		this.field1427 = var1;
	}

	int method2858(class412 var1, class412 var2) {
		if (0 != var1.field4600) {
			if (var2.field4600 == 0) {
				return this.field1427 ? -1 : 1;
			}
		} else if (var2.field4600 != 0) {
			return this.field1427 ? 1 : -1;
		}

		return this.method7598(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method2858((class412)var1, (class412)var2);
	}
}
