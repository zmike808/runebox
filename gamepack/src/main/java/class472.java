import java.io.EOFException;
import java.io.IOException;

public class class472 {
	byte[] field4926;
	byte[] field4929;
	class471 field4927;
	int field4925;
	int field4930;
	long field4928;
	long field4931;
	long field4932;
	long field4933;
	long field4934;
	long field4935;

	public class472(class471 var1, int var2, int var3) throws IOException {
		this.field4931 = -1L;
		this.field4928 = -1L;
		this.field4930 = 0;
		this.field4927 = var1;
		this.field4934 = this.field4933 = var1.method8422();
		this.field4926 = new byte[var2];
		this.field4929 = new byte[var3];
		this.field4932 = 0L;
	}

	public void method8436() throws IOException {
		this.method8439();
		this.field4927.method8417();
	}

	public void method8437(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field4932 = var1;
		}
	}

	public long method8448() {
		return this.field4934;
	}

	public void method8441(byte[] var1) throws IOException {
		this.method8440(var1, 0, var1.length);
	}

	public void method8440(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (this.field4928 != -1L && this.field4932 >= this.field4928 && this.field4932 + (long)var3 <= this.field4928 + (long)this.field4930) {
				System.arraycopy(this.field4929, (int)(this.field4932 - this.field4928), var1, var2, var3);
				this.field4932 += (long)var3;
				return;
			}

			long var5 = this.field4932;
			int var8 = var3;
			int var9;
			if (this.field4932 >= this.field4931 && this.field4932 < this.field4931 + (long)this.field4925) {
				var9 = (int)((long)this.field4925 - (this.field4932 - this.field4931));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field4926, (int)(this.field4932 - this.field4931), var1, var2, var9);
				this.field4932 += (long)var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.field4926.length) {
				this.field4927.method8418(this.field4932);

				for (this.field4935 = this.field4932; var3 > 0; var3 -= var9) {
					var9 = this.field4927.method8423(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field4935 += (long)var9;
					this.field4932 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method8445();
				var9 = var3;
				if (var3 > this.field4925) {
					var9 = this.field4925;
				}

				System.arraycopy(this.field4926, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field4932 += (long)var9;
			}

			if (this.field4928 != -1L) {
				if (this.field4928 > this.field4932 && var3 > 0) {
					var9 = (int)(this.field4928 - this.field4932) + var2;
					if (var9 > var3 + var2) {
						var9 = var3 + var2;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field4932;
					}
				}

				long var15 = -1L;
				long var11 = -1L;
				if (this.field4928 >= var5 && this.field4928 < var5 + (long)var8) {
					var15 = this.field4928;
				} else if (var5 >= this.field4928 && var5 < this.field4928 + (long)this.field4930) {
					var15 = var5;
				}

				if (this.field4928 + (long)this.field4930 > var5 && (long)this.field4930 + this.field4928 <= (long)var8 + var5) {
					var11 = this.field4928 + (long)this.field4930;
				} else if (var5 + (long)var8 > this.field4928 && var5 + (long)var8 <= (long)this.field4930 + this.field4928) {
					var11 = var5 + (long)var8;
				}

				if (var15 > -1L && var11 > var15) {
					int var13 = (int)(var11 - var15);
					System.arraycopy(this.field4929, (int)(var15 - this.field4928), var1, (int)(var15 - var5) + var2, var13);
					if (var11 > this.field4932) {
						var3 = (int)((long)var3 - (var11 - this.field4932));
						this.field4932 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field4935 = -1L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	void method8445() throws IOException {
		this.field4925 = 0;
		if (this.field4932 != this.field4935) {
			this.field4927.method8418(this.field4932);
			this.field4935 = this.field4932;
		}

		int var3;
		for (this.field4931 = this.field4932; this.field4925 < this.field4926.length; this.field4925 += var3) {
			int var2 = this.field4926.length - this.field4925;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field4927.method8423(this.field4926, this.field4925, var2);
			if (var3 == -1) {
				break;
			}

			this.field4935 += (long)var3;
		}

	}

	public void method8443(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (this.field4932 + (long)var3 > this.field4934) {
				this.field4934 = (long)var3 + this.field4932;
			}

			if (this.field4928 != -1L && (this.field4932 < this.field4928 || this.field4932 > this.field4928 + (long)this.field4930)) {
				this.method8439();
			}

			if (this.field4928 != -1L && (long)var3 + this.field4932 > this.field4928 + (long)this.field4929.length) {
				int var5 = (int)((long)this.field4929.length - (this.field4932 - this.field4928));
				System.arraycopy(var1, var2, this.field4929, (int)(this.field4932 - this.field4928), var5);
				this.field4932 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field4930 = this.field4929.length;
				this.method8439();
			}

			if (var3 <= this.field4929.length) {
				if (var3 > 0) {
					if (-1L == this.field4928) {
						this.field4928 = this.field4932;
					}

					System.arraycopy(var1, var2, this.field4929, (int)(this.field4932 - this.field4928), var3);
					this.field4932 += (long)var3;
					if (this.field4932 - this.field4928 > (long)this.field4930) {
						this.field4930 = (int)(this.field4932 - this.field4928);
					}

				}
			} else {
				if (this.field4935 != this.field4932) {
					this.field4927.method8418(this.field4932);
					this.field4935 = this.field4932;
				}

				this.field4927.method8433(var1, var2, var3);
				this.field4935 += (long)var3;
				if (this.field4935 > this.field4933) {
					this.field4933 = this.field4935;
				}

				long var11 = -1L;
				long var7 = -1L;
				if (this.field4932 >= this.field4931 && this.field4932 < (long)this.field4925 + this.field4931) {
					var11 = this.field4932;
				} else if (this.field4931 >= this.field4932 && this.field4931 < (long)var3 + this.field4932) {
					var11 = this.field4931;
				}

				if (this.field4932 + (long)var3 > this.field4931 && (long)var3 + this.field4932 <= (long)this.field4925 + this.field4931) {
					var7 = this.field4932 + (long)var3;
				} else if ((long)this.field4925 + this.field4931 > this.field4932 && this.field4931 + (long)this.field4925 <= this.field4932 + (long)var3) {
					var7 = this.field4931 + (long)this.field4925;
				}

				if (var11 > -1L && var7 > var11) {
					int var9 = (int)(var7 - var11);
					System.arraycopy(var1, (int)((long)var2 + var11 - this.field4932), this.field4926, (int)(var11 - this.field4931), var9);
				}

				this.field4932 += (long)var3;
			}
		} catch (IOException var10) {
			this.field4935 = -1L;
			throw var10;
		}
	}

	void method8439() throws IOException {
		if (this.field4928 != -1L) {
			if (this.field4935 != this.field4928) {
				this.field4927.method8418(this.field4928);
				this.field4935 = this.field4928;
			}

			this.field4927.method8433(this.field4929, 0, this.field4930);
			this.field4935 += (long)this.field4930;
			if (this.field4935 > this.field4933) {
				this.field4933 = this.field4935;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field4928 >= this.field4931 && this.field4928 < (long)this.field4925 + this.field4931) {
				var2 = this.field4928;
			} else if (this.field4931 >= this.field4928 && this.field4931 < (long)this.field4930 + this.field4928) {
				var2 = this.field4931;
			}

			if (this.field4928 + (long)this.field4930 > this.field4931 && (long)this.field4930 + this.field4928 <= (long)this.field4925 + this.field4931) {
				var4 = this.field4928 + (long)this.field4930;
			} else if (this.field4931 + (long)this.field4925 > this.field4928 && (long)this.field4925 + this.field4931 <= this.field4928 + (long)this.field4930) {
				var4 = (long)this.field4925 + this.field4931;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field4929, (int)(var2 - this.field4928), this.field4926, (int)(var2 - this.field4931), var6);
			}

			this.field4928 = -1L;
			this.field4930 = 0;
		}

	}
}
