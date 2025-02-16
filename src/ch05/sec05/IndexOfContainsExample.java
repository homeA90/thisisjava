package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열에서 특정 문자열의 위치를 찾고자 할때(특정 문자열이 있는지) indexOf() 메소드를 사용한다.
		// 만약 특정 문자열이 존재한다면 문자열 맨 앞자리의 index를 저장하고, 없다면 -1을 리턴한다.
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("차바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		
		//주어진 문자열이 단순히 포함되어 있는지만 조사하고 싶다면 contains() 메소드를 사용한다.
		//문자열이 포함되어 있다면 true를 리턴하고, 없다면 false를 리턴한다.
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
	

}
