import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class483 extends class444 {
	class479[] field4965;
	List field4963;

	public class483(class344 var1, int var2, int var3) {
		byte[] var4 = var1.method6468(var2, var3 + 1);
		this.method8550(new class489(var4));
	}

	public class483(class344 var1, int var2) {
		byte[] var3 = var1.method6468(var2, 0);
		this.method8550(new class489(var3));
	}

	void method8550(class489 var1) {
		int var3 = var1.method8680((byte)-7);
		this.field4965 = new class479[var3];
		this.field4963 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field4965[var4] = (class479)class199.method3788(class479.method8507(), var1.method8658());
			int var5 = var1.method8680((byte)51);
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field4965[var4].method8510(var1);
				int var8 = var1.method8680((byte)52);
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method8680((byte)-89);
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field4963.add(var4, var6);
		}

	}

	public List method8551(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field4963.get(var2);
		return (List)var4.get(var1);
	}
}
