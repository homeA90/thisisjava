package ch08.sec06;

import ch08.sec06.Television;

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
		System.out.println();
		
		// 아래는 audio에서 재정의 한 setmute의 값이 실행 됨!
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		
		
		System.out.println();
		RemoteControl.changeBattery(); // 정적멤버는 클래스 이름으로 바로 실행한다.

	}

}
