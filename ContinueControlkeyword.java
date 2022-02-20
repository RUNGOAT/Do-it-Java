package loopcontrolstatement;

public class ContinueControlkeyword {
	public static void main(String[] args) {
		
		// continue는 'if 문을 제외한 가장 가까운 중괄호의 닫힌 괄호역할}을 수행' 하는 제어 키워드
	
		// 단일 반복문 continue 사용
		for(int i = 0; i < 10; i++) {
			continue;
			//System.out.println(i);    continue; 뒤에 와서 실행될 수 없음
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			continue;
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		
		// 다중 반복문 continue
		System.out.println("2.");
		// 1개의 반복문만
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if( j == 3) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		// continue + Label 문으로 다중 반복문 탈출
		POS1: for(int i = 0; i < 5; i++) {
				for(int j = 0; j< 5; j++) {
				if(j == 2)
					continue POS1;
				System.out.println(i + ", " + j);
				}
			}
		System.out.println();
	}
}

