public class class408 implements Comparable {
	class513 field4579;
	class513 field4581;

	class408() {
	}

	public class513 method7576() {
		return this.field4581;
	}

	public String method7577() {
		return null == this.field4581 ? "" : this.field4581.method9256();
	}

	public String method7578() {
		return null == this.field4579 ? "" : this.field4579.method9256();
	}

	void method7579(class513 var1, class513 var2) {
		if (null == var1) {
			throw new NullPointerException();
		} else {
			this.field4581 = var1;
			this.field4579 = var2;
		}
	}

	public int method7595(class408 var1) {
		return this.field4581.method9260(var1.field4581);
	}

	public int compareTo(Object var1) {
		return this.method7595((class408)var1);
	}

	static void method7593(int var0) {
		class81 var2 = (class81)class81.field1022.method8381((long)var0);
		if (null != var2) {
			var2.method8051();
		}
	}
}
