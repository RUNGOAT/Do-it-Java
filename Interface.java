package 인터페이스;

interface A {
	int a = 3; 						// 생략했을 때 자동으로 public static final 추가

	void abc(); 					// 생략했을 때 자동으로 public abstract 추가
}

interface B {
}

class D {
}

// 상속
// 클래스명 extends 클래스명 implements 인터페이스명, ... , 인터페이스명{
class C extends D implements A, B {
//	void abc()				오류 발생 : A abc()는 public abstract가 생략돼있기 때문에 오버라이딩 시 default로 접근 범위가 좁아지는 것은 불가능
	public void abc() { 				// 인터페이스를 상속 시에는 반드시 오버라이딩 해야 함 추상 메서드(public abstract)가 포함되어 있기 때문

	}
}

interface A1 { 									// 인터페이스 내에 default 메서드를 통해 완성된 메서드 삽입 가능
	public default void abc() { 				// 상속 시 추가 사항이 있을 때 모든 자식 클래스에 오버라이딩할 필요없음
		System.out.println("A1 인터페이스의 abc()");
	}

	static void bcd() {
		System.out.println("정적 메서드 호출");
	}
}

class B1 implements A1 {
	public void abc() {				 	// 자식 클래스에서 부모 인터페이스의 디폴트 메서드 호출 방법
		A1.super.abc(); 				// 부모 인터페이스명.super.디폴트 메서드명 //super.abc();를 하면 상위 클래스Object의 abc()를 찾음
		System.out.println("B1 클래스의 abc()");
	}
}

public class Interface {
	public static void main(String[] args) {
		A1 a = new B1();
		a.abc();

		A1.bcd();
	}
}
