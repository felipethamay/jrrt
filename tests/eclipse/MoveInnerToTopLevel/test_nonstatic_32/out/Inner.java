package p;

class Inner {
	/** Comment */
	private final A a;

	void f() {
		// /this.
		a.m = 1;
	}

	/**
	 * @param a
	 */
	Inner(A a0) {
		this.a = a0;
	}
}