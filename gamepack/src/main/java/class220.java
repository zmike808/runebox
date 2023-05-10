public class class220 {
	class123[] field2524;
	int field2526;

	class220(class489 var1, int var2) {
		this.field2524 = new class123[var2];
		this.field2526 = var1.method8658();

		for (int var3 = 0; var3 < this.field2524.length; ++var3) {
			class123 var4 = new class123(this.field2526, var1, false);
			this.field2524[var3] = var4;
		}

		this.method4299();
	}

	void method4299() {
		class123[] var2 = this.field2524;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class123 var4 = var2[var3];
			if (var4.field1482 >= 0) {
				var4.field1479 = this.field2524[var4.field1482];
			}
		}

	}

	public int method4298() {
		return this.field2524.length;
	}

	class123 method4300(int var1) {
		return var1 >= this.method4298() ? null : this.field2524[var1];
	}

	class123[] method4302() {
		return this.field2524;
	}

	void method4303(class134 var1, int var2) {
		this.method4320(var1, var2, (boolean[])null, false);
	}

	void method4320(class134 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method3078();
		int var7 = 0;
		class123[] var8 = this.method4302();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			class123 var10 = var8[var9];
			if (var3 == null || var4 == var3[var7]) {
				var1.method3076(var2, var10, var7, var6);
			}

			++var7;
		}

	}
}
