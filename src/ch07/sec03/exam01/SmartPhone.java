package ch07.sec03.exam01;

public class SmartPhone extends Phone {

	// 생성자 선언
	public SmartPhone(String model, String color) { // extens 에서 super()를 자식클래스에 선언하지 않아도 자동으로 추가됨
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행 됨");
	}

}
// 단, super()를 잘생할땐 생성자 쪽 맨위에 입력해야한다.