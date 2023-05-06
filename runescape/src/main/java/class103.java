import java.net.URL;

public class class103 {
	static byte[] field1330;
	static class211[] field1333;
	static class489 field1344;
	static class489[] field1334;
	static int field1335;
	static int field1342;
	static int field1346;
	static int[] field1331;
	static int[] field1338;
	static int[] field1339;
	static int[] field1341;
	static int[] field1343;
	static int[] field1347;
	static String field4295;

	static {
		field1330 = new byte[2048];
		field1333 = new class211[2048];
		field1334 = new class489[2048];
		field1335 = 0;
		field1341 = new int[2048];
		field1346 = 0;
		field1338 = new int[2048];
		field1331 = new int[2048];
		field1339 = new int[2048];
		field1347 = new int[2048];
		field1342 = 0;
		field1343 = new int[2048];
		field1344 = new class489(new byte[5000]);
	}

	static boolean method2644() {
		try {
			if (class72.field60 == null) {
				class72.field60 = Client.field78.method2764(new URL(field4295));
			} else if (class72.field60.method2793()) {
				byte[] var1 = class72.field60.method2795();
				class489 var2 = new class489(var1);
				var2.method8664();
				class64.field792 = var2.method8660();
				class64.field179 = new class64[class64.field792];

				class64 var4;
				for (int var3 = 0; var3 < class64.field792; var4.field805 = var3++) {
					var4 = class64.field179[var3] = new class64();
					var4.field802 = var2.method8660();
					var4.field797 = var2.method8664();
					var4.field799 = var2.method8669();
					var4.field800 = var2.method8669();
					var4.field801 = var2.method8658();
					var4.field798 = var2.method8855();
				}

				class124.method2990(class64.field179, 0, class64.field179.length - 1, class64.field794, class64.field793);
				class72.field60 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			class72.field60 = null;
		}

		return false;
	}

	static final void method7828(class488 var0) {
		var0.method8636();
		int var2 = Client.field664;
		class88 var3 = Client.field3454 = Client.field611[var2] = new class88();
		var3.field1107 = var2;
		int var4 = var0.method8607(30);
		byte var5 = (byte)(var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field1174[0] = var6 - Client.field2850;
		var3.field1171 = (var3.field1174[0] << 7) + (var3.method2262() << 6);
		var3.field1176[0] = var7 - Client.field2841;
		var3.field1138 = (var3.field1176[0] << 7) + (var3.method2262() << 6);
		Client.field231 = var3.field1106 = var5;
		if (null != field1334[var2]) {
			var3.method2232(field1334[var2]);
		}

		field1335 = 0;
		field1341[++field1335 - 1] = var2;
		field1330[var2] = 0;
		field1346 = 0;

		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var8 != var2) {
				int var9 = var0.method8607(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				field1331[var8] = (var10 << 28) + (var11 << 14) + var12;
				field1339[var8] = 0;
				field1347[var8] = -1;
				field1338[++field1346 - 1] = var8;
				field1330[var8] = 0;
			}
		}

		var0.method8608();
	}

	static final void method4860(class488 var0) {
		for (int var2 = 0; var2 < field1342; ++var2) {
			int var3 = field1343[var2];
			class88 var4 = Client.field611[var3];
			int var5 = var0.method8658();
			if (0 != (var5 & 8)) {
				var5 += var0.method8658() << 8;
			}

			if (0 != (var5 & 16384)) {
				var5 += var0.method8658() << 16;
			}

			class94.method2445(var0, var3, var4, var5);
		}

	}
}
