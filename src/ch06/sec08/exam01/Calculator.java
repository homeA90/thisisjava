package ch06.sec08.exam01;

public class Calculator {

	// 해당 파일은 클래스, 즉 설계도 파일이고 클래스에는 메소드만 선언될 수 있고, 필드만 있을 수 있고, 클래스만 선언되어 있을 수도 있다.

	// 리턴값 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	// 리턴값 없는 메소드
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	// 호출 시 두정수 값을 전달받고, 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴값 지정
	}

	// 호출 시 두 정수 값을 전달 받고, 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result; // 리턴값 지정
	}
}
