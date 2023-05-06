import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class151 {
	boolean field1711;
	boolean field1722;
	class464 field1720;
	int field1713;
	int field1715;
	int[] field1724;
	int[] field1727;
	long field1730;
	long[] field1717;
	long[] field1731;
	public boolean field1716;
	public boolean[] field1735;
	public byte field1710;
	public byte field1718;
	public byte field1719;
	public byte field1729;
	public byte[] field1723;
	public int field1712;
	public int field1721;
	public int field1728;
	public int field1734;
	public int[] field1726;
	public String field1714;
	public String[] field1732;
	public String[] field1733;

	public class151(class489 var1) {
		this.field1713 = 0;
		this.field1714 = null;
		this.field1715 = 0;
		this.field1728 = -1;
		this.field1734 = -1;
		this.method3226(var1);
	}

	void method3242(int var1) {
		if (this.field1722) {
			if (null != this.field1717) {
				System.arraycopy(this.field1717, 0, this.field1717 = new long[var1], 0, this.field1721);
			} else {
				this.field1717 = new long[var1];
			}
		}

		if (this.field1711) {
			if (null != this.field1732) {
				System.arraycopy(this.field1732, 0, this.field1732 = new String[var1], 0, this.field1721);
			} else {
				this.field1732 = new String[var1];
			}
		}

		if (null != this.field1723) {
			System.arraycopy(this.field1723, 0, this.field1723 = new byte[var1], 0, this.field1721);
		} else {
			this.field1723 = new byte[var1];
		}

		if (null != this.field1727) {
			System.arraycopy(this.field1727, 0, this.field1727 = new int[var1], 0, this.field1721);
		} else {
			this.field1727 = new int[var1];
		}

		if (this.field1726 != null) {
			System.arraycopy(this.field1726, 0, this.field1726 = new int[var1], 0, this.field1721);
		} else {
			this.field1726 = new int[var1];
		}

		if (null != this.field1735) {
			System.arraycopy(this.field1735, 0, this.field1735 = new boolean[var1], 0, this.field1721);
		} else {
			this.field1735 = new boolean[var1];
		}

	}

	void method3211(int var1) {
		if (this.field1722) {
			if (this.field1731 != null) {
				System.arraycopy(this.field1731, 0, this.field1731 = new long[var1], 0, this.field1712);
			} else {
				this.field1731 = new long[var1];
			}
		}

		if (this.field1711) {
			if (this.field1733 != null) {
				System.arraycopy(this.field1733, 0, this.field1733 = new String[var1], 0, this.field1712);
			} else {
				this.field1733 = new String[var1];
			}
		}

	}

	public int method3209(String var1) {
		if (null != var1 && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field1721; ++var3) {
				if (this.field1732[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	public int method3210(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1727[var1] & var5) >>> var2;
	}

	public Integer method3260(int var1) {
		if (null == this.field1720) {
			return null;
		} else {
			class449 var3 = this.field1720.method8360((long)var1);
			return var3 != null && var3 instanceof class448 ? new Integer(((class448)var3).field4744) : null;
		}
	}

	public int[] method3212() {
		if (null == this.field1724) {
			String[] var2 = new String[this.field1721];
			this.field1724 = new int[this.field1721];

			for (int var3 = 0; var3 < this.field1721; this.field1724[var3] = var3++) {
				var2[var3] = this.field1732[var3];
				if (null != var2[var3]) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			int[] var4 = this.field1724;
			class486.method3149(var2, var4, 0, var2.length - 1);
		}

		return this.field1724;
	}

	void method3206(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field1722) {
			throw new RuntimeException("");
		} else if (this.field1711 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (null == this.field1717 || this.field1721 >= this.field1717.length) || null != var3 && (this.field1732 == null || this.field1721 >= this.field1732.length)) {
				this.method3242(5 + this.field1721);
			}

			if (null != this.field1717) {
				this.field1717[this.field1721] = var1;
			}

			if (null != this.field1732) {
				this.field1732[this.field1721] = var3;
			}

			if (-1 == this.field1728) {
				this.field1728 = this.field1721;
				this.field1723[this.field1721] = 126;
			} else {
				this.field1723[this.field1721] = 0;
			}

			this.field1727[this.field1721] = 0;
			this.field1726[this.field1721] = var4;
			this.field1735[this.field1721] = false;
			++this.field1721;
			this.field1724 = null;
		}
	}

	void method3214(int var1) {
		if (var1 >= 0 && var1 < this.field1721) {
			--this.field1721;
			this.field1724 = null;
			if (0 == this.field1721) {
				this.field1717 = null;
				this.field1732 = null;
				this.field1723 = null;
				this.field1727 = null;
				this.field1726 = null;
				this.field1735 = null;
				this.field1728 = -1;
				this.field1734 = -1;
			} else {
				System.arraycopy(this.field1723, var1 + 1, this.field1723, var1, this.field1721 - var1);
				System.arraycopy(this.field1727, var1 + 1, this.field1727, var1, this.field1721 - var1);
				System.arraycopy(this.field1726, var1 + 1, this.field1726, var1, this.field1721 - var1);
				System.arraycopy(this.field1735, var1 + 1, this.field1735, var1, this.field1721 - var1);
				if (this.field1717 != null) {
					System.arraycopy(this.field1717, var1 + 1, this.field1717, var1, this.field1721 - var1);
				}

				if (null != this.field1732) {
					System.arraycopy(this.field1732, var1 + 1, this.field1732, var1, this.field1721 - var1);
				}

				this.method3215();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method3215() {
		if (this.field1721 == 0) {
			this.field1728 = -1;
			this.field1734 = -1;
		} else {
			this.field1728 = -1;
			this.field1734 = -1;
			int var2 = 0;
			byte var3 = this.field1723[0];

			for (int var4 = 1; var4 < this.field1721; ++var4) {
				if (this.field1723[var4] > var3) {
					if (var3 == 125) {
						this.field1734 = var2;
					}

					var2 = var4;
					var3 = this.field1723[var4];
				} else if (this.field1734 == -1 && this.field1723[var4] == 125) {
					this.field1734 = var4;
				}
			}

			this.field1728 = var2;
			if (this.field1728 != -1) {
				this.field1723[this.field1728] = 126;
			}

		}
	}

	void method3216(long var1, String var3) {
		if (null != var3 && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field1722) {
			throw new RuntimeException("");
		} else if (null != var3 != this.field1711) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (null == this.field1731 || this.field1712 >= this.field1731.length) || var3 != null && (this.field1733 == null || this.field1712 >= this.field1733.length)) {
				this.method3211(this.field1712 + 5);
			}

			if (this.field1731 != null) {
				this.field1731[this.field1712] = var1;
			}

			if (this.field1733 != null) {
				this.field1733[this.field1712] = var3;
			}

			++this.field1712;
		}
	}

	void method3217(int var1) {
		--this.field1712;
		if (this.field1712 == 0) {
			this.field1731 = null;
			this.field1733 = null;
		} else {
			if (this.field1731 != null) {
				System.arraycopy(this.field1731, var1 + 1, this.field1731, var1, this.field1712 - var1);
			}

			if (null != this.field1733) {
				System.arraycopy(this.field1733, var1 + 1, this.field1733, var1, this.field1712 - var1);
			}
		}

	}

	int method3231(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.field1728 != var1 || this.field1734 != -1 && this.field1723[this.field1734] >= 125) {
				if (this.field1723[var1] == var2) {
					return -1;
				} else {
					this.field1723[var1] = var2;
					this.method3215();
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	boolean method3208(int var1, byte var2) {
		if (this.field1728 != var1) {
			if (var2 != -1) {
				throw new IllegalStateException();
			}

			if (this.field1723[var1] != 126) {
				this.field1723[this.field1728] = 125;
				this.field1734 = this.field1728;
				this.field1723[var1] = 126;
				this.field1728 = var1;
				return true;
			}
		}

		return false;
	}

	int method3220(int var1, boolean var2) {
		if (var2 == this.field1735[var1]) {
			return -1;
		} else {
			this.field1735[var1] = var2;
			return var1;
		}
	}

	int method3230(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field1727[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field1727[var1] = var9 | var2;
			return var1;
		}
	}

	boolean method3222(int var1, int var2) {
		if (this.field1720 != null) {
			class449 var4 = this.field1720.method8360((long)var1);
			if (var4 != null) {
				if (var4 instanceof class448) {
					class448 var5 = (class448)var4;
					if (var2 == var5.field4744) {
						return false;
					}

					var5.field4744 = var2;
					return true;
				}

				var4.method8051();
			}
		} else {
			this.field1720 = new class464(4);
		}

		this.field1720.method8361(new class448(var2), (long)var1);
		return true;
	}

	boolean method3223(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (null != this.field1720) {
			class449 var9 = this.field1720.method8360((long)var1);
			if (var9 != null) {
				if (var9 instanceof class448) {
					class448 var10 = (class448)var9;
					if ((var10.field4744 & var8) == var2) {
						return false;
					}

					var10.field4744 &= ~var8;
					var10.field4744 |= var2;
					return true;
				}

				var9.method8051();
			}
		} else {
			this.field1720 = new class464(4);
		}

		this.field1720.method8361(new class448(var2), (long)var1);
		return true;
	}

	boolean method3219(int var1, long var2) {
		if (null != this.field1720) {
			class449 var4 = this.field1720.method8360((long)var1);
			if (null != var4) {
				if (var4 instanceof class447) {
					class447 var5 = (class447)var4;
					if (var2 == var5.field4743) {
						return false;
					}

					var5.field4743 = var2;
					return true;
				}

				var4.method8051();
			}
		} else {
			this.field1720 = new class464(4);
		}

		this.field1720.method8361(new class447(var2), (long)var1);
		return true;
	}

	boolean method3225(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (null != this.field1720) {
			class449 var4 = this.field1720.method8360((long)var1);
			if (null != var4) {
				if (var4 instanceof class445) {
					class445 var5 = (class445)var4;
					if (var5.field4741 instanceof String) {
						if (var2.equals(var5.field4741)) {
							return false;
						}

						var5.method8051();
						this.field1720.method8361(new class445(var2), var5.field4745);
						return true;
					}
				}

				var4.method8051();
			}
		} else {
			this.field1720 = new class464(4);
		}

		this.field1720.method8361(new class445(var2), (long)var1);
		return true;
	}

	void method3226(class489 var1) {
		int var3 = var1.method8658();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method8658();
			if ((var4 & 1) != 0) {
				this.field1722 = true;
			}

			if (0 != (var4 & 2)) {
				this.field1711 = true;
			}

			if (!this.field1722) {
				this.field1717 = null;
				this.field1731 = null;
			}

			if (!this.field1711) {
				this.field1732 = null;
				this.field1733 = null;
			}

			this.field1713 = var1.method8664();
			this.field1715 = var1.method8664();
			if (var3 <= 3 && this.field1715 != 0) {
				this.field1715 += 16912800;
			}

			this.field1721 = var1.method8660();
			this.field1712 = var1.method8658();
			this.field1714 = var1.method8669();
			if (var3 >= 4) {
				var1.method8664();
			}

			this.field1716 = var1.method8658() == 1;
			this.field1729 = var1.method8659();
			this.field1718 = var1.method8659();
			this.field1719 = var1.method8659();
			this.field1710 = var1.method8659();
			int var5;
			if (this.field1721 > 0) {
				if (this.field1722 && (this.field1717 == null || this.field1717.length < this.field1721)) {
					this.field1717 = new long[this.field1721];
				}

				if (this.field1711 && (null == this.field1732 || this.field1732.length < this.field1721)) {
					this.field1732 = new String[this.field1721];
				}

				if (this.field1723 == null || this.field1723.length < this.field1721) {
					this.field1723 = new byte[this.field1721];
				}

				if (this.field1727 == null || this.field1727.length < this.field1721) {
					this.field1727 = new int[this.field1721];
				}

				if (null == this.field1726 || this.field1726.length < this.field1721) {
					this.field1726 = new int[this.field1721];
				}

				if (null == this.field1735 || this.field1735.length < this.field1721) {
					this.field1735 = new boolean[this.field1721];
				}

				for (var5 = 0; var5 < this.field1721; ++var5) {
					if (this.field1722) {
						this.field1717[var5] = var1.method8681();
					}

					if (this.field1711) {
						this.field1732[var5] = var1.method8715();
					}

					this.field1723[var5] = var1.method8659();
					if (var3 >= 2) {
						this.field1727[var5] = var1.method8664();
					}

					if (var3 >= 5) {
						this.field1726[var5] = var1.method8660();
					} else {
						this.field1726[var5] = 0;
					}

					if (var3 >= 6) {
						this.field1735[var5] = var1.method8658() == 1;
					} else {
						this.field1735[var5] = false;
					}
				}

				this.method3215();
			}

			if (this.field1712 > 0) {
				if (this.field1722 && (null == this.field1731 || this.field1731.length < this.field1712)) {
					this.field1731 = new long[this.field1712];
				}

				if (this.field1711 && (this.field1733 == null || this.field1733.length < this.field1712)) {
					this.field1733 = new String[this.field1712];
				}

				for (var5 = 0; var5 < this.field1712; ++var5) {
					if (this.field1722) {
						this.field1731[var5] = var1.method8681();
					}

					if (this.field1711) {
						this.field1733[var5] = var1.method8715();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.method8660();
				if (var5 > 0) {
					this.field1720 = new class464(var5 < 16 ? class296.method1988(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.method8664();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method8664();
							this.field1720.method8361(new class448(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.method8681();
							this.field1720.method8361(new class447(var11), (long)var7);
						} else if (var8 == 2) {
							String var12 = var1.method8669();
							this.field1720.method8361(new class445(var12), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}

	static boolean method3262(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	public static File method3263(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		class170.field1832 = new File(Client.field2000, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		class489 var9;
		int var12;
		File var23;
		if (class170.field1832.exists()) {
			try {
				class471 var8 = new class471(class170.field1832, "rw", 10000L);

				int var10;
				for (var9 = new class489((int)var8.method8422()); var9.field4989 < var9.field4991.length; var9.field4989 += var10) {
					var10 = var8.method8423(var9.field4991, var9.field4989, var9.field4991.length - var9.field4989);
					if (var10 == -1) {
						throw new IOException();
					}
				}

				var9.field4989 = 0;
				var10 = var9.method8658();
				if (var10 < 1 || var10 > 3) {
					throw new IOException("" + var10);
				}

				int var11 = 0;
				if (var10 > 1) {
					var11 = var9.method8658();
				}

				if (var10 <= 2) {
					var5 = var9.method8670();
					if (var11 == 1) {
						var6 = var9.method8670();
					}
				} else {
					var5 = var9.method8638();
					if (var11 == 1) {
						var6 = var9.method8638();
					}
				}

				var8.method8417();
			} catch (IOException var20) {
				var20.printStackTrace();
			}

			if (var5 != null) {
				var23 = new File(var5);
				if (!var23.exists()) {
					var5 = null;
				}
			}

			if (var5 != null) {
				var23 = new File(var5, "test.dat");

				boolean var25;
				try {
					RandomAccessFile var28 = new RandomAccessFile(var23, "rw");
					var12 = var28.read();
					var28.seek(0L);
					var28.write(var12);
					var28.seek(0L);
					var28.close();
					var23.delete();
					var25 = true;
				} catch (Exception var18) {
					var25 = false;
				}

				if (!var25) {
					var5 = null;
				}
			}
		}

		if (var5 == null && var2 == 0) {
			label134:
			for (int var21 = 0; var21 < class170.field1292.length; ++var21) {
				for (int var24 = 0; var24 < class170.field1577.length; ++var24) {
					File var26 = new File(class170.field1577[var24] + class170.field1292[var21] + File.separatorChar + var0 + File.separatorChar);
					if (var26.exists()) {
						File var29 = new File(var26, "test.dat");

						boolean var31;
						try {
							RandomAccessFile var13 = new RandomAccessFile(var29, "rw");
							int var14 = var13.read();
							var13.seek(0L);
							var13.write(var14);
							var13.seek(0L);
							var13.close();
							var29.delete();
							var31 = true;
						} catch (Exception var17) {
							var31 = false;
						}

						if (var31) {
							var5 = var26.toString();
							var7 = true;
							break label134;
						}
					}
				}
			}
		}

		if (var5 == null) {
			var5 = Client.field2000 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var7 = true;
		}

		File var22;
		if (var6 != null) {
			var22 = new File(var6);
			var23 = new File(var5);

			try {
				File[] var27 = var22.listFiles();
				File[] var33 = var27;

				for (var12 = 0; var12 < var33.length; ++var12) {
					File var32 = var33[var12];
					File var35 = new File(var23, var32.getName());
					boolean var15 = var32.renameTo(var35);
					if (!var15) {
						throw new IOException();
					}
				}
			} catch (Exception var19) {
				var19.printStackTrace();
			}

			var7 = true;
		}

		if (var7) {
			var22 = new File(var5);
			var9 = null;

			try {
				class471 var30 = new class471(class170.field1832, "rw", 10000L);
				class489 var34 = new class489(500);
				var34.method8695(3);
				var34.method8695(null != var9 ? 1 : 0);
				var34.method8650(var22.getPath());
				if (var9 != null) {
					var34.method8650(null);
				}

				var30.method8433(var34.field4991, 0, var34.field4989);
				var30.method8417();
			} catch (IOException var16) {
				var16.printStackTrace();
			}
		}

		return new File(var5);
	}
}
