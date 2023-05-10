import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class class387 {
	static byte[][] field4467;
	static byte[][] field4474;
	static byte[][] field4475;
	static byte[][] field4476;
	static byte[][][] field1433;
	static int field4464;
	static int field4466;
	static int field4468;
	static int field4470;
	static int field4471;
	static int field4472;
	static int field4477;
	static int field4478;
	static int[] field1626;
	static int[] field1777;
	static ArrayList field4473;

	static {
		field4466 = 0;
		field4478 = 0;
		field4468 = 0;
		field4477 = 0;
		field4470 = 1000;
		field4471 = 250;
		field4472 = 100;
		field4464 = 50;
		field4474 = new byte[1000][];
		field4467 = new byte[250][];
		field4476 = new byte[100][];
		field4475 = new byte[50][];
		field4473 = new ArrayList();
		method5418();
		new HashMap();
	}

	public static void method3118(int[] var0, int[] var1) {
		if (null != var0 && var1 != null) {
			field1777 = var0;
			field1626 = new int[var0.length];
			field1433 = new byte[var0.length][][];

			for (int var3 = 0; var3 < field1777.length; ++var3) {
				field1433[var3] = new byte[var1[var3]][];
				field4473.add(var0[var3]);
			}

			Collections.sort(field4473);
		} else {
			field1777 = null;
			field1626 = null;
			field1433 = (byte[][][])null;
			method5418();
		}
	}

	static void method5418() {
		field4473.clear();
		field4473.add(100);
		field4473.add(5000);
		field4473.add(10000);
		field4473.add(30000);
	}

	public static synchronized byte[] method7337(int var0, boolean var1) {
		byte[] var5;
		if ((var0 == 100 || var0 < 100 && var1) && field4466 > 0) {
			var5 = field4474[--field4466];
			field4474[field4466] = null;
			return var5;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field4478 > 0) {
			var5 = field4467[--field4478];
			field4467[field4478] = null;
			return var5;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field4468 > 0) {
			var5 = field4476[--field4468];
			field4476[field4468] = null;
			return var5;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4477 > 0) {
			var5 = field4475[--field4477];
			field4475[field4477] = null;
			return var5;
		} else {
			int var3;
			if (field1433 != null) {
				for (var3 = 0; var3 < field1777.length; ++var3) {
					if ((var0 == field1777[var3] || var0 < field1777[var3] && var1) && field1626[var3] > 0) {
						byte[] var4 = field1433[var3][--field1626[var3]];
						field1433[var3][field1626[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && field1777 != null) {
				for (var3 = 0; var3 < field1777.length; ++var3) {
					if (var0 <= field1777[var3] && field1626[var3] < field1433[var3].length) {
						return new byte[field1777[var3]];
					}
				}
			}

			return new byte[var0];
		}
	}
}
