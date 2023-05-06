public class class420 {
	public int field4637;
	public int field4638;
	public int field4639;
	public int field4640;
	public int field4641;
	public int field4642;
	public int field4643;
	public int field4644;
	public int field4645;
	public int field4646;
	public int field4647;

	public class420() {
		this.field4647 = -1;
		this.field4637 = -1;
		this.field4639 = -1;
		this.field4640 = -1;
		this.field4645 = -1;
		this.field4642 = -1;
		this.field4643 = -1;
		this.field4641 = -1;
		this.field4644 = -1;
		this.field4646 = -1;
		this.field4638 = -1;
	}

	public void method7784(class344 var1) {
		byte[] var3 = var1.method6501(class419.field4636.field4635);
		class489 var4 = new class489(var3);

		while (true) {
			int var5 = var4.method8658();
			if (var5 == 0) {
				return;
			}

			switch(var5) {
			case 1:
				var4.method8662();
				break;
			case 2:
				this.field4647 = var4.method8710();
				this.field4637 = var4.method8710();
				this.field4639 = var4.method8710();
				this.field4640 = var4.method8710();
				this.field4645 = var4.method8710();
				this.field4642 = var4.method8710();
				this.field4643 = var4.method8710();
				this.field4641 = var4.method8710();
				this.field4644 = var4.method8710();
				this.field4646 = var4.method8710();
				this.field4638 = var4.method8710();
			}
		}
	}

	static final void method7786() {
		for (class68 var1 = (class68)Client.field627.method6716(); var1 != null; var1 = (class68)Client.field627.method6725()) {
			if (var1.field857 == Client.field231 && !var1.field858) {
				if (Client.field602 >= var1.field856) {
					var1.method1964(Client.field565);
					if (var1.field858) {
						var1.method8051();
					} else {
						Client.field180.method4379(var1.field857, var1.field862, var1.field859, var1.field860, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.method8051();
			}
		}

	}
}
