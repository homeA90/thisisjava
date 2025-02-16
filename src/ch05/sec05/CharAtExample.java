package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); // 특정 문자의 위치를 알고싶으면 charAt 메소르를 이용한다.

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
