package methodoverriding;

class A3 {
	protected void abc() {}
}
class B01 extends A3 {
	public void abc() {}
}
class B02 extends A3 {
	protected void abc() {}
}
class B03 extends A3 {
//	void abc() {}				default 접근 지정자 (좁아져서 불가능)
}
class B04 extends A3 {
//	private abc() {}			private 접근 지정자 (좁아져서 불가능)
}

public class MethodOverriding_AccessModifier {
	public static void main(String[] args) {
	}
}
