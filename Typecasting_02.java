package typecasting.EX02;
//선언 타입에 따른 사용할 수 있는 멤버

class A {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}
public class Typecasting_02 {
	public static void main(String[] args) {
		// A 타입 / A 생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		// B 타입 / B 생성자
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		// A 타입 / B 생성자 : 다형적 표현
		A ab = new B();
		System.out.println(ab.m);
//		System.out.println(ab.n);			선언된 타입이 의미하는 바는 실제 객체에서 자신이 선언된 타입의 객체를 가리키게 되는 것이다.
		ab.abc();
//		ab.bcd();							즉, 참조 변수 ab는 A객체를 가리키므로 B객체에 있는 멤버는 사용할 수 없다.
	}
}
