package this키워드와this메서드;

class A{
	int m;
	int n;
	void init(int a, int b) {   		//지역 변수는 멤버가 아니므로 this. 가 자동으로 붙지 않는다.
		int c;
		c = 3;
		m = a;			// this. 을 생략해도 자동으로 추가된다.
		this.n = b;
	}
	void work() {
		this.init(2, 3);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		
		A a = new A();
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
		
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
	}
}

class B {
	int m;
	int n;
	void init(int m, int n) {
		m = m;      			// 필드와 지역변수를 모두 사용할 수 있는 영역에서는 사용범위가 좁은 변수, 즉 지역변수로 인식한다.
		this.n = n;				// 그러므로 명시적으로 this 키워드를 추가해야 한다.
	}
}
