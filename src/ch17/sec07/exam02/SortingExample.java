package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

import ch17.sec07.exam01.Student;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));
		
		
		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(score -> System.out.println(score.getName() + ": " + score.getScore()));
		
		
		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore())) // sorted에서 매개값의 자리를 바꿔주면 내림차순이 된다
		.forEach(score -> System.out.println(score.getName() + ": " + score.getScore()));
	}

}
