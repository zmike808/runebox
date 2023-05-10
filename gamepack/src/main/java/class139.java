import java.io.File;
import java.io.RandomAccessFile;

public class class139 extends class140 {
	int field1641;
	// $FF: synthetic field
	final class143 this$0;

	class139(class143 var1) {
		this.this$0 = var1;
		this.field1641 = -1;
	}

	void method3152(class489 var1) {
		this.field1641 = var1.method8660();
	}

	void method3151(class151 var1) {
		var1.method3214(this.field1641);
	}

	public static File method3144(String var0) {
		if (!class172.field1842) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)class172.field1843.get(var0);
			if (null != var2) {
				return var2;
			} else {
				File var3 = new File(Client.field5152, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						class172.field1843.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (null != var4) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static void method3145(int var0) {
		if (Client.field499 != var0) {
			if (Client.field499 == 30) {
				Client.field723.method4051();
			}

			if (0 == Client.field499) {
				Client.field466.method645();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				Client.method5491(0);
				Client.field524 = 0;
				Client.field525 = 0;
				Client.field516.method7342(var0);
				if (var0 != 20) {
					Client.method181(false);
				}
			}

			if (var0 != 20 && var0 != 40 && null != Client.field3825) {
				Client.field3825.method7711();
				Client.field3825 = null;
			}

			if (Client.field499 == 25) {
				Client.field622 = 0;
				Client.field560 = 0;
				Client.field726 = 1;
				Client.field558 = 0;
				Client.field559 = 1;
			}

			int var2;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var2 = 11 == Client.field499 ? 4 : 0;
					class26.method367(Client.field4217, Client.field4788, false, var2);
				} else if (var0 == 11) {
					class26.method367(Client.field4217, Client.field4788, false, 4);
				} else if (var0 == 50) {
					class72.method4061("", "Updating date of birth...", "");
					class26.method367(Client.field4217, Client.field4788, false, 7);
				} else {
					class72.method2300();
				}
			} else {
				var2 = Client.method3115() ? 0 : 12;
				class26.method367(Client.field4217, Client.field4788, true, var2);
			}

			Client.field499 = var0;
		}
	}
}
