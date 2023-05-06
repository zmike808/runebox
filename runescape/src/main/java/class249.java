import java.util.Iterator;
import java.util.LinkedList;

public class class249 {
	boolean field2899;
	class308 field2896;
	int field2889;
	int field2892;
	int field2893;
	int field2895;
	int field2897;
	int field2898;
	int field2900;
	String field2890;
	String field2891;
	LinkedList field2894;

	public class249() {
		this.field2900 = -1;
		this.field2892 = -1;
		this.field2893 = -1;
		this.field2896 = null;
		this.field2895 = Integer.MAX_VALUE;
		this.field2889 = 0;
		this.field2897 = Integer.MAX_VALUE;
		this.field2898 = 0;
		this.field2899 = false;
	}

	public void method4908(class489 var1, int var2) {
		this.field2900 = var2;
		this.field2890 = var1.method8669();
		this.field2891 = var1.method8669();
		this.field2896 = new class308(var1.method8664());
		this.field2892 = var1.method8664();
		var1.method8658();
		this.field2899 = var1.method8658() == 1;
		this.field2893 = var1.method8658();
		int var4 = var1.method8658();
		this.field2894 = new LinkedList();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field2894.add(this.method4907(var1));
		}

		this.method4912();
	}

	class269 method4907(class489 var1) {
		int var3 = var1.method8658();
		class257 var4 = (class257)class199.method3788(class257.method5225(), var3);
		Object var5 = null;
		switch(var4.field2979) {
		case 0:
			var5 = new class266();
			break;
		case 1:
			var5 = new class248();
			break;
		case 2:
			var5 = new class253();
			break;
		case 3:
			var5 = new class256();
			break;
		default:
			throw new IllegalStateException("");
		}

		((class269)var5).method5361(var1);
		return (class269)var5;
	}

	public boolean method4964(int var1, int var2, int var3) {
		Iterator var5 = this.field2894.iterator();

		class269 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (class269)var5.next();
		} while(!var6.method5341(var1, var2, var3));

		return true;
	}

	public boolean method4909(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field2895 && var4 <= this.field2889) {
			if (var5 >= this.field2897 && var5 <= this.field2898) {
				Iterator var6 = this.field2894.iterator();

				class269 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (class269)var6.next();
				} while(!var7.method5354(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] method4959(int var1, int var2, int var3) {
		Iterator var5 = this.field2894.iterator();

		class269 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class269)var5.next();
		} while(!var6.method5341(var1, var2, var3));

		return var6.method5343(var1, var2, var3);
	}

	public class308 method4911(int var1, int var2) {
		Iterator var4 = this.field2894.iterator();

		class269 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (class269)var4.next();
		} while(!var5.method5354(var1, var2));

		return var5.method5344(var1, var2);
	}

	void method4912() {
		Iterator var2 = this.field2894.iterator();

		while (var2.hasNext()) {
			class269 var3 = (class269)var2.next();
			var3.method5359(this);
		}

	}

	public int method4953() {
		return this.field2900;
	}

	public boolean method4914() {
		return this.field2899;
	}

	public String method4957() {
		return this.field2890;
	}

	public String method4916() {
		return this.field2891;
	}

	int method4935() {
		return this.field2892;
	}

	public int method4915() {
		return this.field2893;
	}

	public int method4919() {
		return this.field2895;
	}

	public int method4920() {
		return this.field2889;
	}

	public int method4960() {
		return this.field2897;
	}

	public int method4906() {
		return this.field2898;
	}

	public int method4918() {
		return this.field2896.field3486;
	}

	public int method4921() {
		return this.field2896.field3487;
	}

	public int method4924() {
		return this.field2896.field3488;
	}

	public class308 method4925() {
		return new class308(this.field2896);
	}

	public static void method4970(int var0, int var1) {
		int var3 = class219.field2515.field2793[0];
		int var4 = var3 / class238.field5061;
		int var5 = var3 - var4 * class238.field5061;
		class219.field2515.method4770(var0, var5, var1, var4);
	}

	static int method4968(int var0, class75 var1, boolean var2) {
		if (var0 == 6500) {
			class67.field843[++class67.field836 - 1] = class103.method2644() ? 1 : 0;
			return 1;
		} else {
			class64 var9;
			if (var0 == 6501) {
				var9 = class64.method4548();
				if (null != var9) {
					class67.field843[++class67.field836 - 1] = var9.field802;
					class67.field843[++class67.field836 - 1] = var9.field797;
					class67.field842[++class67.field1015 - 1] = var9.field800;
					class67.field843[++class67.field836 - 1] = var9.field801;
					class67.field843[++class67.field836 - 1] = var9.field798;
					class67.field842[++class67.field1015 - 1] = var9.field799;
				} else {
					class67.field843[++class67.field836 - 1] = -1;
					class67.field843[++class67.field836 - 1] = 0;
					class67.field842[++class67.field1015 - 1] = "";
					class67.field843[++class67.field836 - 1] = 0;
					class67.field843[++class67.field836 - 1] = 0;
					class67.field842[++class67.field1015 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = class64.method1958();
				if (null != var9) {
					class67.field843[++class67.field836 - 1] = var9.field802;
					class67.field843[++class67.field836 - 1] = var9.field797;
					class67.field842[++class67.field1015 - 1] = var9.field800;
					class67.field843[++class67.field836 - 1] = var9.field801;
					class67.field843[++class67.field836 - 1] = var9.field798;
					class67.field842[++class67.field1015 - 1] = var9.field799;
				} else {
					class67.field843[++class67.field836 - 1] = -1;
					class67.field843[++class67.field836 - 1] = 0;
					class67.field842[++class67.field1015 - 1] = "";
					class67.field843[++class67.field836 - 1] = 0;
					class67.field843[++class67.field836 - 1] = 0;
					class67.field842[++class67.field1015 - 1] = "";
				}

				return 1;
			} else {
				int var4;
				class64 var5;
				int var11;
				if (var0 == 6506) {
					var4 = class67.field843[--class67.field836];
					var5 = null;

					for (var11 = 0; var11 < class64.field792; ++var11) {
						if (var4 == class64.field179[var11].field802) {
							var5 = class64.field179[var11];
							break;
						}
					}

					if (var5 != null) {
						class67.field843[++class67.field836 - 1] = var5.field802;
						class67.field843[++class67.field836 - 1] = var5.field797;
						class67.field842[++class67.field1015 - 1] = var5.field800;
						class67.field843[++class67.field836 - 1] = var5.field801;
						class67.field843[++class67.field836 - 1] = var5.field798;
						class67.field842[++class67.field1015 - 1] = var5.field799;
					} else {
						class67.field843[++class67.field836 - 1] = -1;
						class67.field843[++class67.field836 - 1] = 0;
						class67.field842[++class67.field1015 - 1] = "";
						class67.field843[++class67.field836 - 1] = 0;
						class67.field843[++class67.field836 - 1] = 0;
						class67.field842[++class67.field1015 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					class67.field836 -= 4;
					var4 = class67.field843[class67.field836];
					boolean var10 = 1 == class67.field843[class67.field836 + 1];
					var11 = class67.field843[2 + class67.field836];
					boolean var7 = 1 == class67.field843[3 + class67.field836];
					class64.method3054(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field642 = class67.field843[--class67.field836] == 1;
						return 1;
					} else {
						class198 var6;
						int var8;
						if (var0 == 6513) {
							class67.field836 -= 2;
							var4 = class67.field843[class67.field836];
							var8 = class67.field843[class67.field836 + 1];
							var6 = class198.method513(var8);
							if (var6.method3765()) {
								class67.field842[++class67.field1015 - 1] = class191.method6482(var4).method3691(var8, var6.field2118);
							} else {
								class67.field843[++class67.field836 - 1] = class191.method6482(var4).method3644(var8, var6.field2121);
							}

							return 1;
						} else if (var0 == 6514) {
							class67.field836 -= 2;
							var4 = class67.field843[class67.field836];
							var8 = class67.field843[1 + class67.field836];
							var6 = class198.method513(var8);
							if (var6.method3765()) {
								class67.field842[++class67.field1015 - 1] = class145.method3177(var4).method3885(var8, var6.field2118);
							} else {
								class67.field843[++class67.field836 - 1] = class145.method3177(var4).method3863(var8, var6.field2121);
							}

							return 1;
						} else if (var0 == 6515) {
							class67.field836 -= 2;
							var4 = class67.field843[class67.field836];
							var8 = class67.field843[class67.field836 + 1];
							var6 = class198.method513(var8);
							if (var6.method3765()) {
								class67.field842[++class67.field1015 - 1] = class92.method2352(var4).method3914(var8, var6.field2118);
							} else {
								class67.field843[++class67.field836 - 1] = class92.method2352(var4).method3913(var8, var6.field2121);
							}

							return 1;
						} else if (var0 == 6516) {
							class67.field836 -= 2;
							var4 = class67.field843[class67.field836];
							var8 = class67.field843[1 + class67.field836];
							var6 = class198.method513(var8);
							if (var6.method3765()) {
								class67.field842[++class67.field1015 - 1] = class199.method3745(var4).method3792(var8, var6.field2118);
							} else {
								class67.field843[++class67.field836 - 1] = class199.method3745(var4).method3791(var8, var6.field2121);
							}

							return 1;
						} else if (var0 == 6518) {
							class67.field843[++class67.field836 - 1] = Client.field562 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							class67.field843[++class67.field836 - 1] = Client.field495;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class67.field1015;
							--class67.field836;
							return 1;
						} else if (var0 == 6523) {
							--class67.field1015;
							--class67.field836;
							return 1;
						} else if (var0 == 6524) {
							class67.field843[++class67.field836 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							class67.field843[++class67.field836 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							class67.field843[++class67.field836 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							class67.field843[++class67.field836 - 1] = Client.field496;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = class67.field843[--class67.field836];
					if (var4 >= 0 && var4 < class64.field792) {
						var5 = class64.field179[var4];
						class67.field843[++class67.field836 - 1] = var5.field802;
						class67.field843[++class67.field836 - 1] = var5.field797;
						class67.field842[++class67.field1015 - 1] = var5.field800;
						class67.field843[++class67.field836 - 1] = var5.field801;
						class67.field843[++class67.field836 - 1] = var5.field798;
						class67.field842[++class67.field1015 - 1] = var5.field799;
					} else {
						class67.field843[++class67.field836 - 1] = -1;
						class67.field843[++class67.field836 - 1] = 0;
						class67.field842[++class67.field1015 - 1] = "";
						class67.field843[++class67.field836 - 1] = 0;
						class67.field843[++class67.field836 - 1] = 0;
						class67.field842[++class67.field1015 - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
