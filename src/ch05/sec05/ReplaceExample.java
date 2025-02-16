package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); // 특정 문자열을 다른 문자열로 대체하고 싶다면 replace() 메소드를 사용한다.

		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

// 단, 문자열은 변경이 불가한 특성을 갖기 때문에 replace() 메소드를 사용한다고 하더라도 진짜 해당 객체의 값이 변경되는 것이 아닌
// 새로운 객체를 생성하여 보여주는 것이다.