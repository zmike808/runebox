import java.io.File;
import java.io.IOException;

public class class219 {
	public static class237 field2515;
	public static int[] field2512;
	public static int[] field2516;
	public static int[] field2517;
	static class221 field2520;
	static int[] field2514;
	static int[] field2518;
	static final class221 field2513;
	static final class221 field2519;

	static {
		field2517 = new int[65536];
		field2518 = new int[512];
		field2514 = new int[2048];
		field2512 = new int[2048];
		field2516 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2518[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2514[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2512[var0] = (int)(65536.0D * Math.sin(0.0030679615D * (double)var0));
			field2516[var0] = (int)(65536.0D * Math.cos(0.0030679615D * (double)var0));
		}

		field2515 = new class237();
		field2519 = new class236(field2515);
		field2513 = new class238(field2515);
		field2520 = field2519;
	}

	public static void method5907(boolean var0) {
		if (var0 && null != class238.field5063) {
			field2520 = field2513;
		} else {
			field2520 = field2519;
		}

	}

	public static void method286(double var0) {
		class8.method65(var0, 0, 512);
	}

	static int method2794(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16);
	}

	static int method3433() {
		return field2515.field2796;
	}

	static int method165() {
		return field2515.field2794;
	}

	static int method5283() {
		return field2515.field2801;
	}

	static int method3159() {
		return field2515.field2803;
	}

	public static int method2841() {
		return field2515.field2791;
	}

	static int method47() {
		return field2515.field2798;
	}

	public static void method9(int[] var0, int var1, int var2, float[] var3) {
		if (null == var3 && field2513 == field2520) {
			field2520 = field2519;
		}

		field2520.method4323(var0, var1, var2, var3);
	}

	public static void method272() {
		int var1 = class499.field5064;
		int var2 = class499.field5065;
		int var3 = class499.field5068;
		int var4 = class499.field5066;
		field2515.field2798 = var3 - var1;
		field2515.field2797 = var4 - var2;
		method2165();
		if (field2515.field2793.length < field2515.field2797) {
			field2515.field2793 = new int[class296.method1988(field2515.field2797)];
		}

		int var5 = var1 + class238.field5061 * var2;

		for (int var6 = 0; var6 < field2515.field2797; ++var6) {
			field2515.field2793[var6] = var5;
			var5 += class238.field5061;
		}

	}

	public static void method2165() {
		field2515.method4769();
	}

	public static void method3523(int var0, int var1, int var2) {
		field2515.method4774(var0, var1, var2);
	}

	static void method4820(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2520.method4326(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	public static void method3178(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2520.method4327(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	public static class471 method4296(String var0, String var1, boolean var2) {
		File var4 = new File(Client.field3832, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				class471 var11 = new class471(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (33 == Client.field1838) {
			var5 = "_rc";
		} else if (34 == Client.field1838) {
			var5 = "_wip";
		}

		File var6 = new File(Client.field2000, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		class471 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new class471(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new class471(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	static void method4245(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2520.method4325(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static int method4297(int var0, class75 var1, boolean var2) {
		class317 var4 = var2 ? class67.field329 : class67.field6;
		if (var0 == 1800) {
			class67.field843[++class67.field836 - 1] = class318.method3742(class26.method353(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (null == var4.field3650) {
					class67.field842[++class67.field1015 - 1] = "";
				} else {
					class67.field842[++class67.field1015 - 1] = var4.field3650;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = class67.field843[--class67.field836];
			--var5;
			if (null != var4.field3648 && var5 < var4.field3648.length && var4.field3648[var5] != null) {
				class67.field842[++class67.field1015 - 1] = var4.field3648[var5];
			} else {
				class67.field842[++class67.field1015 - 1] = "";
			}

			return 1;
		}
	}
}
