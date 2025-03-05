package ch16.sec06;


public class ConstructorReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		
		// Member1 얻기
		Member m1 = person.getMember1(id -> // 이부분은 풀어서 람다식으로 작성
			{Member m = new Member(id); 
			return m;
		});
		
		Member m1_1 = person.getMember1(id ->  // return에 바로 넣어서 작성
			{return new Member(id); 
		});
		
		Member m1_2 = person.getMember1(Member :: new);  //  결국 생성자 오버로딩이되어 있더라도, getMember1이라고 지정되어 있으니 Member타입으로 new만 작성하여 축약이 가능함
		
		System.out.println(m1);
		System.out.println(m1_1);
		System.out.println(m1_2);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// 
		// Member2 얻기
		Member m2 = person.getMember2((id, name) -> {
			Member m = new Member(id, name);
			return m;		
		});
		
		Member m2_1 = person.getMember2((id, name) -> {
			return new Member(id, name);
		});
		
		Member m2_2 = person.getMember2((id, name) -> new Member(id, name));
		
		Member m2_3 = person.getMember2(Member :: new);
		
		System.out.println(m2);
		System.out.println(m2_1);
		System.out.println(m2_2);
		System.out.println(m2_3);
		
	}
	
	

}
