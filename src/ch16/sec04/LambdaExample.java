package ch16.sec04;



public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		person.action((x,y) -> {double result = x + y; return result;});
		
		person.action((x,y) -> x + y); // 결과가 값만 온다면 값이 return 문이므로 따로 return 을 작성할 필요 없다.
		
		person.action((x,y) -> sum(x,y)); // 아래에 있는 sum 메소드를 이용하여 나오는 return이 값을 의미하면 return 문을 생략해도 된다 
		
		
	}
	
	public static double sum(double x, double y) {
		return (x + y);
	}

}
