package set.EX06;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSummary {
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		System.out.println(hashSet.toString());
		
		Set<String> linkedhashSet = new LinkedHashSet<>();
		linkedhashSet.add("다");
		linkedhashSet.add("마");
		linkedhashSet.add("나");
		linkedhashSet.add("가");
		System.out.println(linkedhashSet.toString());
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		System.out.println(treeSet.toString());
	}
}
