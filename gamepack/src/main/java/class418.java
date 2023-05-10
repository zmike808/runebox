import java.io.EOFException;
import java.io.IOException;

public final class class418 {
	static byte[] field4628;
	class472 field4630;
	class472 field4633;
	int field4631;
	int field4632;

	static {
		field4628 = new byte[520];
	}

	public class418(int var1, class472 var2, class472 var3, int var4) {
		this.field4633 = null;
		this.field4630 = null;
		this.field4632 = 65000;
		this.field4631 = var1;
		this.field4633 = var2;
		this.field4630 = var3;
		this.field4632 = var4;
	}

	public byte[] method7772(int var1) {
		synchronized(this.field4633){}

		try {
			if (this.field4630.method8448() < (long)(6 + var1 * 6)) {
				return null;
			} else {
				this.field4630.method8437((long)(var1 * 6));
				this.field4630.method8440(field4628, 0, 6);
				int var4 = (field4628[2] & 255) + ((field4628[0] & 255) << 16) + ((field4628[1] & 255) << 8);
				int var5 = ((field4628[4] & 255) << 8) + ((field4628[3] & 255) << 16) + (field4628[5] & 255);
				if (var4 >= 0 && var4 <= this.field4632) {
					if (var5 > 0 && (long)var5 <= this.field4633.method8448() / 520L) {
						byte[] var6 = new byte[var4];
						int var7 = 0;
						int var8 = 0;

						while (var7 < var4) {
							if (var5 == 0) {
								return null;
							}

							this.field4633.method8437((long)var5 * 520L);
							int var9 = var4 - var7;
							int var10;
							int var11;
							int var12;
							int var13;
							byte var14;
							if (var1 > 65535) {
								if (var9 > 510) {
									var9 = 510;
								}

								var14 = 10;
								this.field4633.method8440(field4628, 0, var9 + var14);
								var10 = (field4628[3] & 255) + ((field4628[2] & 255) << 8) + ((field4628[1] & 255) << 16) + ((field4628[0] & 255) << 24);
								var11 = (field4628[5] & 255) + ((field4628[4] & 255) << 8);
								var12 = (field4628[8] & 255) + ((field4628[6] & 255) << 16) + ((field4628[7] & 255) << 8);
								var13 = field4628[9] & 255;
							} else {
								if (var9 > 512) {
									var9 = 512;
								}

								var14 = 8;
								this.field4633.method8440(field4628, 0, var14 + var9);
								var10 = ((field4628[0] & 255) << 8) + (field4628[1] & 255);
								var11 = ((field4628[2] & 255) << 8) + (field4628[3] & 255);
								var12 = ((field4628[5] & 255) << 8) + ((field4628[4] & 255) << 16) + (field4628[6] & 255);
								var13 = field4628[7] & 255;
							}

							if (var10 == var1 && var8 == var11 && var13 == this.field4631) {
								if (var12 >= 0 && (long)var12 <= this.field4633.method8448() / 520L) {
									int var15 = var9 + var14;

									for (int var16 = var14; var16 < var15; ++var16) {
										var6[var7++] = field4628[var16];
									}

									var5 = var12;
									++var8;
									continue;
								}

								return null;
							}

							return null;
						}

						byte[] var10000 = var6;
						return var10000;
					} else {
						return null;
					}
				} else {
					return null;
				}
			}
		} catch (IOException var18) {
			return null;
		}
	}

	public boolean method7770(int var1, byte[] var2, int var3) {
		class472 var5;
		synchronized(var5 = this.field4633){}
		if (var3 >= 0 && var3 <= this.field4632) {
			boolean var6 = this.method7771(var1, var2, var3, true);
			if (!var6) {
				var6 = this.method7771(var1, var2, var3, false);
			}

			return var6;
		} else {
			throw new IllegalArgumentException("" + this.field4631 + ',' + var1 + ',' + var3);
		}
	}

	boolean method7771(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.field4633){}

		try {
			int var7;
			if (var4) {
				if (this.field4630.method8448() < (long)(var1 * 6 + 6)) {
					return false;
				}

				this.field4630.method8437((long)(var1 * 6));
				this.field4630.method8440(field4628, 0, 6);
				var7 = (field4628[5] & 255) + ((field4628[3] & 255) << 16) + ((field4628[4] & 255) << 8);
				if (var7 <= 0 || (long)var7 > this.field4633.method8448() / 520L) {
					return false;
				}
			} else {
				var7 = (int)((this.field4633.method8448() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field4628[0] = (byte)(var3 >> 16);
			field4628[1] = (byte)(var3 >> 8);
			field4628[2] = (byte)var3;
			field4628[3] = (byte)(var7 >> 16);
			field4628[4] = (byte)(var7 >> 8);
			field4628[5] = (byte)var7;
			this.field4630.method8437((long)(var1 * 6));
			this.field4630.method8443(field4628, 0, 6);
			int var8 = 0;
			int var9 = 0;

			while (true) {
				if (var8 < var3) {
					label118: {
						int var10 = 0;
						int var11;
						if (var4) {
							label116: {
								this.field4633.method8437((long)var7 * 520L);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field4633.method8440(field4628, 0, 10);
									} catch (EOFException var17) {
										break label118;
									}

									var11 = (field4628[3] & 255) + ((field4628[2] & 255) << 8) + ((field4628[1] & 255) << 16) + ((field4628[0] & 255) << 24);
									var12 = (field4628[5] & 255) + ((field4628[4] & 255) << 8);
									var10 = ((field4628[7] & 255) << 8) + ((field4628[6] & 255) << 16) + (field4628[8] & 255);
									var13 = field4628[9] & 255;
								} else {
									try {
										this.field4633.method8440(field4628, 0, 8);
									} catch (EOFException var16) {
										break label118;
									}

									var11 = (field4628[1] & 255) + ((field4628[0] & 255) << 8);
									var12 = (field4628[3] & 255) + ((field4628[2] & 255) << 8);
									var10 = ((field4628[5] & 255) << 8) + ((field4628[4] & 255) << 16) + (field4628[6] & 255);
									var13 = field4628[7] & 255;
								}

								if (var1 == var11 && var12 == var9 && var13 == this.field4631) {
									if (var10 >= 0 && (long)var10 <= this.field4633.method8448() / 520L) {
										break label116;
									}

									return false;
								}

								return false;
							}
						}

						if (var10 == 0) {
							var4 = false;
							var10 = (int)((this.field4633.method8448() + 519L) / 520L);
							if (var10 == 0) {
								++var10;
							}

							if (var7 == var10) {
								++var10;
							}
						}

						if (var1 > 65535) {
							if (var3 - var8 <= 510) {
								var10 = 0;
							}

							field4628[0] = (byte)(var1 >> 24);
							field4628[1] = (byte)(var1 >> 16);
							field4628[2] = (byte)(var1 >> 8);
							field4628[3] = (byte)var1;
							field4628[4] = (byte)(var9 >> 8);
							field4628[5] = (byte)var9;
							field4628[6] = (byte)(var10 >> 16);
							field4628[7] = (byte)(var10 >> 8);
							field4628[8] = (byte)var10;
							field4628[9] = (byte)this.field4631;
							this.field4633.method8437((long)var7 * 520L);
							this.field4633.method8443(field4628, 0, 10);
							var11 = var3 - var8;
							if (var11 > 510) {
								var11 = 510;
							}

							this.field4633.method8443(var2, var8, var11);
							var8 += var11;
						} else {
							if (var3 - var8 <= 512) {
								var10 = 0;
							}

							field4628[0] = (byte)(var1 >> 8);
							field4628[1] = (byte)var1;
							field4628[2] = (byte)(var9 >> 8);
							field4628[3] = (byte)var9;
							field4628[4] = (byte)(var10 >> 16);
							field4628[5] = (byte)(var10 >> 8);
							field4628[6] = (byte)var10;
							field4628[7] = (byte)this.field4631;
							this.field4633.method8437(520L * (long)var7);
							this.field4633.method8443(field4628, 0, 8);
							var11 = var3 - var8;
							if (var11 > 512) {
								var11 = 512;
							}

							this.field4633.method8443(var2, var8, var11);
							var8 += var11;
						}

						var7 = var10;
						++var9;
						continue;
					}
				}

				boolean var10000 = true;
				return var10000;
			}
		} catch (IOException var18) {
			return false;
		}
	}

	public String toString() {
		return "" + this.field4631;
	}
}
