import java.util.zip.CRC32;

public class class342 extends class344 {
	static CRC32 field4213;
	boolean field4206;
	boolean field4212;
	class418 field4203;
	class418 field4211;
	int field4202;
	int field4204;
	int field4208;
	int field4209;
	volatile boolean[] field4207;
	volatile int field4205;

	static {
		field4213 = new CRC32();
	}

	public class342(class418 var1, class418 var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.field4205 = 0;
		this.field4206 = false;
		this.field4208 = -1;
		this.field4212 = false;
		this.field4203 = var1;
		this.field4211 = var2;
		this.field4204 = var3;
		this.field4206 = var6;
		this.field4212 = var7;
		int var9 = this.field4204;
		if (this.field4212) {
			if (var9 <= class345.field4239) {
				throw new RuntimeException("");
			}

			if (var9 < class345.field4258) {
				class345.field4258 = var9;
			}
		} else {
			if (var9 >= class345.field4258) {
				throw new RuntimeException("");
			}

			if (var9 > class345.field4239) {
				class345.field4239 = var9;
			}
		}

		if (null != class345.field929) {
			class345.field929.field4989 = var9 * 8 + 5;
			if (class345.field929.field4989 >= class345.field929.field4991.length) {
				if (!this.field4212) {
					throw new RuntimeException("");
				}

				this.method6417();
			} else {
				int var10 = class345.field929.method8664();
				int var11 = class345.field929.method8664();
				this.method6396(var10, var11);
			}
		} else {
			class61.method1203((class342)null, 255, 255, 0, (byte)0, true);
			class345.field4240[var9] = this;
		}

	}

	public boolean method6391() {
		return 1 == this.field4205;
	}

	public int method6392() {
		if (this.field4205 == 1 || this.field4212 && this.field4205 == 2) {
			return 100;
		} else if (super.field4231 != null) {
			return 99;
		} else {
			int var2 = class21.method306(255, this.field4204);
			if (var2 >= 100) {
				var2 = 99;
			}

			return var2;
		}
	}

	void method6503(int var1) {
		int var3 = this.field4204;
		long var4 = (long)(var1 + (var3 << 16));
		class343 var6 = (class343)class345.field4247.method8381(var4);
		if (null != var6) {
			class345.field4246.method6707(var6);
		}

	}

	void method6456(int var1) {
		if (null != this.field4203 && null != this.field4207 && this.field4207[var1]) {
			class418 var3 = this.field4203;
			byte[] var5 = null;
			class363 var6;
			synchronized(var6 = class341.field4196){}

			for (class340 var7 = (class340)class341.field4196.method6716(); null != var7; var7 = (class340)class341.field4196.method6725()) {
				if (var7.field4745 == (long)var1 && var7.field4192 == var3 && 0 == var7.field4190) {
					var5 = var7.field4191;
					break;
				}
			}

			if (null != var5) {
				this.method6398(var3, var1, var5, true);
			} else {
				byte[] var9 = var3.method7772(var1);
				this.method6398(var3, var1, var9, true);
			}
		} else {
			class61.method1203(this, this.field4204, var1, super.field4225[var1], (byte)2, true);
		}

	}

	void method6417() {
		this.field4205 = 2;
		super.field4232 = new int[0];
		super.field4225 = new int[0];
		super.field4228 = new int[0];
		super.field4227 = new int[0];
		super.field4222 = new int[0][];
		super.field4231 = new Object[0];
		super.field4234 = new Object[0][];
	}

	void method6396(int var1, int var2) {
		this.field4209 = var1;
		this.field4202 = var2;
		if (this.field4211 != null) {
			int var4 = this.field4204;
			class418 var5 = this.field4211;
			byte[] var7 = null;
			class363 var8;
			synchronized(var8 = class341.field4196){}

			for (class340 var9 = (class340)class341.field4196.method6716(); var9 != null; var9 = (class340)class341.field4196.method6725()) {
				if (var9.field4745 == (long)var4 && var9.field4192 == var5 && 0 == var9.field4190) {
					var7 = var9.field4191;
					break;
				}
			}

			if (null != var7) {
				this.method6398(var5, var4, var7, true);
			} else {
				byte[] var11 = var5.method7772(var4);
				this.method6398(var5, var4, var11, true);
			}
		} else {
			class61.method1203(this, 255, this.field4204, this.field4209, (byte)0, true);
		}

	}

	void method6397(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4205 == 1) {
				throw new RuntimeException();
			}

			if (this.field4211 != null) {
				class341.method1985(this.field4204, var2, this.field4211);
			}

			this.method6444(var2);
			this.method6401();
		} else {
			var2[var2.length - 2] = (byte)(super.field4228[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field4228[var1];
			if (this.field4203 != null) {
				class341.method1985(var1, var2, this.field4203);
				this.field4207[var1] = true;
			}

			if (var4) {
				super.field4231[var1] = class321.method2790(var2, false);
			}
		}

	}

	public void method6398(class418 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (this.field4211 == var1) {
			if (this.field4205 == 1) {
				throw new RuntimeException();
			} else if (null == var3) {
				class61.method1203(this, 255, this.field4204, this.field4209, (byte)0, true);
			} else {
				field4213.reset();
				field4213.update(var3, 0, var3.length);
				var6 = (int)field4213.getValue();
				if (var6 != this.field4209) {
					class61.method1203(this, 255, this.field4204, this.field4209, (byte)0, true);
				} else {
					class489 var10 = new class489(class14.method177(var3));
					int var8 = var10.method8658();
					if (var8 != 5 && var8 != 6) {
						throw new RuntimeException(var8 + "," + this.field4204 + "," + var2);
					} else {
						int var9 = 0;
						if (var8 >= 6) {
							var9 = var10.method8664();
						}

						if (var9 != this.field4202) {
							class61.method1203(this, 255, this.field4204, this.field4209, (byte)0, true);
						} else {
							this.method6444(var3);
							this.method6401();
						}
					}
				}
			}
		} else {
			if (!var4 && this.field4208 == var2) {
				this.field4205 = 1;
			}

			if (var3 != null && var3.length > 2) {
				field4213.reset();
				field4213.update(var3, 0, var3.length - 2);
				var6 = (int)field4213.getValue();
				int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (super.field4225[var2] == var6 && var7 == super.field4228[var2]) {
					this.field4207[var2] = true;
					if (var4) {
						super.field4231[var2] = class321.method2790(var3, false);
					}

				} else {
					this.field4207[var2] = false;
					if (this.field4206 || var4) {
						class61.method1203(this, this.field4204, var2, super.field4225[var2], (byte)2, var4);
					}

				}
			} else {
				this.field4207[var2] = false;
				if (this.field4206 || var4) {
					class61.method1203(this, this.field4204, var2, super.field4225[var2], (byte)2, var4);
				}

			}
		}
	}

	void method6401() {
		this.field4207 = new boolean[super.field4231.length];

		int var2;
		for (var2 = 0; var2 < this.field4207.length; ++var2) {
			this.field4207[var2] = false;
		}

		if (null == this.field4203) {
			this.field4205 = 1;
		} else {
			this.field4208 = -1;

			for (var2 = 0; var2 < this.field4207.length; ++var2) {
				if (super.field4227[var2] > 0) {
					class341.method4777(var2, this.field4203, this);
					this.field4208 = var2;
				}
			}

			if (this.field4208 == -1) {
				this.field4205 = 1;
			}

		}
	}

	int method6452(int var1) {
		if (super.field4231[var1] != null) {
			return 100;
		} else {
			return this.field4207[var1] ? 100 : class21.method306(this.field4204, var1);
		}
	}

	public boolean method6406(int var1) {
		return this.field4207[var1];
	}

	public boolean method6402(int var1) {
		return this.method6449(var1) != null;
	}

	public int method6423() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field4231.length; ++var4) {
			if (super.field4227[var4] > 0) {
				var2 += 100;
				var3 += this.method6452(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}

	static int method6433(char var0, class359 var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == class359.field4322) {
			var3 = 1762;
		}

		return var3;
	}
}
