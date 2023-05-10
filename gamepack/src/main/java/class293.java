import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class305
public final class class293 {
	static final HashMap field3359;

	static {
		field3359 = new HashMap();
		Calendar.getInstance(method5521("Europe/London"));
	}

	public static boolean method5522(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	static TimeZone method5521(String var0) {
		HashMap var2;
		synchronized(var2 = field3359){}
		TimeZone var3 = (TimeZone)field3359.get(var0);
		if (null == var3) {
			var3 = TimeZone.getTimeZone(var0);
			field3359.put(var0, var3);
		}

		return var3;
	}
}
