package loopcontrolstatement;

public class BreakControlkeyword {
	public static void main(String[] args) {
		
		// continue는 'if 문을 제외한 가장 가까운 중괄호의 닫힌 괄호역할}을 수행' 하는 제어 키워드
		
		// 단일 반복문 continue 사용
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}   // ------>0
		System.out.println();
		
		// 다중 반복문 탈출
		// 1개의 반복문만 탈출
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				if( j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		// break + Label 문으로 다중 반복문 탈출
		POS1: for(int i = 0; i < 10; i++) {
				for(int j = 0; j< 10; j++) {
				if(j == 2)
					break POS1;
				System.out.println(i + ", " + j);
				}
			}
		System.out.println();
		
		// 변숫값을 조정해 다중 반복문 탈출
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					i = 100;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
