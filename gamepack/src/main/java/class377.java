import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class377 implements Iterator {
	class378 field4396;
	int field4397;
	int field4398;

	class377(class378 var1) {
		this.field4398 = 0;
		this.field4397 = this.field4396.field4401;
		this.field4396 = var1;
	}

	public boolean hasNext() {
		return this.field4398 < this.field4396.field4404;
	}

	public Object next() {
		if (this.field4397 != this.field4396.field4401) {
			throw new ConcurrentModificationException();
		} else if (this.field4398 < this.field4396.field4404) {
			Object var1 = this.field4396.field4402[this.field4398].field4390;
			++this.field4398;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
