import java.util.Iterator;

public class class364 implements Iterator {
	class365 field4358;
	class449 field4357;
	class449 field4359;

	class364(class365 var1) {
		this.field4357 = null;
		this.method6745(var1);
	}

	void method6745(class365 var1) {
		this.field4358 = var1;
		this.method6742();
	}

	void method6742() {
		this.field4359 = this.field4358 != null ? this.field4358.field4360.field4746 : null;
		this.field4357 = null;
	}

	public Object next() {
		class449 var1 = this.field4359;
		if (var1 == this.field4358.field4360) {
			var1 = null;
			this.field4359 = null;
		} else {
			this.field4359 = var1.field4746;
		}

		this.field4357 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4359 != this.field4358.field4360 && this.field4359 != null;
	}

	public void remove() {
		if (this.field4357 == null) {
			throw new IllegalStateException();
		} else {
			this.field4357.method8051();
			this.field4357 = null;
		}
	}
}
