public class class341 implements Runnable {
	public static class363 field4195;
	public static class363 field4196;
	static int field4197;
	static Object field4198;
	static Thread field4272;

	static {
		field4196 = new class363();
		field4195 = new class363();
		field4197 = 0;
		field4198 = new Object();
	}

	class341() {
	}

	public void run() {
		try {
			while (true) {
				class363 var2;
				synchronized(var2 = field4196){}
				class340 var1 = (class340)field4196.method6716();
				Object var9;
				if (var1 != null) {
					if (var1.field4190 == 0) {
						var1.field4192.method7770((int)var1.field4745, var1.field4191, var1.field4191.length);
						synchronized(var2 = field4196){}
						var1.method8051();
					} else if (var1.field4190 == 1) {
						var1.field4191 = var1.field4192.method7772((int)var1.field4745);
						synchronized(var2 = field4196){}
						field4195.method6711(var1);
					}

					synchronized(var9 = field4198){}
					if (field4197 <= 1) {
						field4197 = 0;
						field4198.notifyAll();
						return;
					}

					field4197 = 600;
				} else {
					class295.method5844(100L);
					synchronized(var9 = field4198){}
					if (field4197 <= 1) {
						field4197 = 0;
						field4198.notifyAll();
						return;
					}

					--field4197;
				}
			}
		} catch (Exception var8) {
			class388.method7339((String)null, var8);
		}
	}

	static void method1985(int var0, byte[] var1, class418 var2) {
		class340 var4 = new class340();
		var4.field4190 = 0;
		var4.field4745 = (long)var0;
		var4.field4191 = var1;
		var4.field4192 = var2;
		class363 var5;
		synchronized(var5 = field4196){}
		field4196.method6711(var4);
		method2994();
	}

	static Integer method6388(class489 var0) {
		int var2 = 0;
		boolean var3 = false;

		while (true) {
			int var4 = var0.method8658();
			if (var4 == 255) {
				return var3 ? var2 : null;
			}

			if (var4 != 0) {
				throw new IllegalStateException("");
			}

			while (true) {
				int var5 = var0.method8658();
				if (var5 == 255) {
					break;
				}

				--var0.field4989;
				if (var0.method8660() != 0) {
					throw new IllegalStateException("");
				}

				if (var3) {
					throw new IllegalStateException("");
				}

				var2 = var0.method8664();
				var3 = true;
			}
		}
	}

	static void method4777(int var0, class418 var1, class342 var2) {
		class340 var4 = new class340();
		var4.field4190 = 1;
		var4.field4745 = (long)var0;
		var4.field4192 = var1;
		var4.field4193 = var2;
		class363 var5;
		synchronized(var5 = field4196){}
		field4196.method6711(var4);
		method2994();
	}

	static void method2994() {
		Object var1;
		synchronized(var1 = field4198){}
		if (field4197 == 0) {
			field4272 = new Thread(new class341());
			field4272.setDaemon(true);
			field4272.start();
			field4272.setPriority(5);
		}

		field4197 = 600;
	}

	public static void method3175() {
		Object var1;
		synchronized(var1 = field4198){}
		if (0 != field4197) {
			field4197 = 1;

			try {
				field4198.wait();
			} catch (InterruptedException var4) {
			}
		}

	}
}
