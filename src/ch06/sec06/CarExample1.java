package ch06.sec06;

public class CarExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Car 객체 생성
		Car1 myCar = new Car1();

		// Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.Start);
		System.out.println("현재속도: " + myCar.speed);
	}

}

// 라이브러리 클래스에서 필드객체 생성 시 초기값이 없을 경우 기본값으로 초기화 된다.