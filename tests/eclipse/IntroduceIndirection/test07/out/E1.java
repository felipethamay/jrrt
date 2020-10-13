package p;

public class E1 {

	/**
	 * @param inner1
	 */
	public static void bar(E1Inner1 e1Inner1) {
		e1Inner1.foo();
	}

	// Test warning if anonymous class cannot be qualified.

	public class E1Inner1 {
		public void foo() {
		}

		protected int n;
	}

	public class E1Inner2 {
		public void run() {
		}
	}

	public void foo() {
		E1Inner1 inner = new E1Inner1() {

			public void foo() {
				E1Inner2 inner2 = new E1Inner2() {
					public void run() {
						foo();
					}
				};
			}
		};
	}

	{
		E1Inner1 inner1 = new E1Inner1();
		bar(inner1); // <--------- invoke here
	}

}
