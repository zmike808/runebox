import java.util.Comparator;

public class class111 implements Comparator {
	final boolean field1414;

	public class111(boolean var1) {
		this.field1414 = var1;
	}

	int method2806(class412 var1, class412 var2) {
		return this.field1414 ? var1.field4598 - var2.field4598 : var2.field4598 - var1.field4598;
	}

	public int compare(Object var1, Object var2) {
		return this.method2806((class412)var1, (class412)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static int method2815(int var0, class75 var1, boolean var2) {
		if (var0 == 5306) {
			class67.field843[++class67.field836 - 1] = Client.method6581();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = class67.field843[--class67.field836];
				if (var4 == 1 || var4 == 2) {
					class56.method1134(var4);
				}

				return 1;
			} else if (var0 == 5308) {
				class67.field843[++class67.field836 - 1] = Client.field112.method2415();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--class67.field836;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = class67.field843[--class67.field836];
				if (var4 == 1 || var4 == 2) {
					Client.field112.method2414(var4);
				}

				return 1;
			}
		}
	}
}
