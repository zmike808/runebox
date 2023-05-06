import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class25 extends class43 {
	byte[] field131;
	int field128;
	AudioFormat field129;
	SourceDataLine field130;

	class25() {
	}

	protected void method821() {
		this.field129 = new AudioFormat((float)class299.field307, 16, class48.field314 ? 2 : 1, true, false);
		this.field131 = new byte[256 << (class48.field314 ? 2 : 1)];
	}

	protected void method822(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field129, var1 << (class48.field314 ? 2 : 1));
			this.field130 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field130.open();
			this.field130.start();
			this.field128 = var1;
		} catch (LineUnavailableException var4) {
			if (class296.method290(var1) != 1) {
				this.method822(class296.method1988(var1));
			} else {
				this.field130 = null;
				throw var4;
			}
		}
	}

	protected int method823() {
		return this.field128 - (this.field130.available() >> (class48.field314 ? 2 : 1));
	}

	protected void method830() {
		int var1 = 256;
		if (class48.field314) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field301[var2];
			if (0 != (var3 + 8388608 & -16777216)) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field131[var2 * 2] = (byte)(var3 >> 8);
			this.field131[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.field130.write(this.field131, 0, var1 << 1);
	}

	protected void method825() {
		if (this.field130 != null) {
			this.field130.close();
			this.field130 = null;
		}

	}

	protected void method826() {
		this.field130.flush();
	}
}
