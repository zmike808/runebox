import java.util.Comparator;

public class class63 implements Comparator {
	boolean field486;

	class63() {
	}

	int method1220(class352 var1, class352 var2) {
		if (var1.field4284 == var2.field4284) {
			return 0;
		} else {
			if (this.field486) {
				if (Client.field579 == var1.field4284) {
					return -1;
				}

				if (Client.field579 == var2.field4284) {
					return 1;
				}
			}

			return var1.field4284 < var2.field4284 ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method1220((class352)var1, (class352)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static void method1228(boolean var0) {
		Client.field631 = var0;
	}
}
