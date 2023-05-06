public class class136 implements class357 {
	public static final class136 field1616;
	public static final class136 field1618;
	public static final class136 field1619;
	public static final class136 field1620;
	public static final class136 field1622;
	final int field1617;
	public final int field1621;

	static {
		field1619 = new class136(2, 0);
		field1616 = new class136(1, 1);
		field1622 = new class136(0, 2);
		field1618 = new class136(3, 3);
		field1620 = new class136(4, 4);
	}

	class136(int var1, int var2) {
		this.field1621 = var1;
		this.field1617 = var2;
	}

	public int method6674() {
		return this.field1617;
	}

	static void method3120(class317[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class317 var7 = var0[var6];
			if (null != var7 && var7.field3589 == var1) {
				class159.method3299(var7, var2, var3, var4);
				class193.method3701(var7, var2, var3);
				if (var7.field3591 > var7.field3593 - var7.field3572) {
					var7.field3591 = var7.field3593 - var7.field3572;
				}

				if (var7.field3591 < 0) {
					var7.field3591 = 0;
				}

				if (var7.field3592 > var7.field3594 - var7.field3586) {
					var7.field3592 = var7.field3594 - var7.field3586;
				}

				if (var7.field3592 < 0) {
					var7.field3592 = 0;
				}

				if (0 == var7.field3598) {
					class242.method4836(var0, var7, var4);
				}
			}
		}

	}
}
