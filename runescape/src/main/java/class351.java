import java.util.Comparator;

final class class351 implements Comparator {
	int method6596(class352 var1, class352 var2) {
		return var1.field4284 < var2.field4284 ? -1 : (var2.field4284 == var1.field4284 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6596((class352)var1, (class352)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
