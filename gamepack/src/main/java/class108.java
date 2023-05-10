import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class108 implements Runnable {
	int field1399;
	Queue field1398;
	final Thread field1400;
	volatile boolean field1397;

	class108(int var1) {
		this.field1398 = new LinkedList();
		this.field1400 = new Thread(this);
		this.field1400.setPriority(1);
		this.field1400.start();
		this.field1399 = var1;
	}

	abstract void method2756(class110 var1) throws IOException;

	public void run() {
		while (!this.field1397) {
			try {
				synchronized(this){}
				class110 var1 = (class110)this.field1398.poll();
				if (var1 == null) {
					try {
						this.wait();
					} catch (InterruptedException var5) {
					}
				} else {
					this.method2756(var1);
				}
			} catch (Exception var6) {
				class388.method7339((String)null, var6);
			}
		}

	}

	int method2757(URLConnection var1) {
		int var3 = class110.field1407;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var3 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var5) {
			}
		}

		return var3;
	}

	void method2773(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1399);
	}

	void method2776(URLConnection var1, class110 var2) {
		DataInputStream var4 = null;

		label38: {
			try {
				int var6 = var1.getContentLength();
				var4 = new DataInputStream(var1.getInputStream());
				byte[] var5;
				if (var6 >= 0) {
					var5 = new byte[var6];
					var4.readFully(var5);
				} else {
					var5 = new byte[0];
					byte[] var7 = class258.method5258(5000);

					byte[] var9;
					for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
						var9 = new byte[var8 + var5.length];
						System.arraycopy(var5, 0, var9, 0, var5.length);
						System.arraycopy(var7, 0, var9, var5.length, var8);
					}

					class83.method2195(var7);
				}

				var2.field1410 = var5;
			} catch (IOException var12) {
				var2.field1410 = null;
				var2.field1406 = this.method2757(var1);
				break label38;
			}

			var2.field1406 = this.method2757(var1);
		}

		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var11) {
			}
		}

	}

	public class110 method2764(URL var1) {
		class110 var3 = new class110(var1);
		synchronized(this){}
		this.field1398.add(var3);
		this.notify();
		return var3;
	}

	public void method2761() {
		this.field1397 = true;

		try {
			synchronized(this){}
			this.notify();
			this.field1400.join();
		} catch (InterruptedException var4) {
		}

	}

	static boolean method2781(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						return false;
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					return false;
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var1 * var6 + var11;
				if (var10 / var1 != var6) {
					return false;
				}

				var6 = var10;
				var5 = true;
			}

			return var5;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
