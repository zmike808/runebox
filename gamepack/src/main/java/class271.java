public class class271 {
	byte[][][] field3066;
	int field3065;

	class271(int var1) {
		this.field3065 = var1;
	}

	void method5372(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.field3065 != 0 && null != this.field3066) {
			var8 = this.method5373(var8, var7);
			var7 = this.method5374(var7);
			class499.method8992(var1, var2, var5, var6, var3, var4, this.field3066[var7 - 1][var8], this.field3065, true);
		}
	}

	int method5373(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	int method5374(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	void method5417() {
		if (null == this.field3066) {
			this.field3066 = new byte[8][4][];
			this.method5376();
			this.method5377();
			this.method5378();
			this.method5379();
			this.method5380();
			this.method5408();
			this.method5382();
			this.method5383();
		}
	}

	void method5376() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[0][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[0][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[0][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[0][3] = var2;
	}

	void method5377() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[1][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var3 >= 0 && var3 < var2.length) {
					if (var5 >= var4 << 1) {
						var2[var3] = -1;
					}

					++var3;
				} else {
					++var3;
				}
			}
		}

		this.field3066[1][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[1][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[1][3] = var2;
	}

	void method5378() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[2][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[2][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[2][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[2][3] = var2;
	}

	void method5379() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[3][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[3][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[3][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[3][3] = var2;
	}

	void method5380() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[4][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[4][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[4][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var3 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3066[4][3] = var2;
	}

	void method5408() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		boolean var3 = false;
		var2 = new byte[this.field3065 * this.field3065];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[5][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var4 <= this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[5][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[5][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var4 >= this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[5][3] = var2;
	}

	void method5382() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		boolean var3 = false;
		var2 = new byte[this.field3065 * this.field3065];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[6][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 <= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[6][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[6][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[6][3] = var2;
	}

	void method5383() {
		byte[] var2 = new byte[this.field3065 * this.field3065];
		boolean var3 = false;
		var2 = new byte[this.field3065 * this.field3065];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[7][0] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3065; ++var5) {
				if (var5 >= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[7][1] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = this.field3065 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[7][2] = var2;
		var2 = new byte[this.field3065 * this.field3065];
		var6 = 0;

		for (var4 = 0; var4 < this.field3065; ++var4) {
			for (var5 = this.field3065 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field3065 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3066[7][3] = var2;
	}

	static final void method5393(int var0, int var1, byte var2) {
		if (Client.field679[var0] == null) {
			if (var2 <= -1) {
				throw new IllegalStateException();
			}
		} else {
			if (var1 >= 0) {
				if (var2 <= -1) {
					throw new IllegalStateException();
				}

				if (var1 < Client.field679[var0].method3303()) {
					class142 var3 = (class142)Client.field679[var0].field1770.get(var1);
					if (var3.field1650 != -1) {
						if (var2 <= -1) {
							throw new IllegalStateException();
						}

						return;
					}

					class289 var4 = class331.method6337(class287.field3149, Client.field753.field1385);
					var4.field3212.method8695(3 + class489.method2092(var3.field1652.method9256()));
					var4.field3212.method8695(var0);
					var4.field3212.method8642(var1);
					var4.field3212.method8648(var3.field1652.method9256());
					Client.field753.method2735(var4);
					return;
				}

				if (var2 <= -1) {
					throw new IllegalStateException();
				}
			}

		}
	}
}
