package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3,};
		arr2 = new int[] {1,2,3,};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}

}

// 참조타입은 변수의 값을 비교하는 것이 아닌, 객체의 위치를 비교하는 것!