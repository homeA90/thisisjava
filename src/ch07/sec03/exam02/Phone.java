package ch07.sec03.exam02;

public class Phone {
	
	// 필드 선언
	public String model;
	public String color;
	
	// 생성자 선언 및 매개변수 추가
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 실행");
	}
}
