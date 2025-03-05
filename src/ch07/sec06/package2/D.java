package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	public D() {
		super();
	}
	
	public void method1() {
		
		this.field = "value";
		this.method();
	}
	// 상속했으므로 A에 대해 접근 가능
	

	public void method2() {
		/*
		A a = new A();
		a.field = "value";
		a.method();
	*/
	} // 위에 method2는 A에 대한 객체를 생성하여 사용하고 있는데 이것은 안되는것!!!!
	
}
