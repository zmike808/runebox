import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class399 {
	final class378 field4536;
	final class378 field4541;
	final class397 field4540;
	final int field4542;
	final Comparator field4538;
	final Map field4537;
	final long field4539;

	public class399(int var1, class397 var2) {
		this(-1L, var1, var2);
	}

	class399(long var1, int var3, class397 var4) {
		this.field4538 = new class398(this);
		this.field4539 = var1;
		this.field4542 = var3;
		this.field4540 = var4;
		if (-1 == this.field4542) {
			this.field4537 = new HashMap(64);
			this.field4541 = new class378(64, this.field4538);
			this.field4536 = null;
		} else {
			if (null == this.field4540) {
				throw new IllegalArgumentException("");
			}

			this.field4537 = new HashMap(this.field4542);
			this.field4541 = new class378(this.field4542, this.field4538);
			this.field4536 = new class378(this.field4542);
		}

	}

	boolean method7436() {
		return this.field4542 != -1;
	}

	public Object method7457(Object var1) {
		synchronized(this){}
		if (-1L != this.field4539) {
			this.method7441();
		}

		class400 var4 = (class400)this.field4537.get(var1);
		if (null == var4) {
			return null;
		} else {
			this.method7439(var4, false);
			return var4.field4543;
		}
	}

	public Object method7438(Object var1, Object var2) {
		synchronized(this){}
		if (this.field4539 != -1L) {
			this.method7441();
		}

		class400 var5 = (class400)this.field4537.get(var1);
		if (null != var5) {
			Object var8 = var5.field4543;
			var5.field4543 = var2;
			this.method7439(var5, false);
			return var8;
		} else {
			class400 var6;
			if (this.method7436() && this.field4537.size() == this.field4542) {
				var6 = (class400)this.field4536.remove();
				this.field4537.remove(var6.field4544);
				this.field4541.remove(var6);
			}

			var6 = new class400(var2, var1);
			this.field4537.put(var1, var6);
			this.method7439(var6, true);
			return null;
		}
	}

	void method7439(class400 var1, boolean var2) {
		if (!var2) {
			this.field4541.remove(var1);
			if (this.method7436() && !this.field4536.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4545 = System.currentTimeMillis();
		if (this.method7436()) {
			switch(this.field4540.field4532) {
			case 0:
				++var1.field4546;
				break;
			case 1:
				var1.field4546 = var1.field4545;
			}

			this.field4536.add(var1);
		}

		this.field4541.add(var1);
	}

	void method7441() {
		if (this.field4539 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field4539;

			while (!this.field4541.isEmpty()) {
				class400 var4 = (class400)this.field4541.peek();
				if (var4.field4545 >= var2) {
					return;
				}

				this.field4537.remove(var4.field4544);
				this.field4541.remove(var4);
				if (this.method7436()) {
					this.field4536.remove(var4);
				}
			}

		}
	}

	public void method7458() {
		synchronized(this){}
		this.field4537.clear();
		this.field4541.clear();
		if (this.method7436()) {
			this.field4536.clear();
		}

	}
}
