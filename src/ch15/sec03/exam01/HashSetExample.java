package ch15.sec03.exam01;

import java.nio.channels.Pipe.SourceChannel;
import java.util.HashSet;
import java.util.Set;


public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashSet 컬렉션 생성
		Set<String> set = new HashSet<>();
		
		//객체 저장
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("java");  // <- set 컬렉션은 중복 객체를 저장하지 않는다.
		set.add("Spring");
		
		
		// 저장된 객체 수 출력
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	}

}
