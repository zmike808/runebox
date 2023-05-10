import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class105 {
	public static class344 field3366;
	boolean field1371;
	boolean[] field1367;
	/** @deprecated */
	@Deprecated
	String[] field1368;
	Map field1369;
	long field1372;

	class105() {
		this.field1371 = false;
		int var1 = Client.field1064.method6458(19);
		this.field1369 = new HashMap();
		this.field1367 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			class184 var4 = (class184)class184.field1939.method5461((long)var2);
			class184 var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = field3366.method6468(19, var2);
				var4 = new class184();
				if (var5 != null) {
					var4.method3550(new class489(var5));
				}

				class184.field1939.method5463(var4, (long)var2);
				var3 = var4;
			}

			this.field1367[var2] = var3.field1940;
		}

		var2 = 0;
		if (Client.field1064.method6402(15)) {
			var2 = Client.field1064.method6458(15);
		}

		this.field1368 = new String[var2];
		this.method2669();
	}

	void method2684(int var1, int var2) {
		this.field1369.put(var1, var2);
		if (this.field1367[var1]) {
			this.field1371 = true;
		}

	}

	int method2660(int var1) {
		Object var3 = this.field1369.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	void method2662(int var1, String var2) {
		this.field1369.put(var1, var2);
	}

	String method2671(int var1) {
		Object var3 = this.field1369.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@Deprecated
	void method2664(int var1, String var2) {
		this.field1368[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	String method2665(int var1) {
		return this.field1368[var1];
	}

	void method2666() {
		int var2;
		for (var2 = 0; var2 < this.field1367.length; ++var2) {
			if (!this.field1367[var2]) {
				this.field1369.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field1368.length; ++var2) {
			this.field1368[var2] = null;
		}

	}

	class471 method2667(boolean var1) {
		return class219.method4296("2", Client.field491.field3813, var1);
	}

	void method2668() {
		class471 var2 = this.method2667(true);

		label59: {
			try {
				int var3 = 3;
				int var4 = 0;
				Iterator var5 = this.field1369.entrySet().iterator();

				while (var5.hasNext()) {
					Entry var6 = (Entry)var5.next();
					int var7 = (Integer)var6.getKey();
					if (this.field1367[var7]) {
						Object var8 = var6.getValue();
						var3 += 3;
						if (var8 instanceof Integer) {
							var3 += 4;
						} else if (var8 instanceof String) {
							var3 += class489.method2092((String)var8);
						}

						++var4;
					}
				}

				class489 var16 = new class489(var3);
				var16.method8695(2);
				var16.method8642(var4);
				Iterator var17 = this.field1369.entrySet().iterator();

				while (var17.hasNext()) {
					Entry var18 = (Entry)var17.next();
					int var19 = (Integer)var18.getKey();
					if (this.field1367[var19]) {
						var16.method8642(var19);
						Object var9 = var18.getValue();
						class479 var10 = class479.method8506(var9.getClass());
						var16.method8695(var10.field4951);
						class479.method8520(var9, var16);
					}
				}

				var2.method8433(var16.field4991, 0, var16.field4989);
			} catch (Exception var15) {
				try {
					var2.method8417();
				} catch (Exception var13) {
				}
				break label59;
			}

			try {
				var2.method8417();
			} catch (Exception var14) {
			}
		}

		this.field1371 = false;
		this.field1372 = class294.method2575();
	}

	void method2669() {
		class471 var2 = this.method2667(false);

		label108: {
			try {
				byte[] var3 = new byte[(int)var2.method8422()];

				int var5;
				for (int var4 = 0; var4 < var3.length; var4 += var5) {
					var5 = var2.method8423(var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}
				}

				class489 var20 = new class489(var3);
				if (var20.field4991.length - var20.field4989 < 1) {
					try {
						var2.method8417();
					} catch (Exception var16) {
					}

					return;
				}

				int var6 = var20.method8658();
				if (var6 < 0 || var6 > 2) {
					try {
						var2.method8417();
					} catch (Exception var18) {
					}

					return;
				}

				int var7;
				int var8;
				int var9;
				int var10;
				if (var6 >= 2) {
					var7 = var20.method8660();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var20.method8660();
						var10 = var20.method8658();
						class479 var11 = (class479)class199.method3788(class479.method8507(), var10);
						Object var12 = var11.method8510(var20);
						if (var9 >= 0 && var9 < this.field1367.length && this.field1367[var9]) {
							this.field1369.put(var9, var12);
						}
					}
				} else {
					var7 = var20.method8660();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var20.method8660();
						var10 = var20.method8664();
						if (var9 >= 0 && var9 < this.field1367.length && this.field1367[var9]) {
							this.field1369.put(var9, var10);
						}
					}

					var8 = var20.method8660();

					for (var9 = 0; var9 < var8; ++var9) {
						var20.method8660();
						var20.method8669();
					}
				}
			} catch (Exception var19) {
				try {
					var2.method8417();
				} catch (Exception var15) {
				}
				break label108;
			}

			try {
				var2.method8417();
			} catch (Exception var17) {
			}
		}

		this.field1371 = false;
	}

	void method2693() {
		if (this.field1371 && this.field1372 < class294.method2575() - 60000L) {
			this.method2668();
		}

	}

	boolean method2695() {
		return this.field1371;
	}

	static int method2696(int var0, class75 var1, boolean var2) {
		class317 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class166.method3349(class67.field843[--class67.field836]);
		} else {
			var4 = var2 ? class67.field329 : class67.field6;
		}

		Client.method3176(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field3657 = 2;
				var4.field3683 = class67.field843[--class67.field836];
				return 1;
			} else if (var0 == 1202) {
				var4.field3657 = 3;
				var4.field3683 = Client.field3454.field1097.method5807();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = class67.field843[--class67.field836] == 1;
				class317.method2167(var4, Client.field3454.field1097, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = class67.field843[--class67.field836];
				if (var4.field3585 == null) {
					throw new RuntimeException("");
				} else {
					class317.method5487(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				class67.field836 -= 2;
				var5 = class67.field843[class67.field836];
				var6 = class67.field843[1 + class67.field836];
				if (null == var4.field3585) {
					throw new RuntimeException("");
				} else {
					class317.method2100(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = class67.field843[--class67.field836];
				if (var4.field3585 == null) {
					throw new RuntimeException("");
				} else {
					class163.method3330(var4, Client.field3454.field1097.field3522, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class67.field836 -= 2;
			var5 = class67.field843[class67.field836];
			var6 = class67.field843[class67.field836 + 1];
			var4.field3703 = var5;
			var4.field3637 = var6;
			class202 var7 = class92.method2352(var5);
			var4.field3622 = var7.field2225;
			var4.field3566 = var7.field2226;
			var4.field3711 = var7.field2260;
			var4.field3620 = var7.field2228;
			var4.field3709 = var7.field2229;
			var4.field3619 = var7.field2224;
			if (var0 == 1205) {
				var4.field3631 = 0;
			} else if (var0 == 1212 | var7.field2236 == 1) {
				var4.field3631 = 1;
			} else {
				var4.field3631 = 2;
			}

			if (var4.field3626 > 0) {
				var4.field3619 = var4.field3619 * 32 / var4.field3626;
			} else if (var4.field3581 > 0) {
				var4.field3619 = var4.field3619 * 32 / var4.field3581;
			}

			return 1;
		}
	}
}
