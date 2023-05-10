public class class264 {
	static final class264 field3030;
	static final class264 field3031;
	final int field3032;

	static {
		field3030 = new class264(0);
		field3031 = new class264(1);
	}

	class264(int var1) {
		this.field3032 = var1;
	}

	static boolean method5279(class488 var0, int var1) {
		int var3 = var0.method8607(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var0.method8607(1) != 0) {
				method5279(var0, var1);
			}

			var4 = var0.method8607(13);
			var5 = var0.method8607(13);
			boolean var12 = var0.method8607(1) == 1;
			if (var12) {
				class103.field1343[++class103.field1342 - 1] = var1;
			}

			if (null != Client.field611[var1]) {
				throw new RuntimeException();
			} else {
				class88 var13 = Client.field611[var1] = new class88();
				var13.field1107 = var1;
				if (class103.field1334[var1] != null) {
					var13.method2232(class103.field1334[var1]);
				}

				var13.field1168 = class103.field1339[var1];
				var13.field1160 = class103.field1347[var1];
				var8 = class103.field1331[var1];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var13.field1199[0] = class103.field1333[var1];
				var13.field1106 = (byte)var9;
				var13.method2245(var4 + (var10 << 13) - Client.field2850, var5 + (var11 << 13) - Client.field2841);
				var13.field1111 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method8607(2);
			var5 = class103.field1331[var1];
			class103.field1331[var1] = ((var4 + (var5 >> 28) & 3) << 28) + (var5 & 268435455);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var0.method8607(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = class103.field1331[var1];
				var8 = var5 + (var7 >> 28) & 3;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				if (var6 == 0) {
					--var9;
					--var10;
				}

				if (var6 == 1) {
					--var10;
				}

				if (var6 == 2) {
					++var9;
					--var10;
				}

				if (var6 == 3) {
					--var9;
				}

				if (var6 == 4) {
					++var9;
				}

				if (var6 == 5) {
					--var9;
					++var10;
				}

				if (var6 == 6) {
					++var10;
				}

				if (var6 == 7) {
					++var9;
					++var10;
				}

				class103.field1331[var1] = (var9 << 14) + (var8 << 28) + var10;
				return false;
			} else {
				var4 = var0.method8607(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = class103.field1331[var1];
				var9 = var5 + (var8 >> 28) & 3;
				var10 = (var8 >> 14) + var6 & 255;
				var11 = var7 + var8 & 255;
				class103.field1331[var1] = var11 + (var10 << 14) + (var9 << 28);
				return false;
			}
		}
	}
}
