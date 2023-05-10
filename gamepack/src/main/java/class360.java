import java.util.HashSet;
import java.util.Set;

public class class360 implements class357 {
	static final class360 field4333;
	static final class360 field4334;
	static final class360 field4335;
	static final class360 field4336;
	static final class360 field4337;
	static final class360 field4338;
	static final class360 field4340;
	static final class360 field4341;
	static final class360 field4342;
	static final class360 field4343;
	static final class360 field4344;
	static final class360 field4350;
	static final class360 field4352;
	final int field4346;
	final Set field4347;

	static {
		field4352 = new class360("", 0, new class356[]{class356.field4308});
		field4334 = new class360("", 1, new class356[]{class356.field4309, class356.field4308});
		field4335 = new class360("", 2, new class356[]{class356.field4309, class356.field4310, class356.field4308});
		field4344 = new class360("", 3, new class356[]{class356.field4309});
		field4337 = new class360("", 4);
		field4340 = new class360("", 5, new class356[]{class356.field4309, class356.field4308});
		field4333 = new class360("", 6, new class356[]{class356.field4308});
		field4336 = new class360("", 8, new class356[]{class356.field4309, class356.field4308});
		field4341 = new class360("", 9, new class356[]{class356.field4309, class356.field4310});
		field4342 = new class360("", 10, new class356[]{class356.field4309});
		field4343 = new class360("", 11, new class356[]{class356.field4309});
		field4350 = new class360("", 12, new class356[]{class356.field4309, class356.field4308});
		field4338 = new class360("", 13, new class356[]{class356.field4309});
		method6693();
	}

	class360(String var1, int var2) {
		this.field4347 = new HashSet();
		this.field4346 = var2;
	}

	class360(String var1, int var2, class356[] var3) {
		this.field4347 = new HashSet();
		this.field4346 = var2;
		class356[] var4 = var3;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class356 var6 = var4[var5];
			this.field4347.add(var6);
		}

	}

	public int method6674() {
		return this.field4346;
	}

	static class360[] method6693() {
		return new class360[]{field4333, field4341, field4340, field4352, field4344, field4343, field4334, field4350, field4336, field4335, field4337, field4338, field4342};
	}

	static String method6697(String var0) {
		class339[] var2 = class339.method6352();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class339 var4 = var2[var3];
			if (var4.field4185 != -1 && var0.startsWith(class97.method6375(var4.field4185))) {
				var0 = var0.substring(6 + Integer.toString(var4.field4185).length());
				break;
			}
		}

		return var0;
	}
}
