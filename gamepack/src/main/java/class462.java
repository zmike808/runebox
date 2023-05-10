public class class462 {
	public final Object field4887;
	public final Object field4888;

	public class462(Object var1, Object var2) {
		this.field4887 = var1;
		this.field4888 = var2;
	}

	public String toString() {
		return this.field4887 + ", " + this.field4888;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class462) {
			class462 var2 = (class462)var1;
			if (this.field4887 == null) {
				if (var2.field4887 != null) {
					return false;
				}
			} else if (!this.field4887.equals(var2.field4887)) {
				return false;
			}

			if (null == this.field4888) {
				if (var2.field4888 != null) {
					return false;
				}
			} else if (!this.field4888.equals(var2.field4888)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (null != this.field4887) {
			var1 += this.field4887.hashCode();
		}

		if (this.field4888 != null) {
			var1 += 31 * this.field4888.hashCode();
		}

		return var1;
	}
}
