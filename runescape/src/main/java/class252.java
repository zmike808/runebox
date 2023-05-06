public class class252 extends class258 {
	int field2932;
	int field2933;
	int field2934;
	int field2935;

	class252() {
	}

	void method5142(class489 var1) {
		int var3 = var1.method8658();
		if (var3 != class264.field3031.field3032) {
			throw new IllegalStateException("");
		} else {
			super.field2990 = var1.method8658();
			super.field2995 = var1.method8658();
			super.field2996 = var1.method8660();
			super.field3001 = var1.method8660();
			this.field2932 = var1.method8658();
			this.field2933 = var1.method8658();
			super.field2988 = var1.method8660();
			super.field2989 = var1.method8660();
			this.field2934 = var1.method8658();
			this.field2935 = var1.method8658();
			super.field2992 = var1.method8710();
			super.field2993 = var1.method8710();
		}
	}

	void method5233(class489 var1) {
		super.field2995 = Math.min(super.field2995, 4);
		super.field2994 = new short[1][64][64];
		super.field2987 = new short[super.field2995][64][64];
		super.field2991 = new byte[super.field2995][64][64];
		super.field2997 = new byte[super.field2995][64][64];
		super.field2998 = new class260[super.field2995][64][64][];
		int var3 = var1.method8658();
		if (class263.field3028.field3027 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method8658();
			int var5 = var1.method8658();
			int var6 = var1.method8658();
			int var7 = var1.method8658();
			if (var4 == super.field2988 && super.field2989 == var5 && var6 == this.field2934 && var7 == this.field2935) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method5236(this.field2934 * 8 + var8, this.field2935 * 8 + var9, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class252)) {
			return false;
		} else {
			class252 var2 = (class252)var1;
			if (super.field2988 == var2.field2988 && var2.field2989 == super.field2989) {
				return this.field2934 == var2.field2934 && this.field2935 == var2.field2935;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.field2988 | super.field2989 << 8 | this.field2934 << 16 | this.field2935 << 24;
	}

	int method5124() {
		return this.field2932;
	}

	int method5125() {
		return this.field2933;
	}

	int method5126() {
		return this.field2934;
	}

	int method5130() {
		return this.field2935;
	}
}
