import java.util.Collection;
import java.util.Iterator;

public class class365 implements Iterable, Collection {
	class449 field4360;
	class449 field4361;

	public class365() {
		this.field4360 = new class449();
		this.field4360.field4746 = this.field4360;
		this.field4360.field4747 = this.field4360;
	}

	public void method6753() {
		while (this.field4360.field4746 != this.field4360) {
			this.field4360.field4746.method8051();
		}

	}

	public void method6793(class449 var1) {
		if (var1.field4747 != null) {
			var1.method8051();
		}

		var1.field4747 = this.field4360.field4747;
		var1.field4746 = this.field4360;
		var1.field4747.field4746 = var1;
		var1.field4746.field4747 = var1;
	}

	public void method6770(class449 var1) {
		if (var1.field4747 != null) {
			var1.method8051();
		}

		var1.field4747 = this.field4360;
		var1.field4746 = this.field4360.field4746;
		var1.field4747.field4746 = var1;
		var1.field4746.field4747 = var1;
	}

	public class449 method6798() {
		return this.method6811((class449)null);
	}

	class449 method6811(class449 var1) {
		class449 var2;
		if (var1 == null) {
			var2 = this.field4360.field4746;
		} else {
			var2 = var1;
		}

		if (var2 == this.field4360) {
			this.field4361 = null;
			return null;
		} else {
			this.field4361 = var2.field4746;
			return var2;
		}
	}

	public class449 method6767() {
		class449 var1 = this.field4361;
		if (var1 == this.field4360) {
			this.field4361 = null;
			return null;
		} else {
			this.field4361 = var1.field4746;
			return var1;
		}
	}

	int method6809() {
		int var1 = 0;

		for (class449 var2 = this.field4360.field4746; var2 != this.field4360; var2 = var2.field4746) {
			++var1;
		}

		return var1;
	}

	public boolean method6757() {
		return this.field4360.field4746 == this.field4360;
	}

	class449[] method6810() {
		class449[] var1 = new class449[this.method6809()];
		int var2 = 0;

		for (class449 var3 = this.field4360.field4746; var3 != this.field4360; var3 = var3.field4746) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public Iterator iterator() {
		return new class364(this);
	}

	public int size() {
		return this.method6809();
	}

	public boolean isEmpty() {
		return this.method6757();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method6810();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (class449 var3 = this.field4360.field4746; var3 != this.field4360; var3 = var3.field4746) {
			var1[var2++] = var3;
		}

		return var1;
	}

	boolean method6764(class449 var1) {
		this.method6793(var1);
		return true;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method6753();
	}

	public boolean add(Object var1) {
		return this.method6764((class449)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public static void method6756(class449 var0, class449 var1) {
		if (var0.field4747 != null) {
			var0.method8051();
		}

		var0.field4747 = var1;
		var0.field4746 = var1.field4746;
		var0.field4747.field4746 = var0;
		var0.field4746.field4747 = var0;
	}
}
