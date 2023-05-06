import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class33 extends class500 {
	Component field185;
	Image field186;

	class33(int var1, int var2, Component var3, boolean var4) {
		super.field5069 = var1;
		super.field5071 = var2;
		super.field5070 = new int[1 + var1 * var2];
		if (var4) {
			super.field5072 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.field5070, super.field5070.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field5069, super.field5071), var5, (Point)null);
		this.field186 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method483(var3);
		this.method9050();
	}

	final void method483(Component var1) {
		this.field185 = var1;
	}

	public final void method9051(int var1, int var2) {
		this.method487(this.field185.getGraphics(), var1, var2);
	}

	public final void method9052(int var1, int var2, int var3, int var4) {
		this.method485(this.field185.getGraphics(), var1, var2, var3, var4);
	}

	final void method487(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field186, var2, var3, this.field185);
		} catch (Exception var6) {
			this.field185.repaint();
		}

	}

	final void method485(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field186, 0, 0, this.field185);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field185.repaint();
		}

	}
}
