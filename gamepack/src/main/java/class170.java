import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class170 {
	public static class472 field1835;
	public static class472 field1836;
	public static class472 field1841;
	public static String[] field1292;
	public static String[] field1577;
	static File field1832;

	static {
		field1835 = null;
		field1836 = null;
		field1841 = null;
	}

	public static void method2166() {
		try {
			File var1 = new File(Client.field2000, "random.dat");
			int var3;
			if (var1.exists()) {
				field1835 = new class472(new class471(var1, "rw", 25L), 24, 0);
			} else {
				label34:
				for (int var2 = 0; var2 < field1292.length; ++var2) {
					for (var3 = 0; var3 < field1577.length; ++var3) {
						File var4 = new File(field1577[var3] + field1292[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							field1835 = new class472(new class471(var4, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}

			if (field1835 == null) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				field1835 = new class472(new class471(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	public static void method3501(class489 var0, int var1) {
		if (null != field1835) {
			try {
				field1835.method8437(0L);
				field1835.method8443(var0.field4991, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
