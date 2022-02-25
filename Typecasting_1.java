package typecasting.EX01;
//클래스의 업캐스팅 및 다운캐스팅

class A {}
class B extends A {}
class C extends B {}
class D extends B {}
// A ⊂ B ⊂ C, D

public class Typecasting_1 {
	public static void main(String[] args) {
		// 업캐스팅(자동 변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = /*(A)*/ new C();  	//생략 가능
		B bc = (B) new C();			// C -> B 업캐스팅 (자동 변환)
		
		B bb = new B();
		A a = (A) bb;				// B -> A
	
		//다운캐스팅(수동 변환): 캐스팅할 수 없을 때(실행할 때 예외 발생)
		A aa = new A();				// A객체를 생성했기 때문
//		B b = (B) aa;				// A -> B 다운캐스팅(수동변환): 불가능
//		C c = (C) aa;				// C -> A 불가능
		
		//다운캐스팅(수동 변환): 캐스팅이 가능할 때
		A ab = new B();				// B객체를 생성했기 때문
		B b = (B) ab;				// A -> B 다운캐스팅(수동변환)
//		C c = (C) ab;				// A -> C 불가능  C객체를 생성하지 않았기 때문
		
		B bd = new D();
		D d = (D) bd;				// B -> D
		
		A ad = new D();
		B b1 = (B) ad;				// A -> B
		D d1 = (D) ad;				// A -> D
	}
}
