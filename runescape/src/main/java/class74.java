import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class74 {
	ExecutorService field961;
	Future field957;

	class74() {
		this.field961 = Executors.newSingleThreadExecutor();
		this.field957 = this.field961.submit(new class79());
	}

	void method2063() {
		this.field961.shutdown();
		this.field961 = null;
	}

	boolean method2064() {
		return this.field957.isDone();
	}

	SecureRandom method2065() {
		try {
			return (SecureRandom)this.field957.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}

	public static int method2066(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						throw new NumberFormatException();
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var11 + var6 * var1;
				if (var6 != var10 / var1) {
					throw new NumberFormatException();
				}

				var6 = var10;
				var5 = true;
			}

			if (!var5) {
				throw new NumberFormatException();
			} else {
				return var6;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
