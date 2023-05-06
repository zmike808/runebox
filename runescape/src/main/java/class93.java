public class class93 {
	class502[] field1225;
	int field1228;
	int field1234;
	int field1238;
	int field1240;
	int field1241;
	int field1246;
	int[] field1222;
	int[] field1227;
	int[] field1229;
	int[] field1230;
	int[] field1231;
	int[] field1232;
	int[] field1235;
	int[] field1237;
	int[] field1243;

	class93(class502[] var1) {
		this.field1227 = new int[256];
		this.field1228 = 0;
		this.field1246 = 0;
		this.field1234 = 0;
		this.field1241 = 0;
		this.field1240 = 0;
		this.field1238 = 0;
		this.field1225 = var1;
		this.method2353();
	}

	void method2353() {
		this.field1243 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1243[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1243[var2 + 64] = 16711680 + var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1243[var2 + 128] = var2 * 4 + 16776960;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1243[var2 + 192] = 16777215;
		}

		this.field1231 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1231[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1231[var2 + 64] = var2 * 4 + 65280;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1231[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1231[var2 + 192] = 16777215;
		}

		this.field1222 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1222[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1222[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1222[var2 + 128] = 16711935 + var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1222[var2 + 192] = 16777215;
		}

		this.field1229 = new int[256];
		this.field1241 = 0;
		this.field1237 = new int[32768];
		this.field1232 = new int[32768];
		this.method2362((class502)null);
		this.field1235 = new int[32768];
		this.field1230 = new int[32768];
	}

	void method2386() {
		this.field1243 = null;
		this.field1231 = null;
		this.field1222 = null;
		this.field1229 = null;
		this.field1237 = null;
		this.field1232 = null;
		this.field1235 = null;
		this.field1230 = null;
		this.field1241 = 0;
		this.field1240 = 0;
	}

	void method2356(int var1, int var2) {
		if (this.field1235 == null) {
			this.method2353();
		}

		if (0 == this.field1238) {
			this.field1238 = var2;
		}

		int var4 = var2 - this.field1238;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field1238 = var2;
		if (var4 > 0) {
			this.method2360(var4);
		}

		this.method2359(var1);
	}

	final void method2360(int var1) {
		this.field1241 += var1 * 128;
		int var3;
		if (this.field1241 > this.field1237.length) {
			this.field1241 -= this.field1237.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method2362(this.field1225[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = 128 * (256 - var1);

		int var7;
		for (int var6 = 0; var6 < var5; ++var6) {
			var7 = this.field1235[var3 + var4] - this.field1237[this.field1241 + var3 & this.field1237.length - 1] * var1 / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field1235[var3++] = var7;
		}

		byte var16 = 10;
		var7 = 128 - var16;

		int var8;
		int var11;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;

			for (int var10 = 0; var10 < 128; ++var10) {
				var11 = (int)(Math.random() * 100.0D);
				if (var11 < 50 && var10 > var16 && var10 < var7) {
					this.field1235[var10 + var9] = 255;
				} else {
					this.field1235[var9 + var10] = 0;
				}
			}
		}

		if (this.field1246 > 0) {
			this.field1246 -= var1 * 4;
		}

		if (this.field1234 > 0) {
			this.field1234 -= var1 * 4;
		}

		if (0 == this.field1246 && 0 == this.field1234) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field1246 = 1024;
			}

			if (var8 == 1) {
				this.field1234 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field1227[var8] = this.field1227[var1 + var8];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field1227[var8] = (int)(Math.sin((double)this.field1228 / 14.0D) * 16.0D + Math.sin((double)this.field1228 / 15.0D) * 14.0D + Math.sin((double)this.field1228 / 16.0D) * 12.0D);
			++this.field1228;
		}

		this.field1240 += var1;
		var8 = ((Client.field602 & 1) + var1) / 2;
		if (var8 > 0) {
			short var17 = 128;
			byte var18 = 2;
			var11 = 128 - var18 - var18;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field1240 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)var11) + var18;
				var14 = (int)(Math.random() * (double)var17) + var17;
				this.field1235[var13 + (var14 << 7)] = 192;
			}

			this.field1240 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var8 + var15 < 128) {
						var13 += this.field1235[var14 + var15 + var8];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field1235[var15 + var14 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field1230[var15 + var14] = var13 / (var8 * 2 + 1);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field1230[var15 + var12 + var8 * 128];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field1230[var15 + var12 - 128 * (var8 + 1)];
					}

					if (var14 >= 0) {
						this.field1235[var12 + var15] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	final int method2354(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return ((var2 & 16711935) * var3 + (var1 & 16711935) * var5 & -16711936) + (var3 * (var2 & 65280) + var5 * (var1 & 65280) & 16711680) >> 8;
	}

	final void method2359(int var1) {
		int var3 = this.field1229.length;
		if (this.field1246 > 0) {
			this.method2364(this.field1246, this.field1231);
		} else if (this.field1234 > 0) {
			this.method2364(this.field1234, this.field1222);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field1229[var4] = this.field1243[var4];
			}
		}

		this.method2361(var1);
	}

	final void method2364(int var1, int[] var2) {
		int var4 = this.field1229.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field1229[var5] = this.method2354(this.field1243[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field1229[var5] = var2[var5];
			} else {
				this.field1229[var5] = this.method2354(var2[var5], this.field1243[var5], 256 - var1);
			}
		}

	}

	final void method2361(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = this.field1227[var4] * (256 - var4) / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= class35.field2381.field5069) {
				var8 = class35.field2381.field5069 - var6;
			}

			int var9 = var6 + (var4 + 8) * class35.field2381.field5069;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field1235[var3++];
				int var12 = var9 % class238.field5061;
				if (var11 != 0 && var12 >= class499.field5064 && var12 < class499.field5068) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field1229[var11];
					int var15 = class35.field2381.field5070[var9];
					class35.field2381.field5070[var9++] = -16777216 | (var13 * (var11 & 16711935) + var14 * (var15 & 16711935) & -16711936) + (var13 * (var11 & 65280) + var14 * (var15 & 65280) & 16711680) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	final void method2362(class502 var1) {
		int var3;
		for (var3 = 0; var3 < this.field1237.length; ++var3) {
			this.field1237[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1237[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field1232[var6] = (this.field1237[var6 + 128] + this.field1237[var6 - 128] + this.field1237[var6 - 1] + this.field1237[var6 + 1]) / 4;
				}
			}

			int[] var9 = this.field1237;
			this.field1237 = this.field1232;
			this.field1232 = var9;
		}

		if (null != var1) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field5082; ++var4) {
				for (var5 = 0; var5 < var1.field5081; ++var5) {
					if (var1.field5083[var3++] != 0) {
						var6 = var5 + 16 + var1.field5086;
						int var7 = var4 + 16 + var1.field5084;
						int var8 = var6 + (var7 << 7);
						this.field1237[var8] = 0;
					}
				}
			}
		}

	}

	static class124 method2368(int var0) {
		class124 var2 = (class124)class199.method3788(class124.method2698(), var0);
		if (null == var2) {
			var2 = class124.field1497;
		}

		return var2;
	}

	static int method2366(class488 var0) {
		int var2 = var0.method8607(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var0.method8607(5);
		} else if (var2 == 2) {
			var3 = var0.method8607(8);
		} else {
			var3 = var0.method8607(11);
		}

		return var3;
	}

	static int method2384(int var0, class75 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			class67.field836 -= 3;
			var4 = class67.field843[class67.field836];
			var5 = class67.field843[class67.field836 + 1];
			int var12 = class67.field843[class67.field836 + 2];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				class317 var7 = class166.method3349(var4);
				if (null == var7.field3707) {
					var7.field3707 = new class317[var12 + 1];
				}

				if (var7.field3707.length <= var12) {
					class317[] var8 = new class317[var12 + 1];

					for (int var9 = 0; var9 < var7.field3707.length; ++var9) {
						var8[var9] = var7.field3707[var9];
					}

					var7.field3707 = var8;
				}

				if (var12 > 0 && var7.field3707[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					class317 var13 = new class317();
					var13.field3598 = var5;
					var13.field3589 = var13.field3570 = var7.field3570;
					var13.field3571 = var12;
					var13.field3651 = true;
					if (var5 == 12) {
						var13.method6151();
						var13.method6152().method6018(new class101(var13));
						var13.method6152().method5892(new class102(var13));
					}

					var7.field3707[var12] = var13;
					if (var2) {
						class67.field329 = var13;
					} else {
						class67.field6 = var13;
					}

					Client.method3176(var7);
					return 1;
				}
			}
		} else {
			class317 var10;
			if (var0 == 101) {
				var10 = var2 ? class67.field329 : class67.field6;
				class317 var11 = class166.method3349(var10.field3570);
				var11.field3707[var10.field3571] = null;
				Client.method3176(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = class166.method3349(class67.field843[--class67.field836]);
				var10.field3707 = null;
				Client.method3176(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = class166.method3349(class67.field843[--class67.field836]);
					if (null != var10) {
						class67.field843[++class67.field836 - 1] = 1;
						if (var2) {
							class67.field329 = var10;
						} else {
							class67.field6 = var10;
						}
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class67.field836 -= 2;
				var4 = class67.field843[class67.field836];
				var5 = class67.field843[1 + class67.field836];
				class317 var6 = class317.method881(var4, var5);
				if (var6 != null && var5 != -1) {
					class67.field843[++class67.field836 - 1] = 1;
					if (var2) {
						class67.field329 = var6;
					} else {
						class67.field6 = var6;
					}
				} else {
					class67.field843[++class67.field836 - 1] = 0;
				}

				return 1;
			}
		}
	}
}
