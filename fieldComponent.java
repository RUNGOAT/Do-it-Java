package field;

class A {
	boolean m1;
	int m2;
	double m3;
	String m4;

	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}

	void printLocalVariable() {
		int k;
//			System.out.println(k);   오류 : 지역변수k를 초기화하지 않았으므로
	}
}

public class fieldComponent {
	public static void main(String[] args) {
		A a = new A();
		a.printFieldValue();          //필드 m1...m4는 힙 메모리에 있어 강제 초기화 된다.
		
		System.out.println();
		
		a.m2 = 3;
		System.out.println(a.m2);
	}
}
