package ch17.sec05;

import java.util.ArrayList;
import java.util.List;



public class FilteringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");
		
		
		// 중복요소 제거
		list.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		
		
		System.out.println("==================================");
		
		
		// 신으로 시작하는 요소만 필터링
		list.stream()
			.filter(c -> c.startsWith("신"))
			.forEach(c -> System.out.println(c));
		
		
		System.out.println("==================================");
		
		
		// 중복요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream()
			.distinct()
			.filter(c -> c.startsWith("신"))
			.forEach(c -> System.out.println(c));
	}
}
