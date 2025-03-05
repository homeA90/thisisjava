package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;



public class VectorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> list = new Vector<>();
		// 해당 부분을 Vector로 입력 시 멀티 스레드 동시에 진행할 수가 없으므로 값이 2000개 나온다.
		// 하지만 ArrayList로 입력 시 멀티 스레드가 동시에 add 메소드가 실해되어 서로 경합이 발생해 2000개가 나오지 않게 된다.
		
		
		// 작업 스레드 객체 생성
		Thread threaA = new Thread() {
			@Override
			public void run() {
				for (int i =0; i <= 1000; i++){
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		
		// 작업 스레드 객체 생성
		Thread threaB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		
		// 작업 스레드 실행
		threaA.start();
		threaB.start();
		
		try {
			threaA.join();
			threaB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
	}
}
