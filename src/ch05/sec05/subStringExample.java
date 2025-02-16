package ch05.sec05;

public class subStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";

		// 특정위치의 문자열을 잘라내어 가져오려면 substring()메소드를 사용한다.
		String firstNum = ssn.substring(0, 6); // 0부터 5까지(6앞단까지) 잘라내기
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7부터 끝까지 잘라내기
		System.out.println(secondNum);
	}

}
// 코딩테스트에 자주 나오는 메소드!!!