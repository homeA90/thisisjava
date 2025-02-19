package ch06.sec09;

public class Car {
	
	// 필드 생성
	String model;
	int speed;
	
	Car(String model){
		this.model = model;  // this는 객체 자신이라고 표현가능 함
	}
	
	// 메소드 선언
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
	}
}
// 인스턴스 멤버란 객체에 소속된 멤버를 말함(걍 static이 안붙은 애들은 전부 인스턴스 멤버이다)
// 필드나 메소드는 외부 클래스에서 사용하기 위해선 반드시 객체가 필요하기 때문이다.