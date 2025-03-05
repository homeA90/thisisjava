package ch08.sec04;

public interface RemoteControl {
	
	// 상수 선언
	int MAX_VOLUME = 10; // 인터페이스 상수는 반드시 값이 입력이 되어야 함
	int MIN_VOLUME = 0;  //  인터페이스에서는 publci static final이 생략되어 있음
	
	
	// 추상 메소드 작성, 추상메소드는 선언부만 작성한다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
