import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class212 {
	static int field4535;
	static int field95;
	static int[] field2396;
	static int[] field2398;
	static int[][] field2397;
	static int[][] field2402;

	static {
		field2402 = new int[128][128];
		field2397 = new int[128][128];
		field2398 = new int[4096];
		field2396 = new int[4096];
	}

	public static class134 method4147(class344 var0, class344 var1, int var2, boolean var3) {
		boolean var5 = true;
		byte[] var6 = var0.method6454(var2 >> 16 & 65535, var2 & 65535);
		if (null == var6) {
			var5 = false;
			return null;
		} else {
			int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
			byte[] var8;
			if (var3) {
				var8 = var1.method6454(0, var7);
			} else {
				var8 = var1.method6454(var7, 0);
			}

			if (null == var8) {
				var5 = false;
			}

			if (!var5) {
				return null;
			} else {
				if (null == class134.field4388) {
					class134.field1594 = Runtime.getRuntime().availableProcessors();
					class134.field4388 = new ThreadPoolExecutor(0, class134.field1594, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class134.field1594 * 100), new class131());
				}

				try {
					return new class134(var0, var1, var2, var3);
				} catch (Exception var10) {
					return null;
				}
			}
		}
	}
}
