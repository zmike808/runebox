public class class117 extends class409 {
	final boolean field1436;

	public class117(boolean var1) {
		this.field1436 = var1;
	}

	int method2880(class412 var1, class412 var2) {
		if (var1.field4600 == Client.field579 && var2.field4600 == Client.field579) {
			return this.field1436 ? var1.field4598 - var2.field4598 : var2.field4598 - var1.field4598;
		} else {
			return this.method7598(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2880((class412)var1, (class412)var2);
	}
}
