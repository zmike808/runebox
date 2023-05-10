public class class217 {
	static int[] field2478;
	static int[] field2481;
	static int[] field2487;
	static int[] field2488;
	boolean field2480;
	class222 field2482;
	int field2483;
	int[] field2479;
	int[] field2484;
	int[] field2485;
	int[] field2486;

	static {
		field2488 = new int[500];
		field2487 = new int[500];
		field2478 = new int[500];
		field2481 = new int[500];
	}

	class217(byte[] var1, class222 var2) {
		this.field2482 = null;
		this.field2483 = -1;
		this.field2480 = false;
		this.field2482 = var2;
		class489 var3 = new class489(var1);
		class489 var4 = new class489(var1);
		var3.field4989 = 2;
		int var5 = var3.method8658();
		int var6 = -1;
		int var7 = 0;
		var4.field4989 = var3.field4989 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method8658();
			if (var9 > 0) {
				if (this.field2482.field2540[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field2482.field2540[var10] == 0) {
							field2488[var7] = var10;
							field2487[var7] = 0;
							field2478[var7] = 0;
							field2481[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2488[var7] = var8;
				short var11 = 0;
				if (this.field2482.field2540[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2487[var7] = var4.method8673();
				} else {
					field2487[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2478[var7] = var4.method8673();
				} else {
					field2478[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2481[var7] = var4.method8673();
				} else {
					field2481[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field2482.field2540[var8] == 5) {
					this.field2480 = true;
				}
			}
		}

		if (var4.field4989 != var1.length) {
			throw new RuntimeException();
		} else {
			this.field2483 = var7;
			this.field2484 = new int[var7];
			this.field2485 = new int[var7];
			this.field2479 = new int[var7];
			this.field2486 = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.field2484[var8] = field2488[var8];
				this.field2485[var8] = field2487[var8];
				this.field2479[var8] = field2478[var8];
				this.field2486[var8] = field2481[var8];
			}

		}
	}
}
