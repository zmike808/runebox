import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class410 {
	class408[] field4590;
	int field4588;
	Comparator field4591;
	HashMap field4592;
	HashMap field4593;
	final int field4589;

	class410(int var1) {
		this.field4588 = 0;
		this.field4591 = null;
		this.field4589 = var1;
		this.field4590 = this.method7628(var1);
		this.field4593 = new HashMap(var1 / 8);
		this.field4592 = new HashMap(var1 / 8);
	}

	abstract class408 method7631();

	abstract class408[] method7628(int var1);

	public void method7654() {
		this.field4588 = 0;
		Arrays.fill(this.field4590, (Object)null);
		this.field4593.clear();
		this.field4592.clear();
	}

	public int method7610() {
		return this.field4588;
	}

	public boolean method7611() {
		return this.field4589 == this.field4588;
	}

	public boolean method7640(class513 var1) {
		if (!var1.method9258()) {
			return false;
		} else {
			return this.field4593.containsKey(var1) ? true : this.field4592.containsKey(var1);
		}
	}

	public class408 method7647(class513 var1) {
		class408 var3 = this.method7614(var1);
		return var3 != null ? var3 : this.method7620(var1);
	}

	class408 method7614(class513 var1) {
		return !var1.method9258() ? null : (class408)this.field4593.get(var1);
	}

	class408 method7620(class513 var1) {
		return !var1.method9258() ? null : (class408)this.field4592.get(var1);
	}

	public final boolean method7622(class513 var1) {
		class408 var3 = this.method7614(var1);
		if (null == var3) {
			return false;
		} else {
			this.method7624(var3);
			return true;
		}
	}

	final void method7624(class408 var1) {
		int var3 = this.method7623(var1);
		if (var3 != -1) {
			this.method7627(var3);
			this.method7619(var1);
		}
	}

	class408 method7618(class513 var1) {
		return this.method7644(var1, (class513)null);
	}

	class408 method7644(class513 var1, class513 var2) {
		if (this.method7614(var1) != null) {
			throw new IllegalStateException();
		} else {
			class408 var4 = this.method7631();
			var4.method7579(var1, var2);
			this.method7625(var4);
			this.method7683(var4);
			return var4;
		}
	}

	public final class408 method7642(int var1) {
		if (var1 >= 0 && var1 < this.field4588) {
			return this.field4590[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	public final void method7621() {
		if (null == this.field4591) {
			Arrays.sort(this.field4590, 0, this.field4588);
		} else {
			Arrays.sort(this.field4590, 0, this.field4588, this.field4591);
		}

	}

	final void method7626(class408 var1, class513 var2, class513 var3) {
		this.method7619(var1);
		var1.method7579(var2, var3);
		this.method7683(var1);
	}

	final int method7623(class408 var1) {
		for (int var3 = 0; var3 < this.field4588; ++var3) {
			if (this.field4590[var3] == var1) {
				return var3;
			}
		}

		return -1;
	}

	final void method7619(class408 var1) {
		if (this.field4593.remove(var1.field4581) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field4579 != null) {
				this.field4592.remove(var1.field4579);
			}

		}
	}

	final void method7625(class408 var1) {
		this.field4590[++this.field4588 - 1] = var1;
	}

	final void method7683(class408 var1) {
		this.field4593.put(var1.field4581, var1);
		if (var1.field4579 != null) {
			class408 var3 = (class408)this.field4592.put(var1.field4579, var1);
			if (null != var3 && var3 != var1) {
				var3.field4579 = null;
			}
		}

	}

	final void method7627(int var1) {
		--this.field4588;
		if (var1 < this.field4588) {
			System.arraycopy(this.field4590, var1 + 1, this.field4590, var1, this.field4588 - var1);
		}

	}

	public final void method7629() {
		this.field4591 = null;
	}

	public final void method7630(Comparator var1) {
		if (this.field4591 == null) {
			this.field4591 = var1;
		} else if (this.field4591 instanceof class409) {
			((class409)this.field4591).method7597(var1);
		}

	}
}
