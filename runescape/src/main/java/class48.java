public class class48 extends class49 {
	public static boolean field314;
	boolean field358;
	int field348;
	int field349;
	int field350;
	int field351;
	int field352;
	int field353;
	int field354;
	int field355;
	int field356;
	int field357;
	int field359;
	int field360;
	int field361;
	int field362;

	class48(class41 var1, int var2, int var3) {
		super.field365 = var1;
		this.field360 = var1.field284;
		this.field357 = var1.field283;
		this.field358 = var1.field281;
		this.field349 = var2;
		this.field356 = var3;
		this.field351 = 8192;
		this.field350 = 0;
		this.method905();
	}

	class48(class41 var1, int var2, int var3, int var4) {
		super.field365 = var1;
		this.field360 = var1.field284;
		this.field357 = var1.field283;
		this.field358 = var1.field281;
		this.field349 = var2;
		this.field356 = var3;
		this.field351 = var4;
		this.field350 = 0;
		this.method905();
	}

	int method1061() {
		int var1 = this.field352 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field361 == 0) {
			var1 -= var1 * this.field350 / (((class41)super.field365).field280.length << 8);
		} else if (this.field361 >= 0) {
			var1 -= var1 * this.field360 / ((class41)super.field365).field280.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	void method905() {
		this.field352 = this.field356;
		this.field353 = method993(this.field356, this.field351);
		this.field354 = method900(this.field356, this.field351);
	}

	public synchronized void method906(int var1) {
		this.field361 = var1;
	}

	public synchronized void method980(int var1) {
		this.method909(var1 << 6, this.method942());
	}

	synchronized void method908(int var1) {
		this.method909(var1, this.method942());
	}

	synchronized void method909(int var1, int var2) {
		this.field356 = var1;
		this.field351 = var2;
		this.field359 = 0;
		this.method905();
	}

	public synchronized int method910() {
		return this.field356 == Integer.MIN_VALUE ? 0 : this.field356;
	}

	public synchronized int method942() {
		return this.field351 < 0 ? -1 : this.field351;
	}

	public synchronized void method912(int var1) {
		int var2 = ((class41)super.field365).field280.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field350 = var1;
	}

	public synchronized void method913(boolean var1) {
		this.field349 = (this.field349 ^ this.field349 >> 31) + (this.field349 >>> 31);
		if (var1) {
			this.field349 = -this.field349;
		}

	}

	void method914() {
		if (this.field359 != 0) {
			if (this.field356 == Integer.MIN_VALUE) {
				this.field356 = 0;
			}

			this.field359 = 0;
			this.method905();
		}

	}

	public synchronized void method1015(int var1, int var2) {
		this.method916(var1, var2, this.method942());
	}

	public synchronized void method916(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method909(var2, var3);
		} else {
			int var4 = method993(var2, var3);
			int var5 = method900(var2, var3);
			if (this.field353 == var4 && this.field354 == var5) {
				this.field359 = 0;
			} else {
				int var6 = var2 - this.field352;
				if (this.field352 - var2 > var6) {
					var6 = this.field352 - var2;
				}

				if (var4 - this.field353 > var6) {
					var6 = var4 - this.field353;
				}

				if (this.field353 - var4 > var6) {
					var6 = this.field353 - var4;
				}

				if (var5 - this.field354 > var6) {
					var6 = var5 - this.field354;
				}

				if (this.field354 - var5 > var6) {
					var6 = this.field354 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field359 = var1;
				this.field356 = var2;
				this.field351 = var3;
				this.field355 = (var2 - this.field352) / var1;
				this.field348 = (var4 - this.field353) / var1;
				this.field362 = (var5 - this.field354) / var1;
			}
		}
	}

	public synchronized void method917(int var1) {
		if (var1 == 0) {
			this.method908(0);
			this.method8051();
		} else if (this.field353 == 0 && this.field354 == 0) {
			this.field359 = 0;
			this.field356 = 0;
			this.field352 = 0;
			this.method8051();
		} else {
			int var2 = -this.field352;
			if (this.field352 > var2) {
				var2 = this.field352;
			}

			if (-this.field353 > var2) {
				var2 = -this.field353;
			}

			if (this.field353 > var2) {
				var2 = this.field353;
			}

			if (-this.field354 > var2) {
				var2 = -this.field354;
			}

			if (this.field354 > var2) {
				var2 = this.field354;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field359 = var1;
			this.field356 = Integer.MIN_VALUE;
			this.field355 = -this.field352 / var1;
			this.field348 = -this.field353 / var1;
			this.field362 = -this.field354 / var1;
		}
	}

	public synchronized void method918(int var1) {
		if (this.field349 < 0) {
			this.field349 = -var1;
		} else {
			this.field349 = var1;
		}

	}

	public synchronized int method919() {
		return this.field349 < 0 ? -this.field349 : this.field349;
	}

	public boolean method989() {
		return this.field350 < 0 || this.field350 >= ((class41)super.field365).field280.length << 8;
	}

	public boolean method1022() {
		return this.field359 != 0;
	}

	protected class49 method1042() {
		return null;
	}

	protected class49 method1040() {
		return null;
	}

	protected int method1044() {
		return this.field356 == 0 && this.field359 == 0 ? 0 : 1;
	}

	public synchronized void method1064(int[] var1, int var2, int var3) {
		if (this.field356 == 0 && this.field359 == 0) {
			this.method1046(var3);
		} else {
			class41 var4 = (class41)super.field365;
			int var5 = this.field360 << 8;
			int var6 = this.field357 << 8;
			int var7 = var4.field280.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field361 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field350 < 0) {
				if (this.field349 <= 0) {
					this.method914();
					this.method8051();
					return;
				}

				this.field350 = 0;
			}

			if (this.field350 >= var7) {
				if (this.field349 >= 0) {
					this.method914();
					this.method8051();
					return;
				}

				this.field350 = var7 - 1;
			}

			if (this.field361 < 0) {
				if (this.field358) {
					if (this.field349 < 0) {
						var9 = this.method928(var1, var2, var5, var3, var4.field280[this.field360]);
						if (this.field350 >= var5) {
							return;
						}

						this.field350 = var5 + var5 - 1 - this.field350;
						this.field349 = -this.field349;
					}

					while (true) {
						var9 = this.method927(var1, var9, var6, var3, var4.field280[this.field357 - 1]);
						if (this.field350 < var6) {
							return;
						}

						this.field350 = var6 + var6 - 1 - this.field350;
						this.field349 = -this.field349;
						var9 = this.method928(var1, var9, var5, var3, var4.field280[this.field360]);
						if (this.field350 >= var5) {
							return;
						}

						this.field350 = var5 + var5 - 1 - this.field350;
						this.field349 = -this.field349;
					}
				} else if (this.field349 < 0) {
					while (true) {
						var9 = this.method928(var1, var9, var5, var3, var4.field280[this.field357 - 1]);
						if (this.field350 >= var5) {
							return;
						}

						this.field350 = var6 - 1 - (var6 - 1 - this.field350) % var8;
					}
				} else {
					while (true) {
						var9 = this.method927(var1, var9, var6, var3, var4.field280[this.field360]);
						if (this.field350 < var6) {
							return;
						}

						this.field350 = var5 + (this.field350 - var5) % var8;
					}
				}
			} else {
				if (this.field361 > 0) {
					if (this.field358) {
						label131: {
							if (this.field349 < 0) {
								var9 = this.method928(var1, var2, var5, var3, var4.field280[this.field360]);
								if (this.field350 >= var5) {
									return;
								}

								this.field350 = var5 + var5 - 1 - this.field350;
								this.field349 = -this.field349;
								if (--this.field361 == 0) {
									break label131;
								}
							}

							do {
								var9 = this.method927(var1, var9, var6, var3, var4.field280[this.field357 - 1]);
								if (this.field350 < var6) {
									return;
								}

								this.field350 = var6 + var6 - 1 - this.field350;
								this.field349 = -this.field349;
								if (--this.field361 == 0) {
									break;
								}

								var9 = this.method928(var1, var9, var5, var3, var4.field280[this.field360]);
								if (this.field350 >= var5) {
									return;
								}

								this.field350 = var5 + var5 - 1 - this.field350;
								this.field349 = -this.field349;
							} while(--this.field361 != 0);
						}
					} else {
						int var10;
						if (this.field349 < 0) {
							while (true) {
								var9 = this.method928(var1, var9, var5, var3, var4.field280[this.field357 - 1]);
								if (this.field350 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field350) / var8;
								if (var10 >= this.field361) {
									this.field350 += var8 * this.field361;
									this.field361 = 0;
									break;
								}

								this.field350 += var8 * var10;
								this.field361 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method927(var1, var9, var6, var3, var4.field280[this.field360]);
								if (this.field350 < var6) {
									return;
								}

								var10 = (this.field350 - var5) / var8;
								if (var10 >= this.field361) {
									this.field350 -= var8 * this.field361;
									this.field361 = 0;
									break;
								}

								this.field350 -= var8 * var10;
								this.field361 -= var10;
							}
						}
					}
				}

				if (this.field349 < 0) {
					this.method928(var1, var9, 0, var3, 0);
					if (this.field350 < 0) {
						this.field350 = -1;
						this.method914();
						this.method8051();
					}
				} else {
					this.method927(var1, var9, var7, var3, 0);
					if (this.field350 >= var7) {
						this.field350 = var7;
						this.method914();
						this.method8051();
					}
				}

			}
		}
	}

	public synchronized void method1046(int var1) {
		if (this.field359 > 0) {
			if (var1 >= this.field359) {
				if (this.field356 == Integer.MIN_VALUE) {
					this.field356 = 0;
					this.field354 = 0;
					this.field353 = 0;
					this.field352 = 0;
					this.method8051();
					var1 = this.field359;
				}

				this.field359 = 0;
				this.method905();
			} else {
				this.field352 += this.field355 * var1;
				this.field353 += this.field348 * var1;
				this.field354 += this.field362 * var1;
				this.field359 -= var1;
			}
		}

		class41 var2 = (class41)super.field365;
		int var3 = this.field360 << 8;
		int var4 = this.field357 << 8;
		int var5 = var2.field280.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field361 = 0;
		}

		if (this.field350 < 0) {
			if (this.field349 <= 0) {
				this.method914();
				this.method8051();
				return;
			}

			this.field350 = 0;
		}

		if (this.field350 >= var5) {
			if (this.field349 >= 0) {
				this.method914();
				this.method8051();
				return;
			}

			this.field350 = var5 - 1;
		}

		this.field350 += this.field349 * var1;
		if (this.field361 < 0) {
			if (!this.field358) {
				if (this.field349 < 0) {
					if (this.field350 >= var3) {
						return;
					}

					this.field350 = var4 - 1 - (var4 - 1 - this.field350) % var6;
				} else {
					if (this.field350 < var4) {
						return;
					}

					this.field350 = var3 + (this.field350 - var3) % var6;
				}

			} else {
				if (this.field349 < 0) {
					if (this.field350 >= var3) {
						return;
					}

					this.field350 = var3 + var3 - 1 - this.field350;
					this.field349 = -this.field349;
				}

				while (this.field350 >= var4) {
					this.field350 = var4 + var4 - 1 - this.field350;
					this.field349 = -this.field349;
					if (this.field350 >= var3) {
						return;
					}

					this.field350 = var3 + var3 - 1 - this.field350;
					this.field349 = -this.field349;
				}

			}
		} else {
			if (this.field361 > 0) {
				if (this.field358) {
					label121: {
						if (this.field349 < 0) {
							if (this.field350 >= var3) {
								return;
							}

							this.field350 = var3 + var3 - 1 - this.field350;
							this.field349 = -this.field349;
							if (--this.field361 == 0) {
								break label121;
							}
						}

						do {
							if (this.field350 < var4) {
								return;
							}

							this.field350 = var4 + var4 - 1 - this.field350;
							this.field349 = -this.field349;
							if (--this.field361 == 0) {
								break;
							}

							if (this.field350 >= var3) {
								return;
							}

							this.field350 = var3 + var3 - 1 - this.field350;
							this.field349 = -this.field349;
						} while(--this.field361 != 0);
					}
				} else {
					label153: {
						int var7;
						if (this.field349 < 0) {
							if (this.field350 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field350) / var6;
							if (var7 >= this.field361) {
								this.field350 += var6 * this.field361;
								this.field361 = 0;
								break label153;
							}

							this.field350 += var6 * var7;
							this.field361 -= var7;
						} else {
							if (this.field350 < var4) {
								return;
							}

							var7 = (this.field350 - var3) / var6;
							if (var7 >= this.field361) {
								this.field350 -= var6 * this.field361;
								this.field361 = 0;
								break label153;
							}

							this.field350 -= var6 * var7;
							this.field361 -= var7;
						}

						return;
					}
				}
			}

			if (this.field349 < 0) {
				if (this.field350 < 0) {
					this.field350 = -1;
					this.method914();
					this.method8051();
				}
			} else if (this.field350 >= var5) {
				this.field350 = var5;
				this.method914();
				this.method8051();
			}

		}
	}

	int method927(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field359 > 0) {
				int var6 = var2 + this.field359;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field359 += var2;
				if (this.field349 == 256 && (this.field350 & 255) == 0) {
					if (field314) {
						var2 = method966(0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, this.field348, this.field362, 0, var6, var3, this);
					} else {
						var2 = method954(((class41)super.field365).field280, var1, this.field350, var2, this.field352, this.field355, 0, var6, var3, this);
					}
				} else if (field314) {
					var2 = method1033(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, this.field348, this.field362, 0, var6, var3, this, this.field349, var5);
				} else {
					var2 = method915(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field352, this.field355, 0, var6, var3, this, this.field349, var5);
				}

				this.field359 -= var2;
				if (this.field359 != 0) {
					return var2;
				}

				if (!this.method929()) {
					continue;
				}

				return var4;
			}

			if (this.field349 == 256 && (this.field350 & 255) == 0) {
				if (field314) {
					return method931(0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, 0, var4, var3, this);
				}

				return method930(((class41)super.field365).field280, var1, this.field350, var2, this.field352, 0, var4, var3, this);
			}

			if (field314) {
				return method935(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, 0, var4, var3, this, this.field349, var5);
			}

			return method934(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field352, 0, var4, var3, this, this.field349, var5);
		}
	}

	int method928(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field359 > 0) {
				int var6 = var2 + this.field359;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field359 += var2;
				if (this.field349 == -256 && (this.field350 & 255) == 0) {
					if (field314) {
						var2 = method973(0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, this.field348, this.field362, 0, var6, var3, this);
					} else {
						var2 = method940(((class41)super.field365).field280, var1, this.field350, var2, this.field352, this.field355, 0, var6, var3, this);
					}
				} else if (field314) {
					var2 = method945(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, this.field348, this.field362, 0, var6, var3, this, this.field349, var5);
				} else {
					var2 = method944(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field352, this.field355, 0, var6, var3, this, this.field349, var5);
				}

				this.field359 -= var2;
				if (this.field359 != 0) {
					return var2;
				}

				if (!this.method929()) {
					continue;
				}

				return var4;
			}

			if (this.field349 == -256 && (this.field350 & 255) == 0) {
				if (field314) {
					return method950(0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, 0, var4, var3, this);
				}

				return method932(((class41)super.field365).field280, var1, this.field350, var2, this.field352, 0, var4, var3, this);
			}

			if (field314) {
				return method937(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field353, this.field354, 0, var4, var3, this, this.field349, var5);
			}

			return method936(0, 0, ((class41)super.field365).field280, var1, this.field350, var2, this.field352, 0, var4, var3, this, this.field349, var5);
		}
	}

	boolean method929() {
		int var1 = this.field356;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method993(var1, this.field351);
			var3 = method900(var1, this.field351);
		}

		if (this.field352 == var1 && this.field353 == var2 && this.field354 == var3) {
			if (this.field356 == Integer.MIN_VALUE) {
				this.field356 = 0;
				this.field354 = 0;
				this.field353 = 0;
				this.field352 = 0;
				this.method8051();
				return true;
			} else {
				this.method905();
				return false;
			}
		} else {
			if (this.field352 < var1) {
				this.field355 = 1;
				this.field359 = var1 - this.field352;
			} else if (this.field352 > var1) {
				this.field355 = -1;
				this.field359 = this.field352 - var1;
			} else {
				this.field355 = 0;
			}

			if (this.field353 < var2) {
				this.field348 = 1;
				if (this.field359 == 0 || this.field359 > var2 - this.field353) {
					this.field359 = var2 - this.field353;
				}
			} else if (this.field353 > var2) {
				this.field348 = -1;
				if (this.field359 == 0 || this.field359 > this.field353 - var2) {
					this.field359 = this.field353 - var2;
				}
			} else {
				this.field348 = 0;
			}

			if (this.field354 < var3) {
				this.field362 = 1;
				if (this.field359 == 0 || this.field359 > var3 - this.field354) {
					this.field359 = var3 - this.field354;
				}
			} else if (this.field354 > var3) {
				this.field362 = -1;
				if (this.field359 == 0 || this.field359 > this.field354 - var3) {
					this.field359 = this.field354 - var3;
				}
			} else {
				this.field362 = 0;
			}

			return false;
		}
	}

	static int method993(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int method900(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	public static class48 method903(class41 var0, int var1, int var2) {
		return var0.field280 != null && var0.field280.length != 0 ? new class48(var0, (int)((long)var0.field282 * 256L * (long)var1 / (long)(class299.field307 * 100)), var2 << 6) : null;
	}

	public static class48 method979(class41 var0, int var1, int var2, int var3) {
		return var0.field280 != null && var0.field280.length != 0 ? new class48(var0, var1, var2, var3) : null;
	}

	static int method930(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class48 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field350 = var2 << 8;
		return var3;
	}

	static int method931(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class48 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field350 = var3 << 8;
		return var4 >> 1;
	}

	static int method932(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class48 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field350 = var2 << 8;
		return var3;
	}

	static int method950(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class48 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field350 = var3 << 8;
		return var4 >> 1;
	}

	static int method934(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class48 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field350 = var4;
		return var5;
	}

	static int method935(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class48 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field350 = var4;
		return var5 >> 1;
	}

	static int method936(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class48 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field350 = var4;
		return var5;
	}

	static int method937(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class48 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field350 = var4;
		return var5 >> 1;
	}

	static int method954(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class48 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field353 += var9.field348 * (var6 - var3);
		var9.field354 += var9.field362 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field352 = var4 >> 2;
		var9.field350 = var2 << 8;
		return var3;
	}

	static int method966(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class48 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.field352 += var12.field355 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field353 = var5 >> 2;
		var12.field354 = var6 >> 2;
		var12.field350 = var3 << 8;
		return var4 >> 1;
	}

	static int method940(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class48 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field353 += var9.field348 * (var6 - var3);
		var9.field354 += var9.field362 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field352 = var4 >> 2;
		var9.field350 = var2 << 8;
		return var3;
	}

	static int method973(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class48 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field352 += var12.field355 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field353 = var5 >> 2;
		var12.field354 = var6 >> 2;
		var12.field350 = var3 << 8;
		return var4 >> 1;
	}

	static int method915(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class48 var11, int var12, int var13) {
		var11.field353 -= var11.field348 * var5;
		var11.field354 -= var11.field362 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field353 += var11.field348 * var5;
		var11.field354 += var11.field362 * var5;
		var11.field352 = var6;
		var11.field350 = var4;
		return var5;
	}

	static int method1033(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class48 var13, int var14, int var15) {
		var13.field352 -= var13.field355 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field352 += var13.field355 * var5;
		var13.field353 = var6;
		var13.field354 = var7;
		var13.field350 = var4;
		return var5;
	}

	static int method944(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class48 var11, int var12, int var13) {
		var11.field353 -= var11.field348 * var5;
		var11.field354 -= var11.field362 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field353 += var11.field348 * var5;
		var11.field354 += var11.field362 * var5;
		var11.field352 = var6;
		var11.field350 = var4;
		return var5;
	}

	static int method945(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class48 var13, int var14, int var15) {
		var13.field352 -= var13.field355 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field352 += var13.field355 * var5;
		var13.field353 = var6;
		var13.field354 = var7;
		var13.field350 = var4;
		return var5;
	}
}
