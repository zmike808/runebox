public class class193 {
	static final class193 field2062;
	static final class193 field2063;
	static final class193 field2064;
	static final class193 field2066;
	static final class193 field2067;
	static final class193 field2069;
	static final class193 field2070;

	static {
		field2069 = new class193(0, class205.field2324);
		field2063 = new class193(1, class205.field2325);
		field2064 = new class193(2, class205.field2320);
		field2062 = new class193(3, class205.field2322);
		field2066 = new class193(4, class205.field2319);
		field2067 = new class193(5, class205.field2323);
		field2070 = new class193(6, class205.field2328);
	}

	class193(int var1, class205 var2) {
	}

	static void method3701(class317 var0, int var1, int var2) {
		if (var0.field3609 == 0) {
			var0.field3661 = var0.field3579;
		} else if (var0.field3609 == 1) {
			var0.field3661 = (var1 - var0.field3572) / 2 + var0.field3579;
		} else if (var0.field3609 == 2) {
			var0.field3661 = var1 - var0.field3572 - var0.field3579;
		} else if (var0.field3609 == 3) {
			var0.field3661 = var0.field3579 * var1 >> 14;
		} else if (4 == var0.field3609) {
			var0.field3661 = (var1 * var0.field3579 >> 14) + (var1 - var0.field3572) / 2;
		} else {
			var0.field3661 = var1 - var0.field3572 - (var0.field3579 * var1 >> 14);
		}

		if (var0.field3576 == 0) {
			var0.field3715 = var0.field3580;
		} else if (1 == var0.field3576) {
			var0.field3715 = (var2 - var0.field3586) / 2 + var0.field3580;
		} else if (var0.field3576 == 2) {
			var0.field3715 = var2 - var0.field3586 - var0.field3580;
		} else if (3 == var0.field3576) {
			var0.field3715 = var0.field3580 * var2 >> 14;
		} else if (4 == var0.field3576) {
			var0.field3715 = (var2 - var0.field3586) / 2 + (var2 * var0.field3580 >> 14);
		} else {
			var0.field3715 = var2 - var0.field3586 - (var0.field3580 * var2 >> 14);
		}

	}
}
