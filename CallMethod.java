package method;

/*클래스 외부에서의 메서드 호출*/
class A {
	void print() {
		System.out.println("안녕");
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a, double b) {
		return a + b;
	}
	
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m + "월입니다.");
	}
}

public class CallMethod {
	public static void main(String[] args) {
		A a = new A();
		
		a.print();
		int k = a.data();
		System.out.println(k);
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
		System.out.println();
		
		
		System.out.println("내부에서의 메서드 호출");
		/*클래스 내부에서의 메서드 호출*/
		print();
		
		int b = twice(3);
		System.out.println(b);
	
		double c = sum(b, 5.8);
		System.out.println(c);
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k * 2;
	}
	
	public static double sum(int a, double b) {        // 지역 변수는 스택 영역에 저장되고 자료형 변수도 스택에 저장되는데
		return a + b;                                  // 왜 변수가 겹쳐도 오류가 안날까?   frame!
	}
	
}
