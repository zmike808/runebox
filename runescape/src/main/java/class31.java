import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class31 {
	static {
		ImageIO.setUseCache(false);
	}

	public static final class503 method6357(byte[] var0) {
		BufferedImage var2 = null;

		try {
			Class var3 = ImageIO.class;
			synchronized(ImageIO.class){}
			var2 = ImageIO.read(new ByteArrayInputStream(var0));
			int var9 = var2.getWidth();
			int var4 = var2.getHeight();
			int[] var5 = new int[var9 * var4];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var9, var4, var5, 0, var9);
			var6.grabPixels();
			return new class503(var5, var9, var4);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new class503(0, 0);
	}

	public static String method469(CharSequence var0, class469 var1) {
		if (null == var0) {
			return null;
		} else {
			int var3 = 0;

			int var4;
			for (var4 = var0.length(); var3 < var4 && class470.method2210(var0.charAt(var3)); ++var3) {
			}

			while (var4 > var3 && class470.method2210(var0.charAt(var4 - 1))) {
				--var4;
			}

			int var5 = var4 - var3;
			if (var5 >= 1 && var5 <= class470.method5490(var1)) {
				StringBuilder var6 = new StringBuilder(var5);

				for (int var7 = var3; var7 < var4; ++var7) {
					char var8 = var0.charAt(var7);
					boolean var9;
					if (Character.isISOControl(var8)) {
						var9 = false;
					} else if (class70.method1983(var8)) {
						var9 = true;
					} else {
						char[] var10 = class470.field4918;
						int var11 = 0;

						label75:
						while (true) {
							char var12;
							if (var11 >= var10.length) {
								var10 = class470.field4920;

								for (var11 = 0; var11 < var10.length; ++var11) {
									var12 = var10[var11];
									if (var12 == var8) {
										var9 = true;
										break label75;
									}
								}

								var9 = false;
								break;
							}

							var12 = var10[var11];
							if (var12 == var8) {
								var9 = true;
								break;
							}

							++var11;
						}
					}

					if (var9) {
						char var13;
						switch(var8) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var13 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var13 = var8;
							break;
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var13 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var13 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var13 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var13 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var13 = 'n';
							break;
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var13 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var13 = 'u';
							break;
						case 'ß':
							var13 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var13 = 'y';
							break;
						default:
							var13 = Character.toLowerCase(var8);
						}

						if (var13 != 0) {
							var6.append(var13);
						}
					}
				}

				if (var6.length() == 0) {
					return null;
				} else {
					return var6.toString();
				}
			} else {
				return null;
			}
		}
	}

	static final void method468(class488 var0) {
		var0.method8636();
		int var2 = var0.method8607(8);
		int var3;
		if (var2 < Client.field737) {
			for (var3 = var2; var3 < Client.field737; ++var3) {
				Client.field618[++Client.field617 - 1] = Client.field548[var3];
			}
		}

		if (var2 > Client.field737) {
			throw new RuntimeException("");
		} else {
			Client.field737 = 0;

			for (var3 = 0; var3 < var2; ++var3) {
				int var4 = Client.field548[var3];
				class96 var5 = Client.field546[var4];
				int var6 = var0.method8607(1);
				if (var6 == 0) {
					Client.field548[++Client.field737 - 1] = var4;
					var5.field1195 = Client.field602;
				} else {
					int var7 = var0.method8607(2);
					if (var7 == 0) {
						Client.field548[++Client.field737 - 1] = var4;
						var5.field1195 = Client.field602;
						Client.field550[++Client.field549 - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							Client.field548[++Client.field737 - 1] = var4;
							var5.field1195 = Client.field602;
							var8 = var0.method8607(3);
							var5.method2506(var8, class211.field2390);
							var9 = var0.method8607(1);
							if (var9 == 1) {
								Client.field550[++Client.field549 - 1] = var4;
							}
						} else if (var7 == 2) {
							Client.field548[++Client.field737 - 1] = var4;
							var5.field1195 = Client.field602;
							if (var0.method8607(1) == 1) {
								var8 = var0.method8607(3);
								var5.method2506(var8, class211.field2388);
								var9 = var0.method8607(3);
								var5.method2506(var9, class211.field2388);
							} else {
								var8 = var0.method8607(3);
								var5.method2506(var8, class211.field2389);
							}

							var8 = var0.method8607(1);
							if (var8 == 1) {
								Client.field550[++Client.field549 - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field618[++Client.field617 - 1] = var4;
						}
					}
				}
			}

		}
	}
}
