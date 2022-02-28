package 연습문제_추상클래스;

abstract class A {
	abstract void abc();
}
//추상 클래스를 일반 클래스로 상속해 객체 생성
//class B extends A {
//	void abc() {
//		System.out.println("안녕하세요");
//	}
//}

public class Practice12 {
	public static void main(String[] args) {
		// 익명 이너 클래스 사용
		A a = new A() {
			@Override
			void abc() {
				System.out.println("반갑습니다");
			}
		};
		a.abc();
		
		B1 b = new B1();
		b.abc();
	}
}

interface A1 {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}
class B1 implements A1 {
	@Override
	public void abc() {
		A1.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}