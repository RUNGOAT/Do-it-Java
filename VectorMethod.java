package list.EX04;

import java.util.List;
import java.util.Vector;


// Vector<E>는 ArrayList<E>와 동일한 기능을 수행하지만, 멀티 쓰레드에서 사용할 수 있도록 기능이 추가된 것
// EX01 과 비교
public class VectorMethod {
	public static void main(String[] args) {
		List<String> aList = new Vector<>();
		System.out.println(aList.size());
		aList.add("가");				aList.add("나");
		aList.add("다");				aList.add("라");
		aList.add("마");				aList.add("바");
		aList.add("사");
		System.out.println(aList.size());
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size());
		System.out.println(aList);
	}
}
