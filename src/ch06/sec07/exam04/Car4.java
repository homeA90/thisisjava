package ch06.sec07.exam04;

public class Car4 {
	
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car4() {
		System.out.println("1");
	}
	
	Car4(String model) {
		this.model = model;
		System.out.println("2");
	}
	
	Car4(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("3");
	}
	
	Car4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("4");
	}
	
	
}
// 3개의 매개값을 순서대로 매개변수로 대입받기 위해서는 위와 같이 생성자가 선언되어야 한다.