import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;

public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {
	protected static class168 field201;
	protected static class26 field217;
	protected static int field204;
	public static class500 field2381;
	public static int field211;
	public static int field3026;
	public static String field1817;
	static boolean field223;
	static class179 field4547;
	static class35 field197;
	static int field198;
	static int field202;
	static int field203;
	static int field220;
	static int field2521;
	static int field3738;
	static int field3835;
	static Font field2858;
	static FontMetrics field149;
	static Image field1395;
	static GarbageCollectorMXBean field3353;
	static long field227;
	static long field229;
	static long field230;
	static long[] field206;
	static long[] field218;
	static volatile boolean field208;
	boolean field200;
	boolean field221;
	class22 field224;
	int field199;
	int field210;
	int field212;
	int field213;
	int field214;
	int field225;
	Canvas field196;
	Frame field215;
	Clipboard field228;
	final EventQueue field226;
	protected boolean field216;
	protected int field207;
	protected int field209;
	volatile boolean field219;
	volatile boolean field222;
	volatile long field205;

	static {
		field197 = null;
		field198 = 0;
		field227 = 0L;
		field223 = false;
		field202 = 20;
		field203 = 1;
		field204 = 0;
		field218 = new long[32];
		field206 = new long[32];
		field220 = 500;
		field208 = true;
		field217 = new class26();
		field229 = -1L;
		field230 = -1L;
	}

	protected class35() {
		this.field200 = false;
		this.field225 = 0;
		this.field210 = 0;
		this.field216 = false;
		this.field219 = true;
		this.field221 = false;
		this.field222 = false;
		this.field205 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field226 = var1;
		class23 var2 = new class23();
		class43.field300 = var2;
	}

	protected abstract void method527();

	protected abstract void method538();

	protected abstract void method542();

	protected abstract void method545(boolean var1);

	protected abstract void method550();

	protected abstract void method553();

	public abstract void init();

	protected final void method523(int var1, int var2) {
		if (var1 != this.field214 || this.field199 != var2) {
			this.method601();
		}

		this.field214 = var1;
		this.field199 = var2;
	}

	final void method517(Object var1) {
		if (null != this.field226) {
			for (int var3 = 0; var3 < 50 && this.field226.peekEvent() != null; ++var3) {
				class295.method5844(1L);
			}

			if (null != var1) {
				this.field226.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	protected class171 method518() {
		if (this.field224 == null) {
			this.field224 = new class22();
			this.field224.method310(this.field196);
		}

		return this.field224;
	}

	protected void method644() {
		this.field228 = this.getToolkit().getSystemClipboard();
	}

	protected void method556(String var1) {
		this.field228.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	protected Clipboard method521() {
		return this.field228;
	}

	protected final void method522() {
		class159.method3300();
		field217.method356(this.field196);
	}

	protected final void method541() {
		field217.method358();
	}

	protected void method524(class30 var1, int var2) {
		field217.method354(var1, var2);
	}

	protected final void method650() {
		class36.method7411(this.field196);
	}

	final void method539() {
		Container var2 = this.method631();
		if (null != var2) {
			class421 var3 = this.method551();
			this.field207 = Math.max(var3.field4648, this.field212);
			this.field209 = Math.max(var3.field4651, this.field213);
			if (this.field207 <= 0) {
				this.field207 = 1;
			}

			if (this.field209 <= 0) {
				this.field209 = 1;
			}

			field211 = Math.min(this.field207, this.field214);
			field3026 = Math.min(this.field209, this.field199);
			this.field225 = (this.field207 - field211) / 2;
			this.field210 = 0;
			this.field196.setSize(field211, field3026);
			field2381 = new class33(field211, field3026, this.field196, this.field216);
			if (var2 == this.field215) {
				Insets var4 = this.field215.getInsets();
				this.field196.setLocation(var4.left + this.field225, this.field210 + var4.top);
			} else {
				this.field196.setLocation(this.field225, this.field210);
			}

			this.field219 = true;
			this.method527();
		}
	}

	void method684() {
		int var2 = this.field225;
		int var3 = this.field210;
		int var4 = this.field207 - field211 - var2;
		int var5 = this.field209 - field3026 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method631();
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.field215) {
					Insets var9 = this.field215.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field209);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field207, var3);
				}

				if (var4 > 0) {
					var11.fillRect(var7 + this.field207 - var4, var8, var4, this.field209);
				}

				if (var5 > 0) {
					var11.fillRect(var7, var8 + this.field209 - var5, this.field207, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	final void method519() {
		field217.method371(this.field196);
		Canvas var2 = this.field196;
		var2.removeMouseListener(class36.field235);
		var2.removeMouseMotionListener(class36.field235);
		var2.removeFocusListener(class36.field235);
		class36.field237 = 0;
		if (this.field224 != null) {
			this.field224.method309(this.field196);
		}

		this.method531();
		field217.method356(this.field196);
		class36.method7411(this.field196);
		if (this.field224 != null) {
			this.field224.method310(this.field196);
		}

		this.method601();
	}

	protected final void method613(int var1, int var2, int var3, int var4) {
		try {
			if (null != field197) {
				++field198;
				if (field198 >= 3) {
					this.method549("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field197 = this;
			field211 = var1;
			field3026 = var2;
			class516.field5155 = var3;
			class516.field4732 = var4;
			class516.field1322 = this;
			if (null == field201) {
				field201 = new class168();
			}

			field201.method3422(this, 1);
		} catch (Exception var7) {
			class388.method7339((String)null, var7);
			this.method549("crash");
		}

	}

	final synchronized void method531() {
		Container var2 = this.method631();
		if (null != this.field196) {
			this.field196.removeFocusListener(this);
			var2.remove(this.field196);
		}

		field211 = Math.max(var2.getWidth(), this.field212);
		field3026 = Math.max(var2.getHeight(), this.field213);
		Insets var3;
		if (null != this.field215) {
			var3 = this.field215.getInsets();
			field211 -= var3.right + var3.left;
			field3026 -= var3.bottom + var3.top;
		}

		this.field196 = new class24(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field196);
		this.field196.setSize(field211, field3026);
		this.field196.setVisible(true);
		this.field196.setBackground(Color.BLACK);
		if (this.field215 == var2) {
			var3 = this.field215.getInsets();
			this.field196.setLocation(var3.left + this.field225, var3.top + this.field210);
		} else {
			this.field196.setLocation(this.field225, this.field210);
		}

		this.field196.addFocusListener(this);
		this.field196.requestFocus();
		this.field219 = true;
		if (null != field2381 && field2381.field5069 == field211 && field3026 == field2381.field5071) {
			((class33)field2381).method483(this.field196);
			field2381.method9051(0, 0);
		} else {
			field2381 = new class33(field211, field3026, this.field196, this.field216);
		}

		this.field222 = false;
		this.field205 = class294.method2575();
	}

	protected void method532(boolean var1) {
		if (var1 != this.field216) {
			this.field216 = var1;
			field2381.method9053(var1);
			field2381.method9050();
		}

	}

	protected final boolean method533() {
		String var2 = this.getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (var2.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
						var2 = var2.substring(0, var2.length() - 1);
					}

					if (var2.endsWith("192.168.1.")) {
						return true;
					} else {
						this.method549("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void run() {
		try {
			if (null != field1817) {
				String var1 = field1817.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class516.field1818;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method549("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class150.method3204(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class372.method5232(var4) && class372.method5513(var4) < 10) {
							this.method549("wrongjava");
							return;
						}
					}

					field203 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method531();
			this.method550();
			field4547 = class179.method3200();

			while (field227 == 0L || class294.method2575() < field227) {
				field3738 = field4547.method3489(field202, field203);

				for (int var6 = 0; var6 < field3738; ++var6) {
					this.method534();
				}

				this.method543();
				this.method517(this.field196);
			}
		} catch (Exception var5) {
			class388.method7339((String)null, var5);
			this.method549("crash");
		}

		this.method548();
	}

	void method534() {
		long var2 = class294.method2575();
		long var4 = field206[field3835];
		field206[field3835] = var2;
		field3835 = field3835 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
		}

		synchronized(this){}
		Client.field3732 = field208;
		this.method538();
	}

	void method543() {
		Container var2 = this.method631();
		long var3 = class294.method2575();
		long var5 = field218[field2521];
		field218[field2521] = var3;
		field2521 = 1 + field2521 & 31;
		if (0L != var5 && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field204 = (32000 + (var7 >> 1)) / var7;
		}

		if (++field220 - 1 > 50) {
			field220 -= 50;
			this.field219 = true;
			this.field196.setSize(field211, field3026);
			this.field196.setVisible(true);
			if (var2 == this.field215) {
				Insets var8 = this.field215.getInsets();
				this.field196.setLocation(this.field225 + var8.left, var8.top + this.field210);
			} else {
				this.field196.setLocation(this.field225, this.field210);
			}
		}

		if (this.field222) {
			this.method519();
		}

		this.method536();
		this.method545(this.field219);
		if (this.field219) {
			this.method684();
		}

		this.field219 = false;
	}

	final void method536() {
		class421 var2 = this.method551();
		if (var2.field4648 != this.field207 || this.field209 != var2.field4651 || this.field221) {
			this.method539();
			this.field221 = false;
		}

	}

	final void method601() {
		this.field221 = true;
	}

	final synchronized void method548() {
		if (!field223) {
			field223 = true;

			try {
				this.field196.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method542();
			} catch (Exception var5) {
			}

			if (this.field215 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (null != field201) {
				try {
					field201.method3419();
				} catch (Exception var3) {
				}
			}

			this.method553();
		}
	}

	public final void start() {
		if (field197 == this && !field223) {
			field227 = 0L;
		}
	}

	public final void stop() {
		if (field197 == this && !field223) {
			field227 = class294.method2575() + 4000L;
		}
	}

	public final void destroy() {
		if (this == field197 && !field223) {
			field227 = class294.method2575();
			class295.method5844(5000L);
			this.method548();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final synchronized void paint(Graphics var1) {
		if (field197 == this && !field223) {
			this.field219 = true;
			if (class294.method2575() - this.field205 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= field211 && var2.height >= field3026) {
					this.field222 = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		field208 = true;
		this.field219 = true;
	}

	public final void focusLost(FocusEvent var1) {
		field208 = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	protected final void method547(int var1, String var2, boolean var3) {
		try {
			Graphics var5 = this.field196.getGraphics();
			if (null == field2858) {
				field2858 = new Font("Helvetica", 1, 13);
				field149 = this.field196.getFontMetrics(field2858);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, field211, field3026);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (field1395 == null) {
					field1395 = this.field196.createImage(304, 34);
				}

				Graphics var7 = field1395.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(field2858);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - field149.stringWidth(var2)) / 2, 22);
				var5.drawImage(field1395, field211 / 2 - 152, field3026 / 2 - 18, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = field211 / 2 - 152;
				int var9 = field3026 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(field2858);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - field149.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.field196.repaint();
		}

	}

	protected final void method645() {
		field1395 = null;
		field2858 = null;
		field149 = null;
	}

	protected void method549(String var1) {
		if (!this.field200) {
			this.field200 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	Container method631() {
		return (Container)(null != this.field215 ? this.field215 : this);
	}

	class421 method551() {
		Container var2 = this.method631();
		int var3 = Math.max(var2.getWidth(), this.field212);
		int var4 = Math.max(var2.getHeight(), this.field213);
		if (null != this.field215) {
			Insets var5 = this.field215.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.top + var5.bottom;
		}

		return new class421(var3, var4);
	}

	protected final boolean method669() {
		return this.field215 != null;
	}
}
