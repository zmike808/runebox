import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class class322 {
	static Calendar field3735;
	static final String[] field3734;
	static final String[][] field3736;

	static {
		field3736 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		field3734 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar.getInstance();
		field3735 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public static String method3131(long var0) {
		field3735.setTime(new Date(var0));
		int var2 = field3735.get(7);
		int var3 = field3735.get(5);
		int var4 = field3735.get(2);
		int var5 = field3735.get(1);
		int var6 = field3735.get(11);
		int var7 = field3735.get(12);
		int var8 = field3735.get(13);
		return field3734[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field3736[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}
}
