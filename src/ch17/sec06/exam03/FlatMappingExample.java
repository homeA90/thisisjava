package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// 문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<String>();
		
		list1.add("this is java");
		list1.add("i am a best developer");
		
		list1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		
		list2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(","); // strArr에 데이터를 나눠 저장한다.
				int[] intArr = new int[strArr.length];  // strArr 개수를 저장하기 위해 int 타입으 intArr 배열을 생성한다. 배열개수는 strArr length로 생성
				for (int i=0; i<strArr.length; i++) {  // for 문을 이용하여 strArr의 값을 intArr에 int타입으로 파싱하여 대입한다.
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);  // Arrays.stream() 메소드는 주어진 int[] 배열을 intStream으로 만들어줌
			})
			.forEach(number -> System.out.println(number)); // forEach를 통해 출력한다.
	}

}
