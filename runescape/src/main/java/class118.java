public class class118 extends class409 {
	final boolean field1445;

	public class118(boolean var1) {
		this.field1445 = var1;
	}

	int method2887(class412 var1, class412 var2) {
		if (var1.field4599 != var2.field4599) {
			return this.field1445 ? var1.field4599 - var2.field4599 : var2.field4599 - var1.field4599;
		} else {
			return this.method7598(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2887((class412)var1, (class412)var2);
	}
}
