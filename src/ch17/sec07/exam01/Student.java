package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);  // Integer.compare의 메소드에서 비교하는 것 제공함
		// score와 o.score가 같을경우 0을 리턴, 작을 경우 -1, 클 경우 1을 리턴한다.
		// 그러므로 if문으로 comparable을 작성할 필요없다!
		// 여기서 매개값으로 들어오는 인자들은 기준이 되는건 우선 배열들의 첫번째 값이 된다. 그리고 두번째 값이 비교대상이 된다.
	}
	
}
