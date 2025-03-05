package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) { // 만약 main 메소드에서도 throws로 예외를 하게되면 JVM으로 던지는거고, JVM은 에러로그를 출력하고 끝낸다!
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		//원래는 여기에 try-catch로 작성해야하지만 throws를 이용하여 해당 에러가 발생되면 findclass 메소드를 호출한곳에서 예외를 던지는 것이다! 
	}
}