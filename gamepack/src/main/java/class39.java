public class class39 extends class49 {
	class363 field272;
	class363 field273;
	int field274;
	int field275;

	public class39() {
		this.field272 = new class363();
		this.field273 = new class363();
		this.field274 = 0;
		this.field275 = -1;
	}

	public final synchronized void method747(class49 var1) {
		this.field272.method6712(var1);
	}

	public final synchronized void method769(class49 var1) {
		var1.method8051();
	}

	void method731() {
		if (this.field274 > 0) {
			for (class55 var1 = (class55)this.field273.method6716(); var1 != null; var1 = (class55)this.field273.method6725()) {
				var1.field412 -= this.field274;
			}

			this.field275 -= this.field274;
			this.field274 = 0;
		}

	}

	void method732(class449 var1, class55 var2) {
		while (var1 != this.field273.field4355 && ((class55)var1).field412 <= var2.field412) {
			var1 = var1.field4746;
		}

		class363.method6738(var2, var1);
		this.field275 = ((class55)this.field273.field4355.field4746).field412;
	}

	void method738(class55 var1) {
		var1.method8051();
		var1.method1121();
		class449 var2 = this.field273.field4355.field4746;
		if (var2 == this.field273.field4355) {
			this.field275 = -1;
		} else {
			this.field275 = ((class55)var2).field412;
		}

	}

	protected class49 method1042() {
		return (class49)this.field272.method6716();
	}

	protected class49 method1040() {
		return (class49)this.field272.method6725();
	}

	protected int method1044() {
		return 0;
	}

	public final synchronized void method1064(int[] var1, int var2, int var3) {
		do {
			if (this.field275 < 0) {
				this.method753(var1, var2, var3);
				return;
			}

			if (this.field274 + var3 < this.field275) {
				this.field274 += var3;
				this.method753(var1, var2, var3);
				return;
			}

			int var4 = this.field275 - this.field274;
			this.method753(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field274 += var4;
			this.method731();
			class55 var5 = (class55)this.field273.method6716();
			synchronized(var5){}
			int var7 = var5.method1118(this);
			if (var7 < 0) {
				var5.field412 = 0;
				this.method738(var5);
			} else {
				var5.field412 = var7;
				this.method732(var5.field4746, var5);
			}
		} while(var3 != 0);

	}

	void method753(int[] var1, int var2, int var3) {
		for (class49 var4 = (class49)this.field272.method6716(); var4 != null; var4 = (class49)this.field272.method6725()) {
			var4.method1045(var1, var2, var3);
		}

	}

	public final synchronized void method1046(int var1) {
		do {
			if (this.field275 < 0) {
				this.method739(var1);
				return;
			}

			if (this.field274 + var1 < this.field275) {
				this.field274 += var1;
				this.method739(var1);
				return;
			}

			int var2 = this.field275 - this.field274;
			this.method739(var2);
			var1 -= var2;
			this.field274 += var2;
			this.method731();
			class55 var3 = (class55)this.field273.method6716();
			synchronized(var3){}
			int var5 = var3.method1118(this);
			if (var5 < 0) {
				var3.field412 = 0;
				this.method738(var3);
			} else {
				var3.field412 = var5;
				this.method732(var3.field4746, var3);
			}
		} while(var1 != 0);

	}

	void method739(int var1) {
		for (class49 var2 = (class49)this.field272.method6716(); var2 != null; var2 = (class49)this.field272.method6725()) {
			var2.method1046(var1);
		}

	}
}
