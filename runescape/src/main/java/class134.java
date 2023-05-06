import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class class134 extends class444 {
	public static int field4668;
	static int field1594;
	static ThreadPoolExecutor field4388;
	boolean field1599;
	class126[][] field1590;
	int field1588;
	int field1592;
	List field1596;
	Future field1595;
	public class126[][] field1593;
	public class222 field1591;

	class134(class344 var1, class344 var2, int var3, boolean var4) {
		this.field1593 = (class126[][])null;
		this.field1590 = (class126[][])null;
		this.field1592 = 0;
		this.field1588 = var3;
		byte[] var5 = var1.method6468(this.field1588 >> 16 & 65535, this.field1588 & 65535);
		class489 var6 = new class489(var5);
		int var7 = var6.method8658();
		int var8 = var6.method8660();
		byte[] var9;
		if (var4) {
			var9 = var2.method6454(0, var8);
		} else {
			var9 = var2.method6454(var8, 0);
		}

		this.field1591 = new class222(var8, var9);
		this.field1596 = new ArrayList();
		this.field1595 = field4388.submit(new class133(this, var6, var7));
	}

	void method3072(class489 var1, int var2) {
		var1.method8660();
		var1.method8660();
		this.field1592 = var1.method8658();
		int var4 = var1.method8660();
		this.field1590 = new class126[this.field1591.method4363().method4298()][];
		this.field1593 = new class126[this.field1591.method4362()][];
		class125[] var5 = new class125[var4];

		int var6;
		int var8;
		int var10;
		for (var6 = 0; var6 < var4; ++var6) {
			var8 = var1.method8658();
			class127 var9 = (class127)class199.method3788(class182.method3525(), var8);
			if (null == var9) {
				var9 = class127.field1536;
			}

			var10 = var1.method8673();
			class128 var11 = class128.method2877(var1.method8658());
			class126 var12 = new class126();
			var12.method2997(var1, var2);
			var5[var6] = new class125(this, var12, var9, var11, var10);
			int var13 = var9.method3038();
			class126[][] var14;
			if (class127.field1533 == var9) {
				var14 = this.field1590;
			} else {
				var14 = this.field1593;
			}

			if (var14[var10] == null) {
				var14[var10] = new class126[var13];
			}

			if (class127.field1540 == var9) {
				this.field1599 = true;
			}
		}

		var6 = var4 / field1594;
		int var7 = var4 % field1594;
		int var15 = 0;

		for (var10 = 0; var10 < field1594; ++var10) {
			var8 = var15;
			var15 += var6;
			if (var7 > 0) {
				++var15;
				--var7;
			}

			if (var15 == var8) {
				break;
			}

			this.field1596.add(field4388.submit(new class129(this, var8, var15, var5)));
		}

	}

	public boolean method3093() {
		if (null == this.field1595 && this.field1596 == null) {
			return true;
		} else {
			if (this.field1595 != null) {
				if (!this.field1595.isDone()) {
					return false;
				}

				this.field1595 = null;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1596.size(); ++var3) {
				if (!((Future)this.field1596.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field1596.remove(var3);
					--var3;
				}
			}

			if (!var2) {
				return false;
			} else {
				this.field1596 = null;
				return true;
			}
		}
	}

	public int method3078() {
		return this.field1592;
	}

	public boolean method3073() {
		return this.field1599;
	}

	public void method3076(int var1, class123 var2, int var3, int var4) {
		class426[] var7;
		synchronized(var7 = class426.field4666){}
		class426 var6;
		if (0 == field4668) {
			var6 = new class426();
		} else {
			class426.field4666[--field4668].method7867();
			var6 = class426.field4666[field4668];
		}

		this.method3097(var6, var3, var2, var1);
		this.method3101(var6, var3, var2, var1);
		this.method3077(var6, var3, var2, var1);
		var2.method2948(var6);
		var6.method7866();
	}

	void method3097(class426 var1, int var2, class123 var3, int var4) {
		float[] var6 = var3.method2954(this.field1592);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field1590[var2] != null) {
			class126 var10 = this.field1590[var2][0];
			class126 var11 = this.field1590[var2][1];
			class126 var12 = this.field1590[var2][2];
			if (null != var10) {
				var7 = var10.method2999(var4);
			}

			if (var11 != null) {
				var8 = var11.method2999(var4);
			}

			if (var12 != null) {
				var9 = var12.method2999(var4);
			}
		}

		class425 var17 = class425.method3067();
		var17.method7835(1.0F, 0.0F, 0.0F, var7);
		class425 var18 = class425.method3067();
		var18.method7835(0.0F, 1.0F, 0.0F, var8);
		class425 var19 = class425.method3067();
		var19.method7835(0.0F, 0.0F, 1.0F, var9);
		class425 var13 = class425.method3067();
		var13.method7837(var19);
		var13.method7837(var17);
		var13.method7837(var18);
		class426[] var15;
		synchronized(var15 = class426.field4666){}
		class426 var14;
		if (0 == field4668) {
			var14 = new class426();
		} else {
			class426.field4666[--field4668].method7867();
			var14 = class426.field4666[field4668];
		}

		var14.method7874(var13);
		var1.method7873(var14);
		var17.method7840();
		var18.method7840();
		var19.method7840();
		var13.method7840();
		var14.method7866();
	}

	void method3077(class426 var1, int var2, class123 var3, int var4) {
		float[] var6 = var3.method2940(this.field1592);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field1590[var2]) {
			class126 var10 = this.field1590[var2][3];
			class126 var11 = this.field1590[var2][4];
			class126 var12 = this.field1590[var2][5];
			if (var10 != null) {
				var7 = var10.method2999(var4);
			}

			if (var11 != null) {
				var8 = var11.method2999(var4);
			}

			if (var12 != null) {
				var9 = var12.method2999(var4);
			}
		}

		var1.field4671[12] = var7;
		var1.field4671[13] = var8;
		var1.field4671[14] = var9;
	}

	void method3101(class426 var1, int var2, class123 var3, int var4) {
		float[] var6 = var3.method2941(this.field1592);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field1590[var2]) {
			class126 var10 = this.field1590[var2][6];
			class126 var11 = this.field1590[var2][7];
			class126 var12 = this.field1590[var2][8];
			if (var10 != null) {
				var7 = var10.method2999(var4);
			}

			if (null != var11) {
				var8 = var11.method2999(var4);
			}

			if (null != var12) {
				var9 = var12.method2999(var4);
			}
		}

		class426[] var15;
		synchronized(var15 = class426.field4666){}
		class426 var14;
		if (field4668 == 0) {
			var14 = new class426();
		} else {
			class426.field4666[--field4668].method7867();
			var14 = class426.field4666[field4668];
		}

		var14.method7908(var7, var8, var9);
		var1.method7873(var14);
		var14.method7866();
	}

	static final void method3102(int var0, int var1, int var2) {
		if (Client.field257 < var0) {
			Client.field257 += Client.field138 + Client.field1638 * (var0 - Client.field257) / 1000;
			if (Client.field257 > var0) {
				Client.field257 = var0;
			}
		}

		if (Client.field257 > var0) {
			Client.field257 -= Client.field138 + Client.field1638 * (Client.field257 - var0) / 1000;
			if (Client.field257 < var0) {
				Client.field257 = var0;
			}
		}

		if (Client.field1867 < var1) {
			Client.field1867 += Client.field138 + (var1 - Client.field1867) * Client.field1638 / 1000;
			if (Client.field1867 > var1) {
				Client.field1867 = var1;
			}
		}

		if (Client.field1867 > var1) {
			Client.field1867 -= Client.field138 + (Client.field1867 - var1) * Client.field1638 / 1000;
			if (Client.field1867 < var1) {
				Client.field1867 = var1;
			}
		}

		if (Client.field3391 < var2) {
			Client.field3391 += Client.field1638 * (var2 - Client.field3391) / 1000 + Client.field138;
			if (Client.field3391 > var2) {
				Client.field3391 = var2;
			}
		}

		if (Client.field3391 > var2) {
			Client.field3391 -= Client.field1638 * (Client.field3391 - var2) / 1000 + Client.field138;
			if (Client.field3391 < var2) {
				Client.field3391 = var2;
			}
		}

	}
}
