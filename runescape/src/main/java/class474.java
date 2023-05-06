import java.util.Iterator;

public class class474 extends class431 implements class276 {
	final class278 field4937;
	final class344 field4938;
	final int field4939;

	public class474(class333 var1, int var2, class359 var3, class344 var4) {
		super(var1, var3, null != var4 ? var4.method6458(var2) : 0);
		this.field4937 = new class278(64);
		this.field4938 = var4;
		this.field4939 = var2;
	}

	protected class433 method7968(int var1) {
		class278 var4;
		synchronized(var4 = this.field4937){}
		class432 var3 = (class432)this.field4937.method5426((long)var1);
		if (null == var3) {
			var3 = this.method8480(var1);
			this.field4937.method5450(var3, (long)var1);
		}

		return var3;
	}

	class432 method8480(int var1) {
		byte[] var3 = this.field4938.method6468(this.field4939, var1);
		class432 var4 = new class432(var1);
		if (var3 != null) {
			var4.method7980(new class489(var3));
		}

		return var4;
	}

	public void method8472() {
		class278 var2;
		synchronized(var2 = this.field4937){}
		this.field4937.method5437();
	}

	public Iterator iterator() {
		return new class473(this);
	}
}
