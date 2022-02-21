package main;

public class ArgumentOfMainMethod {
	public static void main(String[] args) {
		// Run -> Run Configurations -> [(x)=Arguments]
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		System.out.println(b + 1);    //String + int = String이므로
		System.out.println(c + 1);    //문자열이 연결돼 출력된다
		System.out.println();

		int d = Integer.parseInt(b);        //String -> int
		double e = Double.parseDouble(c);   //String -> double
		System.out.println(d + 1);          //int + int = int 이므로 실제 더한 값을 정수로 출력
		System.out.println(e + 1); 			//double + int = double 이므로 실제 더한 값을 실수로 출력
		
		// 정수or실수 -> 문자열 : String.valueOf(정수or실수)
	}
}
