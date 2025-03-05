package ch07.sec07.exam03;

import java.security.KeyStore.PrivateKeyEntry;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		// 자동 타입 변환 된 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2" //불가능
		 parent.method3();  // 불가능
		 */
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		child.field2 = "data2";  // 자동타입 변환된 child로 강제 타입 변환 시 child 클래스에 있는 필드와 메소드 사용 가능함
		child.method3();  
		// 자식객체가 부모 타입으로 자동 변환된 후 다시 그 자식타입으로 변환 할때만 강제타입변환을 할 수 있다.
		
		
		// 개인적은 생각으로 자동타입변환을 사용 이유는 
		// 1. 단일 객체로는 솔직히 말하면 각각 객체를 직접선언하고 사용하는 방법과 차이가 없는데!! 배열을 이용하여 사용할 때 자동타입변환이 효율적이다!
	}

}



/* 차이점
수동으로 객체를 추가하는 방식:

java
복사
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();  // Bird 추가

        dog.makeSound();  // "Bark"
        cat.makeSound();  // "Meow"
        bird.makeSound(); // "Tweet"
    }
}
Bird가 추가될 때마다, main 메소드에 직접 추가해야 하는 불편함이 있습니다. 
이렇게 코드를 작성하면, 자식 클래스가 많아질수록 코드가 길어지고 관리가 어려워집니다.

다형성을 활용한 방식:

java
복사
public class Test {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};  // 배열로 관리

        for (Animal animal : animals) {
            animal.makeSound();  // 각 자식 클래스의 메소드가 자동으로 호출
        }
    }
}
이렇게 Animal[] 배열을 사용하여 여러 자식 클래스 객체를 일관되게 처리할 수 있습니다.
이 방법에서는 새로운 자식 클래스를 추가하는 것이 매우 간단합니다. 코드 수정 없이 배열에 자식 클래스 객체를 추가하면, 반복문을 통해 자동으로 처리됩니다.
*/