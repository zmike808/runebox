public abstract class class431 extends class274 implements class497 {
	protected class431(class333 var1, class359 var2, int var3) {
		super(var1, var2, var3);
	}

	protected abstract class433 method7968(int var1);

	public int method7960() {
		return super.field3072;
	}

	public Object method8972(int var1) {
		class433 var3 = this.method7968(var1);
		return null != var3 && var3.method7982() ? var3.method7987() : null;
	}

	public class498 method7962(class489 var1) {
		int var3 = var1.method8660();
		class433 var4 = this.method7968(var3);
		class498 var5 = new class498(var3);
		Class var6 = var4.field4702.field4952;
		if (var6 == Integer.class) {
			var5.field5058 = var1.method8664();
		} else if (var6 == Long.class) {
			var5.field5058 = var1.method8681();
		} else if (var6 == String.class) {
			var5.field5058 = var1.method8670();
		} else {
			if (!class493.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				class493 var7 = (class493)var6.newInstance();
				var7.method8946(var1);
				var5.field5058 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}
}
