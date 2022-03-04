package 예외처리;

public class MultiCatch {
	public static void main(String[] args) {
		
//		1. catch 블록을 각각 처리했을 때
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}
/*		
		순차적으로 실행하기 때문에 상위 클래스 Exception이 위로 오면 안됨.
		catch(Exception e) {
		System.out.println("예외가 발생했습니다.");
		}
*/
		catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		
//		2. catch 블록을 하나로 통합했을 때
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
	}
}
