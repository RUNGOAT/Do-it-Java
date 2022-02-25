package super키워드;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A {
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc();				// this.abc();
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		
		B b = new B();
		b.bcd();
		
		B1 b1 = new B1();
		b1.bcd();
	}
}

class A1 {
	void abc() {
		System.out.println("A1의 abc()");
	}
}
class B1 extends A1 {
	void abc() {
		System.out.println("B1의 abc()");
	}
	void bcd() {
		super.abc();
	}
}