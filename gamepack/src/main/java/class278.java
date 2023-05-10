public final class class278 {
	class277 field3076;
	class368 field3073;
	class464 field3075;
	int field3074;
	int field3077;

	public class278(int var1) {
		this(var1, var1);
	}

	public class278(int var1, int var2) {
		this.field3073 = new class368();
		this.field3077 = var1;
		this.field3074 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field3075 = new class464(var3);
	}

	public Object method5426(long var1) {
		class282 var3 = (class282)this.field3075.method8360(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method5481();
			if (var4 == null) {
				var3.method8051();
				var3.method8040();
				this.field3074 += var3.field3085;
				return null;
			} else {
				if (var3.method5479()) {
					class281 var5 = new class281(var4, var3.field3085);
					this.field3075.method8361(var5, var3.field4745);
					this.field3073.method6864(var5);
					var5.field4738 = 0L;
					var3.method8051();
					var3.method8040();
				} else {
					this.field3073.method6864(var3);
					var3.field4738 = 0L;
				}

				return var4;
			}
		}
	}

	void method5427(long var1) {
		class282 var3 = (class282)this.field3075.method8360(var1);
		this.method5452(var3);
	}

	void method5452(class282 var1) {
		if (var1 != null) {
			var1.method8051();
			var1.method8040();
			this.field3074 += var1.field3085;
		}

	}

	public void method5450(Object var1, long var2) {
		this.method5429(var1, var2, 1);
	}

	public void method5429(Object var1, long var2, int var4) {
		if (var4 > this.field3077) {
			throw new IllegalStateException();
		} else {
			this.method5427(var2);
			this.field3074 -= var4;

			while (this.field3074 < 0) {
				class282 var5 = (class282)this.field3073.method6853();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method5479()) {
				}

				this.method5452(var5);
				if (this.field3076 != null) {
					this.field3076.method5419(var5.method5481());
				}
			}

			class281 var6 = new class281(var1, var4);
			this.field3075.method8361(var6, var2);
			this.field3073.method6864(var6);
			var6.field4738 = 0L;
		}
	}

	public void method5430(int var1) {
		for (class282 var2 = (class282)this.field3073.method6851(); var2 != null; var2 = (class282)this.field3073.method6846()) {
			if (var2.method5479()) {
				if (var2.method5481() == null) {
					var2.method8051();
					var2.method8040();
					this.field3074 += var2.field3085;
				}
			} else if (++var2.field4738 > (long)var1) {
				class279 var3 = new class279(var2.method5481(), var2.field3085);
				this.field3075.method8361(var3, var2.field4745);
				class368.method6868(var3, var2);
				var2.method8051();
				var2.method8040();
			}
		}

	}

	public void method5437() {
		this.field3073.method6847();
		this.field3075.method8362();
		this.field3074 = this.field3077;
	}
}
