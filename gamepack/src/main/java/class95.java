public class class95 extends class449 {
	class186 field1266;
	class365 field1264;

	class95(class186 var1) {
		this.field1264 = new class365();
		this.field1266 = var1;
	}

	void method2491(int var1, int var2, int var3, int var4) {
		class92 var6 = null;
		int var7 = 0;

		for (class92 var8 = (class92)this.field1264.method6798(); var8 != null; var8 = (class92)this.field1264.method6767()) {
			++var7;
			if (var8.field1218 == var1) {
				var8.method2347(var1, var2, var3, var4);
				return;
			}

			if (var8.field1218 <= var1) {
				var6 = var8;
			}
		}

		if (var6 == null) {
			if (var7 < 4) {
				this.field1264.method6770(new class92(var1, var2, var3, var4));
			}

		} else {
			class365.method6756(new class92(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field1264.method6798().method8051();
			}

		}
	}

	class92 method2490(int var1) {
		class92 var3 = (class92)this.field1264.method6798();
		if (null != var3 && var3.field1218 <= var1) {
			for (class92 var4 = (class92)this.field1264.method6767(); null != var4 && var4.field1218 <= var1; var4 = (class92)this.field1264.method6767()) {
				var3.method8051();
				var3 = var4;
			}

			if (this.field1266.field1969 + var3.field1219 + var3.field1218 > var1) {
				return var3;
			} else {
				var3.method8051();
				return null;
			}
		} else {
			return null;
		}
	}

	boolean method2493() {
		return this.field1264.method6757();
	}
}
