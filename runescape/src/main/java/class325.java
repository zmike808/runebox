public class class325 implements class357 {
	public static final class325 field3744;
	static final class325 field3742;
	static final class325 field3743;
	static final class325 field3745;
	static final class325 field3746;
	final int field3747;

	static {
		field3743 = new class325(0);
		field3742 = new class325(1);
		field3745 = new class325(2);
		field3744 = new class325(3);
		field3746 = new class325(4);
	}

	class325(int var1) {
		this.field3747 = var1;
	}

	public int method6674() {
		return this.field3747;
	}

	static void method6322(int var0, int var1, int var2, int var3) {
		for (class66 var5 = (class66)class66.field828.method6716(); var5 != null; var5 = (class66)class66.field828.method6725()) {
			if (-1 != var5.field822 || null != var5.field827) {
				int var6 = 0;
				if (var1 > var5.field820) {
					var6 += var1 - var5.field820;
				} else if (var1 < var5.field818) {
					var6 += var5.field818 - var1;
				}

				if (var2 > var5.field821) {
					var6 += var2 - var5.field821;
				} else if (var2 < var5.field831) {
					var6 += var5.field831 - var2;
				}

				if (var6 - 64 <= var5.field816 && Client.field112.method2409() != 0 && var0 == var5.field817) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var5.field816 - var6) * Client.field112.method2409() / var5.field816;
					if (null == var5.field824) {
						if (var5.field822 >= 0) {
							class40 var8 = class40.method774(Client.field4688, var5.field822, 0);
							if (null != var8) {
								class41 var9 = var8.method775().method788(Client.field2981);
								class48 var10 = class48.method903(var9, 100, var7);
								var10.method906(-1);
								Client.field1574.method747(var10);
								var5.field824 = var10;
							}
						}
					} else {
						var5.field824.method980(var7);
					}

					if (var5.field829 == null) {
						if (null != var5.field827 && (var5.field823 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var5.field827.length);
							class40 var13 = class40.method774(Client.field4688, var5.field827[var12], 0);
							if (null != var13) {
								class41 var14 = var13.method775().method788(Client.field2981);
								class48 var11 = class48.method903(var14, 100, var7);
								var11.method906(0);
								Client.field1574.method747(var11);
								var5.field829 = var11;
								var5.field823 = var5.field825 + (int)(Math.random() * (double)(var5.field826 - var5.field825));
							}
						}
					} else {
						var5.field829.method980(var7);
						if (!var5.field829.method8046()) {
							var5.field829 = null;
						}
					}
				} else {
					if (null != var5.field824) {
						Client.field1574.method769(var5.field824);
						var5.field824 = null;
					}

					if (var5.field829 != null) {
						Client.field1574.method769(var5.field829);
						var5.field829 = null;
					}
				}
			}
		}

	}
}
