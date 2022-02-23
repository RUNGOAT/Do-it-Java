package this_practice;

class A {
	boolean a;
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}

public class This_practiceQustion {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		a.abc();
		System.out.println();	
		
		B b = new B();
		b.print();
		b.print(3);
		b.print(5.8);
		b.print("안녕");
	}
}

class B{
	void print(){
		System.out.println("입력값이 없습니다.");
	}
	void print(int a) {
		System.out.println("정수 입력값 : " + a);
	}
	void print(double a) {
		System.out.println("실수 입력값 : " + a);
	}
	void print(String a) {
		System.out.println("문자열 입력값 : " + a);
	}
}