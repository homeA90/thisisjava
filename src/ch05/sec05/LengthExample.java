package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		int length = ssn.length();// 문자열에서 문자의 개수를 얻고 싶다면 length() 메소드를 사용한다.

		if (length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}

}
