public class class176 extends class179 {
	int field1873;
	int field1874;
	int field1877;
	int field1879;
	long field1876;
	long[] field1880;

	class176() {
		this.field1880 = new long[10];
		this.field1873 = 256;
		this.field1874 = 1;
		this.field1879 = 0;
		this.field1876 = class294.method2575();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1880[var1] = this.field1876;
		}

	}

	public void method3492() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field1880[var2] = 0L;
		}

	}

	public int method3489(int var1, int var2) {
		int var4 = this.field1873;
		int var5 = this.field1874;
		this.field1873 = 300;
		this.field1874 = 1;
		this.field1876 = class294.method2575();
		if (0L == this.field1880[this.field1877]) {
			this.field1873 = var4;
			this.field1874 = var5;
		} else if (this.field1876 > this.field1880[this.field1877]) {
			this.field1873 = (int)((long)(var1 * 2560) / (this.field1876 - this.field1880[this.field1877]));
		}

		if (this.field1873 < 25) {
			this.field1873 = 25;
		}

		if (this.field1873 > 256) {
			this.field1873 = 256;
			this.field1874 = (int)((long)var1 - (this.field1876 - this.field1880[this.field1877]) / 10L);
		}

		if (this.field1874 > var1) {
			this.field1874 = var1;
		}

		this.field1880[this.field1877] = this.field1876;
		this.field1877 = (1 + this.field1877) % 10;
		int var6;
		if (this.field1874 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (0L != this.field1880[var6]) {
					this.field1880[var6] += (long)this.field1874;
				}
			}
		}

		if (this.field1874 < var2) {
			this.field1874 = var2;
		}

		class295.method5844((long)this.field1874);

		for (var6 = 0; this.field1879 < 256; this.field1879 += this.field1873) {
			++var6;
		}

		this.field1879 &= 255;
		return var6;
	}
}
