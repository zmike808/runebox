import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class471 {
	RandomAccessFile field4924;
	long field4922;
	final long field4923;

	public class471(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field4924 = new RandomAccessFile(var1, var2);
		this.field4923 = var3;
		this.field4922 = 0L;
		int var5 = this.field4924.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field4924.seek(0L);
			this.field4924.write(var5);
		}

		this.field4924.seek(0L);
	}

	final void method8418(long var1) throws IOException {
		this.field4924.seek(var1);
		this.field4922 = var1;
	}

	public final void method8433(byte[] var1, int var2, int var3) throws IOException {
		if (this.field4922 + (long)var3 > this.field4923) {
			this.field4924.seek(this.field4923);
			this.field4924.write(1);
			throw new EOFException();
		} else {
			this.field4924.write(var1, var2, var3);
			this.field4922 += (long)var3;
		}
	}

	public final void method8417() throws IOException {
		this.method8421(false);
	}

	public final void method8421(boolean var1) throws IOException {
		if (this.field4924 != null) {
			if (var1) {
				try {
					this.field4924.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field4924.close();
			this.field4924 = null;
		}

	}

	public final long method8422() throws IOException {
		return this.field4924.length();
	}

	public final int method8423(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field4924.read(var1, var2, var3);
		if (var5 > 0) {
			this.field4922 += (long)var5;
		}

		return var5;
	}

	protected void finalize() throws Throwable {
		if (this.field4924 != null) {
			System.out.println("");
			this.method8417();
		}

	}
}
