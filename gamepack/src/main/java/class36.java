import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class36 implements MouseListener, MouseMotionListener, FocusListener {
	public static class36 field235;
	public static int field232;
	public static int field242;
	public static int field243;
	public static int field250;
	public static int field251;
	public static int field252;
	public static long field246;
	public static long field249;
	public static volatile int field236;
	public static volatile int field237;
	public static volatile int field238;
	public static volatile int field239;
	public static volatile int field244;
	public static volatile int field245;
	public static volatile int field247;
	public static volatile long field241;
	public static volatile long field248;

	static {
		field235 = new class36();
		field239 = 0;
		field237 = 0;
		field238 = -1;
		field245 = -1;
		field241 = -1L;
		field232 = 0;
		field242 = 0;
		field243 = 0;
		field246 = 0L;
		field244 = 0;
		field236 = 0;
		field247 = 0;
		field248 = 0L;
		field252 = 0;
		field250 = 0;
		field251 = 0;
		field249 = 0L;
	}

	class36() {
	}

	final int method687(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (field235 != null) {
			field239 = 0;
			field236 = var1.getX();
			field247 = var1.getY();
			field248 = class294.method2575();
			field244 = this.method687(var1);
			if (0 != field244) {
				field237 = field244;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (null != field235) {
			field239 = 0;
			field237 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (field235 != null) {
			field239 = 0;
			field238 = -1;
			field245 = -1;
			field241 = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (null != field235) {
			field239 = 0;
			field238 = var1.getX();
			field245 = var1.getY();
			field241 = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (null != field235) {
			field237 = 0;
		}

	}

	static void method7411(Component var0) {
		var0.addMouseListener(field235);
		var0.addMouseMotionListener(field235);
		var0.addFocusListener(field235);
	}

	public static void method1969() {
		if (field235 != null) {
			class36 var1;
			synchronized(var1 = field235){}
			field235 = null;
		}

	}

	public static boolean method715(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var2 = class370.field4373;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var4 == var0) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	public static int method2072() {
		return ++field239 - 1;
	}

	static int method714(int var0, class75 var1, boolean var2) {
		class317 var4 = class166.method3349(class67.field843[--class67.field836]);
		if (var0 == 2600) {
			class67.field843[++class67.field836 - 1] = var4.field3591;
			return 1;
		} else if (var0 == 2601) {
			class67.field843[++class67.field836 - 1] = var4.field3592;
			return 1;
		} else if (var0 == 2602) {
			class67.field842[++class67.field1015 - 1] = var4.field3716;
			return 1;
		} else if (var0 == 2603) {
			class67.field843[++class67.field836 - 1] = var4.field3593;
			return 1;
		} else if (var0 == 2604) {
			class67.field843[++class67.field836 - 1] = var4.field3594;
			return 1;
		} else if (var0 == 2605) {
			class67.field843[++class67.field836 - 1] = var4.field3619;
			return 1;
		} else if (var0 == 2606) {
			class67.field843[++class67.field836 - 1] = var4.field3622;
			return 1;
		} else if (var0 == 2607) {
			class67.field843[++class67.field836 - 1] = var4.field3711;
			return 1;
		} else if (var0 == 2608) {
			class67.field843[++class67.field836 - 1] = var4.field3566;
			return 1;
		} else if (var0 == 2609) {
			class67.field843[++class67.field836 - 1] = var4.field3601;
			return 1;
		} else if (var0 == 2610) {
			class67.field843[++class67.field836 - 1] = var4.field3602;
			return 1;
		} else if (var0 == 2611) {
			class67.field843[++class67.field836 - 1] = var4.field3595;
			return 1;
		} else if (var0 == 2612) {
			class67.field843[++class67.field836 - 1] = var4.field3596;
			return 1;
		} else if (var0 == 2613) {
			class67.field843[++class67.field836 - 1] = var4.field3600.method6674();
			return 1;
		} else if (var0 == 2614) {
			class67.field843[++class67.field836 - 1] = var4.field3630 ? 1 : 0;
			return 1;
		} else {
			class310 var5;
			if (var0 == 2617) {
				var5 = var4.method6154();
				class67.field843[++class67.field836 - 1] = null != var5 ? var5.field3494 : 0;
			}

			if (var0 == 2618) {
				var5 = var4.method6154();
				class67.field843[++class67.field836 - 1] = var5 != null ? var5.field3490 : 0;
				return 1;
			} else {
				class315 var8;
				if (var0 == 2619) {
					var8 = var4.method6152();
					class67.field842[++class67.field1015 - 1] = null != var8 ? var8.method5896().method7007() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method6154();
					class67.field843[++class67.field836 - 1] = null != var5 ? var5.field3492 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5906() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null ? var8.method6089() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5859() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null && var8.method5898() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method6152();
						class67.field842[++class67.field1015 - 1] = null != var8 ? var8.method5897().method7264() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method6152();
						int var6 = null != var8 ? var8.method5902() : 0;
						int var7 = null != var8 ? var8.method5901() : 0;
						class67.field843[++class67.field836 - 1] = Math.min(var6, var7);
						class67.field843[++class67.field836 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5901() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = null != var8 ? var8.method5908() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5909() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = null != var8 ? var8.method5911() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = null != var8 ? var8.method5912() : 0;
						return 1;
					} else {
						class28 var9;
						if (var0 == 2633) {
							var9 = var4.method6127();
							class67.field843[class67.field836 - 1] = var9 != null ? var9.method410(class67.field843[class67.field836 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method6127();
							class67.field843[class67.field836 - 1] = var9 != null ? var9.method411((char)class67.field843[class67.field836 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null && var8.method5899() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static void method712(class88 var0, boolean var1) {
		if (null != var0 && var0.method2315() && !var0.field1105) {
			var0.field1096 = false;
			if ((Client.field493 && class103.field1335 > 50 || class103.field1335 > 200) && var1 && var0.field1139 == var0.field1187) {
				var0.field1096 = true;
			}

			int var3 = var0.field1171 >> 7;
			int var4 = var0.field1138 >> 7;
			if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
				long var5 = class233.method4549(0, 0, 0, false, var0.field1107);
				if (var0.field1098 != null && Client.field602 >= var0.field1093 && Client.field602 < var0.field1094) {
					var0.field1096 = false;
					var0.field1092 = class148.method3196(var0.field1171, var0.field1138, Client.field231);
					var0.field1159 = Client.field602;
					Client.field180.method4368(Client.field231, var0.field1171, var0.field1138, var0.field1092, 60, var0, var0.field1144, var5, var0.field1100, var0.field1087, var0.field1091, var0.field1101);
				} else {
					if (64 == (var0.field1171 & 127) && 64 == (var0.field1138 & 127)) {
						if (Client.field535[var3][var4] == Client.field601) {
							return;
						}

						Client.field535[var3][var4] = Client.field601;
					}

					var0.field1092 = class148.method3196(var0.field1171, var0.field1138, Client.field231);
					var0.field1159 = Client.field602;
					Client.field180.method4379(Client.field231, var0.field1171, var0.field1138, var0.field1092, 60, var0, var0.field1144, var5, var0.field1140);
				}
			}
		}

	}

	static final void method713(class317 var0) {
		int var2 = var0.field3686;
		if (var2 == 324) {
			if (-1 == Client.field773) {
				Client.field773 = var0.field3605;
				Client.field774 = var0.field3606;
			}

			if (1 == Client.field772.field3522) {
				var0.field3605 = Client.field773;
			} else {
				var0.field3605 = Client.field774;
			}

		} else if (var2 == 325) {
			if (-1 == Client.field773) {
				Client.field773 = var0.field3605;
				Client.field774 = var0.field3606;
			}

			if (1 == Client.field772.field3522) {
				var0.field3605 = Client.field774;
			} else {
				var0.field3605 = Client.field773;
			}

		} else if (var2 == 327) {
			var0.field3622 = 150;
			var0.field3566 = (int)(Math.sin((double)Client.field602 / 40.0D) * 256.0D) & 2047;
			var0.field3657 = 5;
			var0.field3683 = 0;
		} else if (var2 == 328) {
			var0.field3622 = 150;
			var0.field3566 = (int)(Math.sin((double)Client.field602 / 40.0D) * 256.0D) & 2047;
			var0.field3657 = 5;
			var0.field3683 = 1;
		}
	}
}
