public class class146 extends class156 {
	byte field1681;
	int field1680;
	int field1685;
	String field1683;
	// $FF: synthetic field
	final class157 this$0;

	class146(class157 var1) {
		this.this$0 = var1;
		this.field1680 = -1;
	}

	void method3284(class489 var1) {
		this.field1680 = var1.method8660();
		this.field1681 = var1.method8659();
		this.field1685 = var1.method8660();
		var1.method8681();
		this.field1683 = var1.method8669();
	}

	void method3285(class160 var1) {
		class142 var3 = (class142)var1.field1770.get(this.field1680);
		var3.field1650 = this.field1681;
		var3.field1655 = this.field1685;
		var3.field1652 = new class513(this.field1683);
	}
}
