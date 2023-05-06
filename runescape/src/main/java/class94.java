import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class94 {
	boolean field1248;
	boolean field1250;
	boolean field1251;
	boolean field1253;
	double field1254;
	int field1247;
	int field1252;
	int field1256;
	int field1258;
	int field1259;
	int field1261;
	String field1260;
	final Map field1262;

	class94() {
		this.field1251 = false;
		this.field1253 = false;
		this.field1254 = 0.8D;
		this.field1247 = 127;
		this.field1252 = 127;
		this.field1258 = 127;
		this.field1256 = -1;
		this.field1260 = null;
		this.field1259 = 1;
		this.field1262 = new LinkedHashMap();
		this.method2389(true);
	}

	class94(class489 var1) {
		this.field1251 = false;
		this.field1253 = false;
		this.field1254 = 0.8D;
		this.field1247 = 127;
		this.field1252 = 127;
		this.field1258 = 127;
		this.field1256 = -1;
		this.field1260 = null;
		this.field1259 = 1;
		this.field1262 = new LinkedHashMap();
		if (var1 != null && var1.field4991 != null) {
			int var2 = var1.method8658();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.method8658() == 1) {
					this.field1250 = true;
				}

				if (var2 > 1) {
					this.field1248 = var1.method8658() == 1;
				}

				if (var2 > 3) {
					this.field1259 = var1.method8658();
				}

				if (var2 > 2) {
					int var3 = var1.method8658();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method8664();
						int var6 = var1.method8664();
						this.field1262.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field1260 = var1.method8715();
				}

				if (var2 > 5) {
					this.field1251 = var1.method8706();
				}

				if (var2 > 6) {
					this.field1254 = (double)var1.method8658() / 100.0D;
					this.field1247 = var1.method8658();
					this.field1252 = var1.method8658();
					this.field1258 = var1.method8658();
				}

				if (var2 > 7) {
					this.field1256 = var1.method8658();
				}

				if (var2 > 8) {
					this.field1253 = var1.method8658() == 1;
				}

				if (var2 > 9) {
					this.field1261 = var1.method8664();
				}
			} else {
				this.method2389(true);
			}
		} else {
			this.method2389(true);
		}

	}

	void method2389(boolean var1) {
	}

	class489 method2390() {
		class489 var2 = new class489(417, true);
		var2.method8695(10);
		var2.method8695(this.field1250 ? 1 : 0);
		var2.method8695(this.field1248 ? 1 : 0);
		var2.method8695(this.field1259);
		var2.method8695(this.field1262.size());
		Iterator var3 = this.field1262.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method8644((Integer)var4.getKey());
			var2.method8644((Integer)var4.getValue());
		}

		var2.method8648(null != this.field1260 ? this.field1260 : "");
		var2.method8647(this.field1251);
		var2.method8695((int)(this.field1254 * 100.0D));
		var2.method8695(this.field1247);
		var2.method8695(this.field1252);
		var2.method8695(this.field1258);
		var2.method8695(this.field1256);
		var2.method8695(this.field1253 ? 1 : 0);
		var2.method8644(this.field1261);
		return var2;
	}

	void method2392(boolean var1) {
		this.field1250 = var1;
		method2624();
	}

	boolean method2457() {
		return this.field1250;
	}

	void method2393(boolean var1) {
		this.field1251 = var1;
		method2624();
	}

	boolean method2394() {
		return this.field1251;
	}

	void method2475(boolean var1) {
		this.field1248 = var1;
		method2624();
	}

	boolean method2478() {
		return this.field1248;
	}

	void method2427(boolean var1) {
		this.field1253 = var1;
		method2624();
	}

	void method2387() {
		this.method2427(!this.field1253);
	}

	boolean method2399() {
		return this.field1253;
	}

	void method2484(int var1) {
		this.field1261 = var1;
		method2624();
	}

	int method2411() {
		return this.field1261;
	}

	void method2402(double var1) {
		this.field1254 = var1;
		method2624();
	}

	double method2403() {
		return this.field1254;
	}

	void method2404(int var1) {
		this.field1247 = var1;
		method2624();
	}

	int method2405() {
		return this.field1247;
	}

	void method2406(int var1) {
		this.field1252 = var1;
		method2624();
	}

	int method2407() {
		return this.field1252;
	}

	void method2408(int var1) {
		this.field1258 = var1;
		method2624();
	}

	int method2409() {
		return this.field1258;
	}

	void method2410(String var1) {
		this.field1260 = var1;
		method2624();
	}

	String method2417() {
		return this.field1260;
	}

	void method2412(int var1) {
		this.field1256 = var1;
		method2624();
	}

	int method2413() {
		return this.field1256;
	}

	void method2414(int var1) {
		this.field1259 = var1;
		method2624();
	}

	int method2415() {
		return this.field1259;
	}

	void method2432(String var1, int var2) {
		int var4 = this.method2431(var1);
		if (this.field1262.size() >= 10 && !this.field1262.containsKey(var4)) {
			Iterator var5 = this.field1262.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field1262.put(var4, var2);
		method2624();
	}

	boolean method2400(String var1) {
		int var3 = this.method2431(var1);
		return this.field1262.containsKey(var3);
	}

	int method2418(String var1) {
		int var3 = this.method2431(var1);
		return !this.field1262.containsKey(var3) ? 0 : (Integer)this.field1262.get(var3);
	}

	int method2431(String var1) {
		return class372.method2344(var1.toLowerCase());
	}

	static void method2624() {
		class471 var1 = null;

		try {
			var1 = class219.method4296("", Client.field491.field3813, true);
			class489 var2 = Client.field112.method2390();
			var1.method8433(var2.field4991, 0, var2.field4989);
		} catch (Exception var4) {
		}

		try {
			if (null != var1) {
				var1.method8421(true);
			}
		} catch (Exception var3) {
		}

	}

	static final void method2445(class488 var0, int var1, class88 var2, int var3) {
		byte var5 = class211.field2391.field2392;
		int var6;
		if (0 != (var3 & 2)) {
			var6 = var0.method8691();
			byte[] var7 = new byte[var6];
			class489 var8 = new class489(var7);
			var0.method8676(var7, 0, var6);
			class103.field1334[var1] = var8;
			var2.method2232(var8);
		}

		int var14;
		if (0 != (var3 & 16)) {
			var6 = var0.method8700();
			if (var6 == 65535) {
				var6 = -1;
			}

			var14 = var0.method8692();
			class215.method4243(var2, var6, var14);
		}

		if (0 != (var3 & 4)) {
			var2.field1160 = var0.method8701();
			var2.field1160 += var0.method8691() << 16;
			var6 = 16777215;
			if (var2.field1160 == var6) {
				var2.field1160 = -1;
			}
		}

		if ((var3 & 128) != 0) {
			var2.field1149 = var0.method8669();
			if (var2.field1149.charAt(0) == '~') {
				var2.field1149 = var2.field1149.substring(1);
				class106.method2852(2, var2.field1089.method9256(), var2.field1149);
			} else if (var2 == Client.field3454) {
				class106.method2852(2, var2.field1089.method9256(), var2.field1149);
			}

			var2.field1177 = false;
			var2.field1162 = 0;
			var2.field1207 = 0;
			var2.field1161 = 150;
		}

		int var9;
		int var10;
		int var13;
		int var15;
		if ((var3 & 64) != 0) {
			var6 = var0.method8658();
			int var11;
			int var12;
			if (var6 > 0) {
				for (var14 = 0; var14 < var6; ++var14) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var15 = var0.method8827();
					if (var15 == 32767) {
						var15 = var0.method8827();
						var10 = var0.method8827();
						var9 = var0.method8827();
						var11 = var0.method8827();
					} else if (var15 != 32766) {
						var10 = var0.method8827();
					} else {
						var15 = -1;
					}

					var12 = var0.method8827();
					var2.method2313(var15, var10, var9, var11, Client.field602, var12);
				}
			}

			var14 = var0.method8691();
			if (var14 > 0) {
				for (var15 = 0; var15 < var14; ++var15) {
					var9 = var0.method8827();
					var10 = var0.method8827();
					if (var10 != 32767) {
						var11 = var0.method8827();
						var12 = var0.method8641();
						var13 = var10 > 0 ? var0.method8692() : var12;
						var2.method2322(var9, Client.field602, var10, var11, var12, var13);
					} else {
						var2.method2326(var9);
					}
				}
			}
		}

		if ((var3 & 1) != 0) {
			var2.field1173 = var0.method8660();
			if (0 == var2.field1206) {
				var2.field1168 = var2.field1173;
				var2.method2314();
			}
		}

		if (0 != (var3 & 32)) {
			var6 = var0.method8700();
			class339 var16 = (class339)class199.method3788(class339.method6352(), var0.method8658());
			boolean var20 = var0.method8692() == 1;
			var9 = var0.method8691();
			var10 = var0.field4989;
			if (var2.field1089 != null && null != var2.field1097) {
				boolean var22 = false;
				if (var16.field4170 && class67.field804.method1781(var2.field1089)) {
					var22 = true;
				}

				if (!var22 && Client.field609 == 0 && !var2.field1105) {
					class103.field1344.field4989 = 0;
					var0.method8676(class103.field1344.field4991, 0, var9);
					class103.field1344.field4989 = 0;
					String var23 = class383.method7246(class372.method2897(class235.method4753(class103.field1344)));
					var2.field1149 = var23.trim();
					var2.field1162 = var6 >> 8;
					var2.field1207 = var6 & 255;
					var2.field1161 = 150;
					var2.field1177 = var20;
					var2.field1145 = Client.field3454 != var2 && var16.field4170 && Client.field719 != "" && var23.toLowerCase().indexOf(Client.field719) == -1;
					if (var16.field4186) {
						var13 = var20 ? 91 : 1;
					} else {
						var13 = var20 ? 90 : 2;
					}

					if (-1 != var16.field4185) {
						class106.method2852(var13, class97.method6375(var16.field4185) + var2.field1089.method9256(), var23);
					} else {
						class106.method2852(var13, var2.field1089.method9256(), var23);
					}
				}
			}

			var0.field4989 = var10 + var9;
		}

		if ((var3 & 4096) != 0) {
			var6 = var0.method8660();
			var14 = var0.method8713();
			var2.method2319(0, var6, var14 >> 16, var14 & 65535);
		}

		if ((var3 & 1024) != 0) {
			var2.field1188 = var0.method8659();
			var2.field1190 = var0.method8694();
			var2.field1189 = var0.method8834();
			var2.field1208 = var0.method8834();
			var2.field1192 = var0.method8701() + Client.field602;
			var2.field1193 = var0.method8660() + Client.field602;
			var2.field1194 = var0.method8701();
			if (var2.field1111) {
				var2.field1188 += var2.field1112;
				var2.field1190 += var2.field1113;
				var2.field1189 += var2.field1112;
				var2.field1208 += var2.field1113;
				var2.field1206 = 0;
			} else {
				var2.field1188 += var2.field1174[0];
				var2.field1190 += var2.field1176[0];
				var2.field1189 += var2.field1174[0];
				var2.field1208 += var2.field1176[0];
				var2.field1206 = 1;
			}

			var2.field1211 = 0;
		}

		if (0 != (var3 & 512)) {
			class211[] var17 = class103.field1333;
			class211[] var21 = new class211[]{class211.field2390, class211.field2391, class211.field2389, class211.field2388};
			var17[var1] = (class211)class199.method3788(var21, var0.method8788());
		}

		if (0 != (var3 & 2048)) {
			var5 = var0.method8659();
		}

		if ((var3 & 8192) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var2.field1103[var6] = var0.method8669();
			}
		}

		if ((var3 & 32768) != 0) {
			var2.field1169 = Client.field602 + var0.method8701();
			var2.field1157 = Client.field602 + var0.method8660();
			var2.field1181 = var0.method8659();
			var2.field1200 = var0.method8659();
			var2.field1201 = var0.method8788();
			var2.field1209 = (byte)var0.method8692();
		}

		if ((var3 & 65536) != 0) {
			var6 = var0.method8641();

			for (var14 = 0; var14 < var6; ++var14) {
				var15 = var0.method8692();
				var9 = var0.method8701();
				var10 = var0.method8664();
				var2.method2319(var15, var9, var10 >> 16, var10 & 65535);
			}
		}

		if (var2.field1111) {
			if (var5 == 127) {
				var2.method2245(var2.field1112, var2.field1113);
			} else {
				class211 var18;
				if (var5 != class211.field2391.field2392) {
					class211[] var19 = new class211[]{class211.field2390, class211.field2391, class211.field2389, class211.field2388};
					var18 = (class211)class199.method3788(var19, var5);
				} else {
					var18 = class103.field1333[var1];
				}

				var2.method2252(var2.field1112, var2.field1113, var18);
			}
		}

	}
}
