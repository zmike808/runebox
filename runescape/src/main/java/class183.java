public class class183 extends class444 {
	static class183[] field1915;
	static class280 field1916;
	static class344 field1930;
	byte[] field1936;
	int field1919;
	int field1925;
	int field1931;
	int field1932;
	int field1934;
	int[] field1914;
	int[] field1935;
	public boolean field1924;
	public boolean field1926;
	public class189 field1933;
	public class192 field1927;
	public int field1918;
	public int field1922;
	public int field1929;
	public int field1937;
	public String field1920;
	public String field1928;
	public String[] field1921;
	public final int field1917;

	static {
		field1916 = new class280(256);
	}

	class183(int var1) {
		this.field1929 = -1;
		this.field1919 = -1;
		this.field1922 = 0;
		this.field1924 = true;
		this.field1926 = false;
		this.field1921 = new String[5];
		this.field1934 = Integer.MAX_VALUE;
		this.field1925 = Integer.MAX_VALUE;
		this.field1931 = Integer.MIN_VALUE;
		this.field1932 = Integer.MIN_VALUE;
		this.field1933 = class189.field1992;
		this.field1927 = class192.field2059;
		this.field1937 = -1;
		this.field1917 = var1;
	}

	void method3527(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3548(var1, var3);
		}
	}

	void method3548(class489 var1, int var2) {
		if (var2 == 1) {
			this.field1929 = var1.method8710();
		} else if (var2 == 2) {
			this.field1919 = var1.method8710();
		} else if (var2 == 3) {
			this.field1920 = var1.method8669();
		} else if (var2 == 4) {
			this.field1918 = var1.method8662();
		} else if (var2 == 5) {
			var1.method8662();
		} else if (var2 == 6) {
			this.field1922 = var1.method8658();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method8658();
				if ((var4 & 1) == 0) {
					this.field1924 = false;
				}

				if ((var4 & 2) == 2) {
					this.field1926 = true;
				}
			} else if (var2 == 8) {
				var1.method8658();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field1921[var2 - 10] = var1.method8669();
			} else if (var2 == 15) {
				var4 = var1.method8658();
				this.field1914 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field1914[var5] = var1.method8855();
				}

				var1.method8664();
				var5 = var1.method8658();
				this.field1935 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field1935.length; ++var6) {
					this.field1935[var6] = var1.method8664();
				}

				this.field1936 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field1936[var6] = var1.method8659();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field1928 = var1.method8669();
				} else if (var2 == 18) {
					var1.method8710();
				} else if (var2 == 19) {
					this.field1937 = var1.method8660();
				} else if (var2 == 21) {
					var1.method8664();
				} else if (var2 == 22) {
					var1.method8664();
				} else if (var2 == 23) {
					var1.method8658();
					var1.method8658();
					var1.method8658();
				} else if (var2 == 24) {
					var1.method8855();
					var1.method8855();
				} else if (var2 == 25) {
					var1.method8710();
				} else if (var2 == 28) {
					var1.method8658();
				} else if (var2 == 29) {
					this.field1933 = (class189)class199.method3788(class189.method8481(), var1.method8658());
				} else if (var2 == 30) {
					class192[] var7 = new class192[]{class192.field2055, class192.field2059, class192.field2060};
					this.field1927 = (class192)class199.method3788(var7, var1.method8658());
				}
			}
		}

	}

	void method3529() {
		if (this.field1914 != null) {
			for (int var2 = 0; var2 < this.field1914.length; var2 += 2) {
				if (this.field1914[var2] < this.field1934) {
					this.field1934 = this.field1914[var2];
				} else if (this.field1914[var2] > this.field1931) {
					this.field1931 = this.field1914[var2];
				}

				if (this.field1914[var2 + 1] < this.field1925) {
					this.field1925 = this.field1914[var2 + 1];
				} else if (this.field1914[var2 + 1] > this.field1932) {
					this.field1932 = this.field1914[var2 + 1];
				}
			}
		}

	}

	public class503 method3530(boolean var1) {
		int var3 = var1 ? this.field1919 : this.field1929;
		return this.method3546(var3);
	}

	class503 method3546(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class503 var3 = (class503)field1916.method5461((long)var1);
			if (null != var3) {
				return var3;
			} else {
				var3 = class504.method8588(field1930, var1, 0);
				if (null != var3) {
					field1916.method5463(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	public int method3531() {
		return this.field1917;
	}

	public static boolean method510(class344 var0, class344 var1) {
		field1930 = var1;
		if (!var0.method6521()) {
			return false;
		} else {
			class459.field3792 = var0.method6458(35);
			field1915 = new class183[class459.field3792];

			for (int var3 = 0; var3 < class459.field3792; ++var3) {
				byte[] var4 = var0.method6468(35, var3);
				field1915[var3] = new class183(var3);
				if (var4 != null) {
					field1915[var3].method3527(new class489(var4));
					field1915[var3].method3529();
				}
			}

			return true;
		}
	}

	public static void method6358() {
		field1916.method5467();
	}
}
