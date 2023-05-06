import java.util.concurrent.Callable;

public class class2 implements Callable {
	final class4 field4;
	final class489 field2;
	// $FF: synthetic field
	final class8 this$0;

	class2(class8 var1, class489 var2, class4 var3) {
		this.this$0 = var1;
		this.field2 = var2;
		this.field4 = var3;
	}

	public Object call() {
		return this.field4.method14(this.field2);
	}

	static void method11(int var0) {
		if (var0 == -1 && !Client.field739) {
			class298.method3735();
		} else if (var0 != -1 && Client.field650 != var0 && Client.field112.method2405() != 0 && !Client.field739) {
			class298.method2343(2, Client.field4548, var0, 0, Client.field112.method2405(), false);
		}

		Client.field650 = var0;
	}
}
