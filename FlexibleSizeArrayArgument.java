package method;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		//가변 길이 int배열 입력매개변수
		method1(1,2);
		method1(1,2,3);
		method1();
		//가변 길이 String배열 입력매개변수
		method2("안녕", "방가");
		method2("안녕", "방가", "감사");
		method2();
	}
	/* 오버로딩 사용시
	public static void method1(int a, int b, int c) {
		System.out.println(a + ", " + b + ", " + c);
	}
	*/
	
	public static void method1(int...values) {      //...을 활용해 메서드 오버로딩의 불편함을 줄였다.
		System.out.println("배열의 길이: " + values.length);
		
		/* 배열 출력 방법1
		 for(int i = 0; i < values.length; i++){
		 System.out.print(value[i] + " ");
		 */
		
		//배열 출력 방법2
		for(int k: values) {
			System.out.print(k + " ");
		}
		
		/* 배열 출력 방법3
		 System.out.println(Arrays.toString(values));
		 */
		System.out.println();
	}
	
	public static void method2(String...values) {
		System.out.println("배열의 길이: " + values.length);
		for(String k: values) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}
