package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "여행";
		hobby = null;  // "여행"에 해당하는 객체는 쓰레기 객체가 되어 gaarbage collector가 실행되어 제거함
		
		String kind1 = "자동차"; 
		String kind2 = kind1;  // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // kink1 변수에 저장되어 있는 번지를 null로 변환함. 하지만 kind2가 "자동차"객체를 참조하고 있으므로 쓰레기는 아님
		
		System.out.println("kind2: " + kind2);
		
		
	}

}
