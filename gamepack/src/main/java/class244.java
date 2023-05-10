public class class244 extends class258 {
	class244() {
	}

	void method4837(class489 var1) {
		int var3 = var1.method8658();
		if (var3 != class264.field3030.field3032) {
			throw new IllegalStateException("");
		} else {
			super.field2990 = var1.method8658();
			super.field2995 = var1.method8658();
			super.field2996 = var1.method8660();
			super.field3001 = var1.method8660();
			super.field2988 = var1.method8660();
			super.field2989 = var1.method8660();
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
		if (var3 != class263.field3025.field3027) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method8658();
			int var5 = var1.method8658();
			if (super.field2988 == var4 && super.field2989 == var5) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method5236(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class244)) {
			return false;
		} else {
			class244 var2 = (class244)var1;
			return var2.field2988 == super.field2988 && var2.field2989 == super.field2989;
		}
	}

	public int hashCode() {
		return super.field2988 | super.field2989 << 8;
	}
}
