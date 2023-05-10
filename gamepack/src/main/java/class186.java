public class class186 extends class444 {
	public static class280 field1962;
	public static class344 field1961;
	static class280 field1963;
	int field1970;
	int field1971;
	public int field1960;
	public int field1965;
	public int field1966;
	public int field1967;
	public int field1968;
	public int field1969;
	public int field1972;
	public int field1973;

	static {
		field1962 = new class280(64);
		field1963 = new class280(64);
	}

	public class186() {
		this.field1965 = 255;
		this.field1968 = 255;
		this.field1967 = -1;
		this.field1972 = 1;
		this.field1969 = 70;
		this.field1970 = -1;
		this.field1971 = -1;
		this.field1966 = 30;
		this.field1973 = 0;
	}

	public void method3580(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3582(var1, var3);
		}
	}

	void method3582(class489 var1, int var2) {
		if (var2 == 1) {
			var1.method8660();
		} else if (var2 == 2) {
			this.field1965 = var1.method8658();
		} else if (var2 == 3) {
			this.field1968 = var1.method8658();
		} else if (var2 == 4) {
			this.field1967 = 0;
		} else if (var2 == 5) {
			this.field1969 = var1.method8660();
		} else if (var2 == 6) {
			var1.method8658();
		} else if (var2 == 7) {
			this.field1970 = var1.method8710();
		} else if (var2 == 8) {
			this.field1971 = var1.method8710();
		} else if (var2 == 11) {
			this.field1967 = var1.method8660();
		} else if (var2 == 14) {
			this.field1966 = var1.method8658();
		} else if (var2 == 15) {
			this.field1973 = var1.method8658();
		}

	}

	public class503 method3584() {
		if (this.field1970 < 0) {
			return null;
		} else {
			class503 var2 = (class503)field1963.method5461((long)this.field1970);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class504.method8588(field1961, this.field1970, 0);
				if (null != var2) {
					field1963.method5463(var2, (long)this.field1970);
				}

				return var2;
			}
		}
	}

	public class503 method3583() {
		if (this.field1971 < 0) {
			return null;
		} else {
			class503 var2 = (class503)field1963.method5461((long)this.field1971);
			if (null != var2) {
				return var2;
			} else {
				var2 = class504.method8588(field1961, this.field1971, 0);
				if (null != var2) {
					field1963.method5463(var2, (long)this.field1971);
				}

				return var2;
			}
		}
	}

	public static void method6613() {
		field1962.method5467();
		field1963.method5467();
	}
}
