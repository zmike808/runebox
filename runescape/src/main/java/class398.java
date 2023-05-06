import java.util.Comparator;

class class398 implements Comparator {
	// $FF: synthetic field
	final class399 this$0;

	class398(class399 var1) {
		this.this$0 = var1;
	}

	int method7422(class400 var1, class400 var2) {
		if (var1.field4545 > var2.field4545) {
			return 1;
		} else {
			return var1.field4545 < var2.field4545 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7422((class400)var1, (class400)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static String method7435(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
				if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = class101.method2623(var5);
					var3.append('%');
					int var7 = var6 >> 4 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}

					var7 = var6 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}
				}
			} else {
				var3.append(var5);
			}
		}

		return var3.toString();
	}
}
