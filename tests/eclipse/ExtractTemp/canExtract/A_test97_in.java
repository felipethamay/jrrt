package p; //10, 32, 10, 47

import java.util.Enumeration;
import java.util.Vector;

class A {
	void m(Vector v) {
		Enumeration e = v.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
