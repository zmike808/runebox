import java.util.ArrayList;

public class class380 {
	boolean field4416;
	class383 field4410;
	int field4407;
	int field4412;
	int field4413;
	int field4414;
	int field4415;
	int field4419;
	int field4420;
	ArrayList field4418;

	public class380() {
		this.field4414 = Integer.MAX_VALUE;
		this.field4412 = Integer.MAX_VALUE;
		this.field4413 = 0;
		this.field4419 = 0;
		this.field4415 = 0;
		this.field4416 = true;
		this.field4418 = new ArrayList();
		this.field4407 = 0;
		this.field4420 = 0;
	}

	public class382 method7002(int var1) {
		return (class382)this.field4418.get(var1);
	}

	class382 method7032() {
		return this.field4418.size() == 0 ? null : (class382)this.field4418.get(this.field4418.size() - 1);
	}

	public boolean method7004() {
		return this.field4418.size() == 0;
	}

	boolean method7005() {
		return this.field4412 > 1;
	}

	public int method7006() {
		return this.field4418.size();
	}

	public String method7007() {
		if (this.method7004()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method7006());

			for (int var3 = 0; var3 < this.method7006(); ++var3) {
				class382 var4 = this.method7002(var3);
				var2.append(var4.field4429);
			}

			return var2.toString();
		}
	}

	public void method7062(int var1) {
		if (null != this.field4410 && var1 < 2 * this.field4410.field4439) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4414 != var1) {
			this.field4414 = var1;
			this.method7036();
		}

	}

	public void method7003(int var1) {
		if (var1 != this.field4412) {
			this.field4412 = var1;
			this.method7036();
		}

	}

	public void method7040(int var1) {
		if (var1 != this.field4420) {
			this.field4420 = var1;
			this.method7036();
		}

	}

	public void method7115(class383 var1) {
		if (var1 != this.field4410) {
			this.field4410 = var1;
			if (null != this.field4410) {
				if (this.field4415 == 0) {
					this.field4415 = this.field4410.field4439;
				}

				if (!this.method7004()) {
					this.method7036();
				}
			}
		}

	}

	public void method7012(int var1) {
		if (var1 != this.field4407) {
			this.field4407 = var1;
			this.method7036();
		}

	}

	public boolean method7013(int var1, int var2) {
		if (var1 != this.field4413 || var2 != this.field4419) {
			this.field4413 = var1;
			this.field4419 = var2;
			this.method7036();
		}

		return true;
	}

	public void method7014(int var1) {
		if (this.field4415 != var1) {
			this.field4415 = var1;
			this.method7036();
		}

	}

	public class384 method7083(int var1, int var2) {
		if (var1 == var2) {
			return new class384(this, 0, 0);
		} else if (var1 <= this.field4418.size() && var2 <= this.field4418.size()) {
			return var2 < var1 ? new class384(this, var2, var1) : new class384(this, var1, var2);
		} else {
			return new class384(this, 0, 0);
		}
	}

	public class381 method7049(char var1, int var2, int var3) {
		return this.method7017(Character.toString(var1), var2, var3);
	}

	public class381 method7017(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.field4418.size() >= var3) {
			this.method7037(var2, var2);
			return new class381(var2, true);
		} else {
			this.field4418.ensureCapacity(this.field4418.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.field4418.size() < var3; ++var6) {
				class382 var7 = new class382();
				var7.field4429 = var1.charAt(var6);
				this.field4418.add(var5, var7);
				++var5;
			}

			this.method7037(var2, var5);
			if (this.field4412 != 0 && this.method7028() > this.field4412) {
				while (var5 != var2) {
					--var5;
					this.method7021(var5);
					if (this.method7028() <= this.field4412) {
						break;
					}
				}

				return new class381(var5, true);
			} else {
				return new class381(var5, false);
			}
		}
	}

	class381 method7018(String var1, int var2) {
		return this.method7017(var1, this.field4418.size(), var2);
	}

	public class381 method7019(String var1) {
		this.method7011();
		return this.method7018(var1, 0);
	}

	void method7011() {
		this.field4418.clear();
	}

	public int method7021(int var1) {
		return this.method7022(var1, var1 + 1);
	}

	public int method7022(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field4418.subList(var1, var2).clear();
		var4 = var1;
		if (this.method7005() && 1 == this.field4407) {
			while (var4 > 0) {
				--var4;
				char var5 = ((class382)this.field4418.get(var4)).field4429;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}

		this.method7037(var4, var2);
		return var1;
	}

	public int method7023(int var1, int var2) {
		if (null == this.field4410) {
			return 0;
		} else if (this.method7005() && var1 > this.field4414) {
			return this.field4418.size();
		} else {
			if (!this.field4418.isEmpty()) {
				for (int var4 = 0; var4 < this.field4418.size(); ++var4) {
					class382 var5 = (class382)this.field4418.get(var4);
					if (var2 <= var5.field4431 + this.method7128()) {
						if (var2 < var5.field4431) {
							break;
						}

						if (var1 < var5.field4428) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.field4418.size() && ((class382)this.field4418.get(var4 + 1)).field4431 != var5.field4431) {
							int var6 = this.method7039((class382)this.field4418.get(var4), false);
							if (var1 < var5.field4428 + var6) {
								return var4;
							}

							if (var2 <= var5.field4431 + this.method7128()) {
								return var4 + 1;
							}
						}
					}
				}

				class382 var7 = (class382)this.field4418.get(this.field4418.size() - 1);
				if (var1 >= var7.field4428 && var1 <= var7.field4428 + this.method7101() && var2 >= var7.field4431 && var2 <= var7.field4431 + this.method7128()) {
					return this.field4418.size() - 1;
				}
			}

			return this.field4418.size();
		}
	}

	public int method7024(int var1, int var2) {
		if (null != this.field4410 && !this.method7004() && var1 <= this.field4418.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				class382 var7 = (class382)this.field4418.get(var1 - 1);
				var5 = var7.field4428 + this.method7038(var1 - 1);
				var6 = var7.field4431;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field4418.size() + 1 : 0;

			for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
				class382 var13 = (class382)this.field4418.get(var12 - 1);
				if (var6 != var13.field4431) {
					++var8;
					var6 = var13.field4431;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var8 == var2) {
					int var14 = Math.abs(var13.field4428 + this.method7038(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field4418.size();
			} else {
				if (var6 != 0) {
					++var8;
				}

				return var10 != 16777215 && (var8 != var2 || var5 >= var10) ? var9 : 0;
			}
		} else {
			return 0;
		}
	}

	public int method7025() {
		if (!this.field4418.isEmpty() && this.method7028() == 1) {
			return this.field4418.isEmpty() ? 0 : ((class382)this.field4418.get(this.field4418.size() - 1)).field4428 + this.method7101();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field4418.size() - 1; var4 >= 0; --var4) {
				class382 var5 = (class382)this.field4418.get(var4);
				if (var2 != var5.field4431) {
					int var6 = this.method7039(var5, false) + var5.field4428;
					var3 = Math.max(var6, var3);
					var2 = var5.field4431;
				}
			}

			return var3;
		}
	}

	public int method7026() {
		return this.method7004() ? 0 : this.field4410.field4439 + ((class382)this.field4418.get(this.field4418.size() - 1)).field4431;
	}

	public int method7128() {
		return this.field4415;
	}

	public int method7028() {
		return this.method7026() / this.field4410.field4439;
	}

	int method7101() {
		return this.method7004() ? 0 : this.method7039((class382)this.field4418.get(this.field4418.size() - 1), false);
	}

	public int method7121() {
		return this.field4414;
	}

	public int method7031() {
		return this.field4412;
	}

	public int method7076() {
		return this.field4407;
	}

	public int method7033() {
		return this.field4420;
	}

	public int method7123(int var1) {
		switch(this.field4413) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	public int method7125(int var1) {
		switch(this.field4419) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	void method7036() {
		this.method7037(0, this.field4418.size());
	}

	void method7037(int var1, int var2) {
		if (!this.method7004() && this.field4410 != null) {
			class462 var4 = this.method7001(var1, var2);
			boolean var5 = (Integer)var4.field4887 == 0 && (Integer)var4.field4888 == this.field4418.size();
			int var6 = (Integer)var4.field4887;
			int var7 = 0;
			int var8 = var5 ? 0 : ((class382)this.field4418.get((Integer)var4.field4887)).field4431;
			int var9 = 0;

			int var10;
			for (var10 = (Integer)var4.field4887; var10 <= (Integer)var4.field4888; ++var10) {
				boolean var11 = var10 >= this.field4418.size();
				class382 var12 = (class382)this.field4418.get(!var11 ? var10 : this.field4418.size() - 1);
				int var13 = !var11 ? this.method7039(var12, false) : 0;
				boolean var14 = !var11 && var12.field4429 == '\n';
				boolean var15 = !var11 && this.method7005() && var7 + var13 > this.field4414;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					class382 var20;
					if (var15) {
						var18 = 0;
						if (1 == this.field4407) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (class382)this.field4418.get(var19);
								var18 += var19 < var16 ? this.method7039(var20, false) : 0;
								if (var20.field4429 == ' ' || var20.field4429 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}

					var18 = -this.method7123(var7);

					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (class382)this.field4418.get(var19);
						int var21 = this.method7039(var20, false);
						var20.field4428 = var18;
						var20.field4431 = var8;
						var18 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += this.method7128();
					++var9;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.field4419 != 0 && var5) {
				var10 = var9 * this.method7128();
				int var22 = this.method7125(var10);

				for (int var23 = 0; var23 < this.field4418.size(); ++var23) {
					class382 var24 = (class382)this.field4418.get(var23);
					var24.field4431 -= var22;
				}
			}

		}
	}

	int method7038(int var1) {
		return var1 < this.field4418.size() ? this.method7039((class382)this.field4418.get(var1), false) : 0;
	}

	int method7039(class382 var1, boolean var2) {
		if (var1.field4429 == '\n') {
			return 0;
		} else if (!var2 && 0 != this.field4420) {
			return this.field4410.field4434[42];
		} else {
			int var4 = this.field4410.field4434[var1.field4429];
			if (var4 == 0) {
				return var1.field4429 == '\t' ? this.field4410.field4434[32] * 3 : this.field4410.field4434[32];
			} else {
				return var4;
			}
		}
	}

	class462 method7001(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field4418.size();
		if (var4 == 0 && var5 == var6) {
			return new class462(0, var6);
		} else {
			int var7 = this.method7041(var4, false);
			int var8 = this.method7042(var5, false);
			int var9;
			switch(this.field4419) {
			case 0:
				if (this.field4413 == 0) {
					return new class462(var7, var6);
				}

				var9 = this.method7041(var4, true);
				return new class462(var9, var6);
			case 1:
				return new class462(0, var6);
			case 2:
				if (this.field4413 == 2) {
					return new class462(0, var8);
				}

				var9 = this.method7042(var5, true);
				return new class462(0, var9);
			default:
				return new class462(0, var6);
			}
		}
	}

	int method7041(int var1, boolean var2) {
		if (var1 < this.field4418.size()) {
			int var4 = ((class382)this.field4418.get(var1)).field4431;

			for (int var5 = var1; var5 > 0; --var5) {
				if (((class382)this.field4418.get(var5 - 1)).field4431 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class382)this.field4418.get(var5 - 1)).field4431;
				}
			}
		}

		return 0;
	}

	int method7042(int var1, boolean var2) {
		if (var1 < this.field4418.size()) {
			int var4 = ((class382)this.field4418.get(var1)).field4431;

			for (int var5 = var1; var5 < this.field4418.size() - 1; ++var5) {
				if (((class382)this.field4418.get(var5 + 1)).field4431 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class382)this.field4418.get(var5 + 1)).field4431;
				}
			}
		}

		return this.field4418.size();
	}
}
