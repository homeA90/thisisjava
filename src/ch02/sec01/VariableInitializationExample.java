package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		//변수 value 선언
		int value // <----- value 밑에 빨간 줄은 value에 대해 초기화가 되지 않았기 때문이다. 여기서 말하는 초기화란 value에 값을 대입시켜주는 것!
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;  
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}
