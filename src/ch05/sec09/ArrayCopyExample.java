package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열은 한번 생성하면 길이를 변경할 수 없음
		// 그러므로 길이를 변경하기 위해선 배열을 새로 만들고 이전배열로 부터 복사를 해야함
		// 그런데 배열 복사를 위한 좀 더 간단한 방법이 System의 arraycopy() 메소드를 이용하는 것이다.
		// System.arraycopy(원본배열, 원본배열 복사시작 인덱스, 새배열, 새배열 붙여넣기 시작 인덱스, 복사 항목수);

		// 길이 3인 배열
		int[] oldIntArrary = { 1, 2, 3 };

		// 길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];

		// 배열 항목 복사
		System.arraycopy(oldIntArrary, 0, newIntArray, 0, oldIntArrary.length);
		// 배열을 복사하는 것은 번지를 복사하는 것!!!!!!!

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
