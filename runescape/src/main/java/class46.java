public class class46 {
	class344 field334;
	class344 field339;
	class465 field335;
	class465 field337;

	public class46(class344 var1, class344 var2) {
		this.field335 = new class465(256);
		this.field337 = new class465(256);
		this.field339 = var1;
		this.field334 = var2;
	}

	class41 method884(int var1, int var2, int[] var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var6 = (long)var5;
		class41 var8 = (class41)this.field337.method8381(var6);
		if (var8 != null) {
			return var8;
		} else if (null != var3 && var3[0] <= 0) {
			return null;
		} else {
			class40 var9 = class40.method774(this.field339, var1, var2);
			if (var9 == null) {
				return null;
			} else {
				var8 = var9.method775();
				this.field337.method8382(var8, var6);
				if (var3 != null) {
					var3[0] -= var8.field280.length;
				}

				return var8;
			}
		}
	}

	class41 method885(int var1, int var2, int[] var3, byte var4) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var6 = (long)var5 ^ 4294967296L;
		class41 var8 = (class41)this.field337.method8381(var6);
		if (null != var8) {
			if (var4 <= -1) {
				throw new IllegalStateException();
			} else {
				return var8;
			}
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			class53 var9 = (class53)this.field335.method8381(var6);
			if (null == var9) {
				if (var4 <= -1) {
					throw new IllegalStateException();
				}

				var9 = class53.method1090(this.field334, var1, var2);
				if (var9 == null) {
					if (var4 <= -1) {
						throw new IllegalStateException();
					}

					return null;
				}

				this.field335.method8382(var9, var6);
			}

			var8 = var9.method1091(var3);
			if (var8 == null) {
				if (var4 <= -1) {
					throw new IllegalStateException();
				} else {
					return null;
				}
			} else {
				var9.method8051();
				this.field337.method8382(var8, var6);
				return var8;
			}
		}
	}

	public class41 method886(int var1, int[] var2) {
		if (this.field339.method6459() == 1) {
			return this.method884(0, var1, var2);
		} else if (this.field339.method6458(var1) == 1) {
			return this.method884(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public class41 method887(int var1, int[] var2) {
		if (this.field334.method6459() == 1) {
			return this.method885(0, var1, var2, (byte)7);
		} else if (this.field334.method6458(var1) == 1) {
			return this.method885(var1, 0, var2, (byte)66);
		} else {
			throw new RuntimeException();
		}
	}
}
