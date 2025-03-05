package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적"+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적"+ computer.areaCircle(r));  
		//areaCircle() 부모와 자식 모드 메소드가 정의되어 있지만 재정의된 자식 클래스으 메소드가 실행된다.
		System.out.println();
		
	}

}
