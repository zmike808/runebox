import java.util.Random;

public abstract class class383 extends class499 {
	public static class502[] field4442;
	static int field4432;
	static int field4437;
	static int field4444;
	static int field4445;
	static int field4447;
	static int field4448;
	static int field4449;
	static int field4451;
	static int field4452;
	static String[] field4454;
	static Random field4453;
	byte[] field4436;
	byte[][] field4433;
	int[] field4434;
	int[] field4435;
	int[] field4438;
	int[] field4443;
	int[] field4446;
	public int field4439;
	public int field4440;
	public int field4441;

	static {
		field4452 = -1;
		field4445 = -1;
		field4444 = -1;
		field4447 = -1;
		field4448 = 0;
		field4449 = 0;
		field4437 = 256;
		field4432 = 0;
		field4451 = 0;
		field4453 = new Random();
		field4454 = new String[100];
	}

	class383(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field4433 = new byte[256][];
		this.field4439 = 0;
		this.field4443 = var2;
		this.field4438 = var3;
		this.field4435 = var4;
		this.field4446 = var5;
		this.method7142(var1);
		this.field4433 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field4438[var10] < var8 && this.field4446[var10] != 0) {
				var8 = this.field4438[var10];
			}

			if (this.field4438[var10] + this.field4446[var10] > var9) {
				var9 = this.field4438[var10] + this.field4446[var10];
			}
		}

		this.field4440 = this.field4439 - var8;
		this.field4441 = var9 - this.field4439;
	}

	class383(byte[] var1) {
		this.field4433 = new byte[256][];
		this.field4439 = 0;
		this.method7142(var1);
	}

	abstract void method7167(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	abstract void method7236(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	void method7142(byte[] var1) {
		this.field4434 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field4434.length; ++var2) {
				this.field4434[var2] = var1[var2] & 255;
			}

			this.field4439 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.field4434[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256];
			int[] var4 = new int[256];

			int var5;
			for (var5 = 0; var5 < 256; ++var5) {
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) {
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) {
				var11[var6] = new byte[var10[var6]];
				byte var7 = 0;

				for (var8 = 0; var8 < var11[var6].length; ++var8) {
					var7 += var1[var2++];
					var11[var6][var8] = var7;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var10[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var12[var13].length; ++var9) {
					var14 += var1[var2++];
					var12[var13][var9] = var14;
				}
			}

			this.field4436 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field4436[(var13 << 8) + var8] = (byte)method7239(var11, var12, var4, this.field4434, var10, var13, var8);
						}
					}
				}
			}

			this.field4439 = var4[32] + var10[32];
		}

	}

	public int method7144(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field4434[class101.method2623(var1) & 255];
	}

	public int method7145(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = class372.method5513(var7.substring(4));
										var4 += field4442[var8].field5079;
										var3 = -1;
									} catch (Exception var9) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.field4434[(char)(class101.method2623(var6) & 255)];
						if (this.field4436 != null && var3 != -1) {
							var4 += this.field4436[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public int method7191(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.method7144('<');
							if (this.field4436 != null && var11 != -1) {
								var4 += this.field4436[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method7144('>');
							if (this.field4436 != null && var11 != -1) {
								var4 += this.field4436[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class372.method5513(var16.substring(4));
								var4 += field4442[var17].field5079;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method7144(var15);
							if (this.field4436 != null && var11 != -1) {
								var4 += this.field4436[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var19 = var6.toString();
			if (var19.length() > var5) {
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12;
		}
	}

	public int method7240(String var1, int var2) {
		int var3 = this.method7191(var1, new int[]{var2}, field4454);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method7145(field4454[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	public int method7198(String var1, int var2) {
		return this.method7191(var1, new int[]{var2}, field4454);
	}

	public class421 method7150(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method7145(var3) / 2;
			var6 += this.method7145(var3.substring(0, var1));
			int var7 = var5 - this.field4440;
			int var8 = this.method7145(var3.substring(var1, var1 + var2));
			int var9 = this.field4440 + this.field4441;
			return new class421(var6, var7, var8, var9);
		} else {
			return new class421(var4, var5, 0, 0);
		}
	}

	public void method7228(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method7147(var4, var5);
			this.method7165(var1, var2, var3);
		}
	}

	public void method7141(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method7147(var4, var5);
			field4437 = var6;
			this.method7165(var1, var2, var3);
		}
	}

	public void method7153(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method7147(var4, var5);
			this.method7165(var1, var2 - this.method7145(var1), var3);
		}
	}

	public void method7154(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method7147(var4, var5);
			this.method7165(var1, var2 - this.method7145(var1) / 2, var3);
		}
	}

	public int method7155(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method7156(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	public int method7156(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.method7147(var6, var7);
			field4437 = var8;
			if (var11 == 0) {
				var11 = this.field4439;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.field4440 + this.field4441 + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.method7191(var1, var12, field4454);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.field4440;
			} else if (var10 == 1) {
				var14 = var3 + this.field4440 + (var5 - this.field4440 - this.field4441 - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.field4441 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field4440 - this.field4441 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.field4440 + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method7165(field4454[var15], var2, var14);
				} else if (var9 == 1) {
					this.method7165(field4454[var15], var2 + (var4 - this.method7145(field4454[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method7165(field4454[var15], var2 + var4 - this.method7145(field4454[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.method7165(field4454[var15], var2, var14);
				} else {
					this.method7195(field4454[var15], var4);
					this.method7165(field4454[var15], var2, var14);
					field4432 = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	public class462 method7157(class384 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method7255()) {
			this.method7147(var4, var5);
			var3 -= this.field4439;

			for (int var7 = 0; var7 < var1.method7256(); ++var7) {
				class382 var8 = var1.method7257(var7);
				if (var6 != -1 && var8.field4431 > var6) {
					return new class462(var8.field4428, var8.field4431);
				}

				char var9 = var8.field4429;
				if (var9 != '\n') {
					if (var1.method7258(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field4428;
						int var11 = var3 + var8.field4431;
						int var12 = this.field4435[var9];
						int var13 = this.field4446[var9];
						if (field4447 != -1) {
							this.method7167(this.field4433[var9], var10 + this.field4443[var9] + 1, var11 + this.field4438[var9] + 1, var12, var13, field4447);
						}

						this.method7167(this.field4433[var9], var10 + this.field4443[var9], var11 + this.field4438[var9], var12, var13, field4449);
					}
				}
			}
		}

		return var1.method7254();
	}

	public void method7158(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method7147(var4, var5);
			int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7175(var1, var2 - this.method7145(var1) / 2, var3, (int[])null, var7);
		}
	}

	public void method7159(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method7147(var4, var5);
			int[] var7 = new int[var1.length()];
			int[] var8 = new int[var1.length()];

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7175(var1, var2 - this.method7145(var1) / 2, var3, var7, var8);
		}
	}

	public void method7160(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			this.method7147(var4, var5);
			double var8 = 7.0D - (double)var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.method7175(var1, var2 - this.method7145(var1) / 2, var3, (int[])null, var10);
		}
	}

	public void method7194(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method7147(var4, var5);
			field4453.setSeed((long)var6);
			field4437 = 192 + (field4453.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field4453.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method7175(var1, var2, var3, var7, (int[])null);
		}
	}

	void method7147(int var1, int var2) {
		field4452 = -1;
		field4445 = -1;
		field4444 = var2;
		field4447 = var2;
		field4448 = var1;
		field4449 = var1;
		field4437 = 256;
		field4432 = 0;
		field4451 = 0;
	}

	void method7238(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = class74.method2066(var3, 16, true);
				field4449 = var2;
			} else if (var1.equals("/col")) {
				field4449 = field4448;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = class74.method2066(var3, 16, true);
				field4452 = var2;
			} else if (var1.equals("str")) {
				field4452 = 8388608;
			} else if (var1.equals("/str")) {
				field4452 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = class74.method2066(var3, 16, true);
				field4445 = var2;
			} else if (var1.equals("u")) {
				field4445 = 0;
			} else if (var1.equals("/u")) {
				field4445 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = class74.method2066(var3, 16, true);
				field4447 = var2;
			} else if (var1.equals("shad")) {
				field4447 = 0;
			} else if (var1.equals("/shad")) {
				field4447 = field4444;
			} else if (var1.equals("br")) {
				this.method7147(field4448, field4444);
			}
		} catch (Exception var4) {
		}

	}

	void method7195(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				++var3;
			}
		}

		if (var3 > 0) {
			field4432 = (var2 - this.method7145(var1) << 8) / var3;
		}

	}

	void method7165(String var1, int var2, int var3) {
		var3 -= this.field4439;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class101.method2623(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										var9 = class372.method5513(var8.substring(4));
										class502 var13 = field4442[var9];
										var13.method9072(var2, var3 + this.field4439 - var13.field5085);
										var2 += var13.field5079;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method7238(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.field4436 != null && var5 != -1) {
							var2 += this.field4436[(var5 << 8) + var7];
						}

						int var12 = this.field4435[var7];
						var9 = this.field4446[var7];
						if (var7 != ' ') {
							if (field4437 == 256) {
								if (field4447 != -1) {
									method7169(this.field4433[var7], var2 + this.field4443[var7] + 1, var3 + this.field4438[var7] + 1, var12, var9, field4447);
								}

								this.method7167(this.field4433[var7], var2 + this.field4443[var7], var3 + this.field4438[var7], var12, var9, field4449);
							} else {
								if (field4447 != -1) {
									method7171(this.field4433[var7], var2 + this.field4443[var7] + 1, var3 + this.field4438[var7] + 1, var12, var9, field4447, field4437);
								}

								this.method7236(this.field4433[var7], var2 + this.field4443[var7], var3 + this.field4438[var7], var12, var9, field4449, field4437);
							}
						} else if (field4432 > 0) {
							field4451 += field4432;
							var2 += field4451 >> 8;
							field4451 &= 255;
						}

						int var10 = this.field4434[var7];
						if (field4452 != -1) {
							method8995(var2, var3 + (int)((double)this.field4439 * 0.7D), var10, field4452);
						}

						if (field4445 != -1) {
							method8995(var2, var3 + this.field4439 + 1, var10, field4445);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	void method7175(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.field4439;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char)(class101.method2623(var1.charAt(var9)) & 255);
				if (var10 == '<') {
					var6 = var9;
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) {
						String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt")) {
							var10 = '<';
						} else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img=")) {
									try {
										if (var4 != null) {
											var12 = var4[var8];
										} else {
											var12 = 0;
										}

										if (var5 != null) {
											var13 = var5[var8];
										} else {
											var13 = 0;
										}

										++var8;
										var14 = class372.method5513(var11.substring(4));
										class502 var18 = field4442[var14];
										var18.method9072(var2 + var12, var3 + this.field4439 - var18.field5085 + var13);
										var2 += var18.field5079;
										var7 = -1;
									} catch (Exception var16) {
									}
								} else {
									this.method7238(var11);
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) {
						var10 = ' ';
					}

					if (var6 == -1) {
						if (this.field4436 != null && var7 != -1) {
							var2 += this.field4436[(var7 << 8) + var10];
						}

						int var17 = this.field4435[var10];
						var12 = this.field4446[var10];
						if (var4 != null) {
							var13 = var4[var8];
						} else {
							var13 = 0;
						}

						if (var5 != null) {
							var14 = var5[var8];
						} else {
							var14 = 0;
						}

						++var8;
						if (var10 != ' ') {
							if (field4437 == 256) {
								if (field4447 != -1) {
									method7169(this.field4433[var10], var2 + this.field4443[var10] + 1 + var13, var3 + this.field4438[var10] + 1 + var14, var17, var12, field4447);
								}

								this.method7167(this.field4433[var10], var2 + this.field4443[var10] + var13, var3 + this.field4438[var10] + var14, var17, var12, field4449);
							} else {
								if (field4447 != -1) {
									method7171(this.field4433[var10], var2 + this.field4443[var10] + 1 + var13, var3 + this.field4438[var10] + 1 + var14, var17, var12, field4447, field4437);
								}

								this.method7236(this.field4433[var10], var2 + this.field4443[var10] + var13, var3 + this.field4438[var10] + var14, var17, var12, field4449, field4437);
							}
						} else if (field4432 > 0) {
							field4451 += field4432;
							var2 += field4451 >> 8;
							field4451 &= 255;
						}

						int var15 = this.field4434[var10];
						if (field4452 != -1) {
							method8995(var2, var3 + (int)((double)this.field4439 * 0.7D), var15, field4452);
						}

						if (field4445 != -1) {
							method8995(var2, var3 + this.field4439, var15, field4445);
						}

						var2 += var15;
						var7 = var10;
					}
				}
			}
		}

	}

	static int method7239(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	public static String method7246(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; ++var7) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	static void method7169(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class238.field5061;
		int var7 = class238.field5061 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class499.field5065) {
			var10 = class499.field5065 - var2;
			var4 -= var10;
			var2 = class499.field5065;
			var9 += var10 * var3;
			var6 += var10 * class238.field5061;
		}

		if (var2 + var4 > class499.field5066) {
			var4 -= var2 + var4 - class499.field5066;
		}

		if (var1 < class499.field5064) {
			var10 = class499.field5064 - var1;
			var3 -= var10;
			var1 = class499.field5064;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var1 + var3 > class499.field5068) {
			var10 = var1 + var3 - class499.field5068;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method7170(class238.field5067, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	static void method7170(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method7171(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class238.field5061;
		int var8 = class238.field5061 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class499.field5065) {
			var11 = class499.field5065 - var2;
			var4 -= var11;
			var2 = class499.field5065;
			var10 += var11 * var3;
			var7 += var11 * class238.field5061;
		}

		if (var2 + var4 > class499.field5066) {
			var4 -= var2 + var4 - class499.field5066;
		}

		if (var1 < class499.field5064) {
			var11 = class499.field5064 - var1;
			var3 -= var11;
			var1 = class499.field5064;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var1 + var3 > class499.field5068) {
			var11 = var1 + var3 - class499.field5068;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method7172(class238.field5067, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	static void method7172(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
