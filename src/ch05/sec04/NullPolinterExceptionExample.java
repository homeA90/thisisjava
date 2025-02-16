package ch05.sec04;

public class NullPolinterExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = null;
		// intArray[0] = 10;  // NullPointerException 발생_intArray변수에 배열객체가 생성되지 않았음
		
		
		
		String str = null;
		//System.out.println("총 문자 수: " + str.length()); 
		// NullPointerException 발생_문자열 str 변수에 객체가 생성되지 않았음
	}

}
