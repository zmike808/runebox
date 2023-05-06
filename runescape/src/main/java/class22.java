import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class22 implements class171, MouseWheelListener {
	int field114;

	class22() {
		this.field114 = 0;
	}

	void method310(Component var1) {
		var1.addMouseWheelListener(this);
	}

	void method309(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field114 += var1.getWheelRotation();
	}

	public synchronized int method3449() {
		int var2 = this.field114;
		this.field114 = 0;
		return var2;
	}
}
