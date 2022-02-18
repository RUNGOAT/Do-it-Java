package mypack;

public class Test {
	public static void main(String[] args) {
		//자바 메서드로 진법 변환
		//10진수 정수 -> 2진수 , 8진수, 16진수 "문자열"
		int data = 17;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		//2진수, 8진수, 16진수 "문자열" -> 10진수 정수
		System.out.println(Integer.parseInt("1101", 2));
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("d", 16));
		System.out.println();
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		// 비트 연산자
		//AND 비트 연산자
		System.out.println(13&17);
		System.out.println(0b1101 & 0b10001);
		System.out.println();
		//OR 비트 연산자
		System.out.println(13|17);
		System.out.println(0b1101 | 0b10001);
		System.out.println();
		//XOR 비트 연산자
		System.out.println(13 ^ 17);
		System.out.println(0b1101 ^ 0b10001);
		System.out.println();
		//NOT 비트 연산자
		System.out.println(~13);
		System.out.println(~0b1101);
		
		//등가 비교
		//@기본 자료형 등가 비교
		int a = 5, b=2, c=5;
		System.out.println(a == b);  //true
		System.out.println(a != b);
		System.out.println(a == c);  //true
		System.out.println(a != c);
		System.out.println();
		
		//@참조 자료형 등가 비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);  //false
		//기본 자료형의 스택 메모리 값과 참조 자료형의 스택 메모리 값은 다르다.
	}
}
