package map.EX06;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass {
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return "data1= " + data1 + "을 갖고 있는 클래스";
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) {
		if(this.data1 < o.data1) return -1;
		else if(this.data1 == o.data1) return 0;
		else return 1;
	}
	@Override
	public String toString() {
		return "data1= " + data1 + "을 갖고 있는 클래스";
	}
}

public class TreeMapMethod_2 {
	public static void main(String[] args) {
		TreeMap<MyComparableClass, Integer> treeMap = new TreeMap<>();
		MyComparableClass mcc1 = new MyComparableClass(2, 5);
		MyComparableClass mcc2 = new MyComparableClass(3, 3);
		treeMap.put(mcc1, 5);
		treeMap.put(mcc2, 3);
		System.out.println(treeMap);
		
		TreeMap<MyClass, Integer> treeMap1 = new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data1) return -1;
				else if(o1.data1 == o2.data1) return 0;
				else return 1;
			}
		});
		MyClass mc1 = new MyClass(2, 5);
		MyClass mc2 = new MyClass(3, 3);
		treeMap1.put(mc1, 5);
		treeMap1.put(mc2, 3);
		System.out.println(treeMap1);
	}
}
