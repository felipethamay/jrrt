package p;

class A {
	static void m() {
	}
}

class B extends A {

}

class Test {
	void f() {
		new A().m();
		A.m();
		new B().m();
		B.m();
	}
}