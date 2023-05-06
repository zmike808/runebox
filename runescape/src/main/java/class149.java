import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class class149 extends class140 {
	String field1701;
	// $FF: synthetic field
	final class143 this$0;

	class149(class143 var1) {
		this.this$0 = var1;
	}

	void method3152(class489 var1) {
		this.field1701 = var1.method8669();
		var1.method8664();
	}

	void method3151(class151 var1) {
		var1.field1714 = this.field1701;
	}

	public static class188 method3201(int var0) {
		class188 var2 = (class188)class188.field1983.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class188.field1985.method6468(8, var0);
			var2 = new class188();
			if (var3 != null) {
				var2.method3623(new class489(var3));
			}

			class188.field1983.method5463(var2, (long)var0);
			return var2;
		}
	}

	public static final class43 method3202(class168 var0, int var1, int var2) {
		if (class299.field307 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				class43 var4 = class43.field300.method1069();
				var4.field301 = new int[256 * (class48.field314 ? 2 : 1)];
				var4.field306 = var2;
				var4.method821();
				var4.field312 = (var2 & -1024) + 1024;
				if (var4.field312 > 16384) {
					var4.field312 = 16384;
				}

				var4.method822(var4.field312);
				if (class43.field1411 > 0 && class43.field4307 == null) {
					class43.field4307 = new class45();
					class43.field330 = Executors.newScheduledThreadPool(1);
					class43.field330.scheduleAtFixedRate(class43.field4307, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (null != class43.field4307) {
					if (null != class43.field4307.field332[var1]) {
						throw new IllegalArgumentException();
					}

					class43.field4307.field332[var1] = var4;
				}

				return var4;
			} catch (Throwable var5) {
				return new class43();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
