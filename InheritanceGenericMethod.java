package inheritanceofgeneric.EX02;

class Parent {
	public <T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		Child c = new Child();
		c.<Double>print(2.5);
		c.print(2.5);
	}
}
