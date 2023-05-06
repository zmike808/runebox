import java.util.concurrent.Callable;

public class class125 implements Callable {
	final class126 field1504;
	final class127 field1501;
	final class128 field1506;
	// $FF: synthetic field
	final class134 this$0;
	final int field1503;

	class125(class134 var1, class126 var2, class127 var3, class128 var4, int var5) {
		this.this$0 = var1;
		this.field1504 = var2;
		this.field1501 = var3;
		this.field1506 = var4;
		this.field1503 = var5;
	}

	public Object call() {
		this.field1504.method3020();
		class126[][] var1;
		if (this.field1501 == class127.field1533) {
			var1 = this.this$0.field1590;
		} else {
			var1 = this.this$0.field1593;
		}

		var1[this.field1503][this.field1506.method3042()] = this.field1504;
		return null;
	}
}
