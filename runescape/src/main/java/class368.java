import java.util.Iterator;

public class class368 implements Iterable {
	class444 field4367;
	public class444 field4368;

	public class368() {
		this.field4368 = new class444();
		this.field4368.field4739 = this.field4368;
		this.field4368.field4740 = this.field4368;
	}

	public void method6847() {
		while (this.field4368.field4739 != this.field4368) {
			this.field4368.field4739.method8040();
		}

	}

	public void method6864(class444 var1) {
		if (var1.field4740 != null) {
			var1.method8040();
		}

		var1.field4740 = this.field4368.field4740;
		var1.field4739 = this.field4368;
		var1.field4740.field4739 = var1;
		var1.field4739.field4740 = var1;
	}

	public class444 method6853() {
		class444 var1 = this.field4368.field4739;
		if (var1 == this.field4368) {
			return null;
		} else {
			var1.method8040();
			return var1;
		}
	}

	public class444 method6851() {
		return this.method6852((class444)null);
	}

	class444 method6852(class444 var1) {
		class444 var2;
		if (var1 == null) {
			var2 = this.field4368.field4739;
		} else {
			var2 = var1;
		}

		if (var2 == this.field4368) {
			this.field4367 = null;
			return null;
		} else {
			this.field4367 = var2.field4739;
			return var2;
		}
	}

	public class444 method6846() {
		class444 var1 = this.field4367;
		if (var1 == this.field4368) {
			this.field4367 = null;
			return null;
		} else {
			this.field4367 = var1.field4739;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class367(this);
	}

	public static void method6868(class444 var0, class444 var1) {
		if (var0.field4740 != null) {
			var0.method8040();
		}

		var0.field4740 = var1;
		var0.field4739 = var1.field4739;
		var0.field4740.field4739 = var0;
		var0.field4739.field4740 = var0;
	}
}
