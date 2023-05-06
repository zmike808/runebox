public class class194 extends class444 {
	public static class280 field2076;
	public static class280 field2082;
	static class344 field2078;
	static class344 field2086;
	int field2073;
	int field2077;
	int field2081;
	int field2084;
	int field2085;
	int field2087;
	int field2088;
	short[] field2074;
	short[] field2075;
	short[] field2080;
	short[] field2083;
	public int field2079;

	static {
		field2082 = new class280(64);
		field2076 = new class280(30);
	}

	class194() {
		this.field2079 = -1;
		this.field2084 = 128;
		this.field2085 = 128;
		this.field2081 = 0;
		this.field2087 = 0;
		this.field2088 = 0;
	}

	void method3706(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3703(var1, var3);
		}
	}

	void method3703(class489 var1, int var2) {
		if (var2 == 1) {
			this.field2077 = var1.method8660();
		} else if (var2 == 2) {
			this.field2079 = var1.method8660();
		} else if (var2 == 4) {
			this.field2084 = var1.method8660();
		} else if (var2 == 5) {
			this.field2085 = var1.method8660();
		} else if (var2 == 6) {
			this.field2081 = var1.method8660();
		} else if (var2 == 7) {
			this.field2087 = var1.method8658();
		} else if (var2 == 8) {
			this.field2088 = var1.method8658();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method8658();
				this.field2080 = new short[var4];
				this.field2075 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2080[var5] = (short)var1.method8660();
					this.field2075[var5] = (short)var1.method8660();
				}
			} else if (var2 == 41) {
				var4 = var1.method8658();
				this.field2083 = new short[var4];
				this.field2074 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2083[var5] = (short)var1.method8660();
					this.field2074[var5] = (short)var1.method8660();
				}
			}
		}

	}

	public final class232 method3704(int var1) {
		class232 var3 = this.method3705();
		class232 var4;
		if (this.field2079 != -1 && var1 != -1) {
			var4 = class81.method2189(this.field2079, (byte)74).method4020(var3, var1);
		} else {
			var4 = var3.method4599(true);
		}

		if (128 != this.field2084 || 128 != this.field2085) {
			var4.method4663(this.field2084, this.field2085, this.field2084);
		}

		if (this.field2081 != 0) {
			if (this.field2081 == 90) {
				var4.method4684();
			}

			if (this.field2081 == 180) {
				var4.method4684();
				var4.method4684();
			}

			if (this.field2081 == 270) {
				var4.method4684();
				var4.method4684();
				var4.method4684();
			}
		}

		return var4;
	}

	public final class232 method3705() {
		class232 var2 = (class232)field2076.method5461((long)this.field2073);
		if (var2 == null) {
			class214 var3 = class214.method4215(field2086, this.field2077, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (null != this.field2080) {
				for (var4 = 0; var4 < this.field2080.length; ++var4) {
					var3.method4169(this.field2080[var4], this.field2075[var4]);
				}
			}

			if (this.field2083 != null) {
				for (var4 = 0; var4 < this.field2083.length; ++var4) {
					var3.method4220(this.field2083[var4], this.field2074[var4]);
				}
			}

			var2 = var3.method4177(this.field2087 + 64, 850 + this.field2088, -30, -50, -30);
			field2076.method5463(var2, (long)this.field2073);
		}

		return var2;
	}

	public static void method2895(class344 var0, class344 var1) {
		field2078 = var0;
		field2086 = var1;
	}

	public static class194 method2180(int var0) {
		class194 var2 = (class194)field2082.method5461((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2078.method6468(13, var0);
			var2 = new class194();
			var2.field2073 = var0;
			if (var3 != null) {
				var2.method3706(new class489(var3));
			}

			field2082.method5463(var2, (long)var0);
			return var2;
		}
	}
}
