import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class416 implements Runnable {
	byte[] field4614;
	int field4615;
	int field4616;
	int field4617;
	IOException field4611;
	InputStream field4613;
	Thread field4612;

	class416(InputStream var1, int var2) {
		this.field4615 = 0;
		this.field4617 = 0;
		this.field4613 = var1;
		this.field4616 = var2 + 1;
		this.field4614 = new byte[this.field4616];
		this.field4612 = new Thread(this);
		this.field4612.setDaemon(true);
		this.field4612.start();
	}

	public void run() {
		label49:
		while (true) {
			synchronized(this){}

			while (null == this.field4611) {
				int var1;
				if (this.field4615 == 0) {
					var1 = this.field4616 - this.field4617 - 1;
				} else if (this.field4615 <= this.field4617) {
					var1 = this.field4616 - this.field4617;
				} else {
					var1 = this.field4615 - this.field4617 - 1;
				}

				if (var1 > 0) {
					int var2;
					try {
						var2 = this.field4613.read(this.field4614, this.field4617, var1);
						if (var2 == -1) {
							throw new EOFException();
						}
					} catch (IOException var8) {
						synchronized(this){}
						this.field4611 = var8;
						return;
					}

					synchronized(this){}
					this.field4617 = (this.field4617 + var2) % this.field4616;
					continue label49;
				}

				try {
					this.wait();
				} catch (InterruptedException var7) {
				}
			}

			return;
		}
	}

	boolean method7736(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field4616) {
			synchronized(this){}
			int var4;
			if (this.field4615 <= this.field4617) {
				var4 = this.field4617 - this.field4615;
			} else {
				var4 = this.field4616 - this.field4615 + this.field4617;
			}

			if (var4 < var1) {
				if (this.field4611 != null) {
					throw new IOException(this.field4611.toString());
				} else {
					this.notifyAll();
					return false;
				}
			} else {
				return true;
			}
		} else {
			throw new IOException();
		}
	}

	int method7735() throws IOException {
		synchronized(this){}
		int var3;
		if (this.field4615 <= this.field4617) {
			var3 = this.field4617 - this.field4615;
		} else {
			var3 = this.field4616 - this.field4615 + this.field4617;
		}

		if (var3 <= 0 && null != this.field4611) {
			throw new IOException(this.field4611.toString());
		} else {
			this.notifyAll();
			return var3;
		}
	}

	int method7733() throws IOException {
		synchronized(this){}
		if (this.field4617 == this.field4615) {
			if (null != this.field4611) {
				throw new IOException(this.field4611.toString());
			} else {
				return -1;
			}
		} else {
			int var3 = this.field4614[this.field4615] & 255;
			this.field4615 = (this.field4615 + 1) % this.field4616;
			this.notifyAll();
			return var3;
		}
	}

	int method7737(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this){}
			int var6;
			if (this.field4615 <= this.field4617) {
				var6 = this.field4617 - this.field4615;
			} else {
				var6 = this.field4617 + (this.field4616 - this.field4615);
			}

			if (var3 > var6) {
				var3 = var6;
			}

			if (var3 == 0 && this.field4611 != null) {
				throw new IOException(this.field4611.toString());
			} else {
				if (this.field4615 + var3 <= this.field4616) {
					System.arraycopy(this.field4614, this.field4615, var1, var2, var3);
				} else {
					int var7 = this.field4616 - this.field4615;
					System.arraycopy(this.field4614, this.field4615, var1, var2, var7);
					System.arraycopy(this.field4614, 0, var1, var7 + var2, var3 - var7);
				}

				this.field4615 = (this.field4615 + var3) % this.field4616;
				this.notifyAll();
				return var3;
			}
		} else {
			throw new IOException();
		}
	}

	void method7749() {
		synchronized(this){}
		if (this.field4611 == null) {
			this.field4611 = new IOException("");
		}

		this.notifyAll();

		try {
			this.field4612.join();
		} catch (InterruptedException var4) {
		}

	}
}
