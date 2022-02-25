package methodoverriding;

class Animal {
	void cry() {
	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

public class MethodOverriding_ex {
	public static void main(String[] args) {
		// Animal 타입으로 선언 + 자식 클래스 타입으로 생성
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();

		ab.cry();
		ac.cry();
		ad.cry();

		// 배열로 관리 1
		Animal[] animals = {ab, ac, ad};
		for (Animal animal : animals) {
			animal.cry();
		}
		
		// 2
		Animal[] animals1 = new Animal[] {new Bird(), new Cat(), new Dog()};
		for (Animal animal: animals1) {
			animal.cry();
		}
	}
}
