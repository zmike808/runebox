import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class26 implements KeyListener, FocusListener {
	boolean[] field135;
	class30[] field136;
	Collection field132;
	Collection field133;
	volatile int field134;

	class26() {
		this.field136 = new class30[3];
		this.field135 = new boolean[112];
		this.field134 = 0;
		this.field133 = new ArrayList(100);
		this.field132 = new ArrayList(100);
	}

	void method354(class30 var1, int var2) {
		this.field136[var2] = var1;
	}

	public int method355() {
		return this.field134;
	}

	void method356(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	synchronized void method371(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this){}
		this.field133.add(new class34(4, 0));
	}

	void method358() {
		++this.field134;
		this.method361();
		Iterator var2 = this.field132.iterator();

		while (var2.hasNext()) {
			class34 var3 = (class34)var2.next();

			for (int var4 = 0; var4 < this.field136.length && !var3.method500(this.field136[var4]); ++var4) {
			}
		}

		this.field132.clear();
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class29.field156.length;
				if (var2 < var4) {
					var2 = class29.method4750(var2);
					boolean var5 = 0 != (var2 & 128);
					if (var5) {
						var2 = -1;
					}
					break label23;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field135[var2] = true;
			this.field133.add(new class34(1, var2));
			this.field134 = 0;
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class29.field156.length;
				if (var2 < var4) {
					var2 = class29.method4750(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field135[var2] = false;
			this.field133.add(new class34(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class370.field4373;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var6 == var2) {
								var3 = true;
								break label47;
							}
						}
					}

					var3 = false;
				}
			} else {
				var3 = true;
			}

			if (var3) {
				this.field133.add(new class34(3, var2));
			}
		}

		var1.consume();
	}

	synchronized void method361() {
		Collection var2 = this.field132;
		this.field132 = this.field133;
		this.field133 = var2;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field133.add(new class34(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field135[var2]) {
				this.field135[var2] = false;
				this.field133.add(new class34(2, var2));
			}
		}

		this.field133.add(new class34(4, 0));
	}

	static void method367(class344 var0, class344 var1, boolean var2, int var3) {
		if (class72.field63) {
			if (var3 == 4) {
				class72.method3061(4);
			}

		} else {
			if (var3 == 0) {
				class72.method2044(var2);
			} else {
				class72.method3061(var3);
			}

			class499.method8985();
			byte[] var5 = var0.method6467("title.jpg", "");
			class72.field1498 = class31.method6357(var5);
			class72.field2125 = class72.field1498.method9094();
			int var6 = Client.field489;
			if ((var6 & 536870912) != 0) {
				class72.field123 = class297.method5550(var1, "logo_deadman_mode", "");
			} else if (0 != (var6 & 1073741824)) {
				class72.field123 = class297.method5550(var1, "logo_seasonal_mode", "");
			} else if ((var6 & 256) != 0) {
				class72.field123 = class297.method5550(var1, "logo_speedrunning", "");
			} else {
				class72.field123 = class297.method5550(var1, "logo", "");
			}

			class7.field914 = class297.method5550(var1, "titlebox", "");
			class7.field3362 = class297.method5550(var1, "titlebutton", "");
			class7.field4718 = class297.method5550(var1, "titlebutton_large", "");
			class7.field4399 = class297.method5550(var1, "play_now_text", "");
			class297.method5550(var1, "titlebutton_wide42,1", "");
			class72.field4534 = class504.method6113(var1, "runes", "");
			class7.field1704 = class504.method6113(var1, "title_mute", "");
			class72.field893 = class297.method5550(var1, "options_radio_buttons,0", "");
			class7.field894 = class297.method5550(var1, "options_radio_buttons,4", "");
			class7.field1767 = class297.method5550(var1, "options_radio_buttons,2", "");
			class7.field908 = class297.method5550(var1, "options_radio_buttons,6", "");
			class72.field993 = class72.field893.field5081;
			class72.field2097 = class72.field893.field5082;
			class72.field1471 = new class93(class72.field4534);
			if (var2) {
				class72.field930 = "";
				class72.field909 = "";
				class72.field911 = new String[8];
				class72.field910 = 0;
			}

			Client.field2331 = 0;
			class72.field1374 = "";
			class72.field915 = true;
			class72.field919 = false;
			if (!Client.field112.method2478()) {
				class298.method5488(2, Client.field4548, "scape main", "", 255, false);
			} else {
				class298.field3389 = 1;
				Client.field3388 = null;
				Client.field4411 = -1;
				Client.field1913 = -1;
				Client.field1324 = 0;
				Client.field1459 = false;
				Client.field1789 = 2;
			}

			class178.method3487(false);
			class72.field63 = true;
			class72.field907 = (class35.field211 - 765) / 2;
			class72.field896 = class72.field907 + 202;
			class72.field1671 = 180 + class72.field896;
			class72.field1498.method9104(class72.field907, 0);
			class72.field2125.method9104(382 + class72.field907, 0);
			class72.field123.method9072(382 + class72.field907 - class72.field123.field5081 / 2, 18);
		}
	}

	static final void method380() {
		for (class90 var1 = (class90)Client.field574.method6716(); var1 != null; var1 = (class90)Client.field574.method6725()) {
			if (var1.field1132 == -1) {
				var1.field1126 = 0;
				class106.method2704(var1);
			} else {
				var1.method8051();
			}
		}

	}

	static int method353(class317 var0) {
		class448 var2 = (class448)Client.field703.method8381((long)var0.field3571 + ((long)var0.field3570 << 32));
		return var2 != null ? var2.field4744 : var0.field3704;
	}
}
