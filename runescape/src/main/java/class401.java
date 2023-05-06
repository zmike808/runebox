public class class401 extends class410 {
	final class469 field4550;

	public class401(class469 var1) {
		super(400);
		this.field4550 = var1;
	}

	class408 method7631() {
		return new class411();
	}

	class408[] method7628(int var1) {
		return new class411[var1];
	}

	public void method7472(class489 var1, int var2) {
		while (var1.field4989 < var2) {
			int var4 = var1.method8658();
			if (var4 == 4) {
				class513 var10 = new class513(var1.method8669(), this.field4550);
				if (!var10.method9258()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class67.field804.method1787(var10.method9256(), var11);
			} else {
				boolean var5 = 0 != (var4 & 1);
				class513 var6 = new class513(var1.method8669(), this.field4550);
				class513 var7 = new class513(var1.method8669(), this.field4550);
				var1.method8669();
				if (!var6.method9258()) {
					throw new IllegalStateException();
				}

				class411 var8 = (class411)this.method7614(var6);
				if (var5) {
					class411 var9 = (class411)this.method7614(var7);
					if (null != var9 && var9 != var8) {
						if (null != var8) {
							this.method7624(var9);
						} else {
							var8 = var9;
						}
					}
				}

				if (null != var8) {
					this.method7626(var8, var6, var7);
				} else if (this.method7610() < 400) {
					int var12 = this.method7610();
					var8 = (class411)this.method7644(var6, var7);
					var8.field4595 = var12;
				}
			}
		}

	}
}
