package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		// 매개변수의 다형성
		
		animalSound(dog);
		animalSound(cat);
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	

}
