package ch08.sec06;

public class Television implements RemoteControl {

	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("최대 볼륨은 " + RemoteControl.MAX_VOLUME + "입니다.");
			System.out.println("현재 TV 볼륨: " + this.volume);
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("최소 볼륨은 " + RemoteControl.MIN_VOLUME + "입니다.");
			System.out.println("현재 TV 볼륨: " + this.volume);
		} else {
			this.volume = volume;
			System.out.println("현재 TV 볼륨: " + this.volume);
		}

	}
	
	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}
}
