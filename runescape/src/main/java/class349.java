import java.util.Comparator;

final class class349 implements Comparator {
	int method6585(class352 var1, class352 var2) {
		return var1.field4283 < var2.field4283 ? -1 : (var1.field4283 == var2.field4283 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6585((class352)var1, (class352)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
