package 이너클래스;

class A {
	int a = 3;
	int b = 4;
	static int c = 7;
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	
	// 인스턴스 이너 클래스 정의
	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			// 이너 클래스의 멤버 호출 또는 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			// 아우터 클래스의 멤버 호출 또는 사용
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	static class C {
		void cde() {
			// 필드 사용
//			System.out.println(a);		정적 이너 클래스는 아우터 클래스의 정적 멤버만 사용 가능
			System.out.println(c);
			// 메서드 호출
//			method1();					정적 이너 클래스는 아우터 클래스의 정적 멤버만 사용 가능
			method2();
		}
	}
}

public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		// 아우터 클래스 객체 생성
		A a = new A();
		
		// 이너 클래스 객체 생성
		A.B b = a.new B();
		b.bcd();
		
		// 정적 이너 클래스의 객체 생성
		A.C c = new A.C();
		// 메서드 호출
		c.cde();
	}
}
