package objectclass;

// object클래스의 equals는 등가 비교 연산(==) 동일한 기능을 수행한다.
// object의 equals는 위칫값을 비교한다.
// 내용을 비교할려면 직접 equals메서드를 overriding해야 함

class A2 {
	String name;

	A2(String name) {
		this.name = name;
	}
}

class B2 {
	String name;

	B2(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B2) obj).name) {
			return true;
		} else
			return false;
	}
}

public class ObjectMethod_equals {
	public static void main(String[] args) {
		A2 a1 = new A2("안녕");
		A2 a2 = new A2("안녕");

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		B2 b1 = new B2("안녕");
		B2 b2 = new B2("안녕");
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}
}
