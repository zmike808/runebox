import java.io.IOException;

public class class384 {
	class380 field4458;
	int field4455;
	int field4456;

	class384(class380 var1, int var2, int var3) {
		this.field4455 = 0;
		this.field4456 = 0;
		this.field4458 = var1;
		this.field4455 = var2;
		this.field4456 = var3;
	}

	public String method7264() {
		if (this.method7255()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method7256());

			for (int var3 = this.field4455; var3 < this.field4456; ++var3) {
				class382 var4 = this.field4458.method7002(var3);
				var2.append(var4.field4429);
			}

			return var2.toString();
		}
	}

	boolean method7258(int var1) {
		return this.field4458.method7033() == 2 || this.field4458.method7033() == 1 && (!this.field4458.field4416 || this.field4456 - 1 != var1);
	}

	public boolean method7255() {
		return this.field4456 == this.field4455;
	}

	public int method7256() {
		return this.field4456 - this.field4455;
	}

	boolean method7263(class382 var1) {
		if (2 == this.field4458.field4420) {
			return true;
		} else if (this.field4458.field4420 == 0) {
			return false;
		} else {
			return this.field4458.method7032() != var1;
		}
	}

	int method7266() {
		if (this.method7255()) {
			return 0;
		} else {
			class382 var2 = this.field4458.method7002(this.field4456 - 1);
			if (var2.field4429 == '\n') {
				return 0;
			} else if (this.method7263(var2)) {
				return this.field4458.field4410.field4434[42];
			} else {
				int var3 = this.field4458.field4410.field4434[var2.field4429];
				if (var3 == 0) {
					return var2.field4429 == '\t' ? this.field4458.field4410.field4434[32] * 3 : this.field4458.field4410.field4434[32];
				} else {
					return var3;
				}
			}
		}
	}

	public class462 method7254() {
		if (this.method7255()) {
			return new class462(0, 0);
		} else {
			class382 var2 = this.field4458.method7002(this.field4456 - 1);
			return new class462(var2.field4428 + this.method7266(), var2.field4431);
		}
	}

	public class382 method7257(int var1) {
		return var1 >= 0 && var1 < this.method7256() ? this.field4458.method7002(this.field4455 + var1) : null;
	}

	static final int method7282(int var0, int var1) {
		int var3 = class78.method2342(var0 - 1, var1 - 1) + class78.method2342(var0 + 1, var1 - 1) + class78.method2342(var0 - 1, var1 + 1) + class78.method2342(var0 + 1, var1 + 1);
		int var4 = class78.method2342(var0 - 1, var1) + class78.method2342(var0 + 1, var1) + class78.method2342(var0, var1 - 1) + class78.method2342(var0, var1 + 1);
		int var5 = class78.method2342(var0, var1);
		return var4 / 8 + var3 / 16 + var5 / 4;
	}

	static void method7283(class489 var0) {
		if (Client.field536 != null) {
			var0.method8886(Client.field536, 0, Client.field536.length);
		} else {
			byte[] var3 = new byte[24];

			try {
				class170.field1835.method8437(0L);
				class170.field1835.method8441(var3);

				int var4;
				for (var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
				}

				if (var4 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var5 = 0; var5 < 24; ++var5) {
					var3[var5] = -1;
				}
			}

			var0.method8886(var3, 0, var3.length);
		}
	}
}
