package super키워드;

// 1줄만 추가하고 싶을 때 super키워드 활용

class A2 {
	void init() {
		// 메모리 할당, 화면 세팅, 변수 초기화 등의 코드 100줄
	}
}
class B2 extends A2 {
	void init()	{
		// 메모리 할당, 화면 세팅, 변수 초기화 등의 코드 100줄
		// 화면 출력 코드 1줄                           --- 총 101줄
	}
}
class C extends A2 {
	void init() {
		// super.init();
		// 화면 출력 코드 1줄                           --- 총 2줄
	}
}

public class SuperKeyword_ex {

}
