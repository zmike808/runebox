import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;

public class class345 {
	public static byte field4256;
	public static class343 field973;
	public static class362 field4246;
	public static class414 field4241;
	public static class465 field4242;
	public static class465 field4244;
	public static class465 field4247;
	public static class465 field4249;
	public static class489 field4252;
	public static class489 field4253;
	public static int field4243;
	public static int field4245;
	public static int field4250;
	public static int field4251;
	public static int field4254;
	public static int field4257;
	public static int field4261;
	public static int field4262;
	public static long field4260;
	static boolean field4248;
	static class342[] field4240;
	static class489 field929;
	static int field4239;
	static int field4258;
	static CRC32 field4255;

	static {
		field4251 = 0;
		field4242 = new class465(4096);
		field4243 = 0;
		field4244 = new class465(32);
		field4245 = 0;
		field4246 = new class362();
		field4247 = new class465(4096);
		field4257 = 0;
		field4249 = new class465(4096);
		field4250 = 0;
		field4252 = new class489(8);
		field4254 = 0;
		field4255 = new CRC32();
		field4240 = new class342[256];
		field4239 = -1;
		field4258 = 255;
		field4256 = 0;
		field4262 = 0;
		field4261 = 0;
	}

	public static int method3632(boolean var0, boolean var1) {
		int var3 = 0;
		if (var0) {
			var3 += field4243 + field4245;
		}

		if (var1) {
			var3 += field4257 + field4250;
		}

		return var3;
	}

	public static void method5549() {
		if (field4241 != null) {
			field4241.method7711();
		}

	}

	protected static int method6548() {
		int var1 = 0;
		if (class35.field3353 == null || !class35.field3353.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						class35.field3353 = var3;
						class35.field230 = -1L;
						class35.field229 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (null != class35.field3353) {
			long var11 = class294.method2575();
			long var4 = class35.field3353.getCollectionTime();
			if (class35.field229 != -1L) {
				long var6 = var4 - class35.field229;
				long var8 = var11 - class35.field230;
				if (var8 != 0L) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			class35.field229 = var4;
			class35.field230 = var11;
		}

		return var1;
	}
}
