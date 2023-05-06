public class class222 extends class449 {
	class220 field2542;
	int field2534;
	int field2539;
	int[] field2540;
	int[][] field2543;

	public class222(int var1, byte[] var2) {
		this.field2539 = var1;
		class489 var3 = new class489(var2);
		this.field2534 = var3.method8658();
		this.field2540 = new int[this.field2534];
		this.field2543 = new int[this.field2534][];

		int var4;
		for (var4 = 0; var4 < this.field2534; ++var4) {
			this.field2540[var4] = var3.method8658();
		}

		for (var4 = 0; var4 < this.field2534; ++var4) {
			this.field2543[var4] = new int[var3.method8658()];
		}

		for (var4 = 0; var4 < this.field2534; ++var4) {
			for (int var5 = 0; var5 < this.field2543[var4].length; ++var5) {
				this.field2543[var4][var5] = var3.method8658();
			}
		}

		if (var3.field4989 < var3.field4991.length) {
			var4 = var3.method8660();
			if (var4 > 0) {
				this.field2542 = new class220(var3, var4);
			}
		}

	}

	public int method4362() {
		return this.field2534;
	}

	public class220 method4363() {
		return this.field2542;
	}
}
