package ch07.sec04.exam02;

public class SupersonicAirplane extends Airpalne {
	
	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 필드 선언
	public int flyMode = NORMAL;
	
	// 메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속으로 비행합니다.");
		} else {
			super.fly();
			// 메소드를 재정의 하더라도 자식 메소드는 부모 메소드를 재정의하려면 부모 메소드의 전부를 작성해야한다.
			// 그런데 만약 부모 메소드의 내용을 전부 사용하고, 추가로 처리하는 것에 대해서는 spuer.메소드() 식으로 처리하면 쉽게 가능하다.
			// 재정의 할 메소드 내용은 spuer 전후 어디에 와도 상관없고 순서대로 진행 된다.
		}
	}
}
