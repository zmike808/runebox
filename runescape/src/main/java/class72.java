import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class class72 {
	public static boolean field1844;
	static boolean field2984;
	static boolean field63;
	static boolean field891;
	static boolean field903;
	static boolean field915;
	static boolean field919;
	static class110 field60;
	static class421 field104;
	static class421 field1296;
	static class502 field123;
	static class502 field4189;
	static class502 field71;
	static class502 field893;
	static class502[] field120;
	static class502[] field4534;
	static class502[] field803;
	static class502[] field88;
	static class503 field1498;
	static class503 field2125;
	static class503[] field4945;
	static class93 field1471;
	static int field1671;
	static int field2097;
	static int field896;
	static int field897;
	static int field898;
	static int field899;
	static int field907;
	static int field910;
	static int field917;
	static int field920;
	static int field921;
	static int field922;
	static int field923;
	static int field993;
	static String field1374;
	static String field890;
	static String field892;
	static String field902;
	static String field904;
	static String field905;
	static String field906;
	static String field909;
	static String field912;
	static String field918;
	static String field930;
	static String[] field911;
	static String[] field925;
	static String[] field926;
	static String[] field927;
	static long field895;
	static long field924;

	static {
		field907 = 0;
		field896 = 202 + field907;
		field897 = 10;
		field902 = "";
		field899 = -1;
		field917 = 1;
		field898 = 0;
		field904 = "";
		field905 = "";
		field906 = "";
		field890 = "";
		field930 = "";
		field909 = "";
		field910 = 0;
		field911 = new String[8];
		field912 = "";
		field891 = false;
		field903 = false;
		field915 = true;
		field923 = 0;
		field918 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field892 = "1234567890";
		field919 = false;
		field920 = -1;
		field921 = 0;
		field922 = 0;
		new DecimalFormat("##0.00");
		new class130();
		field895 = -1L;
		field924 = -1L;
		field925 = new String[]{"title.jpg"};
		field926 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field927 = new String[]{"logo_speedrunning"};
	}

	static int method1230(class344 var0) {
		int var2 = field926.length + field925.length;
		String[] var3 = field927;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var0.method6464(var5) != -1) {
				++var2;
			}
		}

		return var2;
	}

	static String method288() {
		return Client.field112.method2394() ? class372.method6329(field930) : field930;
	}

	static void method4835() {
		if (null == field930 || field930.length() <= 0) {
			if (Client.field112.method2417() != null) {
				field930 = Client.field112.method2417();
				Client.field540 = true;
			} else {
				Client.field540 = false;
			}

		}
	}

	static void method2300() {
		if (field63) {
			class7.field914 = null;
			class7.field3362 = null;
			field4534 = null;
			field1498 = null;
			field2125 = null;
			field123 = null;
			class7.field1704 = null;
			field893 = null;
			class7.field1767 = null;
			field4945 = null;
			field88 = null;
			field120 = null;
			field803 = null;
			class7.field3727 = null;
			field1471.method2386();
			class298.field3389 = 1;
			Client.field3388 = null;
			Client.field4411 = -1;
			Client.field1913 = -1;
			Client.field1324 = 0;
			Client.field1459 = false;
			Client.field1789 = 2;
			class178.method3487(true);
			field63 = false;
		}
	}

	static Date method2688() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	static boolean method2191(Date var0) {
		Calendar var2 = Calendar.getInstance();
		var2.set(1, var2.get(1) - 13);
		var2.set(5, var2.get(5) + 1);
		var2.set(11, 0);
		var2.set(12, 0);
		var2.set(13, 0);
		var2.set(14, 0);
		Date var3 = var2.getTime();
		return var0.before(var3);
	}

	static void method5270(String var0, String var1, String var2) {
		method3061(7);
		method4061(var0, var1, var2);
	}

	static void method46(boolean var0) {
		if (!Client.field466.method1410() && !Client.field466.method1236() && !Client.field466.method1235()) {
			field905 = class337.field4061;
			field906 = class337.field4062;
			field890 = class337.field4063;
			method3061(2);
			if (var0) {
				field909 = "";
			}

			method4835();
			if (Client.field540 && field930 != null && field930.length() > 0) {
				field923 = 1;
			} else {
				field923 = 0;
			}

		} else {
			method3061(10);
		}
	}

	static void method2044(boolean var0) {
		byte var2 = 0;
		if (!Client.method3115()) {
			var2 = 12;
		} else if (Client.field466.method1410() || Client.field466.method1236() || Client.field466.method1235()) {
			var2 = 10;
		}

		method3061(var2);
		if (var0) {
			field930 = "";
			field909 = "";
			Client.field2331 = 0;
			field1374 = "";
		}

		method4835();
		if (Client.field540 && null != field930 && field930.length() > 0) {
			field923 = 1;
		} else {
			field923 = 0;
		}

	}

	static void method4061(String var0, String var1, String var2) {
		field905 = var0;
		field906 = var1;
		field890 = var2;
	}

	static void method188(int var0) {
		method3061(14);
		field899 = var0;
	}

	static void method2046() {
		if (class103.method2644()) {
			field919 = true;
			field921 = 0;
			field922 = 0;
		}

	}

	static void method3147() {
		field919 = false;
		field1498.method9104(field907, 0);
		field2125.method9104(field907 + 382, 0);
		field123.method9072(field907 + 382 - field123.field5081 / 2, 18);
	}

	static void method2804() {
		method3061(24);
		method4061(class337.field4082, class337.field3960, class337.field4084);
	}

	static void method4360() {
		method3061(24);
		method4061(class337.field4085, class337.field4080, class337.field4142);
	}

	static void method3061(int var0) {
		if (field898 != var0) {
			field898 = var0;
		}
	}

	static int method6338() {
		return field898;
	}
}
