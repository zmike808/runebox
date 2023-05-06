import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class160 extends class449 {
	boolean field1776;
	boolean field1778;
	int[] field1771;
	long field1772;
	public byte field1769;
	public byte field1775;
	public String field1773;
	public List field1770;

	static {
		new BitSet(65536);
	}

	public class160(class489 var1) {
		this.field1778 = true;
		this.field1773 = null;
		this.method3306(var1);
	}

	public int[] method3311() {
		if (this.field1771 == null) {
			String[] var2 = new String[this.field1770.size()];
			this.field1771 = new int[this.field1770.size()];

			for (int var3 = 0; var3 < this.field1770.size(); this.field1771[var3] = var3++) {
				var2[var3] = ((class142)this.field1770.get(var3)).field1652.method9257();
			}

			int[] var4 = this.field1771;
			class486.method3149(var2, var4, 0, var2.length - 1);
		}

		return this.field1771;
	}

	void method3318(class142 var1) {
		this.field1770.add(var1);
		this.field1771 = null;
	}

	void method3304(int var1) {
		this.field1770.remove(var1);
		this.field1771 = null;
	}

	public int method3303() {
		return this.field1770.size();
	}

	public int method3302(String var1) {
		if (!this.field1778) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field1770.size(); ++var3) {
				if (((class142)this.field1770.get(var3)).field1652.method9256().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	void method3306(class489 var1) {
		int var3 = var1.method8658();
		if (0 != (var3 & 1)) {
			this.field1776 = true;
		}

		if ((var3 & 2) != 0) {
			this.field1778 = true;
		}

		int var4 = 2;
		if (0 != (var3 & 4)) {
			var4 = var1.method8658();
		}

		super.field4745 = var1.method8681();
		this.field1772 = var1.method8681();
		this.field1773 = var1.method8669();
		var1.method8706();
		this.field1775 = var1.method8659();
		this.field1769 = var1.method8659();
		int var5 = var1.method8660();
		if (var5 > 0) {
			this.field1770 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				class142 var7 = new class142();
				if (this.field1776) {
					var1.method8681();
				}

				if (this.field1778) {
					var7.field1652 = new class513(var1.method8669());
				}

				var7.field1650 = var1.method8659();
				var7.field1655 = var1.method8660();
				if (var4 >= 3) {
					var1.method8706();
				}

				this.field1770.add(var6, var7);
			}
		}

	}

	static final int method3326(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var0 * var3 >> 16;
	}
}
