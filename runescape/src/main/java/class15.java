import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class15 {
	final int field76;
	final String field77;
	final ThreadFactory field82;
	final ThreadPoolExecutor field81;

	public class15(String var1, int var2, int var3) {
		this.field77 = var1;
		this.field76 = var2;
		this.field82 = new class17(this);
		this.field81 = this.method179(var3);
	}

	final ThreadPoolExecutor method179(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field76), this.field82);
	}

	public class19 method180(class11 var1) {
		if (this.field81.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field81.getCorePoolSize() + " Queue capacity " + this.field76);
			return new class19("Queue full");
		} else {
			class19 var3 = new class19(this.field81.submit(new class20(this, var1)));
			return var3;
		}
	}

	public final void method182() {
		try {
			this.field81.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}

	static String method191(char var0, int var1) {
		char[] var3 = new char[var1];

		for (int var4 = 0; var4 < var1; ++var4) {
			var3[var4] = var0;
		}

		return new String(var3);
	}
}
