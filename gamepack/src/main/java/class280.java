public final class class280 {
	class368 field3083;
	class444 field3080;
	class464 field3082;
	int field3079;
	int field3081;

	public class280(int var1) {
		this.field3080 = new class444();
		this.field3083 = new class368();
		this.field3081 = var1;
		this.field3079 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field3082 = new class464(var2);
	}

	public class444 method5461(long var1) {
		class444 var3 = (class444)this.field3082.method8360(var1);
		if (var3 != null) {
			this.field3083.method6864(var3);
		}

		return var3;
	}

	public void method5460(long var1) {
		class444 var3 = (class444)this.field3082.method8360(var1);
		if (var3 != null) {
			var3.method8051();
			var3.method8040();
			++this.field3079;
		}

	}

	public void method5463(class444 var1, long var2) {
		if (this.field3079 == 0) {
			class444 var4 = this.field3083.method6853();
			var4.method8051();
			var4.method8040();
			if (var4 == this.field3080) {
				var4 = this.field3083.method6853();
				var4.method8051();
				var4.method8040();
			}
		} else {
			--this.field3079;
		}

		this.field3082.method8361(var1, var2);
		this.field3083.method6864(var1);
	}

	public void method5467() {
		this.field3083.method6847();
		this.field3082.method8362();
		this.field3080 = new class444();
		this.field3079 = this.field3081;
	}
}
