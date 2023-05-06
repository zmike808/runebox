public class class65 {
	int field813;
	final class469 field809;
	public final class401 field812;
	public final class403 field811;

	class65(class469 var1) {
		this.field813 = 0;
		this.field809 = var1;
		this.field811 = new class403(var1);
		this.field812 = new class401(var1);
	}

	boolean method1789() {
		return this.field813 == 2;
	}

	final void method1776() {
		this.field813 = 1;
	}

	final void method1830(class489 var1, int var2) {
		this.field811.method7490(var1, var2);
		this.field813 = 2;

		for (int var4 = 0; var4 < class103.field1335; ++var4) {
			class88 var5 = Client.field611[class103.field1341[var4]];
			var5.method2242();
		}

		class106.method586();
		if (null != class67.field1426) {
			class67.field1426.method7513();
		}

	}

	final void method1825() {
		for (class406 var2 = (class406)this.field811.field4559.method6830(); null != var2; var2 = (class406)this.field811.field4559.method6833()) {
			if ((long)var2.field4576 < class294.method2575() / 1000L - 5L) {
				if (var2.field4575 > 0) {
					class106.method2852(5, "", var2.field4573 + class337.field3997);
				}

				if (var2.field4575 == 0) {
					class106.method2852(5, "", var2.field4573 + class337.field3998);
				}

				var2.method8039();
			}
		}

	}

	final void method1799() {
		this.field813 = 0;
		this.field811.method7654();
		this.field812.method7654();
	}

	final boolean method1780(class513 var1, boolean var2) {
		if (null == var1) {
			return false;
		} else if (var1.equals(Client.field3454.field1089)) {
			return true;
		} else {
			return this.field811.method7505(var1, var2);
		}
	}

	final boolean method1781(class513 var1) {
		if (null == var1) {
			return false;
		} else {
			return this.field812.method7640(var1);
		}
	}

	final void method1782(String var1) {
		if (var1 != null) {
			class513 var3 = new class513(var1, this.field809);
			if (var3.method9258()) {
				if (this.method1783()) {
					method3695(class337.field4016);
				} else if (Client.field3454.field1089.equals(var3)) {
					method503();
				} else if (this.method1780(var3, false)) {
					method3695(var1 + class337.field4081);
				} else if (this.method1781(var3)) {
					method1175(var1);
				} else {
					class289 var4 = class331.method6337(class287.field3154, Client.field753.field1385);
					var4.field3212.method8695(class489.method2092(var1));
					var4.field3212.method8648(var1);
					Client.field753.method2735(var4);
				}
			}
		}
	}

	final boolean method1783() {
		return this.field811.method7611() || this.field811.method7610() >= 200 && Client.field613 != 1;
	}

	final void method1784(String var1) {
		if (var1 != null) {
			class513 var3 = new class513(var1, this.field809);
			if (var3.method9258()) {
				if (this.method1797()) {
					method3695(class337.field4018);
				} else if (Client.field3454.field1089.equals(var3)) {
					method1225();
				} else if (this.method1781(var3)) {
					method3695(var1 + class337.field4019);
				} else if (this.method1780(var3, false)) {
					method3695(class337.field3943 + var1 + class337.field3974);
				} else {
					class289 var4 = class331.method6337(class287.field3120, Client.field753.field1385);
					var4.field3212.method8695(class489.method2092(var1));
					var4.field3212.method8648(var1);
					Client.field753.method2735(var4);
				}
			}
		}
	}

	final boolean method1797() {
		return this.field812.method7611() || this.field812.method7610() >= 100 && Client.field613 != 1;
	}

	final void method1786(String var1) {
		if (var1 != null) {
			class513 var3 = new class513(var1, this.field809);
			if (var3.method9258()) {
				if (this.field811.method7622(var3)) {
					Client.field690 = Client.field680;
					class289 var4 = class331.method6337(class287.field3195, Client.field753.field1385);
					var4.field3212.method8695(class489.method2092(var1));
					var4.field3212.method8648(var1);
					Client.field753.method2735(var4);
				}

				for (int var6 = 0; var6 < class103.field1335; ++var6) {
					class88 var5 = Client.field611[class103.field1341[var6]];
					var5.method2242();
				}

				class106.method586();
				if (class67.field1426 != null) {
					class67.field1426.method7513();
				}

			}
		}
	}

	public final void method1787(String var1, boolean var2) {
		if (var1 != null) {
			class513 var4 = new class513(var1, this.field809);
			if (var4.method9258()) {
				if (this.field812.method7622(var4)) {
					Client.field690 = Client.field680;
					if (var2) {
						class289 var5 = class331.method6337(class287.field3113, Client.field753.field1385);
						var5.field3212.method8695(class489.method2092(var1));
						var5.field3212.method8648(var1);
						Client.field753.method2735(var5);
					}
				}

				Client.method2045();
			}
		}
	}

	final boolean method1788(class513 var1) {
		class405 var3 = (class405)this.field811.method7647(var1);
		return null != var3 && var3.method7697();
	}

	static final void method3695(String var0) {
		class106.method2852(30, "", var0);
	}

	static final void method1175(String var0) {
		method3695(class337.field4022 + var0 + class337.field4023);
	}

	static final void method503() {
		method3695(class337.field4020);
	}

	static final void method1225() {
		method3695(class337.field3849);
	}

	static final void method2385(String var0, int var1) {
		class289 var3 = class331.method6337(class287.field3152, Client.field753.field1385);
		var3.field3212.method8695(class489.method2092(var0) + 1);
		var3.field3212.method8648(var0);
		var3.field3212.method8695(var1);
		Client.field753.method2735(var3);
	}
}
