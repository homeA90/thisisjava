package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver driver = new Driver();
		
		Vehicle Vehicle = new Vehicle();
		driver.driver(Vehicle);
		
		Bus bus = new Bus();
		driver.driver(bus);
		
		Taxi taxi = new Taxi();  // 이렇게 직접 객체를 변수에 참조하도록해줘도 됨!
		driver.driver(taxi);
		
		Vehicle vehicle = new Bus();  // 이렇게 자동 타입변환으로도 다형성이 가능함
		driver.driver(vehicle);
	}

}
// 매개변수의 다형성