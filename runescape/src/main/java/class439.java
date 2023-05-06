import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class439 implements class437 {
	final Map field4713;

	public class439(Map var1) {
		this.field4713 = var1;
	}

	public class436 method8004() {
		return null;
	}

	public byte[] method8002() throws UnsupportedEncodingException {
		return this.method8019().getBytes("UTF-8");
	}

	public String method8019() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field4713.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
			String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
			var2.append(var5).append("=").append(var6).append("&");
		}

		if (var2.length() == 0) {
			return "";
		} else {
			var2.deleteCharAt(var2.length() - 1);
			var2.insert(0, "?");
			return var2.toString();
		}
	}
}
