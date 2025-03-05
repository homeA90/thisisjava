package ch07.sec03.exam02;

public class SmartPhone extends Phone {

	// 생성자 선언
	public SmartPhone(String model, String color) { // extens 에서 super()를 자식클래스에 선언하지 않아도 자동으로 추가됨
		super(model, color);
//		this.model = model; 부모클래스에서 생성자에 매개변수를 추가했으므로 삭제해도 됨
//		this.color = color; 부모클래스에서 생성자에 매개변수를 추가했으므로 삭제해도 됨
		System.out.println("SmartPhone(String model, String color) 생성자 실행 됨");
	}

}
// 단, super()를 잘생할땐 생성자 쪽 맨위에 입력해야한다.