import java.util.LinkedList;

public abstract class class258 {
	boolean field2999;
	boolean field3000;
	byte[][][] field2991;
	byte[][][] field2997;
	class260[][][][] field2998;
	int field2988;
	int field2989;
	int field2990;
	int field2992;
	int field2993;
	int field2995;
	int field2996;
	int field3001;
	short[][][] field2987;
	short[][][] field2994;

	class258() {
		this.field2992 = -1;
		this.field2993 = -1;
		new LinkedList();
		this.field2999 = false;
		this.field3000 = false;
	}

	abstract void method5233(class489 var1);

	boolean method5234() {
		return this.field2999 && this.field3000;
	}

	void method5235(class344 var1) {
		if (!this.method5234()) {
			byte[] var3 = var1.method6468(this.field2992, this.field2993);
			if (var3 != null) {
				this.method5233(new class489(var3));
				this.field2999 = true;
				this.field3000 = true;
			}

		}
	}

	void method5247() {
		this.field2994 = (short[][][])null;
		this.field2987 = (short[][][])null;
		this.field2991 = (byte[][][])null;
		this.field2997 = (byte[][][])null;
		this.field2998 = (class260[][][][])null;
		this.field2999 = false;
		this.field3000 = false;
	}

	void method5236(int var1, int var2, class489 var3) {
		int var5 = var3.method8658();
		if (var5 != 0) {
			if (0 != (var5 & 1)) {
				this.method5238(var1, var2, var3, var5);
			} else {
				this.method5239(var1, var2, var3, var5);
			}

		}
	}

	void method5238(int var1, int var2, class489 var3, int var4) {
		boolean var6 = 0 != (var4 & 2);
		if (var6) {
			this.field2987[0][var1][var2] = (short)var3.method8660();
		}

		this.field2994[0][var1][var2] = (short)var3.method8660();
	}

	void method5239(int var1, int var2, class489 var3, int var4) {
		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = 0 != (var4 & 2);
		boolean var8 = 0 != (var4 & 4);
		this.field2994[0][var1][var2] = (short)var3.method8660();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method8658();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.method8660();
				if (var11 != 0) {
					this.field2987[var10][var1][var2] = (short)var11;
					var12 = var3.method8658();
					this.field2991[var10][var1][var2] = (byte)(var12 >> 2);
					this.field2997[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method8658();
				if (var10 != 0) {
					class260[] var15 = this.field2998[var9][var1][var2] = new class260[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method8710();
						int var14 = var3.method8658();
						var15[var12] = new class260(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	int method5241() {
		return this.field2988;
	}

	int method5242() {
		return this.field2989;
	}

	public static synchronized byte[] method5258(int var0) {
		return class387.method7337(var0, false);
	}
}
