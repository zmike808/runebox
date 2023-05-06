public class class428 {
	float[] field4690;
	int field4689;

	class428(float[] var1, int var2) {
		this.field4690 = var1;
		this.field4689 = var2;
	}

	static float method7861(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; --var5) {
			var4 = var0[var5] + var4 * var2;
		}

		return var4;
	}
}
