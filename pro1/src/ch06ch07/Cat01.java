package ch06ch07;

public class Cat01 extends Animal01 { //extends Animal01(부모 클래스를 상속받는다)
	//이미 부모 클래스로부터 field와 method를 상속 받았다.
	
	//field
	int age = 1; //나이
	String variety = "먼치킨"; //품종
	
	//method
	void catchMouse() {
		System.out.println("Cat01-catchMouse()");
	}
	//재 정의: Anuma01에 있던 것을 재 정의 하였다
	void move() { //움직이다
		
		System.out.println("Cat01의 move(): 네개의 다리");
	}

}
