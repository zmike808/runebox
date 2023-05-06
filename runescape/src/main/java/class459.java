import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class459 {
	public static class355 field1586;
	public static int field3792;
	static final class461 field4821;
	static final class461 field4840;
	static final class461 field4844;
	boolean field4820;
	boolean field4839;
	boolean field4860;
	class249 field4828;
	class249 field4846;
	class249 field4847;
	class251 field4832;
	class308 field4866;
	class344 field4817;
	class344 field4818;
	class344 field4819;
	class379 field4823;
	class458 field4831;
	class502[] field4825;
	class503 field4868;
	float field4836;
	float field4837;
	int field4814;
	int field4815;
	int field4816;
	int field4822;
	int field4827;
	int field4833;
	int field4834;
	int field4835;
	int field4841;
	int field4842;
	int field4848;
	int field4849;
	int field4850;
	int field4851;
	int field4853;
	int field4854;
	int field4855;
	int field4857;
	int field4861;
	int field4862;
	int field4869;
	int field4871;
	int field4872;
	HashMap field4824;
	HashMap field4865;
	HashSet field4830;
	HashSet field4838;
	HashSet field4845;
	HashSet field4856;
	HashSet field4858;
	HashSet field4859;
	Iterator field4864;
	List field4863;
	long field4852;
	final int[] field4870;
	public boolean field4867;

	static {
		field4844 = class461.field4879;
		field4821 = class461.field4884;
		field4840 = class461.field4881;
	}

	public class459() {
		this.field4834 = -1;
		this.field4827 = -1;
		this.field4855 = -1;
		this.field4850 = -1;
		this.field4815 = -1;
		this.field4841 = -1;
		this.field4842 = 3;
		this.field4862 = 50;
		this.field4839 = false;
		this.field4845 = null;
		this.field4816 = -1;
		this.field4835 = -1;
		this.field4848 = -1;
		this.field4857 = -1;
		this.field4814 = -1;
		this.field4851 = -1;
		this.field4820 = true;
		this.field4856 = new HashSet();
		this.field4830 = new HashSet();
		this.field4858 = new HashSet();
		this.field4859 = new HashSet();
		this.field4860 = false;
		this.field4861 = 0;
		this.field4870 = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4838 = new HashSet();
		this.field4866 = null;
		this.field4867 = false;
		this.field4849 = -1;
		this.field4871 = -1;
		this.field4872 = -1;
	}

	public void method8139(class344 var1, class344 var2, class344 var3, class379 var4, HashMap var5, class502[] var6) {
		this.field4825 = var6;
		this.field4817 = var1;
		this.field4818 = var2;
		this.field4819 = var3;
		this.field4823 = var4;
		this.field4824 = new HashMap();
		this.field4824.put(class246.field2860, var5.get(field4844));
		this.field4824.put(class246.field2865, var5.get(field4821));
		this.field4824.put(class246.field2861, var5.get(field4840));
		this.field4831 = new class458(var1);
		int var8 = this.field4817.method6464(class268.field3055.field3058);
		int[] var9 = this.field4817.method6449(var8);
		int var10 = var9 == null ? 0 : var9.length;
		this.field4865 = new HashMap(var10);

		for (int var11 = 0; var11 < var10; ++var11) {
			class489 var12 = new class489(this.field4817.method6468(var8, var9[var11]));
			class249 var13 = new class249();
			var13.method4908(var12, var9[var11]);
			this.field4865.put(var13.method4957(), var13);
			if (var13.method4914()) {
				this.field4847 = var13;
			}
		}

		this.method8307(this.field4847);
		this.field4846 = null;
	}

	public void method8140() {
		class250.field2906.method5430(5);
	}

	public void method8141(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.field4831.method8125()) {
			this.method8144();
			this.method8325();
			if (var3) {
				int var9 = (int)Math.ceil((double)((float)var6 / this.field4836));
				int var10 = (int)Math.ceil((double)((float)var7 / this.field4836));
				List var11 = this.field4832.method5114(this.field4822 - var9 / 2 - 1, this.field4833 - var10 / 2 - 1, 1 + this.field4822 + var9 / 2, 1 + var10 / 2 + this.field4833, var4, var5, var6, var7, var1, var2);
				HashSet var12 = new HashSet();

				Iterator var13;
				class267 var14;
				class84 var15;
				class272 var16;
				for (var13 = var11.iterator(); var13.hasNext(); class67.method2351(var15)) {
					var14 = (class267)var13.next();
					var12.add(var14);
					var15 = new class84();
					var16 = new class272(var14.method5322(), var14.field3053, var14.field3050);
					var15.method2198(new Object[]{var16, var1, var2});
					if (this.field4838.contains(var14)) {
						var15.method2207(17);
					} else {
						var15.method2207(15);
					}
				}

				var13 = this.field4838.iterator();

				while (var13.hasNext()) {
					var14 = (class267)var13.next();
					if (!var12.contains(var14)) {
						var15 = new class84();
						var16 = new class272(var14.method5322(), var14.field3053, var14.field3050);
						var15.method2198(new Object[]{var16, var1, var2});
						var15.method2207(16);
						class67.method2351(var15);
					}
				}

				this.field4838 = var12;
			}
		}
	}

	public void method8142(int var1, int var2, boolean var3, boolean var4) {
		long var6 = class294.method2575();
		this.method8143(var1, var2, var4, var6);
		if (!this.method8148() && (var4 || var3) && !class181.method3516()) {
			if (var4) {
				this.field4814 = var1;
				this.field4851 = var2;
				this.field4848 = this.field4822;
				this.field4857 = this.field4833;
			}

			if (-1 != this.field4848) {
				int var8 = var1 - this.field4814;
				int var9 = var2 - this.field4851;
				this.method8176(this.field4848 - (int)((float)var8 / this.field4837), this.field4857 + (int)((float)var9 / this.field4837), false);
			}
		} else {
			this.method8147();
		}

		if (var4) {
			this.field4852 = var6;
			this.field4853 = var1;
			this.field4854 = var2;
		}

	}

	void method8143(int var1, int var2, boolean var3, long var4) {
		if (this.field4828 != null) {
			int var6 = (int)((float)this.field4822 + ((float)(var1 - this.field4815) - (float)this.method8209() * this.field4836 / 2.0F) / this.field4836);
			int var7 = (int)((float)this.field4833 - ((float)(var2 - this.field4841) - (float)this.method8225() * this.field4836 / 2.0F) / this.field4836);
			this.field4866 = this.field4828.method4911(var6 + this.field4828.method4919() * 64, var7 + this.field4828.method4960() * 64);
			if (null != this.field4866 && var3) {
				class208 var8 = Client.field722;
				boolean var10 = Client.field682 >= 2;
				int var12;
				int var13;
				if (var10 && var8.method4076(82) && var8.method4076(81)) {
					int var15 = this.field4866.field3486;
					var12 = this.field4866.field3488;
					var13 = this.field4866.field3487;
					class289 var14 = class331.method6337(class287.field3180, Client.field753.field1385);
					var14.field3212.method8645(0);
					var14.field3212.method8698(var15);
					var14.field3212.method8688(var13);
					var14.field3212.method8859(var12);
					Client.field753.method2735(var14);
				} else {
					boolean var11 = true;
					if (this.field4820) {
						var12 = var1 - this.field4853;
						var13 = var2 - this.field4854;
						if (var4 - this.field4852 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
							var11 = false;
						}
					}

					if (var11) {
						class289 var16 = class331.method6337(class287.field3145, Client.field753.field1385);
						var16.field3212.method8711(this.field4866.method5769());
						Client.field753.method2735(var16);
						this.field4852 = 0L;
					}
				}
			}
		} else {
			this.field4866 = null;
		}

	}

	void method8144() {
		if (field1586 != null) {
			this.field4836 = this.field4837;
		} else {
			if (this.field4836 < this.field4837) {
				this.field4836 = Math.min(this.field4837, this.field4836 / 30.0F + this.field4836);
			}

			if (this.field4836 > this.field4837) {
				this.field4836 = Math.max(this.field4837, this.field4836 - this.field4836 / 30.0F);
			}

		}
	}

	void method8325() {
		if (this.method8148()) {
			int var2 = this.field4834 - this.field4822;
			int var3 = this.field4827 - this.field4833;
			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			this.method8176(this.field4822 + var2, var3 + this.field4833, true);
			if (this.field4834 == this.field4822 && this.field4827 == this.field4833) {
				this.field4834 = -1;
				this.field4827 = -1;
			}

		}
	}

	final void method8176(int var1, int var2, boolean var3) {
		this.field4822 = var1;
		this.field4833 = var2;
		class294.method2575();
		if (var3) {
			this.method8147();
		}

	}

	final void method8147() {
		this.field4851 = -1;
		this.field4814 = -1;
		this.field4857 = -1;
		this.field4848 = -1;
	}

	boolean method8148() {
		return -1 != this.field4834 && this.field4827 != -1;
	}

	public class249 method8299(int var1, int var2, int var3) {
		Iterator var5 = this.field4865.values().iterator();

		class249 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class249)var5.next();
		} while(!var6.method4964(var1, var2, var3));

		return var6;
	}

	public void method8297(int var1, int var2, int var3, boolean var4) {
		class249 var6 = this.method8299(var1, var2, var3);
		if (var6 == null) {
			if (!var4) {
				return;
			}

			var6 = this.field4847;
		}

		boolean var7 = false;
		if (this.field4846 != var6 || var4) {
			this.field4846 = var6;
			this.method8307(var6);
			var7 = true;
		}

		if (var7 || var4) {
			this.method8157(var1, var2, var3);
		}

	}

	public void method8151(int var1) {
		class249 var3 = this.method8168(var1);
		if (null != var3) {
			this.method8307(var3);
		}

	}

	public int method8224() {
		return this.field4828 == null ? -1 : this.field4828.method4953();
	}

	public class249 method8293() {
		return this.field4828;
	}

	void method8307(class249 var1) {
		if (null == this.field4828 || this.field4828 != var1) {
			this.method8255(var1);
			this.method8157(-1, -1, -1);
		}
	}

	void method8255(class249 var1) {
		this.field4828 = var1;
		this.field4832 = new class251(this.field4825, this.field4824, this.field4818, this.field4819);
		this.field4831.method8123(null == this.field4828 ? null : this.field4828.method4957());
	}

	public void method8177(class249 var1, class308 var2, class308 var3, boolean var4) {
		if (null != var1) {
			if (null == this.field4828 || this.field4828 != var1) {
				this.method8255(var1);
			}

			if (!var4 && this.field4828.method4964(var2.field3487, var2.field3486, var2.field3488)) {
				this.method8157(var2.field3487, var2.field3486, var2.field3488);
			} else {
				this.method8157(var3.field3487, var3.field3486, var3.field3488);
			}

		}
	}

	void method8157(int var1, int var2, int var3) {
		if (this.field4828 != null) {
			int[] var5 = this.field4828.method4959(var1, var2, var3);
			if (var5 == null) {
				var5 = this.field4828.method4959(this.field4828.method4921(), this.field4828.method4918(), this.field4828.method4924());
			}

			this.method8176(var5[0] - this.field4828.method4919() * 64, var5[1] - this.field4828.method4960() * 64, true);
			this.field4834 = -1;
			this.field4827 = -1;
			this.field4836 = this.method8181(this.field4828.method4915());
			this.field4837 = this.field4836;
			this.field4863 = null;
			this.field4864 = null;
			this.field4832.method5080();
		}
	}

	public void method8247(int var1, int var2, int var3, int var4, int var5) {
		int[] var7 = new int[4];
		class499.method8983(var7);
		class499.method8981(var1, var2, var1 + var3, var2 + var4);
		class499.method9012(var1, var2, var3, var4, -16777216);
		int var8 = this.field4831.method8126();
		if (var8 < 100) {
			this.method8324(var1, var2, var3, var4, var8);
		} else {
			if (!this.field4832.method5086()) {
				this.field4832.method5079(this.field4817, this.field4828.method4957(), Client.field492);
				if (!this.field4832.method5086()) {
					return;
				}
			}

			if (this.field4845 != null) {
				++this.field4835;
				if (this.field4835 % this.field4862 == 0) {
					this.field4835 = 0;
					++this.field4816;
				}

				if (this.field4816 >= this.field4842 && !this.field4839) {
					this.field4845 = null;
				}
			}

			int var9 = (int)Math.ceil((double)((float)var3 / this.field4836));
			int var10 = (int)Math.ceil((double)((float)var4 / this.field4836));
			this.field4832.method5081(this.field4822 - var9 / 2, this.field4833 - var10 / 2, this.field4822 + var9 / 2, var10 / 2 + this.field4833, var1, var2, var1 + var3, var4 + var2);
			boolean var11;
			if (!this.field4860) {
				var11 = false;
				if (var5 - this.field4861 > 100) {
					this.field4861 = var5;
					var11 = true;
				}

				this.field4832.method5082(this.field4822 - var9 / 2, this.field4833 - var10 / 2, this.field4822 + var9 / 2, this.field4833 + var10 / 2, var1, var2, var1 + var3, var2 + var4, this.field4859, this.field4845, this.field4835, this.field4862, var11);
			}

			this.method8160(var1, var2, var3, var4, var9, var10);
			var11 = Client.field682 >= 2;
			if (var11 && this.field4867 && this.field4866 != null) {
				this.field4823.method7228("Coord: " + this.field4866, class499.field5064 + 10, class499.field5065 + 20, 16776960, -1);
			}

			this.field4855 = var9;
			this.field4850 = var10;
			this.field4815 = var1;
			this.field4841 = var2;
			class499.method8984(var7);
		}
	}

	boolean method8197(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null == this.field4868) {
			return true;
		} else if (this.field4868.field5088 == var1 && this.field4868.field5093 == var2) {
			if (this.field4832.field2927 != this.field4869) {
				return true;
			} else if (this.field4872 != Client.field782) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var1 + var3 < var5 || var4 + var2 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	void method8160(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field1586 != null) {
			int var8 = 512 / (this.field4832.field2927 * 2);
			int var9 = var3 + 512;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int)((float)var9 / var11);
			var10 = (int)((float)var10 / var11);
			int var12 = this.method8173() - var5 / 2 - var8;
			int var13 = this.method8174() - var6 / 2 - var8;
			int var14 = var1 - this.field4832.field2927 * (var8 + var12 - this.field4849);
			int var15 = var2 - (var8 - (var13 - this.field4871)) * this.field4832.field2927;
			if (this.method8197(var9, var10, var14, var15, var3, var4)) {
				if (this.field4868 != null && this.field4868.field5088 == var9 && var10 == this.field4868.field5093) {
					Arrays.fill(this.field4868.field5089, 0);
				} else {
					this.field4868 = new class503(var9, var10);
				}

				this.field4849 = this.method8173() - var5 / 2 - var8;
				this.field4871 = this.method8174() - var6 / 2 - var8;
				this.field4869 = this.field4832.field2927;
				field1586.method6658(this.field4849, this.field4871, this.field4868, (float)this.field4869 / var11);
				this.field4872 = Client.field782;
				var14 = var1 - this.field4832.field2927 * (var8 + var12 - this.field4849);
				var15 = var2 - (var8 - (var13 - this.field4871)) * this.field4832.field2927;
			}

			class499.method8988(var1, var2, var3, var4, 0, 128);
			if (1.0F == var11) {
				this.field4868.method9167(var14, var15, 192);
			} else {
				this.field4868.method9100(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
			}
		}

	}

	public void method8264(int var1, int var2, int var3, int var4) {
		if (this.field4831.method8125()) {
			if (!this.field4832.method5086()) {
				this.field4832.method5079(this.field4817, this.field4828.method4957(), Client.field492);
				if (!this.field4832.method5086()) {
					return;
				}
			}

			this.field4832.method5117(var1, var2, var3, var4, this.field4845, this.field4835, this.field4862);
		}
	}

	public void method8150(int var1) {
		this.field4837 = this.method8181(var1);
	}

	void method8324(int var1, int var2, int var3, int var4, int var5) {
		byte var7 = 20;
		int var8 = var1 + var3 / 2;
		int var9 = var2 + var4 / 2 - 18 - var7;
		class499.method9012(var1, var2, var3, var4, -16777216);
		class499.method9041(var8 - 152, var9, 304, 34, -65536);
		class499.method9012(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
		this.field4823.method7154(class337.field4158, var8, var7 + var9, -1, -1);
	}

	float method8181(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	public int method8165() {
		if (1.0D == (double)this.field4837) {
			return 25;
		} else if (1.5D == (double)this.field4837) {
			return 37;
		} else if (2.0D == (double)this.field4837) {
			return 50;
		} else if ((double)this.field4837 == 3.0D) {
			return 75;
		} else {
			return (double)this.field4837 == 4.0D ? 100 : 200;
		}
	}

	public void method8237() {
		this.field4831.method8124();
	}

	public boolean method8167() {
		return this.field4831.method8125();
	}

	public class249 method8168(int var1) {
		Iterator var3 = this.field4865.values().iterator();

		class249 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (class249)var3.next();
		} while(var4.method4953() != var1);

		return var4;
	}

	public void method8195(int var1, int var2) {
		if (null != this.field4828 && this.field4828.method4909(var1, var2)) {
			this.field4834 = var1 - this.field4828.method4919() * 64;
			this.field4827 = var2 - this.field4828.method4960() * 64;
		}
	}

	public void method8170(int var1, int var2) {
		if (null != this.field4828) {
			this.method8176(var1 - this.field4828.method4919() * 64, var2 - this.field4828.method4960() * 64, true);
			this.field4834 = -1;
			this.field4827 = -1;
		}
	}

	public void method8171(int var1, int var2, int var3) {
		if (null != this.field4828) {
			int[] var5 = this.field4828.method4959(var1, var2, var3);
			if (var5 != null) {
				this.method8195(var5[0], var5[1]);
			}

		}
	}

	public void method8252(int var1, int var2, int var3) {
		if (this.field4828 != null) {
			int[] var5 = this.field4828.method4959(var1, var2, var3);
			if (var5 != null) {
				this.method8170(var5[0], var5[1]);
			}

		}
	}

	public int method8173() {
		return null == this.field4828 ? -1 : this.field4822 + this.field4828.method4919() * 64;
	}

	public int method8174() {
		return this.field4828 == null ? -1 : this.field4833 + this.field4828.method4960() * 64;
	}

	public class308 method8175() {
		return this.field4828 == null ? null : this.field4828.method4911(this.method8173(), this.method8174());
	}

	public int method8209() {
		return this.field4855;
	}

	public int method8225() {
		return this.field4850;
	}

	public void method8178(int var1) {
		if (var1 >= 1) {
			this.field4842 = var1;
		}

	}

	public void method8179() {
		this.field4842 = 3;
	}

	public void method8180(int var1) {
		if (var1 >= 1) {
			this.field4862 = var1;
		}

	}

	public void method8211() {
		this.field4862 = 50;
	}

	public void method8182(boolean var1) {
		this.field4839 = var1;
	}

	public void method8183(int var1) {
		this.field4845 = new HashSet();
		this.field4845.add(var1);
		this.field4816 = 0;
		this.field4835 = 0;
	}

	public void method8184(int var1) {
		this.field4845 = new HashSet();
		this.field4816 = 0;
		this.field4835 = 0;

		for (int var3 = 0; var3 < field3792; ++var3) {
			if (class355.method6671(var3) != null && class355.method6671(var3).field1937 == var1) {
				this.field4845.add(class355.method6671(var3).field1917);
			}
		}

	}

	public void method8275() {
		this.field4845 = null;
	}

	public void method8186(boolean var1) {
		this.field4860 = !var1;
	}

	public void method8187(int var1, boolean var2) {
		if (!var2) {
			this.field4856.add(var1);
		} else {
			this.field4856.remove(var1);
		}

		this.method8258();
	}

	public void method8277(int var1, boolean var2) {
		if (!var2) {
			this.field4830.add(var1);
		} else {
			this.field4830.remove(var1);
		}

		for (int var4 = 0; var4 < field3792; ++var4) {
			if (class355.method6671(var4) != null && class355.method6671(var4).field1937 == var1) {
				int var5 = class355.method6671(var4).field1917;
				if (!var2) {
					this.field4858.add(var5);
				} else {
					this.field4858.remove(var5);
				}
			}
		}

		this.method8258();
	}

	public boolean method8268() {
		return !this.field4860;
	}

	public boolean method8189(int var1) {
		return !this.field4856.contains(var1);
	}

	public boolean method8190(int var1) {
		return !this.field4830.contains(var1);
	}

	void method8258() {
		this.field4859.clear();
		this.field4859.addAll(this.field4856);
		this.field4859.addAll(this.field4858);
	}

	public void method8192(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field4831.method8125()) {
			int var8 = (int)Math.ceil((double)((float)var3 / this.field4836));
			int var9 = (int)Math.ceil((double)((float)var4 / this.field4836));
			List var10 = this.field4832.method5114(this.field4822 - var8 / 2 - 1, this.field4833 - var9 / 2 - 1, var8 / 2 + this.field4822 + 1, 1 + var9 / 2 + this.field4833, var1, var2, var3, var4, var5, var6);
			if (!var10.isEmpty()) {
				Iterator var11 = var10.iterator();

				boolean var14;
				do {
					if (!var11.hasNext()) {
						return;
					}

					class267 var12 = (class267)var11.next();
					class183 var13 = class355.method6671(var12.method5322());
					var14 = false;

					for (int var15 = this.field4870.length - 1; var15 >= 0; --var15) {
						if (null != var13.field1921[var15]) {
							Client.method1986(var13.field1921[var15], var13.field1928, this.field4870[var15], var12.method5322(), var12.field3053.method5769(), var12.field3050.method5769());
							var14 = true;
						}
					}
				} while(!var14);

			}
		}
	}

	public class308 method8329(int var1, class308 var2) {
		if (!this.field4831.method8125()) {
			return null;
		} else if (!this.field4832.method5086()) {
			return null;
		} else if (!this.field4828.method4909(var2.field3486, var2.field3488)) {
			return null;
		} else {
			HashMap var4 = this.field4832.method5087();
			List var5 = (List)var4.get(var1);
			if (var5 != null && !var5.isEmpty()) {
				class267 var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (true) {
					class267 var9;
					int var12;
					do {
						if (!var8.hasNext()) {
							return var6.field3050;
						}

						var9 = (class267)var8.next();
						int var10 = var9.field3050.field3486 - var2.field3486;
						int var11 = var9.field3050.field3488 - var2.field3488;
						var12 = var10 * var10 + var11 * var11;
						if (var12 == 0) {
							return var9.field3050;
						}
					} while(var12 >= var7 && null != var6);

					var6 = var9;
					var7 = var12;
				}
			} else {
				return null;
			}
		}
	}

	public void method8194(int var1, int var2, class308 var3, class308 var4) {
		class84 var6 = new class84();
		class272 var7 = new class272(var2, var3, var4);
		var6.method2198(new Object[]{var7});
		switch(var1) {
		case 1008:
			var6.method2207(10);
			break;
		case 1009:
			var6.method2207(11);
			break;
		case 1010:
			var6.method2207(12);
			break;
		case 1011:
			var6.method2207(13);
			break;
		case 1012:
			var6.method2207(14);
		}

		class67.method2351(var6);
	}

	public class267 method8164() {
		if (!this.field4831.method8125()) {
			return null;
		} else if (!this.field4832.method5086()) {
			return null;
		} else {
			HashMap var2 = this.field4832.method5087();
			this.field4863 = new LinkedList();
			Iterator var3 = var2.values().iterator();

			while (var3.hasNext()) {
				List var4 = (List)var3.next();
				this.field4863.addAll(var4);
			}

			this.field4864 = this.field4863.iterator();
			return this.method8196();
		}
	}

	public class267 method8196() {
		if (this.field4864 == null) {
			return null;
		} else {
			class267 var2;
			do {
				if (!this.field4864.hasNext()) {
					return null;
				}

				var2 = (class267)this.field4864.next();
			} while(var2.method5322() == -1);

			return var2;
		}
	}
}
