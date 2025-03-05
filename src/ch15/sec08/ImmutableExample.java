package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> immutableList1 = List.of("A", "B", "C");
//		immutableList1.add("D");  // List.of는 수정할 수 없는 컬렉션이므로 add 시 에러 발생함
		
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.remove("A"); // Set.of는 수정할 수 없는 컬렉션이므로 remove 시 에러 발생함
		
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
//		immutableMap1.put(4, "D");  // Map.of는 수정할 수 없는 컬렉션이므로 put 시 에러 발생함
			
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list); // copyOf로 복사하여 읽기 전용으로 만듬
//		immutableList2.add("D");  // 추가 불가
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set= new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);  // copyOf로 복사하여 읽기 전용으로 만듬
			
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);  // copyOf로 복사하여 읽기 전용으로 만듬
		
		
		//배열로부터 List 불변 컬렉션 생성
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);
		
	}

}
