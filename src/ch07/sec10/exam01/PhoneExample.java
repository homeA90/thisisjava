package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Phone phone = new Phone() {}; // Phone은 추상클래스이므로 객체생성이 불가능하다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		
		
		smartPhone.turnOn();  // 추상 클래스 Phone의 메소드 호출이 가능하다.
		smartPhone.internetSearch();
		smartPhone.turnOff();  // 추상 클래스 Phone의 메소드 호출이 가능하다.
	}

}
