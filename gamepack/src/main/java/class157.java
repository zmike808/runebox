public class class157 {
	class365 field1759;
	long field1756;
	long field1757;

	public class157(class489 var1) {
		this.field1756 = -1L;
		this.field1759 = new class365();
		this.method3292(var1);
	}

	void method3292(class489 var1) {
		this.field1757 = var1.method8681();
		this.field1756 = var1.method8681();

		for (int var3 = var1.method8658(); var3 != 0; var3 = var1.method8658()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class152(this);
			} else if (var3 == 4) {
				var4 = new class163(this);
			} else if (var3 == 3) {
				var4 = new class148(this);
			} else if (var3 == 2) {
				var4 = new class146(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new class153(this);
			}

			((class156)var4).method3284(var1);
			this.field1759.method6793((class449)var4);
		}

	}

	public void method3293(class160 var1) {
		if (this.field1757 == var1.field4745 && this.field1756 == var1.field1772) {
			for (class156 var3 = (class156)this.field1759.method6798(); null != var3; var3 = (class156)this.field1759.method6767()) {
				var3.method3285(var1);
			}

			++var1.field1772;
		} else {
			throw new RuntimeException("");
		}
	}
}
