package method;

import java.util.Arrays;

public class 입력매개변수 {
	/* 기본 자료형 입력매개변수 */
	public static int twice(int a) {              //twice() frame 내부 a=전달 받은 값
		a = a * 2; 								  // 스택 메모리 내 같은 변수라도 구조 내의 서로 다른 frame이라면 다른 값을 넣어도 가능하다.
		return a;
	}
	public static void main(String[] args) {      //main() frame 내부 a=3, k1=6, k2=6
		int a = 3;								  // method 실행이 종료되면 frame은 사라진다.
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
		System.out.println();
		
		/*참조 자료형 입력매개변수*/
		int[] array = new int[] {1,2,3};
		modifyData(array);
		printArray(array);
	}
	
	public static void modifyData(int[] a) {	   //그러나 참조 자료형은 참좃값(위칫값)이 전달돼 복사되어서 가리키는 실제 객체 값이 동일하다.
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
