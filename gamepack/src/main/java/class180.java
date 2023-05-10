public class class180 {
	public short[] field1899;
	public short[] field1900;

	class180(int var1) {
		class202 var2 = class92.method2352(var1);
		if (var2.method3900()) {
			this.field1900 = new short[var2.field2221.length];
			System.arraycopy(var2.field2221, 0, this.field1900, 0, this.field1900.length);
		}

		if (var2.method3916()) {
			this.field1899 = new short[var2.field2223.length];
			System.arraycopy(var2.field2223, 0, this.field1899, 0, this.field1899.length);
		}

	}
}
