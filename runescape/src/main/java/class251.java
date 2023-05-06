import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class251 {
	boolean field2919;
	boolean field2931;
	class250[][] field2921;
	class270 field2920;
	class502[] field2923;
	class503 field2916;
	int field2926;
	int field2928;
	int field2929;
	int field2930;
	HashMap field2917;
	HashMap field2922;
	final class344 field2924;
	final class344 field2925;
	final HashMap field2918;
	public int field2927;

	public class251(class502[] var1, HashMap var2, class344 var3, class344 var4) {
		this.field2931 = false;
		this.field2919 = false;
		this.field2922 = new HashMap();
		this.field2927 = 0;
		this.field2923 = var1;
		this.field2918 = var2;
		this.field2924 = var3;
		this.field2925 = var4;
	}

	public void method5079(class344 var1, String var2, boolean var3) {
		if (!this.field2919) {
			this.field2931 = false;
			this.field2919 = true;
			System.nanoTime();
			int var5 = var1.method6464(class268.field3055.field3058);
			int var6 = var1.method6450(var5, var2);
			class489 var7 = new class489(var1.method6467(class268.field3055.field3058, var2));
			class489 var8 = new class489(var1.method6467(class268.field3059.field3058, var2));
			System.nanoTime();
			System.nanoTime();
			this.field2920 = new class270();

			try {
				this.field2920.method5364(var7, var8, var6, var3);
			} catch (IllegalStateException var17) {
				return;
			}

			this.field2920.method4918();
			this.field2920.method4921();
			this.field2920.method4924();
			this.field2930 = this.field2920.method4919() * 64;
			this.field2928 = this.field2920.method4960() * 64;
			this.field2929 = (this.field2920.method4920() - this.field2920.method4919() + 1) * 64;
			this.field2926 = (this.field2920.method4906() - this.field2920.method4960() + 1) * 64;
			int var9 = this.field2920.method4920() - this.field2920.method4919() + 1;
			int var10 = this.field2920.method4906() - this.field2920.method4960() + 1;
			System.nanoTime();
			System.nanoTime();
			class250.method7549();
			this.field2921 = new class250[var9][var10];
			Iterator var11 = this.field2920.field3061.iterator();

			while (var11.hasNext()) {
				class244 var12 = (class244)var11.next();
				int var13 = var12.field2988;
				int var14 = var12.field2989;
				int var15 = var13 - this.field2920.method4919();
				int var16 = var14 - this.field2920.method4960();
				this.field2921[var15][var16] = new class250(var13, var14, this.field2920.method4935(), this.field2918);
				this.field2921[var15][var16].method4973(var12, this.field2920.field3060);
			}

			for (int var18 = 0; var18 < var9; ++var18) {
				for (int var20 = 0; var20 < var10; ++var20) {
					if (this.field2921[var18][var20] == null) {
						this.field2921[var18][var20] = new class250(this.field2920.method4919() + var18, this.field2920.method4960() + var20, this.field2920.method4935(), this.field2918);
						this.field2921[var18][var20].method4974(this.field2920.field3063, this.field2920.field3060);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method6466(class268.field3056.field3058, var2)) {
				byte[] var19 = var1.method6467(class268.field3056.field3058, var2);
				this.field2916 = class31.method6357(var19);
			}

			System.nanoTime();
			var1.method6460();
			var1.method6465();
			this.field2931 = true;
		}
	}

	public final void method5080() {
		this.field2917 = null;
	}

	public final void method5081(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class238.field5067;
		int var11 = class238.field5061;
		int var12 = class499.field5060;
		float[] var13 = class238.field5063;
		int[] var14 = new int[4];
		class499.method8983(var14);
		class259 var15 = this.method5085(var1, var2, var3, var4);
		float var16 = this.method5089(var7 - var5, var3 - var1);
		int var17 = (int)Math.ceil((double)var16);
		this.field2927 = var17;
		if (!this.field2922.containsKey(var17)) {
			class271 var18 = new class271(var17);
			var18.method5417();
			this.field2922.put(var17, var18);
		}

		int var25 = var15.field3005 + var15.field3002 - 1;
		int var19 = var15.field3004 + var15.field3003 - 1;

		int var20;
		int var21;
		for (var20 = var15.field3002; var20 <= var25; ++var20) {
			for (var21 = var15.field3004; var21 <= var19; ++var21) {
				this.field2921[var20][var21].method5011(var17, (class271)this.field2922.get(var17), this.field2923, this.field2924, this.field2925);
			}
		}

		class219.method9(var10, var11, var12, var13);
		class499.method8984(var14);
		var20 = (int)(var16 * 64.0F);
		var21 = this.field2930 + var1;
		int var22 = this.field2928 + var2;

		for (int var23 = var15.field3002; var23 < var15.field3002 + var15.field3005; ++var23) {
			for (int var24 = var15.field3004; var24 < var15.field3003 + var15.field3004; ++var24) {
				this.field2921[var23][var24].method4972(var5 + (this.field2921[var23][var24].field2907 * 64 - var21) * var20 / 64, var8 - (64 + (this.field2921[var23][var24].field2908 * 64 - var22)) * var20 / 64, var20);
			}
		}

	}

	public final void method5082(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class259 var15 = this.method5085(var1, var2, var3, var4);
		float var16 = this.method5089(var7 - var5, var3 - var1);
		int var17 = (int)(var16 * 64.0F);
		int var18 = var1 + this.field2930;
		int var19 = var2 + this.field2928;

		int var20;
		int var21;
		for (var20 = var15.field3002; var20 < var15.field3005 + var15.field3002; ++var20) {
			for (var21 = var15.field3004; var21 < var15.field3004 + var15.field3003; ++var21) {
				if (var13) {
					this.field2921[var20][var21].method4977();
				}

				this.field2921[var20][var21].method4982(var5 + (this.field2921[var20][var21].field2907 * 64 - var18) * var17 / 64, var8 - (this.field2921[var20][var21].field2908 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var20 = var15.field3002; var20 < var15.field3002 + var15.field3005; ++var20) {
				for (var21 = var15.field3004; var21 < var15.field3003 + var15.field3004; ++var21) {
					this.field2921[var20][var21].method4983(var10, var11, var12);
				}
			}
		}

	}

	public void method5117(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (null != this.field2916) {
			this.field2916.method9108(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.field2917 == null) {
					this.method5088();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field2917.get(var10);
					} while(null == var11);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						class267 var13 = (class267)var12.next();
						int var14 = (var13.field3050.field3486 - this.field2930) * var3 / this.field2929;
						int var15 = var4 - var4 * (var13.field3050.field3488 - this.field2928) / this.field2926;
						class499.method8987(var14 + var1, var15 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	public List method5114(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field2931) {
			return var12;
		} else {
			class259 var13 = this.method5085(var1, var2, var3, var4);
			float var14 = this.method5089(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = var1 + this.field2930;
			int var17 = var2 + this.field2928;

			for (int var18 = var13.field3002; var18 < var13.field3005 + var13.field3002; ++var18) {
				for (int var19 = var13.field3004; var19 < var13.field3003 + var13.field3004; ++var19) {
					List var20 = this.field2921[var18][var19].method5071(var15 * (this.field2921[var18][var19].field2907 * 64 - var16) / 64 + var5, var8 + var6 - (this.field2921[var18][var19].field2908 * 64 - var17 + 64) * var15 / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	class259 method5085(int var1, int var2, int var3, int var4) {
		class259 var6 = new class259(this);
		int var7 = var1 + this.field2930;
		int var8 = var2 + this.field2928;
		int var9 = this.field2930 + var3;
		int var10 = this.field2928 + var4;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field3005 = var13 - var11 + 1;
		var6.field3003 = var14 - var12 + 1;
		var6.field3002 = var11 - this.field2920.method4919();
		var6.field3004 = var12 - this.field2920.method4960();
		if (var6.field3002 < 0) {
			var6.field3005 += var6.field3002;
			var6.field3002 = 0;
		}

		if (var6.field3002 > this.field2921.length - var6.field3005) {
			var6.field3005 = this.field2921.length - var6.field3002;
		}

		if (var6.field3004 < 0) {
			var6.field3003 += var6.field3004;
			var6.field3004 = 0;
		}

		if (var6.field3004 > this.field2921[0].length - var6.field3003) {
			var6.field3003 = this.field2921[0].length - var6.field3004;
		}

		var6.field3005 = Math.min(var6.field3005, this.field2921.length);
		var6.field3003 = Math.min(var6.field3003, this.field2921[0].length);
		return var6;
	}

	public boolean method5086() {
		return this.field2931;
	}

	public HashMap method5087() {
		this.method5088();
		return this.field2917;
	}

	void method5088() {
		if (this.field2917 == null) {
			this.field2917 = new HashMap();
		}

		this.field2917.clear();

		for (int var2 = 0; var2 < this.field2921.length; ++var2) {
			for (int var3 = 0; var3 < this.field2921[var2].length; ++var3) {
				List var4 = this.field2921[var2][var3].method5003();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					class267 var6 = (class267)var5.next();
					if (var6.method5320()) {
						int var7 = var6.method5322();
						if (!this.field2917.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field2917.put(var7, var8);
						} else {
							List var9 = (List)this.field2917.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	float method5089(int var1, int var2) {
		float var4 = (float)var1 / (float)var2;
		if (var4 > 8.0F) {
			return 8.0F;
		} else if (var4 < 1.0F) {
			return 1.0F;
		} else {
			int var5 = Math.round(var4);
			return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
		}
	}
}
