import java.util.Iterator;

class class473 implements Iterator {
	int field4936;
	// $FF: synthetic field
	final class474 this$0;

	class473(class474 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4936 < this.this$0.method7960();
	}

	public Object next() {
		int var1 = ++this.field4936 - 1;
		class432 var2 = (class432)this.this$0.field4937.method5426((long)var1);
		return var2 != null ? var2 : this.this$0.method8480(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
