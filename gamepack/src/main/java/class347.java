import java.util.Comparator;

final class class347 implements Comparator {
	int method6556(class352 var1, class352 var2) {
		return var1.field4285.field4293 < var2.field4285.field4293 ? -1 : (var2.field4285.field4293 == var1.field4285.field4293 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6556((class352)var1, (class352)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
