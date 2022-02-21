package String;

import java.util.Arrays;

public class MethodsOfString_2 {
	public static void main(String[] args) {
		System.out.println("문자열 수정");
		//문자열 수정
		// toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		// replace()
		System.out.println(str1.replace("Study", "공부"));     //"Study"문자열을 "공부"로 변경
		
		// substring()           //문자열의 일부만을 포함하는 새로운 문자열 객체를 생성
		System.out.println(str1.substring(0, 6));			  //0 ≤ 인덱스 < 6 의 문자열
		
		// split()
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");  /* '/'또는'-'또는'(공백)'으로 구분된 문자열 배열 반환*/
		System.out.println(Arrays.toString(strArray));
		
		// trim()                          // 문자열 좌우 공백 제거
		System.out.println("   abc   ".trim());
		
		System.out.println();
		
		System.out.println("문자열의 내용 비교");
		//문자열의 내용 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		// stack 메모리 비교 (==) : 위치(번지) 비교
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		// equals(), equalsIgnoreCase() : 내용 비교       위칫값이 아닌 실제 데이터값을 비교
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));				//대소문자 구분o
		System.out.println(str4.equalsIgnoreCase(str2));    //대소문자 구분x
	}
}
