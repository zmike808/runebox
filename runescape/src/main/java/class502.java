public final class class502 extends class499 {
	public byte[] field5083;
	public int field5079;
	public int field5081;
	public int field5082;
	public int field5084;
	public int field5085;
	public int field5086;
	public int[] field5080;

	class502() {
	}

	public void method9088() {
		if (this.field5081 != this.field5079 || this.field5082 != this.field5085) {
			byte[] var1 = new byte[this.field5079 * this.field5085];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field5082; ++var3) {
				for (int var4 = 0; var4 < this.field5081; ++var4) {
					var1[var4 + this.field5086 + (var3 + this.field5084) * this.field5079] = this.field5083[var2++];
				}
			}

			this.field5083 = var1;
			this.field5081 = this.field5079;
			this.field5082 = this.field5085;
			this.field5086 = 0;
			this.field5084 = 0;
		}
	}

	public void method9071(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field5080.length; ++var4) {
			int var5 = this.field5080[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field5080[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field5080[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field5080[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public void method9072(int var1, int var2) {
		var1 += this.field5086;
		var2 += this.field5084;
		int var3 = var1 + var2 * class238.field5061;
		int var4 = 0;
		int var5 = this.field5082;
		int var6 = this.field5081;
		int var7 = class238.field5061 - var6;
		int var8 = 0;
		int var9;
		if (var2 < class499.field5065) {
			var9 = class499.field5065 - var2;
			var5 -= var9;
			var2 = class499.field5065;
			var4 += var9 * var6;
			var3 += var9 * class238.field5061;
		}

		if (var2 + var5 > class499.field5066) {
			var5 -= var2 + var5 - class499.field5066;
		}

		if (var1 < class499.field5064) {
			var9 = class499.field5064 - var1;
			var6 -= var9;
			var1 = class499.field5064;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > class499.field5068) {
			var9 = var1 + var6 - class499.field5068;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method9085(class238.field5067, this.field5083, this.field5080, var4, var3, var6, var5, var7, var8);
		}
	}

	public void method9083(int var1, int var2, int var3, int var4) {
		int var5 = this.field5081;
		int var6 = this.field5082;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field5079;
		int var10 = this.field5085;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field5086 > 0) {
			var13 = ((this.field5086 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.field5086 << 16);
		}

		if (this.field5084 > 0) {
			var13 = ((this.field5084 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 += var13 * var12 - (this.field5084 << 16);
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + var2 * class238.field5061;
		int var14 = class238.field5061 - var3;
		if (var2 + var4 > class499.field5066) {
			var4 -= var2 + var4 - class499.field5066;
		}

		int var15;
		if (var2 < class499.field5065) {
			var15 = class499.field5065 - var2;
			var4 -= var15;
			var13 += var15 * class238.field5061;
			var8 += var12 * var15;
		}

		if (var1 + var3 > class499.field5068) {
			var15 = var1 + var3 - class499.field5068;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < class499.field5064) {
			var15 = class499.field5064 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var11 * var15;
			var14 += var15;
		}

		method9075(class238.field5067, this.field5083, this.field5080, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	static void method9085(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method9075(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}
}
