import java.util.zip.Inflater;

public class class509 {
	Inflater field5134;

	public class509() {
		this(-1, 1000000);
	}

	class509(int var1, int var2) {
	}

	public void method9248(class489 var1, byte[] var2) {
		if (31 == var1.field4991[var1.field4989] && -117 == var1.field4991[var1.field4989 + 1]) {
			if (this.field5134 == null) {
				this.field5134 = new Inflater(true);
			}

			try {
				this.field5134.setInput(var1.field4991, var1.field4989 + 10, var1.field4991.length - (var1.field4989 + 10 + 8));
				this.field5134.inflate(var2);
			} catch (Exception var5) {
				this.field5134.reset();
				throw new RuntimeException("");
			}

			this.field5134.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
