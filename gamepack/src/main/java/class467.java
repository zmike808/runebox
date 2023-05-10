import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class467 implements class466 {
	Map field4906;
	final class497 field4905;

	public class467(class497 var1) {
		this.field4905 = var1;
	}

	public int method8402(int var1) {
		if (this.field4906 != null) {
			class498 var3 = (class498)this.field4906.get(var1);
			if (var3 != null) {
				return (Integer)var3.field5058;
			}
		}

		return (Integer)this.field4905.method8972(var1);
	}

	public void method8399(int var1, Object var2) {
		if (null == this.field4906) {
			this.field4906 = new HashMap();
			this.field4906.put(var1, new class498(var1, var2));
		} else {
			class498 var4 = (class498)this.field4906.get(var1);
			if (null == var4) {
				this.field4906.put(var1, new class498(var1, var2));
			} else {
				var4.field5058 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4906 == null ? Collections.emptyList().iterator() : this.field4906.values().iterator();
	}
}
