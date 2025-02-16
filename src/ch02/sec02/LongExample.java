package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10; 		
		long var2 = 20;	
		//long var3 = 100000000000000;	// 
		long var4 = 100000000000000L;
		
		// 기본적으로 컴파일러는 정수 리터럴에 대해서 int 타입값으로 간주하기 때문에 int타입의 허용범위를 초과하는
		// 리터럴은 뒤에 대문자 L 이나 소문자 l을 붙여야 한다
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var4: " + var4);
	
		
	}

}
