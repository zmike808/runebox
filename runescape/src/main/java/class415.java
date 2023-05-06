import java.io.IOException;
import java.net.Socket;

public class class415 extends class414 {
	class416 field4609;
	class417 field4608;
	Socket field4610;

	class415(Socket var1, int var2, int var3) throws IOException {
		this.field4610 = var1;
		this.field4610.setSoTimeout(30000);
		this.field4610.setTcpNoDelay(true);
		this.field4610.setReceiveBufferSize(65536);
		this.field4610.setSendBufferSize(65536);
		this.field4609 = new class416(this.field4610.getInputStream(), var2);
		this.field4608 = new class417(this.field4610.getOutputStream(), var3);
	}

	public boolean method7729(int var1) throws IOException {
		return this.field4609.method7736(var1);
	}

	public int method7707() throws IOException {
		return this.field4609.method7735();
	}

	public int method7715() throws IOException {
		return this.field4609.method7733();
	}

	public int method7713(byte[] var1, int var2, int var3) throws IOException {
		return this.field4609.method7737(var1, var2, var3);
	}

	public void method7710(byte[] var1, int var2, int var3) throws IOException {
		this.field4608.method7767(var1, var2, var3);
	}

	public void method7711() {
		this.field4608.method7759();

		try {
			this.field4610.close();
		} catch (IOException var3) {
		}

		this.field4609.method7749();
	}

	protected void finalize() {
		this.method7711();
	}

	public static class379 method7732(class344 var0, class344 var1, String var2, String var3) {
		if (!var0.method6466(var2, var3)) {
			return null;
		} else {
			int var5 = var0.method6464(var2);
			int var6 = var0.method6450(var5, var3);
			byte[] var9 = var0.method6468(var5, var6);
			boolean var8;
			if (null == var9) {
				var8 = false;
			} else {
				class486.method8595(var9);
				var8 = true;
			}

			class379 var7;
			if (!var8) {
				var7 = null;
			} else {
				byte[] var10 = var1.method6468(var5, var6);
				class379 var12;
				if (null == var10) {
					var12 = null;
				} else {
					class379 var11 = new class379(var10, class504.field5101, class504.field94, class504.field1302, class504.field1644, class504.field4525, class504.field2113);
					class504.method7448();
					var12 = var11;
				}

				var7 = var12;
			}

			return var7;
		}
	}
}
