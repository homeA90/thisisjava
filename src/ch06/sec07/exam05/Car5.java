package ch06.sec07.exam05;

public class Car5 {

	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car5(String model) {
		// 21라인 생성자 호출
		this(model, "은색", 250); // 단 이렇게 코드를 작성하게 되면 무조건 해당코드를 첫번째로 작성해야함
	}

	Car5(String model, String color) {
		// 21라인 생성자 호출
		this(model, color, 250);
	}

	Car5(String model, String color, int maxSpeed) {
		// 20라인 생성자 호출
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
