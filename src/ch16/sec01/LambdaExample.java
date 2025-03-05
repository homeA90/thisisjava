package ch16.sec01;

import java.time.Year;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		action((x,y) -> {int result = x + y; System.out.println("result: " + result);
		});
		
		action((x,y) -> {int result =  x-y; System.out.println("result: "+ result);
		});
		
	}
	
	public static void action (Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculator(x, y);
	}

}


// 람다식을 익명 구현객체로 사용하기 위해선 인터페이스에서 반드시 단하나의 추상메소드를 가져야한다.
// 그리고 실행 메소드에서 생성한 람다식은 익명 구현객체로 바로 인식이 된다.
// 실행할 메소드에서 매개변수를 인터페이스 타입을 넣게되면 작성한 람다식이 실행된다.