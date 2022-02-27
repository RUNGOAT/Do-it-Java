package objectclass;

// object의 hashCode()는 객체의 위칫값을 기반으로 고윳값을 만든다.
// 내용을 비교할려면 overriding 해야 한다.

import java.util.HashMap;

class A3 {
	String name;

	A3(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A3) obj).name) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return name;
	}
}

class B3 {
	String name;

	B3(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B3) obj).name) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}

public class ObjectMethod_hashCode {
	public static void main(String[] args) {

		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);

		HashMap<A3, String> hm2 = new HashMap<>();
		hm2.put(new A3("첫 번째"), "데이터1");
		hm2.put(new A3("첫 번째"), "데이터2");
		hm2.put(new A3("두 번째"), "데이터3");
		System.out.println(hm2);

		HashMap<B3, String> hm3 = new HashMap<>();
		hm3.put(new B3("첫 번째"), "데이터1");
		hm3.put(new B3("첫 번째"), "데이터2");
		hm3.put(new B3("두 번째"), "데이터3");
		System.out.println(hm3);

	}
}
