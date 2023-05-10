public class class366 {
	class443 field4362;
	class443 field4363;

	public class366() {
		this.field4362 = new class443();
		this.field4362.field4736 = this.field4362;
		this.field4362.field4737 = this.field4362;
	}

	public void method6835(class443 var1) {
		if (var1.field4737 != null) {
			var1.method8039();
		}

		var1.field4737 = this.field4362.field4737;
		var1.field4736 = this.field4362;
		var1.field4737.field4736 = var1;
		var1.field4736.field4737 = var1;
	}

	public class443 method6830() {
		class443 var1 = this.field4362.field4736;
		if (var1 == this.field4362) {
			this.field4363 = null;
			return null;
		} else {
			this.field4363 = var1.field4736;
			return var1;
		}
	}

	public class443 method6833() {
		class443 var1 = this.field4363;
		if (var1 == this.field4362) {
			this.field4363 = null;
			return null;
		} else {
			this.field4363 = var1.field4736;
			return var1;
		}
	}
}
