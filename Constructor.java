package constructor;

class A {
	int m;
	void work() {
		System.out.println(m);
	}
	/*  생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가
	 A() {
	 
	 }
	 */
}

class B {
	int m;
	void work() {
		System.out.println(m);
	}
	B(){      			   // 기본 생성자 직접 정의
		
	}
	// 생성자 오버로딩
	B(int a){
		System.out.println("두 번째 생성자");
	}
	B(int a, int b){
		System.out.println("세 번째 생성자");
	}
}

class C {
	int m;
	void work() {
		System.out.println(m);
	}
	C(int k){      	  		 // 입력매개변수를 포함하고 있는 생성자 정의
		m = k;		  		 // 입력매개변수로 전달된 값으로 필드 초기화
	}
}
public class Constructor {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		//C c = new C();	 // 기본 생성자 호출 불가능
		C c = new C(3);		 // 직접 정의한 생성자를 호출해 객체 생성
	
		a.work();
		b.work();
		c.work();
	
		// 생성자 오버로딩
		B b2 = new B(3);
		B b3 = new B(2, 5);
		
		// 생각 추론
		b2.work();
	}
}