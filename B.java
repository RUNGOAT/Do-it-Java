package pack02;
//방법 2 임포트
import pack01.A;

public class B {
	void bcd() {
		
		A a = new A();  // (임포트 사용 안하면) 오류
		//방법 1 패키지명.클래스명
		//pack01.A a = new pack01.A();
		
		System.out.println(a.m);
		System.out.println(a.n);
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.bcd();
	}
}

/* public 클래스를 제외한 모든 클래스는 외부 클래스
 * 임포트가 가능한 클래스는 오직 public 클래스
 */