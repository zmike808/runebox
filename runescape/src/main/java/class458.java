public class class458 {
	boolean field4812;
	class344 field4810;
	int field4811;
	String field4808;

	class458(class344 var1) {
		this.field4811 = 0;
		this.field4812 = false;
		this.field4810 = var1;
	}

	void method8123(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (this.field4808 != var1) {
				this.field4808 = var1;
				this.field4811 = 0;
				this.field4812 = false;
				this.method8124();
			}
		}
	}

	int method8124() {
		if (this.field4808 == null) {
			this.field4811 = 100;
			this.field4812 = true;
		} else {
			if (this.field4811 < 33) {
				if (!this.field4810.method6525(class268.field3059.field3058, this.field4808)) {
					return this.field4811;
				}

				this.field4811 = 33;
			}

			if (this.field4811 == 33) {
				if (this.field4810.method6466(class268.field3056.field3058, this.field4808) && !this.field4810.method6525(class268.field3056.field3058, this.field4808)) {
					return this.field4811;
				}

				this.field4811 = 66;
			}

			if (this.field4811 == 66) {
				if (!this.field4810.method6525(this.field4808, class268.field3054.field3058)) {
					return this.field4811;
				}

				this.field4811 = 100;
				this.field4812 = true;
			}
		}

		return this.field4811;
	}

	boolean method8125() {
		return this.field4812;
	}

	int method8126() {
		return this.field4811;
	}
}
