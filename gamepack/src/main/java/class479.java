public class class479 implements class357 {
	public static final class479 field4947;
	public static final class479 field4948;
	public static final class479 field4949;
	static class160 field1695;
	static int field928;
	final class475 field4953;
	public final int field4950;
	public final int field4951;
	public final Class field4952;

	static {
		field4949 = new class479(1, 0, Integer.class, new class476());
		field4948 = new class479(0, 1, Long.class, new class478());
		field4947 = new class479(2, 2, String.class, new class480());
	}

	class479(int var1, int var2, Class var3, class475 var4) {
		this.field4950 = var1;
		this.field4951 = var2;
		this.field4952 = var3;
		this.field4953 = var4;
	}

	public int method6674() {
		return this.field4951;
	}

	public Object method8510(class489 var1) {
		return this.field4953.method8484(var1);
	}

	public static void method8518(class344 var0, String var1, String var2, int var3, boolean var4) {
		if (var0.method6466(var1, var2)) {
			int var6 = var0.method6464(var1);
			int var7 = var0.method6450(var6, var2);
			class298.method1202(var0, var6, var7, var3, var4);
		}

	}

	public static class479[] method8507() {
		return new class479[]{field4949, field4948, field4947};
	}

	public static class479 method8506(Class var0) {
		class479[] var2 = method8507();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class479 var4 = var2[var3];
			if (var0 == var4.field4952) {
				return var4;
			}
		}

		return null;
	}

	public static void method8520(Object var0, class489 var1) {
		class475 var3 = method8508(var0.getClass());
		var3.method8482(var0, var1);
	}

	static class475 method8508(Class var0) {
		class479 var2 = method8506(var0);
		if (var2 == null) {
			throw new IllegalArgumentException();
		} else {
			return var2.field4953;
		}
	}

	static final int method8517(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	static int method8516(int var0, class75 var1, boolean var2) {
		if (var0 == 3800) {
			if (null != Client.field2269) {
				class67.field843[++class67.field836 - 1] = 1;
				class67.field1598 = Client.field2269;
			} else {
				class67.field843[++class67.field836 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = class67.field843[--class67.field836];
				if (Client.field750[var4] != null) {
					class67.field843[++class67.field836 - 1] = 1;
					class67.field1598 = Client.field750[var4];
				} else {
					class67.field843[++class67.field836 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				class67.field842[++class67.field1015 - 1] = class67.field1598.field1714;
				return 1;
			} else if (var0 == 3803) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1716 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1729;
				return 1;
			} else if (var0 == 3805) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1718;
				return 1;
			} else if (var0 == 3806) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1719;
				return 1;
			} else if (var0 == 3807) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1710;
				return 1;
			} else if (var0 == 3809) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1721;
				return 1;
			} else if (var0 == 3810) {
				var4 = class67.field843[--class67.field836];
				class67.field842[++class67.field1015 - 1] = class67.field1598.field1732[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = class67.field843[--class67.field836];
				class67.field843[++class67.field836 - 1] = class67.field1598.field1723[var4];
				return 1;
			} else if (var0 == 3812) {
				class67.field843[++class67.field836 - 1] = class67.field1598.field1712;
				return 1;
			} else if (var0 == 3813) {
				var4 = class67.field843[--class67.field836];
				class67.field842[++class67.field1015 - 1] = class67.field1598.field1733[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					class67.field836 -= 3;
					var4 = class67.field843[class67.field836];
					var7 = class67.field843[1 + class67.field836];
					var6 = class67.field843[2 + class67.field836];
					class67.field843[++class67.field836 - 1] = class67.field1598.method3210(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					class67.field843[++class67.field836 - 1] = class67.field1598.field1728;
					return 1;
				} else if (var0 == 3816) {
					class67.field843[++class67.field836 - 1] = class67.field1598.field1734;
					return 1;
				} else if (var0 == 3817) {
					class67.field843[++class67.field836 - 1] = class67.field1598.method3209(class67.field842[--class67.field1015]);
					return 1;
				} else if (var0 == 3818) {
					class67.field843[class67.field836 - 1] = class67.field1598.method3212()[class67.field843[class67.field836 - 1]];
					return 1;
				} else if (var0 == 3819) {
					class67.field836 -= 2;
					var4 = class67.field843[class67.field836];
					var7 = class67.field843[class67.field836 + 1];
					class271.method5393(var7, var4, (byte)46);
					return 1;
				} else if (var0 == 3820) {
					var4 = class67.field843[--class67.field836];
					class67.field843[++class67.field836 - 1] = class67.field1598.field1726[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						class67.field836 -= 3;
						var4 = class67.field843[class67.field836];
						boolean var5 = class67.field843[class67.field836 + 1] == 1;
						var6 = class67.field843[class67.field836 + 2];
						Client.method3497(var6, var4, var5);
					}

					if (var0 == 3822) {
						var4 = class67.field843[--class67.field836];
						class67.field843[++class67.field836 - 1] = class67.field1598.field1735[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (Client.field253 != null) {
							class67.field843[++class67.field836 - 1] = 1;
							field1695 = Client.field253;
						} else {
							class67.field843[++class67.field836 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var4 = class67.field843[--class67.field836];
						if (Client.field679[var4] != null) {
							class67.field843[++class67.field836 - 1] = 1;
							field1695 = Client.field679[var4];
							field928 = var4;
						} else {
							class67.field843[++class67.field836 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						class67.field842[++class67.field1015 - 1] = field1695.field1773;
						return 1;
					} else if (var0 == 3853) {
						class67.field843[++class67.field836 - 1] = field1695.field1775;
						return 1;
					} else if (var0 == 3854) {
						class67.field843[++class67.field836 - 1] = field1695.field1769;
						return 1;
					} else if (var0 == 3855) {
						class67.field843[++class67.field836 - 1] = field1695.method3303();
						return 1;
					} else if (var0 == 3856) {
						var4 = class67.field843[--class67.field836];
						class67.field842[++class67.field1015 - 1] = ((class142)field1695.field1770.get(var4)).field1652.method9256();
						return 1;
					} else if (var0 == 3857) {
						var4 = class67.field843[--class67.field836];
						class67.field843[++class67.field836 - 1] = ((class142)field1695.field1770.get(var4)).field1650;
						return 1;
					} else if (var0 == 3858) {
						var4 = class67.field843[--class67.field836];
						class67.field843[++class67.field836 - 1] = ((class142)field1695.field1770.get(var4)).field1655;
						return 1;
					} else if (var0 == 3859) {
						var4 = class67.field843[--class67.field836];
						class152.method3270(field928, var4);
						return 1;
					} else if (var0 == 3860) {
						class67.field843[++class67.field836 - 1] = field1695.method3302(class67.field842[--class67.field1015]);
						return 1;
					} else if (var0 == 3861) {
						class67.field843[class67.field836 - 1] = field1695.method3311()[class67.field843[class67.field836 - 1]];
						return 1;
					} else if (var0 == 3890) {
						class67.field843[++class67.field836 - 1] = Client.field1340 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
