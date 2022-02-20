package loopcontrolstatement;

public class practiceQuestion {
	public static void main(String[] args) {
		System.out.println("Q1");
		int score = 72;
		if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("B학점");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		System.out.println();
		
		System.out.println("Q2");
		switch((int)score / 10) {
		case 10:
			System.out.println("A학점"); break;
		case 9:
			System.out.println("A학점"); break;
		case 8:
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		default:
			System.out.println("F학점");
		}
		System.out.println();
		
		System.out.println("Q3");
		for(int i = 0;	; i++) {
			if(i%2 == 1) {
				continue;
			}
			if(i > 10) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Q4");
		for(int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
		
		int k = 10;
		while(k > 0) {
			System.out.println(k);
			k -= 2;
		}
		System.out.println();
		
		System.out.println("Q6");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j == 2) {
					i = 100;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		System.out.println("Q7");
		out: for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j == 2) {
					break out;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
