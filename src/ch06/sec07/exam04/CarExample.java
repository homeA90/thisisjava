package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car4 car1 = new Car4();
		System.out.println("car1.company : " + car1.company);
		
		Car4 car2 = new Car4("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		Car4 car3 = new Car4("자가용", "검정");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car4 car4 = new Car4("자가용", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);

		
	}

}
