public class class153 extends class156 {
	byte field1742;
	int field1741;
	int field1743;
	String field1744;
	// $FF: synthetic field
	final class157 this$0;

	class153(class157 var1) {
		this.this$0 = var1;
		this.field1741 = -1;
	}

	void method3284(class489 var1) {
		var1.method8658();
		this.field1741 = var1.method8660();
		this.field1742 = var1.method8659();
		this.field1743 = var1.method8660();
		var1.method8681();
		this.field1744 = var1.method8669();
		var1.method8658();
	}

	void method3285(class160 var1) {
		class142 var3 = (class142)var1.field1770.get(this.field1741);
		var3.field1650 = this.field1742;
		var3.field1655 = this.field1743;
		var3.field1652 = new class513(this.field1744);
	}
}
