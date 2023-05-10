import java.util.Iterator;

public class class463 implements Iterator {
	class449 field4892;
	class449 field4894;
	class464 field4891;
	int field4893;

	public class463(class464 var1) {
		this.field4894 = null;
		this.field4891 = var1;
		this.method8347();
	}

	void method8347() {
		this.field4892 = this.field4891.field4895[0].field4746;
		this.field4893 = 1;
		this.field4894 = null;
	}

	public class449 method8349() {
		this.method8347();
		return (class449)this.next();
	}

	public Object next() {
		class449 var1;
		if (this.field4892 != this.field4891.field4895[this.field4893 - 1]) {
			var1 = this.field4892;
			this.field4892 = var1.field4746;
			this.field4894 = var1;
			return var1;
		} else {
			do {
				if (this.field4893 >= this.field4891.field4896) {
					return null;
				}

				var1 = this.field4891.field4895[this.field4893++].field4746;
			} while(var1 == this.field4891.field4895[this.field4893 - 1]);

			this.field4892 = var1.field4746;
			this.field4894 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field4892 != this.field4891.field4895[this.field4893 - 1]) {
			return true;
		} else {
			while (this.field4893 < this.field4891.field4896) {
				if (this.field4891.field4895[this.field4893++].field4746 != this.field4891.field4895[this.field4893 - 1]) {
					this.field4892 = this.field4891.field4895[this.field4893 - 1].field4746;
					return true;
				}

				this.field4892 = this.field4891.field4895[this.field4893 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field4894 == null) {
			throw new IllegalStateException();
		} else {
			this.field4894.method8051();
			this.field4894 = null;
		}
	}
}
