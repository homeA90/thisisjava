package ch07.sec10.exam02;

public abstract class Animal {
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	public abstract void sound(); // 추상메소드에선 정확한 내용을 만들 수 없으므로 중괄호가 없다.
}
