package String;

import java.util.Arrays;

public class StringData {
	public static void main(String[] ar) {
		
		System.out.println("특징1");
		// String 객체는 내부에 포함된 문자열을 변경하면 새로운 객체를 생성
		String str1 = new String("안녕");
		String str2 = str1;
		str1 = "안녕하세요";
		
		System.out.println(str1);   //안녕하세요
		System.out.println(str2);   //안녕
		
		// (비교) 배열 참조 자료형 수정
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		
		System.out.println(Arrays.toString(array1));   //[6, 7, 8]
		System.out.println(Arrays.toString(array2));   //[6, 7, 8]
		System.out.println();
		
		System.out.println("특징2");
		// 문자열 리터럴에 따른 생성 문자열 객체의 공유
		String str3 = "안녕";
		String str4 = "안녕";
		String str5 = new String("안녕");
		
		System.out.println(str3 == str4);
		System.out.println(str5 == str4);
	}
}
