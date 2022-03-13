package boundedtype.EX02;

class A {
	<T extends Number> void method1(T t) {
		System.out.println(t.intValue());		// Number 에서 사용가능한 메서드 intValue()
	}
}	

interface MyInterface {
	public abstract void print();
}

class B {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.method1(5.8);				// = a.<Double>method1(5.8);
		
		B b = new B();
		b.method1(new MyInterface() {
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}
