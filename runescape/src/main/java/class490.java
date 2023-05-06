public class class490 {
	int[] field4998;
	short[] field4996;

	public class490(class191 var1) {
		this.field4998 = new int[8];
		this.field4996 = new short[8];
		int var2 = 0;
		if (var1.method3646()) {
			var2 = var1.method3647().length;
			System.arraycopy(var1.method3647(), 0, this.field4998, 0, var2);
			System.arraycopy(var1.method3649(), 0, this.field4996, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field4998[var3] = -1;
			this.field4996[var3] = -1;
		}

	}

	public int[] method8911() {
		return this.field4998;
	}

	public short[] method8904() {
		return this.field4996;
	}

	public void method8905(int var1, int var2, short var3) {
		this.field4998[var1] = var2;
		this.field4996[var1] = var3;
	}

	public void method8917(int[] var1, short[] var2) {
		this.field4998 = var1;
		this.field4996 = var2;
	}
}
