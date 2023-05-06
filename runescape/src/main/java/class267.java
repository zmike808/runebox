public abstract class class267 {
	int field3051;
	int field3052;
	public final class308 field3050;
	public final class308 field3053;

	class267(class308 var1, class308 var2) {
		this.field3053 = var1;
		this.field3050 = var2;
	}

	abstract class262 method5317();

	abstract int method5318();

	abstract int method5328();

	public abstract int method5322();

	boolean method5316(int var1, int var2) {
		if (this.method5321(var1, var2)) {
			return true;
		} else {
			return this.method5315(var1, var2);
		}
	}

	boolean method5320() {
		return this.method5322() >= 0;
	}

	boolean method5321(int var1, int var2) {
		if (!this.method5320()) {
			return false;
		} else {
			class183 var4 = class355.method6671(this.method5322());
			int var5 = this.method5318();
			int var6 = this.method5328();
			switch(var4.field1933.field1994) {
			case 0:
				if (var1 <= this.field3051 - var5 || var1 > this.field3051) {
					return false;
				}
				break;
			case 1:
				if (var1 < this.field3051 || var1 >= this.field3051 + var5) {
					return false;
				}
				break;
			case 2:
				if (var1 < this.field3051 - var5 / 2 || var1 > this.field3051 + var5 / 2) {
					return false;
				}
			}

			switch(var4.field1927.field2056) {
			case 0:
				if (var2 >= this.field3052 && var2 < var6 + this.field3052) {
					break;
				}

				return false;
			case 1:
				if (var2 < this.field3052 - var6 / 2 || var2 > this.field3052 + var6 / 2) {
					return false;
				}
				break;
			case 2:
				if (var2 <= this.field3052 - var6 || var2 > this.field3052) {
					return false;
				}
			}

			return true;
		}
	}

	boolean method5315(int var1, int var2) {
		class262 var4 = this.method5317();
		if (null == var4) {
			return false;
		} else if (var1 >= this.field3051 - var4.field3024 / 2 && var1 <= var4.field3024 / 2 + this.field3051) {
			return var2 >= this.field3052 && var2 <= this.field3052 + var4.field3023;
		} else {
			return false;
		}
	}
}
