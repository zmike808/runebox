import java.util.Comparator;

final class class354 implements Comparator {
	int method6637(class352 var1, class352 var2) {
		return var1.field4285.field4291 < var2.field4285.field4291 ? -1 : (var2.field4285.field4291 == var1.field4285.field4291 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6637((class352)var1, (class352)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
