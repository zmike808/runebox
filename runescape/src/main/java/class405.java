public class class405 extends class412 {
	boolean field4571;
	boolean field4572;

	class405() {
	}

	int method7543(class405 var1) {
		if (super.field4600 == Client.field579 && Client.field579 != var1.field4600) {
			return -1;
		} else if (Client.field579 == var1.field4600 && Client.field579 != super.field4600) {
			return 1;
		} else if (super.field4600 != 0 && 0 == var1.field4600) {
			return -1;
		} else if (var1.field4600 != 0 && 0 == super.field4600) {
			return 1;
		} else if (this.field4572 && !var1.field4572) {
			return -1;
		} else if (!this.field4572 && var1.field4572) {
			return 1;
		} else if (this.field4571 && !var1.field4571) {
			return -1;
		} else if (!this.field4571 && var1.field4571) {
			return 1;
		} else {
			return 0 != super.field4600 ? super.field4598 - var1.field4598 : var1.field4598 - super.field4598;
		}
	}

	public int method7595(class408 var1) {
		return this.method7543((class405)var1);
	}

	public int compareTo(Object var1) {
		return this.method7543((class405)var1);
	}

	static final void method7551() {
		Client.field609 = 0;
		int var1 = Client.field2850 + (Client.field3454.field1171 >> 7);
		int var2 = Client.field2841 + (Client.field3454.field1138 >> 7);
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			Client.field609 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			Client.field609 = 1;
		}

		if (1 == Client.field609 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			Client.field609 = 0;
		}

	}

	static String method7550(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.field581[var0].length() > 0 ? Client.field639[var0] + class337.field4010 + Client.field581[var0] : Client.field639[var0];
		}
	}
}
