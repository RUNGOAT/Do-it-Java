package 이너클래스;

class A1 {
	int a = 3;		// 필드
	void abc() {
		int b = 5;		// 지역 변수
		// 지역 이너 클래스
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
//				b = 7;	지역 이너 클래스에서 사용하는 지역 변수는 자동 final 선언
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLoclaVariable {
	public static void main(String[] args) {
		// 객체 생성 및 메서드 호출
		A1 a = new A1();
		a.abc();
	}
}

// 컴파일 이후 생성되는 클래스 파일 확인 bin
