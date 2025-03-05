package ch08.sec03;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		// RemoteControl.MAX_VOLUME = 20; // 변경이 되지 않는다!!
		// 인터페이스의 상수는 읽기만 가능하다.
		// 상수는 구현객체 안에서만 사용이 가능하다.
	}

}
