public class class200 extends class444 {
	public static class344 field2132;
	public static class344 field2133;
	public static class344 field2138;
	static class280 field2134;
	static class280 field2135;
	static class280 field2136;
	int field2140;
	int field2144;
	int field2145;
	int field2146;
	int field2149;
	int field2154;
	int field2156;
	String field2151;
	public int field2131;
	public int field2141;
	public int field2143;
	public int field2148;
	public int field2150;
	public int field2152;
	public int field2155;
	public int[] field2153;

	static {
		field2134 = new class280(64);
		field2135 = new class280(64);
		field2136 = new class280(20);
	}

	class200() {
		this.field2140 = -1;
		this.field2141 = 16777215;
		this.field2143 = 70;
		this.field2156 = -1;
		this.field2144 = -1;
		this.field2145 = -1;
		this.field2146 = -1;
		this.field2131 = 0;
		this.field2148 = 0;
		this.field2155 = -1;
		this.field2151 = "";
		this.field2150 = -1;
		this.field2152 = 0;
		this.field2154 = -1;
		this.field2149 = -1;
	}

	void method3814(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3815(var1, var3);
		}
	}

	void method3815(class489 var1, int var2) {
		if (var2 == 1) {
			this.field2140 = var1.method8710();
		} else if (var2 == 2) {
			this.field2141 = var1.method8662();
		} else if (var2 == 3) {
			this.field2156 = var1.method8710();
		} else if (var2 == 4) {
			this.field2145 = var1.method8710();
		} else if (var2 == 5) {
			this.field2144 = var1.method8710();
		} else if (var2 == 6) {
			this.field2146 = var1.method8710();
		} else if (var2 == 7) {
			this.field2131 = var1.method8855();
		} else if (var2 == 8) {
			this.field2151 = var1.method8670();
		} else if (var2 == 9) {
			this.field2143 = var1.method8660();
		} else if (var2 == 10) {
			this.field2148 = var1.method8855();
		} else if (var2 == 11) {
			this.field2155 = 0;
		} else if (var2 == 12) {
			this.field2150 = var1.method8658();
		} else if (var2 == 13) {
			this.field2152 = var1.method8855();
		} else if (var2 == 14) {
			this.field2155 = var1.method8660();
		} else if (var2 == 17 || var2 == 18) {
			this.field2154 = var1.method8660();
			if (this.field2154 == 65535) {
				this.field2154 = -1;
			}

			this.field2149 = var1.method8660();
			if (this.field2149 == 65535) {
				this.field2149 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.method8660();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			int var5 = var1.method8658();
			this.field2153 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2153[var6] = var1.method8660();
				if (65535 == this.field2153[var6]) {
					this.field2153[var6] = -1;
				}
			}

			this.field2153[var5 + 1] = var4;
		}

	}

	public final class200 method3823() {
		int var2 = -1;
		if (-1 != this.field2154) {
			var2 = class307.method5179(this.field2154);
		} else if (-1 != this.field2149) {
			var2 = class307.field3482[this.field2149];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2153.length - 1) {
			var3 = this.field2153[var2];
		} else {
			var3 = this.field2153[this.field2153.length - 1];
		}

		return var3 != -1 ? method2983(var3) : null;
	}

	public String method3817(int var1) {
		String var3 = this.field2151;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + class185.method3577(var1, false) + var3.substring(var4 + 2);
		}
	}

	public class503 method3818() {
		if (this.field2156 < 0) {
			return null;
		} else {
			class503 var2 = (class503)field2135.method5461((long)this.field2156);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class504.method8588(field2132, this.field2156, 0);
				if (null != var2) {
					field2135.method5463(var2, (long)this.field2156);
				}

				return var2;
			}
		}
	}

	public class503 method3819() {
		if (this.field2144 < 0) {
			return null;
		} else {
			class503 var2 = (class503)field2135.method5461((long)this.field2144);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class504.method8588(field2132, this.field2144, 0);
				if (var2 != null) {
					field2135.method5463(var2, (long)this.field2144);
				}

				return var2;
			}
		}
	}

	public class503 method3813() {
		if (this.field2145 < 0) {
			return null;
		} else {
			class503 var2 = (class503)field2135.method5461((long)this.field2145);
			if (null != var2) {
				return var2;
			} else {
				var2 = class504.method8588(field2132, this.field2145, 0);
				if (var2 != null) {
					field2135.method5463(var2, (long)this.field2145);
				}

				return var2;
			}
		}
	}

	public class503 method3821() {
		if (this.field2146 < 0) {
			return null;
		} else {
			class503 var2 = (class503)field2135.method5461((long)this.field2146);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class504.method8588(field2132, this.field2146, 0);
				if (var2 != null) {
					field2135.method5463(var2, (long)this.field2146);
				}

				return var2;
			}
		}
	}

	public class379 method3833() {
		if (-1 == this.field2140) {
			return null;
		} else {
			class379 var2 = (class379)field2136.method5461((long)this.field2140);
			if (var2 != null) {
				return var2;
			} else {
				class344 var4 = field2132;
				class344 var5 = field2133;
				int var6 = this.field2140;
				byte[] var8 = var4.method6468(var6, 0);
				boolean var7;
				if (null == var8) {
					var7 = false;
				} else {
					class486.method8595(var8);
					var7 = true;
				}

				class379 var3;
				if (!var7) {
					var3 = null;
				} else {
					byte[] var9 = var5.method6468(var6, 0);
					class379 var11;
					if (var9 == null) {
						var11 = null;
					} else {
						class379 var10 = new class379(var9, class504.field5101, class504.field94, class504.field1302, class504.field1644, class504.field4525, class504.field2113);
						class504.method7448();
						var11 = var10;
					}

					var3 = var11;
				}

				if (null != var3) {
					field2136.method5463(var3, (long)this.field2140);
				}

				return var3;
			}
		}
	}

	public static class200 method2983(int var0) {
		class200 var2 = (class200)field2134.method5461((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2138.method6468(32, var0);
			var2 = new class200();
			if (var3 != null) {
				var2.method3814(new class489(var3));
			}

			field2134.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static void method7994() {
		field2134.method5467();
		field2135.method5467();
		field2136.method5467();
	}

	static int method3847(int var0, class75 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field722.method4076(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field722.method4070(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = class67.field843[--class67.field836];
			class67.field843[++class67.field836 - 1] = Client.field722.method4078(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
