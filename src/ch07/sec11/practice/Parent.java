package ch07.sec11.practice;

public class Parent {
	public String nateion;
	
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		System.out.println("Parent(String nation) call");
	}
}
