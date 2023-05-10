import java.util.Iterator;

public final class class464 implements Iterable {
	class449 field4897;
	class449 field4898;
	class449[] field4895;
	int field4896;
	int field4899;

	public class464(int var1) {
		this.field4899 = 0;
		this.field4896 = var1;
		this.field4895 = new class449[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class449 var3 = this.field4895[var2] = new class449();
			var3.field4746 = var3;
			var3.field4747 = var3;
		}

	}

	public class449 method8360(long var1) {
		class449 var3 = this.field4895[(int)(var1 & (long)(this.field4896 - 1))];

		for (this.field4897 = var3.field4746; this.field4897 != var3; this.field4897 = this.field4897.field4746) {
			if (this.field4897.field4745 == var1) {
				class449 var4 = this.field4897;
				this.field4897 = this.field4897.field4746;
				return var4;
			}
		}

		this.field4897 = null;
		return null;
	}

	public void method8361(class449 var1, long var2) {
		if (var1.field4747 != null) {
			var1.method8051();
		}

		class449 var4 = this.field4895[(int)(var2 & (long)(this.field4896 - 1))];
		var1.field4747 = var4.field4747;
		var1.field4746 = var4;
		var1.field4747.field4746 = var1;
		var1.field4746.field4747 = var1;
		var1.field4745 = var2;
	}

	public void method8362() {
		for (int var1 = 0; var1 < this.field4896; ++var1) {
			class449 var2 = this.field4895[var1];

			while (true) {
				class449 var3 = var2.field4746;
				if (var3 == var2) {
					break;
				}

				var3.method8051();
			}
		}

		this.field4897 = null;
		this.field4898 = null;
	}

	public class449 method8363() {
		this.field4899 = 0;
		return this.method8366();
	}

	public class449 method8366() {
		class449 var1;
		if (this.field4899 > 0 && this.field4898 != this.field4895[this.field4899 - 1]) {
			var1 = this.field4898;
			this.field4898 = var1.field4746;
			return var1;
		} else {
			do {
				if (this.field4899 >= this.field4896) {
					return null;
				}

				var1 = this.field4895[this.field4899++].field4746;
			} while(var1 == this.field4895[this.field4899 - 1]);

			this.field4898 = var1.field4746;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class463(this);
	}
}
