package operator;

public class operatorQ {
	public static void main(String[] args) {
		System.out.println(2 + 3 / 2);
		System.out.println(10 % 3 + 5 / 3);
		System.out.println((4 + 5 / 2) % 4);
		System.out.println();   //수학처럼 *,/ 먼저

		int a = 5;
		int b = a++;  //int b = a 그리고 a++
		System.out.println(a);  //6
		System.out.println(b);  //5
		System.out.println(++a);  //7
		System.out.println(++b);  //6
		System.out.println(a++ + --b);
		System.out.println(a + b);
		System.out.println();  //전위형, 후위형 증감 연산자 주의 , 값은 축적된다

		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
		System.out.println(~5);
		System.out.println();

		System.out.println(7 << 2);
		System.out.println(7 >> 2);
		System.out.println(-7 << 2);
		System.out.println(-7 >> 2);
		System.out.println(-1 >>> 30);
		System.out.println();
		
		System.out.println(3 < 3);
		System.out.println(5 >= 3);
		System.out.println(5 <= 3);
		System.out.println(5 == 5);
		System.out.println(5 != 5);
		System.out.println();
		
		System.out.println(false && true);
		System.out.println((4 <= 4) || (6 < 3));
		System.out.println(false ^ (3 >= 4));
		System.out.println(!(3 <= 3));
		System.out.println();
		
		int x = 4, y = 5, c = 6;
		System.out.println(false && x-- > 6);
		System.out.println(true | y++ > 6);
		System.out.println(true ^ c++ > 6);
		System.out.println(x);
		System.out.println(y);
		System.out.println(c);
		System.out.println();
		
		int g = 3;
		g <<= 1;
		System.out.println(g);
		g &= 5;
		System.out.println(g); //0b0110 & 0b0101 = 4
		g -= 1;
		System.out.println(g *= 2);
		System.out.println();
		
		int t = 3, r = 5, e = 7;
		System.out.println((t>r) ? "안녕하세요" : "반갑습니다");
		System.out.println((t<r) ? (r > e) ? "타입A" : "타입B" : (r > e) ? "타입C" : "타입D");
	}
}
