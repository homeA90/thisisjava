package ch16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.ordering((a,b) -> {return a.compareToIgnoreCase(b);}); //이런 형태를 아래와 같이 축약이 가능하다.
		person.ordering(String :: compareToIgnoreCase); // 클래스 :: 인스턴스 메소드 형식으로 작성되면 (a,b) -> a.compareToIgnoreCase(b) 이런식으로 해석이된다.
		// compareToIgnoreCase 메소드는 String에 대해서 비교하여 순서를 정하는 메소드이다. b를 a와 비교한다 라고 해석하면 된다.
		// 그럼 클래스: 정적 메소드 형식은 클래스에서 받은 변수를 그대로 매개변수로 사용 이런 차이점이 있다.
	}

}
