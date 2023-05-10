public class class174 {
	// $FF: synthetic field
	final class167 this$0;
	public float[] field1857;
	public int field1854;
	public int field1859;
	public int field1860;
	public String field1856;

	class174(class167 var1) {
		this.this$0 = var1;
		this.field1857 = new float[4];
		this.field1859 = 1;
		this.field1860 = 1;
		this.field1854 = 0;
	}

	public static int method3457(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}

		return var3;
	}

	public static boolean method3458(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = 1 == (int)(var0 >>> 16 & 1L);
			var2 = !var3;
		}

		return var2;
	}
}
