package ch07.sec07.exam01;


class A {

	}

class B extends A {

	}

class C extends A {

	}

class D extends B {

	}

class E extends C {

	}
	
public class PromotionExample {	
	public static void main(String[] args) {
			
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
			
		
		A a1 = new B();  // 자동 타입변환(상속관계에 있음)
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		B b1 = new D();  // 자동 타입변환(상속관계에 있음
		C C1 = new E();
		
		
		// B b2 = new E(); 컴파일 에러(상속관계에 있지 않음)
		// C c2 = new D();
		
	}
}
