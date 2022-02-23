package this_practice;

class H {
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n;
	}
}

public class practice4question {
	public static void main(String[] args) {
		H h = new H();
		h.abc(7, 8);
		System.out.println(h.m);
		System.out.println(h.n);
		System.out.println();
		
		V v = new V();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
	}
}

class V {
	int a, b, c, d;
	V() {
		this(5);
	}
	V(int k){
		a = k;
		b = k;
		c = k;
		d = k;
	}
}
