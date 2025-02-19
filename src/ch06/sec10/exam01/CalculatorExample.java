package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		
		// static 메소드에서 static 필드를 사용하므로 정상적인 동작이다.
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		
		// 추가로 객체를 생성 후 static 멤버를 가지고 올수는 있다. 하지만, static 요소는 클래스 이름으로 접근하는 것이 정석이다.
		// 아래는 객체를 생성 후 객체가 가지고 있는 필드와 메소드를 가지고 오는것이다.
		// 아래와 같이 이클립스에선 노란색으로 경고 표시를 해준다.
		Calculator myCalcu = new Calculator();
		double result11 = 10 * 10 * myCalcu.pi;
		int result22 = myCalcu.plus(10, 5);
		int result33 = myCalcu.minus(10, 5);
		
		System.out.println("result11: " + result11);
		System.out.println("result22: " + result22);
		System.out.println("result33: " + result33);
	}
	
	
}
