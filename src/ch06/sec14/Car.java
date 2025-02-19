package ch06.sec14;


public class Car {
	
	// 필드 선언
	private int speed;
	private boolean stop;
	
	// speed의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed <0 ) {
			this.speed = 0;
		} else {
		this.speed = speed;

		}
	}
	
	
	// stop으 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {
			this.speed = 0;
		}
	}
	
	

}
