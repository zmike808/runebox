public class class381 {
	int field4424;

	class381(int var1, boolean var2) {
		this.field4424 = var1;
	}

	public int method7138() {
		return this.field4424;
	}

	static int method7140(int var0, class75 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			class67.field836 -= 2;
			var4 = class67.field843[class67.field836];
			var5 = class67.field843[1 + class67.field836];
			class188 var11 = class149.method3201(var4);
			if (var11.field1981 != 's') {
			}

			for (var7 = 0; var7 < var11.field1990; ++var7) {
				if (var5 == var11.field1987[var7]) {
					class67.field842[++class67.field1015 - 1] = var11.field1989[var7];
					var11 = null;
					break;
				}
			}

			if (var11 != null) {
				class67.field842[++class67.field1015 - 1] = var11.field1984;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = class67.field843[--class67.field836];
				class188 var10 = class149.method3201(var4);
				class67.field843[++class67.field836 - 1] = var10.method3609();
				return 1;
			} else {
				return 2;
			}
		} else {
			class67.field836 -= 4;
			var4 = class67.field843[class67.field836];
			var5 = class67.field843[class67.field836 + 1];
			int var6 = class67.field843[class67.field836 + 2];
			var7 = class67.field843[class67.field836 + 3];
			class188 var8 = class149.method3201(var6);
			if (var4 == var8.field1982 && var5 == var8.field1981) {
				for (int var9 = 0; var9 < var8.field1990; ++var9) {
					if (var7 == var8.field1987[var9]) {
						if (var5 == 115) {
							class67.field842[++class67.field1015 - 1] = var8.field1989[var9];
						} else {
							class67.field843[++class67.field836 - 1] = var8.field1988[var9];
						}

						var8 = null;
						break;
					}
				}

				if (null != var8) {
					if (var5 == 115) {
						class67.field842[++class67.field1015 - 1] = var8.field1984;
					} else {
						class67.field843[++class67.field836 - 1] = var8.field1986;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					class67.field842[++class67.field1015 - 1] = class337.field3889;
				} else {
					class67.field843[++class67.field836 - 1] = 0;
				}

				return 1;
			}
		}
	}
}
