package list.EX05;

import java.util.LinkedList;
import java.util.List;

// LinkedList<E>는 capacity를 매개변수로 갖는 생성자가 없다 = 저장 용량을 지정할 수 없다
// ArrayList<E>는 모든 데이터를 위치 정보(인덱스)와 값으로 저장
// LinkedList<E>는 앞뒤 객체의 정보를 저장, 말 그대로 모든 데이터가 서로 연결된 형태로 관리되는 것

public class LinkedListMethod {
	public static void main(String[] args) {
		List<String> aList = new LinkedList<>();
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
