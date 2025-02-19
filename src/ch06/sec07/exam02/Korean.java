package ch06.sec07.exam02;

public class Korean {
	String nation = "대한민국";
	String  name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

// 매개변수의 이름이 너무 짧으면 코드 가독성이 좋지 않기 때문에 매개변수명과 필드명을 동일하게 하는게 좋다.
// 매개변수와 필드명이 동일할 때 사용하는 키워드가 this 이고, this.(필드명) 은 객체의 데이터(필드)로서 의미한다.