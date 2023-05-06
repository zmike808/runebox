import java.net.MalformedURLException;
import java.net.URL;

public class class312 {
	class110 field3498;
	class503 field3500;

	class312(String var1, class108 var2) {
		try {
			this.field3498 = var2.method2764(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3498 = null;
		}

	}

	class312(class110 var1) {
		this.field3498 = var1;
	}

	class503 method5792() {
		if (null == this.field3500 && this.field3498 != null && this.field3498.method2793()) {
			if (this.field3498.method2795() != null) {
				this.field3500 = class31.method6357(this.field3498.method2795());
			}

			this.field3498 = null;
		}

		return this.field3500;
	}
}
