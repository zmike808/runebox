import java.util.Comparator;

public abstract class class409 implements Comparator {
	Comparator field4583;

	protected class409() {
	}

	final void method7597(Comparator var1) {
		if (null == this.field4583) {
			this.field4583 = var1;
		} else if (this.field4583 instanceof class409) {
			((class409)this.field4583).method7597(var1);
		}

	}

	protected final int method7598(class408 var1, class408 var2) {
		return null == this.field4583 ? 0 : this.field4583.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static int method7596(int var0, class75 var1, boolean var2) {
		class317 var4 = var2 ? class67.field329 : class67.field6;
		if (var0 == 1600) {
			class67.field843[++class67.field836 - 1] = var4.field3591;
			return 1;
		} else if (var0 == 1601) {
			class67.field843[++class67.field836 - 1] = var4.field3592;
			return 1;
		} else {
			class315 var8;
			if (var0 == 1602) {
				if (12 == var4.field3598) {
					var8 = var4.method6152();
					if (null != var8) {
						class67.field842[++class67.field1015 - 1] = var8.method5895().method7007();
						return 1;
					}
				}

				class67.field842[++class67.field1015 - 1] = var4.field3716;
				return 1;
			} else if (var0 == 1603) {
				class67.field843[++class67.field836 - 1] = var4.field3593;
				return 1;
			} else if (var0 == 1604) {
				class67.field843[++class67.field836 - 1] = var4.field3594;
				return 1;
			} else if (var0 == 1605) {
				class67.field843[++class67.field836 - 1] = var4.field3619;
				return 1;
			} else if (var0 == 1606) {
				class67.field843[++class67.field836 - 1] = var4.field3622;
				return 1;
			} else if (var0 == 1607) {
				class67.field843[++class67.field836 - 1] = var4.field3711;
				return 1;
			} else if (var0 == 1608) {
				class67.field843[++class67.field836 - 1] = var4.field3566;
				return 1;
			} else if (var0 == 1609) {
				class67.field843[++class67.field836 - 1] = var4.field3601;
				return 1;
			} else if (var0 == 1610) {
				class67.field843[++class67.field836 - 1] = var4.field3602;
				return 1;
			} else if (var0 == 1611) {
				class67.field843[++class67.field836 - 1] = var4.field3595;
				return 1;
			} else if (var0 == 1612) {
				class67.field843[++class67.field836 - 1] = var4.field3596;
				return 1;
			} else if (var0 == 1613) {
				class67.field843[++class67.field836 - 1] = var4.field3600.method6674();
				return 1;
			} else if (var0 == 1614) {
				class67.field843[++class67.field836 - 1] = var4.field3630 ? 1 : 0;
				return 1;
			} else {
				class310 var5;
				if (var0 == 1617) {
					var5 = var4.method6154();
					class67.field843[++class67.field836 - 1] = null != var5 ? var5.field3494 : 0;
				}

				if (var0 == 1618) {
					var5 = var4.method6154();
					class67.field843[++class67.field836 - 1] = null != var5 ? var5.field3490 : 0;
					return 1;
				} else if (var0 == 1619) {
					var8 = var4.method6152();
					class67.field842[++class67.field1015 - 1] = var8 != null ? var8.method5896().method7007() : "";
					return 1;
				} else if (var0 == 1620) {
					var5 = var4.method6154();
					class67.field843[++class67.field836 - 1] = var5 != null ? var5.field3492 : 0;
					return 1;
				} else if (var0 == 1621) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5906() : 0;
					return 1;
				} else if (var0 == 1622) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = null != var8 ? var8.method6089() : 0;
					return 1;
				} else if (var0 == 1623) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5859() : 0;
					return 1;
				} else if (var0 == 1624) {
					var8 = var4.method6152();
					class67.field843[++class67.field836 - 1] = null != var8 && var8.method5898() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var8 = var4.method6152();
						class67.field842[++class67.field1015 - 1] = var8 != null ? var8.method5897().method7264() : "";
						return 1;
					} else if (var0 == 1627) {
						var8 = var4.method6152();
						int var6 = var8 != null ? var8.method5902() : 0;
						int var7 = var8 != null ? var8.method5901() : 0;
						class67.field843[++class67.field836 - 1] = Math.min(var6, var7);
						class67.field843[++class67.field836 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 1628) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5901() : 0;
						return 1;
					} else if (var0 == 1629) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = null != var8 ? var8.method5908() : 0;
						return 1;
					} else if (var0 == 1630) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = var8 != null ? var8.method5909() : 0;
						return 1;
					} else if (var0 == 1631) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = null != var8 ? var8.method5911() : 0;
						return 1;
					} else if (var0 == 1632) {
						var8 = var4.method6152();
						class67.field843[++class67.field836 - 1] = null != var8 ? var8.method5912() : 0;
						return 1;
					} else {
						class28 var9;
						if (var0 == 1633) {
							var9 = var4.method6127();
							class67.field843[class67.field836 - 1] = null != var9 ? var9.method410(class67.field843[class67.field836 - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
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
}
