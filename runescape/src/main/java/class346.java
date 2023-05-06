import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class346 {
	public static Comparator field4263;
	public static Comparator field4264;
	public static Comparator field4266;
	public static Comparator field4267;
	public final List field4265;

	static {
		field4264 = new class349();
		new class351();
		field4267 = new class354();
		field4266 = new class348();
		field4263 = new class347();
	}

	public class346(class489 var1, boolean var2) {
		int var3 = var1.method8660();
		boolean var4 = var1.method8658() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method8660();
		this.field4265 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field4265.add(new class352(var1, var5, var3));
		}

	}

	public void method6549(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field4265, var1);
		} else {
			Collections.sort(this.field4265, Collections.reverseOrder(var1));
		}

	}

	static final void method6554(class488 var0, int var1) {
		int var3 = var0.field4989;
		class103.field1342 = 0;
		int var4 = 0;
		var0.method8636();

		byte[] var10000;
		int var5;
		int var6;
		int var7;
		for (var5 = 0; var5 < class103.field1335; ++var5) {
			var6 = class103.field1341[var5];
			if ((class103.field1330[var6] & 1) == 0) {
				if (var4 > 0) {
					--var4;
					var10000 = class103.field1330;
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var7 = var0.method8607(1);
					if (var7 == 0) {
						var4 = class93.method2366(var0);
						var10000 = class103.field1330;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						class331.method6332(var0, var6);
					}
				}
			}
		}

		var0.method8608();
		if (var4 != 0) {
			throw new RuntimeException();
		} else {
			var0.method8636();

			for (var5 = 0; var5 < class103.field1335; ++var5) {
				var6 = class103.field1341[var5];
				if ((class103.field1330[var6] & 1) != 0) {
					if (var4 > 0) {
						--var4;
						var10000 = class103.field1330;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var7 = var0.method8607(1);
						if (var7 == 0) {
							var4 = class93.method2366(var0);
							var10000 = class103.field1330;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							class331.method6332(var0, var6);
						}
					}
				}
			}

			var0.method8608();
			if (var4 != 0) {
				throw new RuntimeException();
			} else {
				var0.method8636();

				for (var5 = 0; var5 < class103.field1346; ++var5) {
					var6 = class103.field1338[var5];
					if (0 != (class103.field1330[var6] & 1)) {
						if (var4 > 0) {
							--var4;
							var10000 = class103.field1330;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var7 = var0.method8607(1);
							if (var7 == 0) {
								var4 = class93.method2366(var0);
								var10000 = class103.field1330;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (class264.method5279(var0, var6)) {
								var10000 = class103.field1330;
								var10000[var6] = (byte)(var10000[var6] | 2);
							}
						}
					}
				}

				var0.method8608();
				if (var4 != 0) {
					throw new RuntimeException();
				} else {
					var0.method8636();

					for (var5 = 0; var5 < class103.field1346; ++var5) {
						var6 = class103.field1338[var5];
						if (0 == (class103.field1330[var6] & 1)) {
							if (var4 > 0) {
								--var4;
								var10000 = class103.field1330;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var7 = var0.method8607(1);
								if (var7 == 0) {
									var4 = class93.method2366(var0);
									var10000 = class103.field1330;
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (class264.method5279(var0, var6)) {
									var10000 = class103.field1330;
									var10000[var6] = (byte)(var10000[var6] | 2);
								}
							}
						}
					}

					var0.method8608();
					if (var4 != 0) {
						throw new RuntimeException();
					} else {
						class103.field1335 = 0;
						class103.field1346 = 0;

						for (var5 = 1; var5 < 2048; ++var5) {
							var10000 = class103.field1330;
							var10000[var5] = (byte)(var10000[var5] >> 1);
							class88 var8 = Client.field611[var5];
							if (var8 != null) {
								class103.field1341[++class103.field1335 - 1] = var5;
							} else {
								class103.field1338[++class103.field1346 - 1] = var5;
							}
						}

						class103.method4860(var0);
						if (var0.field4989 - var3 != var1) {
							throw new RuntimeException(var0.field4989 - var3 + " " + var1);
						}
					}
				}
			}
		}
	}
}
