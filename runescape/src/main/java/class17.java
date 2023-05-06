import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class17 implements ThreadFactory {
	// $FF: synthetic field
	final class15 this$0;
	final ThreadGroup field85;
	final AtomicInteger field86;

	class17(class15 var1) {
		this.this$0 = var1;
		this.field86 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field85 = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field85, var1, this.this$0.field77 + "-rest-request-" + this.field86.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	public static int method218(CharSequence var0, CharSequence var1, class359 var2) {
		int var4 = var0.length();
		int var5 = var1.length();
		int var6 = 0;
		int var7 = 0;
		byte var8 = 0;
		byte var9 = 0;

		while (var6 - var8 < var4 || var7 - var9 < var5) {
			if (var6 - var8 >= var4) {
				return -1;
			}

			if (var7 - var9 >= var5) {
				return 1;
			}

			char var10;
			if (var8 != 0) {
				var10 = (char)var8;
				boolean var15 = false;
			} else {
				var10 = var0.charAt(var6++);
			}

			char var11;
			if (var9 != 0) {
				var11 = (char)var9;
				boolean var16 = false;
			} else {
				var11 = var1.charAt(var7++);
			}

			byte var12;
			if (var10 == 198) {
				var12 = 69;
			} else if (var10 == 230) {
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			byte var13;
			if (var11 == 198) {
				var13 = 69;
			} else if (var11 == 230) {
				var13 = 101;
			} else if (var11 == 223) {
				var13 = 115;
			} else if (var11 == 338) {
				var13 = 69;
			} else if (var11 == 339) {
				var13 = 101;
			} else {
				var13 = 0;
			}

			var9 = var13;
			var10 = class344.method6531(var10, var2);
			var11 = class344.method6531(var11, var2);
			if (var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var10 != var11) {
					return class342.method6433(var10, var2) - class342.method6433(var11, var2);
				}
			}
		}

		int var17 = Math.min(var4, var5);

		int var18;
		char var21;
		for (var18 = 0; var18 < var17; ++var18) {
			if (class359.field4319 == var2) {
				var6 = var4 - 1 - var18;
				var7 = var5 - 1 - var18;
			} else {
				var7 = var18;
				var6 = var18;
			}

			char var19 = var0.charAt(var6);
			var21 = var1.charAt(var7);
			if (var19 != var21 && Character.toUpperCase(var19) != Character.toUpperCase(var21)) {
				var19 = Character.toLowerCase(var19);
				var21 = Character.toLowerCase(var21);
				if (var21 != var19) {
					return class342.method6433(var19, var2) - class342.method6433(var21, var2);
				}
			}
		}

		var18 = var4 - var5;
		if (var18 != 0) {
			return var18;
		} else {
			for (int var20 = 0; var20 < var17; ++var20) {
				var21 = var0.charAt(var20);
				char var14 = var1.charAt(var20);
				if (var14 != var21) {
					return class342.method6433(var21, var2) - class342.method6433(var14, var2);
				}
			}

			return 0;
		}
	}
}
