package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl rc;
//		rc = null;  // 인터페이스틑 참조 타입이므로 null값이 가능하다.
		rc = new Television(); // 이 부분은 인터페이스에 있는 메소드를 작성한 class만 올 수 있다.즉, implements 를 구현한 객체만 작성가능
		
//		RemoteControl rc = new Television();  // 인터페이스로 텔레비전을 사용하도록 하겠다! 라고 해석하면 좋다!
		
		rc.turnOn();
		
		
		rc = new Audio();
		rc.turnOn();
	}

}
