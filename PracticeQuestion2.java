package this_practice;

import java.util.Arrays;

class C{
	int arraySum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}

public class PracticeQuestion2 {
	public static void main(String[] args) {
		C c = new C();
		int[] data1 = new int[] {1,2,3};
		int[] data2 = {1,2,3};
		System.out.println(c.arraySum(data1));
		System.out.println(c.arraySum(data2));
		System.out.println(c.arraySum(new int[] {1,2,3}));
//		System.out.println(c.arraySum({1,2,3}));
		System.out.println();
		
		D d = new D();
		
		int m = 5;
		int[] n = {1,2,3};
		
		d.abc(m);
		d.bcd(n);
		
		System.out.println(m);
		System.out.println(Arrays.toString(n));
	}
}

class D{
	void abc(int m) {
		m = 8;
	}
	void bcd(int[] n) {
		n[0] = 4;
		n[1] = 5;
		n[2] = 6;
	}
}
