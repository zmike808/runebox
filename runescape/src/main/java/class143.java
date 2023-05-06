public class class143 {
	class365 field1659;
	int field1658;
	long field1662;

	public class143(class489 var1) {
		this.field1658 = -1;
		this.field1659 = new class365();
		this.method3166(var1);
	}

	void method3166(class489 var1) {
		this.field1662 = var1.method8681();
		this.field1658 = var1.method8664();

		for (int var3 = var1.method8658(); var3 != 0; var3 = var1.method8658()) {
			Object var4;
			if (var3 == 3) {
				var4 = new class162(this);
			} else if (var3 == 1) {
				var4 = new class138(this);
			} else if (var3 == 13) {
				var4 = new class155(this);
			} else if (var3 == 4) {
				var4 = new class147(this);
			} else if (var3 == 6) {
				var4 = new class154(this);
			} else if (var3 == 5) {
				var4 = new class139(this);
			} else if (var3 == 2) {
				var4 = new class144(this);
			} else if (var3 == 7) {
				var4 = new class137(this);
			} else if (var3 == 14) {
				var4 = new class141(this);
			} else if (var3 == 8) {
				var4 = new class158(this);
			} else if (var3 == 9) {
				var4 = new class164(this);
			} else if (var3 == 10) {
				var4 = new class150(this);
			} else if (var3 == 11) {
				var4 = new class145(this);
			} else if (var3 == 12) {
				var4 = new class149(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new class159(this);
			}

			((class140)var4).method3152(var1);
			this.field1659.method6793((class449)var4);
		}

	}

	public void method3157(class151 var1) {
		if (this.field1662 == var1.field1730 && var1.field1713 == this.field1658) {
			for (class140 var3 = (class140)this.field1659.method6798(); var3 != null; var3 = (class140)this.field1659.method6767()) {
				var3.method3151(var1);
			}

			++var1.field1713;
		} else {
			throw new RuntimeException("");
		}
	}

	static final void method3167() {
		for (class73 var1 = (class73)Client.field551.method6716(); null != var1; var1 = (class73)Client.field551.method6725()) {
			if (Client.field231 == var1.field931 && Client.field602 <= var1.field938) {
				if (Client.field602 >= var1.field937) {
					if (var1.field941 > 0) {
						class96 var2 = Client.field546[var1.field941 - 1];
						if (null != var2 && var2.field1171 >= 0 && var2.field1171 < 13312 && var2.field1138 >= 0 && var2.field1138 < 13312) {
							var1.method2052(var2.field1171, var2.field1138, class148.method3196(var2.field1171, var2.field1138, var1.field931) - var1.field936, Client.field602);
						}
					}

					if (var1.field941 < 0) {
						int var3 = -var1.field941 - 1;
						class88 var4;
						if (Client.field664 == var3) {
							var4 = Client.field3454;
						} else {
							var4 = Client.field611[var3];
						}

						if (var4 != null && var4.field1171 >= 0 && var4.field1171 < 13312 && var4.field1138 >= 0 && var4.field1138 < 13312) {
							var1.method2052(var4.field1171, var4.field1138, class148.method3196(var4.field1171, var4.field1138, var1.field931) - var1.field936, Client.field602);
						}
					}

					var1.method2049(Client.field565);
					Client.field180.method4379(Client.field231, (int)var1.field943, (int)var1.field944, (int)var1.field945, 60, var1, var1.field951, -1L, false);
				}
			} else {
				var1.method8051();
			}
		}

	}
}
