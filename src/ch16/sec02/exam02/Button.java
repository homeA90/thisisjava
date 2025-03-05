package ch16.sec02.exam02;

public class Button {
	
	
	// 중첩 인터페이스 선언
	@FunctionalInterface
	public static interface ClickListener {  // 클래스 안에 중첩 인터페이스를 생성한 이유는 Button 클래스 이외에 사용할 필요가 없기 때문
		void onClick();  // 뭐 단지 딱 그이유만이라고 말할 순 없지만 대략 느낌적으로 굳이 클래스/인터페이스를 따로 빼서 만들정도의 내용이 아니라서 중첩/익명으로 만드는것!
	}
	
	
	// 필드 선언
	private ClickListener clickListener;
	
	// 메소드
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();  
	}
}
