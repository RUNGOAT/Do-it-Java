package this_practice;

class F {
	void averageScore(int...values) {
		double a = 0;
		for(int i = 0; i < values.length; i++) {
			a += values[i];
		}
		a /= values.length;
		System.out.println(a);
	}
	/* 답안 코드
	 void averageScore(int...scores){
	 	int sum = 0;
	 	for(ink k: scores) {
	 		sum += k;
	 	}
	 	double avg = (double)sum / scores.length;
	 	System.out.println(avg);
	 }
	 */
}

public class practice3question {
	public static void main(String[] args) {
	
		F f = new F();
	
		f.averageScore(1);
		f.averageScore(1,2);
		f.averageScore(1,2,3);
		f.averageScore(1,2,3,4);
		
		G g1 = new G(3);
		G g2 = new G(2.3, 3.3);
	}
}

class G {
	G(int k){
		System.out.println("첫 번째 생성자 이용");
	}
	G(double a, double b){
		System.out.println("두 번째 생성자 이용");
	}
}