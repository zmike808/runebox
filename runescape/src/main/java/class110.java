import java.net.URL;

public class class110 {
	static int field1407;
	static int field1408;
	final URL field1409;
	volatile byte[] field1410;
	volatile int field1406;

	static {
		field1408 = -1;
		field1407 = -2;
	}

	class110(URL var1) {
		this.field1406 = field1408;
		this.field1409 = var1;
	}

	public boolean method2793() {
		return this.field1406 != field1408;
	}

	public byte[] method2795() {
		return this.field1410;
	}

	public String method2803() {
		return this.field1409.toString();
	}
}
