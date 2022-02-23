package method;

public class MethodOverloading {
	public static void main(String[] args) {
		print();
		print(3);
		print(5.8);
		print(2, 5);		
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	public static void print(int a, int b) {
		System.out.println("a: "+ a + "b: " + b);
	}
	/*
	public static int print(int a, int b) {
		System.out.println("a: "+ a + "b: " + b);
	}         
	void print(int a, int b)와 중복으로 불가능
	print(a, b); 호출 과정에서 리턴 타입을 사용하지 않으므로 리턴 타입으로는 메서드를 구분할 수 없는 것이다.
	이것이 바로 리턴 타입이 시그니처(메서드명과 입력매개변수 자료형)에 포함되지 않은 이유
	*/        
}
