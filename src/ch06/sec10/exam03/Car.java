package ch06.sec10.exam03;

public class Car {
	
	// 인스턴스 필드 선언
	int speed;
	
	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		//객체 생성
		Car myCar = new Car(); // 객체를 생성했으므로 위에 있는 인스턴스 멤버를 사용할 수 있다.
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}
	
	
	public static void main(String[] args) {
		
		// 정적 메소드 호출
		simulate();  // 해당 부분은 static 멤버에서 static멤버를 사용하기 때문에 가능하다.
		
		// 객체 생성
		Car myCar = new Car(); // 이 부분도 객체를 생성했으므로 위에 있는 인스턴스 멤버를 사용할 수 있다.
		myCar.speed = 60;
		myCar.run();
		
		
	}
	
	
	
}
