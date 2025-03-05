package ch08.sec02;

public interface RemoteControl {
	
	// public 추상 메소드
	abstract void turnOn();  // 인터페이스에선 abstract을 쓸수도 있고 생량할 수도 있다. 그리고 인터페이스에서 public이 디폴트 상태이다 생량해도 디폴트는 public이다.
	
	// RemoteControl 이라는 인터페이스로 trunOn()이라는 메소드를 사용할 수 있다.
	// 실행부분은 다른 클래스에서 작성해야한다.
}
