import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class class14 extends DefaultTlsClient {
	// $FF: synthetic field
	final class13 this$1;

	class14(class13 var1) {
		this.this$1 = var1;
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (null == var1) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@Override
	public TlsAuthentication getAuthentication() throws IOException {
		return null;
	}

	static void method174(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var8 = var0;
			class64 var9 = class64.field179[var7];
			class64.field179[var7] = class64.field179[var1];
			class64.field179[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				class64 var12 = class64.field179[var10];
				int var13 = class298.method5553(var12, var9, var2, var3);
				int var11;
				if (var13 != 0) {
					if (var3) {
						var11 = -var13;
					} else {
						var11 = var13;
					}
				} else if (var4 == -1) {
					var11 = 0;
				} else {
					int var14 = class298.method5553(var12, var9, var4, var5);
					if (var5) {
						var11 = -var14;
					} else {
						var11 = var14;
					}
				}

				if (var11 <= 0) {
					class64 var15 = class64.field179[var10];
					class64.field179[var10] = class64.field179[var8];
					class64.field179[var8++] = var15;
				}
			}

			class64.field179[var1] = class64.field179[var8];
			class64.field179[var8] = var9;
			method174(var0, var8 - 1, var2, var3, var4, var5);
			method174(var8 + 1, var1, var2, var3, var4, var5);
		}

	}

	static final byte[] method177(byte[] var0) {
		class489 var2 = new class489(var0);
		int var3 = var2.method8658();
		int var4 = var2.method8664();
		if (var4 >= 0 && (0 == class344.field4221 || var4 <= class344.field4221)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.method8676(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.method8664();
				if (var5 < 0 || 0 != class344.field4221 && var5 > class344.field4221) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						class492.method8932(var6, var5, var0, var4, 9);
					} else {
						class344.field4233.method9248(var2, var6);
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	static int method176(int var0, class75 var1, boolean var2) {
		class317 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? class67.field329 : class67.field6;
				var9 = class67.field843[--class67.field836];
				if (var9 >= 1 && var9 <= 10) {
					class98 var10 = new class98(var9, var4.field3570, var4.field3571, var4.field3703);
					class67.field838.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				class67.field836 -= 3;
				int var8 = class67.field843[class67.field836];
				var9 = class67.field843[class67.field836 + 1];
				int var6 = class67.field843[2 + class67.field836];
				if (var6 >= 1 && var6 <= 10) {
					class98 var7 = new class98(var6, var8, var9, class166.method3349(var8).field3703);
					class67.field838.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (class67.field853 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = class166.method3349(class67.field843[--class67.field836]);
			} else {
				var4 = var2 ? class67.field329 : class67.field6;
			}

			if (var4.field3691 == null) {
				return 0;
			} else {
				class84 var5 = new class84();
				var5.field1048 = var4;
				var5.field1052 = var4.field3691;
				var5.field1050 = 1 + class67.field853;
				Client.field699.method6711(var5);
				return 1;
			}
		}
	}

	static boolean method173(class88 var0) {
		if (0 == Client.field612) {
			return false;
		} else {
			boolean var2;
			if (var0 != Client.field3454) {
				var2 = (Client.field612 & 4) != 0;
				boolean var3 = var2;
				boolean var4;
				if (!var2) {
					var4 = 0 != (Client.field612 & 1);
					var3 = var4 && var0.method2233();
				}

				var4 = var3;
				if (!var3) {
					boolean var5 = 0 != (Client.field612 & 2);
					var4 = var5 && var0.method2276();
				}

				return var4;
			} else {
				var2 = 0 != (Client.field612 & 8);
				return var2;
			}
		}
	}

	static final void method166(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class45.method882(var0)) {
			Client.field2878 = null;
			class12.method103(Client.field2057[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (null != Client.field2878) {
				class12.method103(Client.field2878, -1412584499, var1, var2, var3, var4, Client.field2685, Client.field1329, var7);
				Client.field2878 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field706[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					Client.field706[var9] = true;
				}
			}

		}
	}
}
