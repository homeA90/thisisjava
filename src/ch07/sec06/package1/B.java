package ch07.sec06.package1;

public class B {
	
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	
	// A 클래스에서 protected 된 메소드나 필드는 같은 패키지 안에서는 사용가능
}
