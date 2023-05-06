public class class182 extends class444 {
	public static class280 field1911;
	public static class344 field1910;
	public int field1912;

	static {
		field1911 = new class280(64);
	}

	class182() {
		this.field1912 = 0;
	}

	void method3517(class489 var1) {
		while (true) {
			int var3 = var1.method8658();
			if (var3 == 0) {
				return;
			}

			this.method3520(var1, var3);
		}
	}

	void method3520(class489 var1, int var2) {
		if (var2 == 5) {
			this.field1912 = var1.method8660();
		}

	}

	public static class182 method7787(int var0) {
		class182 var2 = (class182)field1911.method5461((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1910.method6468(16, var0);
			var2 = new class182();
			if (var3 != null) {
				var2.method3517(new class489(var3));
			}

			field1911.method5463(var2, (long)var0);
			return var2;
		}
	}

	static class127[] method3525() {
		return new class127[]{class127.field1536, class127.field1533, class127.field1534, class127.field1539, class127.field1540, class127.field1537};
	}
}
