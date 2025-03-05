package ch08.sec06;

import java.awt.DefaultFocusTraversalPolicy;
import java.security.PublicKey;

public class Audio implements RemoteControl {
		
	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
			System.out.println("현재 오디오 볼륨: " + this.volume);
		}	
	}	
	
	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}
	
	@Override
	public void setMute(boolean mute) { // 인터페이에 선언된 default 메소드는 구현클래스에서 재정의가 가능하다. 단, public 접근자는 반드시 붙여야 하며, default는 생략한다.
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			this.volume = this.memoryVolume;
		}
	}
	
	

}
