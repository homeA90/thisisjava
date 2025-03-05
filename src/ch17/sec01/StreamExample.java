package ch17.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("감자바");
		
		// 외부 반복자 이용
		for (String item : set) {
			System.out.println(item);
		}
		
		System.out.println("------------------------------");
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		System.out.println("------------------------------");
		
		// 내부 반복자 이용
		Stream<String> stream = set.stream();
		stream.forEach((item) -> {  // 매개변수는 아무거도 입력해도 상관없음
			System.out.println(item);
		});
		
		stream = set.stream();
		stream.forEach((item) -> System.out.println(item));  // 실행문 1개일 땐 중괄호 생략 가능함
		
	}

}
