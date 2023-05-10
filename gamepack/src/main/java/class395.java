import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class class395 {
	final DecimalFormat field4527;
	final Map field4522;
	final Map field4526;

	public class395() {
		this.field4522 = new HashMap();
		this.field4526 = new HashMap();
		this.field4527 = new DecimalFormat();
		this.field4527.setMaximumFractionDigits(2);
	}

	public void method7364(HttpsURLConnection var1) {
		Iterator var3 = this.field4522.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}

	}

	public Map method7365() {
		return this.field4522;
	}

	public void method7366(String var1, String var2) {
		if (null != var1 && !var1.isEmpty()) {
			this.field4522.put(var1, var2 != null ? var2 : "");
		}

	}

	public void method7396(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			this.field4522.remove(var1);
		}

	}

	void method7368(class394 var1, String var2) {
		String var4 = String.format("%s %s", var1.method7360(), var2);
		this.method7366("Authorization", var4);
	}

	public void method7384(String var1) {
		this.method7368(class394.field4520, var1);
	}

	public void method7370(String var1) {
		this.method7368(class394.field4519, var1);
	}

	public void method7371(class436 var1) {
		this.field4522.put("Content-Type", var1.method7996());
	}

	public void method7372() {
		this.field4522.remove("Content-Type");
	}

	public void method7373(class436 var1) {
		this.method7374(var1, 1.0F);
	}

	void method7374(class436 var1, float var2) {
		this.field4526.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method7375();
	}

	void method7375() {
		this.field4522.remove("Accept");
		if (!this.field4526.isEmpty()) {
			this.field4522.put("Accept", this.method7404());
		}

	}

	String method7404() {
		ArrayList var2 = new ArrayList(this.field4526.entrySet());
		Collections.sort(var2, new class396(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((class436)var5.getKey()).method7996());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field4527.format((double)var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}
}
