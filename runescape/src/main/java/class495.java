import java.util.Comparator;

public class class495 implements Comparator {
	final boolean field5053;

	public class495(boolean var1) {
		this.field5053 = var1;
	}

	int method8949(class408 var1, class408 var2) {
		return this.field5053 ? var1.method7595(var2) : var2.method7595(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8949((class408)var1, (class408)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
