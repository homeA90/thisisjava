package ch11.sec03.exam03;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NullPointerException | NumberFormatException e) {  // 두 개 이상의 예외를 하나의 catch블록에 처리하고 싶으면 |을 사용하여 작성한다
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("예상치 못한 예외가 발생했습니다.");
			}
		}	
	}
}	