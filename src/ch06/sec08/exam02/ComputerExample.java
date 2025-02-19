package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Computer 객체 생성
		Computer myCom = new Computer();
		// Computer.java에 생성자가 없음에도 실행 클래스에서 Computer()를 실행할 수 있는 이유는 기본으로 생성자가 생성되기때문

		// sum() 메소드 호출 시 매개값 1,2,3 을 제공하고, 합산 결과를 리턴 받아 result1 변수에 대입
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result1);

		// sum() 메소드 호출 시 매개값 1,2,3,4,5 을 제공하고, 합산 결과를 리턴 받아 result1 변수에 대입
		int result2 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result2);
		
		// sum() 메소드 호출 시 배열을 제공하고, 합산 결과를 리턴 받아 result2 변수에 대입
		int[] values = { 1, 2, 3, 4, 5 };
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);

		// sum() 메소드 호출 시 배열을 제공하고, 합산 결과를 리턴 받아 result3 변수에 대입
		int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result4: " + result4);
	}

}
