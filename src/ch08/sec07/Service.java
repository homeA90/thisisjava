package ch08.sec07;

public interface Service {
	
	// 디폴트 메소드
	default void defaultMehtod1() {
		System.out.println("defaultMehtod1 종속코드");
	}
	
	default void defaultMehtod2() {
		System.out.println("defaultMehtod2 종속코드");
	}
	
	
	// private 메소드
	private void defaultCommon() {  // private는 디폴트 메소드 안에서만 사용가능하며, 만약 여러개의 디폴트메소드 내용이 똑같을 때 중복코드를 줄이기 위해서 private를 사용한다.
		System.out.println("defaultMehtod 중복 코드A");
		System.out.println("defaultMehtod 중복 코드B");
	}
	
	
	// 정적메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
	}
	
	// private 정적 메소드
	private static void staticCommon() {  // private 정적 메소드는 디폴트 메소드 뿐만 아니라 정적모소드 안에서도 사용가능하며, 정적메소드의 내용이 똑같을 때 중복코드를 줄이기 위해 하나로 만들어 사용한다
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
	
}
