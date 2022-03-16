package map.EX05;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		for(int i = 20; i > 0; i -= 2) {
			treeMap.put(i, i+"번째 데이터");
		}
		
		System.out.println(treeMap.toString());
		
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastKey());
		System.out.println(treeMap.lowerKey(16));
		
		System.out.println(treeMap.pollFirstEntry());
		
		SortedMap<Integer, String> sortedMap = treeMap.headMap(16);
		System.out.println(sortedMap);
		
		NavigableMap<Integer, String> navigableMap = treeMap.tailMap(14, true);
		System.out.println(navigableMap);
		
		sortedMap = treeMap.subMap(6, 10);
		System.out.println(sortedMap);
		navigableMap = treeMap.subMap(6, false, 10, false);
		System.out.println(navigableMap);
	}
}
