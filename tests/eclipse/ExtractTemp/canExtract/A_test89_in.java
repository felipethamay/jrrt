// 15, 7, 15, 15
package p;

import a.A;

class C {
	b.A method() {
		return new b.A();
	}

	void failHere() {
		method(); // extract local variable here
	}
}