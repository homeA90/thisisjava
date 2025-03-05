package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
	
public class HashtableExample {
	public static void main(String[] args) {
		//Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
		//Map<String, Integer> map = new HashMap<>(); // HashMap 은 멀티 스레드 환경에서 동시에 실행되므로 추가/삭제가 중복되어 실행될수가 있다. 그렇기 때문에 최종 출력값이 조금씩 달라진다. 
		
		// hashtable은 List의 vector와 동일하게 멀티 스레드 환경에서 실행할 수없다. 안전하게 객체를 추가/삭제를 할 수 있다.
		// hashtable은 hashmap과 동일한 내부구조를 가지고 있다.
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//엔트리 1000개 추가
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		
		//작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//엔트리 1000개 추가
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
			
		//저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
		System.out.println();
	}
}