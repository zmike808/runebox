import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class8 {
	ExecutorService field31;
	Future field29;
	final class4 field27;
	final class489 field25;

	public class8(class489 var1, class4 var2) {
		this.field31 = Executors.newSingleThreadExecutor();
		this.field25 = var1;
		this.field27 = var2;
		this.method52();
	}

	public boolean method59() {
		return this.field29.isDone();
	}

	public void method50() {
		this.field31.shutdown();
		this.field31 = null;
	}

	public class489 method51() {
		try {
			return (class489)this.field29.get();
		} catch (Exception var3) {
			return null;
		}
	}

	void method52() {
		this.field29 = this.field31.submit(new class2(this, this.field25, this.field27));
	}

	static void method65(double var0, int var2, int var3) {
		int var5 = var2 * 128;

		for (int var6 = var2; var6 < var3; ++var6) {
			double var7 = (double)(var6 >> 3) / 64.0D + 0.0078125D;
			double var9 = 0.0625D + (double)(var6 & 7) / 8.0D;

			for (int var11 = 0; var11 < 128; ++var11) {
				double var12 = (double)var11 / 128.0D;
				double var14 = var12;
				double var16 = var12;
				double var18 = var12;
				if (var9 != 0.0D) {
					double var20;
					if (var12 < 0.5D) {
						var20 = var12 * (var9 + 1.0D);
					} else {
						var20 = var9 + var12 - var9 * var12;
					}

					double var22 = var12 * 2.0D - var20;
					double var24 = var7 + 0.3333333333333333D;
					if (var24 > 1.0D) {
						--var24;
					}

					double var28 = var7 - 0.3333333333333333D;
					if (var28 < 0.0D) {
						++var28;
					}

					if (var24 * 6.0D < 1.0D) {
						var14 = var24 * 6.0D * (var20 - var22) + var22;
					} else if (var24 * 2.0D < 1.0D) {
						var14 = var20;
					} else if (var24 * 3.0D < 2.0D) {
						var14 = var22 + 6.0D * (0.6666666666666666D - var24) * (var20 - var22);
					} else {
						var14 = var22;
					}

					if (var7 * 6.0D < 1.0D) {
						var16 = var22 + (var20 - var22) * 6.0D * var7;
					} else if (var7 * 2.0D < 1.0D) {
						var16 = var20;
					} else if (var7 * 3.0D < 2.0D) {
						var16 = var22 + (var20 - var22) * (0.6666666666666666D - var7) * 6.0D;
					} else {
						var16 = var22;
					}

					if (var28 * 6.0D < 1.0D) {
						var18 = var28 * (var20 - var22) * 6.0D + var22;
					} else if (var28 * 2.0D < 1.0D) {
						var18 = var20;
					} else if (var28 * 3.0D < 2.0D) {
						var18 = 6.0D * (var20 - var22) * (0.6666666666666666D - var28) + var22;
					} else {
						var18 = var22;
					}
				}

				int var30 = (int)(var14 * 256.0D);
				int var21 = (int)(var16 * 256.0D);
				int var31 = (int)(var18 * 256.0D);
				int var23 = (var30 << 16) + (var21 << 8) + var31;
				var23 = class219.method2794(var23, var0);
				if (var23 == 0) {
					var23 = 1;
				}

				class219.field2517[var5++] = var23;
			}
		}

	}

	static final void method54(int var0) {
		Client.method5492();
		class19.method284();
		int var2 = class182.method7787(var0).field1912;
		if (var2 != 0) {
			int var3 = class307.field3482[var0];
			if (var2 == 1) {
				if (var3 == 1) {
					Client.method1165(0.9D);
				}

				if (var3 == 2) {
					Client.method1165(0.8D);
				}

				if (var3 == 3) {
					Client.method1165(0.7D);
				}

				if (var3 == 4) {
					Client.method1165(0.6D);
				}
			}

			if (var2 == 3) {
				if (var3 == 0) {
					class87.method2230(255);
				}

				if (var3 == 1) {
					class87.method2230(192);
				}

				if (var3 == 2) {
					class87.method2230(128);
				}

				if (var3 == 3) {
					class87.method2230(64);
				}

				if (var3 == 4) {
					class87.method2230(0);
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					Client.method3062(127);
				}

				if (var3 == 1) {
					Client.method3062(96);
				}

				if (var3 == 2) {
					Client.method3062(64);
				}

				if (var3 == 3) {
					Client.method3062(32);
				}

				if (var3 == 4) {
					Client.method3062(0);
				}
			}

			if (var2 == 5) {
				Client.field631 = var3 == 1;
			}

			if (var2 == 6) {
				Client.field626 = var3;
			}

			if (var2 == 9) {
			}

			if (var2 == 10) {
				if (var3 == 0) {
					Client.method3119(127);
				}

				if (var3 == 1) {
					Client.method3119(96);
				}

				if (var3 == 2) {
					Client.method3119(64);
				}

				if (var3 == 3) {
					Client.method3119(32);
				}

				if (var3 == 4) {
					Client.method3119(0);
				}
			}

			if (var2 == 17) {
				Client.field665 = var3 & 65535;
			}

			if (var2 == 18) {
				Client.field501 = (class99)class199.method3788(class99.method2822(), var3);
				if (Client.field501 == null) {
					Client.field501 = class99.field1307;
				}
			}

			if (var2 == 19) {
				if (var3 == -1) {
					Client.field623 = -1;
				} else {
					Client.field623 = var3 & 2047;
				}
			}

			if (var2 == 22) {
				Client.field517 = (class99)class199.method3788(class99.method2822(), var3);
				if (null == Client.field517) {
					Client.field517 = class99.field1307;
				}
			}

		}
	}
}
