package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		// 정적 메소드일 경우
		// 람다식
//		person.action((x,y) -> Computer.staticMethod(x, y)); // 원래는 이런식으로 작성을 해야하지만, 아래처럼 축약해서도 사용할 수 있다.
		// 정적 메소드 참조
		person.action(Computer::staticMethod);
		
		
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		//람다식
//		person.action((x,y) -> com.instanceMethod(x, y)); // 인스턴스 메소드일 때도 인스턴스 메소드를 가져오기 위해 객체 생성하고 람다식으로 작성한다. 인스턴스 메소드도 동일하게 축약이 가능하다.
		// 인스턴스 메소드 참조
		
		person.action(com::instanceMethod);
	}

}
