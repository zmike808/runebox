import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class168 implements Runnable {
	boolean field1820;
	class177 field1819;
	class177 field1821;
	Thread field1822;

	public class168() {
		this.field1819 = null;
		this.field1821 = null;
		this.field1820 = false;
		class35.field1817 = "Unknown";
		class516.field1818 = "1.6";

		try {
			class35.field1817 = System.getProperty("java.vendor");
			class516.field1818 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field1820 = false;
		this.field1822 = new Thread(this);
		this.field1822.setPriority(10);
		this.field1822.setDaemon(true);
		this.field1822.start();
	}

	public final void method3419() {
		synchronized(this){}
		this.field1820 = true;
		this.notifyAll();

		try {
			this.field1822.join();
		} catch (InterruptedException var4) {
		}

	}

	public final void run() {
		label45:
		while (true) {
			synchronized(this){}

			while (!this.field1820) {
				if (null != this.field1819) {
					class177 var1 = this.field1819;
					this.field1819 = this.field1819.field1882;
					if (this.field1819 == null) {
						this.field1821 = null;
					}

					try {
						int var2 = var1.field1885;
						if (var2 == 1) {
							var1.field1888 = new Socket(InetAddress.getByName((String)var1.field1887), var1.field1881);
						} else if (var2 == 2) {
							Thread var3 = new Thread((Runnable)var1.field1887);
							var3.setDaemon(true);
							var3.start();
							var3.setPriority(var1.field1881);
							var1.field1888 = var3;
						} else if (var2 == 4) {
							var1.field1888 = new DataInputStream(((URL)var1.field1887).openStream());
						}

						var1.field1884 = 1;
						continue label45;
					} catch (ThreadDeath var5) {
						throw var5;
					} catch (Throwable var6) {
						var1.field1884 = 2;
						continue label45;
					}
				}

				try {
					this.wait();
				} catch (InterruptedException var7) {
				}
			}

			return;
		}
	}

	final class177 method3424(int var1, int var2, int var3, Object var4) {
		class177 var6 = new class177();
		var6.field1885 = var1;
		var6.field1881 = var2;
		var6.field1887 = var4;
		synchronized(this){}
		if (null != this.field1821) {
			this.field1821.field1882 = var6;
			this.field1821 = var6;
		} else {
			this.field1821 = this.field1819 = var6;
		}

		this.notify();
		return var6;
	}

	public final class177 method3421(String var1, int var2) {
		return this.method3424(1, var2, 0, var1);
	}

	public final class177 method3422(Runnable var1, int var2) {
		return this.method3424(2, var2, 0, var1);
	}

	static int method3431(int var0, class75 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			class67.field836 -= 2;
			var4 = class67.field843[class67.field836];
			int var5 = class67.field843[class67.field836 + 1];
			if (!Client.field746) {
				Client.field595 = var4;
				Client.field758 = var5;
			}

			return 1;
		} else if (var0 == 5505) {
			class67.field843[++class67.field836 - 1] = Client.field595;
			return 1;
		} else if (var0 == 5506) {
			class67.field843[++class67.field836 - 1] = Client.field758;
			return 1;
		} else if (var0 == 5530) {
			var4 = class67.field843[--class67.field836];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.field771 = var4;
			return 1;
		} else if (var0 == 5531) {
			class67.field843[++class67.field836 - 1] = Client.field771;
			return 1;
		} else {
			return 2;
		}
	}
}
