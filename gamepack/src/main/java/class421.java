public class class421 {
	public int field4648;
	public int field4649;
	public int field4650;
	public int field4651;

	public class421(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public class421(int var1, int var2, int var3, int var4) {
		this.method7790(var1, var2);
		this.method7788(var3, var4);
	}

	public void method7790(int var1, int var2) {
		this.field4650 = var1;
		this.field4649 = var2;
	}

	public void method7788(int var1, int var2) {
		this.field4648 = var1;
		this.field4651 = var2;
	}

	public boolean method7791(int var1, int var2) {
		return var1 >= this.field4650 && var1 < this.field4648 + this.field4650 && var2 >= this.field4649 && var2 < this.field4649 + this.field4651;
	}

	public String toString() {
		return null;
	}

	public void method7805(class421 var1, class421 var2) {
		this.method7793(var1, var2);
		this.method7794(var1, var2);
	}

	void method7793(class421 var1, class421 var2) {
		var2.field4650 = this.field4650;
		var2.field4648 = this.field4648;
		if (this.field4650 < var1.field4650) {
			var2.field4648 = (var2.field4648 * -1469434281 - (var1.field4650 * -1469434281 - this.field4650 * -1469434281)) * 944313703;
			var2.field4650 = var1.field4650;
		}

		if (var2.method7797() > var1.method7797()) {
			var2.field4648 -= var2.method7797() - var1.method7797();
		}

		if (var2.field4648 < 0) {
			var2.field4648 = 0;
		}

	}

	void method7794(class421 var1, class421 var2) {
		var2.field4649 = this.field4649;
		var2.field4651 = this.field4651;
		if (this.field4649 < var1.field4649) {
			var2.field4651 = (var2.field4651 * 149296003 - (var1.field4649 * 149296003 - this.field4649 * 149296003)) * -1376251093;
			var2.field4649 = var1.field4649;
		}

		if (var2.method7815() > var1.method7815()) {
			var2.field4651 -= var2.method7815() - var1.method7815();
		}

		if (var2.field4651 < 0) {
			var2.field4651 = 0;
		}

	}

	int method7797() {
		return this.field4648 + this.field4650;
	}

	int method7815() {
		return this.field4651 + this.field4649;
	}
}
