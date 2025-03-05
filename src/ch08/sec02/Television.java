package ch08.sec02;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}
	
	// 인터페이스는 public이 default 값이서 생량이 가능하지만, class에선 반드시 public을 붙여줘야한다.  
}
