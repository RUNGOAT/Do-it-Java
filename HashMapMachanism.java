package map.EX02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			this.data = ((C)obj).data;
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		Map<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		hashMap3.put(c1, "첫 번째");
		hashMap3.put(c2, "두 번째");
		System.out.println(hashMap3.size());
		
		System.out.println();
		System.out.println(hashMap3.containsValue("첫 번째"));
	}
}
