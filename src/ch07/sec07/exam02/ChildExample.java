package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();  // child 변수를 만들어서 Child 객체의 번지수를 child 변수에 대입
		
		Parent parent = child;  // child 변수를 parent로 타입 변환
		
		// 메소드 호출
		parent.method1();  // 자식클래스가 부모클래스로 자동타입변환이 되었다면 자식클래스는 부모클래스가 가지고 있는 필드와 메소드만 접근 가능하다.
		parent.method2();  // 자식클래스와 부모클래스에서 가지고 있는 메소드 호출 시 자동타입변환이 되었더라도 재정의 된 메소드를 가지고 온다.
		// parent.method3();  // method3은 자식 클래스에 선언된 메스드이므로 자동타입변환 된 parent에선 접근이 불가능하다.
	}

}
