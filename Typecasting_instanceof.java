package typecasting.EX03;

/* 캐스팅의 가능 여부를 확인할 수 있는 instanceof */

class A {}
class B extends A {}

public class Typecasting_instanceof {
	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = new B();
			System.out.println("가능");
		} else {
			System.out.println("불가능");
		}
		
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("가능");
		}
	}
}
