package loopcontrolstatement;

public class ForControlStatement {
	public static void main(String[] args) {
		// for 문 기본 문법 구조
		//for문의 소괄호() 안에 2개의 세미콜론; 이 있는지만 문법적으로 검사한다.
		
		int a;   //-------> for문의 반복 횟수를 지정하는 변수를 외부에서 선언
		for(a = 0; a<3; a++) {
			System.out.println(a + "");
		}
		System.out.println(a);
		System.out.println();
		
		System.out.println("2.");
		for(int j = 0; j<3; j++) {    // -----> 변수를 초기식에서 선언
			System.out.println(j + "");
		}
		//System.out.println(j);  -----> 오류 ( 변수를 초기식에서 선언했기 때문)
		System.out.println();
		
		System.out.println("3.");
		for(int k=0,l=0; k+l<10; k++,l++) {
			System.out.println(k+l+"");
		}
		System.out.println();
		
		//무한 루프 탈출
		System.out.println("4.");
		for(int i=0;	; i++) {
			if(i>10) {
				break;
			}
			System.out.println(i + "");
		}
		System.out.println("무한 루프 탈출");
	}
}
