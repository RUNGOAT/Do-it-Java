package final_abstract;

//final 변수는 첫 번째 메모리 상수 영역에 값을 선언한 후 최초로 값이 초기화될 때 딱 한 번 복사된다.
//어떤 필요에 따라 복사본을 하나 만들어 놓음으로써 원본이 삭제된 이후에도 그 값을 활용할 수 있도록 하는 것이 final 변수(필드, 지역 변수)의 기능이다.

class A {
	int a = 1;
	final int b = 2;
	A() {
		a = 3;
//		b = 4; final 변수에 값을 대입했으므로 다시 입력하는 행위 불가능
	}
	void abc() {
	}
	final void bcd() {
	}
}
class B extends A {
	void abc() {
	}
//	void bcd() {} final 제어자를 사용했기에 오버라이딩 불가능
}
final class C {}

//class D extends C {} 상속도 불가능

public class Final_Abstract {
	public static void main(String[] args) {
		Animal[] animal = new Animal[] {new Cat()};
		for(Animal animals: animal) {
		animals.cry();
		}
	}
}

// abstract 메서드를 1개 사용하면 클래스에 반드시  abstract가 붙어야 한다.
// 오타를 찾을 수 있는 장점
abstract class Animal {
	abstract void cry();			//추상 메서드의 구조
}
class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}
