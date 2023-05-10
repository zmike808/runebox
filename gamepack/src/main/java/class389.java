public class class389 {
	int field4490;
	int field4491;
	int field4492;
	int field4493;
	long field4485;
	long field4486;
	long field4487;
	long field4488;
	long field4489;
	public boolean field4484;

	public class389() {
		this.field4486 = -1L;
		this.field4485 = -1L;
		this.field4484 = false;
		this.field4487 = 0L;
		this.field4488 = 0L;
		this.field4489 = 0L;
		this.field4490 = 0;
		this.field4491 = 0;
		this.field4492 = 0;
		this.field4493 = 0;
	}

	public void method7341() {
		this.field4486 = class294.method2575();
	}

	public void method7352() {
		if (this.field4486 != -1L) {
			this.field4488 = class294.method2575() - this.field4486;
			this.field4486 = -1L;
		}

	}

	public void method7342(int var1) {
		this.field4485 = class294.method2575();
		this.field4490 = var1;
	}

	public void method7343() {
		if (-1L != this.field4485) {
			this.field4487 = class294.method2575() - this.field4485;
			this.field4485 = -1L;
		}

		++this.field4492;
		this.field4484 = true;
	}

	public void method7344() {
		this.field4484 = false;
		this.field4491 = 0;
	}

	public void method7345() {
		this.method7343();
	}

	public void method7346(class489 var1) {
		long var3 = this.field4488;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.method8642((int)var3);
		long var5 = this.field4487;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.method8642((int)var5);
		long var7 = this.field4489;
		var7 /= 10L;
		if (var7 < 0L) {
			var7 = 0L;
		} else if (var7 > 65535L) {
			var7 = 65535L;
		}

		var1.method8642((int)var7);
		var1.method8642(this.field4490);
		var1.method8642(this.field4491);
		var1.method8642(this.field4492);
		var1.method8642(this.field4493);
	}
}
