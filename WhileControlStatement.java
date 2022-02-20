package loopcontrolstatement;

public class WhileControlStatement {
	public static void main(String[] args) {
		int a = 0, b = 0;
		while(b < 10) {
			b += a;                       //[0 1] [1 2] [3 3] [6 4]
			a++;
		}
		System.out.println((a-1)+ "까지의 합 = " + b);   //4까지의 합 = 10
		System.out.println();
		
		//	while 문과 for 문의 상호 변환
		
		//	for(초기식; 조건식; 증감식) {
		//		실행 구문;
		//	}
		//		
		//	초기식;
		//	while(조건식) {
		//		실행구문;
		//		증감식;
		//	}
		// * while 문은 for문과 다르게 조건식 생략 불가능
		
		//무한 루프 탈출
		System.out.println("2.");
		int c = 0;
		while(true) {     //----> 조건식 생략 불가능
			if(c > 10) {
				break;
			}
			System.out.println(c + "");
			c++;
		}
		System.out.println();
		
		// do-while문 과 while문의 차이
		System.out.println("3.");
		int d;
		
		d = 0;
		while(d<0) {
			System.out.println(d);
			d++;
		} //------> 실행 안됨
		System.out.println();
		
		d = 0;
		do {
			System.out.println(d + "");
			d++;
		} while(d < 0);    //----> 0
	}
}
