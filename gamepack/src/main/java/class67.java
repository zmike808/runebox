import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class class67 {
	public static class65 field804;
	static boolean field850;
	static boolean field854;
	static class151 field1598;
	static class272 field4480;
	static class317 field329;
	static class317 field6;
	static class359 field1736;
	static class404 field1426;
	static class508 field2100;
	static class60[] field847;
	static int field1015;
	static int field836;
	static int field846;
	static int field853;
	static int[] field841;
	static int[] field843;
	static int[] field845;
	static int[][] field839;
	static String[] field842;
	static String[] field851;
	static ArrayList field838;
	static Calendar field848;
	static Iterator field7;
	static List field36;
	static final double field852;
	static final String[] field849;

	static {
		field841 = new int[5];
		field839 = new int[5][5000];
		field843 = new int[1000];
		field842 = new String[1000];
		field846 = 0;
		field847 = new class60[50];
		field848 = Calendar.getInstance();
		field849 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field850 = false;
		field854 = false;
		field838 = new ArrayList();
		field853 = 0;
		field852 = Math.log(2.0D);
	}

	public static void method2351(class84 var0) {
		class339.method6370(var0, 500000, 475000);
	}

	static final void method64(class317 var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3646 == null) {
			if (null == var2) {
				return;
			}

			var0.field3646 = new byte[11][];
			var0.field3647 = new byte[11][];
			var0.field3628 = new int[11];
			var0.field3671 = new int[11];
		}

		var0.field3646[var1] = var2;
		if (null != var2) {
			var0.field3582 = true;
		} else {
			var0.field3582 = false;

			for (int var5 = 0; var5 < var0.field3646.length; ++var5) {
				if (var0.field3646[var5] != null) {
					var0.field3582 = true;
					break;
				}
			}
		}

		var0.field3647[var1] = var3;
	}

	static final void method1982(class317 var0, int var1, int var2, int var3) {
		if (var0.field3628 == null) {
			throw new RuntimeException();
		} else {
			var0.field3628[var1] = var2;
			var0.field3671[var1] = var3;
		}
	}

	static final void method6694(class317 var0, int var1) {
		if (null == var0.field3646) {
			throw new RuntimeException();
		} else {
			if (null == var0.field3644) {
				var0.field3644 = new int[var0.field3646.length];
			}

			var0.field3644[var1] = Integer.MAX_VALUE;
		}
	}

	static int method7734(class317 var0) {
		if (var0.field3598 != 11) {
			--field1015;
			field843[++field836 - 1] = -1;
			return 1;
		} else {
			String var2 = field842[--field1015];
			field843[++field836 - 1] = var0.method6138(var2);
			return 1;
		}
	}

	static int method23(class317 var0) {
		if (var0.field3598 != 11) {
			field842[field1015 - 1] = "";
			return 1;
		} else {
			String var2 = field842[--field1015];
			field842[++field1015 - 1] = var0.method6144(var2);
			return 1;
		}
	}

	static int method507(int var0, class75 var1, boolean var2) {
		class317 var4 = class166.method3349(field843[--field836]);
		if (var0 == 2800) {
			field843[++field836 - 1] = class318.method3742(class26.method353(var4));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
				if (null == var4.field3650) {
					field842[++field1015 - 1] = "";
				} else {
					field842[++field1015 - 1] = var4.field3650;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field843[--field836];
			--var5;
			if (var4.field3648 != null && var5 < var4.field3648.length && null != var4.field3648[var5]) {
				field842[++field1015 - 1] = var4.field3648[var5];
			} else {
				field842[++field1015 - 1] = "";
			}

			return 1;
		}
	}

	static int method3993(int var0, class75 var1, boolean var2) {
		return 2;
	}

	static int method1234(int var0, class75 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field761 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	static int method879(int var0) {
		return (int)((Math.log((double)var0) / field852 - 7.0D) * 256.0D);
	}

	static int method5486(int var0, class75 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = field843[--field836];
			class191 var7 = class191.method6482(var6);
			field842[++field1015 - 1] = null != var7 ? var7.field2013 : "";
			return 1;
		} else {
			class191 var4;
			if (var0 == 6764) {
				field836 -= 2;
				var4 = class191.method6482(field843[field836]);
				int var5 = field843[1 + field836];
				field843[++field836 - 1] = var4.method3648(var5);
				field843[++field836 - 1] = var4.method3653(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = class191.method6482(field843[--field836]);
				field843[++field836 - 1] = var4 != null ? var4.field2046 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	static int method6442(int var0, class75 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = field843[--field836];
			class201 var5 = class145.method3177(var4);
			field842[++field1015 - 1] = null != var5 ? var5.field2184 : "";
			return 1;
		} else {
			return 2;
		}
	}

	static int method880(int var0, class75 var1, boolean var2) {
		return 2;
	}

	static int method216(int var0, class75 var1, boolean var2) {
		return 2;
	}

	static int method3036(int var0, class75 var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = field843[--field836] == 1;
			class63.method1228(var4);
			return 1;
		} else {
			return 2;
		}
	}

	static int method1834(int var0, class75 var1, boolean var2) {
		return 2;
	}

	static void method164(int var0) {
		if (var0 != -1) {
			if (class45.method882(var0)) {
				class317[] var2 = Client.field2057[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					class317 var4 = var2[var3];
					if (null != var4.field3668) {
						class84 var5 = new class84();
						var5.field1048 = var4;
						var5.field1052 = var4.field3668;
						class339.method6370(var5, 5000000, 0);
					}
				}

			}
		}
	}

	static Object method2197(int var0) {
		return class359.method6690((class479)class199.method3788(class479.method8507(), var0));
	}
}
