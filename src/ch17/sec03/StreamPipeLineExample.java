package ch17.sec03;

import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = List.of(  // Arrays.asList 도 동일함, 수정할 수 없는 List
			new Student("홍길동", 10),
			new Student("김길동", 20),
			new Student("서길동", 30)
		);
		
		// 점수로 변경하여 평균 구하기
		double avg = list.stream()
				.mapToInt(Student -> Student.getScore())  // 중간처리 부분! student 타입에서 int 타입은 점수를 맵핑하여 뽑아내는 부분임!
				.average()  // 여긴 최종처리를 위해 평균을 구하는 부분!
				.getAsDouble();
		
		System.out.println("평균점수: " + avg);
		
		System.out.println("============================================");
		
		// 이름만 받아서 처리
		System.out.println("[이름으로 받아서 처리]");
		list.stream()
			.map(Student -> Student.getName())  // 중간 처리 하는 부분! student 객체에서 name만 뽑아내기 위해 String 타입으로 맵핑하여 변경 Student 타입에서 getName을 가져오는 부분
			.forEach(name -> System.out.println(name)); // 여긴 최종처리 하는 부분! forEach를 이용하여 맵핑된 이름을 name에 하나씩 받는다.
		
	}
	// 결론은 중간처리하는 람다식과 최종처리하는 람다식은 살짝 다름!
	// 중간처리에서 (땡땡) -> {} 땡땡 부분은 맵핑 또는 타입 변경을 위해 어떤 타입에서 어떤 값을 불러올건지를 작성해야하므로 작성된 타입을 쓰는부분이다!
	// 최종처리에선 List에 있는 값들을 땡땡 부분에 하나씩 받아서 실행문에 작성된 내용으로 처리하는 것이다!!!!

}
