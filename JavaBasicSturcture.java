package JavaBasicSturcture;

public class JavaBasicSturcture {
	public static void main(String[] args) {
		System.out.print("콘솔\n");
int a = 3;
String b = "화면";
System.out.println(a);
System.out.println(b);
//System.out.printf()
System.out.printf("%d\n", 10);
System.out.printf("%4.2f\n", 10.38388);
//캐스팅 방법
int value1 = (int)3.9;
System.out.println(value1);
float value2 = 5.8f;
System.out.println(value2);
//같은 자료형 간의 연산
double value3 = 3 + 5.5;
System.out.println(value3);

byte data1 = 3;
double data2 = 5.5;
double value4 = data1 + data2;
System.out.println(value4);
	}
}

class C {
//	C.class
	class D{
//		C$D.class
	}
}