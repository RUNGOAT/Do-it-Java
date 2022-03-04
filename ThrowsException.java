package 예외전가;

// 1. 하위 메서드에 직접 예외를 처리할 때
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");	// ClassNotFoundException
			Thread.sleep(1000); 		// InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외 처리 구문
		}
	}
}

// 2. 예외를 호출 메서드로 전가할 때
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			// 예외 처리 구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		
		B b = new B();
		b.abc();
		
	}
}
