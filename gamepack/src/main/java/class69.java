import java.math.BigInteger;

public class class69 {
	static final BigInteger field872;
	static final BigInteger field875;

	static {
		field875 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field872 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	static void method1981(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < Client.field1063; ++var5) {
			class202 var6 = class92.method2352(var5);
			if ((!var1 || var6.field2263) && var6.field2254 == -1 && var6.field2261.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					Client.field3040 = -1;
					Client.field4549 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[var3.length * 2];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		Client.field4549 = var3;
		class302.field4876 = 0;
		Client.field3040 = var4;
		String[] var9 = new String[Client.field3040];

		for (int var10 = 0; var10 < Client.field3040; ++var10) {
			var9[var10] = class92.method2352(var3[var10]).field2261;
		}

		class486.method6634(var9, Client.field4549);
	}
}
