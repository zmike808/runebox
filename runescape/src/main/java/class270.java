import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class270 extends class249 {
	HashSet field3061;
	HashSet field3063;
	List field3060;

	class270() {
	}

	void method5364(class489 var1, class489 var2, int var3, boolean var4) {
		this.method4908(var1, var3);
		int var6 = var2.method8660();
		this.field3061 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			class244 var8 = new class244();

			try {
				var8.method4837(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3061.add(var8);
		}

		var7 = var2.method8660();
		this.field3063 = new HashSet(var7);

		for (int var13 = 0; var13 < var7; ++var13) {
			class252 var9 = new class252();

			try {
				var9.method5142(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3063.add(var9);
		}

		this.method5368(var2, var4);
	}

	void method5368(class489 var1, boolean var2) {
		this.field3060 = new LinkedList();
		int var4 = var1.method8660();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method8710();
			class308 var7 = new class308(var1.method8664());
			boolean var8 = var1.method8658() == 1;
			if (var2 || !var8) {
				this.field3060.add(new class255((class308)null, var7, var6, (class262)null));
			}
		}

	}

	static int method5370(int var0, class75 var1, boolean var2) {
		if (var0 == 3600) {
			if (class67.field804.field813 == 0) {
				class67.field843[++class67.field836 - 1] = -2;
			} else if (class67.field804.field813 == 1) {
				class67.field843[++class67.field836 - 1] = -1;
			} else {
				class67.field843[++class67.field836 - 1] = class67.field804.field811.method7610();
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = class67.field843[--class67.field836];
				if (class67.field804.method1789() && var4 >= 0 && var4 < class67.field804.field811.method7610()) {
					class405 var9 = (class405)class67.field804.field811.method7642(var4);
					class67.field842[++class67.field1015 - 1] = var9.method7577();
					class67.field842[++class67.field1015 - 1] = var9.method7578();
				} else {
					class67.field842[++class67.field1015 - 1] = "";
					class67.field842[++class67.field1015 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var4 = class67.field843[--class67.field836];
				if (class67.field804.method1789() && var4 >= 0 && var4 < class67.field804.field811.method7610()) {
					class67.field843[++class67.field836 - 1] = ((class412)class67.field804.field811.method7642(var4)).field4600;
				} else {
					class67.field843[++class67.field836 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var4 = class67.field843[--class67.field836];
				if (class67.field804.method1789() && var4 >= 0 && var4 < class67.field804.field811.method7610()) {
					class67.field843[++class67.field836 - 1] = ((class412)class67.field804.field811.method7642(var4)).field4599;
				} else {
					class67.field843[++class67.field836 - 1] = 0;
				}

				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = class67.field842[--class67.field1015];
					int var8 = class67.field843[--class67.field836];
					class65.method2385(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = class67.field842[--class67.field1015];
					class67.field804.method1782(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = class67.field842[--class67.field1015];
					class67.field804.method1786(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = class67.field842[--class67.field1015];
					class67.field804.method1784(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = class67.field842[--class67.field1015];
					boolean var7 = true;
					class67.field804.method1787(var10, var7);
					return 1;
				} else if (var0 == 3609) {
					var10 = class67.field842[--class67.field1015];
					var10 = class360.method6697(var10);
					class67.field843[++class67.field836 - 1] = class67.field804.method1780(new class513(var10, Client.field889), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (class67.field1426 != null) {
						class67.field842[++class67.field1015 - 1] = class67.field1426.field4564;
					} else {
						class67.field842[++class67.field1015 - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (class67.field1426 != null) {
						class67.field843[++class67.field836 - 1] = class67.field1426.method7610();
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var4 = class67.field843[--class67.field836];
					if (null != class67.field1426 && var4 < class67.field1426.method7610()) {
						class67.field842[++class67.field1015 - 1] = class67.field1426.method7642(var4).method7576().method9256();
					} else {
						class67.field842[++class67.field1015 - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var4 = class67.field843[--class67.field836];
					if (class67.field1426 != null && var4 < class67.field1426.method7610()) {
						class67.field843[++class67.field836 - 1] = ((class412)class67.field1426.method7642(var4)).method7696();
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var4 = class67.field843[--class67.field836];
					if (null != class67.field1426 && var4 < class67.field1426.method7610()) {
						class67.field843[++class67.field836 - 1] = ((class412)class67.field1426.method7642(var4)).field4599;
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					class67.field843[++class67.field836 - 1] = class67.field1426 != null ? class67.field1426.field4568 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = class67.field842[--class67.field1015];
					Client.method8519(var10);
					return 1;
				} else if (var0 == 3618) {
					class67.field843[++class67.field836 - 1] = class67.field1426 != null ? class67.field1426.field4567 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = class67.field842[--class67.field1015];
					Client.method7136(var10);
					return 1;
				} else if (var0 == 3620) {
					Client.method4849();
					return 1;
				} else if (var0 == 3621) {
					if (!class67.field804.method1789()) {
						class67.field843[++class67.field836 - 1] = -1;
					} else {
						class67.field843[++class67.field836 - 1] = class67.field804.field812.method7610();
					}

					return 1;
				} else if (var0 == 3622) {
					var4 = class67.field843[--class67.field836];
					if (class67.field804.method1789() && var4 >= 0 && var4 < class67.field804.field812.method7610()) {
						class411 var5 = (class411)class67.field804.field812.method7642(var4);
						class67.field842[++class67.field1015 - 1] = var5.method7577();
						class67.field842[++class67.field1015 - 1] = var5.method7578();
					} else {
						class67.field842[++class67.field1015 - 1] = "";
						class67.field842[++class67.field1015 - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var10 = class67.field842[--class67.field1015];
					var10 = class360.method6697(var10);
					class67.field843[++class67.field836 - 1] = class67.field804.method1781(new class513(var10, Client.field889)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = class67.field843[--class67.field836];
					if (null != class67.field1426 && var4 < class67.field1426.method7610() && class67.field1426.method7642(var4).method7576().equals(Client.field3454.field1089)) {
						class67.field843[++class67.field836 - 1] = 1;
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (null != class67.field1426 && class67.field1426.field4565 != null) {
						class67.field842[++class67.field1015 - 1] = class67.field1426.field4565;
					} else {
						class67.field842[++class67.field1015 - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var4 = class67.field843[--class67.field836];
					if (null != class67.field1426 && var4 < class67.field1426.method7610() && ((class407)class67.field1426.method7642(var4)).method7553()) {
						class67.field843[++class67.field836 - 1] = 1;
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						class67.field804.field811.method7629();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class495(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class496(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class115(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class111(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class114(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class119(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class113(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class112(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class116(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class117(var6));
							return 1;
						} else if (var0 == 3639) {
							class67.field804.field811.method7621();
							return 1;
						} else if (var0 == 3640) {
							class67.field804.field812.method7629();
							return 1;
						} else if (var0 == 3641) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field812.method7630(new class495(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field812.method7630(new class496(var6));
							return 1;
						} else if (var0 == 3643) {
							class67.field804.field812.method7621();
							return 1;
						} else if (var0 == 3644) {
							if (class67.field1426 != null) {
								class67.field1426.method7629();
							}

							return 1;
						} else if (var0 == 3645) {
							var6 = class67.field843[--class67.field836] == 1;
							if (null != class67.field1426) {
								class67.field1426.method7630(new class495(var6));
							}

							return 1;
						} else if (var0 == 3646) {
							var6 = class67.field843[--class67.field836] == 1;
							if (null != class67.field1426) {
								class67.field1426.method7630(new class496(var6));
							}

							return 1;
						} else if (var0 == 3647) {
							var6 = class67.field843[--class67.field836] == 1;
							if (null != class67.field1426) {
								class67.field1426.method7630(new class115(var6));
							}

							return 1;
						} else if (var0 == 3648) {
							var6 = class67.field843[--class67.field836] == 1;
							if (null != class67.field1426) {
								class67.field1426.method7630(new class111(var6));
							}

							return 1;
						} else if (var0 == 3649) {
							var6 = class67.field843[--class67.field836] == 1;
							if (null != class67.field1426) {
								class67.field1426.method7630(new class114(var6));
							}

							return 1;
						} else if (var0 == 3650) {
							var6 = class67.field843[--class67.field836] == 1;
							if (class67.field1426 != null) {
								class67.field1426.method7630(new class119(var6));
							}

							return 1;
						} else if (var0 == 3651) {
							var6 = class67.field843[--class67.field836] == 1;
							if (class67.field1426 != null) {
								class67.field1426.method7630(new class113(var6));
							}

							return 1;
						} else if (var0 == 3652) {
							var6 = class67.field843[--class67.field836] == 1;
							if (class67.field1426 != null) {
								class67.field1426.method7630(new class112(var6));
							}

							return 1;
						} else if (var0 == 3653) {
							var6 = class67.field843[--class67.field836] == 1;
							if (class67.field1426 != null) {
								class67.field1426.method7630(new class116(var6));
							}

							return 1;
						} else if (var0 == 3654) {
							var6 = class67.field843[--class67.field836] == 1;
							if (class67.field1426 != null) {
								class67.field1426.method7630(new class117(var6));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class67.field1426 != null) {
								class67.field1426.method7621();
							}

							return 1;
						} else if (var0 == 3656) {
							var6 = class67.field843[--class67.field836] == 1;
							class67.field804.field811.method7630(new class118(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = class67.field843[--class67.field836] == 1;
							if (null != class67.field1426) {
								class67.field1426.method7630(new class118(var6));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = class67.field843[--class67.field836];
					if (class67.field1426 != null && var4 < class67.field1426.method7610() && ((class407)class67.field1426.method7642(var4)).method7557()) {
						class67.field843[++class67.field836 - 1] = 1;
					} else {
						class67.field843[++class67.field836 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
