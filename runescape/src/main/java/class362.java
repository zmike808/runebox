public final class class362 {
	class444 field4354;

	public class362() {
		this.field4354 = new class444();
		this.field4354.field4739 = this.field4354;
		this.field4354.field4740 = this.field4354;
	}

	public void method6700(class444 var1) {
		if (var1.field4740 != null) {
			var1.method8040();
		}

		var1.field4740 = this.field4354.field4740;
		var1.field4739 = this.field4354;
		var1.field4740.field4739 = var1;
		var1.field4739.field4740 = var1;
	}

	public void method6707(class444 var1) {
		if (var1.field4740 != null) {
			var1.method8040();
		}

		var1.field4740 = this.field4354;
		var1.field4739 = this.field4354.field4739;
		var1.field4740.field4739 = var1;
		var1.field4739.field4740 = var1;
	}

	public class444 method6702() {
		class444 var1 = this.field4354.field4739;
		return var1 == this.field4354 ? null : var1;
	}
}
