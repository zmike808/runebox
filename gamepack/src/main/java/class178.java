import java.io.IOException;

public abstract class class178 {
	String field1890;
	// $FF: synthetic field
	final class167 this$0;

	class178(class167 var1, String var2) {
		this.this$0 = var1;
		this.field1890 = var2;
	}

	public abstract int method3477();

	public String method3476() {
		return this.field1890;
	}

	public String method3486() {
		return null;
	}

	public int method3478() {
		return -1;
	}

	public static void method3487(boolean var0) {
		if (null != class345.field4241) {
			try {
				class489 var2 = new class489(4);
				var2.method8695(var0 ? 2 : 3);
				var2.method8702(0);
				class345.field4241.method7710(var2.field4991, 0, 4);
			} catch (IOException var5) {
				try {
					class345.field4241.method7711();
				} catch (Exception var4) {
				}

				++class345.field4261;
				class345.field4241 = null;
			}

		}
	}
}
