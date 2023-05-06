import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class class433 implements class273 {
	class479 field4702;

	class433(int var1) {
	}

	abstract void method7981(class489 var1, int var2);

	public void method7980(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			class429[] var4 = new class429[]{class429.field4694, class429.field4693, class429.field4692, class429.field4695};
			class429 var5 = (class429)class199.method3788(var4, var3);
			if (var5 != null) {
				switch(var5.field4696) {
				case 1:
					int var6 = var1.method8658();
					this.field4702 = class477.method2658(var6);
					if (null != this.field4702) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
				case 2:
					class199.method3788(class338.method6691(), var1.method8658());
					break;
				case 3:
					var1.method8670();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
				}
			} else {
				this.method7981(var1, var3);
			}
		}
	}

	boolean method7982() {
		return null != this.field4702;
	}

	Object method7987() {
		if (class479.field4949 == this.field4702) {
			return 0;
		} else if (class479.field4948 == this.field4702) {
			return -1L;
		} else {
			return this.field4702 == class479.field4947 ? "" : null;
		}
	}

	public static void method7995(class488 var0) {
		class38 var2 = (class38)class37.field255.method6798();
		if (null != var2) {
			int var3 = var0.field4989;
			var0.method8644(var2.field265);

			for (int var4 = 0; var4 < var2.field262; ++var4) {
				if (var2.field264[var4] != 0) {
					var0.method8695(var2.field264[var4]);
				} else {
					try {
						int var5 = var2.field263[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field261[var4];
							var7 = var6.getInt((Object)null);
							var0.method8695(0);
							var0.method8644(var7);
						} else if (var5 == 1) {
							var6 = var2.field261[var4];
							var6.setInt((Object)null, var2.field266[var4]);
							var0.method8695(0);
						} else if (var5 == 2) {
							var6 = var2.field261[var4];
							var7 = var6.getModifiers();
							var0.method8695(0);
							var0.method8644(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field267[var4];
								var7 = var23.getModifiers();
								var0.method8695(0);
								var0.method8644(var7);
							}
						} else {
							var23 = var2.field267[var4];
							byte[][] var24 = var2.field268[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object)null, var8);
							if (null == var25) {
								var0.method8695(0);
							} else if (var25 instanceof Number) {
								var0.method8695(1);
								var0.method8640(((Number)var25).longValue());
							} else if (var25 instanceof String) {
								var0.method8695(2);
								var0.method8648((String)var25);
							} else {
								var0.method8695(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method8695(-10);
					} catch (InvalidClassException var12) {
						var0.method8695(-11);
					} catch (StreamCorruptedException var13) {
						var0.method8695(-12);
					} catch (OptionalDataException var14) {
						var0.method8695(-13);
					} catch (IllegalAccessException var15) {
						var0.method8695(-14);
					} catch (IllegalArgumentException var16) {
						var0.method8695(-15);
					} catch (InvocationTargetException var17) {
						var0.method8695(-16);
					} catch (SecurityException var18) {
						var0.method8695(-17);
					} catch (IOException var19) {
						var0.method8695(-18);
					} catch (NullPointerException var20) {
						var0.method8695(-19);
					} catch (Exception var21) {
						var0.method8695(-20);
					} catch (Throwable var22) {
						var0.method8695(-21);
					}
				}
			}

			var0.method8842(var3);
			var2.method8051();
		}
	}
}
