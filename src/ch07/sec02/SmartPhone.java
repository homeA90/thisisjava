package ch07.sec02;

public class SmartPhone extends Phone { // 자식클래스가 부모클래스를 상속할 땐 extends를 사용하여 상속한다.
// 상속은 자식클래스가 부모클래스를 선택하는 것!!!
	
	// 자식 클래스
	// 필드 선언
	public boolean wifi;

	// 생성자 선언
	public SmartPhone(String model, String color) { // 부모 클래스의 필드를 가져와서 사용
		this.model = model;
		this.color = color;
	}

	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
