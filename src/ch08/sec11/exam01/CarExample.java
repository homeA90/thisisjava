package ch08.sec11.exam01;

public class CarExample {
	
	public static void main(String[] args) {
		Car myuCar = new Car();
		myuCar.run();
		
		myuCar.tire1 = new KumhoTire();
		myuCar.tire2 = new KumhoTire();
		
		myuCar.run();
		
		
	}
}
