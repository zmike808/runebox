import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class438 implements class437 {
	JSONObject field4709;

	public class438(JSONObject var1) {
		this.field4709 = var1;
	}

	public class438(String var1) throws UnsupportedEncodingException {
		this.method8013(var1);
	}

	public class438(byte[] var1) throws UnsupportedEncodingException {
		this.method8006(var1);
	}

	public class436 method8004() {
		return class436.field4704;
	}

	void method8006(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method8013(var3);
	}

	void method8013(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4709 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field4709 = new JSONObject();
				this.field4709.put("arrayValues", var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	public JSONObject method8008() {
		return this.field4709;
	}

	public byte[] method8002() throws UnsupportedEncodingException {
		return null == this.field4709 ? new byte[0] : this.field4709.toString().getBytes("UTF-8");
	}
}
