package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
	}

}

// main 메소드가 포함된 class는 실행가기 위한 class
// 앞으로 class 명에 Example이 붙어있는 건 모드 실행 class이다.

// Class 정리
// 라이브러리 클래스 : 실행 할 수 없으며 다른 클래스에서 이용하는 클래스
// 실행 클래스 : main() 메소드를 가지고 있는 실행 가능한 클래스