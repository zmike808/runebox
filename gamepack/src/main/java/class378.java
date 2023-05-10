import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class378 extends AbstractQueue {
	class376[] field4402;
	int field4401;
	int field4404;
	Map field4400;
	final Comparator field4403;

	public class378(int var1) {
		this(var1, (Comparator)null);
	}

	public class378(int var1, Comparator var2) {
		this.field4401 = 0;
		this.field4402 = new class376[var1];
		this.field4400 = new HashMap();
		this.field4403 = var2;
	}

	void method6987() {
		int var2 = 1 + (this.field4402.length << 1);
		this.field4402 = (class376[])((class376[])Arrays.copyOf(this.field4402, var2));
	}

	public int size() {
		return this.field4404;
	}

	public boolean offer(Object var1) {
		if (this.field4400.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4401;
			int var2 = this.field4404;
			if (var2 >= this.field4402.length) {
				this.method6987();
			}

			++this.field4404;
			if (var2 == 0) {
				this.field4402[0] = new class376(var1, 0);
				this.field4400.put(var1, this.field4402[0]);
			} else {
				this.field4402[var2] = new class376(var1, var2);
				this.field4400.put(var1, this.field4402[var2]);
				this.method6962(var2);
			}

			return true;
		}
	}

	public Object peek() {
		return this.field4404 == 0 ? null : this.field4402[0].field4390;
	}

	public Object poll() {
		if (this.field4404 == 0) {
			return null;
		} else {
			++this.field4401;
			Object var1 = this.field4402[0].field4390;
			this.field4400.remove(var1);
			--this.field4404;
			if (this.field4404 == 0) {
				this.field4402[this.field4404] = null;
			} else {
				this.field4402[0] = this.field4402[this.field4404];
				this.field4402[0].field4391 = 0;
				this.field4402[this.field4404] = null;
				this.method6963(0);
			}

			return var1;
		}
	}

	public boolean remove(Object var1) {
		class376 var2 = (class376)this.field4400.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4401;
			--this.field4404;
			if (var2.field4391 == this.field4404) {
				this.field4402[this.field4404] = null;
				return true;
			} else {
				class376 var3 = this.field4402[this.field4404];
				this.field4402[this.field4404] = null;
				this.field4402[var2.field4391] = var3;
				this.field4402[var2.field4391].field4391 = var2.field4391;
				this.method6963(var2.field4391);
				if (this.field4402[var2.field4391] == var3) {
					this.method6962(var2.field4391);
				}

				return true;
			}
		}
	}

	void method6962(int var1) {
		class376 var3;
		int var4;
		for (var3 = this.field4402[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			class376 var5 = this.field4402[var4];
			if (null != this.field4403) {
				if (this.field4403.compare(var3.field4390, var5.field4390) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field4390).compareTo(var5.field4390) >= 0) {
				break;
			}

			this.field4402[var1] = var5;
			this.field4402[var1].field4391 = var1;
		}

		this.field4402[var1] = var3;
		this.field4402[var1].field4391 = var1;
	}

	void method6963(int var1) {
		class376 var3 = this.field4402[var1];

		int var9;
		for (int var4 = this.field4404 >>> 1; var1 < var4; var1 = var9) {
			int var5 = (var1 << 1) + 1;
			class376 var6 = this.field4402[var5];
			int var7 = 2 + (var1 << 1);
			class376 var8 = this.field4402[var7];
			if (null != this.field4403) {
				if (var7 < this.field4404 && this.field4403.compare(var6.field4390, var8.field4390) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field4404 && ((Comparable)var6.field4390).compareTo(var8.field4390) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (null != this.field4403) {
				if (this.field4403.compare(var3.field4390, this.field4402[var9].field4390) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field4390).compareTo(this.field4402[var9].field4390) <= 0) {
				break;
			}

			this.field4402[var1] = this.field4402[var9];
			this.field4402[var1].field4391 = var1;
		}

		this.field4402[var1] = var3;
		this.field4402[var1].field4391 = var1;
	}

	public boolean contains(Object var1) {
		return this.field4400.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4403 != null) {
			Arrays.sort(var1, this.field4403);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class377(this);
	}
}
