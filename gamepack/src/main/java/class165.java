public class class165 extends class179 {
	long field1796;

	class165() {
		this.field1796 = System.nanoTime();
	}

	public void method3492() {
		this.field1796 = System.nanoTime();
	}

	public int method3489(int var1, int var2) {
		long var4 = (long)var2 * 1000000L;
		long var6 = this.field1796 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		class295.method5844(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1796 < var8); this.field1796 += 1000000L * (long)var1) {
			++var10;
		}

		if (this.field1796 < var8) {
			this.field1796 = var8;
		}

		return var10;
	}
}
