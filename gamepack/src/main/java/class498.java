public class class498 {
	public Object field5058;
	public final int field5059;

	public class498(int var1) {
		this.field5059 = var1;
	}

	public class498(int var1, Object var2) {
		this.field5059 = var1;
		this.field5058 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class498)) {
			return false;
		} else {
			class498 var2 = (class498)var1;
			if (null == var2.field5058 && null != this.field5058) {
				return false;
			} else if (this.field5058 == null && null != var2.field5058) {
				return false;
			} else {
				return var2.field5059 == this.field5059 && var2.field5058.equals(this.field5058);
			}
		}
	}
}
