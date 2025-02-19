package ch06.sec06;

public class CarExample2 {
	public static void main(String[]args) {
		// TODO Auto-generated method stub

		// 객체 생성
		Car2 myCar2 = new Car2();

		// Car 객체의 필드값 읽기
		System.out.println("제작회사: " + myCar2.company);
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색깔: " + myCar2.color);
		System.out.println("최고속도: " + myCar2.maxSpeed);
		System.out.println("현재속도: " + myCar2.speed);

		// Car 객체의 필드값 변경
		myCar2.speed = 60;
		System.out.println("수정된 속도: " + myCar2.speed);
	}
}
