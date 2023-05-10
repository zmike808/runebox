public final class class379 extends class383 {
	public class379(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public class379(byte[] var1) {
		super(var1);
	}

	final void method7167(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class238.field5061;
		int var8 = class238.field5061 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class499.field5065) {
			var11 = class499.field5065 - var3;
			var5 -= var11;
			var3 = class499.field5065;
			var10 += var11 * var4;
			var7 += var11 * class238.field5061;
		}

		if (var3 + var5 > class499.field5066) {
			var5 -= var3 + var5 - class499.field5066;
		}

		if (var2 < class499.field5064) {
			var11 = class499.field5064 - var2;
			var4 -= var11;
			var2 = class499.field5064;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > class499.field5068) {
			var11 = var2 + var4 - class499.field5068;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method7170(class238.field5067, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	final void method7236(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class238.field5061;
		int var9 = class238.field5061 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class499.field5065) {
			var12 = class499.field5065 - var3;
			var5 -= var12;
			var3 = class499.field5065;
			var11 += var12 * var4;
			var8 += var12 * class238.field5061;
		}

		if (var3 + var5 > class499.field5066) {
			var5 -= var3 + var5 - class499.field5066;
		}

		if (var2 < class499.field5064) {
			var12 = class499.field5064 - var2;
			var4 -= var12;
			var2 = class499.field5064;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > class499.field5068) {
			var12 = var2 + var4 - class499.field5068;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method7172(class238.field5067, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
