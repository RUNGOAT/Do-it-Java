package boundedtype.EX03;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods <T> {
	T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Test {
	void method1(Goods<A> g) {}
	void method2(Goods<?> g) {}					// A, B, C, D, ...
	void method3(Goods<? extends B> g) {}		// B, C, D
	void method4(Goods<? super B> g) {}			// A, B
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();
		
		// #1. case 1
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		// #2. case 2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		// #3. case 3
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		// #4. case 4
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
	}
}
