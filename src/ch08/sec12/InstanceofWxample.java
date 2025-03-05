package ch08.sec12;

public class InstanceofWxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
		
	}	
		
	public static void ride(Vehicle vehicle) {
		
		/* 예전방법
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		*/
				
		// java12 이후 방법
		if(vehicle instanceof Bus bus) {  // 객체 타입확인 및 강제타입변환 진행 
			bus.checkFare();
		}	
		vehicle.run();		
	}
}
