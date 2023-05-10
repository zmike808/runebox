import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class106 {
	static int field1377;
	static final class368 field1378;
	static final class464 field1375;
	static final Map field1376;

	static {
		field1376 = new HashMap();
		field1375 = new class464(1024);
		field1378 = new class368();
		field1377 = 0;
	}

	static int method3060() {
		return ++field1377 - 1;
	}

	static void method2852(int var0, String var1, String var2) {
		method3129(var0, var1, var2, (String)null);
	}

	static void method3129(int var0, String var1, String var2, String var3) {
		class77 var5 = (class77)field1376.get(var0);
		if (var5 == null) {
			var5 = new class77();
			field1376.put(var0, var5);
		}

		class61 var6 = var5.method2098(var0, var1, var2, var3);
		field1375.method8361(var6, (long)var6.field471);
		field1378.method6864(var6);
		Client.field752 = Client.field680;
	}

	static class61 method2317(int var0, int var1) {
		class77 var3 = (class77)field1376.get(var0);
		return var3.method2099(var1);
	}

	static class61 method2211(int var0) {
		return (class61)field1375.method8360((long)var0);
	}

	static void method3331() {
		field1376.clear();
		field1375.method8362();
		field1378.method6847();
		field1377 = 0;
	}

	static void method586() {
		Iterator var1 = field1375.iterator();

		while (var1.hasNext()) {
			class61 var2 = (class61)var1.next();
			var2.method1199();
		}

	}

	static void method2995() {
		Iterator var1 = field1375.iterator();

		while (var1.hasNext()) {
			class61 var2 = (class61)var1.next();
			var2.method1173();
		}

	}

	static int method2886(int var0) {
		class61 var2 = (class61)field1375.method8360((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return field1378.field4368 == var2.field4740 ? -1 : ((class61)var2.field4740).field471;
		}
	}

	static int method4551(int var0) {
		class61 var2 = (class61)field1375.method8360((long)var0);
		if (null == var2) {
			return -1;
		} else {
			return field1378.field4368 == var2.field4739 ? -1 : ((class61)var2.field4739).field471;
		}
	}

	static final void method2704(class90 var0) {
		long var2 = 0L;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (0 == var0.field1120) {
			var2 = Client.field180.method4394(var0.field1131, var0.field1121, var0.field1122);
		}

		if (1 == var0.field1120) {
			var2 = Client.field180.method4395(var0.field1131, var0.field1121, var0.field1122);
		}

		if (var0.field1120 == 2) {
			var2 = Client.field180.method4396(var0.field1131, var0.field1121, var0.field1122);
		}

		if (3 == var0.field1120) {
			var2 = Client.field180.method4397(var0.field1131, var0.field1121, var0.field1122);
		}

		if (var2 != 0L) {
			int var7 = Client.field180.method4532(var0.field1131, var0.field1121, var0.field1122, var2);
			var4 = class233.method2194(var2);
			var5 = var7 & 31;
			var6 = var7 >> 6 & 3;
		}

		var0.field1123 = var4;
		var0.field1124 = var5;
		var0.field1129 = var6;
	}
}
