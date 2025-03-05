package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(114);
		rc.setVolume(-1);
		rc.setVolume(8);
		
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(99);
		rc.setVolume(-11);
		rc.setVolume(6);
		
		// RemoteControl.MAX_VOLUME = 20; // 변경이 되지 않는다!!
		// 인터페이스의 상수는 읽기만 가능하다.
		// 상수는 구현객체 안에서만 사용이 가능하다.
	}

}
