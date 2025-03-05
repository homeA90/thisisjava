package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		//  ------------ 여기까지만 실행해도 자식클래스에 super()이 자동으로 들어가 있기 때문에 부모 생성자도 출력이 된다.
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
	}

}
