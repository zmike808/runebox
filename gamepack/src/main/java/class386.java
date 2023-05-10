public class class386 {
	int field4459;
	int field4460;
	int field4461;
	int field4462;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4460).length();
		int var3 = 10 - Integer.toString(this.field4461).length();
		int var4 = 10 - Integer.toString(this.field4462).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4460 + var5 + "Created: " + this.field4462 + var7 + "Total used: " + this.field4461 + var6 + "Max-In-Use: " + this.field4459;
	}
}
