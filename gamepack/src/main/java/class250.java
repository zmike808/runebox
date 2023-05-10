import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class250 {
	public static class278 field2906;
	class244 field2909;
	int field2902;
	int field2907;
	int field2908;
	int field2911;
	HashMap field2914;
	LinkedList field2910;
	List field2915;
	final HashMap field2905;

	static {
		field2906 = new class278(37748736, 256);
	}

	class250(int var1, int var2, int var3, HashMap var4) {
		this.field2907 = var1;
		this.field2908 = var2;
		this.field2910 = new LinkedList();
		this.field2915 = new LinkedList();
		this.field2914 = new HashMap();
		this.field2911 = var3 | -16777216;
		this.field2905 = var4;
	}

	void method4972(int var1, int var2, int var3) {
		class503 var5 = method3524(this.field2907, this.field2908, this.field2902);
		if (var5 != null) {
			if (this.field2902 * 64 == var3) {
				var5.method9104(var1, var2);
			} else {
				var5.method9125(var1, var2, var3, var3);
			}

		}
	}

	void method4973(class244 var1, List var2) {
		this.field2914.clear();
		this.field2909 = var1;
		this.method4978(var2);
	}

	void method4974(HashSet var1, List var2) {
		this.field2914.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			class252 var5 = (class252)var4.next();
			if (var5.method5241() == this.field2907 && var5.method5242() == this.field2908) {
				this.field2910.add(var5);
			}
		}

		this.method4978(var2);
	}

	void method5058(int var1, int var2, int var3, int var4, class258 var5) {
		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			label65:
			for (int var8 = var2; var8 < var4 + var2; ++var8) {
				for (int var9 = 0; var9 < var5.field2995; ++var9) {
					class260[] var10 = var5.field2998[var9][var7][var8];
					if (null != var10 && 0 != var10.length) {
						class260[] var11 = var10;

						for (int var12 = 0; var12 < var11.length; ++var12) {
							class201 var14;
							boolean var15;
							label56: {
								class260 var13 = var11[var12];
								var14 = class145.method3177(var13.field3010);
								if (null != var14.field2198) {
									int[] var16 = var14.field2198;

									for (int var17 = 0; var17 < var16.length; ++var17) {
										int var18 = var16[var17];
										class201 var19 = class145.method3177(var18);
										if (var19.field2182 != -1) {
											var15 = true;
											break label56;
										}
									}
								} else if (var14.field2182 != -1) {
									var15 = true;
									break label56;
								}

								var15 = false;
							}

							if (var15) {
								this.method4976(var14, var9, var7, var8, var5);
								continue label65;
							}
						}
					}
				}
			}
		}

	}

	void method4976(class201 var1, int var2, int var3, int var4, class258 var5) {
		class308 var7 = new class308(var2, this.field2907 * 64 + var3, this.field2908 * 64 + var4);
		class308 var8 = null;
		if (null != this.field2909) {
			var8 = new class308(this.field2909.field2990 + var2, var3 + this.field2909.field2996 * 64, this.field2909.field3001 * 64 + var4);
		} else {
			class252 var9 = (class252)var5;
			var8 = new class308(var2 + var9.field2990, var3 + var9.field2996 * 64 + var9.method5124() * 8, var9.field3001 * 64 + var4 + var9.method5125() * 8);
		}

		class183 var10;
		Object var11;
		if (var1.field2198 != null) {
			var11 = new class247(var8, var7, var1.field2186, this);
		} else {
			var10 = class355.method6671(var1.field2182);
			var11 = new class255(var8, var7, var10.field1917, this.method5001(var10));
		}

		var10 = class355.method6671(((class267)var11).method5322());
		if (var10.field1924) {
			this.field2914.put(new class308(0, var3, var4), var11);
		}

	}

	void method4977() {
		Iterator var2 = this.field2914.values().iterator();

		while (var2.hasNext()) {
			class267 var3 = (class267)var2.next();
			if (var3 instanceof class247) {
				((class247)var3).method4862();
			}
		}

	}

	void method4978(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			class255 var4 = (class255)var3.next();
			if (class355.method6671(var4.field2956).field1924 && var4.field3050.field3486 >> 6 == this.field2907 && this.field2908 == var4.field3050.field3488 >> 6) {
				class255 var5 = new class255(var4.field3050, var4.field3050, var4.field2956, this.method5000(var4.field2956));
				this.field2915.add(var5);
			}
		}

	}

	void method4979() {
		if (this.field2909 != null) {
			this.field2909.method5247();
		} else {
			Iterator var2 = this.field2910.iterator();

			while (var2.hasNext()) {
				class252 var3 = (class252)var2.next();
				var3.method5247();
			}
		}

	}

	boolean method4980(class344 var1) {
		this.field2914.clear();
		if (null != this.field2909) {
			this.field2909.method5235(var1);
			if (this.field2909.method5234()) {
				this.method5058(0, 0, 64, 64, this.field2909);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			class252 var5;
			for (var4 = this.field2910.iterator(); var4.hasNext(); var3 &= var5.method5234()) {
				var5 = (class252)var4.next();
				var5.method5235(var1);
			}

			if (var3) {
				var4 = this.field2910.iterator();

				while (var4.hasNext()) {
					var5 = (class252)var4.next();
					this.method5058(var5.method5126() * 8, var5.method5130() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	void method5011(int var1, class271 var2, class502[] var3, class344 var4, class344 var5) {
		this.field2902 = var1;
		if (this.field2909 != null || !this.field2910.isEmpty()) {
			if (method3524(this.field2907, this.field2908, var1) == null) {
				boolean var7 = true;
				var7 &= this.method4980(var4);
				int var9;
				if (null != this.field2909) {
					var9 = this.field2909.field2992;
				} else {
					var9 = ((class258)this.field2910.getFirst()).field2992;
				}

				var7 &= var5.method6510(var9);
				if (var7) {
					byte[] var8 = var5.method6501(var9);
					class261 var10;
					if (null == var8) {
						var10 = new class261();
					} else {
						var10 = new class261(class31.method6357(var8).field5089);
					}

					class503 var12 = new class503(this.field2902 * 64, this.field2902 * 64);
					var12.method9097();
					if (this.field2909 != null) {
						this.method4984(var2, var3, var10);
					} else {
						this.method5009(var2, var3, var10);
					}

					int var13 = this.field2907;
					int var14 = this.field2908;
					int var15 = this.field2902;
					field2906.method5429(var12, method2896(var13, var14, var15), var12.field5089.length * 4);
					this.method4979();
				}
			}
		}
	}

	void method4982(int var1, int var2, int var3, HashSet var4) {
		if (null == var4) {
			var4 = new HashSet();
		}

		this.method4992(var1, var2, var4, var3);
		this.method5045(var1, var2, var4, var3);
	}

	void method4983(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field2914.values().iterator();

		while (var5.hasNext()) {
			class267 var6 = (class267)var5.next();
			if (var6.method5320()) {
				int var7 = var6.method5322();
				if (var1.contains(var7)) {
					class183 var8 = class355.method6671(var7);
					this.method4993(var8, var6.field3051, var6.field3052, var2, var3);
				}
			}
		}

		this.method4971(var1, var2, var3);
	}

	void method4984(class271 var1, class502[] var2, class261 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method4987(var5, var6, this.field2909, var1, var3);
				this.method5069(var5, var6, this.field2909, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method4986(var5, var6, this.field2909, var1, var2);
			}
		}

	}

	void method5009(class271 var1, class502[] var2, class261 var3) {
		Iterator var5 = this.field2910.iterator();

		class252 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class252)var5.next();

			for (var7 = var6.method5126() * 8; var7 < var6.method5126() * 8 + 8; ++var7) {
				for (var8 = var6.method5130() * 8; var8 < var6.method5130() * 8 + 8; ++var8) {
					this.method4987(var7, var8, var6, var1, var3);
					this.method5069(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field2910.iterator();

		while (var5.hasNext()) {
			var6 = (class252)var5.next();

			for (var7 = var6.method5126() * 8; var7 < var6.method5126() * 8 + 8; ++var7) {
				for (var8 = var6.method5130() * 8; var8 < var6.method5130() * 8 + 8; ++var8) {
					this.method4986(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	void method4986(int var1, int var2, class258 var3, class271 var4, class502[] var5) {
		this.method4991(var1, var2, var3);
		this.method5040(var1, var2, var3, var5);
	}

	void method4987(int var1, int var2, class258 var3, class271 var4, class261 var5) {
		int var7 = var3.field2994[0][var1][var2] - 1;
		int var8 = var3.field2987[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class499.method9012(this.field2902 * var1, (63 - var2) * this.field2902, this.field2902, this.field2902, this.field2911);
		}

		int var9 = 16711935;
		int var10;
		if (var8 != -1) {
			int var11 = this.field2911;
			class203 var13 = (class203)class203.field2271.method5461((long)var8);
			class203 var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = class78.field2273.method6468(4, var8);
				var13 = new class203();
				if (null != var14) {
					var13.method3976(new class489(var14), var8);
				}

				var13.method3975();
				class203.field2271.method5463(var13, (long)var8);
				var12 = var13;
			}

			if (var12 == null) {
				var10 = var11;
			} else {
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var12.field2272 >= 0) {
					var15 = var12.field2274;
					var16 = var12.field2285;
					var17 = var12.field2282;
					if (var17 > 179) {
						var16 /= 2;
					}

					if (var17 > 192) {
						var16 /= 2;
					}

					if (var17 > 217) {
						var16 /= 2;
					}

					if (var17 > 243) {
						var16 /= 2;
					}

					var18 = (var16 / 32 << 7) + (var15 / 4 << 10) + var17 / 2;
					var19 = class98.method2593(var18, 96);
					var10 = class219.field2517[var19] | -16777216;
				} else if (var12.field2281 >= 0) {
					int var20 = class98.method2593(class219.field2515.field2795.method4822(var12.field2281), 96);
					var10 = class219.field2517[var20] | -16777216;
				} else if (var12.field2283 == 16711935) {
					var10 = var11;
				} else {
					var15 = var12.field2277;
					var16 = var12.field2278;
					var17 = var12.field2279;
					if (var17 > 179) {
						var16 /= 2;
					}

					if (var17 > 192) {
						var16 /= 2;
					}

					if (var17 > 217) {
						var16 /= 2;
					}

					if (var17 > 243) {
						var16 /= 2;
					}

					var18 = (var15 / 4 << 10) + (var16 / 32 << 7) + var17 / 2;
					var19 = class98.method2593(var18, 96);
					var10 = class219.field2517[var19] | -16777216;
				}
			}

			var9 = var10;
		}

		if (var8 > -1 && 0 == var3.field2991[0][var1][var2]) {
			class499.method9012(this.field2902 * var1, this.field2902 * (63 - var2), this.field2902, this.field2902, var9);
		} else {
			var10 = this.method4989(var1, var2, var3, var5);
			if (var8 == -1) {
				class499.method9012(var1 * this.field2902, (63 - var2) * this.field2902, this.field2902, this.field2902, var10);
			} else {
				var4.method5372(var1 * this.field2902, this.field2902 * (63 - var2), var10, var9, this.field2902, this.field2902, var3.field2991[0][var1][var2], var3.field2997[0][var1][var2]);
			}
		}
	}

	void method5069(int var1, int var2, class258 var3, class271 var4) {
		for (int var6 = 1; var6 < var3.field2995; ++var6) {
			int var7 = var3.field2987[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var9 = this.field2911;
				class203 var11 = (class203)class203.field2271.method5461((long)var7);
				class203 var10;
				if (var11 != null) {
					var10 = var11;
				} else {
					byte[] var12 = class78.field2273.method6468(4, var7);
					var11 = new class203();
					if (null != var12) {
						var11.method3976(new class489(var12), var7);
					}

					var11.method3975();
					class203.field2271.method5463(var11, (long)var7);
					var10 = var11;
				}

				int var8;
				if (var10 == null) {
					var8 = var9;
				} else {
					int var13;
					int var14;
					int var15;
					int var16;
					int var17;
					if (var10.field2272 >= 0) {
						var13 = var10.field2274;
						var14 = var10.field2285;
						var15 = var10.field2282;
						if (var15 > 179) {
							var14 /= 2;
						}

						if (var15 > 192) {
							var14 /= 2;
						}

						if (var15 > 217) {
							var14 /= 2;
						}

						if (var15 > 243) {
							var14 /= 2;
						}

						var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
						var17 = class98.method2593(var16, 96);
						var8 = class219.field2517[var17] | -16777216;
					} else if (var10.field2281 >= 0) {
						int var18 = class98.method2593(class219.field2515.field2795.method4822(var10.field2281), 96);
						var8 = class219.field2517[var18] | -16777216;
					} else if (var10.field2283 == 16711935) {
						var8 = var9;
					} else {
						var13 = var10.field2277;
						var14 = var10.field2278;
						var15 = var10.field2279;
						if (var15 > 179) {
							var14 /= 2;
						}

						if (var15 > 192) {
							var14 /= 2;
						}

						if (var15 > 217) {
							var14 /= 2;
						}

						if (var15 > 243) {
							var14 /= 2;
						}

						var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
						var17 = class98.method2593(var16, 96);
						var8 = class219.field2517[var17] | -16777216;
					}
				}

				if (var3.field2991[var6][var1][var2] == 0) {
					class499.method9012(var1 * this.field2902, (63 - var2) * this.field2902, this.field2902, this.field2902, var8);
				} else {
					var4.method5372(var1 * this.field2902, (63 - var2) * this.field2902, 0, var8, this.field2902, this.field2902, var3.field2991[var6][var1][var2], var3.field2997[var6][var1][var2]);
				}
			}
		}

	}

	int method4989(int var1, int var2, class258 var3, class261 var4) {
		return 0 == var3.field2994[0][var1][var2] ? this.field2911 : var4.method5275(var1, var2);
	}

	void method5040(int var1, int var2, class258 var3, class502[] var4) {
		for (int var6 = 0; var6 < var3.field2995; ++var6) {
			class260[] var7 = var3.field2998[var6][var1][var2];
			if (null != var7 && var7.length != 0) {
				class260[] var8 = var7;

				for (int var9 = 0; var9 < var8.length; ++var9) {
					class260 var10 = var8[var9];
					if (!class326.method4153(var10.field3009)) {
						int var12 = var10.field3009;
						boolean var11 = class326.field3771.field3772 == var12;
						if (!var11) {
							continue;
						}
					}

					class201 var13 = class145.method3177(var10.field3010);
					if (-1 != var13.field2197) {
						if (var13.field2197 != 46 && var13.field2197 != 52) {
							var4[var13.field2197].method9083(var1 * this.field2902, this.field2902 * (63 - var2), this.field2902 * 2, this.field2902 * 2);
						} else {
							var4[var13.field2197].method9083(var1 * this.field2902, this.field2902 * (63 - var2), this.field2902 * 2 + 1, this.field2902 * 2 + 1);
						}
					}
				}
			}
		}

	}

	void method4991(int var1, int var2, class258 var3) {
		for (int var5 = 0; var5 < var3.field2995; ++var5) {
			class260[] var6 = var3.field2998[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class260[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					class260 var9 = var7[var8];
					int var11 = var9.field3009;
					boolean var10 = var11 >= class326.field3752.field3772 && var11 <= class326.field3755.field3772 || class326.field3753.field3772 == var11;
					if (var10) {
						class201 var12 = class145.method3177(var9.field3010);
						int var13 = var12.field2176 != 0 ? -3407872 : -3355444;
						if (class326.field3752.field3772 == var9.field3009) {
							this.method4995(var1, var2, var9.field3008, var13);
						}

						if (class326.field3751.field3772 == var9.field3009) {
							this.method4995(var1, var2, var9.field3008, -3355444);
							this.method4995(var1, var2, var9.field3008 + 1, var13);
						}

						if (class326.field3755.field3772 == var9.field3009) {
							if (var9.field3008 == 0) {
								class499.method8995(this.field2902 * var1, (63 - var2) * this.field2902, 1, var13);
							}

							if (1 == var9.field3008) {
								class499.method8995(this.field2902 * var1 + this.field2902 - 1, (63 - var2) * this.field2902, 1, var13);
							}

							if (2 == var9.field3008) {
								class499.method8995(var1 * this.field2902 + this.field2902 - 1, (63 - var2) * this.field2902 + this.field2902 - 1, 1, var13);
							}

							if (3 == var9.field3008) {
								class499.method8995(this.field2902 * var1, (63 - var2) * this.field2902 + this.field2902 - 1, 1, var13);
							}
						}

						if (class326.field3753.field3772 == var9.field3009) {
							int var14 = var9.field3008 % 2;
							int var15;
							if (var14 == 0) {
								for (var15 = 0; var15 < this.field2902; ++var15) {
									class499.method8995(this.field2902 * var1 + var15, (64 - var2) * this.field2902 - 1 - var15, 1, var13);
								}
							} else {
								for (var15 = 0; var15 < this.field2902; ++var15) {
									class499.method8995(var1 * this.field2902 + var15, var15 + this.field2902 * (63 - var2), 1, var13);
								}
							}
						}
					}
				}
			}
		}

	}

	void method4992(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field2914.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			class308 var10 = (class308)var9.getKey();
			int var11 = (int)((float)var1 + (float)var10.field3486 * var6 - var7);
			int var12 = (int)((float)(var2 + var4) - (float)var10.field3488 * var6 - var7);
			class267 var13 = (class267)var9.getValue();
			if (null != var13 && var13.method5320()) {
				var13.field3051 = var11;
				var13.field3052 = var12;
				class183 var14 = class355.method6671(var13.method5322());
				if (!var3.contains(var14.method3531())) {
					this.method4994(var13, var11, var12, var6);
				}
			}
		}

	}

	void method4971(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field2915.iterator();

		while (var5.hasNext()) {
			class267 var6 = (class267)var5.next();
			if (var6.method5320()) {
				class183 var7 = class355.method6671(var6.method5322());
				if (var7 != null && var1.contains(var7.method3531())) {
					this.method4993(var7, var6.field3051, var6.field3052, var2, var3);
				}
			}
		}

	}

	void method4993(class183 var1, int var2, int var3, int var4, int var5) {
		class503 var7 = var1.method3530(false);
		if (var7 != null) {
			var7.method9106(var2 - var7.field5088 / 2, var3 - var7.field5093 / 2);
			if (var4 % var5 < var5 / 2) {
				class499.method8987(var2, var3, 15, 16776960, 128);
				class499.method8987(var2, var3, 7, 16777215, 256);
			}

		}
	}

	void method4994(class267 var1, int var2, int var3, float var4) {
		class183 var6 = class355.method6671(var1.method5322());
		this.method5028(var6, var2, var3);
		this.method4999(var1, var6, var2, var3, var4);
	}

	void method5028(class183 var1, int var2, int var3) {
		class503 var5 = var1.method3530(false);
		if (var5 != null) {
			int var6 = this.method5012(var5, var1.field1933);
			int var7 = this.method4988(var5, var1.field1927);
			var5.method9106(var6 + var2, var7 + var3);
		}

	}

	void method4999(class267 var1, class183 var2, int var3, int var4, float var5) {
		class262 var7 = var1.method5317();
		if (null != var7) {
			if (var7.field3022.method4853(var5)) {
				class379 var8 = (class379)this.field2905.get(var7.field3022);
				var8.method7155(var7.field3021, var3 - var7.field3024 / 2, var4, var7.field3024, var7.field3023, -16777216 | var2.field1918, 0, 1, 0, var8.field4439 / 2);
			}
		}
	}

	void method5045(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field2915.iterator();

		while (var7.hasNext()) {
			class267 var8 = (class267)var7.next();
			if (var8.method5320()) {
				int var9 = var8.field3050.field3486 % 64;
				int var10 = var8.field3050.field3488 % 64;
				var8.field3051 = (int)(var6 * (float)var9 + (float)var1);
				var8.field3052 = (int)((float)(63 - var10) * var6 + (float)var2);
				if (!var3.contains(var8.method5322())) {
					this.method4994(var8, var8.field3051, var8.field3052, var6);
				}
			}
		}

	}

	int method5012(class503 var1, class189 var2) {
		switch(var2.field1994) {
		case 0:
			return 0;
		case 2:
			return -var1.field5088 / 2;
		default:
			return -var1.field5088;
		}
	}

	int method4988(class503 var1, class192 var2) {
		switch(var2.field2056) {
		case 1:
			return -var1.field5093 / 2;
		case 2:
			return 0;
		default:
			return -var1.field5093;
		}
	}

	class262 method5000(int var1) {
		class183 var3 = class355.method6671(var1);
		return this.method5001(var3);
	}

	class262 method5001(class183 var1) {
		if (null != var1.field1920 && this.field2905 != null && this.field2905.get(class246.field2860) != null) {
			class246 var3 = class246.method4854(var1.field1922);
			if (null == var3) {
				return null;
			} else {
				class379 var4 = (class379)this.field2905.get(var3);
				if (var4 == null) {
					return null;
				} else {
					int var5 = var4.method7198(var1.field1920, 1000000);
					String[] var6 = new String[var5];
					var4.method7191(var1.field1920, (int[])null, var6);
					int var7 = var6.length * var4.field4439 / 2;
					int var8 = 0;
					String[] var9 = var6;

					for (int var10 = 0; var10 < var9.length; ++var10) {
						String var11 = var9[var10];
						int var12 = var4.method7145(var11);
						if (var12 > var8) {
							var8 = var12;
						}
					}

					return new class262(var1.field1920, var8, var7, var3);
				}
			}
		} else {
			return null;
		}
	}

	List method5071(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var1 + var3 && var5 < var3 + var2) {
				Iterator var8 = this.field2914.values().iterator();

				class267 var9;
				while (var8.hasNext()) {
					var9 = (class267)var8.next();
					if (var9.method5320() && var9.method5316(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field2915.iterator();

				while (var8.hasNext()) {
					var9 = (class267)var8.next();
					if (var9.method5320() && var9.method5316(var4, var5)) {
						var7.add(var9);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	List method5003() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field2915);
		var2.addAll(this.field2914.values());
		return var2;
	}

	void method4995(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class499.method9034(this.field2902 * var1, this.field2902 * (63 - var2), this.field2902, var4);
		}

		if (var3 == 1) {
			class499.method8995(this.field2902 * var1, (63 - var2) * this.field2902, this.field2902, var4);
		}

		if (var3 == 2) {
			class499.method9034(this.field2902 * var1 + this.field2902 - 1, this.field2902 * (63 - var2), this.field2902, var4);
		}

		if (var3 == 3) {
			class499.method8995(var1 * this.field2902, this.field2902 + (63 - var2) * this.field2902 - 1, this.field2902, var4);
		}

	}

	static long method2896(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	static class503 method3524(int var0, int var1, int var2) {
		return (class503)field2906.method5426(method2896(var0, var1, var2));
	}

	static void method7549() {
		field2906.method5437();
	}
}
