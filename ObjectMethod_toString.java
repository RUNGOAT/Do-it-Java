package objectclass;

class A {		// extends Object (컴파일러에 따라 자동으로 추가)
	int a = 3;
	int b = 4;
}
class B {
	int a = 3;
	int b = 4;
	@Override
	public String toString() {
		return "(a, b) = " + a + ", " + b;
	}
}

public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		
		B b = new B();
		System.out.println(b);					// .toString() 생략했을 때 자동으로 추가
		System.out.println(b.toString());
	}
}
