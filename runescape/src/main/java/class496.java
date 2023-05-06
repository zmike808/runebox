import java.util.Comparator;

public class class496 implements Comparator {
	final boolean field5057;

	public class496(boolean var1) {
		this.field5057 = var1;
	}

	int method8961(class408 var1, class408 var2) {
		return this.field5057 ? var1.method7576().method9260(var2.method7576()) : var2.method7576().method9260(var1.method7576());
	}

	public int compare(Object var1, Object var2) {
		return this.method8961((class408)var1, (class408)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
