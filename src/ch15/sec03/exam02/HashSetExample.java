package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Member> set = new HashSet<Member>();
		
		
		// 멤버 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		// 저장된 객체수 출력	
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	}

}
