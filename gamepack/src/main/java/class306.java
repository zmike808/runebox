public class class306 extends class444 {
	public final int field3472;
	public final int field3477;
	public final int[] field3474;
	public final int[] field3475;

	class306(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field3477 = var1;
		this.field3472 = var2;
		this.field3474 = var3;
		this.field3475 = var4;
	}

	public boolean method5755(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field3475.length) {
			int var4 = this.field3475[var2];
			if (var1 >= var4 && var1 <= var4 + this.field3474[var2]) {
				return true;
			}
		}

		return false;
	}

	public static int method5756(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}
}
