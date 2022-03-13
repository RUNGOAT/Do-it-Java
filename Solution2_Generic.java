package genericclass.EX03;

// Apple, Pencil 클래스를 모두 저장하거나 꺼낼 수 있는 클래스

class Apple{}
class Pencil{}
class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {
		// Goods를 이용해 Apple 객체를 추가하거나 가져오기
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();				// 다운캐스팅 필요없음	

		// Goods를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = (Pencil)goods2.get();
		
		// 잘못된 타입 선언
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = (Pencil)goods3.get();	// 강한 타입 체크로 문법 오류 발생
	}
}
