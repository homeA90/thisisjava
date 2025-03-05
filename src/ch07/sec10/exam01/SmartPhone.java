package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	
	// 생성자 선언
	public SmartPhone(String owner) {
		// Phone 생성자 호출
		super(owner);  // 기본적으로 super()을 작성하지 않더라도 기본 생성자에서 호출하지만, 부모클래스에 매개변수가 있고 그 생성자를 호출해야한다면 반드시 명시적으로 super(owner)와 같이 입력해야한다.
	}
	
	// 메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
