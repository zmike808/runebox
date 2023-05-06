public class class184 extends class444 {
	public static class280 field1939;
	public boolean field1940;

	static {
		field1939 = new class280(64);
	}

	public class184() {
		this.field1940 = false;
	}

	public void method3550(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3551(var1, var3);
		}
	}

	void method3551(class489 var1, int var2) {
		if (var2 == 2) {
			this.field1940 = true;
		}

	}

	public static boolean method3554(char var0, byte var1) {
		if (var0 >= ' ') {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			if (var0 <= '~') {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				return true;
			}
		}

		if (var0 >= 160) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			if (var0 <= 255) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				return true;
			}
		}

		if (var0 != 8364) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			if (var0 != 338) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				if (var0 != 8212) {
					if (var1 <= -1) {
						throw new IllegalStateException();
					}

					if (var0 != 339) {
						if (var0 != 376) {
							return false;
						}

						if (var1 <= -1) {
							throw new IllegalStateException();
						}
					}
				}
			}
		}

		return true;
	}
}
