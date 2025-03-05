package ch08.sec11.exam01;

public class Car {

	Tire tire1 = new HankookTire(); // 이렇게 인터페이스로 변수를 선언해주는 이유는 다형성때문이다. 물론 직접적인 객체로 할 수있는 오로지 다형성때문에 사용한다!
	Tire tire2 = new HankookTire();
	


	void run() {
		tire1.roll();
		tire2.roll();
	}
}
