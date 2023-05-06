public final class class96 extends class91 {
	static int field1275;
	static int field1278;
	class190 field1276;
	class190 field1279;
	class191 field1277;
	class490 field1283;
	int field1272;
	String field1273;

	static {
		field1278 = 1;
		field1275 = 1;
	}

	class96() {
		this.field1273 = "";
		this.field1272 = 31;
	}

	void method2502(String var1) {
		this.field1273 = null == var1 ? "" : var1;
	}

	void method2554(int var1) {
		this.field1272 = var1;
	}

	boolean method2537(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1272 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	final String method2540() {
		if (!this.field1273.isEmpty()) {
			return this.field1273;
		} else {
			class191 var2 = this.field1277;
			if (null != var2.field2045) {
				var2 = var2.method3642();
				if (null == var2) {
					var2 = this.field1277;
				}
			}

			return var2.field2013;
		}
	}

	final void method2506(int var1, class211 var2) {
		int var4 = super.field1174[0];
		int var5 = super.field1176[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}

		if (var1 == 1) {
			++var5;
		}

		if (var1 == 2) {
			++var4;
			++var5;
		}

		if (var1 == 3) {
			--var4;
		}

		if (var1 == 4) {
			++var4;
		}

		if (var1 == 5) {
			--var4;
			--var5;
		}

		if (var1 == 6) {
			--var5;
		}

		if (var1 == 7) {
			++var4;
			--var5;
		}

		if (super.field1202 != -1 && class81.method2189(super.field1202, (byte)121).field2314 == 1) {
			super.field1202 = -1;
		}

		if (super.field1206 < 9) {
			++super.field1206;
		}

		for (int var6 = super.field1206; var6 > 0; --var6) {
			super.field1174[var6] = super.field1174[var6 - 1];
			super.field1176[var6] = super.field1176[var6 - 1];
			super.field1199[var6] = super.field1199[var6 - 1];
		}

		super.field1174[0] = var4;
		super.field1176[0] = var5;
		super.field1199[0] = var2;
	}

	final void method2507(int var1, int var2, boolean var3) {
		if (-1 != super.field1202 && class81.method2189(super.field1202, (byte)0).field2314 == 1) {
			super.field1202 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field1174[0];
			int var6 = var2 - super.field1176[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field1206 < 9) {
					++super.field1206;
				}

				for (int var7 = super.field1206; var7 > 0; --var7) {
					super.field1174[var7] = super.field1174[var7 - 1];
					super.field1176[var7] = super.field1176[var7 - 1];
					super.field1199[var7] = super.field1199[var7 - 1];
				}

				super.field1174[0] = var1;
				super.field1176[0] = var2;
				super.field1199[0] = class211.field2390;
				return;
			}
		}

		super.field1206 = 0;
		super.field1211 = 0;
		super.field1210 = 0;
		super.field1174[0] = var1;
		super.field1176[0] = var2;
		super.field1171 = 128 * super.field1174[0] + super.field1141 * 64;
		super.field1138 = super.field1141 * 64 + 128 * super.field1176[0];
	}

	protected final class232 method4541() {
		if (this.field1277 == null) {
			return null;
		} else {
			class204 var2 = -1 != super.field1202 && super.field1184 == 0 ? class81.method2189(super.field1202, (byte)94) : null;
			class204 var3 = -1 != super.field1187 && (super.field1187 != super.field1139 || var2 == null) ? class81.method2189(super.field1187, (byte)39) : null;
			class232 var4 = null;
			if (this.field1276 != null && this.field1276.field2005) {
				var4 = Client.field3454.field1097.method5805(var2, super.field1182, var3, super.field1178);
			} else {
				var4 = this.field1277.method3639(var2, super.field1182, var3, super.field1178, this.field1276);
			}

			if (null == var4) {
				return null;
			} else {
				var4.method4654();
				super.field1196 = var4.field2619;
				int var5 = var4.field2697;
				var4 = this.method2318(var4);
				if (this.field1277.field2042 == 1) {
					var4.field2714 = true;
				}

				if (super.field1209 != 0 && Client.field602 >= super.field1169 && Client.field602 < super.field1157) {
					var4.field2757 = super.field1181;
					var4.field2715 = super.field1200;
					var4.field2754 = super.field1201;
					var4.field2762 = super.field1209;
					var4.field2756 = (short)var5;
				} else {
					var4.field2762 = 0;
				}

				return var4;
			}
		}
	}

	final boolean method2315() {
		return null != this.field1277;
	}

	int[] method2509() {
		return this.field1283 != null ? this.field1283.method8911() : this.field1277.method3647();
	}

	short[] method2521() {
		return this.field1283 != null ? this.field1283.method8904() : this.field1277.method3649();
	}

	void method2511(int var1, int var2, short var3) {
		if (this.field1283 == null) {
			this.field1283 = new class490(this.field1277);
		}

		this.field1283.method8905(var1, var2, var3);
	}

	void method2534(int[] var1, short[] var2) {
		if (this.field1283 == null) {
			this.field1283 = new class490(this.field1277);
		}

		this.field1283.method8917(var1, var2);
	}

	void method2550() {
		this.field1283 = null;
	}

	void method2514(class190 var1) {
		this.field1279 = var1;
	}

	class190 method2515() {
		return this.field1279;
	}

	void method2516(class190 var1) {
		this.field1276 = var1;
	}

	void method2559() {
		this.field1279 = null;
	}

	void method2518() {
		this.field1276 = null;
	}

	protected static final void method2569() {
		class35.field4547.method3492();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			class35.field218[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			class35.field206[var1] = 0L;
		}

		class35.field3738 = 0;
	}
}
