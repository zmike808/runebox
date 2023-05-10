import java.util.concurrent.Callable;

class class129 implements Callable {
	// $FF: synthetic field
	final class125[] val$curveLoadJobs;
	// $FF: synthetic field
	final class134 this$0;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	final int val$workStart;

	class129(class134 var1, int var2, int var3, class125[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}
}
