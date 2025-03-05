package ch15.sec07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		Set<Integer> set = new HashSet<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
		
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
//		Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
//		List<Integer> list = Collections.synchronizedList(new ArrayList<>());	
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i =1; i<=1000;i++) {
					map.put(i, "내용: " + i);
				}
			
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i =1; i<=2000;i++) {
					map.put(i, "내용: " + i);
				}
			
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int size = map.size();
		System.out.println(size);
	}
}
