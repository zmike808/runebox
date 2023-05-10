public final class class465 {
	class449 field4900;
	class449 field4903;
	class449[] field4901;
	int field4902;
	int field4904;

	public class465(int var1) {
		this.field4904 = 0;
		this.field4902 = var1;
		this.field4901 = new class449[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class449 var3 = this.field4901[var2] = new class449();
			var3.field4746 = var3;
			var3.field4747 = var3;
		}

	}

	public class449 method8381(long var1) {
		class449 var3 = this.field4901[(int)(var1 & (long)(this.field4902 - 1))];

		for (this.field4903 = var3.field4746; this.field4903 != var3; this.field4903 = this.field4903.field4746) {
			if (this.field4903.field4745 == var1) {
				class449 var4 = this.field4903;
				this.field4903 = this.field4903.field4746;
				return var4;
			}
		}

		this.field4903 = null;
		return null;
	}

	public void method8382(class449 var1, long var2) {
		if (var1.field4747 != null) {
			var1.method8051();
		}

		class449 var4 = this.field4901[(int)(var2 & (long)(this.field4902 - 1))];
		var1.field4747 = var4.field4747;
		var1.field4746 = var4;
		var1.field4747.field4746 = var1;
		var1.field4746.field4747 = var1;
		var1.field4745 = var2;
	}

	public class449 method8387() {
		this.field4904 = 0;
		return this.method8384();
	}

	public class449 method8384() {
		class449 var1;
		if (this.field4904 > 0 && this.field4900 != this.field4901[this.field4904 - 1]) {
			var1 = this.field4900;
			this.field4900 = var1.field4746;
			return var1;
		} else {
			do {
				if (this.field4904 >= this.field4902) {
					return null;
				}

				var1 = this.field4901[this.field4904++].field4746;
			} while(var1 == this.field4901[this.field4904 - 1]);

			this.field4900 = var1.field4746;
			return var1;
		}
	}
}
