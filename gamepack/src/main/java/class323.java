import java.nio.ByteBuffer;

public class class323 extends class321 {
	ByteBuffer field3737;

	class323() {
	}

	byte[] method6308() {
		byte[] var2 = new byte[this.field3737.capacity()];
		this.field3737.position(0);
		this.field3737.get(var2);
		return var2;
	}

	void method6305(byte[] var1) {
		this.field3737 = ByteBuffer.allocateDirect(var1.length);
		this.field3737.position(0);
		this.field3737.put(var1);
	}
}
