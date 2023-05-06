import java.util.Iterator;

public class class367 implements Iterator {
	class368 field4365;
	class444 field4364;
	class444 field4366;

	class367(class368 var1) {
		this.field4366 = null;
		this.field4365 = var1;
		this.field4364 = this.field4365.field4368.field4739;
		this.field4366 = null;
	}

	public Object next() {
		class444 var1 = this.field4364;
		if (var1 == this.field4365.field4368) {
			var1 = null;
			this.field4364 = null;
		} else {
			this.field4364 = var1.field4739;
		}

		this.field4366 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4364 != this.field4365.field4368;
	}

	public void remove() {
		if (this.field4366 == null) {
			throw new IllegalStateException();
		} else {
			this.field4366.method8040();
			this.field4366 = null;
		}
	}
}
