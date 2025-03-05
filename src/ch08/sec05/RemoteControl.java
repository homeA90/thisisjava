package ch08.sec05;

public interface RemoteControl {
	// 디폴트 메소드 수업
	
	
	// 상수 선언
	int MAX_VOLUME = 10; // 인터페이스 상수는 반드시 값이 입력이 되어야 함
	int MIN_VOLUME = 0;  //  인터페이스에서는 publci static final이 생략되어 있음
	
	
	// 추상 메소드 작성, 추상메소드는 선언부만 작성한다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	int getVolume();
	
	// default 메소드는 모든 실행 객체가 동일하게 실행될 때는 인터페이스에서 default로 작성해 놓을 수있다!! 그렇기 때문에 default 메소드를 사용한다.
	default void setMute(boolean mute) {  // 존재는 인터페이스에서 존재하지만, 실행은 객체가 있어야 실행이 가능함
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
