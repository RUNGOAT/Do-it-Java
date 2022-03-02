package 익명_이너_클래스;

interface A {
	public abstract void abc();
}

class B implements A {
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass {
	public static void main(String[] args) {
		C c = new C();
		
		// 방법1. 클래스명 O + 참조 변수명 O
		A a = new B();
		c.cde(a);
		
		// 방법2. 클래스명 O + 참조 변수명 X
		c.cde(new B());
		
		// 방법3. 클래스명 X + 참조 변수명 O
		A a1 = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		c.cde(a1);
		a1.abc();
		
		// 방법4. 클래스명 X + 참조 변수명 X
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		});
	}
}
