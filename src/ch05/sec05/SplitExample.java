package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		//문자열이 구분자롤 사용하여 여러개의 문자열로 구성되어 있을 경우, 따로 분리해서 얻고 싶을 땐 split() 메소드를 사용한다.
		
		//문자열 분리
		String[] token = board.split(",");
		
		//인덱스 별로 읽기
		System.out.println("번호: "+ token[0]);
		System.out.println("제목: "+ token[1]);
		System.out.println("내용: "+ token[2]);
		System.out.println("성명: "+ token[3]);
		System.out.println();
		
		//for 문을 이용한 읽기
		for(int i=0; i<token.length; i++) {
			System.out.println(token[i]);
		}
	}

}
