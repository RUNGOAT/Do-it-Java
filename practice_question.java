package String;

import java.util.Arrays;

public class practice_question {
	public static void main(String[] args) {
		int[] b = new int[]{1,2,3,4,5};
		for(int k: b) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		int [][] a = new int[2][];
		a[0] = new int[] {1,3,5};
		a[1] = new int[] {7,9};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
		String name;
		int age;
		
		int i = str.indexOf("홍");
		int j = str.indexOf("]");
		name = str.substring(i, j);
		
		/*답안 풀이
		int start1 = str.indexOf("[");
		int end1 = str.indexOf("]");
		name = str.substring(start1+1, end1);
		*/
		
		int k = str.lastIndexOf("1");
		int l = str.lastIndexOf("]");
		String age1 = str.substring(k, l);
		age = Integer.parseInt(age1);
		
		/*답안 풀이
		int start2 = str.lastIndexOf("[");
		int end2 = str.lastIndexOf("]");
		age = Integer.parseInt(str.substring(start2+1, end2));
		*/
	
		
		System.out.println(name);
		System.out.println(age);
	}
}
