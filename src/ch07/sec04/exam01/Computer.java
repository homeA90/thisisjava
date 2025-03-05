package ch07.sec04.exam01;

public class Computer extends Calculator {

	// 메소드 오버라이딩
	@Override  // override 입력 시 컴파일이 정확히 오버라이딩(재정의)이 되었는지 체크해줌!! 생략 가능함_어노테이션이라고 부름
	public double areaCircle(double r) { 
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
