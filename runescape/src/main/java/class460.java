import java.util.HashMap;

public class class460 {
	class344 field4873;
	class344 field4875;
	HashMap field4874;

	public class460(class344 var1, class344 var2) {
		this.field4875 = var1;
		this.field4873 = var2;
		this.field4874 = new HashMap();
	}

	public HashMap method8333(class461[] var1) {
		HashMap var3 = new HashMap();
		class461[] var4 = var1;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class461 var6 = var4[var5];
			if (this.field4874.containsKey(var6)) {
				var3.put(var6, this.field4874.get(var6));
			} else {
				class379 var7 = class415.method7732(this.field4875, this.field4873, var6.field4882, "");
				if (var7 != null) {
					this.field4874.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
