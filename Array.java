package array;

import java.util.Arrays;   // ???

public class Array {
	public static void main(String[] args) {
		// 배열의 값 대입 방법
		int[] array1;
		array1 = new int[] {3, 4, 5};    // --->강제 초기화 생략
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		
		int[] array2 = new int[] {3, 4, 5};
		System.out.println(array2[0]+" "+array2[1]+" "+array2[2]);
		
		int[] array3 = {3, 4, 5};
		System.out.println(array3[0]+" "+array3[1]+" "+array3[2]);
		
//		int[] array4;           배열의 선언과 객체 대입을 분리 불가능
//		array4 = {3, 4, 5};
//		System.out.println(array4[0]+" "+array4[1]+" "+array4[2]);
		System.out.println();
		
		// 힙 메모리의 초깃값(강제 초기화)
		// 기본 자료형 배열
		boolean[] array5 = new boolean[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(array5[i] + " ");
		}
		System.out.println();
		int[] array6 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(array6[i] + " ");
		}
		System.out.println();
		double[] array7 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(array7[i] + " ");
		}
		System.out.println();
		
		// 참조 자료형 배열
		String[] array8 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(array8[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		//배열을 한 번에 출력
		System.out.println(Arrays.toString(array5));
		System.out.println(Arrays.toString(array6));
		System.out.println(Arrays.toString(array7));
		System.out.println(Arrays.toString(array8));
	}
}
