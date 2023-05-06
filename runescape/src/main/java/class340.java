public class class340 extends class449 {
	int field4190;
	public byte[] field4191;
	public class342 field4193;
	public class418 field4192;

	class340() {
	}

	static final String method6374(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + class97.field1295 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + class97.method7285(65408) + var2.substring(0, var2.length() - 8) + class337.field4011 + " " + class97.field1287 + var2 + class97.field1288 + class97.field1291;
		} else {
			return var2.length() > 6 ? " " + class97.method7285(16777215) + var2.substring(0, var2.length() - 4) + class337.field4013 + " " + class97.field1287 + var2 + class97.field1288 + class97.field1291 : " " + class97.method7285(16776960) + var2 + class97.field1291;
		}
	}
}
