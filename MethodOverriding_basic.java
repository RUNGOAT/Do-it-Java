package methodoverriding;

/* 오버라이딩은 개념상 덮어쓰기와 비슷하지만 덮어쓰기는 이전 파일이 완전히 삭제되고 새로운 파일로 바뀌는 것이고
   ,오버라이딩은 새로운 메서드가 올라타고 있는 상태로 원할 때 깔려있는 메서드를 호출할 수 있다.
 * overriding은 method만 가능하다. (인스턴스 필드, 정적 영역 X) */

class A {
	void print() {
		System.out.println("A 클래스");
	}
}
class B extends A {
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}

public class MethodOverriding_basic {
	public static void main(String[] args) {
		
		A aa = new A();
		aa.print();
		
		B bb = new B();
		bb.print();
		
		A ab = new B();
		ab.print();
	}
}
