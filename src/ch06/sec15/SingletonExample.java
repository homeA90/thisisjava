package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Singleton obj1 = new Singleton(); // private 접근 권한을 갖는 Singleton에 접근하지 못하여 컴파일 에러발생됨
		Singleton obj2 = new Singleton();
		
		*/
		
		// 대신 정적 메소드 getter를 이용하여 불러올수 있음
		Singleton obj1 = Singleton.getInstance();  // singleton은 같은 객체에서 사용한다.
		Singleton obj2 = Singleton.getInstance();
		
		// 동일한 객체를 참조하는지 확인
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}
