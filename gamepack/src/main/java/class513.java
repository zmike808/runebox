public class class513 implements Comparable {
	String field5148;
	String field5149;

	public class513(String var1) {
		this.field5149 = var1;
		this.field5148 = class31.method469(var1, class469.field4909);
	}

	public class513(String var1, class469 var2) {
		this.field5149 = var1;
		this.field5148 = class31.method469(var1, var2);
	}

	public String method9256() {
		return this.field5149;
	}

	public String method9257() {
		return this.field5148;
	}

	public boolean method9258() {
		return this.field5148 != null;
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class513) {
			class513 var2 = (class513)var1;
			if (null == this.field5148) {
				return null == var2.field5148;
			} else if (var2.field5148 == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field5148.equals(var2.field5148);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return null == this.field5148 ? 0 : this.field5148.hashCode();
	}

	public String toString() {
		return this.method9256();
	}

	public int method9260(class513 var1) {
		if (this.field5148 == null) {
			return var1.field5148 == null ? 0 : 1;
		} else {
			return null == var1.field5148 ? -1 : this.field5148.compareTo(var1.field5148);
		}
	}

	public int compareTo(Object var1) {
		return this.method9260((class513)var1);
	}
}
