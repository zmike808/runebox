public abstract class class344 {
	static class509 field4233;
	static int field4221;
	boolean field4235;
	boolean field4236;
	class510 field4224;
	class510[] field4230;
	int field4237;
	int[] field4223;
	int[] field4225;
	int[] field4227;
	int[] field4228;
	int[] field4232;
	int[][] field4222;
	int[][] field4229;
	Object[] field4231;
	Object[][] field4234;
	public int field4226;

	static {
		field4233 = new class509();
		field4221 = 0;
	}

	class344(boolean var1, boolean var2) {
		this.field4235 = var1;
		this.field4236 = var2;
	}

	void method6444(byte[] var1) {
		this.field4226 = class489.method4335(var1, var1.length);
		class489 var3 = new class489(class14.method177(var1));
		int var4 = var3.method8658();
		if (var4 >= 5 && var4 <= 7) {
			if (var4 >= 6) {
				var3.method8664();
			}

			int var5 = var3.method8658();
			if (var4 >= 7) {
				this.field4237 = var3.method8892();
			} else {
				this.field4237 = var3.method8660();
			}

			int var6 = 0;
			int var7 = -1;
			this.field4232 = new int[this.field4237];
			int var8;
			if (var4 >= 7) {
				for (var8 = 0; var8 < this.field4237; ++var8) {
					this.field4232[var8] = var6 += var3.method8892();
					if (this.field4232[var8] > var7) {
						var7 = this.field4232[var8];
					}
				}
			} else {
				for (var8 = 0; var8 < this.field4237; ++var8) {
					this.field4232[var8] = var6 += var3.method8660();
					if (this.field4232[var8] > var7) {
						var7 = this.field4232[var8];
					}
				}
			}

			this.field4225 = new int[var7 + 1];
			this.field4228 = new int[var7 + 1];
			this.field4227 = new int[var7 + 1];
			this.field4222 = new int[var7 + 1][];
			this.field4231 = new Object[var7 + 1];
			this.field4234 = new Object[var7 + 1][];
			if (var5 != 0) {
				this.field4223 = new int[var7 + 1];

				for (var8 = 0; var8 < this.field4237; ++var8) {
					this.field4223[this.field4232[var8]] = var3.method8664();
				}

				this.field4224 = new class510(this.field4223);
			}

			for (var8 = 0; var8 < this.field4237; ++var8) {
				this.field4225[this.field4232[var8]] = var3.method8664();
			}

			for (var8 = 0; var8 < this.field4237; ++var8) {
				this.field4228[this.field4232[var8]] = var3.method8664();
			}

			for (var8 = 0; var8 < this.field4237; ++var8) {
				this.field4227[this.field4232[var8]] = var3.method8660();
			}

			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			if (var4 >= 7) {
				for (var8 = 0; var8 < this.field4237; ++var8) {
					var9 = this.field4232[var8];
					var10 = this.field4227[var9];
					var6 = 0;
					var11 = -1;
					this.field4222[var9] = new int[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var13 = this.field4222[var9][var12] = var6 += var3.method8892();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.field4234[var9] = new Object[var11 + 1];
				}
			} else {
				for (var8 = 0; var8 < this.field4237; ++var8) {
					var9 = this.field4232[var8];
					var10 = this.field4227[var9];
					var6 = 0;
					var11 = -1;
					this.field4222[var9] = new int[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var13 = this.field4222[var9][var12] = var6 += var3.method8660();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.field4234[var9] = new Object[var11 + 1];
				}
			}

			if (var5 != 0) {
				this.field4229 = new int[var7 + 1][];
				this.field4230 = new class510[var7 + 1];

				for (var8 = 0; var8 < this.field4237; ++var8) {
					var9 = this.field4232[var8];
					var10 = this.field4227[var9];
					this.field4229[var9] = new int[this.field4234[var9].length];

					for (var11 = 0; var11 < var10; ++var11) {
						this.field4229[var9][this.field4222[var9][var11]] = var3.method8664();
					}

					this.field4230[var9] = new class510(this.field4229[var9]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method6503(int var1) {
	}

	public byte[] method6468(int var1, int var2) {
		return this.method6447(var1, var2, (int[])null);
	}

	public byte[] method6447(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field4234.length && this.field4234[var1] != null && var2 >= 0 && var2 < this.field4234[var1].length) {
			if (null == this.field4234[var1][var2]) {
				boolean var5 = this.method6463(var1, var3);
				if (!var5) {
					this.method6456(var1);
					var5 = this.method6463(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = class321.method3599(this.field4234[var1][var2], false);
			if (this.field4236) {
				this.field4234[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	public boolean method6448(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4234.length && null != this.field4234[var1] && var2 >= 0 && var2 < this.field4234[var1].length) {
			if (null != this.field4234[var1][var2]) {
				return true;
			} else if (null != this.field4231[var1]) {
				return true;
			} else {
				this.method6456(var1);
				return null != this.field4231[var1];
			}
		} else {
			return false;
		}
	}

	public boolean method6457(int var1) {
		if (this.field4234.length == 1) {
			return this.method6448(0, var1);
		} else if (1 == this.field4234[var1].length) {
			return this.method6448(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method6510(int var1) {
		if (this.field4231[var1] != null) {
			return true;
		} else {
			this.method6456(var1);
			return null != this.field4231[var1];
		}
	}

	public boolean method6521() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field4232.length; ++var3) {
			int var4 = this.field4232[var3];
			if (null == this.field4231[var4]) {
				this.method6456(var4);
				if (null == this.field4231[var4]) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	int method6452(int var1) {
		return null != this.field4231[var1] ? 100 : 0;
	}

	public byte[] method6501(int var1) {
		if (this.field4234.length == 1) {
			return this.method6468(0, var1);
		} else if (this.field4234[var1].length == 1) {
			return this.method6468(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public byte[] method6454(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4234.length && null != this.field4234[var1] && var2 >= 0 && var2 < this.field4234[var1].length) {
			if (this.field4234[var1][var2] == null) {
				boolean var4 = this.method6463(var1, (int[])null);
				if (!var4) {
					this.method6456(var1);
					var4 = this.method6463(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class321.method3599(this.field4234[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	public byte[] method6455(int var1) {
		if (1 == this.field4234.length) {
			return this.method6454(0, var1);
		} else if (1 == this.field4234[var1].length) {
			return this.method6454(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	void method6456(int var1) {
	}

	public int[] method6449(int var1) {
		return var1 >= 0 && var1 < this.field4222.length ? this.field4222[var1] : null;
	}

	public int method6458(int var1) {
		return this.field4234 != null && var1 < this.field4234.length && null != this.field4234[var1] ? this.field4234[var1].length : 0;
	}

	public int method6459() {
		return this.field4234.length;
	}

	public void method6460() {
		for (int var2 = 0; var2 < this.field4231.length; ++var2) {
			this.field4231[var2] = null;
		}

	}

	public void method6461(int var1) {
		for (int var3 = 0; var3 < this.field4234[var1].length; ++var3) {
			this.field4234[var1][var3] = null;
		}

	}

	public void method6465() {
		for (int var2 = 0; var2 < this.field4234.length; ++var2) {
			if (this.field4234[var2] != null) {
				for (int var3 = 0; var3 < this.field4234[var2].length; ++var3) {
					this.field4234[var2][var3] = null;
				}
			}
		}

	}

	boolean method6463(int var1, int[] var2) {
		if (this.field4231[var1] == null) {
			return false;
		} else {
			int var4 = this.field4227[var1];
			int[] var5 = this.field4222[var1];
			Object[] var6 = this.field4234[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; ++var8) {
				if (var6[var5[var8]] == null) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var19;
				if (var2 == null || 0 == var2[0] && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
					var19 = class321.method3599(this.field4231[var1], false);
				} else {
					var19 = class321.method3599(this.field4231[var1], true);
					class489 var9 = new class489(var19);
					var9.method8684(var2, 5, var9.field4991.length);
				}

				byte[] var20 = class14.method177(var19);
				if (this.field4235) {
					this.field4231[var1] = null;
				}

				if (var4 > 1) {
					int var10 = var20.length;
					--var10;
					int var11 = var20[var10] & 255;
					var10 -= 4 * var4 * var11;
					class489 var12 = new class489(var20);
					int[] var13 = new int[var4];
					var12.field4989 = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method8664();
							var13[var16] += var15;
						}
					}

					byte[][] var21 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var21[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.field4989 = var10;
					var15 = 0;

					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (int var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method8664();
							System.arraycopy(var20, var15, var21[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field4236) {
							var6[var5[var16]] = class321.method2790(var21[var16], false);
						} else {
							var6[var5[var16]] = var21[var16];
						}
					}
				} else if (!this.field4236) {
					var6[var5[0]] = class321.method2790(var20, false);
				} else {
					var6[var5[0]] = var20;
				}

				return true;
			}
		}
	}

	public int method6464(String var1) {
		var1 = var1.toLowerCase();
		return this.field4224.method9252(class372.method3700(var1));
	}

	public int method6450(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field4230[var1].method9252(class372.method3700(var2));
	}

	public boolean method6466(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4224.method9252(class372.method3700(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field4230[var4].method9252(class372.method3700(var2));
			return var5 >= 0;
		}
	}

	public byte[] method6467(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4224.method9252(class372.method3700(var1));
		int var5 = this.field4230[var4].method9252(class372.method3700(var2));
		return this.method6468(var4, var5);
	}

	public boolean method6525(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4224.method9252(class372.method3700(var1));
		int var5 = this.field4230[var4].method9252(class372.method3700(var2));
		return this.method6448(var4, var5);
	}

	public boolean method6469(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4224.method9252(class372.method3700(var1));
		return this.method6510(var3);
	}

	public void method6470(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4224.method9252(class372.method3700(var1));
		if (var3 >= 0) {
			this.method6503(var3);
		}
	}

	public int method6443(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4224.method9252(class372.method3700(var1));
		return this.method6452(var3);
	}

	static char method6531(char var0, class359 var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && class359.field4322 != var1) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != class359.field4322) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}
}
