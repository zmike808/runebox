public class class510 {
	int[] field5136;

	public class510(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
		}

		this.field5136 = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.field5136[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.field5136[var4 + var4 + 1] = var3++) {
			for (var4 = var1[var3] & var2 - 1; -1 != this.field5136[var4 + var4 + 1]; var4 = var4 + 1 & var2 - 1) {
			}

			this.field5136[var4 + var4] = var1[var3];
		}

	}

	public int method9252(int var1) {
		int var3 = (this.field5136.length >> 1) - 1;
		int var4 = var1 & var3;

		while (true) {
			int var5 = this.field5136[1 + var4 + var4];
			if (var5 == -1) {
				return -1;
			}

			if (this.field5136[var4 + var4] == var1) {
				return var5;
			}

			var4 = var4 + 1 & var3;
		}
	}
}
