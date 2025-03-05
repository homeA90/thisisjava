package ch07.sec09;



public class InstanceofExample {
	
	// main() 메소드에서 바로 호출하기위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name );
		person.walk();

		//person이 참조하는 객체가 Student 타입인지 확인
		if(person instanceof Student student) {  // 객체 타입 확인 person 객체가 Student 타입과 동일하면 true 틀리면 false
			System.out.println("StudentNo: " + student.studentNo);
			student.study();
	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}
