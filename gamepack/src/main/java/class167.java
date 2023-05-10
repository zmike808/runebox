import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class167 {
	class110 field1803;
	float[] field1811;
	int field1807;
	String field1808;
	String field1810;
	ArrayList field1812;
	ArrayList field1813;
	ArrayList field1814;
	Map field1800;
	Map field1815;

	public class167() {
		this.field1807 = -1;
		this.field1810 = null;
		this.field1811 = new float[4];
		this.field1812 = new ArrayList();
		this.field1813 = new ArrayList();
		this.field1814 = new ArrayList();
		this.field1815 = new HashMap();
		this.field1800 = new HashMap();
	}

	public boolean method3352(String var1, class108 var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3362();

				try {
					this.field1808 = var1;
					this.field1803 = var2.method2764(new URL(this.field1808));
					this.field1807 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method3362();
					this.field1807 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public void method3353(class108 var1) {
		switch(this.field1807) {
		case 0:
			this.method3413(var1);
			break;
		case 1:
			this.method3357();
			break;
		default:
			return;
		}

	}

	public int method3354() {
		return this.field1807;
	}

	public int method3364(String var1) {
		return this.field1815.containsKey(var1) ? (Integer)this.field1815.get(var1) : -1;
	}

	public String method3356(String var1) {
		return (String)((String)(this.field1800.containsKey(var1) ? this.field1800.get(var1) : null));
	}

	public ArrayList method3359() {
		return this.field1813;
	}

	public ArrayList method3412() {
		return this.field1814;
	}

	public String method3395() {
		return this.field1810;
	}

	public float[] method3360() {
		return this.field1811;
	}

	public ArrayList method3361() {
		return this.field1812;
	}

	void method3362() {
		this.field1803 = null;
		this.field1810 = null;
		this.field1811[0] = 0.0F;
		this.field1811[1] = 0.0F;
		this.field1811[2] = 1.0F;
		this.field1811[3] = 1.0F;
		this.field1812.clear();
		this.field1813.clear();
		this.field1814.clear();
		this.field1815.clear();
		this.field1800.clear();
	}

	void method3413(class108 var1) {
		if (null != this.field1803 && this.field1803.method2793()) {
			byte[] var3 = this.field1803.method2795();
			if (var3 == null) {
				this.method3362();
				this.field1807 = 100;
			} else {
				try {
					this.method3369(new class438(var3), var1);
				} catch (UnsupportedEncodingException var5) {
					this.method3362();
					this.field1807 = 102;
					return;
				}

				this.field1807 = this.field1813.size() > 0 ? 1 : 2;
				this.field1803 = null;
			}
		}
	}

	void method3357() {
		Iterator var2 = this.field1813.iterator();

		class173 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field1813.iterator();

				while (var2.hasNext()) {
					var3 = (class173)var2.next();
					if (null != var3.field1850) {
						byte[] var4 = var3.field1850.method2795();
						if (null != var4 && var4.length > 0) {
							this.field1807 = 2;
							return;
						}
					}
				}

				this.method3362();
				this.field1807 = 101;
				return;
			}

			var3 = (class173)var2.next();
		} while(var3.field1850 == null || var3.field1850.method2793());

	}

	void method3365(JSONArray var1, class108 var2) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class173 var6 = new class173(this);
					var6.field1850 = var2.method2764(new URL(var5.getString("src")));
					var6.field1849 = method2823(var5, "placement");
					this.field1813.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	void method3366(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class174 var5 = new class174(this);
				var5.field1856 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}

				var5.field1859 = var7;
				String var11 = var4.getString("align_y");
				byte var10;
				if (var11.equals("centre")) {
					var10 = 1;
				} else if (!var11.equals("bottom") && !var11.equals("right")) {
					var10 = 0;
				} else {
					var10 = 2;
				}

				var5.field1860 = var10;
				var5.field1854 = var4.getInt("font");
				var5.field1857 = method2823(var4, "placement");
				this.field1814.add(var5);
			}

		}
	}

	void method3367(JSONObject var1) throws JSONException {
		if (null != var1) {
			this.field1811 = method2823(var1, "clickbounds");
			this.field1810 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field1812.add(new class175(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field1812.add(new class175(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field1812.add(new class175(this, var3[var4], 0));
							} else {
								this.field1812.add(new class166(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	void method3396(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.getInt(var3[var4]);
				this.field1815.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field1815.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field1815.put(var3[var4], 0);
					} else {
						this.field1800.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	void method3369(class438 var1, class108 var2) {
		JSONObject var4;
		try {
			var4 = var1.method8008();
			var4 = var4.getJSONObject("message");
		} catch (Exception var10) {
			this.method3362();
			this.field1807 = 102;
			return;
		}

		try {
			this.method3365(var4.getJSONArray("images"), var2);
		} catch (Exception var9) {
			this.field1813.clear();
		}

		try {
			this.method3366(var4.getJSONArray("labels"));
		} catch (Exception var8) {
			this.field1814.clear();
		}

		try {
			this.method3367(var4.getJSONObject("behaviour"));
		} catch (Exception var7) {
			this.field1810 = null;
			this.field1811[0] = 0.0F;
			this.field1811[1] = 0.0F;
			this.field1811[2] = 1.0F;
			this.field1811[3] = 1.0F;
			this.field1812.clear();
		}

		try {
			this.method3396(var4.getJSONObject("meta"));
		} catch (Exception var6) {
			this.field1815.clear();
			this.field1800.clear();
		}

	}

	public boolean method3370(String var1, class108 var2) {
		try {
			this.method3369(new class438(var1.getBytes()), var2);
			this.field1807 = this.field1813.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var5) {
			this.field1807 = 102;
		}

		return this.field1807 < 100;
	}

	static float[] method2823(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0D);
			var3[1] = (float)var4.optDouble(1, 0.0D);
			var3[2] = (float)var4.optDouble(2, 1.0D);
			var3[3] = (float)var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}

	static final void method3417(class317 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field570) {
			Client.field571 = 32;
		} else {
			Client.field571 = 0;
		}

		Client.field570 = false;
		int var8;
		if (class36.field232 == 1 || !Client.field4941 && class36.field232 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field3592 -= 4;
				Client.method3176(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.field3592 += 4;
				Client.method3176(var0);
			} else if (var5 >= var1 - Client.field571 && var5 < Client.field571 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
				var8 = (var3 - 32) * var3 / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field3592 = var9 * (var4 - var3) / var10;
				Client.method3176(var0);
				Client.field570 = true;
			}
		}

		if (Client.field697 != 0) {
			var8 = var0.field3572;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field3592 += Client.field697 * 45;
				Client.method3176(var0);
			}
		}

	}
}
