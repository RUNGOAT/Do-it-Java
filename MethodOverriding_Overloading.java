package methodoverriding;

class A2 {
	void print1() {
		System.out.println("A print1");
	}
	void print2() {
		System.out.println("A print2");
	}
}
class B2 extends A2 {
	void print1() {
		System.out.println("B print1");
	}
	void print2(int a) {
		System.out.println("B print2");
	}
}

public class MethodOverriding_Overloading {
	public static void main(String[] args) {
		A2 aa = new A2();
		B2 bb = new B2();
		A2 ab = new B2();
		
		aa.print1();
		aa.print2();
		System.out.println();
		
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		ab.print1();
		ab.print2();
	}
}
