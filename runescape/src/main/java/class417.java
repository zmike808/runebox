import java.io.IOException;
import java.io.OutputStream;

public class class417 implements Runnable {
	boolean field4626;
	byte[] field4622;
	int field4621;
	int field4624;
	int field4627;
	IOException field4620;
	OutputStream field4619;
	Thread field4625;

	class417(OutputStream var1, int var2) {
		this.field4627 = 0;
		this.field4624 = 0;
		this.field4619 = var1;
		this.field4621 = var2 + 1;
		this.field4622 = new byte[this.field4621];
		this.field4625 = new Thread(this);
		this.field4625.setDaemon(true);
		this.field4625.start();
	}

	boolean method7758() {
		if (this.field4626) {
			try {
				this.field4619.close();
				if (this.field4620 == null) {
					this.field4620 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.field4620 == null) {
					this.field4620 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public void run() {
		label58:
		while (true) {
			synchronized(this){}

			while (null == this.field4620) {
				int var1;
				if (this.field4627 <= this.field4624) {
					var1 = this.field4624 - this.field4627;
				} else {
					var1 = this.field4624 + (this.field4621 - this.field4627);
				}

				if (var1 > 0) {
					try {
						if (this.field4627 + var1 <= this.field4621) {
							this.field4619.write(this.field4622, this.field4627, var1);
						} else {
							int var2 = this.field4621 - this.field4627;
							this.field4619.write(this.field4622, this.field4627, var2);
							this.field4619.write(this.field4622, 0, var1 - var2);
						}
					} catch (IOException var7) {
						synchronized(this){}
						this.field4620 = var7;
						return;
					}

					synchronized(this){}
					this.field4627 = (this.field4627 + var1) % this.field4621;
					if (!this.method7758()) {
						continue label58;
					}

					return;
				}

				try {
					this.field4619.flush();
				} catch (IOException var8) {
					this.field4620 = var8;
					return;
				}

				if (this.method7758()) {
					return;
				}

				try {
					this.wait();
				} catch (InterruptedException var9) {
				}
			}

			return;
		}
	}

	void method7767(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this){}
			if (null != this.field4620) {
				throw new IOException(this.field4620.toString());
			} else {
				int var6;
				if (this.field4627 <= this.field4624) {
					var6 = this.field4627 + (this.field4621 - this.field4624) - 1;
				} else {
					var6 = this.field4627 - this.field4624 - 1;
				}

				if (var6 < var3) {
					throw new IOException("");
				} else {
					if (this.field4624 + var3 <= this.field4621) {
						System.arraycopy(var1, var2, this.field4622, this.field4624, var3);
					} else {
						int var7 = this.field4621 - this.field4624;
						System.arraycopy(var1, var2, this.field4622, this.field4624, var7);
						System.arraycopy(var1, var7 + var2, this.field4622, 0, var3 - var7);
					}

					this.field4624 = (this.field4624 + var3) % this.field4621;
					this.notifyAll();
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method7759() {
		synchronized(this){}
		this.field4626 = true;
		this.notifyAll();

		try {
			this.field4625.join();
		} catch (InterruptedException var4) {
		}

	}
}
