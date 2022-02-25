package super메서드;

class A1 {
	A1() {
		this(3);
		System.out.println("A 생성자 1");
	}
	A1(int a) {
		System.out.println("A 생성자 2");
	}
}
class B1 extends A1 {
	B1() {
		this(3);
		System.out.println("B 생성자 1");
	}
	B1(int a) {
		/* super(); 컴파일러가 자동으로 추가해 줄 것 */
		System.out.println("B 생성자 2");
	}
}

public class SuperMethod_ThisMethod {
	public static void main(String[] args) {
		A1 aa = new A1();
		System.out.println();
		
		B1 bb = new B1();
		System.out.println();
		
		B1 bb2 = new B1(3);
	}
}
