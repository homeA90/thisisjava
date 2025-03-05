package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class ParalleslStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 병렬처리
//		Stream<String> stream = list.stream(); // single stream
		Stream<String> stream = list.parallelStream();  // multi stream
		stream.forEach(name -> {
			Thread thread = Thread.currentThread();
			System.out.println(name + ": " + thread.getName());
		});
		
	}

}
