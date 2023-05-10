public class class260 {
	final int field3008;
	final int field3009;
	final int field3010;

	class260(int var1, int var2, int var3) {
		this.field3010 = var1;
		this.field3009 = var2;
		this.field3008 = var3;
	}

	static final void method5271(String var0, boolean var1) {
		if (Client.field610) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = Client.field2832.method7240(var0, 250);
			int var7 = Client.field2832.method7198(var0, 250) * 13;
			class499.method9012(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 0);
			class499.method9041(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 16777215);
			Client.field2832.method7155(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			int var8 = var4 - var3;
			int var9 = var5 - var3;
			int var10 = var6 + var3 + var3;
			int var11 = var3 + var7 + var3;

			for (int var12 = 0; var12 < Client.field781; ++var12) {
				if (Client.field640[var12] + Client.field709[var12] > var8 && Client.field709[var12] < var10 + var8 && Client.field710[var12] + Client.field712[var12] > var9 && Client.field710[var12] < var9 + var11) {
					Client.field706[var12] = true;
				}
			}

			if (var1) {
				class35.field2381.method9051(0, 0);
			} else {
				class404.method7507(var4, var5, var6, var7);
			}

		}
	}
}
