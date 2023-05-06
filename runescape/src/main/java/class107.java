import java.io.IOException;

public class class107 {
	boolean field1389;
	class290 field1382;
	class290 field1387;
	class290 field1392;
	class290 field1393;
	class365 field1381;
	class414 field1394;
	class488 field1386;
	class489 field1384;
	int field1383;
	int field1388;
	int field1390;
	int field1391;
	public class506 field1385;

	class107() {
		this.field1381 = new class365();
		this.field1383 = 0;
		this.field1384 = new class489(5000);
		this.field1386 = new class488(40000);
		this.field1382 = null;
		this.field1388 = 0;
		this.field1389 = true;
		this.field1390 = 0;
		this.field1391 = 0;
	}

	final void method2742() {
		this.field1381.method6753();
		this.field1383 = 0;
	}

	final void method2751() throws IOException {
		if (null != this.field1394 && this.field1383 > 0) {
			this.field1384.field4989 = 0;

			while (true) {
				class289 var2 = (class289)this.field1381.method6798();
				if (null == var2 || var2.field3213 > this.field1384.field4991.length - this.field1384.field4989) {
					this.field1394.method7710(this.field1384.field4991, 0, this.field1384.field4989);
					this.field1391 = 0;
					break;
				}

				this.field1384.method8886(var2.field3212.field4991, 0, var2.field3213);
				this.field1383 -= var2.field3213;
				var2.method8051();
				var2.field3212.method8722();
				var2.method5501();
			}
		}

	}

	public final void method2735(class289 var1) {
		this.field1381.method6793(var1);
		var1.field3213 = var1.field3212.field4989;
		var1.field3212.field4989 = 0;
		this.field1383 += var1.field3213;
	}

	void method2736(class414 var1) {
		this.field1394 = var1;
	}

	void method2737() {
		if (this.field1394 != null) {
			this.field1394.method7711();
			this.field1394 = null;
		}

	}

	void method2738() {
		this.field1394 = null;
	}

	class414 method2740() {
		return this.field1394;
	}
}
