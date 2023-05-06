public final class class400 implements Comparable {
	Object field4543;
	Object field4544;
	long field4545;
	long field4546;

	class400(Object var1, Object var2) {
		this.field4543 = var1;
		this.field4544 = var2;
	}

	int method7460(class400 var1) {
		if (this.field4546 < var1.field4546) {
			return -1;
		} else {
			return this.field4546 > var1.field4546 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class400) {
			return this.field4544.equals(((class400)var1).field4544);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4544.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method7460((class400)var1);
	}
}
