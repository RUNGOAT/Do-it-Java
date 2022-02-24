package static제어자;

/*
  static이 앞에 붙어 있는 멤버를 정적 멤버 / 없는 멤버를 인스턴스 멤버
  '클래스명.멤버명' 만으로 객체 생성 없이 사용 가능
 */
class A {
	int a;			// 객체 생성 후 사용 가능
	static int b;	// 객체 생성 전 사용가능
	void abc() {
					// (객체 생성 후) a, b, bcd(), cde() 사용 가능
	}
	static void bcd() {
					// b, cde() 사용 가능 정적 메서드 내부에는 정적 멤버만 사용할 수 있다.
	}
	static void cde() {
					// b, bcd() 사용 가능
	}
}


/* 정적 초기화 블록
static {
		// 클래스가 메모리에 로딩될 때 실행되는 내용
}
로딩될 때 가장 먼저 실행되므로 초기화 코드를 넣어 두면 클래스가 로딩 되는 시점에 바로 초기화할 수 있다.
*/
class B{
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("클래스 A가 로딩됐습니다!!");
	}
}

public class StaticModifier {
	public static void main(String[] args) {
		System.out.println(A.b);
	}
}
