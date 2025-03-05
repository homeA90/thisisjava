package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(new Student("홍길동", 30));
		studentsList.add(new Student("신용권", 10));
		studentsList.add(new Student("유미선", 20));
		
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentsList.stream()
			.sorted()
			.forEach(score -> System.out.println(score.getName() + ": " + score.getScore()));
		
		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		
		studentsList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(revers_score -> System.out.println(revers_score.getName() + ": " + revers_score.getScore()));
	}

}
