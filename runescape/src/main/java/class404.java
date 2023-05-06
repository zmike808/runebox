public class class404 extends class410 {
	int field4566;
	final class402 field4563;
	final class469 field4562;
	public byte field4568;
	public int field4567;
	public String field4564;
	public String field4565;

	public class404(class469 var1, class402 var2) {
		super(500);
		this.field4564 = null;
		this.field4565 = null;
		this.field4566 = 1;
		this.field4562 = var1;
		this.field4563 = var2;
	}

	class408 method7631() {
		return new class407();
	}

	class408[] method7628(int var1) {
		return new class407[var1];
	}

	final void method7510(String var1) {
		this.field4564 = class374.method2074(var1);
	}

	final void method7517(String var1) {
		this.field4565 = class374.method2074(var1);
	}

	public final void method7512(class489 var1, int var2) {
		this.method7517(var1.method8669());
		long var4 = var1.method8681();
		this.method7510(class245.method4852(var4));
		this.field4568 = var1.method8659();
		int var6;
		short var7;
		if (var2 == 1) {
			var6 = var1.method8658();
			var7 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var6 = var1.method8675();
			var7 = -1;
		}

		if (var6 != var7) {
			int var8 = var6;
			this.method7654();

			for (int var9 = 0; var9 < var8; ++var9) {
				class407 var10 = (class407)this.method7618(new class513(var1.method8669(), this.field4562));
				int var11 = var1.method8660();
				var10.method7703(var11, ++this.field4566 - 1);
				var10.field4599 = var1.method8659();
				var1.method8669();
				this.method7514(var10);
			}

		}
	}

	public final void method7516(class489 var1) {
		class513 var3 = new class513(var1.method8669(), this.field4562);
		int var4 = var1.method8660();
		byte var5 = var1.method8659();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		class407 var7;
		if (var6) {
			if (this.method7610() == 0) {
				return;
			}

			var7 = (class407)this.method7614(var3);
			if (var7 != null && var7.method7696() == var4) {
				this.method7624(var7);
			}
		} else {
			var1.method8669();
			var7 = (class407)this.method7614(var3);
			if (null == var7) {
				if (this.method7610() > super.field4589) {
					return;
				}

				var7 = (class407)this.method7618(var3);
			}

			var7.method7703(var4, ++this.field4566 - 1);
			var7.field4599 = var5;
			this.method7514(var7);
		}

	}

	public final void method7513() {
		for (int var2 = 0; var2 < this.method7610(); ++var2) {
			((class407)this.method7642(var2)).method7566();
		}

	}

	public final void method7515() {
		for (int var2 = 0; var2 < this.method7610(); ++var2) {
			((class407)this.method7642(var2)).method7556();
		}

	}

	final void method7514(class407 var1) {
		if (var1.method7576().equals(this.field4563.method7486())) {
			this.field4567 = var1.field4599;
		}

	}

	static final void method7507(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < Client.field781; ++var5) {
			if (Client.field709[var5] + Client.field640[var5] > var0 && Client.field709[var5] < var2 + var0 && Client.field712[var5] + Client.field710[var5] > var1 && Client.field710[var5] < var1 + var3) {
				Client.field707[var5] = true;
			}
		}

	}
}
