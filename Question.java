package 연습문제;

class A {
	interface B {
		void abc();
	}
}

public class Question {
	public static void main(String[] args) {
		A.B ab = new A.B() {
			public void abc() {
			
			}
		};
		ab.abc();
		
		A1.B1 b = new A1.B1() {
			
		};
		A1.B1.bcd();
	}
}

class A1 {
	interface B1 {
		static void bcd() {
			System.out.println("이너 인터페이스 내 static 메서드");
		}
	}
}