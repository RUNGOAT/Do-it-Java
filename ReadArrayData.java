package array;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		// 배열 참조 변수.length       //포인트 연산자(.)는 '해당 참조 변수가 가리키는 곳으로 가라'
		// 배열 참조 변수가 가리키는 곳에 가면 배열 객체가 있는데, 그 배열의 방의 개수를 가져오라
		int[] array = new int[] {3, 4, 5, 6, 7};
		System.out.println(array.length);   //5
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for(int k: array) {                   // -----> for-each문
			System.out.print(k + " ");        // for(원소 자료형 변수명: 집합객체) { }
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array));    // Arrays 클래스의 toString()메서드 사용
	}
}
