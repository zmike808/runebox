public class class295 {
	public static final void method5844(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var7) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var6) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var5) {
				}
			}

		}
	}
}
