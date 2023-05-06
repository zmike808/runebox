public final class class100 extends class225 {
	int field1313;
	int field1317;
	int field1318;

	class100() {
		this.field1318 = 31;
	}

	void method2604(int var1) {
		this.field1318 = var1;
	}

	boolean method2612(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return 0 != (this.field1318 & 1 << var1);
		} else {
			return true;
		}
	}

	protected final class232 method4541() {
		return class92.method2352(this.field1317).method3925(this.field1313);
	}

	static final void method2606(class317[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class317 var4 = var0[var3];
			if (null != var4 && var1 == var4.field3589 && (!var4.field3651 || !Client.method7362(var4))) {
				int var6;
				if (0 == var4.field3598) {
					if (!var4.field3651 && Client.method7362(var4) && var4 != Client.field3394) {
						continue;
					}

					method2606(var0, var4.field3570);
					if (null != var4.field3707) {
						method2606(var4.field3707, var4.field3570);
					}

					class83 var5 = (class83)Client.field657.method8381((long)var4.field3570);
					if (var5 != null) {
						var6 = var5.field1037;
						if (class45.method882(var6)) {
							method2606(Client.field2057[var6], -1);
						}
					}
				}

				if (6 == var4.field3598) {
					if (-1 != var4.field3618 || var4.field3629 != -1) {
						boolean var9 = class453.method8076(var4);
						if (var9) {
							var6 = var4.field3629;
						} else {
							var6 = var4.field3618;
						}

						if (var6 != -1) {
							class204 var7 = class81.method2189(var6, (byte)104);
							if (!var7.method4004()) {
								for (var4.field3706 += Client.field565; var4.field3706 > var7.field2304[var4.field3705]; Client.method3176(var4)) {
									var4.field3706 -= var7.field2304[var4.field3705];
									++var4.field3705;
									if (var4.field3705 >= var7.field2300.length) {
										var4.field3705 -= var7.field2301;
										if (var4.field3705 < 0 || var4.field3705 >= var7.field2300.length) {
											var4.field3705 = 0;
										}
									}
								}
							} else {
								var4.field3705 += Client.field565;
								int var8 = var7.method4005();
								if (var4.field3705 >= var8) {
									var4.field3705 -= var7.field2301;
									if (var4.field3705 < 0 || var4.field3705 >= var8) {
										var4.field3705 = 0;
									}
								}

								Client.method3176(var4);
							}
						}
					}

					if (0 != var4.field3627 && !var4.field3651) {
						int var10 = var4.field3627 >> 16;
						var6 = var4.field3627 << 16 >> 16;
						var10 *= Client.field565;
						var6 *= Client.field565;
						var4.field3622 = var4.field3622 + var10 & 2047;
						var4.field3566 = var4.field3566 + var6 & 2047;
						Client.method3176(var4);
					}
				}
			}
		}

	}
}
