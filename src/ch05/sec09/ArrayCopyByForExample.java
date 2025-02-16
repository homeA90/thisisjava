package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열은 한번 생성하면 길이를 변경할 수 없음
		// 그러므로 길이를 변경하기 위해선 배열을 새로 만들고 이전배열로 부터 복사를 해야함

		// 길이 3인 배열
		int[] oldIntArrary = { 1, 2, 3 };

		// 길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];

		// 배열 항목 복사
		for (int i = 0; i < oldIntArrary.length; i++) {
			newIntArray[i] = oldIntArrary[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}

	}

}
